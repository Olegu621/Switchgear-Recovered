            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DeferredComponentChannel {
                private static final String TAG = "DeferredComponentChannel";
                private final MethodChannel channel;
                private Map<String, List<MethodChannel.Result>> componentNameToResults;
                private DeferredComponentManager deferredComponentManager;
                final MethodChannel.MethodCallHandler parsingMethodHandler;

                public DeferredComponentChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     if (DeferredComponentChannel.this.deferredComponentManager == null) {
                            }
/* 10 */                    String str = methodCall.method;
/* 16 */                    Map map = (Map) methodCall.arguments();
/* 39 */                    Log.m4589v(DeferredComponentChannel.TAG, "Received '" + str + "' message.");
/* 50 */                    int iIntValue = ((Integer) map.get("loadingUnitId")).intValue();
/* 60 */                    String str2 = (String) map.get("componentName");
/* 62 */                    str.getClass();
                            switch (str) {
                                case "uninstallDeferredComponent":
/* 184 */                           DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(iIntValue, str2);
/* 188 */                           result.success(null);
                                    break;
                                case "getDeferredComponentInstallState":
/* 174 */                           result.success(DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(iIntValue, str2));
                                    break;
                                case "installDeferredComponent":
/* 119 */                           DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(iIntValue, str2);
/* 132 */                           if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str2)) {
/* 145 */                               DeferredComponentChannel.this.componentNameToResults.put(str2, new ArrayList());
                                    }
/* 160 */                           ((List) DeferredComponentChannel.this.componentNameToResults.get(str2)).add(result);
                                    break;
                                default:
/* 109 */                           result.notImplemented();
                                    break;
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
/* 33 */            this.deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
/* 40 */            this.componentNameToResults = new HashMap();
                }

                public void completeInstallError(String str, String str2) {
/* 7 */             if (this.componentNameToResults.containsKey(str)) {
/* 17 */                Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
/* 25 */                while (it.hasNext()) {
/* 36 */                    it.next().error("DeferredComponent Install failure", str2, null);
                        }
/* 48 */                this.componentNameToResults.get(str).clear();
                    }
                }

                public void completeInstallSuccess(String str) {
/* 7 */             if (this.componentNameToResults.containsKey(str)) {
/* 17 */                Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
/* 25 */                while (it.hasNext()) {
/* 34 */                    it.next().success(null);
                        }
/* 46 */                this.componentNameToResults.get(str).clear();
                    }
                }

                public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
/* 1 */             this.deferredComponentManager = deferredComponentManager;
                }
            }
