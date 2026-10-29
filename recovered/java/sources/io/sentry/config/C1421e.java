            package io.sentry.config;

            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1716o;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Properties;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.config.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class C1421e implements InterfaceC1420d {

                /* JADX INFO: renamed from: a */
                public final String f10845a;

                /* JADX INFO: renamed from: b */
                public final Properties f10846b;

                public C1421e(String str, Properties properties) {
/* 4 */             this.f10845a = str;
/* 8 */             AbstractC1704c.m5462q(properties, "properties are required");
/* 11 */            this.f10846b = properties;
                }

                @Override // io.sentry.config.InterfaceC1420d
                /* JADX INFO: renamed from: c */
                public final Map mo5185c() {
/* 10 */            String strM3789o = fm0.m3789o(new StringBuilder(), this.f10845a, "tags.");
/* 16 */            HashMap map = new HashMap();
/* 33 */            for (Map.Entry entry : this.f10846b.entrySet()) {
/* 47 */                if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
/* 61 */                    String str = (String) entry.getKey();
/* 67 */                    if (str.startsWith(strM3789o)) {
/* 87 */                        map.put(str.substring(strM3789o.length()), AbstractC1716o.m5486d((String) entry.getValue()));
                            }
                        }
                    }
/* 91 */            return map;
                }

                @Override // io.sentry.config.InterfaceC1420d
                public final String getProperty(String str) {
/* 24 */            return AbstractC1716o.m5486d(this.f10846b.getProperty(this.f10845a + str));
                }

/* 13 */        public C1421e(Properties properties) {
/* 14 */            this(HttpUrl.FRAGMENT_ENCODE_SET, properties);
                }
            }
