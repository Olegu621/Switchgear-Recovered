            package io.flutter.plugins.sharedpreferences;

            import android.util.Log;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MessageCodec;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.plugins.sharedpreferences.Messages;
            import java.io.ByteArrayOutputStream;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 290 */   public class Messages {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterError extends RuntimeException {
                    public final String code;
                    public final Object details;

                    public FlutterError(String str, String str2, Object obj) {
/* 1 */                 super(str2);
/* 4 */                 this.code = str;
/* 6 */                 this.details = obj;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PigeonCodec extends StandardMessageCodec {
                    public static final PigeonCodec INSTANCE = new PigeonCodec();

                    private PigeonCodec() {
                    }

                    @Override // io.flutter.plugin.common.StandardMessageCodec
                    public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
/* 1 */                 return super.readValueOfType(b, byteBuffer);
                    }

                    @Override // io.flutter.plugin.common.StandardMessageCodec
                    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
/* 1 */                 super.writeValue(byteArrayOutputStream, obj);
                    }
                }

                public static ArrayList<Object> wrapError(Throwable th) {
/* 4 */             ArrayList<Object> arrayList = new ArrayList<>(3);
/* 9 */             if (th instanceof FlutterError) {
/* 11 */                FlutterError flutterError = (FlutterError) th;
/* 15 */                arrayList.add(flutterError.code);
/* 22 */                arrayList.add(flutterError.getMessage());
/* 27 */                arrayList.add(flutterError.details);
/* 30 */                return arrayList;
                    }
/* 35 */            arrayList.add(th.toString());
/* 46 */            arrayList.add(th.getClass().getSimpleName());
/* 79 */            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
/* 82 */            return arrayList;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 291 */       public interface SharedPreferencesApi {
                    static MessageCodec<Object> getCodec() {
/* 1 */                 return PigeonCodec.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 19 */                    arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
                        } catch (Throwable th) {
/* 24 */                    arrayList = Messages.wrapError(th);
                        }
/* 28 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$1(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$2(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$3(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setInt((String) arrayList2.get(0), (Long) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$4(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$5(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setEncodedStringList((String) arrayList2.get(0), (String) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$6(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.setDeprecatedStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$7(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$8(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    static void setUp(BinaryMessenger binaryMessenger, String str, final SharedPreferencesApi sharedPreferencesApi) {
/* 12 */                String strConcat = str.isEmpty() ? HttpUrl.FRAGMENT_ENCODE_SET : ".".concat(str);
/* 16 */                BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
/* 32 */                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 36 */                if (sharedPreferencesApi != null) {
/* 40 */                    final int i = 0;
/* 44 */                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i2 = i;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i2) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 48 */                    basicMessageChannel.setMessageHandler(null);
                        }
/* 63 */                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 66 */                if (sharedPreferencesApi != null) {
/* 70 */                    final int i2 = 1;
/* 74 */                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i3 = i2;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i3) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 78 */                    basicMessageChannel2.setMessageHandler(null);
                        }
/* 93 */                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 96 */                if (sharedPreferencesApi != null) {
/* 100 */                   final int i3 = 2;
/* 104 */                   basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i4 = i3;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i4) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 108 */                   basicMessageChannel3.setMessageHandler(null);
                        }
/* 123 */               BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 126 */               if (sharedPreferencesApi != null) {
/* 130 */                   final int i4 = 3;
/* 134 */                   basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i5 = i4;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i5) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 138 */                   basicMessageChannel4.setMessageHandler(null);
                        }
/* 153 */               BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 156 */               if (sharedPreferencesApi != null) {
/* 160 */                   final int i5 = 4;
/* 164 */                   basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i6 = i5;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i6) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 168 */                   basicMessageChannel5.setMessageHandler(null);
                        }
/* 183 */               BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 186 */               if (sharedPreferencesApi != null) {
/* 190 */                   final int i6 = 5;
/* 194 */                   basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i7 = i6;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i7) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 198 */                   basicMessageChannel6.setMessageHandler(null);
                        }
/* 213 */               BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 216 */               if (sharedPreferencesApi != null) {
/* 220 */                   final int i7 = 6;
/* 224 */                   basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i8 = i7;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i8) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 228 */                   basicMessageChannel7.setMessageHandler(null);
                        }
/* 243 */               BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 246 */               if (sharedPreferencesApi != null) {
/* 250 */                   final int i8 = 7;
/* 254 */                   basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i9 = i8;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i9) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 258 */                   basicMessageChannel8.setMessageHandler(null);
                        }
/* 273 */               BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 276 */               if (sharedPreferencesApi == null) {
/* 289 */                   basicMessageChannel9.setMessageHandler(null);
                        } else {
/* 280 */                   final int i9 = 8;
/* 285 */                   basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler(sharedPreferencesApi) { // from class: vh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.SharedPreferencesApi f18182b;

                                {
/* 3 */                             this.f18182b = sharedPreferencesApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i10 = i9;
/* 3 */                             Messages.SharedPreferencesApi sharedPreferencesApi2 = this.f18182b;
                                    switch (i10) {
                                        case 0:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$0(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$1(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$2(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$3(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$4(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$5(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$6(sharedPreferencesApi2, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$7(sharedPreferencesApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.SharedPreferencesApi.lambda$setUp$8(sharedPreferencesApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        }
                    }

                    Boolean clear(String str, List<String> list);

                    Map<String, Object> getAll(String str, List<String> list);

                    Boolean remove(String str);

                    Boolean setBool(String str, Boolean bool);

                    Boolean setDeprecatedStringList(String str, List<String> list);

                    Boolean setDouble(String str, Double d);

                    Boolean setEncodedStringList(String str, String str2);

                    Boolean setInt(String str, Long l);

                    Boolean setString(String str, String str2);

/* 292 */           static void setUp(BinaryMessenger binaryMessenger, SharedPreferencesApi sharedPreferencesApi) {
/* 293 */               setUp(binaryMessenger, HttpUrl.FRAGMENT_ENCODE_SET, sharedPreferencesApi);
                    }
                }
            }
