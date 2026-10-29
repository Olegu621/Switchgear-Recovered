            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.JsonSyntaxException;
            import com.google.gson.ToNumberPolicy;
            import com.google.gson.ToNumberStrategy;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class NumberTypeAdapter extends TypeAdapter<Number> {
                private static final TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = newFactory(ToNumberPolicy.LAZILY_PARSED_NUMBER);
                private final ToNumberStrategy toNumberStrategy;

                /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C05532 {
                    static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

                    static {
/* 6 */                 int[] iArr = new int[JsonToken.values().length];
/* 8 */                 $SwitchMap$com$google$gson$stream$JsonToken = iArr;
                        try {
/* 17 */                    iArr[JsonToken.NULL.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                private NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
/* 4 */             this.toNumberStrategy = toNumberStrategy;
                }

                public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
                    return toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(toNumberStrategy);
                }

                private static TypeAdapterFactory newFactory(ToNumberStrategy toNumberStrategy) {
/* 8 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 7 */                     if (typeToken.getRawType() == Number.class) {
/* 9 */                         return NumberTypeAdapter.this;
                            }
/* 12 */                    return null;
                        }
                    };
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Number read(JsonReader jsonReader) throws IOException {
/* 1 */             JsonToken jsonTokenPeek = jsonReader.peek();
/* 11 */            int i = C05532.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
/* 14 */            if (i == 1) {
/* 62 */                jsonReader.nextNull();
/* 65 */                return null;
                    }
/* 17 */            if (i == 2 || i == 3) {
/* 57 */                return this.toNumberStrategy.readNumber(jsonReader);
                    }
/* 29 */            StringBuilder sb = new StringBuilder("Expecting number, got: ");
/* 32 */            sb.append(jsonTokenPeek);
/* 35 */            String path = jsonReader.getPath();
/* 41 */            sb.append("; at path ");
/* 44 */            sb.append(path);
/* 54 */            throw new JsonSyntaxException(sb.toString());
                }

                @Override // com.google.gson.TypeAdapter
/* 6 */         public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 7 */             jsonWriter.value(number);
                }
            }
