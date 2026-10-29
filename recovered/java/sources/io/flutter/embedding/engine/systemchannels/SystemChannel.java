            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.JSONMessageCodec;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SystemChannel {
                private static final String TAG = "SystemChannel";
                public final BasicMessageChannel<Object> channel;

                public SystemChannel(DartExecutor dartExecutor) {
/* 13 */            this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
                }

                public void sendMemoryPressureWarning() {
/* 5 */             Log.m4589v(TAG, "Sending memory pressure warning to Flutter.");
/* 11 */            HashMap map = new HashMap(1);
/* 18 */            map.put("type", "memoryPressure");
/* 23 */            this.channel.send(map);
                }
            }
