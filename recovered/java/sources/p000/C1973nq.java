            package p000;

            import android.app.Activity;
            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            
            /* JADX INFO: renamed from: nq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1973nq implements c00 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14404a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14405b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f14406c;

                public /* synthetic */ C1973nq(int i, Object obj, Object obj2) {
/* 1 */             this.f14404a = i;
/* 3 */             this.f14405b = obj;
/* 5 */             this.f14406c = obj2;
                }

                @Override // p000.c00
                public final void accept(Object obj) {
/* 1 */             int i = this.f14404a;
/* 4 */             Object obj2 = this.f14406c;
/* 6 */             Object obj3 = this.f14405b;
                    switch (i) {
                        case 0:
/* 105 */                   ((Surface) obj3).release();
/* 108 */                   ((SurfaceTexture) obj2).release();
                            break;
                        case 1:
/* 64 */                    x60 x60Var = (x60) obj3;
/* 66 */                    mj2 mj2Var = (mj2) obj2;
/* 70 */                    mj2Var.close();
/* 79 */                    Surface surface = (Surface) x60Var.f18969h.remove(mj2Var);
/* 81 */                    if (surface != null) {
/* 83 */                        jq1 jq1Var = x60Var.f18962a;
/* 87 */                        sp0.m8593d(jq1Var.f12424a, true);
/* 92 */                        sp0.m8592c(jq1Var.f12426c);
/* 95 */                        jq1Var.m5889i(surface, true);
                            }
                            break;
                        case 2:
/* 29 */                    cb0 cb0Var = (cb0) obj3;
/* 31 */                    mj2 mj2Var2 = (mj2) obj2;
/* 35 */                    mj2Var2.close();
/* 44 */                    Surface surface2 = (Surface) cb0Var.f2813h.remove(mj2Var2);
/* 46 */                    if (surface2 != null) {
/* 48 */                        ab0 ab0Var = cb0Var.f2806a;
/* 52 */                        sp0.m8593d(ab0Var.f12424a, true);
/* 57 */                        sp0.m8592c(ab0Var.f12426c);
/* 60 */                        ab0Var.m5889i(surface2, true);
                            }
                            break;
                        default:
/* 11 */                    fe2 fe2Var = (fe2) obj3;
/* 13 */                    Activity activity = (Activity) obj2;
/* 17 */                    ac1 ac1Var = fe2Var.f8182e;
/* 19 */                    if (ac1Var != null) {
/* 25 */                        ac1Var.m167I(activity, fe2Var.m3753a(activity));
                            }
                            break;
                    }
                }
            }
