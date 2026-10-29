            package p000;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mq3 {

                /* JADX INFO: renamed from: f */
                public static final mq3 f13977f = new mq3(0, new int[0], new Object[0], false);

                /* JADX INFO: renamed from: a */
                public int f13978a;

                /* JADX INFO: renamed from: b */
                public int[] f13979b;

                /* JADX INFO: renamed from: c */
                public Object[] f13980c;

                /* JADX INFO: renamed from: d */
                public int f13981d = -1;

                /* JADX INFO: renamed from: e */
                public boolean f13982e;

                public mq3(int i, int[] iArr, Object[] objArr, boolean z) {
/* 7 */             this.f13978a = i;
/* 9 */             this.f13979b = iArr;
/* 11 */            this.f13980c = objArr;
/* 13 */            this.f13982e = z;
                }

                /* JADX INFO: renamed from: a */
                public static mq3 m6789a() {
/* 11 */            return new mq3(0, new int[8], new Object[8], true);
                }

                /* JADX INFO: renamed from: b */
                public final void m6790b(pi3 pi3Var) throws C1868kw {
/* 3 */             if (this.f13978a != 0) {
/* 8 */                 for (int i = 0; i < this.f13978a; i++) {
/* 12 */                    int i2 = this.f13979b[i];
/* 16 */                    Object obj = this.f13980c[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 111 */                       ((kn3) pi3Var.f15137a).m6160e(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 97 */                        ((kn3) pi3Var.f15137a).m6161f(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 83 */                        pi3Var.m7458e(i4, (cn3) obj);
                            } else if (i3 == 3) {
/* 64 */                        ((kn3) pi3Var.f15137a).m6157b(i4, 3);
/* 69 */                        ((mq3) obj).m6790b(pi3Var);
/* 77 */                        ((kn3) pi3Var.f15137a).m6157b(i4, 4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 56 */                            ds0.m3199p(new to3("Protocol message tag had invalid wire type."));
/* 59 */                            return;
                                }
/* 45 */                        ((kn3) pi3Var.f15137a).m6159d(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m6791c() {
/* 1 */             int i = this.f13981d;
/* 4 */             if (i != -1) {
/* 155 */               return i;
                    }
/* 8 */             int iM7494q = 0;
/* 11 */            for (int i2 = 0; i2 < this.f13978a; i2++) {
/* 15 */                int i3 = this.f13979b[i2];
/* 17 */                int i4 = i3 >>> 3;
/* 19 */                int i5 = i3 & 7;
/* 21 */                if (i5 == 0) {
/* 144 */                   iM7494q = pm2.m7494q(i4 << 3, kn3.m6155q(((Long) this.f13980c[i2]).longValue()), iM7494q);
                        } else if (i5 == 1) {
/* 116 */                   ((Long) this.f13980c[i2]).getClass();
/* 123 */                   iM7494q = pm2.m7494q(i4 << 3, 8, iM7494q);
                        } else if (i5 == 2) {
/* 90 */                    cn3 cn3Var = (cn3) this.f13980c[i2];
/* 94 */                    Logger logger = kn3.f12895e;
/* 96 */                    int iMo320c = cn3Var.mo320c();
/* 105 */                   iM7494q = pm2.m7494q(i4 << 3, kn3.m6154p(iMo320c) + iMo320c, iM7494q);
                        } else if (i5 == 3) {
/* 63 */                    int i6 = i4 << 3;
/* 65 */                    Logger logger2 = kn3.f12895e;
/* 73 */                    int iM6791c = ((mq3) this.f13980c[i2]).m6791c();
/* 77 */                    int iM6154p = kn3.m6154p(i6);
/* 83 */                    iM7494q = iM6154p + iM6154p + iM6791c + iM7494q;
                        } else {
/* 33 */                    if (i5 != 5) {
/* 59 */                        C1697u2.m5439o(new to3("Protocol message tag had invalid wire type."));
/* 6 */                         return 0;
                            }
/* 41 */                    ((Integer) this.f13980c[i2]).getClass();
/* 47 */                    iM7494q = pm2.m7494q(i4 << 3, 4, iM7494q);
                        }
                    }
/* 152 */           this.f13981d = iM7494q;
/* 154 */           return iM7494q;
                }

                /* JADX INFO: renamed from: d */
                public final void m6792d(int i, Object obj) {
/* 3 */             if (!this.f13982e) {
/* 27 */                f42.m3660p();
/* 30 */                return;
                    }
/* 9 */             m6793e(this.f13978a + 1);
/* 12 */            int[] iArr = this.f13979b;
/* 14 */            int i2 = this.f13978a;
/* 16 */            iArr[i2] = i;
/* 20 */            this.f13980c[i2] = obj;
/* 24 */            this.f13978a = i2 + 1;
                }

                /* JADX INFO: renamed from: e */
                public final void m6793e(int i) {
/* 1 */             int[] iArr = this.f13979b;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.f13978a;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 13 */                    i = i3;
                        }
/* 16 */                if (i < 8) {
/* 18 */                    i = 8;
                        }
/* 23 */                this.f13979b = Arrays.copyOf(iArr, i);
/* 31 */                this.f13980c = Arrays.copyOf(this.f13980c, i);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 60 */                return true;
                    }
/* 5 */             if (obj != null && (obj instanceof mq3)) {
/* 13 */                mq3 mq3Var = (mq3) obj;
/* 15 */                int i = this.f13978a;
/* 19 */                if (i == mq3Var.f13978a) {
/* 21 */                    int[] iArr = this.f13979b;
/* 23 */                    int[] iArr2 = mq3Var.f13979b;
/* 26 */                    for (int i2 = 0; i2 < i; i2++) {
/* 32 */                        if (iArr[i2] == iArr2[i2]) {
                                }
                            }
/* 38 */                    Object[] objArr = this.f13980c;
/* 40 */                    Object[] objArr2 = mq3Var.f13980c;
/* 42 */                    int i3 = this.f13978a;
/* 45 */                    for (int i4 = 0; i4 < i3; i4++) {
/* 55 */                        if (objArr[i4].equals(objArr2[i4])) {
                                }
                            }
/* 60 */                    return true;
                        }
                    }
/* 4 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.f13978a;
/* 3 */             int i2 = i + 527;
/* 5 */             int[] iArr = this.f13979b;
/* 8 */             int iHashCode = 17;
/* 11 */            int i3 = 17;
/* 12 */            for (int i4 = 0; i4 < i; i4++) {
/* 18 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 24 */            int i5 = (i2 * 31) + i3;
/* 25 */            Object[] objArr = this.f13980c;
/* 27 */            int i6 = this.f13978a;
/* 29 */            for (int i7 = 0; i7 < i6; i7++) {
/* 39 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return (i5 * 31) + iHashCode;
                }
            }
