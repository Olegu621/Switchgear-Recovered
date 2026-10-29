            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o62 implements d71 {

                /* JADX INFO: renamed from: a */
                public final String f14648a;

                /* JADX INFO: renamed from: b */
                public final n62 f14649b;

                /* JADX INFO: renamed from: c */
                public boolean f14650c;

                public o62(String str, n62 n62Var) {
/* 4 */             this.f14648a = str;
/* 6 */             this.f14649b = n62Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m7106a(v61 v61Var, x62 x62Var) {
/* 1 */             x62Var.getClass();
/* 4 */             v61Var.getClass();
/* 9 */             if (this.f14650c) {
/* 29 */                f42.m3656l("Already attached to lifecycleOwner");
/* 32 */                return;
                    }
/* 12 */            this.f14650c = true;
/* 14 */            v61Var.mo4483a(this);
/* 23 */            x62Var.m9724c(this.f14648a, this.f14649b.f14149e);
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 3 */             if (t61Var == t61.ON_DESTROY) {
/* 6 */                 this.f14650c = false;
/* 12 */                g71Var.getLifecycle().mo4484b(this);
                    }
                }
            }
