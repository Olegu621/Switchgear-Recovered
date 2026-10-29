            package com.google.gson;

            import com.google.gson.internal.Streams;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.IOException;
            import java.io.Reader;
            import java.io.StringReader;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public final class JsonParser {
                @Deprecated
                public JsonParser() {
                }

                public static JsonElement parseReader(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
/* 5 */             boolean zIsLenient = jsonReader.isLenient();
/* 10 */            jsonReader.setLenient(true);
                    try {
                        try {
/* 13 */                    JsonElement jsonElement = Streams.parse(jsonReader);
/* 17 */                    jsonReader.setLenient(zIsLenient);
/* 20 */                    return jsonElement;
                        } catch (OutOfMemoryError e) {
/* 44 */                    throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
                        } catch (StackOverflowError e2) {
/* 66 */                    throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
                        }
                    } catch (Throwable th) {
/* 67 */                jsonReader.setLenient(zIsLenient);
/* 70 */                throw th;
                    }
                }

                public static JsonElement parseString(String str) throws JsonSyntaxException {
/* 6 */             return parseReader(new StringReader(str));
                }

                @Deprecated
                public JsonElement parse(String str) throws JsonSyntaxException {
/* 1 */             return parseString(str);
                }

                @Deprecated
/* 5 */         public JsonElement parse(Reader reader) throws JsonSyntaxException, JsonIOException {
/* 6 */             return parseReader(reader);
                }

                @Deprecated
/* 6 */         public JsonElement parse(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
/* 7 */             return parseReader(jsonReader);
                }

/* 70 */        public static JsonElement parseReader(Reader reader) throws JsonSyntaxException, JsonIOException {
                    try {
/* 71 */                JsonReader jsonReader = new JsonReader(reader);
/* 72 */                JsonElement reader2 = parseReader(jsonReader);
/* 73 */                if (!reader2.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
/* 74 */                    throw new JsonSyntaxException("Did not consume the entire document.");
                        }
                        return reader2;
                    } catch (MalformedJsonException e) {
/* 77 */                throw new JsonSyntaxException(e);
                    } catch (IOException e2) {
/* 76 */                throw new JsonIOException(e2);
                    } catch (NumberFormatException e3) {
/* 75 */                throw new JsonSyntaxException(e3);
                    }
                }
            }
