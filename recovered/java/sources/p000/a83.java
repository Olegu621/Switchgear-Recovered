            package p000;

            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public class a83 extends c83 {

                /* JADX INFO: renamed from: a */
                public final WindowInsets.Builder f120a;

                public a83(m83 m83Var) {
/* 1 */             super(m83Var);
/* 4 */             WindowInsets windowInsetsM6626g = m83Var.m6626g();
/* 19 */            this.f120a = windowInsetsM6626g != null ? dt1.m3222h(windowInsetsM6626g) : dt1.m3221g();
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: b */
                public m83 mo106b() {
/* 1 */             m1545a();
/* 11 */            m83 m83VarM6620h = m83.m6620h(this.f120a.build(), null);
/* 17 */            m83VarM6620h.f13660a.mo2974o(null);
/* 20 */            return m83VarM6620h;
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: c */
                public void mo107c(ly0 ly0Var) {
/* 1 */             this.f120a.setStableInsets(ly0Var.m6575c());
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: d */
                public void mo108d(ly0 ly0Var) {
/* 1 */             this.f120a.setSystemWindowInsets(ly0Var.m6575c());
                }

/* 21 */        public a83() {
/* 23 */            this.f120a = dt1.m3221g();
                }
            }
