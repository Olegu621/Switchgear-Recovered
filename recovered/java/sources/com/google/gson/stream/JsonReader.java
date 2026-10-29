            package com.google.gson.stream;

            import com.google.gson.internal.JsonReaderInternalAccess;
            import com.google.gson.internal.bind.JsonTreeReader;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Reader;
            import java.util.Arrays;
            import java.util.Objects;
            import p000.AbstractC0886en;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    public class JsonReader implements Closeable {
                static final int BUFFER_SIZE = 1024;
                private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
                private static final int NUMBER_CHAR_DECIMAL = 3;
                private static final int NUMBER_CHAR_DIGIT = 2;
                private static final int NUMBER_CHAR_EXP_DIGIT = 7;
                private static final int NUMBER_CHAR_EXP_E = 5;
                private static final int NUMBER_CHAR_EXP_SIGN = 6;
                private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
                private static final int NUMBER_CHAR_NONE = 0;
                private static final int NUMBER_CHAR_SIGN = 1;
                private static final int PEEKED_BEGIN_ARRAY = 3;
                private static final int PEEKED_BEGIN_OBJECT = 1;
                private static final int PEEKED_BUFFERED = 11;
                private static final int PEEKED_DOUBLE_QUOTED = 9;
                private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
                private static final int PEEKED_END_ARRAY = 4;
                private static final int PEEKED_END_OBJECT = 2;
                private static final int PEEKED_EOF = 17;
                private static final int PEEKED_FALSE = 6;
                private static final int PEEKED_LONG = 15;
                private static final int PEEKED_NONE = 0;
                private static final int PEEKED_NULL = 7;
                private static final int PEEKED_NUMBER = 16;
                private static final int PEEKED_SINGLE_QUOTED = 8;
                private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
                private static final int PEEKED_TRUE = 5;
                private static final int PEEKED_UNQUOTED = 10;
                private static final int PEEKED_UNQUOTED_NAME = 14;

                /* JADX INFO: renamed from: in */
                private final Reader f5311in;
                private int[] pathIndices;
                private String[] pathNames;
                private long peekedLong;
                private int peekedNumberLength;
                private String peekedString;
                private int[] stack;
                private boolean lenient = false;
                private final char[] buffer = new char[1024];
                private int pos = 0;
                private int limit = 0;
                private int lineNumber = 0;
                private int lineStart = 0;
                int peeked = 0;
                private int stackSize = 1;

                static {
/* 6 */             JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
                        @Override // com.google.gson.internal.JsonReaderInternalAccess
                        public void promoteNameToValue(JsonReader jsonReader) throws IOException {
/* 3 */                     if (jsonReader instanceof JsonTreeReader) {
/* 7 */                         ((JsonTreeReader) jsonReader).promoteNameToValue();
/* 10 */                        return;
                            }
/* 11 */                    int iDoPeek = jsonReader.peeked;
/* 13 */                    if (iDoPeek == 0) {
/* 15 */                        iDoPeek = jsonReader.doPeek();
                            }
/* 21 */                    if (iDoPeek == 13) {
/* 25 */                        jsonReader.peeked = 9;
/* 27 */                        return;
                            }
/* 30 */                    if (iDoPeek == JsonReader.PEEKED_SINGLE_QUOTED_NAME) {
/* 34 */                        jsonReader.peeked = 8;
                            } else {
/* 39 */                        if (iDoPeek == JsonReader.PEEKED_UNQUOTED_NAME) {
/* 43 */                            jsonReader.peeked = 10;
/* 45 */                            return;
                                }
/* 50 */                        StringBuilder sb = new StringBuilder("Expected a name but was ");
/* 57 */                        sb.append(jsonReader.peek());
/* 64 */                        f42.m3659o(sb, jsonReader.locationString());
                            }
                        }
                    };
                }

                public JsonReader(Reader reader) {
/* 25 */            int[] iArr = new int[32];
/* 27 */            this.stack = iArr;
/* 33 */            iArr[0] = 6;
/* 37 */            this.pathNames = new String[32];
/* 41 */            this.pathIndices = new int[32];
/* 45 */            Objects.requireNonNull(reader, "in == null");
/* 48 */            this.f5311in = reader;
                }

                private void checkLenient() throws IOException {
/* 3 */             if (!this.lenient) {
/* 12 */                throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }

                private void consumeNonExecutePrefix() throws IOException {
/* 2 */             nextNonWhitespace(true);
/* 5 */             int i = this.pos;
/* 9 */             this.pos = i - 1;
/* 16 */            if (i + 4 <= this.limit || fillBuffer(5)) {
/* 25 */                int i2 = this.pos;
/* 27 */                char[] cArr = this.buffer;
/* 33 */                if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
/* 69 */                    this.pos = i2 + 5;
                        }
                    }
                }

                private boolean fillBuffer(int i) throws IOException {
                    int i2;
                    int i3;
/* 1 */             char[] cArr = this.buffer;
/* 3 */             int i4 = this.lineStart;
/* 5 */             int i5 = this.pos;
/* 8 */             this.lineStart = i4 - i5;
/* 10 */            int i6 = this.limit;
/* 13 */            if (i6 != i5) {
/* 15 */                int i7 = i6 - i5;
/* 16 */                this.limit = i7;
/* 18 */                System.arraycopy(cArr, i5, cArr, 0, i7);
                    } else {
/* 22 */                this.limit = 0;
                    }
/* 24 */            this.pos = 0;
/* 73 */            do {
/* 26 */                Reader reader = this.f5311in;
/* 28 */                int i8 = this.limit;
/* 32 */                int i9 = reader.read(cArr, i8, cArr.length - i8);
/* 37 */                if (i9 == -1) {
/* 12 */                    return false;
                        }
/* 41 */                i2 = this.limit + i9;
/* 42 */                this.limit = i2;
/* 47 */                if (this.lineNumber == 0 && (i3 = this.lineStart) == 0 && i2 > 0 && cArr[0] == 65279) {
/* 65 */                    this.pos++;
/* 69 */                    this.lineStart = i3 + 1;
/* 71 */                    i++;
                        }
/* 73 */            } while (i2 < i);
/* 46 */            return true;
                }

                private String getPath(boolean z) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 int i2 = this.stackSize;
