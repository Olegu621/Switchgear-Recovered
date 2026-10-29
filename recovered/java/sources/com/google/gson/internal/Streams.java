            package com.google.gson.internal;

            import com.google.gson.JsonElement;
            import com.google.gson.JsonIOException;
            import com.google.gson.JsonNull;
            import com.google.gson.JsonParseException;
            import com.google.gson.JsonSyntaxException;
            import com.google.gson.internal.bind.TypeAdapters;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonWriter;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Writer;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class Streams {
                private Streams() {
/* 9 */             throw new UnsupportedOperationException();
                }

                public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
                    boolean z;
                    try {
                        try {
/* 1 */                     jsonReader.peek();
/* 4 */                     z = false;
                            try {
/* 7 */                         return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                            } catch (EOFException e) {
/* 14 */                        e = e;
/* 39 */                        if (z) {
/* 41 */                            return JsonNull.INSTANCE;
                                }
/* 49 */                        throw new JsonSyntaxException(e);
                            }
                        } catch (EOFException e2) {
/* 37 */                    e = e2;
/* 38 */                    z = true;
                        }
                    } catch (MalformedJsonException e3) {
/* 36 */                throw new JsonSyntaxException(e3);
                    } catch (IOException e4) {
/* 29 */                throw new JsonIOException(e4);
                    } catch (NumberFormatException e5) {
/* 22 */                throw new JsonSyntaxException(e5);
                    }
                }

                public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
/* 3 */             TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
                }

                public static Writer writerForAppendable(Appendable appendable) {
                    return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 7 */         public static final class AppendableWriter extends Writer {
                    private final Appendable appendable;
                    private final CurrentWrite currentWrite = new CurrentWrite();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class CurrentWrite implements CharSequence {
                        private String cachedString;
                        private char[] chars;

                        private CurrentWrite() {
                        }

                        @Override // java.lang.CharSequence
                        public char charAt(int i) {
/* 3 */                     return this.chars[i];
                        }

                        @Override // java.lang.CharSequence
                        public int length() {
/* 3 */                     return this.chars.length;
                        }

                        public void setChars(char[] cArr) {
/* 1 */                     this.chars = cArr;
/* 4 */                     this.cachedString = null;
                        }

                        @Override // java.lang.CharSequence
                        public CharSequence subSequence(int i, int i2) {
/* 6 */                     return new String(this.chars, i, i2 - i);
                        }

                        @Override // java.lang.CharSequence
                        public String toString() {
/* 3 */                     if (this.cachedString == null) {
/* 12 */                        this.cachedString = new String(this.chars);
                            }
/* 14 */                    return this.cachedString;
                        }
                    }

                    public AppendableWriter(Appendable appendable) {
/* 12 */                this.appendable = appendable;
                    }

                    @Override // java.io.Writer, java.lang.Appendable
                    public Writer append(CharSequence charSequence) throws IOException {
/* 3 */                 this.appendable.append(charSequence);
/* 6 */                 return this;
                    }

                    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                    }

                    @Override // java.io.Writer, java.io.Flushable
                    public void flush() {
                    }

                    @Override // java.io.Writer
                    public void write(char[] cArr, int i, int i2) throws IOException {
/* 3 */                 this.currentWrite.setChars(cArr);
/* 11 */                this.appendable.append(this.currentWrite, i, i2 + i);
                    }

                    @Override // java.io.Writer, java.lang.Appendable
/* 8 */             public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
/* 9 */                 this.appendable.append(charSequence, i, i2);
                        return this;
                    }

                    @Override // java.io.Writer
/* 14 */            public void write(int i) throws IOException {
/* 15 */                this.appendable.append((char) i);
                    }

                    @Override // java.io.Writer
/* 15 */            public void write(String str, int i, int i2) throws IOException {
/* 16 */                Objects.requireNonNull(str);
/* 17 */                this.appendable.append(str, i, i2 + i);
                    }
                }
            }
