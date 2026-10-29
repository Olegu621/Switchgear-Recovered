            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class KeyboardChannel {
                public final MethodChannel channel;
                private KeyboardMethodHandler keyboardMethodHandler;
                public final MethodChannel.MethodCallHandler parsingMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface KeyboardMethodHandler {
                    Map<Long, Long> getKeyboardState();
                }

                public KeyboardChannel(BinaryMessenger binaryMessenger) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
                        Map<Long, Long> pressedState = new HashMap();

                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     if (KeyboardChannel.this.keyboardMethodHandler == null) {
/* 11 */                        result.success(this.pressedState);
/* 14 */                        return;
                            }
/* 15 */                    String str = methodCall.method;
/* 17 */                    str.getClass();
/* 26 */                    if (!str.equals("getKeyboardState")) {
/* 28 */                        result.notImplemented();
/* 31 */                        return;
                            }
                            try {
/* 42 */                        this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                            } catch (IllegalStateException e) {
/* 53 */                        result.error("error", e.getMessage(), null);
                            }
/* 58 */                    result.success(this.pressedState);
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter/keyboard", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void setKeyboardMethodHandler(KeyboardMethodHandler keyboardMethodHandler) {
/* 1 */             this.keyboardMethodHandler = keyboardMethodHandler;
                }
            }