/* 11 */                if (i >= i2) {
/* 78 */                    return sb.toString();
                        }
/* 15 */                int i3 = this.stack[i];
/* 18 */                if (i3 == 1 || i3 == 2) {
/* 50 */                    int i4 = this.pathIndices[i];
/* 52 */                    if (z && i4 > 0 && i == i2 - 1) {
/* 60 */                        i4--;
                            }
/* 64 */                    sb.append('[');
/* 67 */                    sb.append(i4);
/* 72 */                    sb.append(']');
                        } else if (i3 == 3 || i3 == 4 || i3 == 5) {
/* 35 */                    sb.append('.');
/* 40 */                    String str = this.pathNames[i];
/* 42 */                    if (str != null) {
/* 44 */                        sb.append(str);
                            }
                        }
/* 75 */                i++;
                    }
                }

                private boolean isLiteral(char c) throws IOException {
/* 3 */             if (c == '\t' || c == '\n' || c == PEEKED_SINGLE_QUOTED_NAME || c == '\r' || c == ' ') {
/* 61 */                return false;
                    }
/* 23 */            if (c != '#') {
/* 27 */                if (c == ',') {
/* 61 */                    return false;
                        }
/* 31 */                if (c != '/' && c != '=') {
/* 39 */                    if (c == '{' || c == '}' || c == ':') {
/* 61 */                        return false;
                            }
/* 51 */                    if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
/* 61 */                                return false;
                                    case '\\':
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 58 */            checkLenient();
/* 61 */            return false;
                }

                private int nextNonWhitespace(boolean z) throws IOException {
/* 1 */             char[] cArr = this.buffer;
/* 3 */             int i = this.pos;
/* 5 */             int i2 = this.limit;
                    while (true) {
/* 8 */                 if (i == i2) {
/* 10 */                    this.pos = i;
/* 16 */                    if (!fillBuffer(1)) {
/* 18 */                        if (!z) {
/* 20 */                            return -1;
                                }
/* 45 */                        throw new EOFException("End of input" + locationString());
                            }
/* 46 */                    i = this.pos;
/* 48 */                    i2 = this.limit;
                        }
/* 50 */                int i3 = i + 1;
/* 52 */                char c = cArr[i];
/* 56 */                if (c == '\n') {
/* 61 */                    this.lineNumber++;
/* 63 */                    this.lineStart = i3;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 82 */                    if (c == '/') {
/* 84 */                        this.pos = i3;
/* 87 */                        if (i3 == i2) {
/* 89 */                            this.pos = i;
/* 91 */                            boolean zFillBuffer = fillBuffer(2);
/* 98 */                            this.pos++;
/* 100 */                           if (!zFillBuffer) {
                                    }
/* 116 */                           return c;
                                }
/* 103 */                       checkLenient();
/* 106 */                       int i4 = this.pos;
/* 108 */                       char c2 = cArr[i4];
/* 112 */                       if (c2 == '*') {
/* 131 */                           this.pos = i4 + 1;
/* 139 */                           if (!skipTo("*/")) {
/* 154 */                               throw syntaxError("Unterminated comment");
                                    }
/* 143 */                           i = this.pos + 2;
/* 144 */                           i2 = this.limit;
                                } else {
/* 114 */                           if (c2 != '/') {
/* 116 */                               return c;
                                    }
/* 119 */                           this.pos = i4 + 1;
/* 121 */                           skipToEndOfLine();
/* 124 */                           i = this.pos;
/* 126 */                           i2 = this.limit;
                                }
                            } else {
/* 157 */                       if (c != '#') {
/* 173 */                           this.pos = i3;
/* 175 */                           return c;
                                }
/* 159 */                       this.pos = i3;
/* 161 */                       checkLenient();
/* 164 */                       skipToEndOfLine();
/* 167 */                       i = this.pos;
/* 169 */                       i2 = this.limit;
                            }
                        }
/* 176 */               i = i3;
                    }
                }

                private String nextQuotedValue(char c) throws IOException {
                    int i;
/* 1 */             char[] cArr = this.buffer;
/* 3 */             StringBuilder sb = null;
/* 118 */           do {
/* 4 */                 int i2 = this.pos;
/* 6 */                 int i3 = this.limit;
                        while (true) {
/* 8 */                     int i4 = i3;
/* 9 */                     i = i2;
                            while (true) {
/* 13 */                        if (i2 < i4) {
/* 15 */                            int i5 = i2 + 1;
/* 17 */                            char c2 = cArr[i2];
/* 19 */                            if (c2 == c) {
/* 21 */                                this.pos = i5;
/* 24 */                                int i6 = (i5 - i) - 1;
/* 25 */                                if (sb == null) {
/* 29 */                                    return new String(cArr, i, i6);
                                        }
/* 33 */                                sb.append(cArr, i, i6);
/* 36 */                                return sb.toString();
                                    }
/* 43 */                            if (c2 == '\\') {
/* 45 */                                this.pos = i5;
/* 47 */                                int i7 = i5 - i;
/* 48 */                                int i8 = i7 - 1;
/* 50 */                                if (sb == null) {
/* 60 */                                    sb = new StringBuilder(Math.max(i7 * 2, 16));
                                        }
/* 63 */                                sb.append(cArr, i, i8);
/* 70 */                                sb.append(readEscapeCharacter());
/* 73 */                                i2 = this.pos;
/* 75 */                                i3 = this.limit;
                                    } else {
/* 80 */                                if (c2 == '\n') {
/* 85 */                                    this.lineNumber++;
/* 87 */                                    this.lineStart = i5;
                                        }
/* 89 */                                i2 = i5;
                                    }
                                }
                            }
                        }
/* 91 */                if (sb == null) {
/* 103 */                   sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
                        }
/* 109 */               sb.append(cArr, i, i2 - i);
/* 112 */               this.pos = i2;
/* 118 */           } while (fillBuffer(1));
/* 127 */           throw syntaxError("Unterminated string");
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
                private String nextUnquotedValue() throws IOException {
                    String string;
/* 1 */             StringBuilder sb = null;
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 int i2 = 0;
                        while (true) {
/* 4 */                     int i3 = this.pos;
/* 6 */                     int i4 = i3 + i2;
/* 8 */                     int i5 = this.limit;
/* 10 */                    char[] cArr = this.buffer;
/* 12 */                    if (i4 < i5) {
/* 15 */                        char c = cArr[i3 + i2];
/* 19 */                        if (c != '\t' && c != '\n' && c != PEEKED_SINGLE_QUOTED_NAME && c != '\r' && c != ' ') {
/* 39 */                            if (c != '#') {
/* 43 */                                if (c != ',') {
/* 47 */                                    if (c != '/' && c != '=') {
/* 55 */                                        if (c != '{' && c != '}' && c != ':') {
/* 67 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 72 */                                                        i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 75 */                            checkLenient();
                                }
/* 91 */                        i = i2;
                            } else if (i2 >= cArr.length) {
/* 93 */                        if (sb == null) {
/* 103 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 110 */                       sb.append(this.buffer, this.pos, i2);
/* 116 */                       this.pos += i2;
/* 123 */                       if (!fillBuffer(1)) {
                                }
                            } else if (!fillBuffer(i2 + 1)) {
/* 91 */                        i = i2;
                            }
/* 125 */                   char[] cArr2 = this.buffer;
/* 127 */                   if (sb == null) {
/* 133 */                       string = new String(cArr2, this.pos, i);
                            } else {
/* 139 */                       sb.append(cArr2, this.pos, i);
/* 142 */                       string = sb.toString();
                            }
/* 149 */                   this.pos += i;
/* 151 */                   return string;
                        }
                    }
                }

                private int peekKeyword() throws IOException {
                    String str;
                    String str2;
                    int i;
/* 5 */             char c = this.buffer[this.pos];
/* 10 */            if (c == 't' || c == 'T') {
/* 48 */                str = "true";
/* 50 */                str2 = "TRUE";
/* 52 */                i = 5;
                    } else if (c == 'f' || c == 'F') {
/* 42 */                str = "false";
/* 44 */                str2 = "FALSE";
/* 46 */                i = 6;
                    } else {
/* 28 */                if (c != 'n' && c != 'N') {
/* 9 */                     return 0;
                        }
/* 36 */                str = "null";
/* 38 */                str2 = "NULL";
/* 40 */                i = 7;
                    }
/* 53 */            int length = str.length();
/* 57 */            int i2 = 1;
                    while (true) {
/* 58 */                int i3 = this.pos;
/* 60 */                if (i2 >= length) {
/* 102 */                   if ((i3 + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
/* 9 */                         return 0;
                            }
/* 129 */                   this.pos += length;
/* 131 */                   this.peeked = i;
/* 133 */                   return i;
                        }
/* 65 */                if (i3 + i2 >= this.limit && !fillBuffer(i2 + 1)) {
/* 9 */                     return 0;
                        }
/* 81 */                char c2 = this.buffer[this.pos + i2];
/* 87 */                if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
/* 9 */                     return 0;
                        }
/* 96 */                i2++;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:14:0x0036  */
                /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:86:0x00da  */
                /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
                private int peekNumber() throws IOException {
                    char c;
                    int i;
/* 3 */             char[] cArr = this.buffer;
/* 5 */             int i2 = this.pos;
/* 7 */             int i3 = this.limit;
/* 9 */             int i4 = 0;
/* 11 */            int i5 = 0;
/* 12 */            char c2 = 0;
/* 13 */            boolean z = false;
/* 14 */            int i6 = 1;
/* 15 */            long j = 0;
                    while (true) {
/* 21 */                char c3 = 2;
/* 22 */                if (i2 + i5 != i3) {
/* 46 */                    c = cArr[i2 + i5];
/* 48 */                    i = i4;
/* 53 */                    if (c != '+') {
/* 57 */                        if (c != 'E' || c == 'e') {
/* 217 */                           if (c2 == 2 && c2 != 4) {
/* 223 */                               return i;
                                    }
/* 224 */                           c2 = 5;
                                } else if (c == '-') {
/* 207 */                           c3 = 6;
/* 208 */                           if (c2 == 0) {
/* 210 */                               c2 = 1;
/* 211 */                               z = true;
                                    } else if (c2 != 5) {
/* 216 */                               return i;
                                    }
                                } else if (c != '.') {
/* 74 */                            if (c < '0' || c > '9') {
/* 148 */                               if (!isLiteral(c)) {
                                            break;
                                        }
/* 201 */                               return i;
                                    }
/* 81 */                            if (c2 == 1 || c2 == 0) {
/* 139 */                               j = -(c - '0');
                                    } else if (c2 == 2) {
/* 90 */                                if (j == 0) {
/* 92 */                                    return i;
                                        }
/* 99 */                                long j2 = (10 * j) - ((long) (c - '0'));
/* 120 */                               i6 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i;
/* 121 */                               j = j2;
                                    } else if (c2 == 3) {
/* 126 */                               c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
/* 134 */                               c2 = 7;
                                    }
                                } else {
/* 202 */                           if (c2 != 2) {
/* 206 */                               return i;
                                    }
/* 204 */                           c2 = 3;
                                }
/* 230 */                       i5++;
/* 232 */                       i4 = i;
                            } else {
/* 226 */                       c3 = 6;
/* 227 */                       if (c2 != 5) {
/* 236 */                           return i;
                                }
                            }
/* 141 */                   c2 = c3;
/* 230 */                   i5++;
/* 232 */                   i4 = i;
                        } else {
/* 25 */                    if (i5 == cArr.length) {
/* 27 */                        return i4;
                            }
/* 34 */                    if (!fillBuffer(i5 + 1)) {
/* 36 */                        i = i4;
                                break;
                            }
/* 40 */                    i2 = this.pos;
/* 42 */                    i3 = this.limit;
/* 46 */                    c = cArr[i2 + i5];
/* 48 */                    i = i4;
/* 53 */                    if (c != '+') {
/* 57 */                        if (c != 'E') {
/* 217 */                           if (c2 == 2) {
                                    }
/* 224 */                           c2 = 5;
                                } else {
/* 217 */                           if (c2 == 2) {
                                    }
/* 224 */                           c2 = 5;
                                }
/* 230 */                       i5++;
/* 232 */                       i4 = i;
                            } else {
/* 226 */                       c3 = 6;
/* 227 */                       if (c2 != 5) {
/* 236 */                           return i;
                                }
                            }
/* 141 */                   c2 = c3;
/* 230 */                   i5++;
/* 232 */                   i4 = i;
                        }
                    }
/* 150 */           if (c2 == 2 && i6 != 0 && ((j != Long.MIN_VALUE || z) && (j != 0 || !z))) {
/* 168 */               if (!z) {
/* 171 */                   j = -j;
                        }
/* 172 */               this.peekedLong = j;
/* 177 */               this.pos += i5;
/* 181 */               this.peeked = 15;
/* 179 */               return 15;
                    }
/* 184 */           if (c2 != 2 && c2 != 4 && c2 != 7) {
/* 193 */               return i;
                    }
/* 194 */           this.peekedNumberLength = i5;
/* 198 */           this.peeked = 16;
/* 196 */           return 16;
                }

                private void push(int i) {
/* 1 */             int i2 = this.stackSize;
/* 3 */             int[] iArr = this.stack;
/* 6 */             if (i2 == iArr.length) {
/* 8 */                 int i3 = i2 * 2;
/* 14 */                this.stack = Arrays.copyOf(iArr, i3);
/* 22 */                this.pathIndices = Arrays.copyOf(this.pathIndices, i3);
/* 32 */                this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i3);
                    }
/* 34 */            int[] iArr2 = this.stack;
/* 36 */            int i4 = this.stackSize;
/* 40 */            this.stackSize = i4 + 1;
/* 42 */            iArr2[i4] = i;
                }

                private char readEscapeCharacter() throws IOException {
                    int i;
/* 8 */             if (this.pos == this.limit && !fillBuffer(1)) {
/* 21 */                throw syntaxError("Unterminated escape sequence");
                    }
/* 22 */            char[] cArr = this.buffer;
/* 24 */            int i2 = this.pos;
/* 26 */            int i3 = i2 + 1;
/* 28 */            this.pos = i3;
/* 30 */            char c = cArr[i2];
/* 34 */            if (c == '\n') {
/* 194 */               this.lineNumber++;
/* 196 */               this.lineStart = i3;
/* 198 */               return c;
                    }
/* 38 */            if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
/* 190 */               return c;
                    }
/* 54 */            if (c == 'b') {
/* 187 */               return '\b';
                    }
/* 58 */            if (c == 'f') {
/* 184 */               return '\f';
                    }
/* 62 */            if (c == 'n') {
/* 32 */                return '\n';
                    }
/* 66 */            if (c == 'r') {
/* 180 */               return '\r';
                    }
/* 70 */            if (c == 't') {
/* 177 */               return '\t';
                    }
/* 74 */            if (c != 'u') {
/* 176 */               throw syntaxError("Invalid escape sequence");
                    }
/* 81 */            if (i2 + 5 > this.limit && !fillBuffer(4)) {
/* 94 */                throw syntaxError("Unterminated escape sequence");
                    }
/* 95 */            int i4 = this.pos;
/* 97 */            int i5 = i4 + 4;
/* 99 */            char c2 = 0;
/* 100 */           while (i4 < i5) {
/* 102 */               char[] cArr2 = this.buffer;
/* 104 */               char c3 = cArr2[i4];
/* 108 */               char c4 = (char) (c2 << 4);
/* 111 */               if (c3 >= '0' && c3 <= '9') {
/* 117 */                   i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
/* 128 */                   i = c3 - 'W';
                        } else {
/* 133 */                   if (c3 < 'A' || c3 > 'F') {
/* 163 */                       throw new NumberFormatException("\\u".concat(new String(cArr2, this.pos, 4)));
                            }
/* 139 */                   i = c3 - '7';
                        }
/* 120 */               c2 = (char) (i + c4);
/* 142 */               i4++;
                    }
/* 167 */           this.pos += 4;
/* 169 */           return c2;
                }

                private void skipQuotedValue(char c) throws IOException {
/* 1 */             char[] cArr = this.buffer;
/* 52 */            do {
/* 3 */                 int i = this.pos;
/* 5 */                 int i2 = this.limit;
/* 8 */                 while (i < i2) {
/* 10 */                    int i3 = i + 1;
/* 12 */                    char c2 = cArr[i];
/* 14 */                    if (c2 == c) {
/* 16 */                        this.pos = i3;
/* 18 */                        return;
                            }
/* 21 */                    if (c2 == '\\') {
/* 23 */                        this.pos = i3;
/* 25 */                        readEscapeCharacter();
/* 28 */                        i = this.pos;
/* 30 */                        i2 = this.limit;
                            } else {
/* 35 */                        if (c2 == '\n') {
/* 40 */                            this.lineNumber++;
/* 42 */                            this.lineStart = i3;
                                }
/* 44 */                        i = i3;
                            }
                        }
/* 46 */                this.pos = i;
/* 52 */            } while (fillBuffer(1));
/* 61 */            throw syntaxError("Unterminated string");
                }

                private boolean skipTo(String str) throws IOException {
/* 1 */             int length = str.length();
                    while (true) {
/* 11 */                if (this.pos + length > this.limit && !fillBuffer(length)) {
/* 10 */                    return false;
                        }
/* 21 */                char[] cArr = this.buffer;
/* 23 */                int i = this.pos;
/* 30 */                if (cArr[i] != '\n') {
/* 42 */                    for (int i2 = 0; i2 < length; i2++) {
/* 55 */                        if (this.buffer[this.pos + i2] == str.charAt(i2)) {
                                }
                            }
/* 29 */                    return true;
                        }
/* 35 */                this.lineNumber++;
/* 39 */                this.lineStart = i + 1;
/* 60 */                this.pos++;
                    }
                }

                private void skipToEndOfLine() throws IOException {
                    char c;
/* 38 */            do {
/* 6 */                 if (this.pos >= this.limit && !fillBuffer(1)) {
/* 40 */                    return;
                        }
/* 14 */                char[] cArr = this.buffer;
/* 16 */                int i = this.pos;
/* 18 */                int i2 = i + 1;
/* 20 */                this.pos = i2;
/* 22 */                c = cArr[i];
/* 26 */                if (c == '\n') {
/* 31 */                    this.lineNumber++;
/* 33 */                    this.lineStart = i2;
/* 35 */                    return;
                        }
/* 38 */            } while (c != '\r');
                }

                private void skipUnquotedValue() throws IOException {
/* 90 */            do {
/* 1 */                 int i = 0;
                        while (true) {
/* 2 */                     int i2 = this.pos;
/* 8 */                     if (i2 + i < this.limit) {
/* 13 */                        char c = this.buffer[i2 + i];
/* 17 */                        if (c != '\t' && c != '\n' && c != PEEKED_SINGLE_QUOTED_NAME && c != '\r' && c != ' ') {
/* 37 */                            if (c != '#') {
/* 41 */                                if (c != ',') {
/* 45 */                                    if (c != '/' && c != '=') {
/* 53 */                                        if (c != '{' && c != '}' && c != ':') {
/* 65 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 70 */                                                        i++;
                                                                break;
                                                        }
/* 81 */                                                return;
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 73 */                            checkLenient();
                                }
/* 79 */                        this.pos += i;
/* 81 */                        return;
                            }
/* 83 */                    this.pos = i2 + i;
                        }
/* 90 */            } while (fillBuffer(1));
                }

                private IOException syntaxError(String str) throws IOException {
/* 3 */             StringBuilder sbM3512p = AbstractC0886en.m3512p(str);
/* 11 */            sbM3512p.append(locationString());
/* 21 */            throw new MalformedJsonException(sbM3512p.toString());
                }

                public void beginArray() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek == 3) {
/* 13 */                push(1);
/* 22 */                this.pathIndices[this.stackSize - 1] = 0;
/* 24 */                this.peeked = 0;
                    } else {
/* 31 */                StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
/* 38 */                sb.append(peek());
/* 45 */                f42.m3659o(sb, locationString());
                    }
                }

                public void beginObject() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek == 1) {
/* 13 */                push(3);
/* 17 */                this.peeked = 0;
                    } else {
/* 24 */                StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
/* 31 */                sb.append(peek());
/* 38 */                f42.m3659o(sb, locationString());
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 2 */             this.peeked = 0;
/* 8 */             this.stack[0] = 8;
/* 11 */            this.stackSize = 1;
/* 15 */            this.f5311in.close();
                }

                public int doPeek() throws IOException {
                    int iNextNonWhitespace;
/* 1 */             int[] iArr = this.stack;
/* 3 */             int i = this.stackSize;
/* 7 */             int i2 = iArr[i - 1];
/* 26 */            if (i2 == 1) {
/* 29 */                iArr[i - 1] = 2;
                    } else if (i2 == 2) {
/* 35 */                int iNextNonWhitespace2 = nextNonWhitespace(true);
/* 39 */                if (iNextNonWhitespace2 != 44) {
/* 41 */                    if (iNextNonWhitespace2 != 59) {
/* 43 */                        if (iNextNonWhitespace2 != 93) {
/* 54 */                            throw syntaxError("Unterminated array");
                                }
/* 45 */                        this.peeked = 4;
/* 23 */                        return 4;
                            }
/* 55 */                    checkLenient();
                        }
                    } else {
/* 60 */                if (i2 == 3 || i2 == 5) {
/* 284 */                   iArr[i - 1] = 4;
/* 288 */                   if (i2 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
/* 296 */                       if (iNextNonWhitespace != 59) {
/* 298 */                           if (iNextNonWhitespace != 125) {
/* 309 */                               throw syntaxError("Unterminated object");
                                    }
/* 300 */                           this.peeked = 2;
/* 24 */                            return 2;
                                }
/* 310 */                       checkLenient();
                            }
/* 313 */                   int iNextNonWhitespace3 = nextNonWhitespace(true);
/* 317 */                   if (iNextNonWhitespace3 == 34) {
/* 370 */                       this.peeked = 13;
/* 368 */                       return 13;
                            }
/* 319 */                   if (iNextNonWhitespace3 == 39) {
/* 360 */                       checkLenient();
/* 365 */                       this.peeked = PEEKED_SINGLE_QUOTED_NAME;
/* 363 */                       return PEEKED_SINGLE_QUOTED_NAME;
                            }
/* 323 */                   if (iNextNonWhitespace3 == 125) {
/* 350 */                       if (i2 == 5) {
/* 359 */                           throw syntaxError("Expected name");
                                }
/* 352 */                       this.peeked = 2;
/* 24 */                        return 2;
                            }
/* 325 */                   checkLenient();
/* 331 */                   this.pos--;
/* 338 */                   if (!isLiteral((char) iNextNonWhitespace3)) {
/* 349 */                       throw syntaxError("Expected name");
                            }
/* 342 */                   this.peeked = PEEKED_UNQUOTED_NAME;
/* 340 */                   return PEEKED_UNQUOTED_NAME;
                        }
/* 66 */                if (i2 == 4) {
/* 69 */                    iArr[i - 1] = 5;
/* 71 */                    int iNextNonWhitespace4 = nextNonWhitespace(true);
/* 77 */                    if (iNextNonWhitespace4 != 58) {
/* 81 */                        if (iNextNonWhitespace4 != 61) {
/* 118 */                           throw syntaxError("Expected ':'");
                                }
/* 83 */                        checkLenient();
/* 90 */                        if (this.pos < this.limit || fillBuffer(1)) {
/* 98 */                            char[] cArr = this.buffer;
/* 100 */                           int i3 = this.pos;
/* 106 */                           if (cArr[i3] == '>') {
/* 109 */                               this.pos = i3 + 1;
                                    }
                                }
                            }
                        } else if (i2 == 6) {
/* 124 */                   if (this.lenient) {
/* 126 */                       consumeNonExecutePrefix();
                            }
/* 134 */                   this.stack[this.stackSize - 1] = 7;
                        } else if (i2 == 7) {
/* 145 */                   if (nextNonWhitespace(false) == -1) {
/* 149 */                       this.peeked = PEEKED_EOF;
/* 147 */                       return PEEKED_EOF;
                            }
/* 152 */                   checkLenient();
/* 158 */                   this.pos--;
                        } else if (i2 == 8) {
/* 278 */                   f42.m3656l("JsonReader is closed");
/* 281 */                   return 0;
                        }
                    }
/* 163 */           int iNextNonWhitespace5 = nextNonWhitespace(true);
/* 167 */           if (iNextNonWhitespace5 == 34) {
/* 273 */               this.peeked = 9;
/* 271 */               return 9;
                    }
/* 169 */           if (iNextNonWhitespace5 == 39) {
/* 265 */               checkLenient();
/* 268 */               this.peeked = 8;
/* 13 */                return 8;
                    }
/* 171 */           if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
/* 177 */               if (iNextNonWhitespace5 == 91) {
/* 239 */                   this.peeked = 3;
/* 15 */                    return 3;
                        }
/* 179 */               if (iNextNonWhitespace5 != 93) {
/* 183 */                   if (iNextNonWhitespace5 == 123) {
/* 231 */                       this.peeked = 1;
/* 25 */                        return 1;
                            }
/* 188 */                   this.pos--;
/* 190 */                   int iPeekKeyword = peekKeyword();
/* 194 */                   if (iPeekKeyword != 0) {
/* 196 */                       return iPeekKeyword;
                            }
/* 197 */                   int iPeekNumber = peekNumber();
/* 201 */                   if (iPeekNumber != 0) {
/* 203 */                       return iPeekNumber;
                            }
/* 214 */                   if (!isLiteral(this.buffer[this.pos])) {
/* 230 */                       throw syntaxError("Expected value");
                            }
/* 216 */                   checkLenient();
/* 221 */                   this.peeked = 10;
/* 219 */                   return 10;
                        }
/* 234 */               if (i2 == 1) {
/* 236 */                   this.peeked = 4;
/* 23 */                    return 4;
                        }
                    }
/* 242 */           if (i2 != 1 && i2 != 2) {
/* 253 */               throw syntaxError("Unexpected value");
                    }
/* 254 */           checkLenient();
/* 260 */           this.pos--;
/* 262 */           this.peeked = 7;
/* 18 */            return 7;
                }

                public void endArray() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek != 4) {
/* 36 */                StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
/* 43 */                sb.append(peek());
/* 50 */                f42.m3659o(sb, locationString());
                    } else {
/* 12 */                int i = this.stackSize;
/* 16 */                this.stackSize = i - 1;
/* 18 */                int[] iArr = this.pathIndices;
/* 20 */                int i2 = i - 2;
/* 26 */                iArr[i2] = iArr[i2] + 1;
/* 29 */                this.peeked = 0;
                    }
                }

                public void endObject() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek != 2) {
/* 40 */                StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
/* 47 */                sb.append(peek());
/* 54 */                f42.m3659o(sb, locationString());
/* 57 */                return;
                    }
/* 12 */            int i = this.stackSize;
/* 14 */            int i2 = i - 1;
/* 16 */            this.stackSize = i2;
/* 21 */            this.pathNames[i2] = null;
/* 23 */            int[] iArr = this.pathIndices;
/* 25 */            int i3 = i - 2;
/* 30 */            iArr[i3] = iArr[i3] + 1;
/* 33 */            this.peeked = 0;
                }

                public String getPreviousPath() {
/* 2 */             return getPath(true);
                }

                public boolean hasNext() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
                    return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == PEEKED_EOF) ? false : true;
                }

                public final boolean isLenient() {
/* 1 */             return this.lenient;
                }

                public String locationString() {
/* 42 */            return " at line " + (this.lineNumber + 1) + " column " + ((this.pos - this.lineStart) + 1) + " path " + getPath();
                }

                public boolean nextBoolean() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 5) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
