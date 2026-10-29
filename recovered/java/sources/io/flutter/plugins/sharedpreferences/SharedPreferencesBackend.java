            package io.flutter.plugins.sharedpreferences;

            import android.content.Context;
            import android.content.SharedPreferences;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.i13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J \u0010\u001d\u001a\u00020\u000b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020!0 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "context", "Landroid/content/Context;", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "tearDown", HttpUrl.FRAGMENT_ENCODE_SET, "createSharedPreferences", "Landroid/content/SharedPreferences;", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setBool", "key", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "setString", "setInt", HttpUrl.FRAGMENT_ENCODE_SET, "setDouble", HttpUrl.FRAGMENT_ENCODE_SET, "setEncodedStringList", "setDeprecatedStringList", HttpUrl.FRAGMENT_ENCODE_SET, "clear", "allowList", "getAll", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "getKeys", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 34 */    public final class SharedPreferencesBackend implements SharedPreferencesAsyncApi {
                private Context context;
                private SharedPreferencesListEncoder listEncoder;
                private BinaryMessenger messenger;

                public SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context, SharedPreferencesListEncoder sharedPreferencesListEncoder) {
/* 1 */             binaryMessenger.getClass();
/* 4 */             context.getClass();
/* 7 */             sharedPreferencesListEncoder.getClass();
/* 13 */            this.messenger = binaryMessenger;
/* 15 */            this.context = context;
/* 17 */            this.listEncoder = sharedPreferencesListEncoder;
                    try {
/* 23 */                SharedPreferencesAsyncApi.INSTANCE.setUp(binaryMessenger, this, "shared_preferences");
                    } catch (Exception e) {
/* 32 */                AbstractC1245n0.m4877e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesBackend", e);
                    }
                }

                private final SharedPreferences createSharedPreferences(SharedPreferencesPigeonOptions options) {
/* 1 */             String fileName = options.getFileName();
/* 5 */             Context context = this.context;
/* 7 */             if (fileName == null) {
/* 9 */                 SharedPreferences sharedPreferencesM4439r = i13.m4439r(context);
/* 13 */                sharedPreferencesM4439r.getClass();
/* 16 */                return sharedPreferencesM4439r;
                    }
/* 22 */            SharedPreferences sharedPreferences = context.getSharedPreferences(options.getFileName(), 0);
/* 26 */            sharedPreferences.getClass();
/* 29 */            return sharedPreferences;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void clear(List<String> allowList, SharedPreferencesPigeonOptions options) {
/* 1 */             options.getClass();
/* 4 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 8 */             SharedPreferences.Editor editorEdit = sharedPreferencesCreateSharedPreferences.edit();
/* 12 */            editorEdit.getClass();
/* 15 */            Map<String, ?> all = sharedPreferencesCreateSharedPreferences.getAll();
/* 19 */            all.getClass();
/* 24 */            ArrayList arrayList = new ArrayList();
/* 39 */            for (String str : all.keySet()) {
/* 63 */                if (SharedPreferencesPluginKt.preferencesFilter(str, all.get(str), allowList != null ? CollectionsKt.m6195N(allowList) : null)) {
/* 65 */                    arrayList.add(str);
                        }
                    }
/* 69 */            Iterator it = arrayList.iterator();
/* 73 */            it.getClass();
/* 80 */            while (it.hasNext()) {
/* 82 */                Object next = it.next();
/* 86 */                next.getClass();
/* 91 */                editorEdit.remove((String) next);
                    }
/* 95 */            editorEdit.apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Map<String, Object> getAll(List<String> allowList, SharedPreferencesPigeonOptions options) {
                    Object value;
/* 1 */             options.getClass();
/* 8 */             Map<String, ?> all = createSharedPreferences(options).getAll();
/* 12 */            all.getClass();
/* 17 */            HashMap map = new HashMap();
/* 32 */            for (Map.Entry<String, ?> entry : all.entrySet()) {
/* 62 */                if (SharedPreferencesPluginKt.preferencesFilter(entry.getKey(), entry.getValue(), allowList != null ? CollectionsKt.m6195N(allowList) : null) && (value = entry.getValue()) != null) {
/* 70 */                    String key = entry.getKey();
/* 76 */                    Object objTransformPref = SharedPreferencesPluginKt.transformPref(value, this.listEncoder);
/* 80 */                    objTransformPref.getClass();
/* 83 */                    map.put(key, objTransformPref);
                        }
                    }
/* 87 */            return map;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 15 */            if (sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 22 */                return Boolean.valueOf(sharedPreferencesCreateSharedPreferences.getBoolean(key, true));
                    }
/* 27 */            return null;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 15 */            if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 35 */                return null;
                    }
/* 25 */            Object objTransformPref = SharedPreferencesPluginKt.transformPref(sharedPreferencesCreateSharedPreferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET), this.listEncoder);
/* 29 */            objTransformPref.getClass();
/* 32 */            return (Double) objTransformPref;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public Long getInt(String key, SharedPreferencesPigeonOptions options) {
                    long j;
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 15 */            if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 35 */                return null;
                    }
                    try {
/* 19 */                j = sharedPreferencesCreateSharedPreferences.getLong(key, 0L);
                    } catch (ClassCastException unused) {
/* 25 */                j = sharedPreferencesCreateSharedPreferences.getInt(key, 0);
                    }
/* 30 */            return Long.valueOf(j);
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public List<String> getKeys(List<String> allowList, SharedPreferencesPigeonOptions options) {
/* 1 */             options.getClass();
/* 8 */             Map<String, ?> all = createSharedPreferences(options).getAll();
/* 12 */            all.getClass();
/* 17 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 32 */            for (Map.Entry<String, ?> entry : all.entrySet()) {
/* 40 */                String key = entry.getKey();
/* 44 */                key.getClass();
/* 65 */                if (SharedPreferencesPluginKt.preferencesFilter(key, entry.getValue(), allowList != null ? CollectionsKt.m6195N(allowList) : null)) {
/* 75 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 83 */            return CollectionsKt.m6192K(linkedHashMap.keySet());
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
                    List list;
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 15 */            if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 85 */                return null;
                    }
/* 19 */            String string = sharedPreferencesCreateSharedPreferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET);
/* 23 */            string.getClass();
/* 33 */            if (!C1852e.m6263m(string, SharedPreferencesPluginKt.LIST_PREFIX, false) || C1852e.m6263m(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(sharedPreferencesCreateSharedPreferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET), this.listEncoder)) == null) {
/* 85 */                return null;
                    }
/* 59 */            ArrayList arrayList = new ArrayList();
/* 70 */            for (Object obj : list) {
/* 78 */                if (obj instanceof String) {
/* 80 */                    arrayList.add(obj);
                        }
                    }
/* 84 */            return arrayList;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public String getString(String key, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 15 */            if (sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 19 */                return sharedPreferencesCreateSharedPreferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET);
                    }
/* 24 */            return null;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 7 */             SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
/* 16 */            if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
/* 15 */                return null;
                    }
