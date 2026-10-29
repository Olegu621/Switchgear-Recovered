            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o80 implements Executor {

                /* JADX INFO: renamed from: b */
                public static volatile o80 f14669b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ o80 f14670c = new o80(1);

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ o80 f14671d = new o80(2);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14672a;

                public /* synthetic */ o80(int i) {
/* 1 */             this.f14672a = i;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    switch (this.f14672a) {
                        case 0:
/* 23 */                    runnable.run();
                            break;
                        case 1:
/* 19 */                    runnable.run();
                            break;
                        case 2:
/* 15 */                    runnable.run();
                            break;
                        default:
/* 11 */                    new Thread(runnable).start();
                            break;
                    }
                }
            }