/* 20 */                int i = this.stackSize - 1;
/* 24 */                iArr[i] = iArr[i] + 1;
/* 11 */                return true;
                    }
/* 28 */            if (iDoPeek != 6) {
/* 47 */                StringBuilder sb = new StringBuilder("Expected a boolean but was ");
/* 54 */                sb.append(peek());
/* 61 */                f42.m3659o(sb, locationString());
/* 10 */                return false;
                    }
/* 30 */            this.peeked = 0;
/* 32 */            int[] iArr2 = this.pathIndices;
/* 36 */            int i2 = this.stackSize - 1;
/* 40 */            iArr2[i2] = iArr2[i2] + 1;
/* 10 */            return false;
                }

                public double nextDouble() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 15) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
/* 20 */                int i = this.stackSize - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.peekedLong;
                    }
/* 36 */            if (iDoPeek == 16) {
/* 49 */                this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
/* 56 */                this.pos += this.peekedNumberLength;
                    } else if (iDoPeek == 8 || iDoPeek == 9) {
/* 117 */               this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
                    } else if (iDoPeek == 10) {
/* 76 */                this.peekedString = nextUnquotedValue();
                    } else if (iDoPeek != 11) {
/* 86 */                StringBuilder sb = new StringBuilder("Expected a double but was ");
/* 93 */                sb.append(peek());
/* 100 */               f42.m3659o(sb, locationString());
/* 103 */               return 0.0d;
                    }
