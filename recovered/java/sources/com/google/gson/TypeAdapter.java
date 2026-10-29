            package com.google.gson;

            import com.google.gson.internal.bind.JsonTreeReader;
            import com.google.gson.internal.bind.JsonTreeWriter;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.io.Reader;
            import java.io.StringReader;
            import java.io.StringWriter;
            import java.io.Writer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public abstract class TypeAdapter<T> {
                public final T fromJson(Reader reader) throws IOException {
/* 6 */             return read(new JsonReader(reader));
                }

                public final T fromJsonTree(JsonElement jsonElement) {
                    try {
/* 6 */                 return read(new JsonTreeReader(jsonElement));
                    } catch (IOException e) {
/* 17 */                throw new JsonIOException(e);
                    }
                }

                public final TypeAdapter<T> nullSafe() {
/* 3 */             return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
                        @Override // com.google.gson.TypeAdapter
                        public T read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 16 */                        return (T) TypeAdapter.this.read(jsonReader);
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 1 */                     if (t == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 9 */                         TypeAdapter.this.write(jsonWriter, t);
                            }
                        }
                    };
                }

                public abstract T read(JsonReader jsonReader) throws IOException;

                public final String toJson(T t) {
/* 3 */             StringWriter stringWriter = new StringWriter();
                    try {
/* 6 */                 toJson(stringWriter, t);
/* 9 */                 return stringWriter.toString();
                    } catch (IOException e) {
/* 20 */                throw new JsonIOException(e);
                    }
                }

                public final JsonElement toJsonTree(T t) {
                    try {
/* 3 */                 JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
/* 6 */                 write(jsonTreeWriter, t);
/* 9 */                 return jsonTreeWriter.get();
                    } catch (IOException e) {
/* 20 */                throw new JsonIOException(e);
                    }
                }

                public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

/* 10 */        public final T fromJson(String str) throws IOException {
/* 11 */            return fromJson(new StringReader(str));
                }

/* 20 */        public final void toJson(Writer writer, T t) throws IOException {
/* 22 */            write(new JsonWriter(writer), t);
                }
            }
