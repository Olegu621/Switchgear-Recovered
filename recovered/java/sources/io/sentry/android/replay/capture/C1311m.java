            package io.sentry.android.replay.capture;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1311m extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10496a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1312n f10497b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1311m(C1312n c1312n, int i) {
/* 6 */             super(1);
/* 1 */             this.f10496a = i;
/* 3 */             this.f10497b = c1312n;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f10496a;
/* 3 */             C1312n c1312n = this.f10497b;
                    switch (i) {
                        case 0:
/* 36 */                    AbstractC1310l abstractC1310l = (AbstractC1310l) obj;
/* 38 */                    abstractC1310l.getClass();
/* 43 */                    if (abstractC1310l instanceof C1308j) {
/* 45 */                        C1308j c1308j = (C1308j) abstractC1310l;
/* 49 */                        C1308j.m5000a(c1308j, c1312n.f10499u);
/* 58 */                        c1312n.m4994k(c1312n.m4988e() + 1);
/* 65 */                        c1312n.m4995l(c1308j.f10493a.f11214f0);
                            }
                            break;
                        default:
/* 8 */                     AbstractC1310l abstractC1310l2 = (AbstractC1310l) obj;
/* 10 */                    abstractC1310l2.getClass();
/* 15 */                    if (abstractC1310l2 instanceof C1308j) {
/* 21 */                        C1308j.m5000a((C1308j) abstractC1310l2, c1312n.f10499u);
/* 30 */                        c1312n.m4994k(c1312n.m4988e() + 1);
                            }
                            break;
                    }
/* 33 */            return Unit.f12910a;
                }
            }
