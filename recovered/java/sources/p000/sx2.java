            package p000;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sx2 {

                /* JADX INFO: renamed from: f */
                public static final sx2 f16858f = new sx2(0, new int[0], new Object[0], false);

                /* JADX INFO: renamed from: a */
                public int f16859a;

                /* JADX INFO: renamed from: b */
                public int[] f16860b;

                /* JADX INFO: renamed from: c */
                public Object[] f16861c;

                /* JADX INFO: renamed from: d */
                public int f16862d = -1;

                /* JADX INFO: renamed from: e */
                public boolean f16863e;

                public sx2(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.f16859a = i;
/* 9 */             this.f16860b = iArr;
/* 11 */            this.f16861c = objArr;
/* 13 */            this.f16863e = z;
                }

                /* JADX INFO: renamed from: a */
                public final void m8657a(int i) {
/* 1 */             int[] iArr = this.f16860b;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.f16859a;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 14 */                    i = i3;
                        }
/* 17 */                if (i < 8) {
/* 19 */                    i = 8;
                        }
/* 24 */                this.f16860b = Arrays.copyOf(iArr, i);
/* 32 */                this.f16861c = Arrays.copyOf(this.f16861c, i);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int m8658b() {
                    int iM6541h;
                    int iM6543j;
                    int iM6541h2;
/* 1 */             int i = this.f16862d;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int i2 = 0;
/* 11 */            for (int i3 = 0; i3 < this.f16859a; i3++) {
/* 15 */                int i4 = this.f16860b[i3];
/* 17 */                int i5 = i4 >>> 3;
/* 19 */                int i6 = i4 & 7;
/* 21 */                if (i6 != 0) {
/* 24 */                    if (i6 == 1) {
/* 98 */                        ((Long) this.f16861c[i3]).getClass();
/* 105 */                       iM6541h2 = C1905lw.m6541h(i5) + 8;
                            } else if (i6 == 2) {
/* 87 */                        iM6541h2 = C1905lw.m6539f(i5, (C2259ul) this.f16861c[i3]);
                            } else if (i6 == 3) {
/* 66 */                        iM6541h = C1905lw.m6541h(i5) * 2;
/* 73 */                        iM6543j = ((sx2) this.f16861c[i3]).m8658b();
                            } else {
/* 33 */                        if (i6 != 5) {
/* 57 */                            C1697u2.m5439o(qz0.m8030b());
/* 60 */                            return 0;
                                }
/* 41 */                        ((Integer) this.f16861c[i3]).getClass();
/* 48 */                        iM6541h2 = C1905lw.m6541h(i5) + 4;
                            }
/* 50 */                    i2 = iM6541h2 + i2;
                        } else {
/* 114 */                   long jLongValue = ((Long) this.f16861c[i3]).longValue();
/* 118 */                   iM6541h = C1905lw.m6541h(i5);
/* 122 */                   iM6543j = C1905lw.m6543j(jLongValue);
                        }
/* 78 */                i2 = iM6543j + iM6541h + i2;
                    }
/* 130 */           this.f16862d = i2;
/* 132 */           return i2;
                }

                /* JADX INFO: renamed from: c */
                public final void m8659c(int i, Object obj) {
/* 3 */             if (!this.f16863e) {
/* 27 */                f42.m3660p();
/* 30 */                return;
                    }
/* 9 */             m8657a(this.f16859a + 1);
/* 12 */            int[] iArr = this.f16860b;
/* 14 */            int i2 = this.f16859a;
/* 16 */            iArr[i2] = i;
/* 20 */            this.f16861c[i2] = obj;
/* 24 */            this.f16859a = i2 + 1;
                }

                /* JADX INFO: renamed from: d */
                public final void m8660d(gr0 gr0Var) {
/* 3 */             if (this.f16859a == 0) {
/* 103 */               return;
                    }
/* 6 */             gr0Var.getClass();
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 16 */            for (int i = 0; i < this.f16859a; i++) {
/* 20 */                int i2 = this.f16860b[i];
/* 24 */                Object obj = this.f16861c[i];
/* 26 */                int i3 = i2 >>> 3;
/* 28 */                int i4 = i2 & 7;
/* 30 */                if (i4 == 0) {
/* 97 */                    c1905lw.m6548E(i3, ((Long) obj).longValue());
                        } else if (i4 == 1) {
/* 87 */                    c1905lw.m6564t(i3, ((Long) obj).longValue());
                        } else if (i4 == 2) {
/* 77 */                    c1905lw.m6560p(i3, (C2259ul) obj);
                        } else if (i4 == 3) {
/* 62 */                    c1905lw.m6545B(i3, 3);
/* 67 */                    ((sx2) obj).m8660d(gr0Var);
/* 71 */                    c1905lw.m6545B(i3, 4);
                        } else {
/* 42 */                    if (i4 != 5) {
/* 58 */                        ds0.m3199p(qz0.m8030b());
/* 61 */                        return;
                            }
/* 50 */                    c1905lw.m6562r(i3, ((Integer) obj).intValue());
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof sx2)) {
/* 5 */                 return false;
                    }
/* 14 */            sx2 sx2Var = (sx2) obj;
/* 16 */            int i = this.f16859a;
/* 20 */            if (i == sx2Var.f16859a) {
/* 22 */                int[] iArr = this.f16860b;
/* 24 */                int[] iArr2 = sx2Var.f16860b;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    if (iArr[i2] == iArr2[i2]) {
                            }
                        }
/* 39 */                Object[] objArr = this.f16861c;
/* 41 */                Object[] objArr2 = sx2Var.f16861c;
/* 43 */                int i3 = this.f16859a;
/* 46 */                for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                    if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.f16859a;
/* 6 */             int i2 = (527 + i) * 31;
/* 8 */             int[] iArr = this.f16860b;
/* 10 */            int iHashCode = 17;
/* 13 */            int i3 = 17;
/* 15 */            for (int i4 = 0; i4 < i; i4++) {
/* 21 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 26 */            int i5 = (i2 + i3) * 31;
/* 28 */            Object[] objArr = this.f16861c;
/* 30 */            int i6 = this.f16859a;
/* 32 */            for (int i7 = 0; i7 < i6; i7++) {
/* 42 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 46 */            return i5 + iHashCode;
                }
            }
