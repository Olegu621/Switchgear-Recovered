            package io.sentry.ndk;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class NdkOptions {
                private final String dist;
                private final String dsn;
                private final String environment;
                private final boolean isDebug;
                private final int maxBreadcrumbs;
                private final String outboxPath;
                private final String release;
                private final String sdkName;
                private EnumC1568a ndkHandlerStrategy = EnumC1568a.SENTRY_HANDLER_STRATEGY_DEFAULT;
                private float tracesSampleRate = 0.0f;

                public NdkOptions(String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6) {
/* 11 */            this.dsn = str;
/* 13 */            this.isDebug = z;
/* 15 */            this.outboxPath = str2;
/* 17 */            this.release = str3;
/* 19 */            this.environment = str4;
/* 21 */            this.dist = str5;
/* 23 */            this.maxBreadcrumbs = i;
/* 25 */            this.sdkName = str6;
                }

                public String getDist() {
/* 1 */             return this.dist;
                }

                public String getDsn() {
/* 1 */             return this.dsn;
                }

                public String getEnvironment() {
/* 1 */             return this.environment;
                }

                public int getMaxBreadcrumbs() {
/* 1 */             return this.maxBreadcrumbs;
                }

                public int getNdkHandlerStrategy() {
/* 3 */             return this.ndkHandlerStrategy.getValue();
                }

                public String getOutboxPath() {
/* 1 */             return this.outboxPath;
                }

                public String getRelease() {
/* 1 */             return this.release;
                }

                public String getSdkName() {
/* 1 */             return this.sdkName;
                }

                public float getTracesSampleRate() {
/* 1 */             return this.tracesSampleRate;
                }

                public boolean isDebug() {
/* 1 */             return this.isDebug;
                }

                public void setNdkHandlerStrategy(EnumC1568a enumC1568a) {
/* 1 */             this.ndkHandlerStrategy = enumC1568a;
                }

                public void setTracesSampleRate(float f) {
/* 1 */             this.tracesSampleRate = f;
                }
            }
