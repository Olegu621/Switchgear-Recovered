            package com.google.gson;

            import com.google.gson.internal.Streams;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.IOException;
            import java.io.Reader;
            import java.io.StringReader;
            import java.util.Iterator;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class JsonStreamParser implements Iterator<JsonElement> {
                private final Object lock;
                private final JsonReader parser;

                public JsonStreamParser(Reader reader) {
/* 6 */             JsonReader jsonReader = new JsonReader(reader);
/* 9 */             this.parser = jsonReader;
/* 12 */            jsonReader.setLenient(true);
/* 20 */            this.lock = new Object();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    boolean z;
                    synchronized (this.lock) {
                        try {
                            try {
                                try {
/* 16 */                            z = this.parser.peek() != JsonToken.END_DOCUMENT;
                                } catch (IOException e) {
/* 30 */                            throw new JsonIOException(e);
                                }
                            } catch (MalformedJsonException e2) {
/* 36 */                        throw new JsonSyntaxException(e2);
                            }
                        } catch (Throwable th) {
/* 38 */                    throw th;
                        }
                    }
/* 18 */            return z;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Iterator
                public JsonElement next() throws JsonParseException {
/* 7 */             if (!hasNext()) {
/* 32 */                C1951n4.m6864o();
/* 35 */                return null;
                    }
                    try {
/* 11 */                return Streams.parse(this.parser);
                    } catch (OutOfMemoryError e) {
/* 25 */                throw new JsonParseException("Failed parsing JSON source to Json", e);
                    } catch (StackOverflowError e2) {
/* 31 */                throw new JsonParseException("Failed parsing JSON source to Json", e2);
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }

/* 22 */        public JsonStreamParser(String str) {
/* 23 */            this(new StringReader(str));
                }
            }
