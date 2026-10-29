            package p000;

            import android.os.Bundle;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y62 {

                /* JADX INFO: renamed from: a */
                public final z62 f19508a;

                /* JADX INFO: renamed from: b */
                public final x62 f19509b = new x62();

                /* JADX INFO: renamed from: c */
                public boolean f19510c;

                public y62(z62 z62Var) {
/* 4 */             this.f19508a = z62Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m10113a() {
/* 1 */             z62 z62Var = this.f19508a;
/* 3 */             v61 lifecycle = z62Var.getLifecycle();
/* 14 */            if (((i71) lifecycle).f9483c != u61.f17375b) {
/* 56 */                f42.m3656l("Restarter must be created only during owner's initialization stage");
/* 59 */                return;
                    }
/* 22 */            lifecycle.mo4483a(new e12(z62Var, 0));
/* 25 */            final x62 x62Var = this.f19509b;
/* 27 */            x62Var.getClass();
/* 32 */            if (x62Var.f18974b) {
/* 50 */                f42.m3656l("SavedStateRegistry was already attached.");
/* 53 */                return;
                    }
/* 39 */            lifecycle.mo4483a(new d71() { // from class: u62
                        @Override // p000.d71
                        public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */                     x62 x62Var2 = x62Var;
/* 3 */                     x62Var2.getClass();
/* 8 */                     if (t61Var == t61.ON_START) {
/* 11 */                        x62Var2.f18978f = true;
                            } else if (t61Var == t61.ON_STOP) {
/* 19 */                        x62Var2.f18978f = false;
                            }
                        }
                    });
/* 43 */            x62Var.f18974b = true;
/* 45 */            this.f19510c = true;
                }

                /* JADX INFO: renamed from: b */
                public final void m10114b(Bundle bundle) {
/* 3 */             if (!this.f19510c) {
/* 5 */                 m10113a();
                    }
/* 10 */            v61 lifecycle = this.f19508a.getLifecycle();
/* 25 */            if (((i71) lifecycle).f9483c.compareTo(u61.f17377d) >= 0) {
/* 92 */                throw new IllegalStateException(("performRestore cannot be called when owner is " + ((i71) lifecycle).f9483c).toString());
                    }
/* 27 */            x62 x62Var = this.f19509b;
/* 31 */            if (!x62Var.f18974b) {
/* 61 */                f42.m3656l("You must call performAttach() before calling performRestore(Bundle).");
                    } else if (x62Var.f18976d) {
/* 55 */                f42.m3656l("SavedStateRegistry was already restored.");
                    } else {
/* 47 */                x62Var.f18975c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
/* 50 */                x62Var.f18976d = true;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m10115c(Bundle bundle) {
/* 1 */             bundle.getClass();
/* 4 */             x62 x62Var = this.f19509b;
/* 6 */             x62Var.getClass();
/* 11 */            Bundle bundle2 = new Bundle();
/* 14 */            Bundle bundle3 = x62Var.f18975c;
/* 16 */            if (bundle3 != null) {
/* 18 */                bundle2.putAll(bundle3);
                    }
/* 21 */            e62 e62Var = x62Var.f18973a;
/* 23 */            e62Var.getClass();
/* 28 */            c62 c62Var = new c62(e62Var);
/* 35 */            e62Var.f7558c.put(c62Var, Boolean.FALSE);
/* 42 */            while (c62Var.hasNext()) {
/* 48 */                Map.Entry entry = (Map.Entry) c62Var.next();
/* 66 */                bundle2.putBundle((String) entry.getKey(), ((w62) entry.getValue()).mo671a());
                    }
/* 74 */            if (bundle2.isEmpty()) {
/* 81 */                return;
                    }
/* 78 */            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
                }
            }
