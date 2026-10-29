            package p000;

            import android.graphics.Typeface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bn2 extends de3 {

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ kb1 f2550h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ dn2 f2551i;

                public bn2(dn2 dn2Var, kb1 kb1Var) {
/* 4 */             this.f2551i = dn2Var;
/* 6 */             this.f2550h = kb1Var;
                }

                @Override // p000.de3
                /* JADX INFO: renamed from: A */
                public final void mo1400A(int i) {
/* 4 */             this.f2551i.f7349m = true;
/* 8 */             this.f2550h.mo1411M(i);
                }

                @Override // p000.de3
                /* JADX INFO: renamed from: B */
                public final void mo1401B(Typeface typeface) {
/* 1 */             dn2 dn2Var = this.f2551i;
/* 5 */             Typeface typefaceCreate = Typeface.create(typeface, dn2Var.f7339c);
/* 9 */             dn2Var.f7350n = typefaceCreate;
/* 12 */            dn2Var.f7349m = true;
/* 17 */            this.f2550h.mo1412N(typefaceCreate, false);
                }
            }
