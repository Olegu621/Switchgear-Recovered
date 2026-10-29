            package com.google.gson.internal.bind;

            import com.google.gson.JsonArray;
            import com.google.gson.JsonElement;
            import com.google.gson.JsonNull;
            import com.google.gson.JsonObject;
            import com.google.gson.JsonPrimitive;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.IOException;
            import java.io.Reader;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 44 */    public final class JsonTreeReader extends JsonReader {
                private int[] pathIndices;
                private String[] pathNames;
                private Object[] stack;
                private int stackSize;
                private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
                    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 6 */                 throw new AssertionError();
                    }

                    @Override // java.io.Reader
                    public int read(char[] cArr, int i, int i2) {
/* 6 */                 throw new AssertionError();
                    }
                };
                private static final Object SENTINEL_CLOSED = new Object();

                /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C05502 {
                    static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

                    static {
/* 6 */                 int[] iArr = new int[JsonToken.values().length];
/* 8 */                 $SwitchMap$com$google$gson$stream$JsonToken = iArr;
                        try {
/* 17 */                    iArr[JsonToken.NAME.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                    }
                }

                public JsonTreeReader(JsonElement jsonElement) {
/* 3 */             super(UNREADABLE_READER);
/* 10 */            this.stack = new Object[32];
/* 13 */            this.stackSize = 0;
/* 17 */            this.pathNames = new String[32];
/* 21 */            this.pathIndices = new int[32];
/* 23 */            push(jsonElement);
                }

                private void expect(JsonToken jsonToken) throws IOException {
/* 5 */             if (peek() == jsonToken) {
/* 7 */                 return;
                    }
/* 12 */            StringBuilder sb = new StringBuilder("Expected ");
/* 15 */            sb.append(jsonToken);
/* 20 */            sb.append(" but was ");
/* 27 */            sb.append(peek());
/* 34 */            f42.m3659o(sb, locationString());
                }

                private String getPath(boolean z) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 int i2 = this.stackSize;
/* 11 */                if (i >= i2) {
/* 94 */                    return sb.toString();
                        }
/* 13 */                Object[] objArr = this.stack;
/* 15 */                Object obj = objArr[i];
/* 19 */                if (obj instanceof JsonArray) {
/* 21 */                    i++;
/* 23 */                    if (i < i2 && (objArr[i] instanceof Iterator)) {
/* 33 */                        int i3 = this.pathIndices[i];
/* 35 */                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
/* 47 */                            i3--;
                                }
/* 51 */                        sb.append('[');
/* 54 */                        sb.append(i3);
/* 59 */                        sb.append(']');
                            }
                        } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
/* 79 */                    sb.append('.');
/* 84 */                    String str = this.pathNames[i];
/* 86 */                    if (str != null) {
/* 88 */                        sb.append(str);
                            }
                        }
/* 91 */                i++;
                    }
                }

                private String locationString() {
/* 15 */            return " at path " + getPath();
                }

                private String nextName(boolean z) throws IOException {
/* 3 */             expect(JsonToken.NAME);
/* 16 */            Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
/* 22 */            String str = (String) entry.getKey();
/* 36 */            this.pathNames[this.stackSize - 1] = z ? "<skipped>" : str;
/* 42 */            push(entry.getValue());
/* 45 */            return str;
                }

                private Object peekStack() {
/* 7 */             return this.stack[this.stackSize - 1];
                }

                private Object popStack() {
/* 1 */             Object[] objArr = this.stack;
/* 5 */             int i = this.stackSize - 1;
/* 7 */             this.stackSize = i;
/* 9 */             Object obj = objArr[i];
/* 12 */            objArr[i] = null;
/* 14 */            return obj;
                }

                private void push(Object obj) {
/* 1 */             int i = this.stackSize;
/* 3 */             Object[] objArr = this.stack;
/* 6 */             if (i == objArr.length) {
/* 8 */                 int i2 = i * 2;
/* 14 */                this.stack = Arrays.copyOf(objArr, i2);
/* 22 */                this.pathIndices = Arrays.copyOf(this.pathIndices, i2);
/* 32 */                this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i2);
                    }
/* 34 */            Object[] objArr2 = this.stack;
/* 36 */            int i3 = this.stackSize;
/* 40 */            this.stackSize = i3 + 1;
/* 42 */            objArr2[i3] = obj;
                }

                @Override // com.google.gson.stream.JsonReader
                public void beginArray() throws IOException {
/* 3 */             expect(JsonToken.BEGIN_ARRAY);
/* 16 */            push(((JsonArray) peekStack()).iterator());
/* 26 */            this.pathIndices[this.stackSize - 1] = 0;
                }

                @Override // com.google.gson.stream.JsonReader
                public void beginObject() throws IOException {
/* 3 */             expect(JsonToken.BEGIN_OBJECT);
/* 20 */            push(((JsonObject) peekStack()).entrySet().iterator());
                }

                @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 7 */             this.stack = new Object[]{SENTINEL_CLOSED};
