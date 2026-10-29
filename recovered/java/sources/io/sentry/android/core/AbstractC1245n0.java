            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.os.Build;
            import android.os.Bundle;
            import android.util.Log;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1422d;
            import io.sentry.C1443f;
            import io.sentry.C1470h5;
            import io.sentry.C1529k5;
            import io.sentry.C1637q6;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1490i4;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1632q1;
            import io.sentry.EnumC1634q3;
            import io.sentry.EnumC1636q5;
            import io.sentry.ILogger;
            import io.sentry.logger.InterfaceC1541a;
            import io.sentry.protocol.C1624u;
            import io.sentry.util.AbstractC1704c;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.as0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.n0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1245n0 {

                /* JADX INFO: renamed from: a */
                public static final as0 f10217a = new as0(new C1697u2(10));

                /* JADX INFO: renamed from: b */
                public static final as0 f10218b = new as0(new C1697u2(11));

                /* JADX INFO: renamed from: c */
                public static final as0 f10219c = new as0(new C1697u2(12));

                /* JADX INFO: renamed from: d */
                public static final as0 f10220d = new as0(new C1697u2(13));

                /* JADX INFO: renamed from: e */
                public static final as0 f10221e = new as0(new C1697u2(14));

                /* JADX INFO: renamed from: a */
                public static void m4873a(String str, EnumC1553m5 enumC1553m5, String str2, Throwable th) {
/* 3 */             C1443f c1443f = new C1443f();
/* 8 */             c1443f.f10932i = "Logcat";
/* 10 */            c1443f.f10929d = str2;
/* 12 */            c1443f.f10934w = enumC1553m5;
/* 14 */            if (str != null) {
/* 18 */                c1443f.m5209d(str, "tag");
                    }
/* 21 */            if (th != null && th.getMessage() != null) {
/* 35 */                c1443f.m5209d(th.getMessage(), "throwable");
                    }
/* 42 */            AbstractC1552m4.m5357b().mo5089i(c1443f);
                }

                /* JADX INFO: renamed from: b */
                public static void m4874b(EnumC1636q5 enumC1636q5, String str, Throwable th) {
/* 15 */            if (AbstractC1552m4.m5357b().mo5092l().getLogs().f10914a) {
/* 25 */                String message = th != null ? th.getMessage() : null;
/* 28 */                C1422d c1422d = new C1422d();
/* 33 */                c1422d.f10847a = "auto.log.logcat";
/* 36 */                if (th == null || message == null) {
/* 73 */                    AbstractC1552m4.m5357b().mo5100t().mo5212e(enumC1636q5, c1422d, str, new Object[0]);
/* 76 */                    return;
                        }
/* 45 */                InterfaceC1541a interfaceC1541aMo5100t = AbstractC1552m4.m5357b().mo5100t();
/* 49 */                if (str != null) {
/* 53 */                    message = AbstractC0886en.m3508l(str, "\n", message);
                        }
/* 59 */                interfaceC1541aMo5100t.mo5212e(enumC1636q5, c1422d, message, new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m4875c(Context context, C1248o0 c1248o0, SentryAndroidOptions sentryAndroidOptions) {
                    List listM4885m;
                    List listM4885m2;
                    List listM4885m3;
                    List listM4885m4;
                    try {
/* 5 */                 sentryAndroidOptions.getLogger();
/* 29 */                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) f10220d.m1157c(context) : (ApplicationInfo) f10221e.m1157c(context);
/* 37 */                Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
/* 38 */                ILogger logger = sentryAndroidOptions.getLogger();
/* 43 */                if (bundle != null) {
/* 55 */                    sentryAndroidOptions.setDebug(m4883k(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
/* 62 */                    if (sentryAndroidOptions.isDebug()) {
/* 70 */                        String strName = sentryAndroidOptions.getDiagnosticLevel().name();
/* 74 */                        Locale locale = Locale.ROOT;
/* 80 */                        String strM4887o = m4887o(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
/* 84 */                        if (strM4887o != null) {
/* 94 */                            sentryAndroidOptions.setDiagnosticLevel(EnumC1553m5.valueOf(strM4887o.toUpperCase(locale)));
                                }
                            }
/* 111 */                   sentryAndroidOptions.setAnrEnabled(m4883k(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
/* 124 */                   sentryAndroidOptions.setTombstoneEnabled(m4883k(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
/* 137 */                   sentryAndroidOptions.setAttachRawTombstone(m4883k(bundle, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
/* 150 */                   sentryAndroidOptions.setReportHistoricalTombstones(m4883k(bundle, logger, "io.sentry.tombstone.report-historical", sentryAndroidOptions.isReportHistoricalTombstones()));
/* 163 */                   sentryAndroidOptions.setEnableAutoSessionTracking(m4883k(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
/* 172 */                   if (sentryAndroidOptions.getSampleRate() == null) {
/* 176 */                       double dM4884l = m4884l(bundle, logger, "io.sentry.sample-rate");
/* 182 */                       if (dM4884l != -1.0d) {
/* 188 */                           sentryAndroidOptions.setSampleRate(Double.valueOf(dM4884l));
                                }
                            }
/* 201 */                   sentryAndroidOptions.setAnrReportInDebug(m4883k(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
/* 214 */                   sentryAndroidOptions.setAnrTimeoutIntervalMillis(m4886n(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
/* 227 */                   sentryAndroidOptions.setAttachAnrThreadDump(m4883k(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
/* 240 */                   sentryAndroidOptions.setReportHistoricalAnrs(m4883k(bundle, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
/* 249 */                   String strM4887o2 = m4887o(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
/* 259 */                   boolean zM4883k = m4883k(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
/* 263 */                   if (!zM4883k || (strM4887o2 != null && strM4887o2.isEmpty())) {
/* 300 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                            } else if (strM4887o2 == null) {
/* 286 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                            }
/* 303 */                   sentryAndroidOptions.setEnabled(zM4883k);
/* 306 */                   sentryAndroidOptions.setDsn(strM4887o2);
/* 319 */                   sentryAndroidOptions.setEnableNdk(m4883k(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
/* 332 */                   sentryAndroidOptions.setEnableScopeSync(m4883k(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
/* 341 */                   String strM4887o3 = m4887o(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
/* 345 */                   if (strM4887o3 != null) {
/* 347 */                       sentryAndroidOptions.setNativeSdkName(strM4887o3);
                            }
/* 360 */                   sentryAndroidOptions.setRelease(m4887o(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
/* 373 */                   sentryAndroidOptions.setDist(m4887o(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
/* 386 */                   sentryAndroidOptions.setEnvironment(m4887o(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
/* 399 */                   sentryAndroidOptions.setSessionTrackingIntervalMillis(m4886n(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
/* 414 */                   sentryAndroidOptions.setMaxBreadcrumbs((int) m4886n(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
/* 427 */                   sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
/* 440 */                   sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
/* 453 */                   sentryAndroidOptions.setEnableSystemEventBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
/* 466 */                   sentryAndroidOptions.setEnableAppComponentBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
/* 479 */                   sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
/* 492 */                   sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(m4883k(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
/* 505 */                   sentryAndroidOptions.setEnableUncaughtExceptionHandler(m4883k(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
/* 518 */                   sentryAndroidOptions.setAttachThreads(m4883k(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
/* 531 */                   sentryAndroidOptions.setAttachScreenshot(m4883k(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
/* 544 */                   sentryAndroidOptions.setAttachViewHierarchy(m4883k(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
/* 557 */                   sentryAndroidOptions.setSendClientReports(m4883k(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
/* 567 */                   if (m4883k(bundle, logger, "io.sentry.auto-init", true)) {
/* 571 */                       sentryAndroidOptions.setInitPriority(EnumC1632q1.LOW);
                            }
/* 584 */                   sentryAndroidOptions.setForceInit(m4883k(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
/* 597 */                   sentryAndroidOptions.setCollectAdditionalContext(m4883k(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
/* 610 */                   sentryAndroidOptions.setCollectExternalStorageContext(m4883k(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
/* 617 */                   if (sentryAndroidOptions.getTracesSampleRate() == null) {
/* 621 */                       double dM4884l2 = m4884l(bundle, logger, "io.sentry.traces.sample-rate");
/* 627 */                       if (dM4884l2 != -1.0d) {
/* 633 */                           sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dM4884l2));
                                }
                            }
/* 646 */                   sentryAndroidOptions.setTraceSampling(m4883k(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
/* 659 */                   sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(m4883k(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
/* 672 */                   sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(m4883k(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
/* 679 */                   if (sentryAndroidOptions.getProfilesSampleRate() == null) {
/* 683 */                       double dM4884l3 = m4884l(bundle, logger, "io.sentry.traces.profiling.sample-rate");
/* 689 */                       if (dM4884l3 != -1.0d) {
/* 695 */                           sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dM4884l3));
                                }
                            }
/* 702 */                   if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
/* 706 */                       double dM4884l4 = m4884l(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
/* 712 */                       if (dM4884l4 != -1.0d) {
/* 718 */                           sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dM4884l4));
                                }
                            }
/* 727 */                   String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
/* 731 */                   Locale locale2 = Locale.ROOT;
/* 737 */                   String strM4887o4 = m4887o(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
/* 741 */                   if (strM4887o4 != null) {
/* 751 */                       sentryAndroidOptions.setProfileLifecycle(EnumC1634q3.valueOf(strM4887o4.toUpperCase(locale2)));
                            }
/* 764 */                   sentryAndroidOptions.setStartProfilerOnAppStart(m4883k(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
/* 777 */                   sentryAndroidOptions.setEnableUserInteractionTracing(m4883k(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
/* 790 */                   sentryAndroidOptions.setEnableTimeToFullDisplayTracing(m4883k(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
/* 797 */                   long jM4886n = m4886n(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
/* 803 */                   if (jM4886n != -1) {
/* 809 */                       sentryAndroidOptions.setIdleTimeout(Long.valueOf(jM4886n));
                            }
/* 812 */                   List<String> listM4885m5 = m4885m(bundle, logger, "io.sentry.traces.trace-propagation-targets");
/* 820 */                   if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listM4885m5 == null) {
/* 826 */                       sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                            } else if (listM4885m5 != null) {
/* 832 */                       sentryAndroidOptions.setTracePropagationTargets(listM4885m5);
                            }
/* 841 */                   sentryAndroidOptions.setEnableFramesTracking(m4883k(bundle, logger, "io.sentry.traces.frames-tracking", true));
/* 854 */                   sentryAndroidOptions.setProguardUuid(m4887o(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
/* 857 */                   C1624u sdkVersion = sentryAndroidOptions.getSdkVersion();
/* 861 */                   if (sdkVersion == null) {
/* 865 */                       sdkVersion = new C1624u(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                            }
/* 874 */                   String strM4888p = m4888p(bundle, logger, "io.sentry.sdk.name", sdkVersion.m5378a());
/* 880 */                   AbstractC1704c.m5462q(strM4888p, "name is required.");
/* 883 */                   sdkVersion.f11466a = strM4888p;
/* 891 */                   String strM4888p2 = m4888p(bundle, logger, "io.sentry.sdk.version", sdkVersion.m5379b());
/* 897 */                   AbstractC1704c.m5462q(strM4888p2, "version is required.");
/* 900 */                   sdkVersion.f11467b = strM4888p2;
/* 902 */                   sentryAndroidOptions.setSdkVersion(sdkVersion);
/* 915 */                   sentryAndroidOptions.setSendDefaultPii(m4883k(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
/* 920 */                   List listM4885m6 = m4885m(bundle, logger, "io.sentry.gradle-plugin-integrations");
/* 924 */                   if (listM4885m6 != null) {
/* 926 */                       Iterator it = listM4885m6.iterator();
/* 934 */                       while (it.hasNext()) {
/* 946 */                           C1529k5.m5336d().m5337a((String) it.next());
                                }
                            }
/* 960 */                   sentryAndroidOptions.setEnableRootCheck(m4883k(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
/* 973 */                   sentryAndroidOptions.setSendModules(m4883k(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
/* 986 */                   sentryAndroidOptions.setEnablePerformanceV2(m4883k(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
/* 999 */                   sentryAndroidOptions.setEnableStandaloneAppStartTracing(m4883k(bundle, logger, "io.sentry.standalone-app-start-tracing.enable", sentryAndroidOptions.isEnableStandaloneAppStartTracing()));
/* 1012 */                  sentryAndroidOptions.setEnableAppStartProfiling(m4883k(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
/* 1025 */                  sentryAndroidOptions.setEnableScopePersistence(m4883k(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
/* 1038 */                  sentryAndroidOptions.setEnableAutoTraceIdGeneration(m4883k(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
/* 1051 */                  sentryAndroidOptions.setDeadlineTimeout(m4886n(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
/* 1062 */                  if (sentryAndroidOptions.getSessionReplay().m5399x() == null) {
/* 1066 */                      double dM4884l5 = m4884l(bundle, logger, "io.sentry.session-replay.session-sample-rate");
/* 1072 */                      if (dM4884l5 != -1.0d) {
/* 1082 */                          sentryAndroidOptions.getSessionReplay().m5392I(Double.valueOf(dM4884l5));
                                }
                            }
/* 1093 */                  if (sentryAndroidOptions.getSessionReplay().m5398w() == null) {
/* 1097 */                      double dM4884l6 = m4884l(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
/* 1103 */                      if (dM4884l6 != -1.0d) {
/* 1113 */                          sentryAndroidOptions.getSessionReplay().m5391H(Double.valueOf(dM4884l6));
                                }
                            }
/* 1126 */                  sentryAndroidOptions.getSessionReplay().mo5393p(m4883k(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
/* 1139 */                  sentryAndroidOptions.getSessionReplay().mo4869o(m4883k(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
/* 1152 */                  sentryAndroidOptions.getSessionReplay().m5385B(m4883k(bundle, logger, "io.sentry.session-replay.debug", false));
/* 1157 */                  String strM4887o5 = m4887o(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
/* 1161 */                  if (strM4887o5 != null) {
/* 1175 */                      if ("canvas".equals(strM4887o5.toLowerCase(Locale.ROOT))) {
/* 1183 */                          sentryAndroidOptions.getSessionReplay().f11537n = EnumC1490i4.CANVAS;
                                } else {
/* 1192 */                          sentryAndroidOptions.getSessionReplay().f11537n = EnumC1490i4.PIXEL_COPY;
                                }
                            }
/* 1212 */                  sentryAndroidOptions.getSessionReplay().m5384A(m4883k(bundle, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().m5400y()));
/* 1227 */                  if (sentryAndroidOptions.getSessionReplay().m5394s().isEmpty() && (listM4885m4 = m4885m(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listM4885m4.isEmpty()) {
/* 1245 */                      ArrayList arrayList = new ArrayList();
/* 1248 */                      Iterator it2 = listM4885m4.iterator();
/* 1256 */                      while (it2.hasNext()) {
/* 1264 */                          String strTrim = ((String) it2.next()).trim();
/* 1272 */                          if (!strTrim.isEmpty()) {
/* 1274 */                              arrayList.add(strTrim);
                                    }
                                }
/* 1282 */                      if (!arrayList.isEmpty()) {
/* 1288 */                          sentryAndroidOptions.getSessionReplay().m5387D(arrayList);
                                }
                            }
/* 1303 */                  if (sentryAndroidOptions.getSessionReplay().m5395t().isEmpty() && (listM4885m3 = m4885m(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listM4885m3.isEmpty()) {
/* 1321 */                      ArrayList arrayList2 = new ArrayList();
/* 1324 */                      Iterator it3 = listM4885m3.iterator();
/* 1332 */                      while (it3.hasNext()) {
/* 1340 */                          String strTrim2 = ((String) it3.next()).trim();
/* 1348 */                          if (!strTrim2.isEmpty()) {
/* 1350 */                              arrayList2.add(strTrim2);
                                    }
                                }
/* 1358 */                      if (!arrayList2.isEmpty()) {
/* 1364 */                          sentryAndroidOptions.getSessionReplay().m5388E(arrayList2);
                                }
                            }
/* 1385 */                  sentryAndroidOptions.getSessionReplay().m5386C(m4883k(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().m5401z()));
/* 1406 */                  if (sentryAndroidOptions.getSessionReplay().m5396u().size() == C1637q6.f11525u.size() && (listM4885m2 = m4885m(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
/* 1418 */                      ArrayList arrayList3 = new ArrayList();
/* 1421 */                      Iterator it4 = listM4885m2.iterator();
/* 1429 */                      while (it4.hasNext()) {
/* 1437 */                          String strTrim3 = ((String) it4.next()).trim();
/* 1445 */                          if (!strTrim3.isEmpty()) {
/* 1447 */                              arrayList3.add(strTrim3);
                                    }
                                }
/* 1455 */                      if (!arrayList3.isEmpty()) {
/* 1461 */                          sentryAndroidOptions.getSessionReplay().m5389F(arrayList3);
                                }
                            }
/* 1482 */                  if (sentryAndroidOptions.getSessionReplay().m5397v().size() == C1637q6.f11525u.size() && (listM4885m = m4885m(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listM4885m.isEmpty()) {
/* 1500 */                      ArrayList arrayList4 = new ArrayList();
/* 1503 */                      Iterator it5 = listM4885m.iterator();
/* 1511 */                      while (it5.hasNext()) {
/* 1519 */                          String strTrim4 = ((String) it5.next()).trim();
/* 1527 */                          if (!strTrim4.isEmpty()) {
/* 1529 */                              arrayList4.add(strTrim4);
                                    }
                                }
/* 1537 */                      if (!arrayList4.isEmpty()) {
/* 1543 */                          sentryAndroidOptions.getSessionReplay().m5390G(arrayList4);
                                }
                            }
/* 1552 */                  sentryAndroidOptions.setIgnoredErrors(m4885m(bundle, logger, "io.sentry.ignored-errors"));
/* 1557 */                  List listM4885m7 = m4885m(bundle, logger, "io.sentry.in-app-includes");
/* 1561 */                  if (listM4885m7 != null && !listM4885m7.isEmpty()) {
/* 1569 */                      Iterator it6 = listM4885m7.iterator();
/* 1577 */                      while (it6.hasNext()) {
/* 1585 */                          sentryAndroidOptions.addInAppInclude((String) it6.next());
                                }
                            }
/* 1591 */                  List listM4885m8 = m4885m(bundle, logger, "io.sentry.in-app-excludes");
/* 1595 */                  if (listM4885m8 != null && !listM4885m8.isEmpty()) {
/* 1603 */                      Iterator it7 = listM4885m8.iterator();
/* 1611 */                      while (it7.hasNext()) {
/* 1619 */                          sentryAndroidOptions.addInAppExclude((String) it7.next());
                                }
                            }
/* 1641 */                  sentryAndroidOptions.getLogs().m5205b(m4883k(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().m5204a()));
/* 1662 */                  sentryAndroidOptions.getMetrics().m5253b(m4883k(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().m5252a()));
/* 1665 */                  C1470h5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
/* 1679 */                  feedbackOptions.m5266i(m4883k(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.m5259b()));
/* 1692 */                  feedbackOptions.m5269l(m4883k(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.m5262e()));
/* 1705 */                  feedbackOptions.m5265h(m4883k(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.m5258a()));
/* 1718 */                  feedbackOptions.m5268k(m4883k(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.m5261d()));
/* 1731 */                  feedbackOptions.m5270m(m4883k(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.m5263f()));
/* 1744 */                  feedbackOptions.m5267j(m4883k(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.m5260c()));
/* 1757 */                  feedbackOptions.m5271n(m4883k(bundle, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.m5264g()));
/* 1770 */                  sentryAndroidOptions.setStrictTraceContinuation(m4883k(bundle, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
/* 1775 */                  String strM4887o6 = m4887o(bundle, logger, "io.sentry.org-id", null);
/* 1779 */                  if (strM4887o6 != null) {
/* 1781 */                      sentryAndroidOptions.setOrgId(strM4887o6);
                            }
/* 1794 */                  sentryAndroidOptions.setEnableSpotlight(m4883k(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
/* 1799 */                  String strM4887o7 = m4887o(bundle, logger, "io.sentry.spotlight.url", null);
/* 1803 */                  if (strM4887o7 != null) {
/* 1805 */                      sentryAndroidOptions.setSpotlightConnectionUrl(strM4887o7);
                            }
/* 1818 */                  sentryAndroidOptions.getScreenshot().mo5393p(m4883k(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
/* 1831 */                  sentryAndroidOptions.getScreenshot().mo4869o(m4883k(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
/* 1838 */                  if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
/* 1842 */                      double dM4884l7 = m4884l(bundle, logger, "io.sentry.anr.profiling.sample-rate");
/* 1848 */                      if (dM4884l7 != -1.0d) {
/* 1854 */                          sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dM4884l7));
                                }
                            }
/* 1867 */                  sentryAndroidOptions.setEnableAnrFingerprinting(m4883k(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
                        }
/* 1880 */              sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
                    } catch (Throwable th) {
/* 1892 */              sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to read configuration from android manifest metadata.", th);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static int m4876d(String str, String str2) {
/* 4 */             m4873a(str, EnumC1553m5.ERROR, str2, null);
/* 9 */             m4874b(EnumC1636q5.ERROR, str2, null);
/* 12 */            return Log.e(str, str2);
                }

                /* JADX INFO: renamed from: e */
                public static int m4877e(String str, String str2, Throwable th) {
/* 3 */             m4873a(str, EnumC1553m5.ERROR, str2, th);
/* 8 */             m4874b(EnumC1636q5.ERROR, str2, th);
/* 11 */            return Log.e(str, str2, th);
                }

                /* JADX INFO: renamed from: f */
                public static String m4878f(ILogger iLogger) {
                    try {
/* 11 */                return Build.MODEL.split(" ", -1)[0];
                    } catch (Throwable th) {
/* 19 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Error getting device family.", th);
/* 22 */                return null;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static ActivityManager.MemoryInfo m4879g(Context context, ILogger iLogger) {
                    try {
/* 10 */                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
/* 14 */                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
/* 17 */                if (activityManager != null) {
/* 19 */                    activityManager.getMemoryInfo(memoryInfo);
/* 22 */                    return memoryInfo;
                        }
/* 30 */                iLogger.mo4672k(EnumC1553m5.INFO, "Error getting MemoryInfo.", new Object[0]);
/* 3 */                 return null;
                    } catch (Throwable th) {
/* 36 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Error getting MemoryInfo.", th);
/* 3 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: h */
                public static PackageInfo m4880h(Context context, C1248o0 c1248o0) {
/* 1 */             c1248o0.getClass();
                    return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f10217a.m1157c(context) : (PackageInfo) f10218b.m1157c(context);
                }

                /* JADX INFO: renamed from: i */
                public static String m4881i(PackageInfo packageInfo, C1248o0 c1248o0) {
/* 1 */             c1248o0.getClass();
                    return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
                }

                /* JADX INFO: renamed from: j */
                public static boolean m4882j() {
                    try {
/* 4 */                 ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
/* 7 */                 ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        return runningAppProcessInfo.importance == 100;
                    } catch (Throwable unused) {
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static boolean m4883k(Bundle bundle, ILogger iLogger, String str, boolean z) {
/* 1 */             boolean z2 = bundle.getBoolean(str, z);
/* 30 */            iLogger.mo4672k(EnumC1553m5.DEBUG, str + " read: " + z2, new Object[0]);
/* 33 */            return z2;
                }

                /* JADX INFO: renamed from: l */
                public static double m4884l(Bundle bundle, ILogger iLogger, String str) {
/* 11 */            double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
/* 19 */            if (dDoubleValue == -1.0d) {
/* 30 */                dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
                    }
/* 59 */            iLogger.mo4672k(EnumC1553m5.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
/* 62 */            return dDoubleValue;
                }

                /* JADX INFO: renamed from: m */
                public static List m4885m(Bundle bundle, ILogger iLogger, String str) {
/* 1 */             String string = bundle.getString(str);
/* 16 */            iLogger.mo4672k(EnumC1553m5.DEBUG, AbstractC0886en.m3508l(str, " read: ", string), new Object[0]);
/* 19 */            if (string != null) {
/* 28 */                return Arrays.asList(string.split(",", -1));
                    }
/* 33 */            return null;
                }

                /* JADX INFO: renamed from: n */
                public static long m4886n(Bundle bundle, ILogger iLogger, String str, long j) {
/* 2 */             long j2 = bundle.getInt(str, (int) j);
/* 32 */            iLogger.mo4672k(EnumC1553m5.DEBUG, str + " read: " + j2, new Object[0]);
/* 35 */            return j2;
                }

                /* JADX INFO: renamed from: o */
                public static String m4887o(Bundle bundle, ILogger iLogger, String str, String str2) {
/* 1 */             String string = bundle.getString(str, str2);
/* 16 */            iLogger.mo4672k(EnumC1553m5.DEBUG, AbstractC0886en.m3508l(str, " read: ", string), new Object[0]);
/* 19 */            return string;
                }

                /* JADX INFO: renamed from: p */
                public static String m4888p(Bundle bundle, ILogger iLogger, String str, String str2) {
/* 1 */             String string = bundle.getString(str, str2);
/* 16 */            iLogger.mo4672k(EnumC1553m5.DEBUG, AbstractC0886en.m3508l(str, " read: ", string), new Object[0]);
/* 19 */            return string;
                }

                /* JADX INFO: renamed from: q */
                public static int m4889q(String str, String str2) {
/* 4 */             m4873a(str, EnumC1553m5.WARNING, str2, null);
/* 9 */             m4874b(EnumC1636q5.WARN, str2, null);
/* 12 */            return Log.w(str, str2);
                }

                /* JADX INFO: renamed from: r */
                public static void m4890r(String str, Exception exc) {
/* 4 */             m4873a(str, EnumC1553m5.WARNING, null, exc);
/* 9 */             m4874b(EnumC1636q5.WARN, null, exc);
                }

                /* JADX INFO: renamed from: s */
                public static void m4891s(String str, String str2, Throwable th) {
/* 3 */             m4873a(str, EnumC1553m5.WARNING, str2, th);
/* 8 */             m4874b(EnumC1636q5.WARN, str2, th);
                }

                /* JADX INFO: renamed from: t */
                public static void m4892t(String str, String str2) {
/* 4 */             m4873a(str, EnumC1553m5.ERROR, str2, null);
/* 9 */             m4874b(EnumC1636q5.FATAL, str2, null);
/* 12 */            Log.wtf(str, str2);
                }

                /* JADX INFO: renamed from: u */
                public static void m4893u(String str, String str2, Throwable th) {
/* 3 */             m4873a(str, EnumC1553m5.ERROR, str2, th);
/* 8 */             m4874b(EnumC1636q5.FATAL, str2, th);
/* 11 */            Log.wtf(str, str2, th);
                }
            }
