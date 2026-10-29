            package p000;

            import android.window.BackEvent;
            import android.window.OnBackAnimationCallback;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class op1 implements OnBackAnimationCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Function1 f14857a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function1 f14858b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f14859c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f14860d;

                public op1(Function1 function1, Function1 function2, Function0 function0, Function0 function3) {
/* 4 */             this.f14857a = function1;
/* 6 */             this.f14858b = function2;
/* 8 */             this.f14859c = function0;
/* 10 */            this.f14860d = function3;
                }

                public final void onBackCancelled() {
/* 3 */             this.f14860d.invoke();
                }

                public final void onBackInvoked() {
/* 3 */             this.f14859c.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
/* 1 */             backEvent.getClass();
/* 11 */            this.f14858b.invoke(new C0917fh(backEvent));
                }

                public final void onBackStarted(BackEvent backEvent) {
/* 1 */             backEvent.getClass();
/* 11 */            this.f14857a.invoke(new C0917fh(backEvent));
                }
            }
