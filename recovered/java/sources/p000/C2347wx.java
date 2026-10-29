            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            import android.window.OnBackInvokedDispatcher;
            import androidx.activity.ComponentActivity;
            
            /* JADX INFO: renamed from: wx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2347wx implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18849a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ComponentActivity f18850b;

                public /* synthetic */ C2347wx(ComponentActivity componentActivity, int i) {
/* 1 */             this.f18849a = i;
/* 3 */             this.f18850b = componentActivity;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */             int i = this.f18849a;
/* 3 */             ComponentActivity componentActivity = this.f18850b;
                    switch (i) {
                        case 0:
/* 55 */                    if (t61Var == t61.ON_STOP) {
/* 57 */                        Window window = componentActivity.getWindow();
/* 68 */                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
/* 69 */                        if (viewPeekDecorView != null) {
/* 71 */                            viewPeekDecorView.cancelPendingInputEvents();
                                }
                            }
                            break;
                        case 1:
/* 42 */                    componentActivity.ensureViewModelStore();
/* 49 */                    componentActivity.getLifecycle().mo4484b(this);
                            break;
                        default:
/* 10 */                    if (t61Var == t61.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
/* 1 */                         sp1 sp1Var = componentActivity.mOnBackPressedDispatcher;
/* 24 */                        OnBackInvokedDispatcher onBackInvokedDispatcherM10034a = AbstractC2477xx.m10034a((ComponentActivity) g71Var);
/* 28 */                        sp1Var.getClass();
/* 31 */                        onBackInvokedDispatcherM10034a.getClass();
/* 34 */                        sp1Var.f16742e = onBackInvokedDispatcherM10034a;
/* 38 */                        sp1Var.m8603c(sp1Var.f16744g);
                                break;
                            }
                            break;
                    }
                }
            }