/* 20 */            String string = sharedPreferencesCreateSharedPreferences.getString(key, HttpUrl.FRAGMENT_ENCODE_SET);
/* 24 */            string.getClass();
/* 34 */            if (C1852e.m6263m(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false)) {
/* 40 */                return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
                    }
                    return C1852e.m6263m(string, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setBool(String key, boolean value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 19 */            createSharedPreferences(options).edit().putBoolean(key, value).apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 34 */            createSharedPreferences(options).edit().putString(key, AbstractC0886en.m3507k(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value))).apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setDouble(String key, double value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 33 */            createSharedPreferences(options).edit().putString(key, SharedPreferencesPluginKt.DOUBLE_PREFIX + value).apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 22 */            createSharedPreferences(options).edit().putString(key, value).apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setInt(String key, long value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             options.getClass();
/* 19 */            createSharedPreferences(options).edit().putLong(key, value).apply();
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
                public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
/* 1 */             key.getClass();
/* 4 */             value.getClass();
/* 7 */             options.getClass();
/* 22 */            createSharedPreferences(options).edit().putString(key, value).apply();
                }

                public final void tearDown() {
/* 8 */             SharedPreferencesAsyncApi.INSTANCE.setUp(this.messenger, null, "shared_preferences");
                }

/* 35 */        public /* synthetic */ SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context, SharedPreferencesListEncoder sharedPreferencesListEncoder, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 37 */            this(binaryMessenger, context, (i & 4) != 0 ? new ListEncoder() : sharedPreferencesListEncoder);
                }
            }
