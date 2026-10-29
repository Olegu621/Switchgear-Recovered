            package p000;

            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class e83 extends d83 {

                /* JADX INFO: renamed from: m */
                public ly0 f7576m;

                public e83(m83 m83Var, WindowInsets windowInsets) {
/* 1 */             super(m83Var, windowInsets);
/* 5 */             this.f7576m = null;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: b */
                public m83 mo3339b() {
/* 8 */             return m83.m6620h(this.f7059c.consumeStableInsets(), null);
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: c */
                public m83 mo3340c() {
/* 8 */             return m83.m6620h(this.f7059c.consumeSystemWindowInsets(), null);
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: h */
                public final ly0 mo3341h() {
/* 3 */             if (this.f7576m == null) {
/* 5 */                 WindowInsets windowInsets = this.f7059c;
/* 27 */                this.f7576m = ly0.m6573a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                    }
/* 29 */            return this.f7576m;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: m */
                public boolean mo3342m() {
/* 3 */             return this.f7059c.isConsumed();
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: q */
                public void mo3343q(ly0 ly0Var) {
/* 1 */             this.f7576m = ly0Var;
                }
            }
