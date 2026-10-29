            package io.sentry.android.replay;

            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.protocol.C1626w;
            import java.io.File;
            import java.io.IOException;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1323h extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10543a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1326k f10544b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1323h(C1326k c1326k, int i) {
/* 6 */             super(0);
/* 1 */             this.f10543a = i;
/* 3 */             this.f10544b = c1326k;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws IOException {
/* 1 */             int i = this.f10543a;
/* 3 */             File file = null;
/* 4 */             C1326k c1326k = this.f10544b;
                    switch (i) {
                        case 0:
/* 81 */                    if (c1326k.m5015g() != null) {
/* 92 */                        file = new File(c1326k.m5015g(), ".ongoing_segment");
/* 99 */                        if (!file.exists()) {
/* 101 */                           file.createNewFile();
                                }
                            }
/* 104 */                   return file;
                        default:
/* 9 */                     C1554m6 c1554m6 = c1326k.f10552a;
/* 11 */                    C1626w c1626w = c1326k.f10553b;
/* 13 */                    c1554m6.getClass();
/* 16 */                    c1626w.getClass();
/* 19 */                    String cacheDirPath = c1554m6.getCacheDirPath();
/* 23 */                    if (cacheDirPath == null || cacheDirPath.length() == 0) {
/* 73 */                        c1554m6.getLogger().mo4672k(EnumC1553m5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
/* 3 */                         return null;
                            }
/* 34 */                    String cacheDirPath2 = c1554m6.getCacheDirPath();
/* 38 */                    cacheDirPath2.getClass();
/* 55 */                    File file2 = new File(cacheDirPath2, "replay_" + c1626w);
/* 58 */                    file2.mkdirs();
/* 76 */                    return file2;
                    }
                }
            }
