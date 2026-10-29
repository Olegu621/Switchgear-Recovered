            package io.sentry.android.replay.capture;

            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1372x;
            import io.sentry.config.AbstractC1417a;
            import java.util.Date;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1299a extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10449a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10450b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f10451c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC1301c f10452d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1299a(Object obj, Object obj2, AbstractC1301c abstractC1301c, int i) {
/* 10 */            super(0);
/* 1 */             this.f10449a = i;
/* 3 */             this.f10450b = obj;
/* 5 */             this.f10451c = obj2;
/* 7 */             this.f10452d = abstractC1301c;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f10449a;
/* 3 */             Object obj = this.f10450b;
/* 5 */             AbstractC1301c abstractC1301c = this.f10452d;
/* 7 */             Object obj2 = this.f10451c;
                    switch (i) {
                        case 0:
/* 126 */                   C1326k c1326k = abstractC1301c.f10465h;
/* 128 */                   if (c1326k != null) {
/* 136 */                       c1326k.m5016h("replay.id", String.valueOf(obj2));
                            }
                            break;
                        case 1:
/* 56 */                    C1372x c1372x = (C1372x) obj2;
/* 60 */                    if (c1372x != null) {
/* 63 */                        C1326k c1326k2 = abstractC1301c.f10465h;
/* 65 */                        if (c1326k2 != null) {
/* 75 */                            c1326k2.m5016h("config.height", String.valueOf(c1372x.f10704b));
                                }
/* 78 */                        C1326k c1326k3 = abstractC1301c.f10465h;
/* 80 */                        if (c1326k3 != null) {
/* 90 */                            c1326k3.m5016h("config.width", String.valueOf(c1372x.f10703a));
                                }
/* 93 */                        C1326k c1326k4 = abstractC1301c.f10465h;
/* 95 */                        if (c1326k4 != null) {
/* 105 */                           c1326k4.m5016h("config.frame-rate", String.valueOf(c1372x.f10707e));
                                }
/* 108 */                       C1326k c1326k5 = abstractC1301c.f10465h;
/* 110 */                       if (c1326k5 != null) {
/* 120 */                           c1326k5.m5016h("config.bit-rate", String.valueOf(c1372x.f10708f));
                                }
                            }
                            break;
                        case 2:
/* 28 */                    Date date = (Date) obj2;
/* 32 */                    C1326k c1326k6 = abstractC1301c.f10465h;
/* 34 */                    if (c1326k6 != null) {
/* 50 */                        c1326k6.m5016h("segment.timestamp", date == null ? null : AbstractC1417a.m5178q(date.getTime()));
                            }
                            break;
                        default:
/* 12 */                    C1326k c1326k7 = abstractC1301c.f10465h;
/* 14 */                    if (c1326k7 != null) {
/* 22 */                        c1326k7.m5016h("replay.screen-at-start", String.valueOf(obj2));
                            }
                            break;
                    }
/* 25 */            return Unit.f12910a;
                }
            }
