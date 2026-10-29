            package io.sentry.android.replay.capture;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1304f extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10486a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1305g f10487b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1304f(C1305g c1305g, int i) {
/* 6 */             super(1);
/* 1 */             this.f10486a = i;
/* 3 */             this.f10487b = c1305g;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f10486a;
/* 3 */             C1305g c1305g = this.f10487b;
                    switch (i) {
                        case 0:
/* 34 */                    AbstractC1310l abstractC1310l = (AbstractC1310l) obj;
/* 36 */                    abstractC1310l.getClass();
/* 41 */                    if (abstractC1310l instanceof C1308j) {
/* 45 */                        c1305g.f10492x.add(abstractC1310l);
/* 54 */                        c1305g.m4994k(c1305g.m4988e() + 1);
                            }
                            break;
                        default:
/* 8 */                     AbstractC1310l abstractC1310l2 = (AbstractC1310l) obj;
/* 10 */                    abstractC1310l2.getClass();
/* 15 */                    if (abstractC1310l2 instanceof C1308j) {
/* 19 */                        c1305g.f10492x.add(abstractC1310l2);
/* 28 */                        c1305g.m4994k(c1305g.m4988e() + 1);
                            }
                            break;
                    }
/* 31 */            return Unit.f12910a;
                }
            }
