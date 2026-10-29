            package p000;

            import android.view.animation.Interpolator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yj1 implements Interpolator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19657a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2131r4 f19658b;

                public /* synthetic */ yj1(C2131r4 c2131r4, int i) {
/* 1 */             this.f19657a = i;
/* 3 */             this.f19658b = c2131r4;
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    double dMo288a;
                    switch (this.f19657a) {
                        case 0:
/* 26 */                    dMo288a = this.f19658b.mo288a(f);
                            break;
                        case 1:
/* 18 */                    dMo288a = this.f19658b.mo288a(f);
                            break;
                        default:
/* 9 */                     dMo288a = this.f19658b.mo288a(f);
                            break;
                    }
/* 13 */            return (float) dMo288a;
                }
            }
