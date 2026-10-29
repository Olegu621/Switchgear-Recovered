            package io.flutter.embedding.engine.dart;
            
            /* JADX INFO: renamed from: io.flutter.embedding.engine.dart.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1060b implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9745a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DartMessenger.SerialTaskQueue f9746b;

                public /* synthetic */ RunnableC1060b(DartMessenger.SerialTaskQueue serialTaskQueue, int i) {
/* 1 */             this.f9745a = i;
/* 3 */             this.f9746b = serialTaskQueue;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9745a;
/* 3 */             DartMessenger.SerialTaskQueue serialTaskQueue = this.f9746b;
                    switch (i) {
                        case 0:
/* 1 */                     serialTaskQueue.lambda$dispatch$0();
                            break;
                        default:
/* 1 */                     serialTaskQueue.lambda$flush$1();
                            break;
                    }
                }
            }
