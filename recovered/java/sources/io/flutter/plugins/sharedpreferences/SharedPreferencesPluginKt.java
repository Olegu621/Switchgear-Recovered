            package io.flutter.plugins.sharedpreferences;

            import android.content.Context;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.List;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.C0170b7;
            import p000.c60;
            import p000.h40;
            import p000.hw1;
            import p000.j22;
            import p000.k50;
            import p000.pi2;
            import p000.sy1;
            import p000.u21;
            import p000.w02;
            import p000.z80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "key", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "allowList", HttpUrl.FRAGMENT_ENCODE_SET, "preferencesFilter", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Z", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "listEncoder", "transformPref", "(Ljava/lang/Object;Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "SHARED_PREFERENCES_NAME", "LIST_PREFIX", "JSON_LIST_PREFIX", "DOUBLE_PREFIX", "Landroid/content/Context;", "Lh40;", "Lvk1;", "sharedPreferencesDataStore$delegate", "Lw02;", "getSharedPreferencesDataStore", "(Landroid/content/Context;)Lh40;", "sharedPreferencesDataStore", "shared_preferences_android_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class SharedPreferencesPluginKt {
                static final /* synthetic */ u21[] $$delegatedProperties;
                public static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
                public static final String JSON_LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
                public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
                public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
                public static final String TAG = "SharedPreferencesPlugin";
                private static final w02 sharedPreferencesDataStore$delegate;

                static {
/* 10 */            sy1 sy1Var = new sy1(SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
/* 15 */            j22.f12033a.getClass();
/* 23 */            $$delegatedProperties = new u21[]{sy1Var};
/* 25 */            C0170b7 c0170b7 = C0170b7.f2252X;
/* 27 */            c60 c60Var = z80.f19977c;
/* 31 */            pi2 pi2Var = new pi2();
/* 34 */            c60Var.getClass();
/* 50 */            sharedPreferencesDataStore$delegate = new hw1(c0170b7, k50.m5964a(AbstractC1844e.m6215c(c60Var, pi2Var)));
                }

                public static final h40 getSharedPreferencesDataStore(Context context) {
/* 1 */             context.getClass();
/* 15 */            return (h40) sharedPreferencesDataStore$delegate.mo4392a(context, $$delegatedProperties[0]);
                }

                public static final boolean preferencesFilter(String str, Object obj, Set<String> set) {
/* 1 */             str.getClass();
/* 4 */             if (set == null) {
                        return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double);
                    }
/* 27 */            return set.contains(str);
                }

                public static final Object transformPref(Object obj, SharedPreferencesListEncoder sharedPreferencesListEncoder) {
/* 1 */             sharedPreferencesListEncoder.getClass();
/* 6 */             if (!(obj instanceof String)) {
/* 63 */                return obj;
                    }
/* 9 */             String str = (String) obj;
/* 20 */            if (!C1852e.m6263m(str, LIST_PREFIX, false)) {
                        return C1852e.m6263m(str, DOUBLE_PREFIX, false) ? Double.valueOf(Double.parseDouble(str.substring(40))) : obj;
                    }
/* 28 */            if (C1852e.m6263m(str, JSON_LIST_PREFIX, false)) {
/* 30 */                return obj;
                    }
/* 35 */            List<String> listDecode = sharedPreferencesListEncoder.decode(str.substring(40));
/* 39 */            listDecode.getClass();
/* 42 */            return listDecode;
                }
            }
