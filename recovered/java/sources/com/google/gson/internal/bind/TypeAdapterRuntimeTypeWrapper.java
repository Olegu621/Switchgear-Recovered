            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
                private final Gson context;
                private final TypeAdapter<T> delegate;
                private final Type type;

                public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
/* 4 */             this.context = gson;
/* 6 */             this.delegate = typeAdapter;
/* 8 */             this.type = type;
                }

                private static Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
/* 1 */             if (obj != null) {
                        return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
                    }
/* 15 */            return type;
                }

                private static boolean isReflective(TypeAdapter<?> typeAdapter) {
                    TypeAdapter<?> serializationDelegate;
/* 3 */             while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
/* 15 */                typeAdapter = serializationDelegate;
                    }
/* 17 */            return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
                }

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
/* 3 */             return this.delegate.read(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 1 */             TypeAdapter<T> adapter = this.delegate;
/* 5 */             Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
/* 11 */            if (runtimeTypeIfMoreSpecific != this.type) {
/* 19 */                adapter = this.context.getAdapter(TypeToken.get(runtimeTypeIfMoreSpecific));
/* 25 */                if ((adapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
/* 36 */                    adapter = this.delegate;
                        }
                    }
/* 38 */            adapter.write(jsonWriter, t);
                }
            }
