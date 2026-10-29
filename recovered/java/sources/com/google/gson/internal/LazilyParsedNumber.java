            package com.google.gson.internal;

            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.ObjectStreamException;
            import java.math.BigDecimal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LazilyParsedNumber extends Number {
                private final String value;

                public LazilyParsedNumber(String str) {
/* 4 */             this.value = str;
                }

                private void readObject(ObjectInputStream objectInputStream) throws IOException {
/* 8 */             throw new InvalidObjectException("Deserialization is unsupported");
                }

                private Object writeReplace() throws ObjectStreamException {
/* 5 */             return new BigDecimal(this.value);
                }

                @Override // java.lang.Number
                public double doubleValue() {
/* 3 */             return Double.parseDouble(this.value);
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof LazilyParsedNumber)) {
/* 7 */                 return false;
                    }
/* 12 */            String str = this.value;
/* 14 */            String str2 = ((LazilyParsedNumber) obj).value;
                    return str == str2 || str.equals(str2);
                }

                @Override // java.lang.Number
                public float floatValue() {
/* 3 */             return Float.parseFloat(this.value);
                }

                public int hashCode() {
/* 3 */             return this.value.hashCode();
                }

                @Override // java.lang.Number
                public int intValue() {
                    try {
                        try {
/* 3 */                     return Integer.parseInt(this.value);
                        } catch (NumberFormatException unused) {
/* 14 */                    return (int) Long.parseLong(this.value);
                        }
                    } catch (NumberFormatException unused2) {
/* 23 */                return new BigDecimal(this.value).intValue();
                    }
                }

                @Override // java.lang.Number
                public long longValue() {
                    try {
/* 3 */                 return Long.parseLong(this.value);
                    } catch (NumberFormatException unused) {
/* 15 */                return new BigDecimal(this.value).longValue();
                    }
                }

                public String toString() {
/* 1 */             return this.value;
                }
            }
