            package p000;

            import android.window.OnBackInvokedCallback;
            import io.flutter.embedding.android.FlutterActivity;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: renamed from: oa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1994oa implements OnBackInvokedCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14688a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14689b;

                public /* synthetic */ C1994oa(Object obj, int i) {
/* 1 */             this.f14688a = i;
/* 3 */             this.f14689b = obj;
                }

                public final void onBackInvoked() {
/* 1 */             int i = this.f14688a;
/* 3 */             Object obj = this.f14689b;
                    switch (i) {
                        case 0:
/* 31 */                    ((LayoutInflaterFactory2C2324wa) obj).m9494D();
                            break;
                        case 1:
/* 25 */                    ((FlutterActivity) obj).onBackPressed();
                            break;
                        case 2:
/* 14 */                    Function0 function0 = (Function0) obj;
/* 16 */                    function0.getClass();
/* 19 */                    function0.invoke();
                            break;
                        default:
/* 10 */                    ((Runnable) obj).run();
                            break;
                    }
                }
            }
