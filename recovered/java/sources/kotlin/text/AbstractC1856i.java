            package kotlin.text;

            import io.flutter.embedding.android.KeyboardMap;
            import kotlin.jvm.internal.Intrinsics;
            import p000.ax2;
            import p000.lw2;
            import p000.mw2;
            import p000.rw2;
            import p000.sw2;
            import p000.ts2;
            
            /* JADX INFO: renamed from: kotlin.text.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1856i {
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX INFO: renamed from: a */
                public static final byte m6264a(String str) {
                    ts2 ts2Var;
/* 1 */             str.getClass();
/* 4 */             mw2 mw2VarM6266c = m6266c(str);
/* 9 */             if (mw2VarM6266c != null) {
/* 11 */                int i = mw2VarM6266c.f14055a;
/* 23 */                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0) {
/* 33 */                    ts2Var = null;
                        } else {
/* 29 */                    ts2Var = new ts2((byte) i);
                        }
                    } else {
/* 33 */                ts2Var = null;
                    }
/* 34 */            if (ts2Var != null) {
/* 36 */                return ts2Var.f17252a;
                    }
/* 39 */            StringsKt__StringNumberConversionsKt.m6241e(str);
/* 42 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public static final int m6265b(String str) {
/* 1 */             str.getClass();
/* 4 */             mw2 mw2VarM6266c = m6266c(str);
/* 8 */             if (mw2VarM6266c != null) {
/* 10 */                return mw2VarM6266c.f14055a;
                    }
/* 13 */            StringsKt__StringNumberConversionsKt.m6241e(str);
/* 17 */            throw null;
                }

                /* JADX INFO: renamed from: c */
                public static final mw2 m6266c(String str) {
                    int i;
/* 1 */             str.getClass();
/* 6 */             CharsKt__CharJVMKt.checkRadix(10);
/* 9 */             int length = str.length();
/* 13 */            if (length == 0) {
/* 96 */                return null;
                    }
/* 16 */            int i2 = 0;
/* 17 */            char cCharAt = str.charAt(0);
/* 27 */            if (Intrinsics.m6217b(cCharAt, 48) < 0) {
/* 29 */                i = 1;
/* 30 */                if (length == 1 || cCharAt != '+') {
/* 96 */                    return null;
                        }
                    } else {
/* 37 */                i = 0;
                    }
/* 38 */            lw2 lw2Var = mw2.f14054b;
/* 43 */            int i3 = 119304647;
/* 44 */            while (i < length) {
/* 50 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 54 */                if (iDigit < 0) {
/* 96 */                    return null;
                        }
/* 59 */                int i4 = i2 ^ Integer.MIN_VALUE;
/* 67 */                if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
/* 69 */                    if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
/* 96 */                        return null;
                            }
/* 81 */                    i3 = 429496729;
                        }
/* 84 */                int i5 = i2 * 10;
/* 86 */                int i6 = iDigit + i5;
/* 94 */                if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
/* 96 */                    return null;
                        }
/* 98 */                i++;
/* 100 */               i2 = i6;
                    }
/* 104 */           return new mw2(i2);
                }

                /* JADX INFO: renamed from: d */
                public static final long m6267d(String str) {
/* 1 */             str.getClass();
/* 4 */             sw2 sw2VarM6268e = m6268e(str);
/* 8 */             if (sw2VarM6268e != null) {
/* 10 */                return sw2VarM6268e.f16830a;
                    }
/* 13 */            StringsKt__StringNumberConversionsKt.m6241e(str);
/* 17 */            throw null;
                }

                /* JADX INFO: renamed from: e */
                public static final sw2 m6268e(String str) {
/* 3 */             str.getClass();
/* 6 */             str.getClass();
/* 9 */             int i = 10;
/* 11 */            CharsKt__CharJVMKt.checkRadix(10);
/* 14 */            int length = str.length();
/* 18 */            if (length == 0) {
/* 121 */               return null;
                    }
/* 21 */            int i2 = 0;
/* 22 */            char cCharAt = str.charAt(0);
/* 32 */            if (Intrinsics.m6217b(cCharAt, 48) < 0) {
/* 34 */                i2 = 1;
/* 35 */                if (length == 1 || cCharAt != '+') {
/* 121 */                   return null;
                        }
                    }
/* 42 */            rw2 rw2Var = sw2.f16829b;
/* 44 */            long j = 0;
/* 51 */            long j2 = 512409557603043100L;
/* 52 */            while (i2 < length) {
/* 58 */                int iDigit = Character.digit((int) str.charAt(i2), i);
/* 62 */                if (iDigit < 0) {
/* 121 */                   return null;
                        }
/* 67 */                long j3 = j ^ Long.MIN_VALUE;
/* 69 */                int i3 = length;
/* 76 */                if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
/* 80 */                    if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
/* 121 */                       return null;
                            }
/* 94 */                    j2 = 1844674407370955161L;
                        }
/* 101 */               long j4 = j * 10;
/* 102 */               lw2 lw2Var = mw2.f14054b;
/* 111 */               long j5 = (((long) iDigit) & KeyboardMap.kValueMask) + j4;
/* 119 */               if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
/* 121 */                   return null;
                        }
/* 123 */               i2++;
/* 125 */               j = j5;
/* 126 */               length = i3;
/* 127 */               i = 10;
                    }
/* 132 */           return new sw2(j);
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX INFO: renamed from: f */
                public static final short m6269f(String str) {
                    ax2 ax2Var;
/* 1 */             str.getClass();
/* 4 */             mw2 mw2VarM6266c = m6266c(str);
/* 9 */             if (mw2VarM6266c != null) {
/* 11 */                int i = mw2VarM6266c.f14055a;
/* 23 */                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0) {
/* 33 */                    ax2Var = null;
                        } else {
/* 29 */                    ax2Var = new ax2((short) i);
                        }
                    } else {
/* 33 */                ax2Var = null;
                    }
/* 34 */            if (ax2Var != null) {
/* 36 */                return ax2Var.f2138a;
                    }
/* 39 */            StringsKt__StringNumberConversionsKt.m6241e(str);
/* 42 */            throw null;
                }
            }
