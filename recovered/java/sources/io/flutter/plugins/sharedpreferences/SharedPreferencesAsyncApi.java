            package io.flutter.plugins.sharedpreferences;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.MessageCodec;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            import p000.gd2;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000 !2\u00020\u0001:\u0001!J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J \u0010\u001c\u001a\u00020\u00032\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&¨\u0006\""}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", HttpUrl.FRAGMENT_ENCODE_SET, "setBool", HttpUrl.FRAGMENT_ENCODE_SET, "key", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setString", "setInt", HttpUrl.FRAGMENT_ENCODE_SET, "setDouble", HttpUrl.FRAGMENT_ENCODE_SET, "setEncodedStringList", "setDeprecatedStringList", HttpUrl.FRAGMENT_ENCODE_SET, "getString", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getPlatformEncodedStringList", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "clear", "allowList", "getAll", HttpUrl.FRAGMENT_ENCODE_SET, "getKeys", "Companion", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 482 */   public interface SharedPreferencesAsyncApi {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = Companion.$$INSTANCE;

                void clear(List<String> allowList, SharedPreferencesPigeonOptions options);

                Map<String, Object> getAll(List<String> allowList, SharedPreferencesPigeonOptions options);

                Boolean getBool(String key, SharedPreferencesPigeonOptions options);

                Double getDouble(String key, SharedPreferencesPigeonOptions options);

                Long getInt(String key, SharedPreferencesPigeonOptions options);

                List<String> getKeys(List<String> allowList, SharedPreferencesPigeonOptions options);

                List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options);

                String getString(String key, SharedPreferencesPigeonOptions options);

                StringListResult getStringList(String key, SharedPreferencesPigeonOptions options);

                void setBool(String key, boolean value, SharedPreferencesPigeonOptions options);

                void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options);

                void setDouble(String key, double value, SharedPreferencesPigeonOptions options);

                void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options);

                void setInt(String key, long value, SharedPreferencesPigeonOptions options);

                void setString(String key, String value, SharedPreferencesPigeonOptions options);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "api", HttpUrl.FRAGMENT_ENCODE_SET, "messageChannelSuffix", HttpUrl.FRAGMENT_ENCODE_SET, "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;Ljava/lang/String;)V", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lp51;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 483 */       public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
                    private static final p51 codec = r51.m8065b(new gd2(1));

                    private Companion() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final MessagesAsyncPigeonCodec codec_delegate$lambda$0() {
/* 3 */                 return new MessagesAsyncPigeonCodec();
                    }

                    public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i, Object obj) {
/* 3 */                 if ((i & 4) != 0) {
/* 5 */                     str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 7 */                 companion.setUp(binaryMessenger, sharedPreferencesAsyncApi, str);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$10$lambda$9(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 27 */                String str2 = (String) obj3;
/* 30 */                Object obj4 = list.get(2);
/* 34 */                obj4.getClass();
                        try {
/* 39 */                    sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
/* 43 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 53 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$12$lambda$11(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 27 */                List<String> list2 = (List) obj3;
/* 30 */                Object obj4 = list.get(2);
/* 34 */                obj4.getClass();
                        try {
/* 39 */                    sharedPreferencesAsyncApi.setDeprecatedStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
/* 43 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 53 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$14$lambda$13(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$16$lambda$15(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$18$lambda$17(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 29 */                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
/* 34 */                Object obj4 = list.get(2);
/* 38 */                obj4.getClass();
                        try {
/* 43 */                    sharedPreferencesAsyncApi.setBool(str, zBooleanValue, (SharedPreferencesPigeonOptions) obj4);
/* 47 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 57 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$20$lambda$19(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$22$lambda$21(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$24$lambda$23(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
                        try {
/* 33 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 43 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$26$lambda$25(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 14 */                List<String> list2 = (List) list.get(0);
/* 17 */                Object obj2 = list.get(1);
/* 21 */                obj2.getClass();
                        try {
/* 26 */                    sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
/* 30 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 40 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$28$lambda$27(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 14 */                List<String> list2 = (List) list.get(0);
/* 17 */                Object obj2 = list.get(1);
/* 21 */                obj2.getClass();
                        try {
/* 30 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 40 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$30$lambda$29(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 14 */                List<String> list2 = (List) list.get(0);
/* 17 */                Object obj2 = list.get(1);
/* 21 */                obj2.getClass();
                        try {
/* 30 */                    listWrapError = C1839a.m6210b(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 40 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 27 */                String str2 = (String) obj3;
/* 30 */                Object obj4 = list.get(2);
/* 34 */                obj4.getClass();
                        try {
/* 39 */                    sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
/* 43 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 53 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$6$lambda$5(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 29 */                long jLongValue = ((Long) obj3).longValue();
/* 34 */                Object obj4 = list.get(2);
/* 38 */                obj4.getClass();
                        try {
/* 43 */                    sharedPreferencesAsyncApi.setInt(str, jLongValue, (SharedPreferencesPigeonOptions) obj4);
/* 47 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 57 */                reply.reply(listWrapError);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void setUp$lambda$8$lambda$7(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
                        List listWrapError;
/* 1 */                 reply.getClass();
/* 4 */                 obj.getClass();
/* 7 */                 List list = (List) obj;
/* 10 */                Object obj2 = list.get(0);
/* 14 */                obj2.getClass();
/* 17 */                String str = (String) obj2;
/* 20 */                Object obj3 = list.get(1);
/* 24 */                obj3.getClass();
/* 29 */                double dDoubleValue = ((Double) obj3).doubleValue();
/* 34 */                Object obj4 = list.get(2);
/* 38 */                obj4.getClass();
                        try {
/* 43 */                    sharedPreferencesAsyncApi.setDouble(str, dDoubleValue, (SharedPreferencesPigeonOptions) obj4);
/* 47 */                    listWrapError = C1839a.m6210b(null);
                        } catch (Throwable th) {
/* 1 */                     listWrapError = MessagesAsync_gKt.wrapError(th);
                        }
/* 57 */                reply.reply(listWrapError);
                    }

                    public final MessageCodec<Object> getCodec() {
/* 7 */                 return (MessageCodec) codec.getValue();
                    }

                    public final void setUp(BinaryMessenger binaryMessenger, final SharedPreferencesAsyncApi api, String messageChannelSuffix) {
/* 1 */                 binaryMessenger.getClass();
/* 4 */                 messageChannelSuffix.getClass();
/* 20 */                String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */                BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
/* 38 */                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 42 */                if (api != null) {
/* 46 */                    final int i = 0;
/* 50 */                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i2 = i;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i2) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 54 */                    basicMessageChannel.setMessageHandler(null);
                        }
/* 69 */                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 72 */                if (api != null) {
/* 76 */                    final int i2 = 11;
/* 81 */                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i3 = i2;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i3) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 85 */                    basicMessageChannel2.setMessageHandler(null);
                        }
/* 100 */               BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 103 */               if (api != null) {
/* 107 */                   final int i3 = 12;
/* 112 */                   basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i4 = i3;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i4) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 116 */                   basicMessageChannel3.setMessageHandler(null);
                        }
/* 131 */               BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 134 */               if (api != null) {
/* 138 */                   final int i4 = 13;
/* 143 */                   basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i5 = i4;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i5) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 147 */                   basicMessageChannel4.setMessageHandler(null);
                        }
/* 162 */               BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 165 */               if (api != null) {
/* 169 */                   final int i5 = 14;
/* 174 */                   basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i6 = i5;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i6) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 178 */                   basicMessageChannel5.setMessageHandler(null);
                        }
/* 193 */               BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 196 */               if (api != null) {
/* 200 */                   final int i6 = 1;
/* 204 */                   basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i7 = i6;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i7) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 208 */                   basicMessageChannel6.setMessageHandler(null);
                        }
/* 223 */               BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 226 */               if (api != null) {
/* 230 */                   final int i7 = 2;
/* 234 */                   basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i8 = i7;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i8) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 238 */                   basicMessageChannel7.setMessageHandler(null);
                        }
/* 253 */               BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 256 */               if (api != null) {
/* 260 */                   final int i8 = 3;
/* 264 */                   basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i9 = i8;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i9) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 268 */                   basicMessageChannel8.setMessageHandler(null);
                        }
/* 283 */               BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 286 */               if (api != null) {
/* 290 */                   final int i9 = 4;
/* 294 */                   basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i10 = i9;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i10) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 298 */                   basicMessageChannel9.setMessageHandler(null);
                        }
/* 313 */               BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 316 */               if (api != null) {
/* 320 */                   final int i10 = 5;
/* 324 */                   basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i11 = i10;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i11) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 328 */                   basicMessageChannel10.setMessageHandler(null);
                        }
/* 343 */               BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 346 */               if (api != null) {
/* 350 */                   final int i11 = 6;
/* 354 */                   basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i12 = i11;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i12) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 358 */                   basicMessageChannel11.setMessageHandler(null);
                        }
/* 373 */               BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 376 */               if (api != null) {
/* 380 */                   final int i12 = 7;
/* 384 */                   basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i13 = i12;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i13) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 388 */                   basicMessageChannel12.setMessageHandler(null);
                        }
/* 403 */               BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 406 */               if (api != null) {
/* 410 */                   final int i13 = 8;
/* 415 */                   basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i14 = i13;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i14) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 419 */                   basicMessageChannel13.setMessageHandler(null);
                        }
/* 434 */               BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 437 */               if (api != null) {
/* 441 */                   final int i14 = 9;
/* 446 */                   basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i15 = i14;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i15) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        } else {
/* 450 */                   basicMessageChannel14.setMessageHandler(null);
                        }
/* 465 */               BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys".concat(strConcat), getCodec(), taskQueueMakeBackgroundTaskQueue);
/* 468 */               if (api == null) {
/* 481 */                   basicMessageChannel15.setMessageHandler(null);
                        } else {
/* 472 */                   final int i15 = 10;
/* 477 */                   basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nd2
                                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
/* 1 */                             int i16 = i15;
/* 3 */                             SharedPreferencesAsyncApi sharedPreferencesAsyncApi = api;
                                    switch (i16) {
                                        case 0:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 1:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 2:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 3:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 4:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 5:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 6:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 7:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 8:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 9:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 10:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 11:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case 12:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                        default:
/* 1 */                                     SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, reply);
                                            break;
                                    }
                                }
                            });
                        }
                    }

/* 484 */           public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
/* 485 */               binaryMessenger.getClass();
                        setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, null, 4, null);
                    }
                }
            }
