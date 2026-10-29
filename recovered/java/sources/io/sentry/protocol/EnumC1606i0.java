            package io.sentry.protocol;

            import java.util.Locale;
            
            /* JADX INFO: renamed from: io.sentry.protocol.i0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public enum EnumC1606i0 {
                CUSTOM,
                URL,
                ROUTE,
                VIEW,
                COMPONENT,
                TASK;

                public String apiName() {
/* 7 */             return name().toLowerCase(Locale.ROOT);
                }
            }
