            package io.flutter.embedding.engine.systemchannels;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.view.AccessibilityBridge;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public class AccessibilityChannel {
                private static final String TAG = "AccessibilityChannel";
                public final BasicMessageChannel<Object> channel;
                public final FlutterJNI flutterJNI;
                private AccessibilityMessageHandler handler;
                public final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
                    @Deprecated(since = "Android API level 36")
                    void announce(String str);

                    void onFocus(int i);

                    void onLongPress(int i);

                    void onTap(int i);

                    void onTooltip(String str);
                }

                public AccessibilityChannel(DartExecutor dartExecutor, FlutterJNI flutterJNI) {
/* 6 */             BasicMessageChannel.MessageHandler<Object> messageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
/* 8 */                     if (AccessibilityChannel.this.handler == null) {
/* 10 */                        reply.reply(null);
/* 13 */                        return;
                            }
/* 14 */                    HashMap map = (HashMap) obj;
/* 22 */                    String str = (String) map.get("type");
/* 30 */                    HashMap map2 = (HashMap) map.get(SharedDataContentProvider.BASE_PATH);
/* 53 */                    Log.m4589v(AccessibilityChannel.TAG, "Received " + str + " message.");
/* 56 */                    str.getClass();
                            switch (str) {
                                case "tooltip":
/* 218 */                           String str2 = (String) map2.get("message");
/* 220 */                           if (str2 != null) {
/* 228 */                               AccessibilityChannel.this.handler.onTooltip(str2);
                                        break;
                                    }
                                    break;
                                case "announce":
/* 200 */                           String str3 = (String) map2.get("message");
/* 202 */                           if (str3 != null) {
/* 210 */                               AccessibilityChannel.this.handler.announce(str3);
                                        break;
                                    }
                                    break;
                                case "tap":
/* 178 */                           Integer num = (Integer) map.get("nodeId");
/* 180 */                           if (num != null) {
/* 192 */                               AccessibilityChannel.this.handler.onTap(num.intValue());
                                        break;
                                    }
                                    break;
                                case "focus":
/* 156 */                           Integer num2 = (Integer) map.get("nodeId");
/* 158 */                           if (num2 != null) {
/* 170 */                               AccessibilityChannel.this.handler.onFocus(num2.intValue());
                                        break;
                                    }
                                    break;
                                case "longPress":
/* 134 */                           Integer num3 = (Integer) map.get("nodeId");
/* 136 */                           if (num3 != null) {
/* 148 */                               AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                                        break;
                                    }
                                    break;
                            }
/* 231 */                   reply.reply(null);
                        }
                    };
/* 9 */             this.parsingMessageHandler = messageHandler;
/* 17 */            BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
/* 20 */            this.channel = basicMessageChannel;
/* 22 */            basicMessageChannel.setMessageHandler(messageHandler);
/* 25 */            this.flutterJNI = flutterJNI;
                }

                public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
/* 3 */             this.flutterJNI.dispatchSemanticsAction(i, action);
                }

                public void onAndroidAccessibilityDisabled() {
/* 4 */             this.flutterJNI.setSemanticsEnabled(false);
                }

                public void onAndroidAccessibilityEnabled() {
/* 4 */             this.flutterJNI.setSemanticsEnabled(true);
                }

                public void setAccessibilityFeatures(int i) {
/* 3 */             this.flutterJNI.setAccessibilityFeatures(i);
                }

                public void setAccessibilityMessageHandler(AccessibilityMessageHandler accessibilityMessageHandler) {
/* 1 */             this.handler = accessibilityMessageHandler;
/* 5 */             this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
                }

/* 6 */         public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
/* 7 */             this.flutterJNI.dispatchSemanticsAction(i, action, obj);
                }

/* 27 */        public AccessibilityChannel(BasicMessageChannel<Object> basicMessageChannel, FlutterJNI flutterJNI) {
/* 29 */            this.parsingMessageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
/* 8 */                     if (AccessibilityChannel.this.handler == null) {
/* 10 */                        reply.reply(null);
/* 13 */                        return;
                            }
/* 14 */                    HashMap map = (HashMap) obj;
/* 22 */                    String str = (String) map.get("type");
/* 30 */                    HashMap map2 = (HashMap) map.get(SharedDataContentProvider.BASE_PATH);
/* 53 */                    Log.m4589v(AccessibilityChannel.TAG, "Received " + str + " message.");
/* 56 */                    str.getClass();
                            switch (str) {
                                case "tooltip":
/* 218 */                           String str2 = (String) map2.get("message");
/* 220 */                           if (str2 != null) {
/* 228 */                               AccessibilityChannel.this.handler.onTooltip(str2);
                                        break;
                                    }
                                    break;
                                case "announce":
/* 200 */                           String str3 = (String) map2.get("message");
/* 202 */                           if (str3 != null) {
/* 210 */                               AccessibilityChannel.this.handler.announce(str3);
                                        break;
                                    }
                                    break;
                                case "tap":
/* 178 */                           Integer num = (Integer) map.get("nodeId");
/* 180 */                           if (num != null) {
/* 192 */                               AccessibilityChannel.this.handler.onTap(num.intValue());
                                        break;
                                    }
                                    break;
                                case "focus":
/* 156 */                           Integer num2 = (Integer) map.get("nodeId");
/* 158 */                           if (num2 != null) {
/* 170 */                               AccessibilityChannel.this.handler.onFocus(num2.intValue());
                                        break;
                                    }
                                    break;
                                case "longPress":
/* 134 */                           Integer num3 = (Integer) map.get("nodeId");
/* 136 */                           if (num3 != null) {
/* 148 */                               AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                                        break;
                                    }
                                    break;
                            }
/* 231 */                   reply.reply(null);
                        }
                    };
/* 30 */            this.channel = basicMessageChannel;
/* 31 */            this.flutterJNI = flutterJNI;
                }
            }