/* 10 */            this.stackSize = 1;
                }

                @Override // com.google.gson.stream.JsonReader
                public void endArray() throws IOException {
/* 3 */             expect(JsonToken.END_ARRAY);
/* 6 */             popStack();
/* 9 */             popStack();
/* 12 */            int i = this.stackSize;
/* 14 */            if (i > 0) {
/* 16 */                int[] iArr = this.pathIndices;
/* 18 */                int i2 = i - 1;
/* 24 */                iArr[i2] = iArr[i2] + 1;
                    }
                }

                @Override // com.google.gson.stream.JsonReader
                public void endObject() throws IOException {
/* 3 */             expect(JsonToken.END_OBJECT);
/* 13 */            this.pathNames[this.stackSize - 1] = null;
/* 15 */            popStack();
/* 18 */            popStack();
/* 21 */            int i = this.stackSize;
/* 23 */            if (i > 0) {
/* 25 */                int[] iArr = this.pathIndices;
/* 27 */                int i2 = i - 1;
/* 33 */                iArr[i2] = iArr[i2] + 1;
                    }
                }

                @Override // com.google.gson.stream.JsonReader
                public String getPreviousPath() {
/* 2 */             return getPath(true);
                }

                @Override // com.google.gson.stream.JsonReader
                public boolean hasNext() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
                    return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
                }

                @Override // com.google.gson.stream.JsonReader
                public boolean nextBoolean() throws IOException {
/* 3 */             expect(JsonToken.BOOLEAN);
/* 12 */            boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
/* 16 */            int i = this.stackSize;
/* 18 */            if (i > 0) {
/* 20 */                int[] iArr = this.pathIndices;
/* 22 */                int i2 = i - 1;
/* 28 */                iArr[i2] = iArr[i2] + 1;
                    }
/* 30 */            return asBoolean;
                }

                @Override // com.google.gson.stream.JsonReader
                public double nextDouble() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
/* 5 */             JsonToken jsonToken = JsonToken.NUMBER;
/* 7 */             if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                sb.append(jsonToken);
/* 26 */                sb.append(" but was ");
/* 29 */                sb.append(jsonTokenPeek);
/* 36 */                f42.m3659o(sb, locationString());
/* 39 */                return 0.0d;
                    }
/* 48 */            double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
/* 56 */            if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
/* 90 */                throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
                    }
/* 91 */            popStack();
/* 94 */            int i = this.stackSize;
/* 96 */            if (i > 0) {
/* 98 */                int[] iArr = this.pathIndices;
/* 100 */               int i2 = i - 1;
/* 106 */               iArr[i2] = iArr[i2] + 1;
                    }
/* 108 */           return asDouble;
                }

                @Override // com.google.gson.stream.JsonReader
                public int nextInt() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
/* 5 */             JsonToken jsonToken = JsonToken.NUMBER;
/* 7 */             if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                sb.append(jsonToken);
/* 26 */                sb.append(" but was ");
/* 29 */                sb.append(jsonTokenPeek);
/* 36 */                f42.m3659o(sb, locationString());
/* 39 */                return 0;
                    }
/* 47 */            int asInt = ((JsonPrimitive) peekStack()).getAsInt();
/* 51 */            popStack();
/* 54 */            int i = this.stackSize;
/* 56 */            if (i > 0) {
/* 58 */                int[] iArr = this.pathIndices;
/* 60 */                int i2 = i - 1;
/* 66 */                iArr[i2] = iArr[i2] + 1;
                    }
/* 68 */            return asInt;
                }

                public JsonElement nextJsonElement() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
/* 7 */             if (jsonTokenPeek == JsonToken.NAME || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_DOCUMENT) {
/* 35 */                s80.m8424e(jsonTokenPeek, "Unexpected ", " when reading a JsonElement.");
/* 38 */                return null;
                    }
/* 25 */            JsonElement jsonElement = (JsonElement) peekStack();
/* 27 */            skipValue();
/* 30 */            return jsonElement;
                }

                @Override // com.google.gson.stream.JsonReader
                public long nextLong() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
/* 5 */             JsonToken jsonToken = JsonToken.NUMBER;
/* 7 */             if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                sb.append(jsonToken);
/* 26 */                sb.append(" but was ");
/* 29 */                sb.append(jsonTokenPeek);
/* 36 */                f42.m3659o(sb, locationString());
/* 39 */                return 0L;
                    }
/* 48 */            long asLong = ((JsonPrimitive) peekStack()).getAsLong();
/* 52 */            popStack();
/* 55 */            int i = this.stackSize;
/* 57 */            if (i > 0) {
/* 59 */                int[] iArr = this.pathIndices;
/* 61 */                int i2 = i - 1;
/* 67 */                iArr[i2] = iArr[i2] + 1;
                    }
