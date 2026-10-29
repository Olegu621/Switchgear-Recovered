            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.C$Gson$Types;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
                public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
                    @Override // com.google.gson.TypeAdapterFactory
                    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */                 Type type = typeToken.getType();
/* 7 */                 if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
/* 22 */                    return null;
                        }
/* 24 */                Type arrayComponentType = C$Gson$Types.getArrayComponentType(type);
/* 42 */                return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(arrayComponentType)), C$Gson$Types.getRawType(arrayComponentType));
                    }
                };
                private final Class<E> componentType;
                private final TypeAdapter<E> componentTypeAdapter;

                public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
/* 9 */             this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
/* 11 */            this.componentType = cls;
                }

                @Override // com.google.gson.TypeAdapter
                public Object read(JsonReader jsonReader) throws IOException {
/* 7 */             if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                 jsonReader.nextNull();
/* 12 */                return null;
                    }
/* 16 */            ArrayList arrayList = new ArrayList();
/* 19 */            jsonReader.beginArray();
/* 26 */            while (jsonReader.hasNext()) {
/* 34 */                arrayList.add(this.componentTypeAdapter.read(jsonReader));
                    }
/* 38 */            jsonReader.endArray();
/* 41 */            int size = arrayList.size();
/* 47 */            boolean zIsPrimitive = this.componentType.isPrimitive();
/* 51 */            Class<E> cls = this.componentType;
/* 53 */            if (!zIsPrimitive) {
/* 79 */                return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                    }
/* 55 */            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
/* 60 */            for (int i = 0; i < size; i++) {
/* 66 */                Array.set(objNewInstance, i, arrayList.get(i));
                    }
/* 72 */            return objNewInstance;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
/* 1 */             if (obj == null) {
/* 3 */                 jsonWriter.nullValue();
/* 6 */                 return;
                    }
/* 7 */             jsonWriter.beginArray();
/* 10 */            int length = Array.getLength(obj);
/* 15 */            for (int i = 0; i < length; i++) {
/* 23 */                this.componentTypeAdapter.write(jsonWriter, (E) Array.get(obj, i));
                    }
/* 29 */            jsonWriter.endArray();
                }
            }
