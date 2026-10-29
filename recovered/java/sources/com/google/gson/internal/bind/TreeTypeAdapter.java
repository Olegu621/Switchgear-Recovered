            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.JsonDeserializationContext;
            import com.google.gson.JsonDeserializer;
            import com.google.gson.JsonElement;
            import com.google.gson.JsonParseException;
            import com.google.gson.JsonSerializationContext;
            import com.google.gson.JsonSerializer;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.C$Gson$Preconditions;
            import com.google.gson.internal.Streams;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Type;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
                private final TreeTypeAdapter<T>.GsonContextImpl context;
                private volatile TypeAdapter<T> delegate;
                private final JsonDeserializer<T> deserializer;
                final Gson gson;
                private final boolean nullSafe;
                private final JsonSerializer<T> serializer;
                private final TypeAdapterFactory skipPast;
                private final TypeToken<T> typeToken;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class SingleTypeFactory implements TypeAdapterFactory {
                    private final JsonDeserializer<?> deserializer;
                    private final TypeToken<?> exactType;
                    private final Class<?> hierarchyType;
                    private final boolean matchRawType;
                    private final JsonSerializer<?> serializer;

                    public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
/* 13 */                JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
/* 14 */                this.serializer = jsonSerializer;
/* 21 */                JsonDeserializer<?> jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
/* 23 */                this.deserializer = jsonDeserializer;
/* 33 */                C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
/* 36 */                this.exactType = typeToken;
/* 38 */                this.matchRawType = z;
/* 40 */                this.hierarchyType = cls;
                    }

                    @Override // com.google.gson.TypeAdapterFactory
                    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                        boolean zIsAssignableFrom;
/* 1 */                 TypeToken<?> typeToken2 = this.exactType;
/* 3 */                 if (typeToken2 != null) {
/* 30 */                    zIsAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
                        } else {
/* 38 */                    zIsAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
                        }
/* 42 */                if (zIsAssignableFrom) {
/* 53 */                    return new TreeTypeAdapter(this.serializer, this.deserializer, gson, typeToken, this);
                        }
/* 57 */                return null;
                    }
                }

                public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory, boolean z) {
/* 10 */            this.context = new GsonContextImpl();
/* 12 */            this.serializer = jsonSerializer;
/* 14 */            this.deserializer = jsonDeserializer;
/* 16 */            this.gson = gson;
/* 18 */            this.typeToken = typeToken;
/* 20 */            this.skipPast = typeAdapterFactory;
/* 22 */            this.nullSafe = z;
                }

                private TypeAdapter<T> delegate() {
/* 1 */             TypeAdapter<T> typeAdapter = this.delegate;
/* 3 */             if (typeAdapter != null) {
/* 5 */                 return typeAdapter;
                    }
/* 12 */            TypeAdapter<T> delegateAdapter = this.gson.getDelegateAdapter(this.skipPast, this.typeToken);
/* 16 */            this.delegate = delegateAdapter;
/* 18 */            return delegateAdapter;
                }

                public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
/* 5 */             return new SingleTypeFactory(obj, typeToken, false, null);
                }

                public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
/* 17 */            return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
                }

                public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
/* 5 */             return new SingleTypeFactory(obj, null, false, cls);
                }

                @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
                public TypeAdapter<T> getSerializationDelegate() {
                    return this.serializer != null ? this : delegate();
                }

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
/* 3 */             if (this.deserializer == null) {
/* 9 */                 return delegate().read(jsonReader);
                    }
/* 14 */            JsonElement jsonElement = Streams.parse(jsonReader);
/* 20 */            if (this.nullSafe && jsonElement.isJsonNull()) {
/* 28 */                return null;
                    }
/* 40 */            return this.deserializer.deserialize(jsonElement, this.typeToken.getType(), this.context);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 1 */             JsonSerializer<T> jsonSerializer = this.serializer;
/* 3 */             if (jsonSerializer == null) {
/* 9 */                 delegate().write(jsonWriter, t);
                    } else if (this.nullSafe && t == null) {
/* 19 */                jsonWriter.nullValue();
                    } else {
/* 35 */                Streams.write(jsonSerializer.serialize(t, this.typeToken.getType(), this.context), jsonWriter);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 8 */         public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
                    private GsonContextImpl() {
                    }

                    @Override // com.google.gson.JsonDeserializationContext
                    public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
/* 5 */                 return (R) TreeTypeAdapter.this.gson.fromJson(jsonElement, type);
                    }

                    @Override // com.google.gson.JsonSerializationContext
                    public JsonElement serialize(Object obj) {
/* 5 */                 return TreeTypeAdapter.this.gson.toJsonTree(obj);
                    }

                    @Override // com.google.gson.JsonSerializationContext
/* 9 */             public JsonElement serialize(Object obj, Type type) {
/* 10 */                return TreeTypeAdapter.this.gson.toJsonTree(obj, type);
                    }
                }

/* 24 */        public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
/* 25 */            this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
                }
            }
