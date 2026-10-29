            package p000;

            import android.view.ViewGroup;
            
            /* JADX INFO: renamed from: ja */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1786ja implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12159a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LayoutInflaterFactory2C2324wa f12160b;

                public /* synthetic */ RunnableC1786ja(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa, int i) {
/* 1 */             this.f12159a = i;
/* 3 */             this.f12160b = layoutInflaterFactory2C2324wa;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup;
/* 1 */             int i = this.f12159a;
/* 3 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f12160b;
                    switch (i) {
                        case 0:
/* 82 */                    if ((layoutInflaterFactory2C2324wa.f18501K0 & 1) != 0) {
/* 84 */                        layoutInflaterFactory2C2324wa.m9506v(0);
                            }
/* 91 */                    if ((layoutInflaterFactory2C2324wa.f18501K0 & 4096) != 0) {
/* 95 */                        layoutInflaterFactory2C2324wa.m9506v(108);
                            }
/* 98 */                    layoutInflaterFactory2C2324wa.f18500J0 = false;
/* 100 */                   layoutInflaterFactory2C2324wa.f18501K0 = 0;
                            break;
                        default:
/* 15 */                    layoutInflaterFactory2C2324wa.f18522h0.showAtLocation(layoutInflaterFactory2C2324wa.f18521g0, 55, 0, 0);
/* 18 */                    p43 p43Var = layoutInflaterFactory2C2324wa.f18524j0;
/* 20 */                    if (p43Var != null) {
/* 22 */                        p43Var.m7336b();
                            }
/* 29 */                    if (layoutInflaterFactory2C2324wa.f18525k0 && (viewGroup = layoutInflaterFactory2C2324wa.f18526l0) != null && viewGroup.isLaidOut()) {
/* 44 */                        layoutInflaterFactory2C2324wa.f18521g0.setAlpha(0.0f);
/* 49 */                        p43 p43VarM3305a = e33.m3305a(layoutInflaterFactory2C2324wa.f18521g0);
/* 53 */                        p43VarM3305a.m7335a(1.0f);
/* 56 */                        layoutInflaterFactory2C2324wa.f18524j0 = p43VarM3305a;
/* 63 */                        p43VarM3305a.m7338d(new C1883la(this, 0));
                            } else {
/* 69 */                        layoutInflaterFactory2C2324wa.f18521g0.setAlpha(1.0f);
/* 74 */                        layoutInflaterFactory2C2324wa.f18521g0.setVisibility(0);
                            }
                            break;
                    }
                }
            }
