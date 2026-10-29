            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.ToNumberPolicy;
            import com.google.gson.ToNumberStrategy;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.LinkedTreeMap;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ObjectTypeAdapter extends TypeAdapter<Object> {
                private static final TypeAdapterFactory DOUBLE_FACTORY = newFactory(ToNumberPolicy.DOUBLE);
                private final Gson gson;
                private final ToNumberStrategy toNumberStrategy;

                /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C05552 {
                    static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

                    static {
/* 6 */                 int[] iArr = new int[JsonToken.values().length];
/* 8 */                 $SwitchMap$com$google$gson$stream$JsonToken = iArr;
                        try {
/* 17 */                    iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 61 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 72 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                    }
                }

                private ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
/* 4 */             this.gson = gson;
/* 6 */             this.toNumberStrategy = toNumberStrategy;
                }

                public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
                    return toNumberStrategy == ToNumberPolicy.DOUBLE ? DOUBLE_FACTORY : newFactory(toNumberStrategy);
                }

                private static TypeAdapterFactory newFactory(final ToNumberStrategy toNumberStrategy) {
/* 3 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 8 */                     if (typeToken.getRawType() == Object.class) {
/* 14 */                        return new ObjectTypeAdapter(gson, toNumberStrategy);
                            }
/* 7 */                     return null;
                        }
                    };
                }

                private Object readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
/* 7 */             int i = C05552.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
/* 10 */            if (i == 3) {
/* 48 */                return jsonReader.nextString();
                    }
/* 13 */            if (i == 4) {
/* 43 */                return this.toNumberStrategy.readNumber(jsonReader);
                    }
/* 16 */            if (i == 5) {
/* 36 */                return Boolean.valueOf(jsonReader.nextBoolean());
                    }
/* 20 */            if (i == 6) {
/* 22 */                jsonReader.nextNull();
/* 19 */                return null;
                    }
/* 28 */            ds0.m3204u(jsonToken, "Unexpected token: ");
/* 19 */            return null;
                }

                private Object tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
/* 7 */             int i = C05552.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
/* 10 */            if (i == 1) {
/* 26 */                jsonReader.beginArray();
/* 31 */                return new ArrayList();
                    }
/* 13 */            if (i != 2) {
/* 15 */                return null;
                    }
/* 17 */            jsonReader.beginObject();
/* 22 */            return new LinkedTreeMap();
                }

                @Override // com.google.gson.TypeAdapter
                public Object read(JsonReader jsonReader) throws IOException {
/* 1 */             JsonToken jsonTokenPeek = jsonReader.peek();
/* 5 */             Object objTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
/* 9 */             if (objTryBeginNesting == null) {
/* 11 */                return readTerminal(jsonReader, jsonTokenPeek);
                    }
/* 18 */            ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
/* 25 */                if (jsonReader.hasNext()) {
/* 36 */                    String strNextName = objTryBeginNesting instanceof Map ? jsonReader.nextName() : null;
/* 37 */                    JsonToken jsonTokenPeek2 = jsonReader.peek();
/* 41 */                    Object objTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
/* 49 */                    boolean z = objTryBeginNesting2 != null;
/* 50 */                    if (objTryBeginNesting2 == null) {
/* 52 */                        objTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                            }
/* 58 */                    if (objTryBeginNesting instanceof List) {
/* 63 */                        ((List) objTryBeginNesting).add(objTryBeginNesting2);
                            } else {
/* 70 */                        ((Map) objTryBeginNesting).put(strNextName, objTryBeginNesting2);
                            }
/* 73 */                    if (z) {
/* 75 */                        arrayDeque.addLast(objTryBeginNesting);
/* 78 */                        objTryBeginNesting = objTryBeginNesting2;
                            }
                        } else {
/* 82 */                    if (objTryBeginNesting instanceof List) {
/* 84 */                        jsonReader.endArray();
                            } else {
/* 88 */                        jsonReader.endObject();
                            }
/* 95 */                    if (arrayDeque.isEmpty()) {
/* 97 */                        return objTryBeginNesting;
                            }
/* 98 */                    objTryBeginNesting = arrayDeque.removeLast();
                        }
                    }
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
/* 1 */             if (obj == null) {
/* 3 */                 jsonWriter.nullValue();
/* 6 */                 return;
                    }
/* 13 */            TypeAdapter adapter = this.gson.getAdapter(obj.getClass());
/* 19 */            if (!(adapter instanceof ObjectTypeAdapter)) {
/* 28 */                adapter.write(jsonWriter, obj);
                    } else {
/* 21 */                jsonWriter.beginObject();
/* 24 */                jsonWriter.endObject();
                    }
                }
            }
