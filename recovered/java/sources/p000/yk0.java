            package p000;

            import com.supercell.p007id.FlutterSupport;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class yk0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19670a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ FlutterSupport f19671b;

                public /* synthetic */ yk0(FlutterSupport flutterSupport, int i) {
/* 1 */             this.f19670a = i;
/* 3 */             this.f19671b = flutterSupport;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19670a;
/* 3 */             FlutterSupport flutterSupport = this.f19671b;
                    switch (i) {
                        case 0:
/* 1 */                     flutterSupport.lambda$new$0();
                            break;
                        case 1:
/* 1 */                     flutterSupport.processMessageQueue();
                            break;
                        case 2:
/* 1 */                     flutterSupport.onFlutterInitialized();
                            break;
                        default:
/* 1 */                     flutterSupport.lambda$onActivityCreated$6();
                            break;
                    }
                }
            }