/* 119 */           this.peeked = 11;
/* 123 */           double d = Double.parseDouble(this.peekedString);
/* 129 */           if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 170 */               throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + locationString());
                    }
/* 172 */           this.peekedString = null;
/* 174 */           this.peeked = 0;
/* 176 */           int[] iArr2 = this.pathIndices;
/* 180 */           int i2 = this.stackSize - 1;
/* 186 */           iArr2[i2] = iArr2[i2] + 1;
/* 188 */           return d;
                }

                public int nextInt() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 14 */            if (iDoPeek == 15) {
/* 16 */                long j = this.peekedLong;
/* 18 */                int i = (int) j;
/* 22 */                if (j == i) {
/* 24 */                    this.peeked = 0;
/* 26 */                    int[] iArr = this.pathIndices;
/* 30 */                    int i2 = this.stackSize - 1;
/* 36 */                    iArr[i2] = iArr[i2] + 1;
/* 38 */                    return i;
                        }
/* 65 */                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
                    }
/* 68 */            if (iDoPeek == 16) {
/* 81 */                this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
/* 88 */                this.pos += this.peekedNumberLength;
                    } else {
/* 95 */                if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
/* 106 */                   StringBuilder sb = new StringBuilder("Expected an int but was ");
/* 113 */                   sb.append(peek());
/* 120 */                   f42.m3659o(sb, locationString());
/* 11 */                    return 0;
                        }
