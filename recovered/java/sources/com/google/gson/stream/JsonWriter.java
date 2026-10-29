            package com.google.gson.stream;

            import java.io.Closeable;
            import java.io.Flushable;
            import java.io.IOException;
            import java.io.Writer;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.Arrays;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.regex.Pattern;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 45 */    public class JsonWriter implements Closeable, Flushable {
                private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
                private String deferredName;
                private boolean htmlSafe;
                private String indent;
                private boolean lenient;
                private final Writer out;
                private String separator;
                private boolean serializeNulls;
                private int[] stack = new int[32];
                private int stackSize = 0;
                private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
                private static final String[] REPLACEMENT_CHARS = new String[128];

                static {
/* 18 */            for (int i = 0; i <= 31; i++) {
/* 36 */                REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 41 */            String[] strArr = REPLACEMENT_CHARS;
/* 47 */            strArr[34] = "\\\"";
/* 53 */            strArr[92] = "\\\\";
/* 59 */            strArr[9] = "\\t";
/* 65 */            strArr[8] = "\\b";
/* 71 */            strArr[10] = "\\n";
/* 77 */            strArr[13] = "\\r";
/* 83 */            strArr[12] = "\\f";
/* 89 */            String[] strArr2 = (String[]) strArr.clone();
/* 91 */            HTML_SAFE_REPLACEMENT_CHARS = strArr2;
/* 97 */            strArr2[60] = "\\u003c";
/* 103 */           strArr2[62] = "\\u003e";
/* 109 */           strArr2[38] = "\\u0026";
/* 115 */           strArr2[61] = "\\u003d";
/* 121 */           strArr2[39] = "\\u0027";
                }

                public JsonWriter(Writer writer) {
/* 14 */            push(6);
/* 19 */            this.separator = ":";
/* 22 */            this.serializeNulls = true;
/* 26 */            Objects.requireNonNull(writer, "out == null");
/* 29 */            this.out = writer;
                }

                private void beforeName() throws IOException {
/* 1 */             int iPeek = peek();
/* 6 */             if (iPeek == 5) {
/* 12 */                this.out.write(44);
                    } else if (iPeek != 3) {
/* 29 */                f42.m3656l("Nesting problem.");
/* 32 */                return;
                    }
/* 19 */            newline();
/* 23 */            replaceTop(4);
                }

                private void beforeValue() throws IOException {
/* 1 */             int iPeek = peek();
/* 7 */             if (iPeek == 1) {
/* 64 */                replaceTop(2);
/* 67 */                newline();
/* 70 */                return;
                    }
/* 9 */             if (iPeek == 2) {
/* 57 */                this.out.append(',');
/* 60 */                newline();
/* 63 */                return;
                    }
/* 12 */            if (iPeek == 4) {
/* 45 */                this.out.append((CharSequence) this.separator);
/* 49 */                replaceTop(5);
/* 52 */                return;
                    }
/* 16 */            if (iPeek != 6) {
/* 18 */                if (iPeek != 7) {
/* 33 */                    f42.m3656l("Nesting problem.");
/* 36 */                    return;
                        } else if (!this.lenient) {
/* 27 */                    f42.m3656l("JSON must have only one top-level value.");
/* 30 */                    return;
                        }
                    }
/* 37 */            replaceTop(7);
                }

                private JsonWriter close(int i, int i2, char c) throws IOException {
/* 1 */             int iPeek = peek();
/* 5 */             if (iPeek != i2 && iPeek != i) {
/* 12 */                f42.m3656l("Nesting problem.");
/* 15 */                return null;
                    }
/* 19 */            if (this.deferredName != null) {
/* 42 */                ds0.m3206w(this.deferredName, "Dangling name: ");
/* 45 */                return null;
                    }
/* 25 */            this.stackSize--;
/* 27 */            if (iPeek == i2) {
/* 29 */                newline();
                    }
/* 34 */            this.out.write(c);
/* 37 */            return this;
                }

                private static boolean isTrustedNumberType(Class<? extends Number> cls) {
                    return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
                }

                private void newline() throws IOException {
/* 3 */             if (this.indent == null) {
/* 28 */                return;
                    }
/* 10 */            this.out.write(10);
/* 13 */            int i = this.stackSize;
/* 16 */            for (int i2 = 1; i2 < i; i2++) {
/* 22 */                this.out.write(this.indent);
                    }
                }

                private JsonWriter open(int i, char c) throws IOException {
/* 1 */             beforeValue();
/* 4 */             push(i);
/* 9 */             this.out.write(c);
/* 12 */            return this;
                }

                private int peek() {
/* 1 */             int i = this.stackSize;
/* 3 */             if (i != 0) {
/* 9 */                 return this.stack[i - 1];
                    }
/* 14 */            f42.m3656l("JsonWriter is closed.");
/* 17 */            return 0;
                }

                private void push(int i) {
/* 1 */             int i2 = this.stackSize;
/* 3 */             int[] iArr = this.stack;
/* 6 */             if (i2 == iArr.length) {
/* 14 */                this.stack = Arrays.copyOf(iArr, i2 * 2);
                    }
/* 16 */            int[] iArr2 = this.stack;
/* 18 */            int i3 = this.stackSize;
/* 22 */            this.stackSize = i3 + 1;
/* 24 */            iArr2[i3] = i;
                }

                private void replaceTop(int i) {
/* 7 */             this.stack[this.stackSize - 1] = i;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0034  */
                private void string(String str) throws IOException {
                    String str2;
/* 8 */             String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
/* 14 */            this.out.write(34);
/* 17 */            int length = str.length();
/* 22 */            int i = 0;
/* 23 */            for (int i2 = 0; i2 < length; i2++) {
/* 25 */                char cCharAt = str.charAt(i2);
/* 31 */                if (cCharAt < 128) {
/* 33 */                    str2 = strArr[cCharAt];
/* 35 */                    if (str2 != null) {
/* 51 */                        if (i < i2) {
/* 57 */                            this.out.write(str, i, i2 - i);
                                }
/* 62 */                        this.out.write(str2);
/* 65 */                        i = i2 + 1;
                            }
                        } else {
/* 40 */                    if (cCharAt == 8232) {
/* 42 */                        str2 = "\\u2028";
                            } else if (cCharAt == 8233) {
/* 49 */                        str2 = "\\u2029";
                            }
/* 51 */                    if (i < i2) {
/* 57 */                        this.out.write(str, i, i2 - i);
                            }
/* 62 */                    this.out.write(str2);
/* 65 */                    i = i2 + 1;
                        }
                    }
/* 70 */            if (i < length) {
/* 75 */                this.out.write(str, i, length - i);
                    }
/* 80 */            this.out.write(34);
                }

                private void writeDeferredName() throws IOException {
/* 3 */             if (this.deferredName != null) {
/* 5 */                 beforeName();
/* 10 */                string(this.deferredName);
/* 14 */                this.deferredName = null;
                    }
                }

                public JsonWriter beginArray() throws IOException {
/* 1 */             writeDeferredName();
/* 7 */             return open(1, '[');
                }

                public JsonWriter beginObject() throws IOException {
/* 1 */             writeDeferredName();
/* 7 */             return open(3, '{');
                }

                public JsonWriter endArray() throws IOException {
/* 5 */             return close(1, 2, ']');
                }

                public JsonWriter endObject() throws IOException {
/* 5 */             return close(3, 5, '}');
                }

                public void flush() throws IOException {
/* 3 */             if (this.stackSize != 0) {
/* 7 */                 this.out.flush();
                    } else {
/* 13 */                f42.m3656l("JsonWriter is closed.");
                    }
                }

                public final boolean getSerializeNulls() {
/* 1 */             return this.serializeNulls;
                }

                public final boolean isHtmlSafe() {
/* 1 */             return this.htmlSafe;
                }

                public boolean isLenient() {
/* 1 */             return this.lenient;
                }

                public JsonWriter jsonValue(String str) throws IOException {
/* 1 */             if (str == null) {
/* 3 */                 return nullValue();
                    }
/* 8 */             writeDeferredName();
/* 11 */            beforeValue();
/* 16 */            this.out.append((CharSequence) str);
/* 19 */            return this;
                }

                public JsonWriter name(String str) throws IOException {
/* 3 */             Objects.requireNonNull(str, "name == null");
/* 9 */             if (this.deferredName != null) {
/* 24 */                f42.m3664t();
/* 8 */                 return null;
                    }
/* 13 */            if (this.stackSize != 0) {
/* 15 */                this.deferredName = str;
/* 17 */                return this;
                    }
/* 20 */            f42.m3656l("JsonWriter is closed.");
/* 8 */             return null;
                }

                public JsonWriter nullValue() throws IOException {
/* 3 */             if (this.deferredName != null) {
/* 7 */                 if (!this.serializeNulls) {
/* 14 */                    this.deferredName = null;
/* 16 */                    return this;
                        }
/* 9 */                 writeDeferredName();
                    }
/* 17 */            beforeValue();
/* 24 */            this.out.write("null");
/* 27 */            return this;
                }

                public final void setHtmlSafe(boolean z) {
/* 1 */             this.htmlSafe = z;
                }

                public final void setIndent(String str) {
/* 5 */             if (str.length() == 0) {
/* 8 */                 this.indent = null;
/* 12 */                this.separator = ":";
                    } else {
/* 15 */                this.indent = str;
/* 19 */                this.separator = ": ";
                    }
                }

                public final void setLenient(boolean z) {
/* 1 */             this.lenient = z;
                }

                public final void setSerializeNulls(boolean z) {
/* 1 */             this.serializeNulls = z;
                }

                public JsonWriter value(Number number) throws IOException {
/* 1 */             if (number == null) {
/* 3 */                 return nullValue();
                    }
/* 8 */             writeDeferredName();
/* 11 */            String string = number.toString();
/* 22 */            if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
/* 41 */                Class<?> cls = number.getClass();
/* 49 */                if (!isTrustedNumberType(cls) && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
/* 68 */                    ds0.m3196m("String created by ", cls, " is not a valid JSON number: ", string);
/* 21 */                    return null;
                        }
                    } else if (!this.lenient) {
/* 91 */                C1951n4.m6859j("Numeric values must be finite, but was ".concat(string));
/* 21 */                return null;
                    }
/* 76 */            beforeValue();
/* 81 */            this.out.append((CharSequence) string);
/* 84 */            return this;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
/* 46 */        public void close() throws IOException {
/* 47 */            this.out.close();
/* 48 */            int i = this.stackSize;
/* 49 */            if (i <= 1 && (i != 1 || this.stack[i - 1] == 7)) {
/* 50 */                this.stackSize = 0;
                    } else {
/* 51 */                ds0.m3195l("Incomplete document");
                    }
                }

/* 94 */        public JsonWriter value(boolean z) throws IOException {
/* 95 */            writeDeferredName();
/* 96 */            beforeValue();
/* 97 */            this.out.write(z ? "true" : "false");
                    return this;
                }

/* 97 */        public JsonWriter value(Boolean bool) throws IOException {
                    if (bool == null) {
/* 98 */                return nullValue();
                    }
/* 99 */            writeDeferredName();
/* 100 */           beforeValue();
/* 101 */           this.out.write(bool.booleanValue() ? "true" : "false");
                    return this;
                }

/* 101 */       public JsonWriter value(float f) throws IOException {
/* 102 */           writeDeferredName();
/* 103 */           if (!this.lenient && (Float.isNaN(f) || Float.isInfinite(f))) {
/* 104 */               throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
                    }
/* 105 */           beforeValue();
/* 106 */           this.out.append((CharSequence) Float.toString(f));
                    return this;
                }

/* 106 */       public JsonWriter value(double d) throws IOException {
/* 107 */           writeDeferredName();
/* 108 */           if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 109 */               f42.m3657m("Numeric values must be finite, but was ", d);
                        return null;
                    }
/* 110 */           beforeValue();
/* 111 */           this.out.append((CharSequence) Double.toString(d));
                    return this;
                }

/* 111 */       public JsonWriter value(long j) throws IOException {
/* 112 */           writeDeferredName();
/* 113 */           beforeValue();
/* 114 */           this.out.write(Long.toString(j));
                    return this;
                }

/* 114 */       public JsonWriter value(String str) throws IOException {
                    if (str == null) {
/* 115 */               return nullValue();
                    }
/* 116 */           writeDeferredName();
/* 117 */           beforeValue();
/* 118 */           string(str);
                    return this;
                }
            }
