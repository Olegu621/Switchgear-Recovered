            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ch2 extends ak1 {

                /* JADX INFO: renamed from: a */
                public final dh2 f2925a;

                /* JADX INFO: renamed from: b */
                public cg2 f2926b;

                /* JADX INFO: renamed from: c */
                public bh2 f2927c;

                public ch2() {
/* 6 */             dh2 dh2Var = new dh2();
/* 10 */            dh2Var.f7207k = false;
/* 12 */            this.f2925a = dh2Var;
/* 14 */            this.f2927c = dh2Var;
                }

                @Override // p000.ak1
                /* JADX INFO: renamed from: a */
                public final float mo299a() {
/* 3 */             return this.f2927c.mo1358b();
                }

                /* JADX INFO: renamed from: b */
                public final void m1654b(float f, float f2, float f3, float f4, float f5, float f6) {
/* 2 */             dh2 dh2Var = this.f2925a;
/* 4 */             this.f2927c = dh2Var;
/* 6 */             dh2Var.f7208l = f;
/* 14 */            boolean z = f > f2;
/* 15 */            dh2Var.f7207k = z;
/* 17 */            if (z) {
/* 26 */                dh2Var.m3085d(-f3, f - f2, f5, f6, f4);
                    } else {
/* 36 */                dh2Var.m3085d(f3, f2 - f, f5, f6, f4);
                    }
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
/* 3 */             return this.f2927c.getInterpolation(f);
                }
            }
