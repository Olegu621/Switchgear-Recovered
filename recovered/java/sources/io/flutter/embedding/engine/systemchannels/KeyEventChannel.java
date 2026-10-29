            package io.flutter.embedding.engine.systemchannels;

            import android.view.KeyEvent;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Log;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.JSONMessageCodec;
            import java.util.HashMap;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.C2357x6;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class KeyEventChannel {
                private static final String TAG = "KeyEventChannel";
                public final BasicMessageChannel<Object> channel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface EventResponseHandler {
                    void onFrameworkResponse(boolean z);
                }

                public KeyEventChannel(BinaryMessenger binaryMessenger) {
/* 13 */            this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
                }

                private static BasicMessageChannel.Reply<Object> createReplyHandler(EventResponseHandler eventResponseHandler) {
/* 4 */             return new C2357x6(eventResponseHandler, 7);
                }

                private Map<String, Object> encodeKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z) {
/* 3 */             HashMap map = new HashMap();
/* 15 */            map.put("type", z ? "keyup" : "keydown");
/* 22 */            map.put("keymap", "android");
/* 37 */            map.put("flags", Integer.valueOf(flutterKeyEvent.event.getFlags()));
/* 53 */            map.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
/* 68 */            map.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
/* 83 */            map.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
/* 98 */            map.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
/* 113 */           map.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
/* 116 */           Character ch = flutterKeyEvent.complexCharacter;
/* 118 */           if (ch != null) {
/* 126 */               map.put(FirebaseAnalytics.Param.CHARACTER, ch.toString());
                    }
/* 141 */           map.put(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(flutterKeyEvent.event.getSource()));
/* 156 */           map.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
/* 171 */           map.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
/* 174 */           return map;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$createReplyHandler$0(EventResponseHandler eventResponseHandler, Object obj) {
/* 1 */             boolean z = false;
/* 2 */             if (obj != null) {
                        try {
/* 8 */                     z = ((JSONObject) obj).getBoolean("handled");
                        } catch (JSONException e) {
/* 30 */                    Log.m4585e(TAG, "Unable to unpack JSON message: " + e);
                        }
                    }
/* 33 */            eventResponseHandler.onFrameworkResponse(z);
                }

                public void sendFlutterKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z, EventResponseHandler eventResponseHandler) {
/* 11 */            this.channel.send(encodeKeyEvent(flutterKeyEvent, z), createReplyHandler(eventResponseHandler));
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 7 */         public static class FlutterKeyEvent {
                    public final Character complexCharacter;
                    public final KeyEvent event;

                    public FlutterKeyEvent(KeyEvent keyEvent, Character ch) {
/* 4 */                 this.event = keyEvent;
/* 6 */                 this.complexCharacter = ch;
                    }

/* 8 */             public FlutterKeyEvent(KeyEvent keyEvent) {
/* 9 */                 this(keyEvent, null);
                    }
                }
            }
