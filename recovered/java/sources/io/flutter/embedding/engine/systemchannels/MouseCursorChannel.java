            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MouseCursorChannel {
                private static final String TAG = "MouseCursorChannel";
                public final MethodChannel channel;
                private MouseCursorMethodHandler mouseCursorMethodHandler;
                private final MethodChannel.MethodCallHandler parsingMethodCallHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MouseCursorMethodHandler {
                    void activateSystemCursor(String str);
                }

                public MouseCursorChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 11 */                    if (MouseCursorChannel.this.mouseCursorMethodHandler == null) {
/* 131 */                       return;
                            }
/* 15 */                    String str = methodCall.method;
/* 38 */                    Log.m4589v(MouseCursorChannel.TAG, "Received '" + str + "' message.");
                            try {
/* 49 */                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                                    try {
/* 78 */                                MouseCursorChannel.this.mouseCursorMethodHandler.activateSystemCursor((String) ((HashMap) methodCall.arguments).get("kind"));
/* 83 */                                result.success(Boolean.TRUE);
                                    } catch (Exception e) {
/* 106 */                               result.error("error", "Error when setting cursors: " + e.getMessage(), null);
                                    }
                                }
                            } catch (Exception e2) {
/* 128 */                       result.error("error", "Unhandled error: " + e2.getMessage(), null);
                            }
                        }
                    };
/* 9 */             this.parsingMethodCallHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/mousecursor", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void setMethodHandler(MouseCursorMethodHandler mouseCursorMethodHandler) {
/* 1 */             this.mouseCursorMethodHandler = mouseCursorMethodHandler;
                }

                public void synthesizeMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 3 */             this.parsingMethodCallHandler.onMethodCall(methodCall, result);
                }
            }
