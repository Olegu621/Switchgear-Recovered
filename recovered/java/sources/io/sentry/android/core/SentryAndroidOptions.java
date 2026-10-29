            package io.sentry.android.core;

            import io.sentry.C1529k5;
            import io.sentry.C1554m6;
            import io.sentry.C1697u2;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.protocol.C1624u;
            import io.sentry.util.AbstractC1704c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SentryAndroidOptions extends C1554m6 {
                private boolean anrEnabled;
                private Double anrProfilingSampleRate;
                private boolean anrReportInDebug;
                private long anrTimeoutIntervalMillis;
                private boolean attachAnrThreadDump;
                private boolean attachRawTombstone;
                private boolean attachScreenshot;
                private boolean attachViewHierarchy;
                private InterfaceC1237k1 beforeScreenshotCaptureCallback;
                private InterfaceC1237k1 beforeViewHierarchyCaptureCallback;
                private boolean collectAdditionalContext;
                private boolean collectExternalStorageContext;
                private InterfaceC1284x0 debugImagesLoader;
                private boolean enableActivityLifecycleBreadcrumbs;
                private boolean enableActivityLifecycleTracingAutoFinish;
                private boolean enableAnrFingerprinting;
                private boolean enableAppComponentBreadcrumbs;
                private boolean enableAppLifecycleBreadcrumbs;
                private boolean enableAutoActivityLifecycleTracing;
                private boolean enableAutoTraceIdGeneration;
                private boolean enableFramesTracking;
                private boolean enableNdk;
                private boolean enableNetworkEventBreadcrumbs;
                private boolean enablePerformanceV2;
                private boolean enableRootCheck;
                private boolean enableScopeSync;
                private boolean enableStandaloneAppStartTracing;
                private boolean enableSystemEventBreadcrumbs;
                private boolean enableSystemEventBreadcrumbsExtras;
                private boolean enableTombstone;
                private C1231r frameMetricsCollector;
                private String nativeSdkName;
                private EnumC1178c1 ndkHandlerStrategy;
                private boolean reportHistoricalAnrs;
                private boolean reportHistoricalTombstones;
                private final C1240l1 screenshot;
                private final long startupCrashDurationThresholdMillis;
                private long startupCrashFlushTimeoutMillis;

                public SentryAndroidOptions() {
/* 2 */             super(false);
/* 6 */             this.anrEnabled = true;
/* 10 */            this.anrTimeoutIntervalMillis = 5000L;
/* 12 */            this.anrReportInDebug = false;
/* 14 */            this.enableActivityLifecycleBreadcrumbs = true;
/* 16 */            this.enableAppLifecycleBreadcrumbs = true;
/* 18 */            this.enableSystemEventBreadcrumbs = true;
/* 20 */            this.enableAppComponentBreadcrumbs = true;
/* 22 */            this.enableNetworkEventBreadcrumbs = true;
/* 24 */            this.enableAutoActivityLifecycleTracing = true;
/* 26 */            this.enableActivityLifecycleTracingAutoFinish = true;
/* 30 */            this.debugImagesLoader = C1274u.f10342c;
/* 32 */            this.collectAdditionalContext = true;
/* 34 */            this.collectExternalStorageContext = false;
/* 36 */            this.startupCrashFlushTimeoutMillis = 5000L;
/* 40 */            this.startupCrashDurationThresholdMillis = 2000L;
/* 42 */            this.enableFramesTracking = true;
/* 45 */            this.nativeSdkName = null;
/* 47 */            this.enableRootCheck = true;
/* 49 */            this.enableNdk = true;
/* 53 */            this.ndkHandlerStrategy = EnumC1178c1.SENTRY_HANDLER_STRATEGY_DEFAULT;
/* 55 */            this.enableScopeSync = true;
/* 57 */            this.enableAutoTraceIdGeneration = true;
/* 59 */            this.enableSystemEventBreadcrumbsExtras = false;
/* 61 */            this.reportHistoricalAnrs = false;
/* 63 */            this.reportHistoricalTombstones = false;
/* 65 */            this.attachAnrThreadDump = false;
/* 67 */            this.attachRawTombstone = false;
/* 69 */            this.enablePerformanceV2 = true;
/* 71 */            this.enableStandaloneAppStartTracing = false;
/* 73 */            this.enableTombstone = false;
/* 80 */            this.screenshot = new C1240l1();
/* 82 */            this.enableAnrFingerprinting = true;
/* 86 */            setSentryClientName("sentry.java.android/8.48.0");
/* 93 */            setSdkVersion(createSdkVersion());
/* 96 */            setAttachServerName(false);
                }

                private C1624u createSdkVersion() {
/* 1 */             C1624u sdkVersion = getSdkVersion();
/* 9 */             if (sdkVersion == null) {
/* 13 */                sdkVersion = new C1624u("sentry.java.android", "8.48.0");
                    } else {
/* 17 */                sdkVersion.f11466a = "sentry.java.android";
/* 19 */                sdkVersion.f11467b = "8.48.0";
                    }
/* 27 */            C1529k5.m5336d().m5338b("maven:io.sentry:sentry-android-core", "8.48.0");
/* 30 */            return sdkVersion;
                }

                public void enableAllAutoBreadcrumbs(boolean z) {
/* 1 */             this.enableActivityLifecycleBreadcrumbs = z;
/* 3 */             this.enableAppComponentBreadcrumbs = z;
/* 5 */             this.enableSystemEventBreadcrumbs = z;
/* 7 */             this.enableAppLifecycleBreadcrumbs = z;
/* 9 */             this.enableNetworkEventBreadcrumbs = z;
/* 11 */            setEnableUserInteractionBreadcrumbs(z);
                }

                public Double getAnrProfilingSampleRate() {
/* 1 */             return this.anrProfilingSampleRate;
                }

                public long getAnrTimeoutIntervalMillis() {
/* 1 */             return this.anrTimeoutIntervalMillis;
                }

                public InterfaceC1237k1 getBeforeScreenshotCaptureCallback() {
/* 1 */             return null;
                }

                public InterfaceC1237k1 getBeforeViewHierarchyCaptureCallback() {
/* 1 */             return null;
                }

                public InterfaceC1284x0 getDebugImagesLoader() {
/* 1 */             return this.debugImagesLoader;
                }

                public C1231r getFrameMetricsCollector() {
/* 1 */             return this.frameMetricsCollector;
                }

                public String getNativeSdkName() {
/* 1 */             return this.nativeSdkName;
                }

                public int getNdkHandlerStrategy() {
/* 3 */             return this.ndkHandlerStrategy.getValue();
                }

                public C1240l1 getScreenshot() {
/* 1 */             return this.screenshot;
                }

                public long getStartupCrashDurationThresholdMillis() {
/* 1 */             return 2000L;
                }

                public long getStartupCrashFlushTimeoutMillis() {
/* 1 */             return this.startupCrashFlushTimeoutMillis;
                }

                public boolean isAnrEnabled() {
/* 1 */             return this.anrEnabled;
                }

                public boolean isAnrProfilingEnabled() {
/* 1 */             Double d = this.anrProfilingSampleRate;
                    return d != null && d.doubleValue() > 0.0d;
                }

                public boolean isAnrReportInDebug() {
/* 1 */             return this.anrReportInDebug;
                }

                public boolean isAttachAnrThreadDump() {
/* 1 */             return this.attachAnrThreadDump;
                }

                public boolean isAttachRawTombstone() {
/* 1 */             return this.attachRawTombstone;
                }

                public boolean isAttachScreenshot() {
/* 1 */             return this.attachScreenshot;
                }

                public boolean isAttachViewHierarchy() {
/* 1 */             return this.attachViewHierarchy;
                }

                public boolean isCollectAdditionalContext() {
/* 1 */             return this.collectAdditionalContext;
                }

                public boolean isCollectExternalStorageContext() {
/* 1 */             return this.collectExternalStorageContext;
                }

                public boolean isEnableActivityLifecycleBreadcrumbs() {
/* 1 */             return this.enableActivityLifecycleBreadcrumbs;
                }

                public boolean isEnableActivityLifecycleTracingAutoFinish() {
/* 1 */             return this.enableActivityLifecycleTracingAutoFinish;
                }

                public boolean isEnableAnrFingerprinting() {
/* 1 */             return this.enableAnrFingerprinting;
                }

                public boolean isEnableAppComponentBreadcrumbs() {
/* 1 */             return this.enableAppComponentBreadcrumbs;
                }

                public boolean isEnableAppLifecycleBreadcrumbs() {
/* 1 */             return this.enableAppLifecycleBreadcrumbs;
                }

                public boolean isEnableAutoActivityLifecycleTracing() {
/* 1 */             return this.enableAutoActivityLifecycleTracing;
                }

                public boolean isEnableAutoTraceIdGeneration() {
/* 1 */             return this.enableAutoTraceIdGeneration;
                }

                public boolean isEnableFramesTracking() {
/* 1 */             return this.enableFramesTracking;
                }

                public boolean isEnableNdk() {
/* 1 */             return this.enableNdk;
                }

                public boolean isEnableNetworkEventBreadcrumbs() {
/* 1 */             return this.enableNetworkEventBreadcrumbs;
                }

                public boolean isEnablePerformanceV2() {
/* 1 */             return this.enablePerformanceV2;
                }

                public boolean isEnableRootCheck() {
/* 1 */             return this.enableRootCheck;
                }

                public boolean isEnableScopeSync() {
/* 1 */             return this.enableScopeSync;
                }

                public boolean isEnableStandaloneAppStartTracing() {
/* 1 */             return this.enableStandaloneAppStartTracing;
                }

                public boolean isEnableSystemEventBreadcrumbs() {
/* 1 */             return this.enableSystemEventBreadcrumbs;
                }

                public boolean isEnableSystemEventBreadcrumbsExtras() {
/* 1 */             return this.enableSystemEventBreadcrumbsExtras;
                }

                public boolean isReportHistoricalAnrs() {
/* 1 */             return this.reportHistoricalAnrs;
                }

                public boolean isReportHistoricalTombstones() {
/* 1 */             return this.reportHistoricalTombstones;
                }

                public boolean isTombstoneEnabled() {
/* 1 */             return this.enableTombstone;
                }

                public void setAnrEnabled(boolean z) {
/* 1 */             this.anrEnabled = z;
                }

                public void setAnrProfilingSampleRate(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.anrProfilingSampleRate = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                    }
                }

                public void setAnrReportInDebug(boolean z) {
/* 1 */             this.anrReportInDebug = z;
                }

                public void setAnrTimeoutIntervalMillis(long j) {
/* 1 */             this.anrTimeoutIntervalMillis = j;
                }

                public void setAttachAnrThreadDump(boolean z) {
/* 1 */             this.attachAnrThreadDump = z;
                }

                public void setAttachRawTombstone(boolean z) {
/* 1 */             this.attachRawTombstone = z;
                }

                public void setAttachScreenshot(boolean z) {
/* 1 */             this.attachScreenshot = z;
                }

                public void setAttachViewHierarchy(boolean z) {
/* 1 */             this.attachViewHierarchy = z;
                }

                public void setBeforeScreenshotCaptureCallback(InterfaceC1237k1 interfaceC1237k1) {
                }

                public void setBeforeViewHierarchyCaptureCallback(InterfaceC1237k1 interfaceC1237k1) {
                }

                public void setCollectAdditionalContext(boolean z) {
/* 1 */             this.collectAdditionalContext = z;
                }

                public void setCollectExternalStorageContext(boolean z) {
/* 1 */             this.collectExternalStorageContext = z;
                }

                public void setDebugImagesLoader(InterfaceC1284x0 interfaceC1284x0) {
/* 1 */             if (interfaceC1284x0 == null) {
/* 4 */                 interfaceC1284x0 = C1274u.f10342c;
                    }
/* 6 */             this.debugImagesLoader = interfaceC1284x0;
                }

                public void setEnableActivityLifecycleBreadcrumbs(boolean z) {
/* 1 */             this.enableActivityLifecycleBreadcrumbs = z;
                }

                public void setEnableActivityLifecycleTracingAutoFinish(boolean z) {
/* 1 */             this.enableActivityLifecycleTracingAutoFinish = z;
                }

                public void setEnableAnrFingerprinting(boolean z) {
/* 1 */             this.enableAnrFingerprinting = z;
                }

                public void setEnableAppComponentBreadcrumbs(boolean z) {
/* 1 */             this.enableAppComponentBreadcrumbs = z;
                }

                public void setEnableAppLifecycleBreadcrumbs(boolean z) {
/* 1 */             this.enableAppLifecycleBreadcrumbs = z;
                }

                public void setEnableAutoActivityLifecycleTracing(boolean z) {
/* 1 */             this.enableAutoActivityLifecycleTracing = z;
                }

                public void setEnableAutoTraceIdGeneration(boolean z) {
/* 1 */             this.enableAutoTraceIdGeneration = z;
                }

                public void setEnableFramesTracking(boolean z) {
/* 1 */             this.enableFramesTracking = z;
                }

                public void setEnableNdk(boolean z) {
/* 1 */             this.enableNdk = z;
                }

                public void setEnableNetworkEventBreadcrumbs(boolean z) {
/* 1 */             this.enableNetworkEventBreadcrumbs = z;
                }

                public void setEnablePerformanceV2(boolean z) {
/* 1 */             this.enablePerformanceV2 = z;
                }

                public void setEnableRootCheck(boolean z) {
/* 1 */             this.enableRootCheck = z;
                }

                public void setEnableScopeSync(boolean z) {
/* 1 */             this.enableScopeSync = z;
                }

                public void setEnableStandaloneAppStartTracing(boolean z) {
/* 1 */             this.enableStandaloneAppStartTracing = z;
                }

                public void setEnableSystemEventBreadcrumbs(boolean z) {
/* 1 */             this.enableSystemEventBreadcrumbs = z;
                }

                public void setEnableSystemEventBreadcrumbsExtras(boolean z) {
/* 1 */             this.enableSystemEventBreadcrumbsExtras = z;
                }

                public void setFrameMetricsCollector(C1231r c1231r) {
/* 1 */             this.frameMetricsCollector = c1231r;
                }

                public void setNativeHandlerStrategy(EnumC1178c1 enumC1178c1) {
/* 1 */             this.ndkHandlerStrategy = enumC1178c1;
                }

                public void setNativeSdkName(String str) {
/* 1 */             this.nativeSdkName = str;
                }

                public void setReportHistoricalAnrs(boolean z) {
/* 1 */             this.reportHistoricalAnrs = z;
                }

                public void setReportHistoricalTombstones(boolean z) {
/* 1 */             this.reportHistoricalTombstones = z;
                }

                public void setStartupCrashFlushTimeoutMillis(long j) {
/* 1 */             this.startupCrashFlushTimeoutMillis = j;
                }

                public void setTombstoneEnabled(boolean z) {
/* 1 */             this.enableTombstone = z;
                }
            }
