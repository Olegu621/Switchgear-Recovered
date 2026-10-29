            package p000;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hy2 extends ly2 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f9364b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ hy2(Unsafe unsafe, int i) {
/* 3 */             super(unsafe);
/* 1 */             this.f9364b = i;
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: c */
                public final boolean mo4394c(Object obj, long j) {
                    switch (this.f9364b) {
                        case 0:
                            return ny2.f14572g ? ny2.m7070b(obj, j) : ny2.m7071c(obj, j);
                        default:
                            return ny2.f14572g ? ny2.m7070b(obj, j) : ny2.m7071c(obj, j);
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: d */
                public final double mo4395d(Object obj, long j) {
                    switch (this.f9364b) {
                        case 0:
                            break;
                    }
/* 10 */            return Double.longBitsToDouble(m6579g(obj, j));
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: e */
                public final float mo4396e(Object obj, long j) {
                    switch (this.f9364b) {
                        case 0:
                            break;
                    }
/* 10 */            return Float.intBitsToFloat(m6578f(obj, j));
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: j */
                public final void mo4397j(Object obj, long j, boolean z) {
                    switch (this.f9364b) {
                        case 0:
/* 22 */                    if (!ny2.f14572g) {
/* 30 */                        ny2.m7080l(obj, j, z ? (byte) 1 : (byte) 0);
                            } else {
/* 25 */                        ny2.m7079k(obj, j, z ? (byte) 1 : (byte) 0);
                            }
                            break;
                        default:
/* 8 */                     if (!ny2.f14572g) {
/* 16 */                        ny2.m7080l(obj, j, z ? (byte) 1 : (byte) 0);
                            } else {
/* 11 */                        ny2.m7079k(obj, j, z ? (byte) 1 : (byte) 0);
                            }
                            break;
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: k */
                public final void mo4398k(Object obj, long j, byte b) {
                    switch (this.f9364b) {
                        case 0:
/* 20 */                    if (!ny2.f14572g) {
/* 26 */                        ny2.m7080l(obj, j, b);
                            } else {
/* 22 */                        ny2.m7079k(obj, j, b);
                            }
                            break;
                        default:
/* 8 */                     if (!ny2.f14572g) {
/* 14 */                        ny2.m7080l(obj, j, b);
                            } else {
/* 10 */                        ny2.m7079k(obj, j, b);
                            }
                            break;
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: l */
                public final void mo4399l(Object obj, long j, double d) {
                    switch (this.f9364b) {
                        case 0:
/* 21 */                    m6583o(obj, j, Double.doubleToLongBits(d));
                            break;
                        default:
/* 10 */                    m6583o(obj, j, Double.doubleToLongBits(d));
                            break;
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: m */
                public final void mo4400m(Object obj, long j, float f) {
                    switch (this.f9364b) {
                        case 0:
/* 18 */                    m6582n(obj, Float.floatToIntBits(f), j);
                            break;
                        default:
/* 10 */                    m6582n(obj, Float.floatToIntBits(f), j);
                            break;
                    }
                }

                @Override // p000.ly2
                /* JADX INFO: renamed from: r */
                public final boolean mo4401r() {
                    switch (this.f9364b) {
                    }
/* 6 */             return false;
                }
            }
