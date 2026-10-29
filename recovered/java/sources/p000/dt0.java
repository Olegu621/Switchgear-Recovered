            package p000;

            import com.helpshift.activities.HSDebugActivity;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dt0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7404a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0168b5 f7405b;

                public /* synthetic */ dt0(C0168b5 c0168b5, int i) {
/* 1 */             this.f7404a = i;
/* 3 */             this.f7405b = c0168b5;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7404a;
/* 3 */             C0168b5 c0168b5 = this.f7405b;
                    switch (i) {
                        case 0:
/* 24 */                    xs0 xs0Var = (xs0) ((WeakReference) c0168b5.f2214e).get();
/* 26 */                    if (xs0Var != null) {
/* 28 */                        xs0Var.m10023i();
                            }
                            break;
                        default:
/* 12 */                    C0168b5.m1243f(c0168b5, "Helpshift Debugger", HSDebugActivity.class);
                            break;
                    }
                }
            }
