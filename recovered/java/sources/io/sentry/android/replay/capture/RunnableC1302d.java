            package io.sentry.android.replay.capture;

            import io.sentry.android.replay.C1372x;
            import io.sentry.protocol.C1626w;
            import java.util.Date;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1302d implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10476a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f10477b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Date f10478c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C1626w f10479d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C1372x f10480e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function1 f10481f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ AbstractC1301c f10482i;

                public /* synthetic */ RunnableC1302d(AbstractC1301c abstractC1301c, long j, Date date, C1626w c1626w, C1372x c1372x, Function1 function1, int i) {
/* 1 */             this.f10476a = i;
/* 3 */             this.f10482i = abstractC1301c;
/* 5 */             this.f10477b = j;
/* 7 */             this.f10478c = date;
/* 9 */             this.f10479d = c1626w;
/* 11 */            this.f10480e = c1372x;
/* 13 */            this.f10481f = function1;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f10476a;
/* 3 */             Function1 function1 = this.f10481f;
/* 5 */             C1372x c1372x = this.f10480e;
/* 7 */             AbstractC1301c abstractC1301c = this.f10482i;
                    switch (i) {
                        case 0:
/* 41 */                    C1305g c1305g = (C1305g) abstractC1301c;
/* 66 */                    function1.invoke(AbstractC1301c.m4984c(c1305g, this.f10477b, this.f10478c, this.f10479d, c1305g.m4988e(), c1372x.f10704b, c1372x.f10703a, c1372x.f10707e, c1372x.f10708f));
                            break;
                        default:
/* 13 */                    C1312n c1312n = (C1312n) abstractC1301c;
/* 37 */                    function1.invoke(AbstractC1301c.m4984c(c1312n, this.f10477b, this.f10478c, this.f10479d, c1312n.m4988e(), c1372x.f10704b, c1372x.f10703a, c1372x.f10707e, c1372x.f10708f));
                            break;
                    }
                }
            }
