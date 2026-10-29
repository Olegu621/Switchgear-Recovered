            package io.sentry;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.internal.debugmeta.C1505c;
            import java.util.concurrent.Callable;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: io.sentry.w4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class CallableC1738w4 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11801a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1505c f11802b;

                public /* synthetic */ CallableC1738w4(C1505c c1505c, int i) {
/* 1 */             this.f11801a = i;
/* 3 */             this.f11802b = c1505c;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
/* 1 */             int i = this.f11801a;
/* 3 */             C1505c c1505c = this.f11802b;
                    switch (i) {
                        case 0:
/* 138 */                   return Integer.valueOf(c1505c.m5290o().length);
                        case 1:
/* 128 */                   return c1505c.m5290o();
                        case 2:
/* 123 */                   return Integer.valueOf(c1505c.m5290o().length);
                        case 3:
/* 113 */                   return c1505c.m5290o();
                        case 4:
/* 108 */                   return Integer.valueOf(c1505c.m5290o().length);
                        case 5:
/* 98 */                    return c1505c.m5290o();
                        case 6:
/* 93 */                    return Integer.valueOf(c1505c.m5290o().length);
                        case 7:
/* 83 */                    return Integer.valueOf(c1505c.m5290o().length);
                        case 8:
/* 73 */                    return c1505c.m5290o();
                        case 9:
/* 68 */                    return Integer.valueOf(c1505c.m5290o().length);
                        case 10:
/* 58 */                    return c1505c.m5290o();
                        case 11:
/* 53 */                    return Integer.valueOf(c1505c.m5290o().length);
                        case 12:
/* 43 */                    return c1505c.m5290o();
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 38 */                    return c1505c.m5290o();
                        case 14:
/* 33 */                    return Integer.valueOf(c1505c.m5290o().length);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 23 */                    return c1505c.m5290o();
                        case 16:
/* 18 */                    return Integer.valueOf(c1505c.m5290o().length);
                        default:
/* 8 */                     return c1505c.m5290o();
                    }
                }
            }
