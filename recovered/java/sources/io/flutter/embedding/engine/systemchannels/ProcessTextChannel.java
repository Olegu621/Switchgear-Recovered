            package io.flutter.embedding.engine.systemchannels;

            import android.content.pm.PackageManager;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.ArrayList;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProcessTextChannel {
                private static final String CHANNEL_NAME = "flutter/processtext";
                private static final String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
                private static final String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
                private static final String TAG = "ProcessTextChannel";
                public final MethodChannel channel;
                public final PackageManager packageManager;
                public final MethodChannel.MethodCallHandler parsingMethodHandler;
                private ProcessTextMethodHandler processTextMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ProcessTextMethodHandler {
                    void processTextAction(String str, String str2, boolean z, MethodChannel.Result result);

                    Map<String, String> queryTextActions();
                }

                public ProcessTextChannel(DartExecutor dartExecutor, PackageManager packageManager) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     if (ProcessTextChannel.this.processTextMethodHandler == null) {
/* 108 */                       return;
                            }
/* 10 */                    String str = methodCall.method;
/* 12 */                    Object obj = methodCall.arguments;
/* 14 */                    str.getClass();
/* 26 */                    if (!str.equals(ProcessTextChannel.METHOD_PROCESS_TEXT_ACTION)) {
/* 34 */                        if (!str.equals(ProcessTextChannel.METHOD_QUERY_TEXT_ACTIONS)) {
/* 36 */                            result.notImplemented();
/* 39 */                            return;
                                }
                                try {
/* 50 */                            result.success(ProcessTextChannel.this.processTextMethodHandler.queryTextActions());
/* 53 */                            return;
                                } catch (IllegalStateException e) {
/* 59 */                            result.error("error", e.getMessage(), null);
/* 108 */                           return;
                                }
                            }
                            try {
/* 63 */                        ArrayList arrayList = (ArrayList) obj;
/* 96 */                        ProcessTextChannel.this.processTextMethodHandler.processTextAction((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), result);
                            } catch (IllegalStateException e2) {
/* 105 */                       result.error("error", e2.getMessage(), null);
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 11 */            this.packageManager = packageManager;
/* 19 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, CHANNEL_NAME, StandardMethodCodec.INSTANCE);
/* 22 */            this.channel = methodChannel;
/* 24 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void setMethodHandler(ProcessTextMethodHandler processTextMethodHandler) {
/* 1 */             this.processTextMethodHandler = processTextMethodHandler;
                }
            }
