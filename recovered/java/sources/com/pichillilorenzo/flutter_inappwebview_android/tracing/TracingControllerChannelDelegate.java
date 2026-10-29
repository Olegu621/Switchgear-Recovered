            package com.pichillilorenzo.flutter_inappwebview_android.tracing;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import p000.AbstractC2210t9;
            import p000.C1823k9;
            import p000.C1951n4;
            import p000.b73;
            import p000.d73;
            import p000.pq2;
            import p000.rq2;
            import p000.sq2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
                private TracingControllerManager tracingControllerManager;

                public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.tracingControllerManager = tracingControllerManager;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.tracingControllerManager = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    boolean zIsTracing;
                    FileOutputStream fileOutputStream;
                    boolean zStop;
/* 1 */             TracingControllerManager.init();
/* 4 */             rq2 rq2Var = TracingControllerManager.tracingController;
/* 6 */             String str = methodCall.method;
/* 8 */             str.getClass();
                    switch (str) {
                        case "isTracing":
/* 279 */                   if (rq2Var == null) {
/* 347 */                       result.success(Boolean.FALSE);
/* 350 */                       return;
                            }
/* 281 */                   sq2 sq2Var = (sq2) rq2Var;
/* 283 */                   C1823k9 c1823k9 = b73.f2325z;
/* 289 */                   if (c1823k9.mo6026a()) {
/* 293 */                       if (sq2Var.f16747a == null) {
/* 299 */                           sq2Var.f16747a = AbstractC2210t9.m8731a();
                                }
/* 303 */                       zIsTracing = AbstractC2210t9.m8734d(sq2Var.f16747a);
                            } else {
/* 312 */                       if (!c1823k9.mo97b()) {
/* 344 */                           throw b73.m1295a();
                                }
/* 316 */                       if (sq2Var.f16748b == null) {
/* 324 */                           sq2Var.f16748b = d73.f7038a.getTracingController();
                                }
/* 328 */                       zIsTracing = sq2Var.f16748b.isTracing();
                            }
/* 336 */                   result.success(Boolean.valueOf(zIsTracing));
/* 339 */                   return;
                        case "stop":
/* 169 */                   if (rq2Var == null || !xe2.m9786x("TRACING_CONTROLLER_BASIC_USAGE")) {
/* 275 */                       result.success(Boolean.FALSE);
/* 278 */                       return;
                            }
/* 183 */                   String str2 = (String) methodCall.argument("filePath");
/* 185 */                   if (str2 != null) {
                                try {
/* 189 */                           fileOutputStream = new FileOutputStream(str2);
                                } catch (FileNotFoundException e) {
/* 264 */                           e.printStackTrace();
/* 269 */                           result.success(Boolean.FALSE);
/* 272 */                           return;
                                }
                            } else {
/* 195 */                       fileOutputStream = null;
                            }
/* 196 */                   ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
/* 200 */                   sq2 sq2Var2 = (sq2) rq2Var;
/* 202 */                   C1823k9 c1823k10 = b73.f2325z;
/* 208 */                   if (c1823k10.mo6026a()) {
/* 212 */                       if (sq2Var2.f16747a == null) {
/* 218 */                           sq2Var2.f16747a = AbstractC2210t9.m8731a();
                                }
/* 222 */                       zStop = AbstractC2210t9.m8737g(sq2Var2.f16747a, fileOutputStream, executorServiceNewSingleThreadExecutor);
                            } else {
/* 231 */                       if (!c1823k10.mo97b()) {
/* 263 */                           throw b73.m1295a();
                                }
/* 235 */                       if (sq2Var2.f16748b == null) {
/* 243 */                           sq2Var2.f16748b = d73.f7038a.getTracingController();
                                }
/* 247 */                       zStop = sq2Var2.f16748b.stop(fileOutputStream, executorServiceNewSingleThreadExecutor);
                            }
/* 255 */                   result.success(Boolean.valueOf(zStop));
/* 258 */                   return;
                        case "start":
/* 61 */                    if (rq2Var == null || !xe2.m9786x("TRACING_CONTROLLER_BASIC_USAGE")) {
/* 165 */                       result.success(Boolean.FALSE);
/* 168 */                       return;
                            }
/* 75 */                    Map<String, Object> map = (Map) methodCall.argument("settings");
/* 79 */                    TracingSettings tracingSettings = new TracingSettings();
/* 82 */                    tracingSettings.parse2(map);
/* 85 */                    pq2 pq2VarBuildTracingConfig = TracingControllerManager.buildTracingConfig(tracingSettings);
/* 89 */                    sq2 sq2Var3 = (sq2) rq2Var;
/* 91 */                    if (pq2VarBuildTracingConfig == null) {
/* 159 */                       C1951n4.m6859j("Tracing config must be non null");
/* 162 */                       return;
                            }
/* 93 */                    C1823k9 c1823k11 = b73.f2325z;
/* 99 */                    if (c1823k11.mo6026a()) {
/* 103 */                       if (sq2Var3.f16747a == null) {
/* 109 */                           sq2Var3.f16747a = AbstractC2210t9.m8731a();
                                }
/* 113 */                       AbstractC2210t9.m8736f(sq2Var3.f16747a, pq2VarBuildTracingConfig);
                            } else {
/* 121 */                       if (!c1823k11.mo97b()) {
/* 156 */                           throw b73.m1295a();
                                }
/* 125 */                       if (sq2Var3.f16748b == null) {
/* 133 */                           sq2Var3.f16748b = d73.f7038a.getTracingController();
                                }
/* 143 */                       sq2Var3.f16748b.start(pq2VarBuildTracingConfig.f15251a, pq2VarBuildTracingConfig.f15252b, pq2VarBuildTracingConfig.f15253c);
                            }
/* 148 */                   result.success(Boolean.TRUE);
/* 151 */                   return;
                        default:
/* 57 */                    result.notImplemented();
/* 60 */                    return;
                    }
                }
            }
