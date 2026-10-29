            package io.sentry.android.core;
            
            /* JADX INFO: renamed from: io.sentry.android.core.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1238l implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10213a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC1182d0 f10214b;

                public /* synthetic */ RunnableC1238l(InterfaceC1182d0 interfaceC1182d0, int i) {
/* 1 */             this.f10213a = i;
/* 3 */             this.f10214b = interfaceC1182d0;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f10213a;
/* 5 */             InterfaceC1182d0 interfaceC1182d0 = this.f10214b;
                    switch (i) {
                        case 0:
/* 18 */                    ((C1241m) interfaceC1182d0).mo5345b(5000L);
                            break;
                        default:
/* 12 */                    ((C1247o) interfaceC1182d0).mo5366b(5000L);
                            break;
                    }
                }
            }