/* 124 */               if (iDoPeek == 10) {
/* 130 */                   this.peekedString = nextUnquotedValue();
                        } else {
/* 144 */                   this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
                        }
                        try {
/* 148 */                   int i3 = Integer.parseInt(this.peekedString);
/* 152 */                   this.peeked = 0;
/* 154 */                   int[] iArr2 = this.pathIndices;
/* 158 */                   int i4 = this.stackSize - 1;
/* 164 */                   iArr2[i4] = iArr2[i4] + 1;
/* 166 */                   return i3;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 169 */           this.peeked = 11;
/* 173 */           double d = Double.parseDouble(this.peekedString);
/* 177 */           int i5 = (int) d;
/* 181 */           if (i5 != d) {
/* 207 */               f42.m3665u(this.peekedString, "Expected an int but was ", locationString());
/* 11 */                return 0;
                    }
/* 184 */           this.peekedString = null;
/* 186 */           this.peeked = 0;
/* 188 */           int[] iArr3 = this.pathIndices;
/* 192 */           int i6 = this.stackSize - 1;
/* 198 */           iArr3[i6] = iArr3[i6] + 1;
/* 200 */           return i5;
                }

                public long nextLong() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 12 */            if (iDoPeek == 15) {
/* 14 */                this.peeked = 0;
/* 16 */                int[] iArr = this.pathIndices;
/* 20 */                int i = this.stackSize - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 28 */                return this.peekedLong;
                    }
