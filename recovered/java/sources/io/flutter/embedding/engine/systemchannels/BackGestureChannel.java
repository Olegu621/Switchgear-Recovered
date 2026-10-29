            package io.flutter.embedding.engine.systemchannels;

            import android.window.BackEvent;
            import androidx.core.app.NotificationCompat;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BackGestureChannel {
                private static final String TAG = "BackGestureChannel";
                public final MethodChannel channel;
                private final MethodChannel.MethodCallHandler defaultHandler;

                public BackGestureChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.BackGestureChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 2 */                     result.success(null);
                        }
                    };
/* 9 */             this.defaultHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/backgesture", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                private Map<String, Object> backEventToJsonMap(BackEvent backEvent) {
/* 4 */             HashMap map = new HashMap(3);
/* 1 */             float touchX = backEvent.getTouchX();
/* 1 */             float touchY = backEvent.getTouchY();
/* 48 */            map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
/* 61 */            map.put(NotificationCompat.CATEGORY_PROGRESS, Float.valueOf(backEvent.getProgress()));
/* 74 */            map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
/* 77 */            return map;
                }

                public void cancelBackGesture() {
/* 5 */             Log.m4589v(TAG, "Sending message to cancel back gesture");
/* 13 */            this.channel.invokeMethod("cancelBackGesture", null);
                }

                public void commitBackGesture() {
/* 5 */             Log.m4589v(TAG, "Sending message to commit back gesture");
/* 13 */            this.channel.invokeMethod("commitBackGesture", null);
                }

                public void setMethodCallHandler(MethodChannel.MethodCallHandler methodCallHandler) {
/* 3 */             this.channel.setMethodCallHandler(methodCallHandler);
                }

                public void startBackGesture(BackEvent backEvent) {
/* 5 */             Log.m4589v(TAG, "Sending message to start back gesture");
/* 16 */            this.channel.invokeMethod("startBackGesture", backEventToJsonMap(backEvent));
                }

                public void updateBackGestureProgress(BackEvent backEvent) {
/* 5 */             Log.m4589v(TAG, "Sending message to update back gesture progress");
/* 16 */            this.channel.invokeMethod("updateBackGestureProgress", backEventToJsonMap(backEvent));
                }
            }
