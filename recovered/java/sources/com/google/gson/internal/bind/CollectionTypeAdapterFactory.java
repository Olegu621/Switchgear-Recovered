            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.C$Gson$Types;
            import com.google.gson.internal.ConstructorConstructor;
            import com.google.gson.internal.ObjectConstructor;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Type;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
                private final ConstructorConstructor constructorConstructor;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
                    private final ObjectConstructor<? extends Collection<E>> constructor;
                    private final TypeAdapter<E> elementTypeAdapter;

                    public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
/* 9 */                 this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
/* 11 */                this.constructor = objectConstructor;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public Collection<E> read(JsonReader jsonReader) throws IOException {
/* 7 */                 if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }
/* 16 */                Collection<E> collectionConstruct = this.constructor.construct();
/* 22 */                jsonReader.beginArray();
/* 29 */                while (jsonReader.hasNext()) {
/* 37 */                    collectionConstruct.add(this.elementTypeAdapter.read(jsonReader));
                        }
/* 41 */                jsonReader.endArray();
/* 44 */                return collectionConstruct;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
/* 1 */                 if (collection == null) {
/* 3 */                     jsonWriter.nullValue();
/* 6 */                     return;
                        }
/* 7 */                 jsonWriter.beginArray();
/* 10 */                Iterator<E> it = collection.iterator();
/* 18 */                while (it.hasNext()) {
/* 26 */                    this.elementTypeAdapter.write(jsonWriter, it.next());
                        }
/* 30 */                jsonWriter.endArray();
                    }
                }

                public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
/* 4 */             this.constructorConstructor = constructorConstructor;
                }

                @Override // com.google.gson.TypeAdapterFactory
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */             Type type = typeToken.getType();
/* 5 */             Class<? super T> rawType = typeToken.getRawType();
/* 15 */            if (!Collection.class.isAssignableFrom(rawType)) {
/* 17 */                return null;
                    }
/* 19 */            Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
/* 39 */            return new Adapter(gson, collectionElementType, gson.getAdapter(TypeToken.get(collectionElementType)), this.constructorConstructor.get(typeToken));
                }
            }
