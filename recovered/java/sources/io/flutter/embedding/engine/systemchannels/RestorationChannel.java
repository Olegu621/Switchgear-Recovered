            package io.flutter.embedding.engine.systemchannels;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class RestorationChannel {
                private static final String TAG = "RestorationChannel";
                private MethodChannel channel;
                private boolean engineHasProvidedData;
                private boolean frameworkHasRequestedData;
                private final MethodChannel.MethodCallHandler handler;
                private MethodChannel.Result pendingFrameworkRestorationChannelRequest;
                private byte[] restorationData;
                public final boolean waitForRestorationData;

                public RestorationChannel(MethodChannel methodChannel, boolean z) {
/* 5 */             this.engineHasProvidedData = false;
/* 7 */             this.frameworkHasRequestedData = false;
/* 11 */            MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.2
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */                     String str = methodCall.method;
/* 3 */                     Object obj = methodCall.arguments;
/* 5 */                     str.getClass();
/* 14 */                    if (!str.equals("get")) {
/* 22 */                        if (!str.equals("put")) {
/* 24 */                            result.notImplemented();
/* 27 */                            return;
                                }
/* 1 */                         RestorationChannel.this.restorationData = (byte[]) obj;
/* 36 */                        result.success(null);
/* 39 */                        return;
                            }
/* 1 */                     RestorationChannel.this.frameworkHasRequestedData = true;
/* 52 */                    if (!RestorationChannel.this.engineHasProvidedData) {
/* 54 */                        RestorationChannel restorationChannel = RestorationChannel.this;
/* 58 */                        if (restorationChannel.waitForRestorationData) {
/* 1 */                             restorationChannel.pendingFrameworkRestorationChannelRequest = result;
/* 64 */                            return;
                                }
                            }
/* 65 */                    RestorationChannel restorationChannel2 = RestorationChannel.this;
/* 75 */                    result.success(restorationChannel2.packageData(restorationChannel2.restorationData));
                        }
                    };
/* 14 */            this.handler = methodCallHandler;
/* 16 */            this.channel = methodChannel;
/* 18 */            this.waitForRestorationData = z;
/* 20 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Map<String, Object> packageData(byte[] bArr) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("enabled", Boolean.TRUE);
/* 15 */            map.put(SharedDataContentProvider.BASE_PATH, bArr);
/* 18 */            return map;
                }

                public void clearData() {
/* 2 */             this.restorationData = null;
                }

                public byte[] getRestorationData() {
/* 1 */             return this.restorationData;
                }

                public void setRestorationData(final byte[] bArr) {
/* 2 */             this.engineHasProvidedData = true;
/* 4 */             MethodChannel.Result result = this.pendingFrameworkRestorationChannelRequest;
/* 6 */             if (result != null) {
/* 12 */                result.success(packageData(bArr));
/* 16 */                this.pendingFrameworkRestorationChannelRequest = null;
/* 18 */                this.restorationData = bArr;
                    } else if (this.frameworkHasRequestedData) {
/* 38 */                this.channel.invokeMethod("push", packageData(bArr), new MethodChannel.Result() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.1
                            @Override // io.flutter.plugin.common.MethodChannel.Result
                            public void error(String str, String str2, Object obj) {
/* 25 */                        Log.m4585e(RestorationChannel.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                            }

                            @Override // io.flutter.plugin.common.MethodChannel.Result
                            public void notImplemented() {
                            }

                            @Override // io.flutter.plugin.common.MethodChannel.Result
                            public void success(Object obj) {
/* 1 */                         RestorationChannel.this.restorationData = bArr;
                            }
                        });
                    } else {
/* 42 */                this.restorationData = bArr;
                    }
                }

/* 23 */        public RestorationChannel(DartExecutor dartExecutor, boolean z) {
/* 24 */            this(new MethodChannel(dartExecutor, "flutter/restoration", StandardMethodCodec.INSTANCE), z);
                }
            }
