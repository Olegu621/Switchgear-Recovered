            package p000;

            import java.util.Arrays;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class l72 {

                /* JADX INFO: renamed from: a */
                public static final Class f13131a;

                /* JADX INFO: renamed from: b */
                public static final tx2 f13132b;

                /* JADX INFO: renamed from: c */
                public static final tx2 f13133c;

                /* JADX INFO: renamed from: d */
                public static final tx2 f13134d;

                static {
                    Class<?> cls;
                    try {
/* 3 */                 cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
                    } catch (Throwable unused) {
/* 8 */                 cls = null;
                    }
/* 9 */             f13131a = cls;
/* 16 */            f13132b = m6389v(false);
/* 23 */            f13133c = m6389v(true);
/* 30 */            f13134d = new tx2();
                }

                /* JADX INFO: renamed from: A */
                public static void m6352A(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 102 */               return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 77 */                while (i2 < list.size()) {
/* 85 */                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
/* 89 */                    c1808jw.getClass();
/* 96 */                    c1808jw.m5915o(i, Double.doubleToRawLongBits(dDoubleValue));
/* 99 */                    i2++;
                        }
/* 102 */               return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Double) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 67 */                c1808jw.m5916p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 70 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: B */
                public static void m6353B(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    c1808jw.m5918r(i, 0);
/* 91 */                    c1808jw.m5917q(iIntValue);
                        }
/* 97 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5906f = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM5906f += C1808jw.m5906f(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            c1808jw.m5919s(iM5906f);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                c1808jw.m5917q(((Integer) list.get(i4)).intValue());
                    }
                }

                /* JADX INFO: renamed from: C */
                public static void m6354C(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1808jw.m5913m(i, ((Integer) list.get(i2)).intValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1808jw.m5914n(((Integer) list.get(i2)).intValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: D */
                public static void m6355D(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1808jw.m5915o(i, ((Long) list.get(i2)).longValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1808jw.m5916p(((Long) list.get(i2)).longValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: E */
                public static void m6356E(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 102 */               return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 77 */                while (i2 < list.size()) {
/* 85 */                    float fFloatValue = ((Float) list.get(i2)).floatValue();
/* 89 */                    c1808jw.getClass();
/* 96 */                    c1808jw.m5913m(i, Float.floatToRawIntBits(fFloatValue));
/* 99 */                    i2++;
                        }
/* 102 */               return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Float) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 67 */                c1808jw.m5914n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 70 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: F */
                public static void m6357F(int i, List list, d52 d52Var, h72 h72Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 29 */                return;
                    }
/* 9 */             d52Var.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 23 */                d52Var.m2936J(i, list.get(i2), h72Var);
                    }
                }

                /* JADX INFO: renamed from: G */
                public static void m6358G(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    c1808jw.m5918r(i, 0);
/* 91 */                    c1808jw.m5917q(iIntValue);
                        }
/* 97 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5906f = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM5906f += C1808jw.m5906f(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            c1808jw.m5919s(iM5906f);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                c1808jw.m5917q(((Integer) list.get(i4)).intValue());
                    }
                }

                /* JADX INFO: renamed from: H */
                public static void m6359H(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    c1808jw.m5920t(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5910j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM5910j += C1808jw.m5910j(((Long) list.get(i3)).longValue());
                    }
/* 46 */            c1808jw.m5919s(iM5910j);
/* 53 */            while (i2 < list.size()) {
/* 65 */                c1808jw.m5921u(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: I */
                public static void m6360I(int i, List list, d52 d52Var, h72 h72Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 29 */                return;
                    }
/* 9 */             d52Var.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 23 */                d52Var.m2937K(i, list.get(i2), h72Var);
                    }
                }

                /* JADX INFO: renamed from: J */
                public static void m6361J(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1808jw.m5913m(i, ((Integer) list.get(i2)).intValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1808jw.m5914n(((Integer) list.get(i2)).intValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: K */
                public static void m6362K(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1808jw.m5915o(i, ((Long) list.get(i2)).longValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1808jw.m5916p(((Long) list.get(i2)).longValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: L */
                public static void m6363L(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 112 */               return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 14 */            if (!z) {
/* 86 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 94 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 103 */                   c1808jw.m5918r(i, 0);
/* 106 */                   c1808jw.m5919s((iIntValue >> 31) ^ (iIntValue << 1));
                        }
/* 112 */               return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5909i = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 34 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 47 */                iM5909i += C1808jw.m5909i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    }
/* 51 */            c1808jw.m5919s(iM5909i);
/* 58 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 66 */                int iIntValue3 = ((Integer) list.get(i4)).intValue();
/* 75 */                c1808jw.m5919s((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                    }
                }

                /* JADX INFO: renamed from: M */
                public static void m6364M(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 108 */               return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 16 */            int i2 = 0;
/* 17 */            if (!z) {
/* 86 */                while (i2 < list.size()) {
/* 94 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 102 */                   c1808jw.m5920t(i, (jLongValue >> 63) ^ (jLongValue << 1));
/* 105 */                   i2++;
                        }
/* 108 */               return;
                    }
/* 20 */            c1808jw.m5918r(i, 2);
/* 24 */            int iM5910j = 0;
/* 29 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 37 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 49 */                iM5910j += C1808jw.m5910j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    }
/* 53 */            c1808jw.m5919s(iM5910j);
/* 60 */            while (i2 < list.size()) {
/* 68 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 76 */                c1808jw.m5921u((jLongValue3 >> 63) ^ (jLongValue3 << 1));
/* 79 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: N */
                public static void m6365N(int i, List list, d52 d52Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 307 */               return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 19 */            if (!(list instanceof u51)) {
/* 187 */               for (int i2 = 0; i2 < list.size(); i2++) {
/* 193 */                   String str = (String) list.get(i2);
/* 195 */                   c1808jw.m5918r(i, 2);
/* 198 */                   int i3 = c1808jw.f12515c;
/* 200 */                   byte[] bArr = c1808jw.f12514b;
/* 202 */                   int i4 = c1808jw.f12516d;
                            try {
/* 210 */                       int iM5909i = C1808jw.m5909i(str.length() * 3);
/* 218 */                       int iM5909i2 = C1808jw.m5909i(str.length());
/* 222 */                       if (iM5909i2 == iM5909i) {
/* 224 */                           int i5 = i4 + iM5909i2;
/* 226 */                           c1808jw.f12516d = i5;
/* 231 */                           int iM4448o = m13.f13547a.m4448o(str, bArr, i5, i3 - i5);
/* 235 */                           c1808jw.f12516d = i4;
/* 240 */                           c1808jw.m5919s((iM4448o - i4) - iM5909i2);
/* 243 */                           c1808jw.f12516d = iM4448o;
                                } else {
/* 252 */                           c1808jw.m5919s(m13.m6590b(str));
/* 255 */                           int i6 = c1808jw.f12516d;
/* 264 */                           c1808jw.f12516d = m13.f13547a.m4448o(str, bArr, i6, i3 - i6);
                                }
                            } catch (IndexOutOfBoundsException e) {
/* 273 */                       throw new C1868kw(e);
                            } catch (k13 e2) {
/* 274 */                       c1808jw.f12516d = i4;
/* 280 */                       C1808jw.f12511e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 285 */                       byte[] bytes = str.getBytes(ez0.f7923a);
                                try {
/* 290 */                           c1808jw.m5919s(bytes.length);
/* 294 */                           c1808jw.m5912l(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e3) {
/* 306 */                           throw new C1868kw(e3);
                                }
                            }
                        }
/* 307 */               return;
                    }
/* 22 */            u51 u51Var = (u51) list;
/* 29 */            for (int i7 = 0; i7 < list.size(); i7++) {
/* 31 */                Object objMo8698j1 = u51Var.mo8698j1(i7);
/* 37 */                if (objMo8698j1 instanceof String) {
/* 39 */                    String str2 = (String) objMo8698j1;
/* 41 */                    c1808jw.m5918r(i, 2);
/* 44 */                    int i8 = c1808jw.f12515c;
/* 46 */                    byte[] bArr2 = c1808jw.f12514b;
/* 48 */                    int i9 = c1808jw.f12516d;
                            try {
/* 56 */                        int iM5909i3 = C1808jw.m5909i(str2.length() * 3);
/* 64 */                        int iM5909i4 = C1808jw.m5909i(str2.length());
/* 68 */                        if (iM5909i4 == iM5909i3) {
/* 70 */                            int i10 = i9 + iM5909i4;
/* 72 */                            c1808jw.f12516d = i10;
/* 77 */                            int iM4448o2 = m13.f13547a.m4448o(str2, bArr2, i10, i8 - i10);
/* 81 */                            c1808jw.f12516d = i9;
/* 86 */                            c1808jw.m5919s((iM4448o2 - i9) - iM5909i4);
/* 89 */                            c1808jw.f12516d = iM4448o2;
                                } else {
/* 98 */                            c1808jw.m5919s(m13.m6590b(str2));
/* 101 */                           int i11 = c1808jw.f12516d;
/* 110 */                           c1808jw.f12516d = m13.f13547a.m4448o(str2, bArr2, i11, i8 - i11);
                                }
                            } catch (IndexOutOfBoundsException e4) {
/* 119 */                       throw new C1868kw(e4);
                            } catch (k13 e5) {
/* 120 */                       c1808jw.f12516d = i9;
/* 126 */                       C1808jw.f12511e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
/* 131 */                       byte[] bytes2 = str2.getBytes(ez0.f7923a);
                                try {
/* 136 */                           c1808jw.m5919s(bytes2.length);
/* 140 */                           c1808jw.m5912l(bytes2, 0, bytes2.length);
                                } catch (IndexOutOfBoundsException e6) {
/* 150 */                           throw new C1868kw(e6);
                                }
                            }
                        } else {
/* 151 */                   AbstractC2298vl abstractC2298vl = (AbstractC2298vl) objMo8698j1;
/* 153 */                   c1808jw.m5918r(i, 2);
/* 160 */                   c1808jw.m5919s(abstractC2298vl.size());
/* 163 */                   C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 175 */                   c1808jw.m5912l(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size());
                        }
                    }
                }

                /* JADX INFO: renamed from: O */
                public static void m6366O(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 14 */            if (!z) {
/* 76 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 84 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 88 */                    c1808jw.m5918r(i, 0);
/* 91 */                    c1808jw.m5919s(iIntValue);
                        }
/* 97 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5909i = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM5909i += C1808jw.m5909i(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            c1808jw.m5919s(iM5909i);
/* 53 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 65 */                c1808jw.m5919s(((Integer) list.get(i4)).intValue());
                    }
                }

                /* JADX INFO: renamed from: P */
                public static void m6367P(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    c1808jw.m5920t(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int iM5910j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM5910j += C1808jw.m5910j(((Long) list.get(i3)).longValue());
                    }
/* 46 */            c1808jw.m5919s(iM5910j);
/* 53 */            while (i2 < list.size()) {
/* 65 */                c1808jw.m5921u(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static int m6368a(int i, List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iM5908h = C1808jw.m5908h(i) * size;
/* 18 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 30 */                iM5908h += C1808jw.m5902b((AbstractC2298vl) list.get(i2));
                    }
/* 34 */            return iM5908h;
                }

                /* JADX INFO: renamed from: b */
                public static int m6369b(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6370c(list);
                }

                /* JADX INFO: renamed from: c */
                public static int m6370c(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ry0) {
/* 13 */                ry0 ry0Var = (ry0) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ry0Var.m8333c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5906f = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iM5906f += C1808jw.m5906f(((Integer) list.get(i)).intValue());
                    }
/* 44 */            return iM5906f;
                }

                /* JADX INFO: renamed from: d */
                public static int m6371d(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 13 */            return C1808jw.m5903c(i) * size;
                }

                /* JADX INFO: renamed from: e */
                public static int m6372e(List list) {
/* 5 */             return list.size() * 4;
                }

                /* JADX INFO: renamed from: f */
                public static int m6373f(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 13 */            return C1808jw.m5904d(i) * size;
                }

                /* JADX INFO: renamed from: g */
                public static int m6374g(List list) {
/* 5 */             return list.size() * 8;
                }

                /* JADX INFO: renamed from: h */
                public static int m6375h(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6376i(list);
                }

                /* JADX INFO: renamed from: i */
                public static int m6376i(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ry0) {
/* 13 */                ry0 ry0Var = (ry0) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ry0Var.m8333c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5906f = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iM5906f += C1808jw.m5906f(((Integer) list.get(i)).intValue());
                    }
/* 44 */            return iM5906f;
                }

                /* JADX INFO: renamed from: j */
                public static int m6377j(int i, List list) {
/* 5 */             if (list.size() == 0) {
/* 7 */                 return 0;
                    }
/* 22 */            return (C1808jw.m5908h(i) * list.size()) + m6378k(list);
                }

                /* JADX INFO: renamed from: k */
                public static int m6378k(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ja1) {
/* 13 */                ja1 ja1Var = (ja1) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ja1Var.m5732c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5910j = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iM5910j += C1808jw.m5910j(((Long) list.get(i)).longValue());
                    }
/* 44 */            return iM5910j;
                }

                /* JADX INFO: renamed from: l */
                public static int m6379l(int i, List list, h72 h72Var) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iM5908h = C1808jw.m5908h(i) * size;
/* 14 */            for (int i2 = 0; i2 < size; i2++) {
/* 22 */                int iMo8615b = ((AbstractC2313w) list.get(i2)).mo8615b(h72Var);
/* 31 */                iM5908h += C1808jw.m5909i(iMo8615b) + iMo8615b;
                    }
/* 35 */            return iM5908h;
                }

                /* JADX INFO: renamed from: m */
                public static int m6380m(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6381n(list);
                }

                /* JADX INFO: renamed from: n */
                public static int m6381n(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ry0) {
/* 13 */                ry0 ry0Var = (ry0) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ry0Var.m8333c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5909i = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 32 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 45 */                iM5909i += C1808jw.m5909i((iIntValue >> 31) ^ (iIntValue << 1));
                    }
/* 49 */            return iM5909i;
                }

                /* JADX INFO: renamed from: o */
                public static int m6382o(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6383p(list);
                }

                /* JADX INFO: renamed from: p */
                public static int m6383p(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ja1) {
/* 13 */                ja1 ja1Var = (ja1) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ja1Var.m5732c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5910j = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 32 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 47 */                iM5910j += C1808jw.m5910j((jLongValue >> 63) ^ (jLongValue << 1));
                    }
/* 51 */            return iM5910j;
                }

                /* JADX INFO: renamed from: q */
                public static int m6384q(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             int i2 = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            int iM5908h = C1808jw.m5908h(i) * size;
/* 16 */            if (!(list instanceof u51)) {
/* 56 */                while (i2 < size) {
/* 58 */                    Object obj = list.get(i2);
/* 64 */                    if (obj instanceof AbstractC2298vl) {
/* 68 */                        int size2 = ((AbstractC2298vl) obj).size();
/* 77 */                        iM5908h = C1808jw.m5909i(size2) + size2 + iM5908h;
                            } else {
/* 86 */                        iM5908h = C1808jw.m5907g((String) obj) + iM5908h;
                            }
/* 88 */                    i2++;
                        }
/* 91 */                return iM5908h;
                    }
/* 18 */            u51 u51Var = (u51) list;
/* 20 */            while (i2 < size) {
/* 22 */                Object objMo8698j1 = u51Var.mo8698j1(i2);
/* 28 */                if (objMo8698j1 instanceof AbstractC2298vl) {
/* 32 */                    int size3 = ((AbstractC2298vl) objMo8698j1).size();
/* 41 */                    iM5908h = C1808jw.m5909i(size3) + size3 + iM5908h;
                        } else {
/* 50 */                    iM5908h = C1808jw.m5907g((String) objMo8698j1) + iM5908h;
                        }
/* 52 */                i2++;
                    }
/* 55 */            return iM5908h;
                }

                /* JADX INFO: renamed from: r */
                public static int m6385r(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6386s(list);
                }

                /* JADX INFO: renamed from: s */
                public static int m6386s(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ry0) {
/* 13 */                ry0 ry0Var = (ry0) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ry0Var.m8333c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5909i = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iM5909i += C1808jw.m5909i(((Integer) list.get(i)).intValue());
                    }
/* 44 */            return iM5909i;
                }

                /* JADX INFO: renamed from: t */
                public static int m6387t(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 18 */            return (C1808jw.m5908h(i) * size) + m6388u(list);
                }

                /* JADX INFO: renamed from: u */
                public static int m6388u(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (list instanceof ja1) {
/* 13 */                ja1 ja1Var = (ja1) list;
/* 15 */                if (size <= 0) {
/* 5 */                     return 0;
                        }
/* 18 */                ja1Var.m5732c(0);
/* 22 */                throw null;
                    }
/* 23 */            int iM5910j = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 40 */                iM5910j += C1808jw.m5910j(((Long) list.get(i)).longValue());
                    }
/* 44 */            return iM5910j;
                }

                /* JADX INFO: renamed from: v */
                public static tx2 m6389v(boolean z) {
                    Class<?> cls;
                    try {
/* 4 */                 cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            if (cls != null) {
                        try {
/* 35 */                    return (tx2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                        } catch (Throwable unused2) {
                        }
                    }
/* 1 */             return null;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: w */
                public static void m6390w(tx2 tx2Var, Object obj, Object obj2) {
/* 1 */             tx2Var.getClass();
/* 4 */             sq0 sq0Var = (sq0) obj;
/* 6 */             rx2 rx2Var = sq0Var.unknownFields;
/* 10 */            rx2 rx2Var2 = ((sq0) obj2).unknownFields;
/* 12 */            rx2 rx2Var3 = rx2.f16339f;
/* 18 */            if (!rx2Var3.equals(rx2Var2)) {
/* 26 */                if (rx2Var3.equals(rx2Var)) {
/* 32 */                    int i = rx2Var.f16340a + rx2Var2.f16340a;
/* 35 */                    int[] iArrCopyOf = Arrays.copyOf(rx2Var.f16341b, i);
/* 45 */                    System.arraycopy(rx2Var2.f16341b, 0, iArrCopyOf, rx2Var.f16340a, rx2Var2.f16340a);
/* 50 */                    Object[] objArrCopyOf = Arrays.copyOf(rx2Var.f16342c, i);
/* 60 */                    System.arraycopy(rx2Var2.f16342c, 0, objArrCopyOf, rx2Var.f16340a, rx2Var2.f16340a);
/* 66 */                    rx2Var = new rx2(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 70 */                    rx2Var.getClass();
/* 77 */                    if (!rx2Var2.equals(rx2Var3)) {
/* 82 */                        if (!rx2Var.f16344e) {
/* 119 */                           f42.m3660p();
/* 122 */                           return;
                                }
/* 88 */                        int i2 = rx2Var.f16340a + rx2Var2.f16340a;
/* 89 */                        rx2Var.m8319a(i2);
/* 100 */                       System.arraycopy(rx2Var2.f16341b, 0, rx2Var.f16341b, rx2Var.f16340a, rx2Var2.f16340a);
/* 111 */                       System.arraycopy(rx2Var2.f16342c, 0, rx2Var.f16342c, rx2Var.f16340a, rx2Var2.f16340a);
/* 114 */                       rx2Var.f16340a = i2;
                            }
                        }
                    }
/* 116 */           sq0Var.unknownFields = rx2Var;
                }

                /* JADX INFO: renamed from: x */
                public static boolean m6391x(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                /* JADX INFO: renamed from: y */
                public static void m6392y(int i, List list, d52 d52Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 14 */            if (!z) {
/* 75 */                for (int i2 = 0; i2 < list.size(); i2++) {
/* 83 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 87 */                    c1808jw.m5918r(i, 0);
/* 91 */                    c1808jw.m5911k(zBooleanValue ? (byte) 1 : (byte) 0);
                        }
/* 97 */                return;
                    }
/* 17 */            c1808jw.m5918r(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Boolean) list.get(i4)).getClass();
/* 37 */                Logger logger = C1808jw.f12511e;
/* 39 */                i3++;
                    }
/* 44 */            c1808jw.m5919s(i3);
/* 51 */            for (int i5 = 0; i5 < list.size(); i5++) {
/* 64 */                c1808jw.m5911k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                    }
                }

                /* JADX INFO: renamed from: z */
                public static void m6393z(int i, List list, d52 d52Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 58 */                return;
                    }
/* 9 */             d52Var.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 21 */                C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 27 */                AbstractC2298vl abstractC2298vl = (AbstractC2298vl) list.get(i2);
/* 30 */                c1808jw.m5918r(i, 2);
/* 37 */                c1808jw.m5919s(abstractC2298vl.size());
/* 40 */                C2222tl c2222tl = (C2222tl) abstractC2298vl;
/* 52 */                c1808jw.m5912l(c2222tl.f17140d, c2222tl.mo8196f(), c2222tl.size());
                    }
                }
            }
