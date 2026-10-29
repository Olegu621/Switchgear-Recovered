            package p000;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gy2 extends ky2 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f8852b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ gy2(Unsafe unsafe, int i) {
/* 3 */             super(unsafe);
/* 1 */             this.f8852b = i;
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: c */
                public final boolean mo4043c(Object obj, long j) {
                    switch (this.f8852b) {
                        case 0:
/* 32 */                    if (my2.f14068g) {
/* 38 */                        if (my2.m6822h(obj, j) == 0) {
/* 30 */                            return false;
                                }
                            } else if (my2.m6823i(obj, j) == 0) {
/* 30 */                        return false;
                            }
/* 31 */                    return true;
                        default:
/* 10 */                    if (my2.f14068g) {
/* 16 */                        if (my2.m6822h(obj, j) == 0) {
/* 8 */                             return false;
                                }
                            } else if (my2.m6823i(obj, j) == 0) {
/* 8 */                         return false;
                            }
/* 9 */                     return true;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: d */
                public final byte mo4044d(Object obj, long j) {
                    switch (this.f8852b) {
                        case 0:
                            return my2.f14068g ? my2.m6822h(obj, j) : my2.m6823i(obj, j);
                        default:
                            return my2.f14068g ? my2.m6822h(obj, j) : my2.m6823i(obj, j);
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: e */
                public final double mo4045e(Object obj, long j) {
                    switch (this.f8852b) {
                        case 0:
                            break;
                    }
/* 10 */            return Double.longBitsToDouble(m6312h(obj, j));
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: f */
                public final float mo4046f(Object obj, long j) {
                    switch (this.f8852b) {
                        case 0:
                            break;
                    }
/* 10 */            return Float.intBitsToFloat(m6311g(obj, j));
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: k */
                public final void mo4047k(Object obj, long j, boolean z) {
                    switch (this.f8852b) {
                        case 0:
/* 22 */                    if (!my2.f14068g) {
/* 30 */                        my2.m6827m(obj, j, z ? (byte) 1 : (byte) 0);
                            } else {
/* 25 */                        my2.m6826l(obj, j, z ? (byte) 1 : (byte) 0);
                            }
                            break;
                        default:
/* 8 */                     if (!my2.f14068g) {
/* 16 */                        my2.m6827m(obj, j, z ? (byte) 1 : (byte) 0);
                            } else {
/* 11 */                        my2.m6826l(obj, j, z ? (byte) 1 : (byte) 0);
                            }
                            break;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: l */
                public final void mo4048l(Object obj, long j, byte b) {
                    switch (this.f8852b) {
                        case 0:
/* 20 */                    if (!my2.f14068g) {
/* 26 */                        my2.m6827m(obj, j, b);
                            } else {
/* 22 */                        my2.m6826l(obj, j, b);
                            }
                            break;
                        default:
/* 8 */                     if (!my2.f14068g) {
/* 14 */                        my2.m6827m(obj, j, b);
                            } else {
/* 10 */                        my2.m6826l(obj, j, b);
                            }
                            break;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: m */
                public final void mo4049m(Object obj, long j, double d) {
                    switch (this.f8852b) {
                        case 0:
/* 21 */                    m6316p(obj, j, Double.doubleToLongBits(d));
                            break;
                        default:
/* 10 */                    m6316p(obj, j, Double.doubleToLongBits(d));
                            break;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: n */
                public final void mo4050n(Object obj, long j, float f) {
                    switch (this.f8852b) {
                        case 0:
/* 18 */                    m6315o(obj, Float.floatToIntBits(f), j);
                            break;
                        default:
/* 10 */                    m6315o(obj, Float.floatToIntBits(f), j);
                            break;
                    }
                }

                @Override // p000.ky2
                /* JADX INFO: renamed from: s */
                public final boolean mo4051s() {
                    switch (this.f8852b) {
                    }
/* 6 */             return false;
                }
            }
