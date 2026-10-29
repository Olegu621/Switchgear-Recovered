            package p000;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rq3 extends sq3 {
                @Override // p000.sq3
                /* JADX INFO: renamed from: o */
                public final void mo7995o(Object obj, long j, byte b) {
/* 3 */             if (tq3.f17236g) {
/* 5 */                 tq3.m8865c(obj, j, b);
                    } else {
/* 9 */                 tq3.m8866d(obj, j, b);
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: q */
                public final boolean mo7996q(Object obj, long j) {
                    return tq3.f17236g ? tq3.m8876n(obj, j) : tq3.m8877o(obj, j);
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: s */
                public final void mo7997s(Object obj, long j, boolean z) {
/* 3 */             if (tq3.f17236g) {
/* 5 */                 tq3.m8865c(obj, j, z ? (byte) 1 : (byte) 0);
                    } else {
/* 9 */                 tq3.m8866d(obj, j, z ? (byte) 1 : (byte) 0);
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: u */
                public final float mo7998u(Object obj, long j) {
/* 9 */             return Float.intBitsToFloat(((Unsafe) this.f16749a).getInt(obj, j));
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: w */
                public final void mo7999w(Object obj, long j, float f) {
/* 9 */             ((Unsafe) this.f16749a).putInt(obj, j, Float.floatToIntBits(f));
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: x */
                public final double mo8000x(Object obj, long j) {
/* 9 */             return Double.longBitsToDouble(((Unsafe) this.f16749a).getLong(obj, j));
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: z */
                public final void mo8001z(Object obj, long j, double d) {
/* 9 */             ((Unsafe) this.f16749a).putLong(obj, j, Double.doubleToLongBits(d));
                }
            }