/* 37 */            if (iDoPeek == 16) {
/* 50 */                this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
/* 57 */                this.pos += this.peekedNumberLength;
                    } else {
/* 64 */                if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
/* 75 */                    StringBuilder sb = new StringBuilder("Expected a long but was ");
/* 82 */                    sb.append(peek());
/* 89 */                    f42.m3659o(sb, locationString());
/* 33 */                    return 0L;
                        }
/* 93 */                if (iDoPeek == 10) {
/* 99 */                    this.peekedString = nextUnquotedValue();
                        } else {
/* 113 */                   this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
                        }
                        try {
/* 117 */                   long j = Long.parseLong(this.peekedString);
/* 121 */                   this.peeked = 0;
/* 123 */                   int[] iArr2 = this.pathIndices;
/* 127 */                   int i2 = this.stackSize - 1;
/* 133 */                   iArr2[i2] = iArr2[i2] + 1;
/* 135 */                   return j;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 138 */           this.peeked = 11;
/* 142 */           double d = Double.parseDouble(this.peekedString);
/* 146 */           long j2 = (long) d;
/* 150 */           if (j2 != d) {
/* 176 */               f42.m3665u(this.peekedString, "Expected a long but was ", locationString());
/* 33 */                return 0L;
                    }
/* 153 */           this.peekedString = null;
/* 155 */           this.peeked = 0;
/* 157 */           int[] iArr3 = this.pathIndices;
/* 161 */           int i3 = this.stackSize - 1;
/* 167 */           iArr3[i3] = iArr3[i3] + 1;
/* 169 */           return j2;
                }

                public String nextName() throws IOException {
                    String strNextQuotedValue;
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            if (iDoPeek == PEEKED_UNQUOTED_NAME) {
/* 13 */                strNextQuotedValue = nextUnquotedValue();
                    } else if (iDoPeek == PEEKED_SINGLE_QUOTED_NAME) {
/* 24 */                strNextQuotedValue = nextQuotedValue('\'');
                    } else {
/* 31 */                if (iDoPeek != 13) {
/* 55 */                    StringBuilder sb = new StringBuilder("Expected a name but was ");
/* 62 */                    sb.append(peek());
/* 69 */                    f42.m3659o(sb, locationString());
/* 72 */                    return null;
                        }
/* 35 */                strNextQuotedValue = nextQuotedValue('\"');
                    }
/* 40 */            this.peeked = 0;
/* 48 */            this.pathNames[this.stackSize - 1] = strNextQuotedValue;
/* 50 */            return strNextQuotedValue;
                }

                public void nextNull() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 10 */            if (iDoPeek != 7) {
/* 32 */                StringBuilder sb = new StringBuilder("Expected null but was ");
/* 39 */                sb.append(peek());
/* 46 */                f42.m3659o(sb, locationString());
                    } else {
/* 13 */                this.peeked = 0;
/* 15 */                int[] iArr = this.pathIndices;
/* 19 */                int i = this.stackSize - 1;
/* 25 */                iArr[i] = iArr[i] + 1;
                    }
                }

                public String nextString() throws IOException {
                    String str;
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
/* 11 */            if (iDoPeek == 10) {
/* 13 */                str = nextUnquotedValue();
                    } else if (iDoPeek == 8) {
/* 24 */                str = nextQuotedValue('\'');
                    } else if (iDoPeek == 9) {
/* 35 */                str = nextQuotedValue('\"');
                    } else if (iDoPeek == 11) {
/* 45 */                str = this.peekedString;
/* 47 */                this.peekedString = null;
                    } else if (iDoPeek == 15) {
/* 56 */                str = Long.toString(this.peekedLong);
                    } else {
/* 63 */                if (iDoPeek != 16) {
/* 103 */                   StringBuilder sb = new StringBuilder("Expected a string but was ");
/* 110 */                   sb.append(peek());
/* 117 */                   f42.m3659o(sb, locationString());
/* 42 */                    return null;
                        }
/* 73 */                str = new String(this.buffer, this.pos, this.peekedNumberLength);
/* 81 */                this.pos += this.peekedNumberLength;
                    }
/* 84 */            this.peeked = 0;
/* 86 */            int[] iArr = this.pathIndices;
/* 90 */            int i = this.stackSize - 1;
/* 96 */            iArr[i] = iArr[i] + 1;
/* 98 */            return str;
                }

                public JsonToken peek() throws IOException {
/* 1 */             int iDoPeek = this.peeked;
/* 3 */             if (iDoPeek == 0) {
/* 5 */                 iDoPeek = doPeek();
                    }
                    switch (iDoPeek) {
                        case 1:
/* 45 */                    return JsonToken.BEGIN_OBJECT;
                        case 2:
/* 42 */                    return JsonToken.END_OBJECT;
                        case 3:
/* 39 */                    return JsonToken.BEGIN_ARRAY;
                        case 4:
/* 36 */                    return JsonToken.END_ARRAY;
                        case 5:
                        case 6:
/* 33 */                    return JsonToken.BOOLEAN;
                        case 7:
/* 30 */                    return JsonToken.NULL;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 27 */                    return JsonToken.STRING;
                        case PEEKED_SINGLE_QUOTED_NAME /* 12 */:
                        case 13:
                        case PEEKED_UNQUOTED_NAME /* 14 */:
/* 24 */                    return JsonToken.NAME;
                        case 15:
                        case 16:
/* 21 */                    return JsonToken.NUMBER;
                        case PEEKED_EOF /* 17 */:
/* 18 */                    return JsonToken.END_DOCUMENT;
                        default:
/* 17 */                    throw new AssertionError();
                    }
                }

                public final void setLenient(boolean z) {
/* 1 */             this.lenient = z;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public void skipValue() throws IOException {
/* 2 */             int i = 0;
/* 119 */           do {
/* 3 */                 int iDoPeek = this.peeked;
/* 5 */                 if (iDoPeek == 0) {
/* 7 */                     iDoPeek = doPeek();
                        }
                        switch (iDoPeek) {
                            case 1:
/* 113 */                       push(3);
/* 93 */                        i++;
/* 117 */                       this.peeked = 0;
                                break;
                            case 2:
/* 96 */                        if (i == 0) {
/* 104 */                           this.pathNames[this.stackSize - 1] = null;
                                }
/* 109 */                       this.stackSize--;
/* 87 */                        i--;
/* 117 */                       this.peeked = 0;
                                break;
                            case 3:
/* 90 */                        push(1);
/* 93 */                        i++;
/* 117 */                       this.peeked = 0;
                                break;
                            case 4:
/* 85 */                        this.stackSize--;
/* 87 */                        i--;
/* 117 */                       this.peeked = 0;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 15:
                            default:
/* 117 */                       this.peeked = 0;
                                break;
                            case 8:
/* 78 */                        skipQuotedValue('\'');
/* 117 */                       this.peeked = 0;
                                break;
                            case 9:
/* 74 */                        skipQuotedValue('\"');
/* 117 */                       this.peeked = 0;
                                break;
                            case 10:
/* 70 */                        skipUnquotedValue();
/* 117 */                       this.peeked = 0;
                                break;
                            case PEEKED_SINGLE_QUOTED_NAME /* 12 */:
/* 57 */                        skipQuotedValue('\'');
/* 60 */                        if (i == 0) {
/* 67 */                            this.pathNames[this.stackSize - 1] = "<skipped>";
                                }
/* 117 */                       this.peeked = 0;
                                break;
                            case 13:
/* 44 */                        skipQuotedValue('\"');
/* 47 */                        if (i == 0) {
/* 54 */                            this.pathNames[this.stackSize - 1] = "<skipped>";
                                }
/* 117 */                       this.peeked = 0;
                                break;
                            case PEEKED_UNQUOTED_NAME /* 14 */:
/* 31 */                        skipUnquotedValue();
/* 34 */                        if (i == 0) {
/* 41 */                            this.pathNames[this.stackSize - 1] = "<skipped>";
                                }
/* 117 */                       this.peeked = 0;
                                break;
                            case 16:
/* 28 */                        this.pos += this.peekedNumberLength;
/* 117 */                       this.peeked = 0;
                                break;
                            case PEEKED_EOF /* 17 */:
                                break;
                        }
/* 22 */                return;
/* 119 */           } while (i > 0);
/* 121 */           int[] iArr = this.pathIndices;
/* 125 */           int i2 = this.stackSize - 1;
/* 129 */           iArr[i2] = iArr[i2] + 1;
                }

                public String toString() {
/* 24 */            return getClass().getSimpleName() + locationString();
                }

/* 82 */        public String getPath() {
/* 83 */            return getPath(false);
                }
            }
