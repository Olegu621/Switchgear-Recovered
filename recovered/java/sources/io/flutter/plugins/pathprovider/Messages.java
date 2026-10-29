            package io.flutter.plugins.pathprovider;

            import android.util.Log;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MessageCodec;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.plugins.pathprovider.Messages;
            import java.io.ByteArrayOutputStream;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 253 */   public class Messages {

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
/* 3 */                 if (b != -127) {
/* 5 */                     return super.readValueOfType(b, byteBuffer);
                        }
/* 10 */                Object value = readValue(byteBuffer);
/* 14 */                if (value == null) {
/* 16 */                    return null;
                        }
/* 28 */                return StorageDirectory.values()[((Long) value).intValue()];
                    }

                    @Override // io.flutter.plugin.common.StandardMessageCodec
                    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
/* 3 */                 if (!(obj instanceof StorageDirectory)) {
/* 22 */                    super.writeValue(byteArrayOutputStream, obj);
                        } else {
/* 7 */                     byteArrayOutputStream.write(129);
/* 18 */                    writeValue(byteArrayOutputStream, Integer.valueOf(((StorageDirectory) obj).index));
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum StorageDirectory {
                    ROOT(0),
                    MUSIC(1),
                    PODCASTS(2),
                    RINGTONES(3),
                    ALARMS(4),
                    NOTIFICATIONS(5),
                    PICTURES(6),
                    MOVIES(7),
                    DOWNLOADS(8),
                    DCIM(9),
                    DOCUMENTS(10);

                    final int index;

                    StorageDirectory(int i) {
/* 4 */                 this.index = i;
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
/* 254 */       public interface PathProviderApi {
                    static MessageCodec<Object> getCodec() {
/* 1 */                 return PigeonCodec.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$0(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getTemporaryPath());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$1(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getApplicationSupportPath());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$2(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$3(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getApplicationCachePath());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$4(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getExternalStoragePath());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$5(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, pathProviderApi.getExternalCachePaths());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$6(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 19 */                    arrayList.add(0, pathProviderApi.getExternalStoragePaths((StorageDirectory) ((ArrayList) obj).get(0)));
                        } catch (Throwable th) {
/* 24 */                    arrayList = Messages.wrapError(th);
                        }
/* 28 */                reply.reply(arrayList);
                    }

                    static void setUp(BinaryMessenger binaryMessenger, String str, final PathProviderApi pathProviderApi) {
/* 12 */                String strConcat = str.isEmpty() ? HttpUrl.FRAGMENT_ENCODE_SET : ".".concat(str);
/* 32 */                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 36 */                if (pathProviderApi != null) {
/* 40 */                    final int i = 0;
/* 44 */                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i2 = i;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i2) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 48 */                    basicMessageChannel.setMessageHandler(null);
                        }
/* 67 */                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 70 */                if (pathProviderApi != null) {
/* 74 */                    final int i2 = 1;
/* 78 */                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i3 = i2;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i3) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 82 */                    basicMessageChannel2.setMessageHandler(null);
                        }
/* 101 */               BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 104 */               if (pathProviderApi != null) {
/* 108 */                   final int i3 = 2;
/* 112 */                   basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i4 = i3;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i4) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 116 */                   basicMessageChannel3.setMessageHandler(null);
                        }
/* 135 */               BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 138 */               if (pathProviderApi != null) {
/* 142 */                   final int i4 = 3;
/* 146 */                   basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i5 = i4;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i5) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 150 */                   basicMessageChannel4.setMessageHandler(null);
                        }
/* 169 */               BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 172 */               if (pathProviderApi != null) {
/* 176 */                   final int i5 = 4;
/* 180 */                   basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i6 = i5;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i6) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 184 */                   basicMessageChannel5.setMessageHandler(null);
                        }
/* 203 */               BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 206 */               if (pathProviderApi != null) {
/* 210 */                   final int i6 = 5;
/* 214 */                   basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i7 = i6;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i7) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 218 */                   basicMessageChannel6.setMessageHandler(null);
                        }
/* 237 */               BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths".concat(strConcat), getCodec(), binaryMessenger.makeBackgroundTaskQueue());
/* 240 */               if (pathProviderApi == null) {
/* 252 */                   basicMessageChannel7.setMessageHandler(null);
                        } else {
/* 244 */                   final int i7 = 6;
/* 248 */                   basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler(pathProviderApi) { // from class: uh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.PathProviderApi f17528b;

                                {
/* 3 */                             this.f17528b = pathProviderApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i8 = i7;
/* 3 */                             Messages.PathProviderApi pathProviderApi2 = this.f17528b;
                                    switch (i8) {
                                        case 0:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$0(pathProviderApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$1(pathProviderApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$2(pathProviderApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$3(pathProviderApi2, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$4(pathProviderApi2, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$5(pathProviderApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.PathProviderApi.lambda$setUp$6(pathProviderApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        }
                    }

                    String getApplicationCachePath();

                    String getApplicationDocumentsPath();

                    String getApplicationSupportPath();

                    List<String> getExternalCachePaths();

                    String getExternalStoragePath();

                    List<String> getExternalStoragePaths(StorageDirectory storageDirectory);

                    String getTemporaryPath();

/* 255 */           static void setUp(BinaryMessenger binaryMessenger, PathProviderApi pathProviderApi) {
/* 256 */               setUp(binaryMessenger, HttpUrl.FRAGMENT_ENCODE_SET, pathProviderApi);
                    }
                }
            }
