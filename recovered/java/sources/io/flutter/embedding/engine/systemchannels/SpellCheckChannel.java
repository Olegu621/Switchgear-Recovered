            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SpellCheckChannel {
                private static final String TAG = "SpellCheckChannel";
                public final MethodChannel channel;
                public final MethodChannel.MethodCallHandler parsingMethodHandler;
                private SpellCheckMethodHandler spellCheckMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface SpellCheckMethodHandler {
                    void initiateSpellCheck(String str, String str2, MethodChannel.Result result);
                }

                public SpellCheckChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 9 */                     if (SpellCheckChannel.this.spellCheckMethodHandler == null) {
/* 13 */                        Log.m4589v(SpellCheckChannel.TAG, "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
/* 16 */                        return;
                            }
/* 17 */                    String str = methodCall.method;
/* 19 */                    Object obj = methodCall.arguments;
/* 40 */                    Log.m4589v(SpellCheckChannel.TAG, "Received '" + str + "' message.");
/* 43 */                    str.getClass();
/* 52 */                    if (!str.equals("SpellCheck.initiateSpellCheck")) {
/* 54 */                        result.notImplemented();
/* 57 */                        return;
                            }
                            try {
/* 58 */                        ArrayList arrayList = (ArrayList) obj;
/* 80 */                        SpellCheckChannel.this.spellCheckMethodHandler.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), result);
                            } catch (IllegalStateException e) {
/* 92 */                        result.error("error", e.getMessage(), null);
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/spellcheck", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void setSpellCheckMethodHandler(SpellCheckMethodHandler spellCheckMethodHandler) {
/* 1 */             this.spellCheckMethodHandler = spellCheckMethodHandler;
                }
            }
