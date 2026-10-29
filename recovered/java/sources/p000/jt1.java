            package p000;

            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jt1 {

                /* JADX INFO: renamed from: a */
                public C1773iy f12478a;

                /* JADX INFO: renamed from: b */
                public ScheduledThreadPoolExecutor f12479b;

                /* JADX INFO: renamed from: c */
                public ub0 f12480c;

                /* JADX INFO: renamed from: d */
                public C1969nm f12481d;

                /* JADX INFO: renamed from: e */
                public boolean f12482e;

                /* JADX INFO: renamed from: f */
                public boolean f12483f;

                /* JADX INFO: renamed from: a */
                public final void m5897a(int i) {
                    int i2;
/* 1 */             C1969nm c1969nm = this.f12481d;
/* 8 */             if (this.f12483f || !c1969nm.m7013p() || i == -1) {
/* 164 */               xe2.m9775m("PolerCntlr", "Stopping poller, shouldPoll is false or STOP_POLLING received.", null);
/* 167 */               return;
                    }
/* 35 */            int iIntValue = ((Integer) c1969nm.m7008k(5000, "base_polling_interval")).intValue();
/* 54 */            int iIntValue2 = ((Integer) c1969nm.m7008k(60000, "max_polling_interval")).intValue();
/* 58 */            ub0 ub0Var = this.f12480c;
/* 62 */            if (ub0Var.f17435a != iIntValue || ub0Var.f17436b != iIntValue2) {
/* 69 */                ub0Var.f17435a = iIntValue;
/* 71 */                ub0Var.f17436b = iIntValue2;
/* 73 */                ub0Var.f17437c = iIntValue;
                    }
/* 75 */            if (i == 0) {
/* 77 */                i2 = ub0Var.f17437c;
                    } else {
/* 82 */                if ((i < 200 || i >= 400) && i < 500) {
/* 104 */                   ub0Var.f17437c = -1;
                        } else {
/* 94 */                    int i3 = ub0Var.f17437c * 2;
/* 96 */                    int i4 = ub0Var.f17436b;
/* 98 */                    if (i3 > i4) {
/* 100 */                       i3 = i4;
                            }
/* 101 */                   ub0Var.f17437c = i3;
                        }
/* 106 */               i2 = ub0Var.f17437c;
                    }
/* 108 */           if (i2 == -1) {
/* 112 */               xe2.m9775m("PolerCntlr", "Stopping poller, request failed", null);
/* 115 */               return;
                    }
/* 130 */           xe2.m9775m("PolerCntlr", "Scheduling next poll with interval: " + i2, null);
                    try {
/* 151 */               this.f12479b.schedule(new f62(new RunnableC2495ye(this, 19), 1), i2, TimeUnit.MILLISECONDS);
                    } catch (Exception e) {
/* 158 */               xe2.m9777o("PolerCntlr", "Error in scheduling next poll", e);
                    }
                }
            }
