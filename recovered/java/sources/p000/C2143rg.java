            package p000;

            import android.util.Size;
            
            /* JADX INFO: renamed from: rg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2143rg {

                /* JADX INFO: renamed from: a */
                public final int f16041a;

                /* JADX INFO: renamed from: b */
                public final ej2 f16042b;

                /* JADX INFO: renamed from: c */
                public final long f16043c;

                public C2143rg(int i, ej2 ej2Var, long j) {
/* 4 */             if (i == 0) {
/* 15 */                C1951n4.m6868s("Null configType");
/* 19 */                throw null;
                    }
/* 6 */             this.f16041a = i;
/* 8 */             this.f16042b = ej2Var;
/* 10 */            this.f16043c = j;
                }

                /* JADX INFO: renamed from: a */
                public static int m8155a(int i) {
/* 3 */             if (i == 35) {
/* 5 */                 return 2;
                    }
/* 9 */             if (i == 256) {
/* 11 */                return 3;
                    }
/* 15 */            if (i == 4101) {
/* 17 */                return 4;
                    }
                    return i == 32 ? 5 : 1;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0087  */
                /* JADX INFO: renamed from: b */
                public static C2143rg m8156b(int i, int i2, Size size, C2330wg c2330wg) {
                    ej2 ej2Var;
/* 1 */             int iM8155a = m8155a(i2);
/* 5 */             int iM9005a = ue2.m9005a(size);
/* 10 */            if (i == 1) {
/* 28 */                if (iM9005a <= ue2.m9005a((Size) c2330wg.f18609b.get(Integer.valueOf(i2)))) {
/* 30 */                    ej2Var = ej2.s720p;
                        } else if (iM9005a <= ue2.m9005a((Size) c2330wg.f18611d.get(Integer.valueOf(i2)))) {
/* 51 */                    ej2Var = ej2.s1440p;
                        } else {
/* 136 */                   ej2Var = ej2.NOT_SUPPORT;
                        }
                    } else if (iM9005a <= ue2.m9005a(c2330wg.f18608a)) {
/* 62 */                ej2Var = ej2.VGA;
                    } else if (iM9005a <= ue2.m9005a(c2330wg.f18610c)) {
/* 73 */                ej2Var = ej2.PREVIEW;
                    } else if (iM9005a <= ue2.m9005a(c2330wg.f18612e)) {
/* 84 */                ej2Var = ej2.RECORD;
                    } else if (iM9005a <= ue2.m9005a((Size) c2330wg.f18613f.get(Integer.valueOf(i2)))) {
/* 105 */               ej2Var = ej2.MAXIMUM;
                    } else {
/* 118 */               Size size2 = (Size) c2330wg.f18614g.get(Integer.valueOf(i2));
/* 120 */               if (size2 != null) {
/* 131 */                   if (iM9005a <= size2.getHeight() * size2.getWidth()) {
/* 133 */                       ej2Var = ej2.ULTRA_MAXIMUM;
                            } else {
/* 136 */                       ej2Var = ej2.NOT_SUPPORT;
                            }
                        } else {
/* 136 */                   ej2Var = ej2.NOT_SUPPORT;
                        }
                    }
/* 142 */           return new C2143rg(iM8155a, ej2Var, 0L);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 38 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2143rg)) {
/* 40 */                return false;
                    }
/* 8 */             C2143rg c2143rg = (C2143rg) obj;
                    return AbstractC0886en.m3499c(this.f16041a, c2143rg.f16041a) && this.f16042b.equals(c2143rg.f16042b) && this.f16043c == c2143rg.f16043c;
                }

                public final int hashCode() {
/* 19 */            int iM3520y = (((AbstractC0886en.m3520y(this.f16041a) ^ 1000003) * 1000003) ^ this.f16042b.hashCode()) * 1000003;
/* 22 */            long j = this.f16043c;
/* 29 */            return ((int) ((j >>> 32) ^ j)) ^ iM3520y;
                }

                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
/* 9 */             int i = this.f16041a;
/* 11 */            if (i == 1) {
/* 40 */                str = "PRIV";
                    } else if (i == 2) {
/* 37 */                str = "YUV";
                    } else if (i == 3) {
/* 34 */                str = "JPEG";
                    } else if (i != 4) {
/* 28 */                str = i != 5 ? "null" : "RAW";
                    } else {
/* 31 */                str = "JPEG_R";
                    }
/* 42 */            sb.append(str);
/* 47 */            sb.append(", configSize=");
/* 52 */            sb.append(this.f16042b);
/* 57 */            sb.append(", streamUseCase=");
/* 64 */            return fm0.m3787m(sb, this.f16043c, "}");
                }
            }
