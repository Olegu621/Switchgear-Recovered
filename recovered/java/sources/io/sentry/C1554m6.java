            package io.sentry;

            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import io.sentry.android.core.internal.gestures.C1199a;
            import io.sentry.backpressure.C1386c;
            import io.sentry.backpressure.InterfaceC1385b;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.internal.debugmeta.C1504b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.internal.debugmeta.InterfaceC1503a;
            import io.sentry.internal.modules.C1512e;
            import io.sentry.internal.modules.InterfaceC1508a;
            import io.sentry.logger.C1546f;
            import io.sentry.metrics.C1559d;
            import io.sentry.protocol.C1624u;
            import io.sentry.transport.C1683i;
            import io.sentry.transport.C1685k;
            import io.sentry.transport.InterfaceC1682h;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1712k;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import io.sentry.util.C1709h;
            import io.sentry.util.InterfaceC1707f;
            import io.sentry.util.thread.C1719b;
            import io.sentry.util.thread.InterfaceC1718a;
            import java.io.File;
            import java.lang.reflect.InvocationTargetException;
            import java.math.BigInteger;
            import java.nio.charset.Charset;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.atomic.AtomicBoolean;
            import javax.net.ssl.SSLSocketFactory;
            
            /* JADX INFO: renamed from: io.sentry.m6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1554m6 {
                static final EnumC1553m5 DEFAULT_DIAGNOSTIC_LEVEL = EnumC1553m5.DEBUG;
                private static final String DEFAULT_ENVIRONMENT = "production";
                public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
                public static final long MAX_EVENT_SIZE_BYTES = 1048576;
                private InterfaceC1561n0 appStartExtender;
                private boolean attachServerName;
                private boolean attachStacktrace;
                private boolean attachThreads;
                private InterfaceC1385b backpressureMonitor;
                private InterfaceC1747x5 beforeBreadcrumb;
                private InterfaceC1755y5 beforeEnvelopeCallback;
                private InterfaceC1763z5 beforeSend;
                private InterfaceC1763z5 beforeSendFeedback;
                private InterfaceC1161a6 beforeSendReplay;
                private InterfaceC1382b6 beforeSendTransaction;
                private String cacheDirPath;
                private boolean captureOpenTelemetryEvents;
                InterfaceC1416f clientReportRecorder;
                private InterfaceC1547m compositePerformanceCollector;
                private InterfaceC1631q0 connectionStatusProvider;
                private int connectionTimeoutMillis;
                private final List<String> contextTags;
                private InterfaceC1639r0 continuousProfiler;
                private C1394c6 cron;
                private final C1708g dateProvider;
                private long deadlineTimeout;
                private boolean debug;
                private InterfaceC1503a debugMetaLoader;
                private EnumC1448f4 defaultScopeType;
                private final List<String> defaultTracePropagationTargets;
                private EnumC1553m5 diagnosticLevel;
                private String dist;
                private String distinctId;
                private C1429d6 distribution;
                private InterfaceC1660s0 distributionController;
                private String dsn;
                private String dsnHash;
                private boolean enableAppStartProfiling;
                private boolean enableAutoSessionTracking;
                private boolean enableBackpressureHandling;
                private boolean enableCacheTracing;
                private boolean enableDatabaseTransactionTracing;
                private boolean enableDeduplication;
                private boolean enableEventSizeLimiting;
                private boolean enableExternalConfiguration;
                private boolean enablePrettySerializationOutput;
                private boolean enableQueueTracing;
                private boolean enableScopePersistence;
                private boolean enableScreenTracking;
                private boolean enableShutdownHook;
                private boolean enableSpotlight;
                private boolean enableTimeToFullDisplayTracing;
                private boolean enableUncaughtExceptionHandler;
                private boolean enableUserInteractionBreadcrumbs;
                private boolean enableUserInteractionTracing;
                private boolean enabled;
                private InterfaceC1399d envelopeDiskCache;
                private final C1708g envelopeReader;
                private String environment;
                private InterfaceC1457g1 executorService;
                private final C1423d0 experimental;
                private ILogger fatalLogger;
                private C1470h5 feedbackOptions;
                private boolean forceInit;
                private C1465h0 fullyDisplayedReporter;
                private final List<C1199a> gestureTargetLocators;
                private Boolean globalHubMode;
                private Long idleTimeout;
                private List<C1456g0> ignoredCheckIns;
                private List<C1456g0> ignoredSpanOrigins;
                private List<C1456g0> ignoredTransactions;
                private final List<String> inAppExcludes;
                private final List<String> inAppIncludes;
                private EnumC1632q1 initPriority;
                private EnumC1640r1 instrumenter;
                private volatile C1493i7 internalTracesSampler;
                protected final C1702a lock;
                private ILogger logger;
                private C1438e6 logs;
                private long maxAttachmentSize;
                private int maxBreadcrumbs;
                private int maxCacheItems;
                private int maxDepth;
                private int maxFeatureFlags;
                private int maxQueueSize;
                private EnumC1530k6 maxRequestBodySize;
                private int maxSpans;
                private long maxTraceFileSize;
                private C1450f6 metrics;
                private InterfaceC1508a modulesLoader;
                private final List<InterfaceC1377b1> observers;
                private InterfaceC1462g6 onDiscard;
                private InterfaceC1471h6 onOversizedEvent;
                private EnumC1727v5 openTelemetryMode;
                private final List<InterfaceC1734w0> optionsObservers;
                private String orgId;
                private final C1708g parsedDsn;
                private final List<InterfaceC1742x0> performanceCollectors;
                private boolean printUncaughtStackTrace;
                private EnumC1634q3 profileLifecycle;
                private Double profileSessionSampleRate;
                private InterfaceC1758z0 profilerConverter;
                private Double profilesSampleRate;
                private InterfaceC1492i6 profilesSampler;
                private String profilingTracesDirPath;
                private int profilingTracesHz;
                private String proguardUuid;
                private boolean propagateTraceparent;
                private C1521j6 proxy;
                private int readTimeoutMillis;
                private String release;
                private InterfaceC1725v3 replayController;
                private Double sampleRate;
                private InterfaceC1433e1 scopesStorageFactory;
                private C1624u sdkVersion;
                private boolean sendClientReports;
                private boolean sendDefaultPii;
                private boolean sendModules;
                private String sentryClientName;
                private final C1708g serializer;
                private String serverName;
                private C1637q6 sessionReplay;
                private long sessionTrackingIntervalMillis;
                private InterfaceC1516j1 socketTagger;
                private InterfaceC1534l1 spanFactory;
                private String spotlightConnectionUrl;
                private final AtomicBoolean spotlightIntegrationLoaded;
                private SSLSocketFactory sslSocketFactory;
                private boolean startProfilerOnAppStart;
                private boolean strictTraceContinuation;
                private final Map<String, String> tags;
                private InterfaceC1718a threadChecker;
                private boolean traceOptionsRequests;
                private List<String> tracePropagationTargets;
                private boolean traceSampling;
                private Double tracesSampleRate;
                private InterfaceC1539l6 tracesSampler;
                private InterfaceC1562n1 transactionProfiler;
                private InterfaceC1571o1 transportFactory;
                private InterfaceC1682h transportGate;
                private InterfaceC1579p1 versionDetector;
                private final List<Object> viewHierarchyExporters;
                private final List<InterfaceC1388c0> eventProcessors = new CopyOnWriteArrayList();
                private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
                private List<C1456g0> ignoredErrors = null;
                private final List<InterfaceC1661s1> integrations = new CopyOnWriteArrayList();
                private final Set<String> bundleIds = new CopyOnWriteArraySet();
                private long shutdownTimeoutMillis = 2000;
                private long flushTimeoutMillis = 15000;
                private long sessionFlushTimeoutMillis = 15000;

                /* JADX WARN: Code duplicated, block: B:17:0x029e  */
                public C1554m6(boolean z) {
                    InterfaceC1534l1 c1435e3;
                    Class clsM5475f;
/* 39 */            final int i = 0;
/* 46 */            this.parsedDsn = new C1708g(new InterfaceC1707f(this) { // from class: io.sentry.w5

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1554m6 f11804b;

                        {
/* 3 */                     this.f11804b = this;
                        }

                        @Override // io.sentry.util.InterfaceC1707f
                        /* JADX INFO: renamed from: b */
                        public final Object mo4803b() {
/* 1 */                     int i2 = i;
/* 3 */                     C1554m6 c1554m6 = this.f11804b;
                            switch (i2) {
                                case 0:
/* 19 */                            return C1554m6.m5364a(c1554m6);
                                case 1:
/* 15 */                            return new C1467h2(c1554m6);
                                default:
/* 8 */                             return C1554m6.m5365b(c1554m6);
                            }
                        }
                    });
/* 58 */            C1641r2 c1641r2 = C1641r2.f11545a;
/* 60 */            this.logger = c1641r2;
/* 62 */            this.fatalLogger = c1641r2;
/* 66 */            this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
/* 72 */            final int i2 = 1;
/* 79 */            this.serializer = new C1708g(new InterfaceC1707f(this) { // from class: io.sentry.w5

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1554m6 f11804b;

                        {
/* 3 */                     this.f11804b = this;
                        }

                        @Override // io.sentry.util.InterfaceC1707f
                        /* JADX INFO: renamed from: b */
                        public final Object mo4803b() {
/* 1 */                     int i3 = i2;
/* 3 */                     C1554m6 c1554m6 = this.f11804b;
                            switch (i3) {
                                case 0:
/* 19 */                            return C1554m6.m5364a(c1554m6);
                                case 1:
/* 15 */                            return new C1467h2(c1554m6);
                                default:
/* 8 */                             return C1554m6.m5365b(c1554m6);
                            }
                        }
                    });
/* 85 */            final int i3 = 2;
/* 92 */            this.envelopeReader = new C1708g(new InterfaceC1707f(this) { // from class: io.sentry.w5

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1554m6 f11804b;

                        {
/* 3 */                     this.f11804b = this;
                        }

                        @Override // io.sentry.util.InterfaceC1707f
                        /* JADX INFO: renamed from: b */
                        public final Object mo4803b() {
/* 1 */                     int i4 = i3;
/* 3 */                     C1554m6 c1554m6 = this.f11804b;
                            switch (i4) {
                                case 0:
/* 19 */                            return C1554m6.m5364a(c1554m6);
                                case 1:
/* 15 */                            return new C1467h2(c1554m6);
                                default:
/* 8 */                             return C1554m6.m5365b(c1554m6);
                            }
                        }
                    });
/* 96 */            this.maxDepth = 100;
/* 100 */           this.maxCacheItems = 30;
/* 102 */           this.maxQueueSize = 30;
/* 104 */           this.maxBreadcrumbs = 100;
/* 106 */           this.maxFeatureFlags = 100;
/* 113 */           this.inAppExcludes = new CopyOnWriteArrayList();
/* 120 */           this.inAppIncludes = new CopyOnWriteArrayList();
/* 124 */           this.transportFactory = C1459g3.f10952a;
/* 128 */           this.transportGate = C1685k.f11700a;
/* 130 */           this.attachStacktrace = true;
/* 132 */           this.enableAutoSessionTracking = true;
/* 136 */           this.sessionTrackingIntervalMillis = 30000L;
/* 138 */           this.attachServerName = true;
/* 140 */           this.enableUncaughtExceptionHandler = true;
/* 142 */           this.printUncaughtStackTrace = false;
/* 146 */           this.executorService = C1158a3.f9797a;
/* 153 */           this.spotlightIntegrationLoaded = new AtomicBoolean(false);
/* 157 */           this.connectionTimeoutMillis = 30000;
/* 159 */           this.readTimeoutMillis = 30000;
/* 163 */           this.envelopeDiskCache = C1683i.f11698a;
/* 165 */           this.sendDefaultPii = false;
/* 172 */           this.observers = new CopyOnWriteArrayList();
/* 179 */           this.optionsObservers = new CopyOnWriteArrayList();
/* 186 */           this.tags = new ConcurrentHashMap();
/* 191 */           this.maxAttachmentSize = 20971520L;
/* 193 */           this.enableDeduplication = true;
/* 195 */           this.enableEventSizeLimiting = false;
/* 199 */           this.maxSpans = 1000;
/* 201 */           this.enableShutdownHook = true;
/* 205 */           this.maxRequestBodySize = EnumC1530k6.NONE;
/* 207 */           this.traceSampling = true;
/* 212 */           this.maxTraceFileSize = 5242880L;
/* 216 */           this.transactionProfiler = C1535l2.f11115e;
/* 220 */           this.continuousProfiler = C1572o2.f11186a;
/* 224 */           this.profilerConverter = C1662s2.f11640a;
/* 226 */           this.tracePropagationTargets = null;
/* 234 */           this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
/* 236 */           this.propagateTraceparent = false;
/* 238 */           this.strictTraceContinuation = false;
/* 246 */           this.idleTimeout = 3000L;
/* 253 */           this.contextTags = new CopyOnWriteArrayList();
/* 255 */           this.sendClientReports = true;
/* 262 */           this.clientReportRecorder = new C1505c(this);
/* 266 */           this.modulesLoader = C1512e.f11057a;
/* 270 */           this.debugMetaLoader = C1504b.f11040a;
/* 272 */           this.enableUserInteractionTracing = false;
/* 274 */           this.enableUserInteractionBreadcrumbs = true;
/* 278 */           this.instrumenter = EnumC1640r1.SENTRY;
/* 285 */           this.gestureTargetLocators = new ArrayList();
/* 292 */           this.viewHierarchyExporters = new ArrayList();
/* 296 */           this.threadChecker = C1719b.f11746a;
/* 298 */           this.traceOptionsRequests = true;
/* 300 */           this.enableDatabaseTransactionTracing = false;
/* 302 */           this.enableCacheTracing = false;
/* 304 */           this.enableQueueTracing = false;
/* 317 */           this.dateProvider = new C1708g(new C1697u2(5));
/* 324 */           this.performanceCollectors = new ArrayList();
/* 328 */           this.compositePerformanceCollector = C1550m2.f11135a;
/* 330 */           this.enableTimeToFullDisplayTracing = false;
/* 334 */           this.fullyDisplayedReporter = C1465h0.f10970b;
/* 338 */           this.appStartExtender = C1535l2.f11111a;
/* 345 */           this.connectionStatusProvider = new C1563n2();
/* 347 */           this.enabled = true;
/* 349 */           this.enablePrettySerializationOutput = true;
/* 351 */           this.sendModules = true;
/* 353 */           this.enableSpotlight = false;
/* 355 */           this.enableScopePersistence = true;
/* 357 */           this.ignoredCheckIns = null;
/* 359 */           this.ignoredSpanOrigins = null;
/* 361 */           this.ignoredTransactions = null;
/* 365 */           this.backpressureMonitor = C1386c.f10769a;
/* 367 */           this.enableBackpressureHandling = true;
/* 369 */           this.enableAppStartProfiling = false;
/* 373 */           this.spanFactory = C1435e3.f10912b;
/* 377 */           this.profilingTracesHz = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
/* 379 */           this.cron = null;
/* 383 */           this.replayController = C1535l2.f11114d;
/* 387 */           this.distributionController = C1535l2.f11112b;
/* 389 */           this.enableScreenTracking = true;
/* 393 */           this.defaultScopeType = EnumC1448f4.ISOLATION;
/* 397 */           this.initPriority = EnumC1632q1.MEDIUM;
/* 399 */           this.forceInit = false;
/* 401 */           this.globalHubMode = null;
/* 408 */           this.lock = new C1702a();
/* 412 */           this.openTelemetryMode = EnumC1727v5.AUTO;
/* 414 */           this.captureOpenTelemetryEvents = false;
/* 418 */           this.versionDetector = C1468h3.f10975a;
/* 422 */           this.profileLifecycle = EnumC1634q3.MANUAL;
/* 424 */           this.startProfilerOnAppStart = false;
/* 426 */           this.deadlineTimeout = 30000L;
/* 430 */           C1438e6 c1438e6 = new C1438e6();
/* 433 */           c1438e6.f10914a = false;
/* 440 */           c1438e6.f10915b = new C1546f();
/* 442 */           this.logs = c1438e6;
/* 446 */           C1450f6 c1450f6 = new C1450f6();
/* 449 */           c1450f6.f10940a = true;
/* 456 */           c1450f6.f10941b = new C1559d();
/* 458 */           this.metrics = c1450f6;
/* 462 */           this.socketTagger = C1391c3.f10780a;
/* 469 */           this.distribution = new C1429d6();
/* 477 */           C1624u c1624u = new C1624u("sentry.java", "8.48.0");
/* 480 */           c1624u.f11467b = "8.48.0";
/* 487 */           this.experimental = new C1423d0();
/* 491 */           C1637q6 c1637q6 = new C1637q6();
/* 494 */           c1637q6.f11526c = false;
/* 498 */           c1637q6.f11529f = EnumC1584p6.MEDIUM;
/* 500 */           c1637q6.f11530g = 1;
/* 502 */           c1637q6.f11531h = 30000L;
/* 506 */           c1637q6.f11532i = 5000L;
/* 511 */           c1637q6.f11533j = 3600000L;
/* 513 */           c1637q6.f11534k = true;
/* 515 */           c1637q6.f11536m = false;
/* 519 */           c1637q6.f11537n = EnumC1490i4.PIXEL_COPY;
/* 521 */           c1637q6.f11538o = false;
/* 523 */           List list = Collections.EMPTY_LIST;
/* 525 */           c1637q6.f11539p = list;
/* 527 */           c1637q6.f11540q = list;
/* 529 */           c1637q6.f11541r = true;
/* 531 */           List list2 = C1637q6.f11525u;
/* 533 */           c1637q6.f11542s = list2;
/* 535 */           c1637q6.f11543t = list2;
/* 537 */           if (!z) {
/* 545 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("android.widget.TextView");
/* 554 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("android.widget.ImageView");
/* 563 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("android.webkit.WebView");
/* 572 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("android.widget.VideoView");
/* 581 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("androidx.camera.view.PreviewView");
/* 590 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("androidx.media3.ui.PlayerView");
/* 599 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("com.google.android.exoplayer2.ui.PlayerView");
/* 608 */               ((CopyOnWriteArraySet) c1637q6.f17000a).add("com.google.android.exoplayer2.ui.StyledPlayerView");
/* 611 */               c1637q6.f11535l = c1624u;
                    }
/* 613 */           this.sessionReplay = c1637q6;
/* 617 */           C1470h5 c1470h5 = new C1470h5();
/* 620 */           c1470h5.f10977a = false;
/* 622 */           c1470h5.f10978b = true;
/* 624 */           c1470h5.f10979c = false;
/* 626 */           c1470h5.f10980d = true;
/* 628 */           c1470h5.f10981e = true;
/* 630 */           c1470h5.f10982f = true;
/* 632 */           c1470h5.f10983g = false;
/* 634 */           this.feedbackOptions = c1470h5;
/* 636 */           if (z) {
/* 752 */               return;
                    }
/* 640 */           if (AbstractC1712k.f11736a || !C1709h.m5474d("io.sentry.opentelemetry.OtelSpanFactory", c1641r2) || (clsM5475f = C1709h.m5475f(c1641r2, "io.sentry.opentelemetry.OtelSpanFactory", true)) == null) {
/* 673 */               c1435e3 = new C1435e3(i2);
                    } else {
                        try {
/* 660 */                   Object objNewInstance = clsM5475f.getDeclaredConstructor(null).newInstance(null);
/* 666 */                   if (objNewInstance instanceof InterfaceC1534l1) {
/* 668 */                       c1435e3 = (InterfaceC1534l1) objNewInstance;
                            } else {
/* 673 */                       c1435e3 = new C1435e3(i2);
                            }
                        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
/* 676 */           setSpanFactory(c1435e3);
/* 679 */           List<InterfaceC1661s1> list3 = this.integrations;
/* 683 */           UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = new UncaughtExceptionHandlerIntegration();
/* 686 */           uncaughtExceptionHandlerIntegration.f9786d = false;
/* 688 */           list3.add(uncaughtExceptionHandlerIntegration);
/* 698 */           this.integrations.add(new ShutdownHookIntegration());
/* 708 */           this.eventProcessors.add(new C1488i2(this));
/* 718 */           this.eventProcessors.add(new C1569o(this));
/* 723 */           if (!AbstractC1712k.f11736a) {
/* 732 */               this.eventProcessors.add(new C1645r6());
                    }
/* 737 */           setSentryClientName("sentry.java/8.48.0");
/* 740 */           setSdkVersion(c1624u);
/* 749 */           C1529k5.m5336d().m5338b("maven:io.sentry:sentry", "8.48.0");
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ C1757z m5364a(C1554m6 c1554m6) {
/* 5 */             return new C1757z(c1554m6.dsn);
                }

                /* JADX INFO: renamed from: b */
                public static /* synthetic */ C1155a0 m5365b(C1554m6 c1554m6) {
/* 11 */            return new C1155a0((InterfaceC1487i1) c1554m6.serializer.m5471a());
                }

                public static C1554m6 empty() {
/* 4 */             return new C1554m6(true);
                }

                public void activate() {
/* 5 */             if (this.executorService instanceof C1158a3) {
/* 12 */                this.executorService = new C1461g5(this);
                    }
/* 22 */            if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
                        try {
/* 43 */                    this.integrations.add((InterfaceC1661s1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
                        } catch (Throwable unused) {
                        }
                    }
                }

                public void addBundleId(String str) {
/* 1 */             if (str != null) {
/* 3 */                 String strTrim = str.trim();
/* 11 */                if (strTrim.isEmpty()) {
/* 18 */                    return;
                        }
/* 15 */                this.bundleIds.add(strTrim);
                    }
                }

                public void addContextTag(String str) {
/* 3 */             this.contextTags.add(str);
                }

                public void addEventProcessor(InterfaceC1388c0 interfaceC1388c0) {
/* 3 */             this.eventProcessors.add(interfaceC1388c0);
                }

                public void addIgnoredCheckIn(String str) {
/* 3 */             if (this.ignoredCheckIns == null) {
/* 10 */                this.ignoredCheckIns = new ArrayList();
                    }
/* 19 */            this.ignoredCheckIns.add(new C1456g0(str));
                }

                public void addIgnoredError(String str) {
/* 3 */             if (this.ignoredErrors == null) {
/* 10 */                this.ignoredErrors = new ArrayList();
                    }
/* 19 */            this.ignoredErrors.add(new C1456g0(str));
                }

                public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
/* 3 */             this.ignoredExceptionsForType.add(cls);
                }

                public void addIgnoredSpanOrigin(String str) {
/* 3 */             if (this.ignoredSpanOrigins == null) {
/* 10 */                this.ignoredSpanOrigins = new ArrayList();
                    }
/* 19 */            this.ignoredSpanOrigins.add(new C1456g0(str));
                }

                public void addIgnoredTransaction(String str) {
/* 3 */             if (this.ignoredTransactions == null) {
/* 10 */                this.ignoredTransactions = new ArrayList();
                    }
/* 19 */            this.ignoredTransactions.add(new C1456g0(str));
                }

                public void addInAppExclude(String str) {
/* 3 */             this.inAppExcludes.add(str);
                }

                public void addInAppInclude(String str) {
/* 3 */             this.inAppIncludes.add(str);
                }

                public void addIntegration(InterfaceC1661s1 interfaceC1661s1) {
/* 3 */             this.integrations.add(interfaceC1661s1);
                }

                public void addOptionsObserver(InterfaceC1734w0 interfaceC1734w0) {
/* 3 */             this.optionsObservers.add(interfaceC1734w0);
                }

                public void addPerformanceCollector(InterfaceC1742x0 interfaceC1742x0) {
/* 3 */             this.performanceCollectors.add(interfaceC1742x0);
                }

                public void addScopeObserver(InterfaceC1377b1 interfaceC1377b1) {
/* 3 */             this.observers.add(interfaceC1377b1);
                }

                public boolean containsIgnoredExceptionForType(Throwable th) {
/* 7 */             return this.ignoredExceptionsForType.contains(th.getClass());
                }

                public C1401f findPersistingScopeObserver() {
/* 11 */            for (InterfaceC1377b1 interfaceC1377b1 : this.observers) {
/* 21 */                if (interfaceC1377b1 instanceof C1401f) {
/* 23 */                    return (C1401f) interfaceC1377b1;
                        }
                    }
/* 26 */            return null;
                }

                public InterfaceC1561n0 getAppStartExtender() {
/* 1 */             return this.appStartExtender;
                }

                public InterfaceC1385b getBackpressureMonitor() {
/* 1 */             return this.backpressureMonitor;
                }

                public InterfaceC1747x5 getBeforeBreadcrumb() {
/* 1 */             return this.beforeBreadcrumb;
                }

                public InterfaceC1755y5 getBeforeEnvelopeCallback() {
/* 1 */             return null;
                }

                public InterfaceC1763z5 getBeforeSend() {
/* 1 */             return null;
                }

                public InterfaceC1763z5 getBeforeSendFeedback() {
/* 1 */             return null;
                }

                public InterfaceC1161a6 getBeforeSendReplay() {
/* 1 */             return null;
                }

                public InterfaceC1382b6 getBeforeSendTransaction() {
/* 1 */             return this.beforeSendTransaction;
                }

                public Set<String> getBundleIds() {
/* 1 */             return this.bundleIds;
                }

                public String getCacheDirPath() {
/* 1 */             String str = this.cacheDirPath;
/* 3 */             if (str == null || str.isEmpty()) {
/* 33 */                return null;
                    }
                    return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
                }

                public String getCacheDirPathWithoutDsn() {
/* 1 */             String str = this.cacheDirPath;
/* 3 */             if (str == null || str.isEmpty()) {
/* 15 */                return null;
                    }
/* 12 */            return this.cacheDirPath;
                }

                public InterfaceC1416f getClientReportRecorder() {
/* 1 */             return this.clientReportRecorder;
                }

                public InterfaceC1547m getCompositePerformanceCollector() {
/* 1 */             return this.compositePerformanceCollector;
                }

                public InterfaceC1631q0 getConnectionStatusProvider() {
/* 1 */             return this.connectionStatusProvider;
                }

                public int getConnectionTimeoutMillis() {
/* 1 */             return this.connectionTimeoutMillis;
                }

                public List<String> getContextTags() {
/* 1 */             return this.contextTags;
                }

                public InterfaceC1639r0 getContinuousProfiler() {
/* 1 */             return this.continuousProfiler;
                }

                public C1394c6 getCron() {
/* 1 */             return this.cron;
                }

                public InterfaceC1699u4 getDateProvider() {
/* 7 */             return (InterfaceC1699u4) this.dateProvider.m5471a();
                }

                public long getDeadlineTimeout() {
/* 1 */             return this.deadlineTimeout;
                }

                public InterfaceC1503a getDebugMetaLoader() {
/* 1 */             return this.debugMetaLoader;
                }

                public EnumC1448f4 getDefaultScopeType() {
/* 1 */             return this.defaultScopeType;
                }

                public EnumC1553m5 getDiagnosticLevel() {
/* 1 */             return this.diagnosticLevel;
                }

                public String getDist() {
/* 1 */             return this.dist;
                }

                public String getDistinctId() {
/* 1 */             return this.distinctId;
                }

                public C1429d6 getDistribution() {
/* 1 */             return this.distribution;
                }

                public InterfaceC1660s0 getDistributionController() {
/* 1 */             return this.distributionController;
                }

                public String getDsn() {
/* 1 */             return this.dsn;
                }

                public String getEffectiveOrgId() {
/* 1 */             String str = this.orgId;
/* 3 */             if (str != null) {
/* 5 */                 String strTrim = str.trim();
/* 13 */                if (!strTrim.isEmpty()) {
/* 15 */                    return strTrim;
                        }
                    }
                    try {
/* 20 */                return retrieveParsedDsn().f11847d;
                    } catch (Throwable unused) {
/* 23 */                return null;
                    }
                }

                public InterfaceC1399d getEnvelopeDiskCache() {
/* 1 */             return this.envelopeDiskCache;
                }

                public InterfaceC1668t0 getEnvelopeReader() {
/* 7 */             return (InterfaceC1668t0) this.envelopeReader.m5471a();
                }

                public String getEnvironment() {
/* 1 */             String str = this.environment;
                    return str != null ? str : DEFAULT_ENVIRONMENT;
                }

                public List<InterfaceC1388c0> getEventProcessors() {
/* 1 */             return this.eventProcessors;
                }

                public InterfaceC1457g1 getExecutorService() {
/* 1 */             return this.executorService;
                }

                public C1423d0 getExperimental() {
/* 1 */             return this.experimental;
                }

                public ILogger getFatalLogger() {
/* 1 */             return this.fatalLogger;
                }

                public C1470h5 getFeedbackOptions() {
/* 1 */             return this.feedbackOptions;
                }

                public long getFlushTimeoutMillis() {
/* 1 */             return this.flushTimeoutMillis;
                }

                public C1465h0 getFullyDisplayedReporter() {
/* 1 */             return this.fullyDisplayedReporter;
                }

                public List<C1199a> getGestureTargetLocators() {
/* 1 */             return this.gestureTargetLocators;
                }

                public Long getIdleTimeout() {
/* 1 */             return this.idleTimeout;
                }

                public List<C1456g0> getIgnoredCheckIns() {
/* 1 */             return this.ignoredCheckIns;
                }

                public List<C1456g0> getIgnoredErrors() {
/* 1 */             return this.ignoredErrors;
                }

                public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
/* 1 */             return this.ignoredExceptionsForType;
                }

                public List<C1456g0> getIgnoredSpanOrigins() {
/* 1 */             return this.ignoredSpanOrigins;
                }

                public List<C1456g0> getIgnoredTransactions() {
/* 1 */             return this.ignoredTransactions;
                }

                public List<String> getInAppExcludes() {
/* 1 */             return this.inAppExcludes;
                }

                public List<String> getInAppIncludes() {
/* 1 */             return this.inAppIncludes;
                }

                public EnumC1632q1 getInitPriority() {
/* 1 */             return this.initPriority;
                }

                public EnumC1640r1 getInstrumenter() {
/* 1 */             return this.instrumenter;
                }

                public List<InterfaceC1661s1> getIntegrations() {
/* 1 */             return this.integrations;
                }

                public C1493i7 getInternalTracesSampler() {
/* 3 */             if (this.internalTracesSampler == null) {
/* 5 */                 C1702a c1702a = this.lock;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (this.internalTracesSampler == null) {
/* 19 */                        this.internalTracesSampler = new C1493i7(this);
                            }
/* 24 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 28 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 33 */                        th.addSuppressed(th2);
                            }
/* 36 */                    throw th;
                        }
                    }
/* 37 */            return this.internalTracesSampler;
                }

                public ILogger getLogger() {
/* 1 */             return this.logger;
                }

                public C1438e6 getLogs() {
/* 1 */             return this.logs;
                }

                public long getMaxAttachmentSize() {
/* 1 */             return this.maxAttachmentSize;
                }

                public int getMaxBreadcrumbs() {
/* 1 */             return this.maxBreadcrumbs;
                }

                public int getMaxCacheItems() {
/* 1 */             return this.maxCacheItems;
                }

                public int getMaxDepth() {
/* 1 */             return this.maxDepth;
                }

                public int getMaxFeatureFlags() {
/* 1 */             return this.maxFeatureFlags;
                }

                public int getMaxQueueSize() {
/* 1 */             return this.maxQueueSize;
                }

                public EnumC1530k6 getMaxRequestBodySize() {
/* 1 */             return this.maxRequestBodySize;
                }

                public int getMaxSpans() {
/* 1 */             return this.maxSpans;
                }

                public long getMaxTraceFileSize() {
/* 1 */             return this.maxTraceFileSize;
                }

                public C1450f6 getMetrics() {
/* 1 */             return this.metrics;
                }

                public InterfaceC1508a getModulesLoader() {
/* 1 */             return this.modulesLoader;
                }

                public InterfaceC1462g6 getOnDiscard() {
/* 1 */             return null;
                }

                public InterfaceC1471h6 getOnOversizedEvent() {
/* 1 */             return null;
                }

                public EnumC1727v5 getOpenTelemetryMode() {
/* 1 */             return this.openTelemetryMode;
                }

                public List<InterfaceC1734w0> getOptionsObservers() {
/* 1 */             return this.optionsObservers;
                }

                public String getOrgId() {
/* 1 */             return this.orgId;
                }

                public String getOutboxPath() {
/* 1 */             String cacheDirPath = getCacheDirPath();
/* 5 */             if (cacheDirPath == null) {
/* 7 */                 return null;
                    }
/* 16 */            return new File(cacheDirPath, "outbox").getAbsolutePath();
                }

                public List<InterfaceC1742x0> getPerformanceCollectors() {
/* 1 */             return this.performanceCollectors;
                }

                public EnumC1634q3 getProfileLifecycle() {
/* 1 */             return this.profileLifecycle;
                }

                public Double getProfileSessionSampleRate() {
/* 1 */             return this.profileSessionSampleRate;
                }

                public InterfaceC1758z0 getProfilerConverter() {
/* 1 */             return this.profilerConverter;
                }

                public Double getProfilesSampleRate() {
/* 1 */             return this.profilesSampleRate;
                }

                public InterfaceC1492i6 getProfilesSampler() {
/* 1 */             return null;
                }

                public String getProfilingTracesDirPath() {
/* 1 */             String str = this.profilingTracesDirPath;
/* 3 */             if (str != null && !str.isEmpty()) {
                        return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
                    }
/* 32 */            String cacheDirPath = getCacheDirPath();
/* 36 */            if (cacheDirPath == null) {
/* 38 */                return null;
                    }
/* 47 */            return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
                }

                public int getProfilingTracesHz() {
/* 1 */             return this.profilingTracesHz;
                }

                public String getProguardUuid() {
/* 1 */             return this.proguardUuid;
                }

                public C1521j6 getProxy() {
/* 1 */             return this.proxy;
                }

                public int getReadTimeoutMillis() {
/* 1 */             return this.readTimeoutMillis;
                }

                public String getRelease() {
/* 1 */             return this.release;
                }

                public InterfaceC1725v3 getReplayController() {
/* 1 */             return this.replayController;
                }

                public Double getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public List<InterfaceC1377b1> getScopeObservers() {
/* 1 */             return this.observers;
                }

                public InterfaceC1433e1 getScopesStorageFactory() {
/* 1 */             return null;
                }

                public C1624u getSdkVersion() {
/* 1 */             return this.sdkVersion;
                }

                public String getSentryClientName() {
/* 1 */             return this.sentryClientName;
                }

                public InterfaceC1487i1 getSerializer() {
/* 7 */             return (InterfaceC1487i1) this.serializer.m5471a();
                }

                public String getServerName() {
/* 1 */             return this.serverName;
                }

                public long getSessionFlushTimeoutMillis() {
/* 1 */             return this.sessionFlushTimeoutMillis;
                }

                public C1637q6 getSessionReplay() {
/* 1 */             return this.sessionReplay;
                }

                public long getSessionTrackingIntervalMillis() {
/* 1 */             return this.sessionTrackingIntervalMillis;
                }

                public long getShutdownTimeoutMillis() {
/* 1 */             return this.shutdownTimeoutMillis;
                }

                public InterfaceC1516j1 getSocketTagger() {
/* 1 */             return this.socketTagger;
                }

                public InterfaceC1534l1 getSpanFactory() {
/* 1 */             return this.spanFactory;
                }

                public String getSpotlightConnectionUrl() {
/* 1 */             return this.spotlightConnectionUrl;
                }

                public SSLSocketFactory getSslSocketFactory() {
/* 1 */             return this.sslSocketFactory;
                }

                public Map<String, String> getTags() {
/* 1 */             return this.tags;
                }

                public InterfaceC1718a getThreadChecker() {
/* 1 */             return this.threadChecker;
                }

                public List<String> getTracePropagationTargets() {
/* 1 */             List<String> list = this.tracePropagationTargets;
                    return list == null ? this.defaultTracePropagationTargets : list;
                }

                public Double getTracesSampleRate() {
/* 1 */             return this.tracesSampleRate;
                }

                public InterfaceC1539l6 getTracesSampler() {
/* 1 */             return null;
                }

                public InterfaceC1562n1 getTransactionProfiler() {
/* 1 */             return this.transactionProfiler;
                }

                public InterfaceC1571o1 getTransportFactory() {
/* 1 */             return this.transportFactory;
                }

                public InterfaceC1682h getTransportGate() {
/* 1 */             return this.transportGate;
                }

                public InterfaceC1579p1 getVersionDetector() {
/* 1 */             return this.versionDetector;
                }

                public final List<Object> getViewHierarchyExporters() {
/* 1 */             return this.viewHierarchyExporters;
                }

                public boolean isAttachServerName() {
/* 1 */             return this.attachServerName;
                }

                public boolean isAttachStacktrace() {
/* 1 */             return this.attachStacktrace;
                }

                public boolean isAttachThreads() {
/* 1 */             return this.attachThreads;
                }

                public boolean isCaptureOpenTelemetryEvents() {
/* 1 */             return this.captureOpenTelemetryEvents;
                }

                public boolean isContinuousProfilingEnabled() {
                    Double d;
                    return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
                }

                public boolean isDebug() {
/* 1 */             return this.debug;
                }

                public boolean isEnableAppStartProfiling() {
                    return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
                }

                public boolean isEnableAutoSessionTracking() {
/* 1 */             return this.enableAutoSessionTracking;
                }

                public boolean isEnableBackpressureHandling() {
/* 1 */             return this.enableBackpressureHandling;
                }

                public boolean isEnableCacheTracing() {
/* 1 */             return this.enableCacheTracing;
                }

                public boolean isEnableDatabaseTransactionTracing() {
/* 1 */             return this.enableDatabaseTransactionTracing;
                }

                public boolean isEnableDeduplication() {
/* 1 */             return this.enableDeduplication;
                }

                public boolean isEnableEventSizeLimiting() {
/* 1 */             return this.enableEventSizeLimiting;
                }

                public boolean isEnableExternalConfiguration() {
/* 1 */             return this.enableExternalConfiguration;
                }

                public boolean isEnablePrettySerializationOutput() {
/* 1 */             return this.enablePrettySerializationOutput;
                }

                public boolean isEnableQueueTracing() {
/* 1 */             return this.enableQueueTracing;
                }

                public boolean isEnableScopePersistence() {
/* 1 */             return this.enableScopePersistence;
                }

                public boolean isEnableScreenTracking() {
/* 1 */             return this.enableScreenTracking;
                }

                public boolean isEnableShutdownHook() {
/* 1 */             return this.enableShutdownHook;
                }

                public boolean isEnableSpotlight() {
/* 1 */             return this.enableSpotlight;
                }

                public boolean isEnableTimeToFullDisplayTracing() {
/* 1 */             return this.enableTimeToFullDisplayTracing;
                }

                public boolean isEnableUncaughtExceptionHandler() {
/* 1 */             return this.enableUncaughtExceptionHandler;
                }

                public boolean isEnableUserInteractionBreadcrumbs() {
/* 1 */             return this.enableUserInteractionBreadcrumbs;
                }

                public boolean isEnableUserInteractionTracing() {
/* 1 */             return this.enableUserInteractionTracing;
                }

                public boolean isEnabled() {
/* 1 */             return this.enabled;
                }

                public boolean isForceInit() {
/* 1 */             return this.forceInit;
                }

                public Boolean isGlobalHubMode() {
/* 1 */             return this.globalHubMode;
                }

                public boolean isPrintUncaughtStackTrace() {
/* 1 */             return this.printUncaughtStackTrace;
                }

                public boolean isProfilingEnabled() {
/* 1 */             Double d = this.profilesSampleRate;
                    return d != null && d.doubleValue() > 0.0d;
                }

                public boolean isPropagateTraceparent() {
/* 1 */             return this.propagateTraceparent;
                }

                public boolean isSendClientReports() {
/* 1 */             return this.sendClientReports;
                }

                public boolean isSendDefaultPii() {
/* 1 */             return this.sendDefaultPii;
                }

                public boolean isSendModules() {
/* 1 */             return this.sendModules;
                }

                public boolean isStartProfilerOnAppStart() {
/* 1 */             return this.startProfilerOnAppStart;
                }

                public boolean isStrictTraceContinuation() {
/* 1 */             return this.strictTraceContinuation;
                }

                public boolean isTraceOptionsRequests() {
/* 1 */             return this.traceOptionsRequests;
                }

                public boolean isTraceSampling() {
/* 1 */             return this.traceSampling;
                }

                public boolean isTracingEnabled() {
/* 5 */             if (getTracesSampleRate() != null) {
/* 12 */                return true;
                    }
/* 7 */             getTracesSampler();
/* 10 */            return false;
                }

                public void loadLazyFields() {
/* 1 */             getSerializer();
/* 4 */             retrieveParsedDsn();
/* 7 */             getEnvelopeReader();
/* 10 */            getDateProvider();
                }

                public void merge(C1432e0 c1432e0) {
/* 1 */             String str = c1432e0.f10883a;
/* 3 */             if (str != null) {
/* 5 */                 setDsn(str);
                    }
/* 8 */             String str2 = c1432e0.f10884b;
/* 10 */            if (str2 != null) {
/* 12 */                setEnvironment(str2);
                    }
/* 15 */            String str3 = c1432e0.f10885c;
/* 17 */            if (str3 != null) {
/* 19 */                setRelease(str3);
                    }
/* 22 */            String str4 = c1432e0.f10886d;
/* 24 */            if (str4 != null) {
/* 26 */                setDist(str4);
                    }
/* 29 */            String str5 = c1432e0.f10887e;
/* 31 */            if (str5 != null) {
/* 33 */                setServerName(str5);
                    }
/* 36 */            C1521j6 c1521j6 = c1432e0.f10896n;
/* 38 */            if (c1521j6 != null) {
/* 40 */                setProxy(c1521j6);
                    }
/* 43 */            Boolean bool = c1432e0.f10888f;
/* 45 */            if (bool != null) {
/* 51 */                setEnableUncaughtExceptionHandler(bool.booleanValue());
                    }
/* 54 */            Boolean bool2 = c1432e0.f10907y;
/* 56 */            if (bool2 != null) {
/* 62 */                setPrintUncaughtStackTrace(bool2.booleanValue());
                    }
/* 65 */            Double d = c1432e0.f10891i;
/* 67 */            if (d != null) {
/* 69 */                setSampleRate(d);
                    }
/* 72 */            Double d2 = c1432e0.f10892j;
/* 74 */            if (d2 != null) {
/* 76 */                setTracesSampleRate(d2);
                    }
/* 79 */            Double d3 = c1432e0.f10893k;
/* 81 */            if (d3 != null) {
/* 83 */                setProfilesSampleRate(d3);
                    }
/* 86 */            Boolean bool3 = c1432e0.f10889g;
/* 88 */            if (bool3 != null) {
/* 94 */                setDebug(bool3.booleanValue());
                    }
/* 97 */            Boolean bool4 = c1432e0.f10890h;
/* 99 */            if (bool4 != null) {
/* 105 */               setEnableDeduplication(bool4.booleanValue());
                    }
/* 108 */           Boolean bool5 = c1432e0.f10908z;
/* 110 */           if (bool5 != null) {
/* 116 */               setSendClientReports(bool5.booleanValue());
                    }
/* 119 */           Boolean bool6 = c1432e0.f10875Q;
/* 121 */           if (bool6 != null) {
/* 127 */               setForceInit(bool6.booleanValue());
                    }
/* 149 */           for (Map.Entry entry : new HashMap(c1432e0.f10895m).entrySet()) {
/* 171 */               this.tags.put((String) entry.getKey(), (String) entry.getValue());
                    }
/* 182 */           Iterator it = new ArrayList(c1432e0.f10898p).iterator();
/* 190 */           while (it.hasNext()) {
/* 198 */               addInAppInclude((String) it.next());
                    }
/* 209 */           Iterator it2 = new ArrayList(c1432e0.f10897o).iterator();
/* 217 */           while (it2.hasNext()) {
/* 225 */               addInAppExclude((String) it2.next());
                    }
/* 236 */           Iterator it3 = new HashSet(c1432e0.f10905w).iterator();
/* 244 */           while (it3.hasNext()) {
/* 252 */               addIgnoredExceptionForType((Class) it3.next());
                    }
/* 258 */           if (c1432e0.f10899q != null) {
/* 267 */               setTracePropagationTargets(new ArrayList(c1432e0.f10899q));
                    }
/* 277 */           Iterator it4 = new ArrayList(c1432e0.f10900r).iterator();
/* 285 */           while (it4.hasNext()) {
/* 293 */               addContextTag((String) it4.next());
                    }
/* 297 */           String str6 = c1432e0.f10901s;
/* 299 */           if (str6 != null) {
/* 301 */               setProguardUuid(str6);
                    }
/* 304 */           Long l = c1432e0.f10902t;
/* 306 */           if (l != null) {
/* 308 */               setIdleTimeout(l);
                    }
/* 311 */           Long l2 = c1432e0.f10903u;
/* 313 */           if (l2 != null) {
/* 319 */               setShutdownTimeoutMillis(l2.longValue());
                    }
/* 322 */           Long l3 = c1432e0.f10904v;
/* 324 */           if (l3 != null) {
/* 330 */               setSessionFlushTimeoutMillis(l3.longValue());
                    }
/* 335 */           Iterator it5 = c1432e0.f10859A.iterator();
/* 343 */           while (it5.hasNext()) {
/* 351 */               addBundleId((String) it5.next());
                    }
/* 355 */           Boolean bool7 = c1432e0.f10860B;
/* 357 */           if (bool7 != null) {
/* 363 */               setEnabled(bool7.booleanValue());
                    }
/* 366 */           Boolean bool8 = c1432e0.f10861C;
/* 368 */           if (bool8 != null) {
/* 374 */               setEnablePrettySerializationOutput(bool8.booleanValue());
                    }
/* 377 */           Boolean bool9 = c1432e0.f10868J;
/* 379 */           if (bool9 != null) {
/* 385 */               setSendModules(bool9.booleanValue());
                    }
/* 390 */           if (c1432e0.f10866H != null) {
/* 399 */               setIgnoredCheckIns(new ArrayList(c1432e0.f10866H));
                    }
/* 404 */           if (c1432e0.f10867I != null) {
/* 413 */               setIgnoredTransactions(new ArrayList(c1432e0.f10867I));
                    }
/* 418 */           if (c1432e0.f10906x != null) {
/* 427 */               setIgnoredErrors(new ArrayList(c1432e0.f10906x));
                    }
/* 430 */           Boolean bool10 = c1432e0.f10870L;
/* 432 */           if (bool10 != null) {
/* 438 */               setEnableBackpressureHandling(bool10.booleanValue());
                    }
/* 441 */           Boolean bool11 = c1432e0.f10871M;
/* 443 */           if (bool11 != null) {
/* 449 */               setEnableDatabaseTransactionTracing(bool11.booleanValue());
                    }
/* 452 */           Boolean bool12 = c1432e0.f10872N;
/* 454 */           if (bool12 != null) {
/* 460 */               setEnableCacheTracing(bool12.booleanValue());
                    }
/* 463 */           Boolean bool13 = c1432e0.f10873O;
/* 465 */           if (bool13 != null) {
/* 471 */               setEnableQueueTracing(bool13.booleanValue());
                    }
/* 474 */           EnumC1530k6 enumC1530k6 = c1432e0.f10894l;
/* 476 */           if (enumC1530k6 != null) {
/* 478 */               setMaxRequestBodySize(enumC1530k6);
                    }
/* 481 */           Boolean bool14 = c1432e0.f10869K;
/* 483 */           if (bool14 != null) {
/* 489 */               setSendDefaultPii(bool14.booleanValue());
                    }
/* 492 */           Boolean bool15 = c1432e0.f10876R;
/* 494 */           if (bool15 != null) {
/* 500 */               setCaptureOpenTelemetryEvents(bool15.booleanValue());
                    }
/* 503 */           Boolean bool16 = c1432e0.f10862D;
/* 505 */           if (bool16 != null) {
/* 511 */               setEnableSpotlight(bool16.booleanValue());
                    }
/* 514 */           String str7 = c1432e0.f10865G;
/* 516 */           if (str7 != null) {
/* 518 */               setSpotlightConnectionUrl(str7);
                    }
/* 521 */           Boolean bool17 = c1432e0.f10874P;
/* 523 */           if (bool17 != null) {
/* 525 */               setGlobalHubMode(bool17);
                    }
/* 530 */           if (c1432e0.f10882X != null) {
/* 532 */               C1394c6 cron = getCron();
/* 536 */               C1394c6 c1394c6 = c1432e0.f10882X;
/* 538 */               if (cron == null) {
/* 540 */                   setCron(c1394c6);
                        } else {
/* 546 */                   if (c1394c6.f10792a != null) {
/* 556 */                       getCron().f10792a = c1432e0.f10882X.f10792a;
                            }
/* 562 */                   if (c1432e0.f10882X.f10793b != null) {
/* 572 */                       getCron().f10793b = c1432e0.f10882X.f10793b;
                            }
/* 578 */                   if (c1432e0.f10882X.f10794c != null) {
/* 588 */                       getCron().f10794c = c1432e0.f10882X.f10794c;
                            }
/* 594 */                   if (c1432e0.f10882X.f10795d != null) {
/* 604 */                       getCron().f10795d = c1432e0.f10882X.f10795d;
                            }
/* 610 */                   if (c1432e0.f10882X.f10796e != null) {
/* 620 */                       getCron().f10796e = c1432e0.f10882X.f10796e;
                            }
                        }
                    }
/* 624 */           if (c1432e0.f10863E != null) {
/* 636 */               getLogs().f10914a = c1432e0.f10863E.booleanValue();
                    }
/* 640 */           if (c1432e0.f10864F != null) {
/* 652 */               getMetrics().f10940a = c1432e0.f10864F.booleanValue();
                    }
/* 654 */           Double d4 = c1432e0.f10877S;
/* 656 */           if (d4 != null) {
/* 658 */               setProfileSessionSampleRate(d4);
                    }
/* 661 */           String str8 = c1432e0.f10878T;
/* 663 */           if (str8 != null) {
/* 665 */               setProfilingTracesDirPath(str8);
                    }
/* 668 */           EnumC1634q3 enumC1634q3 = c1432e0.f10879U;
/* 670 */           if (enumC1634q3 != null) {
/* 672 */               setProfileLifecycle(enumC1634q3);
                    }
/* 675 */           Boolean bool18 = c1432e0.f10880V;
/* 677 */           if (bool18 != null) {
/* 683 */               setStrictTraceContinuation(bool18.booleanValue());
                    }
/* 686 */           String str9 = c1432e0.f10881W;
/* 688 */           if (str9 != null) {
/* 690 */               setOrgId(str9);
                    }
                }

                public C1757z retrieveParsedDsn() throws IllegalArgumentException {
/* 7 */             return (C1757z) this.parsedDsn.m5471a();
                }

                public void setAppStartExtender(InterfaceC1561n0 interfaceC1561n0) {
/* 1 */             if (interfaceC1561n0 == null) {
/* 4 */                 interfaceC1561n0 = C1535l2.f11111a;
                    }
/* 6 */             this.appStartExtender = interfaceC1561n0;
                }

                public void setAttachServerName(boolean z) {
/* 1 */             this.attachServerName = z;
                }

                public void setAttachStacktrace(boolean z) {
/* 1 */             this.attachStacktrace = z;
                }

                public void setAttachThreads(boolean z) {
/* 1 */             this.attachThreads = z;
                }

                public void setBackpressureMonitor(InterfaceC1385b interfaceC1385b) {
/* 1 */             this.backpressureMonitor = interfaceC1385b;
                }

                public void setBeforeBreadcrumb(InterfaceC1747x5 interfaceC1747x5) {
/* 1 */             this.beforeBreadcrumb = interfaceC1747x5;
                }

                public void setBeforeEnvelopeCallback(InterfaceC1755y5 interfaceC1755y5) {
                }

                public void setBeforeSend(InterfaceC1763z5 interfaceC1763z5) {
                }

                public void setBeforeSendFeedback(InterfaceC1763z5 interfaceC1763z5) {
                }

                public void setBeforeSendReplay(InterfaceC1161a6 interfaceC1161a6) {
                }

                public void setBeforeSendTransaction(InterfaceC1382b6 interfaceC1382b6) {
/* 1 */             this.beforeSendTransaction = interfaceC1382b6;
                }

                public void setCacheDirPath(String str) {
/* 1 */             this.cacheDirPath = str;
                }

                public void setCaptureOpenTelemetryEvents(boolean z) {
/* 1 */             this.captureOpenTelemetryEvents = z;
                }

                public void setCompositePerformanceCollector(InterfaceC1547m interfaceC1547m) {
/* 1 */             this.compositePerformanceCollector = interfaceC1547m;
                }

                public void setConnectionStatusProvider(InterfaceC1631q0 interfaceC1631q0) {
/* 1 */             this.connectionStatusProvider = interfaceC1631q0;
                }

                public void setConnectionTimeoutMillis(int i) {
/* 1 */             this.connectionTimeoutMillis = i;
                }

                public void setContinuousProfiler(InterfaceC1639r0 interfaceC1639r0) {
/* 5 */             if (this.continuousProfiler != C1572o2.f11186a || interfaceC1639r0 == null) {
/* 11 */                return;
                    }
/* 9 */             this.continuousProfiler = interfaceC1639r0;
                }

                public void setCron(C1394c6 c1394c6) {
/* 1 */             this.cron = c1394c6;
                }

                public void setDateProvider(InterfaceC1699u4 interfaceC1699u4) {
/* 3 */             this.dateProvider.m5472b(interfaceC1699u4);
                }

                public void setDeadlineTimeout(long j) {
/* 1 */             this.deadlineTimeout = j;
                }

                public void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public void setDebugMetaLoader(InterfaceC1503a interfaceC1503a) {
/* 1 */             if (interfaceC1503a == null) {
/* 4 */                 interfaceC1503a = C1504b.f11040a;
                    }
/* 6 */             this.debugMetaLoader = interfaceC1503a;
                }

                public void setDefaultScopeType(EnumC1448f4 enumC1448f4) {
/* 1 */             this.defaultScopeType = enumC1448f4;
                }

                public void setDiagnosticLevel(EnumC1553m5 enumC1553m5) {
/* 1 */             if (enumC1553m5 == null) {
/* 4 */                 enumC1553m5 = DEFAULT_DIAGNOSTIC_LEVEL;
                    }
/* 6 */             this.diagnosticLevel = enumC1553m5;
                }

                public void setDist(String str) {
/* 1 */             this.dist = str;
                }

                public void setDistinctId(String str) {
/* 1 */             this.distinctId = str;
                }

                public void setDistribution(C1429d6 c1429d6) {
/* 1 */             if (c1429d6 == null) {
/* 6 */                 c1429d6 = new C1429d6();
                    }
/* 9 */             this.distribution = c1429d6;
                }

                public void setDistributionController(InterfaceC1660s0 interfaceC1660s0) {
/* 1 */             if (interfaceC1660s0 == null) {
/* 4 */                 interfaceC1660s0 = C1535l2.f11112b;
                    }
/* 6 */             this.distributionController = interfaceC1660s0;
                }

                public void setDsn(String str) {
/* 1 */             String string = null;
/* 10 */            this.dsn = str != null ? str.trim() : null;
/* 12 */            C1708g c1708g = this.parsedDsn;
/* 14 */            C1702a c1702a = c1708g.f11732c;
/* 16 */            c1702a.m5443c();
                    try {
/* 19 */                c1708g.f11730a = null;
/* 21 */                c1702a.close();
/* 24 */                String str2 = this.dsn;
/* 26 */                ILogger iLogger = this.logger;
/* 28 */                Charset charset = AbstractC1716o.f11743a;
/* 30 */                if (str2 != null && !str2.isEmpty()) {
                            try {
/* 63 */                        string = new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(AbstractC1716o.f11743a))).toString(16);
                            } catch (NoSuchAlgorithmException e) {
/* 88 */                        iLogger.mo4671d(EnumC1553m5.INFO, "SHA-1 isn't available to calculate the hash.", e);
                            } catch (Throwable th) {
/* 80 */                        iLogger.mo4672k(EnumC1553m5.INFO, "string: %s could not calculate its hash", th, str2);
                            }
                        }
