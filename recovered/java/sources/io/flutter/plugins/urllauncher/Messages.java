            package io.flutter.plugins.urllauncher;

            import android.util.Log;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MessageCodec;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.plugins.urllauncher.Messages;
            import java.io.ByteArrayOutputStream;
            import java.lang.annotation.ElementType;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.annotation.Target;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 165 */   public class Messages {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class BrowserOptions {
                    private Boolean showTitle;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static final class Builder {
                        private Boolean showTitle;

                        public BrowserOptions build() {
/* 3 */                     BrowserOptions browserOptions = new BrowserOptions();
/* 8 */                     browserOptions.setShowTitle(this.showTitle);
/* 11 */                    return browserOptions;
                        }

                        public Builder setShowTitle(Boolean bool) {
/* 1 */                     this.showTitle = bool;
/* 3 */                     return this;
                        }
                    }

                    public static BrowserOptions fromList(ArrayList<Object> arrayList) {
/* 3 */                 BrowserOptions browserOptions = new BrowserOptions();
/* 13 */                browserOptions.setShowTitle((Boolean) arrayList.get(0));
/* 16 */                return browserOptions;
                    }

                    public boolean equals(Object obj) {
/* 1 */                 if (this == obj) {
/* 3 */                     return true;
                        }
/* 5 */                 if (obj == null || BrowserOptions.class != obj.getClass()) {
/* 27 */                    return false;
                        }
/* 22 */                return this.showTitle.equals(((BrowserOptions) obj).showTitle);
                    }

                    public Boolean getShowTitle() {
/* 1 */                 return this.showTitle;
                    }

                    public int hashCode() {
/* 7 */                 return Objects.hash(this.showTitle);
                    }

                    public void setShowTitle(Boolean bool) {
/* 1 */                 if (bool != null) {
/* 3 */                     this.showTitle = bool;
                        } else {
/* 8 */                     f42.m3656l("Nonnull field \"showTitle\" is null.");
                        }
                    }

                    public ArrayList<Object> toList() {
/* 4 */                 ArrayList<Object> arrayList = new ArrayList<>(1);
/* 9 */                 arrayList.add(this.showTitle);
/* 12 */                return arrayList;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Target({ElementType.METHOD})
                @Retention(RetentionPolicy.CLASS)
                public @interface CanIgnoreReturnValue {
                }

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
                            return b != -126 ? super.readValueOfType(b, byteBuffer) : BrowserOptions.fromList((ArrayList) readValue(byteBuffer));
                        }
/* 31 */                return WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
                    }

                    @Override // io.flutter.plugin.common.StandardMessageCodec
                    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
/* 3 */                 if (obj instanceof WebViewOptions) {
/* 7 */                     byteArrayOutputStream.write(129);
/* 16 */                    writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
                        } else if (!(obj instanceof BrowserOptions)) {
/* 39 */                    super.writeValue(byteArrayOutputStream, obj);
                        } else {
/* 26 */                    byteArrayOutputStream.write(130);
/* 35 */                    writeValue(byteArrayOutputStream, ((BrowserOptions) obj).toList());
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class WebViewOptions {
                    private Boolean enableDomStorage;
                    private Boolean enableJavaScript;
                    private Map<String, String> headers;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static final class Builder {
                        private Boolean enableDomStorage;
                        private Boolean enableJavaScript;
                        private Map<String, String> headers;

                        public WebViewOptions build() {
/* 3 */                     WebViewOptions webViewOptions = new WebViewOptions();
/* 8 */                     webViewOptions.setEnableJavaScript(this.enableJavaScript);
/* 13 */                    webViewOptions.setEnableDomStorage(this.enableDomStorage);
/* 18 */                    webViewOptions.setHeaders(this.headers);
/* 21 */                    return webViewOptions;
                        }

                        public Builder setEnableDomStorage(Boolean bool) {
/* 1 */                     this.enableDomStorage = bool;
/* 3 */                     return this;
                        }

                        public Builder setEnableJavaScript(Boolean bool) {
/* 1 */                     this.enableJavaScript = bool;
/* 3 */                     return this;
                        }

                        public Builder setHeaders(Map<String, String> map) {
/* 1 */                     this.headers = map;
/* 3 */                     return this;
                        }
                    }

                    public static WebViewOptions fromList(ArrayList<Object> arrayList) {
/* 3 */                 WebViewOptions webViewOptions = new WebViewOptions();
/* 13 */                webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
/* 23 */                webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
/* 33 */                webViewOptions.setHeaders((Map) arrayList.get(2));
/* 36 */                return webViewOptions;
                    }

                    public boolean equals(Object obj) {
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 6 */                 if (obj != null && WebViewOptions.class == obj.getClass()) {
/* 17 */                    WebViewOptions webViewOptions = (WebViewOptions) obj;
/* 27 */                    if (this.enableJavaScript.equals(webViewOptions.enableJavaScript) && this.enableDomStorage.equals(webViewOptions.enableDomStorage) && this.headers.equals(webViewOptions.headers)) {
/* 1 */                         return true;
                            }
                        }
/* 5 */                 return false;
                    }

                    public Boolean getEnableDomStorage() {
/* 1 */                 return this.enableDomStorage;
                    }

                    public Boolean getEnableJavaScript() {
/* 1 */                 return this.enableJavaScript;
                    }

                    public Map<String, String> getHeaders() {
/* 1 */                 return this.headers;
                    }

                    public int hashCode() {
/* 11 */                return Objects.hash(this.enableJavaScript, this.enableDomStorage, this.headers);
                    }

                    public void setEnableDomStorage(Boolean bool) {
/* 1 */                 if (bool != null) {
/* 3 */                     this.enableDomStorage = bool;
                        } else {
/* 8 */                     f42.m3656l("Nonnull field \"enableDomStorage\" is null.");
                        }
                    }

                    public void setEnableJavaScript(Boolean bool) {
/* 1 */                 if (bool != null) {
/* 3 */                     this.enableJavaScript = bool;
                        } else {
/* 8 */                     f42.m3656l("Nonnull field \"enableJavaScript\" is null.");
                        }
                    }

                    public void setHeaders(Map<String, String> map) {
/* 1 */                 if (map != null) {
/* 3 */                     this.headers = map;
                        } else {
/* 8 */                     f42.m3656l("Nonnull field \"headers\" is null.");
                        }
                    }

                    public ArrayList<Object> toList() {
/* 4 */                 ArrayList<Object> arrayList = new ArrayList<>(3);
/* 9 */                 arrayList.add(this.enableJavaScript);
/* 14 */                arrayList.add(this.enableDomStorage);
/* 19 */                arrayList.add(this.headers);
/* 22 */                return arrayList;
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
/* 166 */       public interface UrlLauncherApi {
                    static MessageCodec<Object> getCodec() {
/* 1 */                 return PigeonCodec.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 19 */                    arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
                        } catch (Throwable th) {
/* 24 */                    arrayList = Messages.wrapError(th);
                        }
/* 28 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$1(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 26 */                    arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
                        } catch (Throwable th) {
/* 31 */                    arrayList = Messages.wrapError(th);
                        }
/* 35 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$2(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
/* 6 */                 ArrayList arrayList2 = (ArrayList) obj;
                        try {
/* 40 */                    arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (WebViewOptions) arrayList2.get(2), (BrowserOptions) arrayList2.get(3)));
                        } catch (Throwable th) {
/* 45 */                    arrayList = Messages.wrapError(th);
                        }
/* 49 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$3(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 11 */                    arrayList.add(0, urlLauncherApi.supportsCustomTabs());
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    static /* synthetic */ void lambda$setUp$4(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
/* 3 */                 ArrayList<Object> arrayList = new ArrayList<>();
                        try {
/* 6 */                     urlLauncherApi.closeWebView();
/* 11 */                    arrayList.add(0, null);
                        } catch (Throwable th) {
/* 16 */                    arrayList = Messages.wrapError(th);
                        }
/* 20 */                reply.reply(arrayList);
                    }

                    static void setUp(BinaryMessenger binaryMessenger, String str, final UrlLauncherApi urlLauncherApi) {
/* 12 */                String strConcat = str.isEmpty() ? HttpUrl.FRAGMENT_ENCODE_SET : ".".concat(str);
/* 28 */                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl".concat(strConcat), getCodec());
/* 32 */                if (urlLauncherApi != null) {
/* 36 */                    final int i = 0;
/* 40 */                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler(urlLauncherApi) { // from class: wh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.UrlLauncherApi f18629b;

                                {
/* 3 */                             this.f18629b = urlLauncherApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i2 = i;
/* 3 */                             Messages.UrlLauncherApi urlLauncherApi2 = this.f18629b;
                                    switch (i2) {
                                        case 0:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$0(urlLauncherApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$1(urlLauncherApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$2(urlLauncherApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$3(urlLauncherApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$4(urlLauncherApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 44 */                    basicMessageChannel.setMessageHandler(null);
                        }
/* 59 */                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl".concat(strConcat), getCodec());
/* 62 */                if (urlLauncherApi != null) {
/* 66 */                    final int i2 = 1;
/* 70 */                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler(urlLauncherApi) { // from class: wh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.UrlLauncherApi f18629b;

                                {
/* 3 */                             this.f18629b = urlLauncherApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i3 = i2;
/* 3 */                             Messages.UrlLauncherApi urlLauncherApi2 = this.f18629b;
                                    switch (i3) {
                                        case 0:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$0(urlLauncherApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$1(urlLauncherApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$2(urlLauncherApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$3(urlLauncherApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$4(urlLauncherApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 74 */                    basicMessageChannel2.setMessageHandler(null);
                        }
/* 89 */                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp".concat(strConcat), getCodec());
/* 92 */                if (urlLauncherApi != null) {
/* 96 */                    final int i3 = 2;
/* 100 */                   basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler(urlLauncherApi) { // from class: wh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.UrlLauncherApi f18629b;

                                {
/* 3 */                             this.f18629b = urlLauncherApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i4 = i3;
/* 3 */                             Messages.UrlLauncherApi urlLauncherApi2 = this.f18629b;
                                    switch (i4) {
                                        case 0:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$0(urlLauncherApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$1(urlLauncherApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$2(urlLauncherApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$3(urlLauncherApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$4(urlLauncherApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 104 */                   basicMessageChannel3.setMessageHandler(null);
                        }
/* 119 */               BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs".concat(strConcat), getCodec());
/* 122 */               if (urlLauncherApi != null) {
/* 126 */                   final int i4 = 3;
/* 130 */                   basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler(urlLauncherApi) { // from class: wh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.UrlLauncherApi f18629b;

                                {
/* 3 */                             this.f18629b = urlLauncherApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i5 = i4;
/* 3 */                             Messages.UrlLauncherApi urlLauncherApi2 = this.f18629b;
                                    switch (i5) {
                                        case 0:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$0(urlLauncherApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$1(urlLauncherApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$2(urlLauncherApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$3(urlLauncherApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$4(urlLauncherApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 134 */                   basicMessageChannel4.setMessageHandler(null);
                        }
/* 149 */               BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView".concat(strConcat), getCodec());
/* 152 */               if (urlLauncherApi == null) {
/* 164 */                   basicMessageChannel5.setMessageHandler(null);
                        } else {
/* 156 */                   final int i5 = 4;
/* 160 */                   basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler(urlLauncherApi) { // from class: wh1

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ Messages.UrlLauncherApi f18629b;

                                {
/* 3 */                             this.f18629b = urlLauncherApi;
                                }

                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i6 = i5;
/* 3 */                             Messages.UrlLauncherApi urlLauncherApi2 = this.f18629b;
                                    switch (i6) {
                                        case 0:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$0(urlLauncherApi2, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$1(urlLauncherApi2, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$2(urlLauncherApi2, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$3(urlLauncherApi2, obj, reply);
                                            break;
                                        default:
/* 1 */                                     Messages.UrlLauncherApi.lambda$setUp$4(urlLauncherApi2, obj, reply);
                                            break;
                                    }
                                }
                            });
                        }
                    }

                    Boolean canLaunchUrl(String str);

                    void closeWebView();

                    Boolean launchUrl(String str, Map<String, String> map);

                    Boolean openUrlInApp(String str, Boolean bool, WebViewOptions webViewOptions, BrowserOptions browserOptions);

                    Boolean supportsCustomTabs();

/* 167 */           static void setUp(BinaryMessenger binaryMessenger, UrlLauncherApi urlLauncherApi) {
/* 168 */               setUp(binaryMessenger, HttpUrl.FRAGMENT_ENCODE_SET, urlLauncherApi);
                    }
                }
            }
