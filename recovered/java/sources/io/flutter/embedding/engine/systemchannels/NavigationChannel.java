            package io.flutter.embedding.engine.systemchannels;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.JSONMethodCodec;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NavigationChannel {
                private static final String TAG = "NavigationChannel";
                public final MethodChannel channel;
                private final MethodChannel.MethodCallHandler defaultHandler;

                public NavigationChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.NavigationChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 2 */                     result.success(null);
                        }
                    };
/* 9 */             this.defaultHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/navigation", JSONMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void popRoute() {
/* 5 */             Log.m4589v(TAG, "Sending message to pop route.");
/* 13 */            this.channel.invokeMethod("popRoute", null);
                }

                public void pushRoute(String str) {
/* 22 */            Log.m4589v(TAG, "Sending message to push route '" + str + "'");
/* 29 */            this.channel.invokeMethod("pushRoute", str);
                }

                public void pushRouteInformation(String str) {
/* 22 */            Log.m4589v(TAG, "Sending message to push route information '" + str + "'");
/* 27 */            HashMap map = new HashMap();
/* 32 */            map.put(FirebaseAnalytics.Param.LOCATION, str);
/* 39 */            this.channel.invokeMethod("pushRouteInformation", map);
                }

                public void setInitialRoute(String str) {
/* 22 */            Log.m4589v(TAG, "Sending message to set initial route to '" + str + "'");
/* 29 */            this.channel.invokeMethod("setInitialRoute", str);
                }

                public void setMethodCallHandler(MethodChannel.MethodCallHandler methodCallHandler) {
/* 3 */             this.channel.setMethodCallHandler(methodCallHandler);
                }
            }