/* 69 */            return asLong;
                }

                @Override // com.google.gson.stream.JsonReader
                public void nextNull() throws IOException {
/* 3 */             expect(JsonToken.NULL);
/* 6 */             popStack();
/* 9 */             int i = this.stackSize;
/* 11 */            if (i > 0) {
/* 13 */                int[] iArr = this.pathIndices;
/* 15 */                int i2 = i - 1;
/* 21 */                iArr[i2] = iArr[i2] + 1;
                    }
                }

                @Override // com.google.gson.stream.JsonReader
                public String nextString() throws IOException {
/* 1 */             JsonToken jsonTokenPeek = peek();
/* 5 */             JsonToken jsonToken = JsonToken.STRING;
/* 7 */             if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
/* 18 */                StringBuilder sb = new StringBuilder("Expected ");
/* 21 */                sb.append(jsonToken);
/* 26 */                sb.append(" but was ");
/* 29 */                sb.append(jsonTokenPeek);
/* 36 */                f42.m3659o(sb, locationString());
/* 39 */                return null;
                    }
/* 47 */            String asString = ((JsonPrimitive) popStack()).getAsString();
/* 51 */            int i = this.stackSize;
/* 53 */            if (i > 0) {
/* 55 */                int[] iArr = this.pathIndices;
/* 57 */                int i2 = i - 1;
/* 63 */                iArr[i2] = iArr[i2] + 1;
                    }
/* 65 */            return asString;
                }

                @Override // com.google.gson.stream.JsonReader
                public JsonToken peek() throws IOException {
/* 3 */             if (this.stackSize == 0) {
/* 5 */                 return JsonToken.END_DOCUMENT;
                    }
/* 8 */             Object objPeekStack = peekStack();
/* 14 */            if (objPeekStack instanceof Iterator) {
/* 24 */                boolean z = this.stack[this.stackSize - 2] instanceof JsonObject;
/* 26 */                Iterator it = (Iterator) objPeekStack;
/* 32 */                if (!it.hasNext()) {
                            return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                        }
/* 34 */                if (z) {
/* 36 */                    return JsonToken.NAME;
                        }
/* 43 */                push(it.next());
/* 46 */                return peek();
                    }
/* 61 */            if (objPeekStack instanceof JsonObject) {
/* 63 */                return JsonToken.BEGIN_OBJECT;
                    }
/* 68 */            if (objPeekStack instanceof JsonArray) {
/* 70 */                return JsonToken.BEGIN_ARRAY;
                    }
/* 75 */            if (objPeekStack instanceof JsonPrimitive) {
/* 77 */                JsonPrimitive jsonPrimitive = (JsonPrimitive) objPeekStack;
/* 83 */                if (jsonPrimitive.isString()) {
/* 85 */                    return JsonToken.STRING;
                        }
/* 92 */                if (jsonPrimitive.isBoolean()) {
/* 94 */                    return JsonToken.BOOLEAN;
                        }
/* 101 */               if (jsonPrimitive.isNumber()) {
/* 103 */                   return JsonToken.NUMBER;
                        }
/* 111 */               throw new AssertionError();
                    }
/* 114 */           if (objPeekStack instanceof JsonNull) {
/* 116 */               return JsonToken.NULL;
                    }
/* 121 */           if (objPeekStack == SENTINEL_CLOSED) {
/* 125 */               f42.m3656l("JsonReader is closed");
/* 128 */               return null;
                    }
/* 162 */           throw new MalformedJsonException("Custom JsonElement subclass " + objPeekStack.getClass().getName() + " is not supported");
                }

                public void promoteNameToValue() throws IOException {
/* 3 */             expect(JsonToken.NAME);
/* 16 */            Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
/* 22 */            push(entry.getValue());
/* 36 */            push(new JsonPrimitive((String) entry.getKey()));
                }

                @Override // com.google.gson.stream.JsonReader
                public void skipValue() throws IOException {
/* 11 */            int i = C05502.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
/* 14 */            if (i == 1) {
/* 49 */                nextName(true);
/* 52 */                return;
                    }
/* 17 */            if (i == 2) {
/* 45 */                endArray();
/* 48 */                return;
                    }
/* 20 */            if (i == 3) {
/* 41 */                endObject();
/* 44 */                return;
                    }
/* 23 */            if (i != 4) {
/* 25 */                popStack();
/* 28 */                int i2 = this.stackSize;
/* 30 */                if (i2 > 0) {
/* 32 */                    int[] iArr = this.pathIndices;
/* 34 */                    int i3 = i2 - 1;
/* 38 */                    iArr[i3] = iArr[i3] + 1;
                        }
                    }
                }

                @Override // com.google.gson.stream.JsonReader
                public String toString() {
/* 15 */            return "JsonTreeReader" + locationString();
                }

                @Override // com.google.gson.stream.JsonReader
/* 45 */        public String nextName() throws IOException {
/* 46 */            return nextName(false);
                }

                @Override // com.google.gson.stream.JsonReader
/* 98 */        public String getPath() {
/* 99 */            return getPath(false);
                }
            }
