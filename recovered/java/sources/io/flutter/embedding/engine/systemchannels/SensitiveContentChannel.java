            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SensitiveContentChannel {
                public static final int AUTO_SENSITIVE_CONTENT_SENSITIVITY = 0;
                public static final int NOT_SENSITIVE_CONTENT_SENSITIVITY = 2;
                public static final int SENSITIVE_CONTENT_SENSITIVITY = 1;
                private static final String TAG = "SensitiveContentChannel";
                public static final int UNKNOWN_CONTENT_SENSITIVITY = 3;
                public final MethodChannel channel;
                public final MethodChannel.MethodCallHandler parsingMethodHandler;
                private SensitiveContentMethodHandler sensitiveContentMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SensitiveContentMethodHandler {
                    int getContentSensitivity();

                    boolean isSupported();

                    void setContentSensitivity(int i);
                }

                public SensitiveContentChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     if (SensitiveContentChannel.this.sensitiveContentMethodHandler == null) {
/* 202 */                       return;
                            }
/* 11 */                    String str = methodCall.method;
/* 34 */                    Log.m4589v(SensitiveContentChannel.TAG, "Received '" + str + "' message.");
/* 37 */                    str.getClass();
                            switch (str) {
                                case "SensitiveContent.getContentSensitivity":
                                    try {
/* 188 */                               result.success(Integer.valueOf(SensitiveContentChannel.this.serializeContentSensitivity(SensitiveContentChannel.this.sensitiveContentMethodHandler.getContentSensitivity())));
                                        break;
                                    } catch (IllegalArgumentException | IllegalStateException e) {
/* 199 */                               result.error("error", e.getMessage(), null);
/* 202 */                               return;
                                    }
                                    break;
                                case "SensitiveContent.setContentSensitivity":
                                    try {
/* 153 */                               SensitiveContentChannel.this.sensitiveContentMethodHandler.setContentSensitivity(SensitiveContentChannel.this.deserializeContentSensitivity(((Integer) methodCall.arguments()).intValue()));
                                        break;
                                    } catch (IllegalArgumentException | IllegalStateException e2) {
/* 164 */                               result.error("error", e2.getMessage(), null);
/* 202 */                               return;
                                    }
                                    break;
                                case "SensitiveContent.isSupported":
/* 127 */                           result.success(Boolean.valueOf(SensitiveContentChannel.this.sensitiveContentMethodHandler.isSupported()));
                                    break;
                                default:
/* 106 */                           Log.m4589v(SensitiveContentChannel.TAG, "Method " + str + " is not implemented for the SensitiveContentChannel.");
/* 109 */                           result.notImplemented();
                                    break;
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/sensitivecontent", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int deserializeContentSensitivity(int i) {
/* 1 */             if (i == 0) {
/* 23 */                return 0;
                    }
/* 4 */             if (i == 1) {
/* 3 */                 return 1;
                    }
/* 7 */             if (i == 2) {
/* 6 */                 return 2;
                    }
/* 18 */            C1951n4.m6859j(AbstractC0886en.m3505i(i, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
/* 21 */            return 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int serializeContentSensitivity(int i) {
/* 1 */             if (i == 0) {
/* 11 */                return 0;
                    }
/* 4 */             if (i != 1) {
                        return i != 2 ? 3 : 2;
                    }
/* 3 */             return 1;
                }

                public void setSensitiveContentMethodHandler(SensitiveContentMethodHandler sensitiveContentMethodHandler) {
/* 1 */             this.sensitiveContentMethodHandler = sensitiveContentMethodHandler;
                }
            }
