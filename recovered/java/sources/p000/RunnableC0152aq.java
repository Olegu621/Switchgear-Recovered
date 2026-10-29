            package p000;
            
            /* JADX INFO: renamed from: aq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0152aq implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2055a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0189bq f2056b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f2057c;

                public /* synthetic */ RunnableC0152aq(C0189bq c0189bq, String str, int i) {
/* 1 */             this.f2055a = i;
/* 3 */             this.f2056b = c0189bq;
/* 5 */             this.f2057c = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f2055a;
/* 3 */             String str = this.f2057c;
/* 5 */             C0189bq c0189bq = this.f2056b;
                    switch (i) {
                        case 0:
/* 18 */                    c0189bq.f2568b.onCameraAvailable(str);
                            break;
                        default:
/* 12 */                    c0189bq.f2568b.onCameraUnavailable(str);
                            break;
                    }
                }
            }
