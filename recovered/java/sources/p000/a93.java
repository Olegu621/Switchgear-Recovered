            package p000;

            import android.os.Binder;
            import android.os.Process;
            import com.google.firebase.messaging.EnhancedIntentService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a93 extends Binder {

                /* JADX INFO: renamed from: a */
                public final gr0 f134a;

                public a93(gr0 gr0Var) {
/* 4 */             this.f134a = gr0Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m125a(b93 b93Var) {
/* 9 */             if (Binder.getCallingUid() != Process.myUid()) {
/* 46 */                throw new SecurityException("Binding only allowed within app");
                    }
/* 35 */            ((EnhancedIntentService) this.f134a.f8789a).m2525b(b93Var.f2331a).addOnCompleteListener(new qd1(), new C2357x6(b93Var, 20));
                }
            }
