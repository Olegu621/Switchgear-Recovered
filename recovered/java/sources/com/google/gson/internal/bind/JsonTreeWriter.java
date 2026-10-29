            package com.google.gson.internal.bind;

            import com.google.gson.JsonArray;
            import com.google.gson.JsonElement;
            import com.google.gson.JsonNull;
            import com.google.gson.JsonObject;
            import com.google.gson.JsonPrimitive;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.io.Writer;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Objects;
            import p000.ds0;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 51 */    public final class JsonTreeWriter extends JsonWriter {
                private String pendingName;
                private JsonElement product;
                private final List<JsonElement> stack;
                private static final Writer UNWRITABLE_WRITER = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
                    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 6 */                 throw new AssertionError();
                    }

                    @Override // java.io.Writer, java.io.Flushable
                    public void flush() {
/* 6 */                 throw new AssertionError();
                    }

                    @Override // java.io.Writer
                    public void write(char[] cArr, int i, int i2) {
/* 6 */                 throw new AssertionError();
                    }
                };
                private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");

                public JsonTreeWriter() {
/* 3 */             super(UNWRITABLE_WRITER);
/* 11 */            this.stack = new ArrayList();
/* 15 */            this.product = JsonNull.INSTANCE;
                }

                private JsonElement peek() {
/* 1 */             List<JsonElement> list = this.stack;
/* 9 */             return list.get(list.size() - 1);
                }

                private void put(JsonElement jsonElement) {
/* 3 */             if (this.pendingName != null) {
/* 9 */                 if (!jsonElement.isJsonNull() || getSerializeNulls()) {
/* 25 */                    ((JsonObject) peek()).add(this.pendingName, jsonElement);
                        }
/* 29 */                this.pendingName = null;
/* 31 */                return;
                    }
/* 38 */            if (this.stack.isEmpty()) {
/* 40 */                this.product = jsonElement;
/* 42 */                return;
                    }
/* 43 */            JsonElement jsonElementPeek = peek();
/* 49 */            if (jsonElementPeek instanceof JsonArray) {
/* 53 */                ((JsonArray) jsonElementPeek).add(jsonElement);
                    } else {
/* 57 */                f42.m3664t();
                    }
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter beginArray() throws IOException {
/* 3 */             JsonArray jsonArray = new JsonArray();
/* 6 */             put(jsonArray);
/* 11 */            this.stack.add(jsonArray);
/* 14 */            return this;
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter beginObject() throws IOException {
/* 3 */             JsonObject jsonObject = new JsonObject();
/* 6 */             put(jsonObject);
/* 11 */            this.stack.add(jsonObject);
/* 14 */            return this;
                }

                @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 7 */             if (this.stack.isEmpty()) {
/* 13 */                this.stack.add(SENTINEL_CLOSED);
                    } else {
/* 19 */                ds0.m3195l("Incomplete document");
                    }
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter endArray() throws IOException {
/* 7 */             if (this.stack.isEmpty() || this.pendingName != null) {
/* 38 */                f42.m3664t();
/* 41 */                return null;
                    }
/* 19 */            if (!(peek() instanceof JsonArray)) {
/* 33 */                f42.m3664t();
/* 36 */                return null;
                    }
/* 21 */            List<JsonElement> list = this.stack;
/* 29 */            list.remove(list.size() - 1);
/* 32 */            return this;
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter endObject() throws IOException {
/* 7 */             if (this.stack.isEmpty() || this.pendingName != null) {
/* 38 */                f42.m3664t();
/* 41 */                return null;
                    }
/* 19 */            if (!(peek() instanceof JsonObject)) {
/* 33 */                f42.m3664t();
/* 36 */                return null;
                    }
/* 21 */            List<JsonElement> list = this.stack;
/* 29 */            list.remove(list.size() - 1);
/* 32 */            return this;
                }

                @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
                public void flush() throws IOException {
                }

                public JsonElement get() {
/* 7 */             if (this.stack.isEmpty()) {
/* 9 */                 return this.product;
                    }
/* 16 */            ds0.m3206w(this.stack, "Expected one JSON element but was ");
/* 19 */            return null;
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter jsonValue(String str) throws IOException {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter name(String str) throws IOException {
/* 3 */             Objects.requireNonNull(str, "name == null");
/* 13 */            if (this.stack.isEmpty() || this.pendingName != null) {
/* 34 */                f42.m3664t();
/* 12 */                return null;
                    }
/* 25 */            if (peek() instanceof JsonObject) {
/* 27 */                this.pendingName = str;
/* 29 */                return this;
                    }
/* 30 */            f42.m3664t();
/* 12 */            return null;
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter nullValue() throws IOException {
/* 3 */             put(JsonNull.INSTANCE);
/* 6 */             return this;
                }

                @Override // com.google.gson.stream.JsonWriter
                public JsonWriter value(float f) throws IOException {
/* 5 */             if (isLenient() || !(Float.isNaN(f) || Float.isInfinite(f))) {
/* 49 */                put(new JsonPrimitive(Float.valueOf(f)));
/* 52 */                return this;
                    }
/* 39 */            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
                }

                @Override // com.google.gson.stream.JsonWriter
/* 52 */        public JsonWriter value(boolean z) throws IOException {
/* 53 */            put(new JsonPrimitive(Boolean.valueOf(z)));
                    return this;
                }

                @Override // com.google.gson.stream.JsonWriter
/* 53 */        public JsonWriter value(Boolean bool) throws IOException {
                    if (bool == null) {
/* 54 */                return nullValue();
                    }
/* 55 */            put(new JsonPrimitive(bool));
                    return this;
                }

                @Override // com.google.gson.stream.JsonWriter
/* 55 */        public JsonWriter value(String str) throws IOException {
                    if (str == null) {
/* 56 */                return nullValue();
                    }
/* 57 */            put(new JsonPrimitive(str));
                    return this;
                }

                @Override // com.google.gson.stream.JsonWriter
/* 57 */        public JsonWriter value(double d) throws IOException {
/* 58 */            if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 59 */                f42.m3657m("JSON forbids NaN and infinities: ", d);
                        return null;
                    }
/* 60 */            put(new JsonPrimitive(Double.valueOf(d)));
                    return this;
                }

                @Override // com.google.gson.stream.JsonWriter
/* 60 */        public JsonWriter value(long j) throws IOException {
/* 61 */            put(new JsonPrimitive(Long.valueOf(j)));
                    return this;
                }

                @Override // com.google.gson.stream.JsonWriter
/* 61 */        public JsonWriter value(Number number) throws IOException {
                    if (number == null) {
/* 62 */                return nullValue();
                    }
/* 63 */            if (!isLenient()) {
/* 64 */                double dDoubleValue = number.doubleValue();
/* 65 */                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
/* 66 */                    s80.m8430k(number, "JSON forbids NaN and infinities: ");
                            return null;
                        }
                    }
/* 67 */            put(new JsonPrimitive(number));
                    return this;
                }
            }
