            package io.sentry;

            import io.sentry.protocol.C1626w;
            import java.io.File;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.n3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1564n3 {

                /* JADX INFO: renamed from: a */
                public final C1626w f11158a;

                /* JADX INFO: renamed from: b */
                public final C1626w f11159b;

                /* JADX INFO: renamed from: c */
                public final ConcurrentHashMap f11160c;

                /* JADX INFO: renamed from: d */
                public final File f11161d;

                /* JADX INFO: renamed from: e */
                public final double f11162e;

                /* JADX INFO: renamed from: f */
                public final String f11163f = "android";

                public C1564n3(C1626w c1626w, C1626w c1626w2, Map map, File file, AbstractC1672t4 abstractC1672t4) {
/* 4 */             this.f11158a = c1626w;
/* 6 */             this.f11159b = c1626w2;
/* 13 */            this.f11160c = new ConcurrentHashMap(map);
/* 15 */            this.f11161d = file;
/* 28 */            this.f11162e = abstractC1672t4.mo5278d() / 1.0E9d;
                }
            }