/* 91 */                this.dsnHash = string;
                    } catch (Throwable th2) {
                        try {
/* 95 */                    c1702a.close();
                        } catch (Throwable th3) {
/* 100 */                   th2.addSuppressed(th3);
                        }
/* 103 */               throw th2;
                    }
                }

                public void setEnableAppStartProfiling(boolean z) {
/* 1 */             this.enableAppStartProfiling = z;
                }

                public void setEnableAutoSessionTracking(boolean z) {
/* 1 */             this.enableAutoSessionTracking = z;
                }

                public void setEnableBackpressureHandling(boolean z) {
/* 1 */             this.enableBackpressureHandling = z;
                }

                public void setEnableCacheTracing(boolean z) {
/* 1 */             this.enableCacheTracing = z;
                }

                public void setEnableDatabaseTransactionTracing(boolean z) {
/* 1 */             this.enableDatabaseTransactionTracing = z;
                }

                public void setEnableDeduplication(boolean z) {
/* 1 */             this.enableDeduplication = z;
                }

                public void setEnableEventSizeLimiting(boolean z) {
/* 1 */             this.enableEventSizeLimiting = z;
                }

                public void setEnableExternalConfiguration(boolean z) {
/* 1 */             this.enableExternalConfiguration = z;
                }

                public void setEnablePrettySerializationOutput(boolean z) {
/* 1 */             this.enablePrettySerializationOutput = z;
                }

                public void setEnableQueueTracing(boolean z) {
/* 1 */             this.enableQueueTracing = z;
                }

                public void setEnableScopePersistence(boolean z) {
/* 1 */             this.enableScopePersistence = z;
                }

                public void setEnableScreenTracking(boolean z) {
/* 1 */             this.enableScreenTracking = z;
                }

                public void setEnableShutdownHook(boolean z) {
/* 1 */             this.enableShutdownHook = z;
                }

                public void setEnableSpotlight(boolean z) {
/* 1 */             this.enableSpotlight = z;
                }

                public void setEnableTimeToFullDisplayTracing(boolean z) {
/* 1 */             this.enableTimeToFullDisplayTracing = z;
                }

                public void setEnableUncaughtExceptionHandler(boolean z) {
/* 1 */             this.enableUncaughtExceptionHandler = z;
                }

                public void setEnableUserInteractionBreadcrumbs(boolean z) {
/* 1 */             this.enableUserInteractionBreadcrumbs = z;
                }

                public void setEnableUserInteractionTracing(boolean z) {
/* 1 */             this.enableUserInteractionTracing = z;
                }

                public void setEnabled(boolean z) {
/* 1 */             this.enabled = z;
                }

                public void setEnvelopeDiskCache(InterfaceC1399d interfaceC1399d) {
/* 1 */             if (interfaceC1399d == null) {
/* 4 */                 interfaceC1399d = C1683i.f11698a;
                    }
/* 6 */             this.envelopeDiskCache = interfaceC1399d;
                }

                public void setEnvelopeReader(InterfaceC1668t0 interfaceC1668t0) {
/* 1 */             C1708g c1708g = this.envelopeReader;
/* 3 */             if (interfaceC1668t0 == null) {
/* 6 */                 interfaceC1668t0 = C1580p2.f11224a;
                    }
/* 8 */             c1708g.m5472b(interfaceC1668t0);
                }

                public void setEnvironment(String str) {
/* 1 */             this.environment = str;
                }

                public void setExecutorService(InterfaceC1457g1 interfaceC1457g1) {
/* 1 */             if (interfaceC1457g1 != null) {
/* 3 */                 this.executorService = interfaceC1457g1;
                    }
                }

                public void setFatalLogger(ILogger iLogger) {
/* 1 */             if (iLogger == null) {
/* 3 */                 iLogger = C1641r2.f11545a;
                    }
/* 5 */             this.fatalLogger = iLogger;
                }

                public void setFeedbackOptions(C1470h5 c1470h5) {
/* 1 */             this.feedbackOptions = c1470h5;
                }

                public void setFlushTimeoutMillis(long j) {
/* 1 */             this.flushTimeoutMillis = j;
                }

                public void setForceInit(boolean z) {
/* 1 */             this.forceInit = z;
                }

                public void setFullyDisplayedReporter(C1465h0 c1465h0) {
/* 1 */             this.fullyDisplayedReporter = c1465h0;
                }

                public void setGestureTargetLocators(List<C1199a> list) {
/* 3 */             this.gestureTargetLocators.clear();
/* 8 */             this.gestureTargetLocators.addAll(list);
                }

                public void setGlobalHubMode(Boolean bool) {
/* 1 */             this.globalHubMode = bool;
                }

                public void setIdleTimeout(Long l) {
/* 1 */             this.idleTimeout = l;
                }

                public void setIgnoredCheckIns(List<String> list) {
/* 1 */             if (list == null) {
/* 4 */                 this.ignoredCheckIns = null;
/* 6 */                 return;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (String str : list) {
/* 32 */                if (!str.isEmpty()) {
/* 39 */                    arrayList.add(new C1456g0(str));
                        }
                    }
/* 43 */            this.ignoredCheckIns = arrayList;
                }

                public void setIgnoredErrors(List<String> list) {
/* 1 */             if (list == null) {
/* 4 */                 this.ignoredErrors = null;
/* 6 */                 return;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (String str : list) {
/* 28 */                if (str != null && !str.isEmpty()) {
/* 41 */                    arrayList.add(new C1456g0(str));
                        }
                    }
/* 45 */            this.ignoredErrors = arrayList;
                }

                public void setIgnoredSpanOrigins(List<String> list) {
/* 1 */             if (list == null) {
/* 4 */                 this.ignoredSpanOrigins = null;
/* 6 */                 return;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (String str : list) {
/* 28 */                if (str != null && !str.isEmpty()) {
/* 41 */                    arrayList.add(new C1456g0(str));
                        }
                    }
/* 45 */            this.ignoredSpanOrigins = arrayList;
                }

                public void setIgnoredTransactions(List<String> list) {
/* 1 */             if (list == null) {
/* 4 */                 this.ignoredTransactions = null;
/* 6 */                 return;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (String str : list) {
/* 28 */                if (str != null && !str.isEmpty()) {
/* 41 */                    arrayList.add(new C1456g0(str));
                        }
                    }
/* 45 */            this.ignoredTransactions = arrayList;
                }

                public void setInitPriority(EnumC1632q1 enumC1632q1) {
/* 1 */             this.initPriority = enumC1632q1;
                }

                @Deprecated
                public void setInstrumenter(EnumC1640r1 enumC1640r1) {
/* 1 */             this.instrumenter = enumC1640r1;
                }

                public void setLogger(ILogger iLogger) {
/* 13 */            this.logger = iLogger == null ? C1641r2.f11545a : new C1505c(1, this, iLogger);
                }

                public void setLogs(C1438e6 c1438e6) {
/* 1 */             this.logs = c1438e6;
                }

                public void setMaxAttachmentSize(long j) {
/* 1 */             this.maxAttachmentSize = j;
                }

                public void setMaxBreadcrumbs(int i) {
/* 1 */             this.maxBreadcrumbs = i;
                }

                public void setMaxCacheItems(int i) {
/* 1 */             this.maxCacheItems = i;
                }

                public void setMaxDepth(int i) {
/* 1 */             this.maxDepth = i;
                }

                public void setMaxFeatureFlags(int i) {
/* 1 */             this.maxFeatureFlags = i;
                }

                public void setMaxQueueSize(int i) {
/* 1 */             if (i > 0) {
/* 3 */                 this.maxQueueSize = i;
                    }
                }

                public void setMaxRequestBodySize(EnumC1530k6 enumC1530k6) {
/* 1 */             this.maxRequestBodySize = enumC1530k6;
                }

                public void setMaxSpans(int i) {
/* 1 */             this.maxSpans = i;
                }

                public void setMaxTraceFileSize(long j) {
/* 1 */             this.maxTraceFileSize = j;
                }

                public void setMetrics(C1450f6 c1450f6) {
/* 1 */             this.metrics = c1450f6;
                }

                public void setModulesLoader(InterfaceC1508a interfaceC1508a) {
/* 1 */             if (interfaceC1508a == null) {
/* 4 */                 interfaceC1508a = C1512e.f11057a;
                    }
/* 6 */             this.modulesLoader = interfaceC1508a;
                }

                public void setOnDiscard(InterfaceC1462g6 interfaceC1462g6) {
                }

                public void setOnOversizedEvent(InterfaceC1471h6 interfaceC1471h6) {
                }

                public void setOpenTelemetryMode(EnumC1727v5 enumC1727v5) {
/* 1 */             this.openTelemetryMode = enumC1727v5;
                }

                public void setOrgId(String str) {
/* 1 */             this.orgId = str;
                }

                public void setPrintUncaughtStackTrace(boolean z) {
/* 1 */             this.printUncaughtStackTrace = z;
                }

                public void setProfileLifecycle(EnumC1634q3 enumC1634q3) {
/* 1 */             this.profileLifecycle = enumC1634q3;
/* 5 */             if (enumC1634q3 != EnumC1634q3.TRACE || isTracingEnabled()) {
/* 25 */                return;
                    }
/* 22 */            this.logger.mo4672k(EnumC1553m5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
                }

                public void setProfileSessionSampleRate(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.profileSessionSampleRate = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use values between 0.0 and 1.0.");
                    }
                }

                public void setProfilerConverter(InterfaceC1758z0 interfaceC1758z0) {
/* 1 */             this.profilerConverter = interfaceC1758z0;
                }

                public void setProfilesSampleRate(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.profilesSampleRate = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values between 0.0 and 1.0.");
                    }
                }

                public void setProfilesSampler(InterfaceC1492i6 interfaceC1492i6) {
                }

                public void setProfilingTracesDirPath(String str) {
/* 1 */             this.profilingTracesDirPath = str;
                }

                public void setProfilingTracesHz(int i) {
/* 1 */             this.profilingTracesHz = i;
                }

                public void setProguardUuid(String str) {
/* 1 */             this.proguardUuid = str;
                }

                public void setPropagateTraceparent(boolean z) {
/* 1 */             this.propagateTraceparent = z;
                }

                public void setProxy(C1521j6 c1521j6) {
/* 1 */             this.proxy = c1521j6;
                }

                public void setReadTimeoutMillis(int i) {
/* 1 */             this.readTimeoutMillis = i;
                }

                public void setRelease(String str) {
/* 1 */             this.release = str;
                }

                public void setReplayController(InterfaceC1725v3 interfaceC1725v3) {
/* 1 */             if (interfaceC1725v3 == null) {
/* 4 */                 interfaceC1725v3 = C1535l2.f11114d;
                    }
/* 6 */             this.replayController = interfaceC1725v3;
                }

                public void setSampleRate(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.sampleRate = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                    }
                }

                public void setScopesStorageFactory(InterfaceC1433e1 interfaceC1433e1) {
                }

                public void setSdkVersion(C1624u c1624u) {
/* 5 */             C1624u c1624u2 = getSessionReplay().f11535l;
/* 7 */             C1624u c1624u3 = this.sdkVersion;
/* 9 */             if (c1624u3 != null && c1624u2 != null && c1624u3.equals(c1624u2)) {
/* 23 */                getSessionReplay().f11535l = c1624u;
                    }
/* 25 */            this.sdkVersion = c1624u;
                }

                public void setSendClientReports(boolean z) {
/* 1 */             this.sendClientReports = z;
/* 3 */             if (z) {
/* 10 */                this.clientReportRecorder = new C1505c(this);
                    } else {
/* 18 */                this.clientReportRecorder = new C1709h();
                    }
                }

                public void setSendDefaultPii(boolean z) {
/* 1 */             this.sendDefaultPii = z;
                }

                public void setSendModules(boolean z) {
/* 1 */             this.sendModules = z;
                }

                public void setSentryClientName(String str) {
/* 1 */             this.sentryClientName = str;
                }

                public void setSerializer(InterfaceC1487i1 interfaceC1487i1) {
/* 1 */             C1708g c1708g = this.serializer;
/* 3 */             if (interfaceC1487i1 == null) {
/* 6 */                 interfaceC1487i1 = C1379b3.f10716a;
                    }
/* 8 */             c1708g.m5472b(interfaceC1487i1);
                }

                public void setServerName(String str) {
/* 1 */             this.serverName = str;
                }

                public void setSessionFlushTimeoutMillis(long j) {
/* 1 */             this.sessionFlushTimeoutMillis = j;
                }

                public void setSessionReplay(C1637q6 c1637q6) {
/* 1 */             this.sessionReplay = c1637q6;
                }

                public void setSessionTrackingIntervalMillis(long j) {
/* 1 */             this.sessionTrackingIntervalMillis = j;
                }

                public void setShutdownTimeoutMillis(long j) {
/* 1 */             this.shutdownTimeoutMillis = j;
                }

                public void setSocketTagger(InterfaceC1516j1 interfaceC1516j1) {
/* 1 */             if (interfaceC1516j1 == null) {
/* 4 */                 interfaceC1516j1 = C1391c3.f10780a;
                    }
/* 6 */             this.socketTagger = interfaceC1516j1;
                }

                public void setSpanFactory(InterfaceC1534l1 interfaceC1534l1) {
/* 1 */             this.spanFactory = interfaceC1534l1;
                }

                public void setSpotlightConnectionUrl(String str) {
/* 1 */             this.spotlightConnectionUrl = str;
                }

                public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
/* 1 */             this.sslSocketFactory = sSLSocketFactory;
                }

                public void setStartProfilerOnAppStart(boolean z) {
/* 1 */             this.startProfilerOnAppStart = z;
                }

                public void setStrictTraceContinuation(boolean z) {
/* 1 */             this.strictTraceContinuation = z;
                }

                public void setTag(String str, String str2) {
/* 1 */             if (str == null) {
/* 3 */                 return;
                    }
/* 4 */             Map<String, String> map = this.tags;
/* 6 */             if (str2 == null) {
/* 8 */                 map.remove(str);
                    } else {
/* 12 */                map.put(str, str2);
                    }
                }

                public void setThreadChecker(InterfaceC1718a interfaceC1718a) {
/* 1 */             this.threadChecker = interfaceC1718a;
                }

                public void setTraceOptionsRequests(boolean z) {
/* 1 */             this.traceOptionsRequests = z;
                }

                public void setTracePropagationTargets(List<String> list) {
/* 1 */             if (list == null) {
/* 4 */                 this.tracePropagationTargets = null;
/* 6 */                 return;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (String str : list) {
/* 32 */                if (!str.isEmpty()) {
/* 34 */                    arrayList.add(str);
                        }
                    }
/* 38 */            this.tracePropagationTargets = arrayList;
                }

                @Deprecated
                public void setTraceSampling(boolean z) {
/* 1 */             this.traceSampling = z;
                }

                public void setTracesSampleRate(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, true)) {
/* 8 */                 this.tracesSampleRate = d;
                    } else {
/* 15 */                C1697u2.m5435k(d, "The value ", " is not valid. Use null to disable or values between 0.0 and 1.0.");
                    }
                }

                public void setTracesSampler(InterfaceC1539l6 interfaceC1539l6) {
                }

                public void setTransactionProfiler(InterfaceC1562n1 interfaceC1562n1) {
/* 5 */             if (this.transactionProfiler != C1535l2.f11115e || interfaceC1562n1 == null) {
/* 11 */                return;
                    }
/* 9 */             this.transactionProfiler = interfaceC1562n1;
                }

                public void setTransportFactory(InterfaceC1571o1 interfaceC1571o1) {
/* 1 */             if (interfaceC1571o1 == null) {
/* 4 */                 interfaceC1571o1 = C1459g3.f10952a;
                    }
/* 6 */             this.transportFactory = interfaceC1571o1;
                }

                public void setTransportGate(InterfaceC1682h interfaceC1682h) {
/* 1 */             if (interfaceC1682h == null) {
/* 4 */                 interfaceC1682h = C1685k.f11700a;
                    }
/* 6 */             this.transportGate = interfaceC1682h;
                }

                public void setVersionDetector(InterfaceC1579p1 interfaceC1579p1) {
/* 1 */             this.versionDetector = interfaceC1579p1;
                }

                public void setViewHierarchyExporters(List<Object> list) {
/* 3 */             this.viewHierarchyExporters.clear();
/* 8 */             this.viewHierarchyExporters.addAll(list);
                }
            }
