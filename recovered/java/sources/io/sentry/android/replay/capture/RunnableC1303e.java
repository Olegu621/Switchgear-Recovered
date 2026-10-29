            package io.sentry.android.replay.capture;

            import io.sentry.C1443f;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.android.replay.util.ScheduledExecutorServiceC1353g;
            import io.sentry.cache.AbstractC1396a;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.tape.AbstractC1407f;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.io.IOException;
            import okhttp3.HttpUrl;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1303e implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10483a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10484b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f10485c;

                public /* synthetic */ RunnableC1303e(int i, Object obj, Object obj2) {
/* 1 */             this.f10483a = i;
/* 3 */             this.f10484b = obj;
/* 5 */             this.f10485c = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f10483a;
/* 5 */             Object obj = this.f10485c;
/* 7 */             Object obj2 = this.f10484b;
                    switch (i) {
                        case 0:
/* 171 */                   AbstractC1704c.m5451f((File) obj2);
/* 175 */                   ((C1305g) obj).m4994k(-1);
                            break;
                        case 1:
/* 148 */                   C1554m6 c1554m6 = (C1554m6) obj;
                            try {
/* 150 */                       ((f72) obj2).run();
                            } catch (Throwable th) {
/* 163 */                       c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th);
/* 166 */                       return;
                            }
                            break;
                        case 2:
/* 108 */                   Runnable runnable = (Runnable) obj2;
/* 110 */                   ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g = (ScheduledExecutorServiceC1353g) obj;
                            try {
/* 112 */                       runnable.run();
                            } catch (Throwable th2) {
/* 142 */                       scheduledExecutorServiceC1353g.f10662b.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task ".concat(runnable instanceof RunnableC1354h ? ((RunnableC1354h) runnable).f10663a : HttpUrl.FRAGMENT_ENCODE_SET), th2);
/* 145 */                       return;
                            }
                            break;
                        case 3:
/* 77 */                    C1401f c1401f = (C1401f) obj2;
                            try {
/* 89 */                        ((AbstractC1407f) c1401f.f10810b.m5471a()).mo5130c((C1443f) obj);
                            } catch (IOException e) {
/* 104 */                       c1401f.f10809a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to add breadcrumb to file queue", e);
/* 107 */                       return;
                            }
                            break;
                        case 4:
/* 73 */                    AbstractC1396a.m5116d(((C1401f) obj2).f10809a, (C1626w) obj, ".scope-cache", "replay.json");
                            break;
                        case 5:
/* 47 */                    C1401f c1401f2 = (C1401f) obj2;
/* 49 */                    String str = (String) obj;
/* 53 */                    if (str != null) {
/* 61 */                        AbstractC1396a.m5116d(c1401f2.f10809a, str, ".scope-cache", "transaction.json");
                            } else {
/* 55 */                        c1401f2.m5127a("transaction.json");
                            }
                            break;
                        case 6:
/* 24 */                    C1401f c1401f3 = (C1401f) obj2;
                            try {
/* 28 */                        ((Runnable) obj).run();
                            } catch (Throwable th3) {
/* 43 */                        c1401f3.f10809a.getLogger().mo4671d(EnumC1553m5.ERROR, "Serialization task failed", th3);
/* 46 */                        return;
                            }
                            break;
                        default:
/* 20 */                    AbstractC1396a.m5116d(((C1401f) obj2).f10809a, (C1597e) obj, ".scope-cache", "contexts.json");
                            break;
                    }
                }
            }
