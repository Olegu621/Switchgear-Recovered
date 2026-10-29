            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            import androidx.fragment.app.Fragment;
            import java.util.LinkedHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rn0 implements pt0, z62, u33 {

                /* JADX INFO: renamed from: a */
                public final Fragment f16193a;

                /* JADX INFO: renamed from: b */
                public final t33 f16194b;

                /* JADX INFO: renamed from: c */
                public final RunnableC2166s2 f16195c;

                /* JADX INFO: renamed from: d */
                public i71 f16196d = null;

                /* JADX INFO: renamed from: e */
                public y62 f16197e = null;

                public rn0(Fragment fragment, t33 t33Var, RunnableC2166s2 runnableC2166s2) {
/* 9 */             this.f16193a = fragment;
/* 11 */            this.f16194b = t33Var;
/* 13 */            this.f16195c = runnableC2166s2;
                }

                /* JADX INFO: renamed from: a */
                public final void m8208a(t61 t61Var) {
/* 3 */             this.f16196d.m4487e(t61Var);
                }

                /* JADX INFO: renamed from: b */
                public final void m8209b() {
/* 3 */             if (this.f16196d == null) {
/* 10 */                this.f16196d = new i71(this);
/* 14 */                y62 y62Var = new y62(this);
/* 17 */                this.f16197e = y62Var;
/* 19 */                y62Var.m10113a();
/* 24 */                this.f16195c.run();
                    }
                }

                @Override // p000.pt0
                public final m20 getDefaultViewModelCreationExtras() {
                    Application application;
/* 1 */             Fragment fragment = this.f16193a;
/* 7 */             Context applicationContext = fragment.requireContext().getApplicationContext();
                    while (true) {
/* 13 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 29 */                    application = null;
                            break;
                        }
/* 17 */                if (applicationContext instanceof Application) {
/* 19 */                    application = (Application) applicationContext;
                            break;
                        }
/* 24 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 32 */            qk1 qk1Var = new qk1();
/* 35 */            LinkedHashMap linkedHashMap = qk1Var.f13548a;
/* 37 */            if (application != null) {
/* 41 */                linkedHashMap.put(dc0.f7097X, application);
                    }
/* 46 */            linkedHashMap.put(mn0.f13870e, fragment);
/* 51 */            linkedHashMap.put(mn0.f13871f, this);
/* 58 */            if (fragment.getArguments() != null) {
/* 66 */                linkedHashMap.put(mn0.f13872g, fragment.getArguments());
                    }
/* 69 */            return qk1Var;
                }

                @Override // p000.g71
                public final v61 getLifecycle() {
/* 1 */             m8209b();
/* 4 */             return this.f16196d;
                }

                @Override // p000.z62
                public final x62 getSavedStateRegistry() {
/* 1 */             m8209b();
/* 6 */             return this.f16197e.f19509b;
                }

                @Override // p000.u33
                public final t33 getViewModelStore() {
/* 1 */             m8209b();
/* 4 */             return this.f16194b;
                }
            }
