            package p000;

            import android.webkit.WebMessage;
            import android.webkit.WebMessagePort;
            
            /* JADX INFO: renamed from: m9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1919m9 extends WebMessagePort.WebMessageCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13661a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ k63 f13662b;

                public /* synthetic */ C1919m9(k63 k63Var, int i) {
/* 1 */             this.f13661a = i;
/* 3 */             this.f13662b = k63Var;
                }

                @Override // android.webkit.WebMessagePort.WebMessageCallback
                public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                    switch (this.f13661a) {
                        case 0:
/* 32 */                    this.f13662b.onMessage(new m63(webMessagePort), AbstractC1993o9.m7117d(webMessage));
                            break;
                        default:
/* 17 */                    this.f13662b.onMessage(new m63(webMessagePort), AbstractC1993o9.m7117d(webMessage));
                            break;
                    }
                }
            }
