            package p000;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rx2 {

                /* JADX INFO: renamed from: f */
                public static final rx2 f16339f = new rx2(0, new int[0], new Object[0], false);

                /* JADX INFO: renamed from: a */
                public int f16340a;

                /* JADX INFO: renamed from: b */
                public int[] f16341b;

                /* JADX INFO: renamed from: c */
                public Object[] f16342c;

                /* JADX INFO: renamed from: d */
                public int f16343d = -1;

                /* JADX INFO: renamed from: e */
                public boolean f16344e;

                public rx2(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.f16340a = i;
/* 9 */             this.f16341b = iArr;
/* 11 */            this.f16342c = objArr;
/* 13 */            this.f16344e = z;
                }

                /* JADX INFO: renamed from: c */
                public static rx2 m8318c() {
/* 11 */            return new rx2(0, new int[8], new Object[8], true);
                }

                /* JADX INFO: renamed from: a */
                public final void m8319a(int i) {
/* 1 */             int[] iArr = this.f16341b;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.f16340a;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 14 */                    i = i3;
                        }
/* 17 */                if (i < 8) {
/* 19 */                    i = 8;
                        }
/* 24 */                this.f16341b = Arrays.copyOf(iArr, i);
/* 32 */                this.f16342c = Arrays.copyOf(this.f16342c, i);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int m8320b() {
                    int iM5908h;
                    int iM5910j;
                    int iM5904d;
/* 1 */             int i = this.f16343d;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int i2 = 0;
/* 11 */            for (int i3 = 0; i3 < this.f16340a; i3++) {
/* 15 */                int i4 = this.f16341b[i3];
/* 17 */                int i5 = i4 >>> 3;
/* 19 */                int i6 = i4 & 7;
/* 21 */                if (i6 != 0) {
/* 24 */                    if (i6 == 1) {
/* 96 */                        ((Long) this.f16342c[i3]).getClass();
/* 99 */                        iM5904d = C1808jw.m5904d(i5);
                            } else if (i6 == 2) {
/* 85 */                        iM5904d = C1808jw.m5901a(i5, (AbstractC2298vl) this.f16342c[i3]);
                            } else if (i6 == 3) {
/* 64 */                        iM5908h = C1808jw.m5908h(i5) * 2;
/* 71 */                        iM5910j = ((rx2) this.f16342c[i3]).m8320b();
                            } else {
/* 33 */                        if (i6 != 5) {
/* 55 */                            C1697u2.m5439o(pz0.m7624c());
/* 58 */                            return 0;
                                }
/* 41 */                        ((Integer) this.f16342c[i3]).getClass();
/* 44 */                        iM5904d = C1808jw.m5903c(i5);
                            }
/* 48 */                    i2 = iM5904d + i2;
                        } else {
/* 110 */                   long jLongValue = ((Long) this.f16342c[i3]).longValue();
/* 114 */                   iM5908h = C1808jw.m5908h(i5);
/* 118 */                   iM5910j = C1808jw.m5910j(jLongValue);
                        }
/* 76 */                i2 = iM5910j + iM5908h + i2;
                    }
/* 126 */           this.f16343d = i2;
/* 128 */           return i2;
                }

                /* JADX INFO: renamed from: d */
                public final void m8321d(int i, Object obj) {
/* 3 */             if (!this.f16344e) {
/* 27 */                f42.m3660p();
/* 30 */                return;
                    }
/* 9 */             m8319a(this.f16340a + 1);
/* 12 */            int[] iArr = this.f16341b;
/* 14 */            int i2 = this.f16340a;
/* 16 */            iArr[i2] = i;
/* 20 */            this.f16342c[i2] = obj;
/* 24 */            this.f16340a = i2 + 1;
                }

                /* JADX INFO: renamed from: e */
                public final void m8322e(d52 d52Var) throws C1868kw {
/* 3 */             if (this.f16340a == 0) {
/* 103 */               return;
                    }
/* 6 */             d52Var.getClass();
/* 11 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 16 */            for (int i = 0; i < this.f16340a; i++) {
/* 20 */                int i2 = this.f16341b[i];
/* 24 */                Object obj = this.f16342c[i];
/* 26 */                int i3 = i2 >>> 3;
/* 28 */                int i4 = i2 & 7;
/* 30 */                if (i4 == 0) {
/* 97 */                    c1808jw.m5920t(i3, ((Long) obj).longValue());
                        } else if (i4 == 1) {
/* 87 */                    c1808jw.m5915o(i3, ((Long) obj).longValue());
                        } else if (i4 == 2) {
/* 77 */                    d52Var.m2935I(i3, (AbstractC2298vl) obj);
                        } else if (i4 == 3) {
/* 62 */                    c1808jw.m5918r(i3, 3);
/* 67 */                    ((rx2) obj).m8322e(d52Var);
/* 71 */                    c1808jw.m5918r(i3, 4);
                        } else {
/* 42 */                    if (i4 != 5) {
/* 58 */                        ds0.m3199p(pz0.m7624c());
/* 61 */                        return;
                            }
/* 50 */                    c1808jw.m5913m(i3, ((Integer) obj).intValue());
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof rx2)) {
/* 5 */                 return false;
                    }
/* 14 */            rx2 rx2Var = (rx2) obj;
/* 16 */            int i = this.f16340a;
/* 20 */            if (i == rx2Var.f16340a) {
/* 22 */                int[] iArr = this.f16341b;
/* 24 */                int[] iArr2 = rx2Var.f16341b;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.f16342c;
/* 41 */                Object[] objArr2 = rx2Var.f16342c;
/* 43 */                int i3 = this.f16340a;
/* 46 */                for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                    if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.f16340a;
/* 6 */             int i2 = (527 + i) * 31;
/* 8 */             int[] iArr = this.f16341b;
/* 10 */            int iHashCode = 17;
/* 13 */            int i3 = 17;
/* 15 */            for (int i4 = 0; i4 < i; i4++) {
/* 21 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 26 */            int i5 = (i2 + i3) * 31;
/* 28 */            Object[] objArr = this.f16342c;
/* 30 */            int i6 = this.f16340a;
/* 32 */            for (int i7 = 0; i7 < i6; i7++) {
/* 42 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 46 */            return i5 + iHashCode;
                }
            }
