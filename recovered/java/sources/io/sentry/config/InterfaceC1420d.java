            package io.sentry.config;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.config.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC1420d {
                /* JADX INFO: renamed from: a */
                default Boolean m5187a(String str) {
/* 1 */             String property = getProperty(str);
/* 5 */             if (property != null) {
/* 7 */                 return Boolean.valueOf(property);
                    }
/* 12 */            return null;
                }

                /* JADX INFO: renamed from: b */
                default Long m5188b(String str) {
/* 1 */             String property = getProperty(str);
/* 6 */             if (property != null) {
                        try {
/* 8 */                     return Long.valueOf(property);
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: c */
                Map mo5185c();

                /* JADX INFO: renamed from: d */
                default List m5189d(String str) {
/* 1 */             String property = getProperty(str);
                    return property != null ? Arrays.asList(property.split(",")) : Collections.EMPTY_LIST;
                }

                String getProperty(String str);
            }
