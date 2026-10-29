            package io.sentry.logger;

            import io.sentry.metrics.C1558c;
            
            /* JADX INFO: renamed from: io.sentry.logger.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1544d implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11121a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f11122b;

                public /* synthetic */ RunnableC1544d(Object obj, int i) {
/* 1 */             this.f11121a = i;
/* 3 */             this.f11122b = obj;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f11121a;
/* 3 */             Object obj = this.f11122b;
                    switch (i) {
                        case 0:
/* 22 */                    C1545e c1545e = (C1545e) obj;
/* 32 */                    c1545e.f11126d.mo4713a(c1545e.f11123a.getShutdownTimeoutMillis());
                            break;
                        default:
/* 8 */                     C1558c c1558c = (C1558c) obj;
/* 18 */                    c1558c.f11153d.mo4713a(c1558c.f11150a.getShutdownTimeoutMillis());
                            break;
                    }
                }
            }
