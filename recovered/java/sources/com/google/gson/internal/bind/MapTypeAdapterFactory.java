            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.JsonElement;
            import com.google.gson.JsonPrimitive;
            import com.google.gson.JsonSyntaxException;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.C$Gson$Types;
            import com.google.gson.internal.ConstructorConstructor;
            import com.google.gson.internal.JsonReaderInternalAccess;
            import com.google.gson.internal.ObjectConstructor;
            import com.google.gson.internal.Streams;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class MapTypeAdapterFactory implements TypeAdapterFactory {
                final boolean complexMapKeySerialization;
                private final ConstructorConstructor constructorConstructor;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
                    private final ObjectConstructor<? extends Map<K, V>> constructor;
                    private final TypeAdapter<K> keyTypeAdapter;
                    private final TypeAdapter<V> valueTypeAdapter;

                    public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
/* 11 */                this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
/* 18 */                this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
/* 20 */                this.constructor = objectConstructor;
                    }

                    private String keyToString(JsonElement jsonElement) {
/* 5 */                 if (!jsonElement.isJsonPrimitive()) {
/* 62 */                    if (jsonElement.isJsonNull()) {
/* 64 */                        return "null";
                            }
/* 72 */                    throw new AssertionError();
                        }
/* 7 */                 JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
/* 15 */                if (asJsonPrimitive.isNumber()) {
/* 21 */                    return String.valueOf(asJsonPrimitive.getAsNumber());
                        }
/* 30 */                if (asJsonPrimitive.isBoolean()) {
/* 36 */                    return Boolean.toString(asJsonPrimitive.getAsBoolean());
                        }
/* 45 */                if (asJsonPrimitive.isString()) {
/* 47 */                    return asJsonPrimitive.getAsString();
                        }
/* 57 */                throw new AssertionError();
                    }

                    @Override // com.google.gson.TypeAdapter
                    public Map<K, V> read(JsonReader jsonReader) throws IOException {
/* 1 */                 JsonToken jsonTokenPeek = jsonReader.peek();
/* 7 */                 if (jsonTokenPeek == JsonToken.NULL) {
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }
/* 16 */                Map<K, V> mapConstruct = this.constructor.construct();
/* 26 */                if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
/* 84 */                    jsonReader.beginObject();
/* 91 */                    while (jsonReader.hasNext()) {
/* 95 */                        JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
/* 100 */                       K k = this.keyTypeAdapter.read(jsonReader);
/* 114 */                       if (mapConstruct.put(k, this.valueTypeAdapter.read(jsonReader)) != null) {
/* 134 */                           throw new JsonSyntaxException("duplicate key: " + k);
                                }
                            }
/* 135 */                   jsonReader.endObject();
/* 138 */                   return mapConstruct;
                        }
/* 28 */                jsonReader.beginArray();
/* 35 */                while (jsonReader.hasNext()) {
/* 37 */                    jsonReader.beginArray();
/* 42 */                    K k2 = this.keyTypeAdapter.read(jsonReader);
/* 56 */                    if (mapConstruct.put(k2, this.valueTypeAdapter.read(jsonReader)) != null) {
/* 79 */                        throw new JsonSyntaxException("duplicate key: " + k2);
                            }
/* 58 */                    jsonReader.endArray();
                        }
/* 80 */                jsonReader.endArray();
/* 83 */                return mapConstruct;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
/* 1 */                 if (map == null) {
/* 3 */                     jsonWriter.nullValue();
/* 6 */                     return;
                        }
/* 11 */                if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
/* 13 */                    jsonWriter.beginObject();
/* 28 */                    for (Map.Entry<K, V> entry : map.entrySet()) {
/* 44 */                        jsonWriter.name(String.valueOf(entry.getKey()));
/* 53 */                        this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                            }
/* 57 */                    jsonWriter.endObject();
/* 60 */                    return;
                        }
/* 67 */                ArrayList arrayList = new ArrayList(map.size());
/* 76 */                ArrayList arrayList2 = new ArrayList(map.size());
/* 87 */                int i = 0;
/* 88 */                boolean z = false;
/* 93 */                for (Map.Entry<K, V> entry2 : map.entrySet()) {
/* 107 */                   JsonElement jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
/* 111 */                   arrayList.add(jsonTree);
/* 118 */                   arrayList2.add(entry2.getValue());
/* 137 */                   z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
                        }
/* 139 */               if (!z) {
/* 181 */                   jsonWriter.beginObject();
/* 184 */                   int size = arrayList.size();
/* 188 */                   while (i < size) {
/* 200 */                       jsonWriter.name(keyToString((JsonElement) arrayList.get(i)));
/* 209 */                       this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i));
/* 212 */                       i++;
                            }
/* 215 */                   jsonWriter.endObject();
/* 218 */                   return;
                        }
/* 141 */               jsonWriter.beginArray();
/* 144 */               int size2 = arrayList.size();
/* 148 */               while (i < size2) {
/* 150 */                   jsonWriter.beginArray();
/* 159 */                   Streams.write((JsonElement) arrayList.get(i), jsonWriter);
/* 168 */                   this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i));
/* 171 */                   jsonWriter.endArray();
/* 174 */                   i++;
                        }
/* 177 */               jsonWriter.endArray();
                    }
                }

                public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
/* 4 */             this.constructorConstructor = constructorConstructor;
/* 6 */             this.complexMapKeySerialization = z;
                }

                private TypeAdapter<?> getKeyAdapter(Gson gson, Type type) {
                    return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type));
                }

                @Override // com.google.gson.TypeAdapterFactory
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */             Type type = typeToken.getType();
/* 5 */             Class<? super T> rawType = typeToken.getRawType();
/* 15 */            if (!Map.class.isAssignableFrom(rawType)) {
/* 17 */                return null;
                    }
/* 19 */            Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, rawType);
/* 55 */            return new Adapter(gson, mapKeyAndValueTypes[0], getKeyAdapter(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(TypeToken.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(typeToken));
                }
            }
