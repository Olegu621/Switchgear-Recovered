            package io.sentry;

            import java.util.TimerTask;
            
            /* JADX INFO: renamed from: io.sentry.v6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1728v6 extends TimerTask {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11765a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1748x6 f11766b;

                public /* synthetic */ C1728v6(C1748x6 c1748x6, int i) {
/* 1 */             this.f11765a = i;
/* 3 */             this.f11766b = c1748x6;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f11765a;
/* 5 */             C1748x6 c1748x6 = this.f11766b;
                    switch (i) {
                        case 0:
/* 37 */                    EnumC1451f7 status = c1748x6.getStatus();
/* 41 */                    if (status == null) {
/* 44 */                        status = EnumC1451f7.OK;
                            }
/* 46 */                    c1748x6.mo4740v(status, null);
/* 51 */                    c1748x6.f11829l.set(false);
                            break;
                        default:
/* 10 */                    EnumC1451f7 status2 = c1748x6.getStatus();
/* 14 */                    if (status2 == null) {
/* 17 */                        status2 = EnumC1451f7.DEADLINE_EXCEEDED;
                            }
/* 28 */                    c1748x6.mo5246e(status2, c1748x6.f11835r.f11096g != null, null);
/* 33 */                    c1748x6.f11830m.set(false);
                            break;
                    }
                }
            }
