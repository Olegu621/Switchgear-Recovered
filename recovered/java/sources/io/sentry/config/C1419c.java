            package io.sentry.config;

            import io.sentry.util.AbstractC1716o;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.config.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1419c implements InterfaceC1420d {
                /* JADX INFO: renamed from: e */
                public static String m5186e(String str) {
/* 31 */            return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
                }

                @Override // io.sentry.config.InterfaceC1420d
                /* JADX INFO: renamed from: c */
                public final Map mo5185c() {
                    String strM5486d;
/* 9 */             String strConcat = m5186e("tags").concat("_");
/* 15 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 34 */            for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
/* 42 */                String key = entry.getKey();
/* 52 */                if (key.startsWith(strConcat) && (strM5486d = AbstractC1716o.m5486d(entry.getValue())) != null) {
/* 80 */                    concurrentHashMap.put(key.substring(strConcat.length()).toLowerCase(Locale.ROOT), strM5486d);
                        }
                    }
/* 84 */            return concurrentHashMap;
                }

                @Override // io.sentry.config.InterfaceC1420d
                public final String getProperty(String str) {
/* 9 */             return AbstractC1716o.m5486d(System.getenv(m5186e(str)));
                }
            }
