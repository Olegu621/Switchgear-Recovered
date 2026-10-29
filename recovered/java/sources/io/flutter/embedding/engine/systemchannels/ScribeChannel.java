            package io.flutter.embedding.engine.systemchannels;

            import android.os.Build;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.JSONMethodCodec;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ScribeChannel {
                public static final String METHOD_IS_FEATURE_AVAILABLE = "Scribe.isFeatureAvailable";
                public static final String METHOD_IS_STYLUS_HANDWRITING_AVAILABLE = "Scribe.isStylusHandwritingAvailable";
                public static final String METHOD_START_STYLUS_HANDWRITING = "Scribe.startStylusHandwriting";
                private static final String TAG = "ScribeChannel";
                public final MethodChannel channel;
                public final MethodChannel.MethodCallHandler parsingMethodHandler;
                private ScribeMethodHandler scribeMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ScribeMethodHandler {
                    boolean isFeatureAvailable();

                    boolean isStylusHandwritingAvailable();

                    void startStylusHandwriting();
                }

                public ScribeChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ScribeChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 9 */                     if (ScribeChannel.this.scribeMethodHandler == null) {
/* 13 */                        Log.m4589v(ScribeChannel.TAG, "No ScribeMethodHandler registered. Scribe call not handled.");
                            }
/* 17 */                    String str = methodCall.method;
/* 38 */                    Log.m4589v(ScribeChannel.TAG, "Received '" + str + "' message.");
/* 41 */                    str.getClass();
                            switch (str) {
                                case "Scribe.isFeatureAvailable":
/* 1 */                             ScribeChannel.this.isFeatureAvailable(methodCall, result);
                                    break;
                                case "Scribe.startStylusHandwriting":
/* 1 */                             ScribeChannel.this.startStylusHandwriting(methodCall, result);
                                    break;
                                case "Scribe.isStylusHandwritingAvailable":
/* 1 */                             ScribeChannel.this.isStylusHandwritingAvailable(methodCall, result);
                                    break;
                                default:
/* 88 */                            result.notImplemented();
                                    break;
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/scribe", JSONMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void isFeatureAvailable(MethodCall methodCall, MethodChannel.Result result) {
                    try {
/* 11 */                result.success(Boolean.valueOf(this.scribeMethodHandler.isFeatureAvailable()));
                    } catch (IllegalStateException e) {
/* 23 */                result.error("error", e.getMessage(), null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void isStylusHandwritingAvailable(MethodCall methodCall, MethodChannel.Result result) {
/* 8 */             if (Build.VERSION.SDK_INT < 34) {
/* 12 */                result.error("error", "Requires API level 34 or higher.", null);
/* 15 */                return;
                    }
                    try {
/* 26 */                result.success(Boolean.valueOf(this.scribeMethodHandler.isStylusHandwritingAvailable()));
                    } catch (IllegalStateException e) {
/* 35 */                result.error("error", e.getMessage(), null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void startStylusHandwriting(MethodCall methodCall, MethodChannel.Result result) {
/* 8 */             if (Build.VERSION.SDK_INT < 33) {
/* 12 */                result.error("error", "Requires API level 33 or higher.", null);
/* 15 */                return;
                    }
                    try {
/* 18 */                this.scribeMethodHandler.startStylusHandwriting();
/* 21 */                result.success(null);
                    } catch (IllegalStateException e) {
/* 30 */                result.error("error", e.getMessage(), null);
                    }
                }

                public void setScribeMethodHandler(ScribeMethodHandler scribeMethodHandler) {
/* 1 */             this.scribeMethodHandler = scribeMethodHandler;
                }
            }
