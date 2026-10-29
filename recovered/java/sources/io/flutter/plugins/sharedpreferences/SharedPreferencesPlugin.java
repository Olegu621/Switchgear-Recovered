            package io.flutter.plugins.sharedpreferences;

            import android.content.Context;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.c10;
            import p000.d10;
            import p000.f42;
            import p000.fk0;
            import p000.fw1;
            import p000.h22;
            import p000.h40;
            import p000.hk0;
            import p000.i13;
            import p000.iw1;
            import p000.j50;
            import p000.pg3;
            import p000.tj2;
            import p000.vk1;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J'\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020,2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020/2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b2\u0010+J-\u00103\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00106J3\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b7\u00108J!\u00109\u001a\u0004\u0018\u00010,2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u0004\u0018\u00010%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u0004\u0018\u00010/2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010L¨\u0006M"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "<init>", "()V", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "listEncoder", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V", HttpUrl.FRAGMENT_ENCODE_SET, "key", FirebaseAnalytics.Param.VALUE, "dataStoreSetString", "(Ljava/lang/String;Ljava/lang/String;Lc10;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "allowList", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getPrefs", "(Ljava/util/List;Lc10;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "Liw1;", "readAllKeys", "(Lc10;)Ljava/lang/Object;", "getValueByKey", "(Liw1;Lc10;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", HttpUrl.FRAGMENT_ENCODE_SET, "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "options", "setBool", "(Ljava/lang/String;ZLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "setString", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", HttpUrl.FRAGMENT_ENCODE_SET, "setInt", "(Ljava/lang/String;JLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", HttpUrl.FRAGMENT_ENCODE_SET, "setDouble", "(Ljava/lang/String;DLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "setEncodedStringList", "setDeprecatedStringList", "(Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "clear", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "getAll", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/Map;", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/String;", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getStringList", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/List;", "getKeys", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/List;", "Landroid/content/Context;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "backend", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 10 */    public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
                private SharedPreferencesBackend backend;
                private Context context;
                private SharedPreferencesListEncoder listEncoder;

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", "Lvk1;", "<anonymous>", "(Ly10;)Lvk1;"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {134}, m5710m = "invokeSuspend")
                public static final class C11201 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ List<String> $allowList;
                    int label;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lvk1;", "preferences", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lvk1;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {}, m5710m = "invokeSuspend")
                    public static final class AnonymousClass1 extends tj2 implements Function2<vk1, c10, Object> {
                        final /* synthetic */ List<String> $allowList;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(List<String> list, c10 c10Var) {
/* 4 */                     super(2, c10Var);
/* 1 */                     this.$allowList = list;
                        }

                        @Override // p000.AbstractC0181bi
                        public final c10 create(Object obj, c10 c10Var) {
/* 5 */                     AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, c10Var);
/* 8 */                     anonymousClass1.L$0 = obj;
/* 10 */                    return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vk1 vk1Var, c10 c10Var) {
/* 9 */                     return ((AnonymousClass1) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                        }

                        @Override // p000.AbstractC0181bi
                        public final Object invokeSuspend(Object obj) {
/* 1 */                     z10 z10Var = z10.f19902a;
/* 5 */                     if (this.label != 0) {
/* 67 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 70 */                        return null;
                            }
/* 7 */                     pg3.m7417A(obj);
/* 12 */                    vk1 vk1Var = (vk1) this.L$0;
/* 14 */                    List<String> list = this.$allowList;
/* 16 */                    if (list != null) {
/* 26 */                        for (String str : list) {
/* 34 */                            str.getClass();
/* 39 */                            iw1 iw1Var = new iw1(str);
/* 42 */                            vk1Var.getClass();
/* 45 */                            vk1Var.m9299b();
/* 50 */                            vk1Var.f18231a.remove(iw1Var);
                                }
                            } else {
/* 54 */                        vk1Var.m9299b();
/* 59 */                        vk1Var.f18231a.clear();
                            }
/* 62 */                    return Unit.f12910a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11201(List<String> list, c10 c10Var) {
/* 6 */                 super(2, c10Var);
/* 3 */                 this.$allowList = list;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 7 */                 return SharedPreferencesPlugin.this.new C11201(this.$allowList, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11201) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i != 0) {
/* 9 */                     if (i == 1) {
/* 11 */                        pg3.m7417A(obj);
/* 14 */                        return obj;
                            }
/* 17 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 21 */                pg3.m7417A(obj);
/* 1 */                 Context context = SharedPreferencesPlugin.this.context;
/* 30 */                if (context == null) {
/* 60 */                    Intrinsics.m6220e("context");
/* 63 */                    throw null;
                        }
/* 32 */                h40 sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
/* 40 */                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, null);
/* 43 */                this.label = 1;
/* 50 */                Object objMo1285a = sharedPreferencesDataStore.mo1285a(new fw1(anonymousClass1, null, 1), this);
                        return objMo1285a == z10Var ? z10Var : objMo1285a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lvk1;", "preferences", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lvk1;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {}, m5710m = "invokeSuspend")
                public static final class C11212 extends tj2 implements Function2<vk1, c10, Object> {
                    final /* synthetic */ iw1 $stringKey;
                    final /* synthetic */ String $value;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11212(iw1 iw1Var, String str, c10 c10Var) {
/* 6 */                 super(2, c10Var);
/* 1 */                 this.$stringKey = iw1Var;
/* 3 */                 this.$value = str;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 7 */                 C11212 c11212 = new C11212(this.$stringKey, this.$value, c10Var);
/* 10 */                c11212.L$0 = obj;
/* 12 */                return c11212;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(vk1 vk1Var, c10 c10Var) {
/* 9 */                 return ((C11212) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 5 */                 if (this.label != 0) {
/* 32 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 7 */                 pg3.m7417A(obj);
/* 12 */                vk1 vk1Var = (vk1) this.L$0;
/* 14 */                iw1 iw1Var = this.$stringKey;
/* 16 */                String str = this.$value;
/* 18 */                vk1Var.getClass();
/* 21 */                iw1Var.getClass();
/* 24 */                vk1Var.m9301d(iw1Var, str);
/* 27 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)Ljava/util/Map;"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {150}, m5710m = "invokeSuspend")
                public static final class C11221 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ List<String> $allowList;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11221(List<String> list, c10 c10Var) {
/* 6 */                 super(2, c10Var);
/* 3 */                 this.$allowList = list;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 7 */                 return SharedPreferencesPlugin.this.new C11221(this.$allowList, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11221) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 6 */                 if (i != 0) {
/* 8 */                     if (i == 1) {
/* 10 */                        pg3.m7417A(obj);
/* 13 */                        return obj;
                            }
/* 16 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 21 */                pg3.m7417A(obj);
/* 24 */                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
/* 26 */                List<String> list = this.$allowList;
/* 28 */                this.label = 1;
/* 1 */                 Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
                        return prefs == z10Var ? z10Var : prefs;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {174}, m5710m = "invokeSuspend")
                public static final class C11231 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ h22 $value;
                    Object L$0;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11231(String str, SharedPreferencesPlugin sharedPreferencesPlugin, h22 h22Var, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = h22Var;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return new C11231(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11231) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
                        h22 h22Var;
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 25 */                    pg3.m7417A(obj);
/* 28 */                    String str = this.$key;
/* 30 */                    str.getClass();
/* 35 */                    final iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 44 */                    if (context == null) {
/* 82 */                        Intrinsics.m6220e("context");
/* 85 */                        throw null;
                            }
/* 50 */                    final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 56 */                    fk0 fk0Var = new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2 */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                                public static final class C11242<T> implements hk0 {
                                    final /* synthetic */ iw1 $preferencesKey$inlined;
                                    final /* synthetic */ hk0 $this_unsafeFlow;

                                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                    @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                    public static final class AnonymousClass1 extends d10 {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(c10 c10Var) {
/* 3 */                                     super(c10Var);
                                        }

                                        @Override // p000.AbstractC0181bi
                                        public final Object invokeSuspend(Object obj) {
/* 1 */                                     this.result = obj;
/* 8 */                                     this.label |= Integer.MIN_VALUE;
/* 13 */                                    return C11242.this.emit(null, this);
                                        }
                                    }

                                    public C11242(hk0 hk0Var, iw1 iw1Var) {
/* 1 */                                 this.$this_unsafeFlow = hk0Var;
/* 3 */                                 this.$preferencesKey$inlined = iw1Var;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                    @Override // p000.hk0
                                    public final Object emit(Object obj, c10 c10Var) {
                                        AnonymousClass1 anonymousClass1;
/* 3 */                                 if (c10Var instanceof AnonymousClass1) {
/* 6 */                                     anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                     int i = anonymousClass1.label;
/* 14 */                                    if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
/* 22 */                                        anonymousClass1 = new AnonymousClass1(c10Var);
                                            }
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
/* 25 */                                Object obj2 = anonymousClass1.result;
/* 27 */                                z10 z10Var = z10.f19902a;
/* 29 */                                int i2 = anonymousClass1.label;
/* 32 */                                if (i2 == 0) {
/* 47 */                                    pg3.m7417A(obj2);
/* 50 */                                    hk0 hk0Var = this.$this_unsafeFlow;
/* 56 */                                    Object objM9300c = ((vk1) obj).m9300c(this.$preferencesKey$inlined);
/* 60 */                                    anonymousClass1.label = 1;
/* 66 */                                    if (hk0Var.emit(objM9300c, anonymousClass1) == z10Var) {
/* 68 */                                        return z10Var;
                                            }
                                        } else {
/* 34 */                                    if (i2 != 1) {
/* 42 */                                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                        return null;
                                            }
/* 36 */                                    pg3.m7417A(obj2);
                                        }
/* 69 */                                return Unit.f12910a;
                                    }
                                }

                                @Override // p000.fk0
                                public Object collect(hk0 hk0Var, c10 c10Var) {
/* 10 */                            Object objCollect = data.collect(new C11242(hk0Var, iw1Var), c10Var);
                                    return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                                }
                            };
/* 59 */                    h22 h22Var2 = this.$value;
/* 61 */                    this.L$0 = h22Var2;
/* 63 */                    this.label = 1;
/* 65 */                    Object objM7430i = pg3.m7430i(fk0Var, this);
/* 69 */                    if (objM7430i == z10Var) {
/* 71 */                        return z10Var;
                            }
/* 73 */                    obj = objM7430i;
/* 74 */                    h22Var = h22Var2;
                        } else {
/* 9 */                     if (i != 1) {
/* 21 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    h22Var = (h22) this.L$0;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 75 */                h22Var.f8873a = obj;
/* 77 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {188}, m5710m = "invokeSuspend")
                public static final class C11251 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ h22 $value;
                    Object L$0;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11251(String str, SharedPreferencesPlugin sharedPreferencesPlugin, h22 h22Var, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = h22Var;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return new C11251(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11251) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
                        h22 h22Var;
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 25 */                    pg3.m7417A(obj);
/* 28 */                    String str = this.$key;
/* 30 */                    str.getClass();
/* 35 */                    final iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 44 */                    if (context == null) {
/* 84 */                        Intrinsics.m6220e("context");
/* 87 */                        throw null;
                            }
/* 50 */                    final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 54 */                    final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
/* 58 */                    fk0 fk0Var = new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2 */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                                public static final class C11262<T> implements hk0 {
                                    final /* synthetic */ iw1 $preferencesKey$inlined;
                                    final /* synthetic */ hk0 $this_unsafeFlow;
                                    final /* synthetic */ SharedPreferencesPlugin this$0;

                                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                    @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                    public static final class AnonymousClass1 extends d10 {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(c10 c10Var) {
/* 3 */                                     super(c10Var);
                                        }

                                        @Override // p000.AbstractC0181bi
                                        public final Object invokeSuspend(Object obj) {
/* 1 */                                     this.result = obj;
/* 8 */                                     this.label |= Integer.MIN_VALUE;
/* 13 */                                    return C11262.this.emit(null, this);
                                        }
                                    }

                                    public C11262(hk0 hk0Var, iw1 iw1Var, SharedPreferencesPlugin sharedPreferencesPlugin) {
/* 1 */                                 this.$this_unsafeFlow = hk0Var;
/* 3 */                                 this.$preferencesKey$inlined = iw1Var;
/* 5 */                                 this.this$0 = sharedPreferencesPlugin;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                    @Override // p000.hk0
                                    public final Object emit(Object obj, c10 c10Var) {
                                        AnonymousClass1 anonymousClass1;
/* 3 */                                 if (c10Var instanceof AnonymousClass1) {
/* 6 */                                     anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                     int i = anonymousClass1.label;
/* 14 */                                    if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
/* 22 */                                        anonymousClass1 = new AnonymousClass1(c10Var);
                                            }
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
/* 25 */                                Object obj2 = anonymousClass1.result;
/* 27 */                                z10 z10Var = z10.f19902a;
/* 29 */                                int i2 = anonymousClass1.label;
/* 32 */                                if (i2 == 0) {
/* 47 */                                    pg3.m7417A(obj2);
/* 50 */                                    hk0 hk0Var = this.$this_unsafeFlow;
/* 70 */                                    Double d = (Double) SharedPreferencesPluginKt.transformPref(((vk1) obj).m9300c(this.$preferencesKey$inlined), this.this$0.listEncoder);
/* 72 */                                    anonymousClass1.label = 1;
/* 78 */                                    if (hk0Var.emit(d, anonymousClass1) == z10Var) {
/* 80 */                                        return z10Var;
                                            }
                                        } else {
/* 34 */                                    if (i2 != 1) {
/* 42 */                                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                        return null;
                                            }
/* 36 */                                    pg3.m7417A(obj2);
                                        }
/* 81 */                                return Unit.f12910a;
                                    }
                                }

                                @Override // p000.fk0
                                public Object collect(hk0 hk0Var, c10 c10Var) {
/* 12 */                            Object objCollect = data.collect(new C11262(hk0Var, iw1Var, sharedPreferencesPlugin), c10Var);
                                    return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                                }
                            };
/* 61 */                    h22 h22Var2 = this.$value;
/* 63 */                    this.L$0 = h22Var2;
/* 65 */                    this.label = 1;
/* 67 */                    Object objM7430i = pg3.m7430i(fk0Var, this);
/* 71 */                    if (objM7430i == z10Var) {
/* 73 */                        return z10Var;
                            }
/* 75 */                    obj = objM7430i;
/* 76 */                    h22Var = h22Var2;
                        } else {
/* 9 */                     if (i != 1) {
/* 21 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    h22Var = (h22) this.L$0;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 77 */                h22Var.f8873a = obj;
/* 79 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {160}, m5710m = "invokeSuspend")
                public static final class C11271 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ h22 $value;
                    Object L$0;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11271(String str, SharedPreferencesPlugin sharedPreferencesPlugin, h22 h22Var, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = h22Var;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return new C11271(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11271) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
                        h22 h22Var;
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 25 */                    pg3.m7417A(obj);
/* 28 */                    String str = this.$key;
/* 30 */                    str.getClass();
/* 35 */                    final iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 44 */                    if (context == null) {
/* 82 */                        Intrinsics.m6220e("context");
/* 85 */                        throw null;
                            }
/* 50 */                    final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 56 */                    fk0 fk0Var = new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2 */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                                public static final class C11282<T> implements hk0 {
                                    final /* synthetic */ iw1 $preferencesKey$inlined;
                                    final /* synthetic */ hk0 $this_unsafeFlow;

                                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                    @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                    public static final class AnonymousClass1 extends d10 {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(c10 c10Var) {
/* 3 */                                     super(c10Var);
                                        }

                                        @Override // p000.AbstractC0181bi
                                        public final Object invokeSuspend(Object obj) {
/* 1 */                                     this.result = obj;
/* 8 */                                     this.label |= Integer.MIN_VALUE;
/* 13 */                                    return C11282.this.emit(null, this);
                                        }
                                    }

                                    public C11282(hk0 hk0Var, iw1 iw1Var) {
/* 1 */                                 this.$this_unsafeFlow = hk0Var;
/* 3 */                                 this.$preferencesKey$inlined = iw1Var;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                    @Override // p000.hk0
                                    public final Object emit(Object obj, c10 c10Var) {
                                        AnonymousClass1 anonymousClass1;
/* 3 */                                 if (c10Var instanceof AnonymousClass1) {
/* 6 */                                     anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                     int i = anonymousClass1.label;
/* 14 */                                    if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
/* 22 */                                        anonymousClass1 = new AnonymousClass1(c10Var);
                                            }
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
/* 25 */                                Object obj2 = anonymousClass1.result;
/* 27 */                                z10 z10Var = z10.f19902a;
/* 29 */                                int i2 = anonymousClass1.label;
/* 32 */                                if (i2 == 0) {
/* 47 */                                    pg3.m7417A(obj2);
/* 50 */                                    hk0 hk0Var = this.$this_unsafeFlow;
/* 56 */                                    Object objM9300c = ((vk1) obj).m9300c(this.$preferencesKey$inlined);
/* 60 */                                    anonymousClass1.label = 1;
/* 66 */                                    if (hk0Var.emit(objM9300c, anonymousClass1) == z10Var) {
/* 68 */                                        return z10Var;
                                            }
                                        } else {
/* 34 */                                    if (i2 != 1) {
/* 42 */                                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                        return null;
                                            }
/* 36 */                                    pg3.m7417A(obj2);
                                        }
/* 69 */                                return Unit.f12910a;
                                    }
                                }

                                @Override // p000.fk0
                                public Object collect(hk0 hk0Var, c10 c10Var) {
/* 10 */                            Object objCollect = data.collect(new C11282(hk0Var, iw1Var), c10Var);
                                    return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                                }
                            };
/* 59 */                    h22 h22Var2 = this.$value;
/* 61 */                    this.L$0 = h22Var2;
/* 63 */                    this.label = 1;
/* 65 */                    Object objM7430i = pg3.m7430i(fk0Var, this);
/* 69 */                    if (objM7430i == z10Var) {
/* 71 */                        return z10Var;
                            }
/* 73 */                    obj = objM7430i;
/* 74 */                    h22Var = h22Var2;
                        } else {
/* 9 */                     if (i != 1) {
/* 21 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    h22Var = (h22) this.L$0;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 75 */                h22Var.f8873a = obj;
/* 77 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", m5708f = "SharedPreferencesPlugin.kt", m5709l = {NotificationCompat.FLAG_LOCAL_ONLY, 258}, m5710m = "getPrefs")
                @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                public static final class C11291 extends d10 {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public C11291(c10 c10Var) {
/* 3 */                 super(c10Var);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 this.result = obj;
/* 8 */                 this.label |= Integer.MIN_VALUE;
/* 1 */                 return SharedPreferencesPlugin.this.getPrefs(null, this);
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {201}, m5710m = "invokeSuspend")
                public static final class C11301 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ h22 $value;
                    Object L$0;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11301(String str, SharedPreferencesPlugin sharedPreferencesPlugin, h22 h22Var, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = h22Var;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return new C11301(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11301) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
                        h22 h22Var;
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 25 */                    pg3.m7417A(obj);
/* 28 */                    String str = this.$key;
/* 30 */                    str.getClass();
/* 35 */                    final iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 44 */                    if (context == null) {
/* 82 */                        Intrinsics.m6220e("context");
/* 85 */                        throw null;
                            }
/* 50 */                    final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 56 */                    fk0 fk0Var = new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2 */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                                public static final class C11312<T> implements hk0 {
                                    final /* synthetic */ iw1 $preferencesKey$inlined;
                                    final /* synthetic */ hk0 $this_unsafeFlow;

                                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                    @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                    public static final class AnonymousClass1 extends d10 {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(c10 c10Var) {
/* 3 */                                     super(c10Var);
                                        }

                                        @Override // p000.AbstractC0181bi
                                        public final Object invokeSuspend(Object obj) {
/* 1 */                                     this.result = obj;
/* 8 */                                     this.label |= Integer.MIN_VALUE;
/* 13 */                                    return C11312.this.emit(null, this);
                                        }
                                    }

                                    public C11312(hk0 hk0Var, iw1 iw1Var) {
/* 1 */                                 this.$this_unsafeFlow = hk0Var;
/* 3 */                                 this.$preferencesKey$inlined = iw1Var;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                    @Override // p000.hk0
                                    public final Object emit(Object obj, c10 c10Var) {
                                        AnonymousClass1 anonymousClass1;
/* 3 */                                 if (c10Var instanceof AnonymousClass1) {
/* 6 */                                     anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                     int i = anonymousClass1.label;
/* 14 */                                    if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
/* 22 */                                        anonymousClass1 = new AnonymousClass1(c10Var);
                                            }
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
/* 25 */                                Object obj2 = anonymousClass1.result;
/* 27 */                                z10 z10Var = z10.f19902a;
/* 29 */                                int i2 = anonymousClass1.label;
/* 32 */                                if (i2 == 0) {
/* 47 */                                    pg3.m7417A(obj2);
/* 50 */                                    hk0 hk0Var = this.$this_unsafeFlow;
/* 56 */                                    Object objM9300c = ((vk1) obj).m9300c(this.$preferencesKey$inlined);
/* 60 */                                    anonymousClass1.label = 1;
/* 66 */                                    if (hk0Var.emit(objM9300c, anonymousClass1) == z10Var) {
/* 68 */                                        return z10Var;
                                            }
                                        } else {
/* 34 */                                    if (i2 != 1) {
/* 42 */                                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                        return null;
                                            }
/* 36 */                                    pg3.m7417A(obj2);
                                        }
/* 69 */                                return Unit.f12910a;
                                    }
                                }

                                @Override // p000.fk0
                                public Object collect(hk0 hk0Var, c10 c10Var) {
/* 10 */                            Object objCollect = data.collect(new C11312(hk0Var, iw1Var), c10Var);
                                    return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                                }
                            };
/* 59 */                    h22 h22Var2 = this.$value;
/* 61 */                    this.L$0 = h22Var2;
/* 63 */                    this.label = 1;
/* 65 */                    Object objM7430i = pg3.m7430i(fk0Var, this);
/* 69 */                    if (objM7430i == z10Var) {
/* 71 */                        return z10Var;
                            }
/* 73 */                    obj = objM7430i;
/* 74 */                    h22Var = h22Var2;
                        } else {
/* 9 */                     if (i != 1) {
/* 21 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    h22Var = (h22) this.L$0;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 75 */                h22Var.f8873a = obj;
/* 77 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {81}, m5710m = "invokeSuspend")
                public static final class C11341 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ boolean $value;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lvk1;", "preferences", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lvk1;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {}, m5710m = "invokeSuspend")
                    public static final class AnonymousClass1 extends tj2 implements Function2<vk1, c10, Object> {
                        final /* synthetic */ iw1 $boolKey;
                        final /* synthetic */ boolean $value;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(iw1 iw1Var, boolean z, c10 c10Var) {
/* 6 */                     super(2, c10Var);
/* 1 */                     this.$boolKey = iw1Var;
/* 3 */                     this.$value = z;
                        }

                        @Override // p000.AbstractC0181bi
                        public final c10 create(Object obj, c10 c10Var) {
/* 7 */                     AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$boolKey, this.$value, c10Var);
/* 10 */                    anonymousClass1.L$0 = obj;
/* 12 */                    return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vk1 vk1Var, c10 c10Var) {
/* 9 */                     return ((AnonymousClass1) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                        }

                        @Override // p000.AbstractC0181bi
                        public final Object invokeSuspend(Object obj) {
/* 1 */                     z10 z10Var = z10.f19902a;
/* 5 */                     if (this.label != 0) {
/* 36 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 7 */                     pg3.m7417A(obj);
/* 12 */                    vk1 vk1Var = (vk1) this.L$0;
/* 14 */                    iw1 iw1Var = this.$boolKey;
/* 18 */                    Boolean boolValueOf = Boolean.valueOf(this.$value);
/* 22 */                    vk1Var.getClass();
/* 25 */                    iw1Var.getClass();
/* 28 */                    vk1Var.m9301d(iw1Var, boolValueOf);
/* 31 */                    return Unit.f12910a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11341(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = z;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return new C11341(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11341) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    String str = this.$key;
/* 26 */                    str.getClass();
/* 31 */                    iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 40 */                    if (context == null) {
/* 72 */                        Intrinsics.m6220e("context");
/* 75 */                        throw null;
                            }
/* 42 */                    h40 sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
/* 50 */                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(iw1Var, this.$value, null);
/* 53 */                    this.label = 1;
/* 64 */                    if (sharedPreferencesDataStore.mo1285a(new fw1(anonymousClass1, null, 1), this) == z10Var) {
/* 66 */                        return z10Var;
                            }
                        } else {
/* 9 */                     if (i != 1) {
/* 17 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 11 */                    pg3.m7417A(obj);
                        }
/* 67 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {128}, m5710m = "invokeSuspend")
                public static final class C11351 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ String $valueString;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11351(String str, String str2, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 3 */                 this.$key = str;
/* 5 */                 this.$valueString = str2;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return SharedPreferencesPlugin.this.new C11351(this.$key, this.$valueString, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11351) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 6 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
/* 26 */                    String str = this.$key;
/* 28 */                    String str2 = this.$valueString;
/* 30 */                    this.label = 1;
/* 36 */                    if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == z10Var) {
/* 38 */                        return z10Var;
                            }
                        } else {
/* 8 */                     if (i != 1) {
/* 16 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                        return null;
                            }
/* 10 */                    pg3.m7417A(obj);
                        }
/* 39 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {107}, m5710m = "invokeSuspend")
                public static final class C11361 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ double $value;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lvk1;", "preferences", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lvk1;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {}, m5710m = "invokeSuspend")
                    public static final class AnonymousClass1 extends tj2 implements Function2<vk1, c10, Object> {
                        final /* synthetic */ iw1 $doubleKey;
                        final /* synthetic */ double $value;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(iw1 iw1Var, double d, c10 c10Var) {
/* 6 */                     super(2, c10Var);
/* 1 */                     this.$doubleKey = iw1Var;
/* 3 */                     this.$value = d;
                        }

                        @Override // p000.AbstractC0181bi
                        public final c10 create(Object obj, c10 c10Var) {
/* 7 */                     AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$doubleKey, this.$value, c10Var);
/* 10 */                    anonymousClass1.L$0 = obj;
/* 12 */                    return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vk1 vk1Var, c10 c10Var) {
/* 9 */                     return ((AnonymousClass1) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                        }

                        @Override // p000.AbstractC0181bi
                        public final Object invokeSuspend(Object obj) {
/* 1 */                     z10 z10Var = z10.f19902a;
/* 5 */                     if (this.label != 0) {
/* 37 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 40 */                        return null;
                            }
/* 7 */                     pg3.m7417A(obj);
/* 12 */                    vk1 vk1Var = (vk1) this.L$0;
/* 14 */                    iw1 iw1Var = this.$doubleKey;
/* 20 */                    Double d = new Double(this.$value);
/* 23 */                    vk1Var.getClass();
/* 26 */                    iw1Var.getClass();
/* 29 */                    vk1Var.m9301d(iw1Var, d);
/* 32 */                    return Unit.f12910a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11361(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = d;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 10 */                return new C11361(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11361) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    String str = this.$key;
/* 26 */                    str.getClass();
/* 31 */                    iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 40 */                    if (context == null) {
/* 72 */                        Intrinsics.m6220e("context");
/* 75 */                        throw null;
                            }
/* 42 */                    h40 sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
/* 50 */                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(iw1Var, this.$value, null);
/* 53 */                    this.label = 1;
/* 64 */                    if (sharedPreferencesDataStore.mo1285a(new fw1(anonymousClass1, null, 1), this) == z10Var) {
/* 66 */                        return z10Var;
                            }
                        } else {
/* 9 */                     if (i != 1) {
/* 17 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 11 */                    pg3.m7417A(obj);
                        }
/* 67 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {117}, m5710m = "invokeSuspend")
                public static final class C11371 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ String $value;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11371(String str, String str2, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 3 */                 this.$key = str;
/* 5 */                 this.$value = str2;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return SharedPreferencesPlugin.this.new C11371(this.$key, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11371) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 6 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
/* 26 */                    String str = this.$key;
/* 28 */                    String str2 = this.$value;
/* 30 */                    this.label = 1;
/* 36 */                    if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == z10Var) {
/* 38 */                        return z10Var;
                            }
                        } else {
/* 8 */                     if (i != 1) {
/* 16 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                        return null;
                            }
/* 10 */                    pg3.m7417A(obj);
                        }
/* 39 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {99}, m5710m = "invokeSuspend")
                public static final class C11381 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ long $value;
                    int label;
                    final /* synthetic */ SharedPreferencesPlugin this$0;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"Lvk1;", "preferences", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lvk1;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                    @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {}, m5710m = "invokeSuspend")
                    public static final class AnonymousClass1 extends tj2 implements Function2<vk1, c10, Object> {
                        final /* synthetic */ iw1 $intKey;
                        final /* synthetic */ long $value;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(iw1 iw1Var, long j, c10 c10Var) {
/* 6 */                     super(2, c10Var);
/* 1 */                     this.$intKey = iw1Var;
/* 3 */                     this.$value = j;
                        }

                        @Override // p000.AbstractC0181bi
                        public final c10 create(Object obj, c10 c10Var) {
/* 7 */                     AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$intKey, this.$value, c10Var);
/* 10 */                    anonymousClass1.L$0 = obj;
/* 12 */                    return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(vk1 vk1Var, c10 c10Var) {
/* 9 */                     return ((AnonymousClass1) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                        }

                        @Override // p000.AbstractC0181bi
                        public final Object invokeSuspend(Object obj) {
/* 1 */                     z10 z10Var = z10.f19902a;
/* 5 */                     if (this.label != 0) {
/* 37 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 40 */                        return null;
                            }
/* 7 */                     pg3.m7417A(obj);
/* 12 */                    vk1 vk1Var = (vk1) this.L$0;
/* 14 */                    iw1 iw1Var = this.$intKey;
/* 20 */                    Long l = new Long(this.$value);
/* 23 */                    vk1Var.getClass();
/* 26 */                    iw1Var.getClass();
/* 29 */                    vk1Var.m9301d(iw1Var, l);
/* 32 */                    return Unit.f12910a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11381(String str, SharedPreferencesPlugin sharedPreferencesPlugin, long j, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 1 */                 this.$key = str;
/* 3 */                 this.this$0 = sharedPreferencesPlugin;
/* 5 */                 this.$value = j;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 10 */                return new C11381(this.$key, this.this$0, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11381) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    String str = this.$key;
/* 26 */                    str.getClass();
/* 31 */                    iw1 iw1Var = new iw1(str);
/* 1 */                     Context context = this.this$0.context;
/* 40 */                    if (context == null) {
/* 72 */                        Intrinsics.m6220e("context");
/* 75 */                        throw null;
                            }
/* 42 */                    h40 sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
/* 50 */                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(iw1Var, this.$value, null);
/* 53 */                    this.label = 1;
/* 64 */                    if (sharedPreferencesDataStore.mo1285a(new fw1(anonymousClass1, null, 1), this) == z10Var) {
/* 66 */                        return z10Var;
                            }
                        } else {
/* 9 */                     if (i != 1) {
/* 17 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 11 */                    pg3.m7417A(obj);
                        }
/* 67 */                return Unit.f12910a;
                    }
                }

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)V"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {87}, m5710m = "invokeSuspend")
                public static final class C11391 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ String $key;
                    final /* synthetic */ String $value;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11391(String str, String str2, c10 c10Var) {
/* 8 */                 super(2, c10Var);
/* 3 */                 this.$key = str;
/* 5 */                 this.$value = str2;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 9 */                 return SharedPreferencesPlugin.this.new C11391(this.$key, this.$value, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C11391) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 6 */                 if (i == 0) {
/* 21 */                    pg3.m7417A(obj);
/* 24 */                    SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
/* 26 */                    String str = this.$key;
/* 28 */                    String str2 = this.$value;
/* 30 */                    this.label = 1;
/* 36 */                    if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == z10Var) {
/* 38 */                        return z10Var;
                            }
                        } else {
/* 8 */                     if (i != 1) {
/* 16 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                        return null;
                            }
/* 10 */                    pg3.m7417A(obj);
                        }
/* 39 */                return Unit.f12910a;
                    }
                }

                public SharedPreferencesPlugin() {
/* 9 */             this.listEncoder = new ListEncoder();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object dataStoreSetString(String str, String str2, c10 c10Var) {
/* 1 */             str.getClass();
/* 6 */             iw1 iw1Var = new iw1(str);
/* 9 */             Context context = this.context;
/* 12 */            if (context != null) {
/* 29 */                Object objMo1285a = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).mo1285a(new fw1(new C11212(iw1Var, str2, null), null, 1), c10Var);
                        return objMo1285a == z10.f19902a ? objMo1285a : Unit.f12910a;
                    }
/* 43 */            Intrinsics.m6220e("context");
/* 46 */            throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:28:0x0087  */
                /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
                
                    if (r9 == r1) goto L30;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:31:0x00a0). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object getPrefs(List<String> list, c10 c10Var) {
                    C11291 c11291;
                    SharedPreferencesPlugin sharedPreferencesPlugin;
                    Map map;
                    Set set;
                    Set set2;
                    Iterator it;
                    SharedPreferencesPlugin sharedPreferencesPlugin2;
                    Map map2;
                    iw1 iw1Var;
                    Object objTransformPref;
/* 3 */             if (c10Var instanceof C11291) {
/* 6 */                 c11291 = (C11291) c10Var;
/* 8 */                 int i = c11291.label;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c11291.label = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c11291 = new C11291(c10Var);
                        }
                    } else {
/* 22 */                c11291 = new C11291(c10Var);
                    }
/* 25 */            Object allKeys = c11291.result;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c11291.label;
/* 34 */            if (i2 == 0) {
/* 86 */                pg3.m7417A(allKeys);
/* 91 */                Set setM6195N = list != null ? CollectionsKt.m6195N(list) : null;
/* 97 */                LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 100 */               c11291.L$0 = this;
/* 102 */               c11291.L$1 = setM6195N;
/* 104 */               c11291.L$2 = linkedHashMap;
/* 106 */               c11291.label = 1;
/* 108 */               allKeys = readAllKeys(c11291);
/* 112 */               if (allKeys != z10Var) {
/* 115 */                   sharedPreferencesPlugin = this;
/* 116 */                   map = linkedHashMap;
/* 117 */                   set = setM6195N;
                        }
/* 160 */               return z10Var;
                    }
/* 36 */            if (i2 == 1) {
/* 72 */                map = (Map) c11291.L$2;
/* 76 */                set = (Set) c11291.L$1;
/* 80 */                sharedPreferencesPlugin = (SharedPreferencesPlugin) c11291.L$0;
/* 82 */                pg3.m7417A(allKeys);
                    } else {
/* 38 */                if (i2 != 2) {
/* 66 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 42 */                iw1Var = (iw1) c11291.L$4;
/* 46 */                it = (Iterator) c11291.L$3;
/* 50 */                map2 = (Map) c11291.L$2;
/* 54 */                set2 = (Set) c11291.L$1;
/* 58 */                sharedPreferencesPlugin2 = (SharedPreferencesPlugin) c11291.L$0;
/* 60 */                pg3.m7417A(allKeys);
                    }
/* 167 */           if (SharedPreferencesPluginKt.preferencesFilter(iw1Var.f11950a, allKeys, set2) && (objTransformPref = SharedPreferencesPluginKt.transformPref(allKeys, sharedPreferencesPlugin2.listEncoder)) != null) {
/* 179 */               map2.put(iw1Var.f11950a, objTransformPref);
                    }
/* 134 */           if (it.hasNext()) {
/* 183 */               return map2;
                    }
/* 140 */           iw1Var = (iw1) it.next();
/* 142 */           c11291.L$0 = sharedPreferencesPlugin2;
/* 144 */           c11291.L$1 = set2;
/* 146 */           c11291.L$2 = map2;
/* 148 */           c11291.L$3 = it;
/* 150 */           c11291.L$4 = iw1Var;
/* 152 */           c11291.label = 2;
/* 154 */           allKeys = sharedPreferencesPlugin2.getValueByKey(iw1Var, c11291);
/* 118 */           Set set3 = (Set) allKeys;
/* 120 */           if (set3 == null) {
/* 184 */               return map;
                    }
/* 126 */           set2 = set;
/* 122 */           it = set3.iterator();
/* 128 */           sharedPreferencesPlugin2 = sharedPreferencesPlugin;
/* 129 */           map2 = map;
/* 134 */           if (it.hasNext()) {
/* 183 */               return map2;
                    }
/* 140 */           iw1Var = (iw1) it.next();
/* 142 */           c11291.L$0 = sharedPreferencesPlugin2;
/* 144 */           c11291.L$1 = set2;
/* 146 */           c11291.L$2 = map2;
/* 148 */           c11291.L$3 = it;
/* 150 */           c11291.L$4 = iw1Var;
/* 152 */           c11291.label = 2;
/* 154 */           allKeys = sharedPreferencesPlugin2.getValueByKey(iw1Var, c11291);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object getValueByKey(final iw1 iw1Var, c10 c10Var) {
/* 1 */             Context context = this.context;
/* 3 */             if (context != null) {
/* 9 */                 final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 18 */                return pg3.m7430i(new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

                            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2 */
                            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                            @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                            public static final class C11322<T> implements hk0 {
                                final /* synthetic */ iw1 $key$inlined;
                                final /* synthetic */ hk0 $this_unsafeFlow;

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                public static final class AnonymousClass1 extends d10 {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(c10 c10Var) {
/* 3 */                                 super(c10Var);
                                    }

                                    @Override // p000.AbstractC0181bi
                                    public final Object invokeSuspend(Object obj) {
/* 1 */                                 this.result = obj;
/* 8 */                                 this.label |= Integer.MIN_VALUE;
/* 13 */                                return C11322.this.emit(null, this);
                                    }
                                }

                                public C11322(hk0 hk0Var, iw1 iw1Var) {
/* 1 */                             this.$this_unsafeFlow = hk0Var;
/* 3 */                             this.$key$inlined = iw1Var;
                                }

                                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                @Override // p000.hk0
                                public final Object emit(Object obj, c10 c10Var) {
                                    AnonymousClass1 anonymousClass1;
/* 3 */                             if (c10Var instanceof AnonymousClass1) {
/* 6 */                                 anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                 int i = anonymousClass1.label;
/* 14 */                                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
                                    } else {
/* 22 */                                anonymousClass1 = new AnonymousClass1(c10Var);
                                    }
/* 25 */                            Object obj2 = anonymousClass1.result;
/* 27 */                            z10 z10Var = z10.f19902a;
/* 29 */                            int i2 = anonymousClass1.label;
/* 32 */                            if (i2 == 0) {
/* 47 */                                pg3.m7417A(obj2);
/* 50 */                                hk0 hk0Var = this.$this_unsafeFlow;
/* 56 */                                Object objM9300c = ((vk1) obj).m9300c(this.$key$inlined);
/* 60 */                                anonymousClass1.label = 1;
/* 66 */                                if (hk0Var.emit(objM9300c, anonymousClass1) == z10Var) {
/* 68 */                                    return z10Var;
                                        }
                                    } else {
/* 34 */                                if (i2 != 1) {
/* 42 */                                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                    return null;
                                        }
/* 36 */                                pg3.m7417A(obj2);
                                    }
/* 69 */                            return Unit.f12910a;
                                }
                            }

                            @Override // p000.fk0
                            public Object collect(hk0 hk0Var, c10 c10Var2) {
/* 10 */                        Object objCollect = data.collect(new C11322(hk0Var, iw1Var), c10Var2);
                                return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                            }
                        }, c10Var);
                    }
/* 25 */            Intrinsics.m6220e("context");
/* 29 */            throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object readAllKeys(c10 c10Var) {
/* 1 */             Context context = this.context;
/* 3 */             if (context != null) {
/* 9 */                 final fk0 data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
/* 18 */                return pg3.m7430i(new fk0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

                            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2 */
                            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                            @Metadata(m6175d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T", "R", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "emit", "(Ljava/lang/Object;Lc10;)Ljava/lang/Object;", "<anonymous>"}, m6177k = 3, m6178mv = {2, 1, 0})
                            public static final class C11332<T> implements hk0 {
                                final /* synthetic */ hk0 $this_unsafeFlow;

                                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                                @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", m5708f = "SharedPreferencesPlugin.kt", m5709l = {223}, m5710m = "emit")
                                @Metadata(m6177k = 3, m6178mv = {2, 1, 0}, m6180xi = 48)
                                public static final class AnonymousClass1 extends d10 {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(c10 c10Var) {
/* 3 */                                 super(c10Var);
                                    }

                                    @Override // p000.AbstractC0181bi
                                    public final Object invokeSuspend(Object obj) {
/* 1 */                                 this.result = obj;
/* 8 */                                 this.label |= Integer.MIN_VALUE;
/* 13 */                                return C11332.this.emit(null, this);
                                    }
                                }

                                public C11332(hk0 hk0Var) {
/* 1 */                             this.$this_unsafeFlow = hk0Var;
                                }

                                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                @Override // p000.hk0
                                public final Object emit(Object obj, c10 c10Var) {
                                    AnonymousClass1 anonymousClass1;
/* 3 */                             if (c10Var instanceof AnonymousClass1) {
/* 6 */                                 anonymousClass1 = (AnonymousClass1) c10Var;
/* 8 */                                 int i = anonymousClass1.label;
/* 14 */                                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
/* 22 */                                    anonymousClass1 = new AnonymousClass1(c10Var);
                                        }
                                    } else {
/* 22 */                                anonymousClass1 = new AnonymousClass1(c10Var);
                                    }
/* 25 */                            Object obj2 = anonymousClass1.result;
/* 27 */                            z10 z10Var = z10.f19902a;
/* 29 */                            int i2 = anonymousClass1.label;
/* 32 */                            if (i2 == 0) {
/* 47 */                                pg3.m7417A(obj2);
/* 50 */                                hk0 hk0Var = this.$this_unsafeFlow;
/* 58 */                                Set setKeySet = ((vk1) obj).m9298a().keySet();
/* 62 */                                anonymousClass1.label = 1;
/* 68 */                                if (hk0Var.emit(setKeySet, anonymousClass1) == z10Var) {
/* 70 */                                    return z10Var;
                                        }
                                    } else {
/* 34 */                                if (i2 != 1) {
/* 42 */                                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                                    return null;
                                        }
/* 36 */                                pg3.m7417A(obj2);
                                    }
/* 71 */                            return Unit.f12910a;
                                }
                            }

                            @Override // p000.fk0
                            public Object collect(hk0 hk0Var, c10 c10Var2) {
/* 8 */                         Object objCollect = data.collect(new C11332(hk0Var), c10Var2);
                                return objCollect == z10.f19902a ? objCollect : Unit.f12910a;
                            }
                        }, c10Var);
                    }
/* 25 */            Intrinsics.m6220e("context");
/* 29 */            throw null;
                }

                private final void setUp(BinaryMessenger messenger, Context context) {
/* 1 */             this.context = context;
                    try {
/* 7 */                 SharedPreferencesAsyncApi.INSTANCE.setUp(messenger, this, "data_store");
/* 17 */                this.backend = new SharedPreferencesBackend(messenger, context, this.listEncoder);
                    } catch (Exception e) {
/* 25 */                AbstractC1245n0.m4877e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e);
                    }
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void clear(List<String> allowList, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             options.getClass();
/* 10 */            i13.m4419A(new C11201(allowList, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Map<String, Object> getAll(List<String> allowList, SharedPreferencesPigeonOptions options) {
/* 1 */             options.getClass();
/* 14 */            return (Map) i13.m4419A(new C11221(allowList, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Boolean getBool(String key, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 9 */             h22 h22Var = new h22();
/* 18 */            i13.m4419A(new C11231(key, this, h22Var, null));
/* 23 */            return (Boolean) h22Var.f8873a;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Double getDouble(String key, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 9 */             h22 h22Var = new h22();
/* 18 */            i13.m4419A(new C11251(key, this, h22Var, null));
/* 23 */            return (Double) h22Var.f8873a;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Long getInt(String key, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 9 */             h22 h22Var = new h22();
/* 18 */            i13.m4419A(new C11271(key, this, h22Var, null));
/* 23 */            return (Long) h22Var.f8873a;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public List<String> getKeys(List<String> allowList, SharedPreferencesPigeonOptions options) {
/* 1 */             options.getClass();
/* 20 */            return CollectionsKt.m6192K(((Map) i13.m4419A(new SharedPreferencesPlugin$getKeys$prefs$1(this, allowList, null))).keySet());
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
                    List list;
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             String string = getString(key, options);
/* 11 */            if (string == null || C1852e.m6263m(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || !C1852e.m6263m(string, SharedPreferencesPluginKt.LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
/* 68 */                return null;
                    }
/* 42 */            ArrayList arrayList = new ArrayList();
/* 53 */            for (Object obj : list) {
/* 61 */                if (obj instanceof String) {
/* 63 */                    arrayList.add(obj);
                        }
                    }
/* 67 */            return arrayList;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public String getString(String key, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 9 */             h22 h22Var = new h22();
/* 18 */            i13.m4419A(new C11301(key, this, h22Var, null));
/* 23 */            return (String) h22Var.f8873a;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             String string = getString(key, options);
/* 12 */            if (string == null) {
/* 11 */                return null;
                    }
/* 21 */            if (C1852e.m6263m(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false)) {
/* 27 */                return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
                    }
                    return C1852e.m6263m(string, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
/* 8 */             binaryMessenger.getClass();
/* 11 */            Context applicationContext = binding.getApplicationContext();
/* 15 */            applicationContext.getClass();
/* 18 */            setUp(binaryMessenger, applicationContext);
/* 26 */            new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
/* 1 */             binding.getClass();
/* 4 */             SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.INSTANCE;
/* 6 */             BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
/* 10 */            binaryMessenger.getClass();
/* 16 */            companion.setUp(binaryMessenger, null, "data_store");
/* 19 */            SharedPreferencesBackend sharedPreferencesBackend = this.backend;
/* 21 */            if (sharedPreferencesBackend != null) {
/* 23 */                sharedPreferencesBackend.tearDown();
                    }
/* 26 */            this.backend = null;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setBool(String key, boolean value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 13 */            i13.m4419A(new C11341(key, this, value, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 28 */            i13.m4419A(new C11351(key, AbstractC0886en.m3507k(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)), null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setDouble(String key, double value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 16 */            i13.m4419A(new C11361(key, this, value, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 16 */            i13.m4419A(new C11371(key, value, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setInt(String key, long value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 16 */            i13.m4419A(new C11381(key, this, value, null));
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setString(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 16 */            i13.m4419A(new C11391(key, value, null));
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 11 */        public SharedPreferencesPlugin(SharedPreferencesListEncoder sharedPreferencesListEncoder) {
/* 12 */            this();
                    sharedPreferencesListEncoder.getClass();
/* 13 */            this.listEncoder = sharedPreferencesListEncoder;
                }
            }
