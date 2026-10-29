            package io.flutter.plugins.sharedpreferences;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.util.Base64;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.ObjectOutputStream;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class LegacySharedPreferencesPlugin implements FlutterPlugin, Messages.SharedPreferencesApi {
                private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
                private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
                private static final String JSON_LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
                private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
                private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
                private static final String TAG = "SharedPreferencesPlugin";
                private final SharedPreferencesListEncoder listEncoder;
                private SharedPreferences preferences;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ListEncoder implements SharedPreferencesListEncoder {
                    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
                    public List<String> decode(String str) throws RuntimeException {
                        try {
/* 20 */                    return (List) new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                        } catch (IOException | ClassNotFoundException e) {
/* 24 */                    ds0.m3199p(e);
/* 27 */                    return null;
                        }
                    }

                    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
                    public String encode(List<String> list) throws RuntimeException {
                        try {
/* 3 */                     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
/* 11 */                    objectOutputStream.writeObject(list);
/* 14 */                    objectOutputStream.flush();
/* 22 */                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        } catch (IOException e) {
/* 28 */                    ds0.m3199p(e);
/* 31 */                    return null;
                        }
                    }
                }

                public LegacySharedPreferencesPlugin() {
/* 6 */             this(new ListEncoder());
                }

                private Map<String, Object> getAllPrefs(String str, Set<String> set) throws RuntimeException {
/* 3 */             Map<String, ?> all = this.preferences.getAll();
/* 9 */             HashMap map = new HashMap();
/* 24 */            for (String str2 : all.keySet()) {
/* 36 */                if (str2.startsWith(str) && (set == null || set.contains(str2))) {
/* 46 */                    Object obj = all.get(str2);
/* 50 */                    Objects.requireNonNull(obj);
/* 57 */                    map.put(str2, transformPref(str2, obj));
                        }
                    }
/* 61 */            return map;
                }

                private void setUp(BinaryMessenger binaryMessenger, Context context) {
/* 8 */             this.preferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
                    try {
/* 10 */                Messages.SharedPreferencesApi.setUp(binaryMessenger, this);
                    } catch (Exception e) {
/* 19 */                AbstractC1245n0.m4877e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e);
                    }
                }

                private Object transformPref(String str, Object obj) {
/* 5 */             if (obj instanceof String) {
/* 8 */                 String str2 = (String) obj;
/* 16 */                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                            return str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? obj : this.listEncoder.decode(str2.substring(40));
                        }
/* 44 */                if (str2.startsWith(BIG_INTEGER_PREFIX)) {
/* 56 */                    return new BigInteger(str2.substring(44), 36);
                        }
/* 66 */                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
/* 72 */                    return Double.valueOf(str2.substring(40));
                        }
                    } else if (obj instanceof Set) {
/* 85 */                ArrayList arrayList = new ArrayList((Set) obj);
/* 120 */               this.preferences.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.listEncoder.encode(arrayList)).apply();
/* 123 */               return arrayList;
                    }
/* 124 */           return obj;
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean clear(String str, List<String> list) throws RuntimeException {
/* 3 */             SharedPreferences.Editor editorEdit = this.preferences.edit();
/* 9 */             Map<String, ?> all = this.preferences.getAll();
/* 15 */            ArrayList arrayList = new ArrayList();
/* 30 */            for (String str2 : all.keySet()) {
/* 42 */                if (str2.startsWith(str) && (list == null || list.contains(str2))) {
/* 52 */                    arrayList.add(str2);
                        }
                    }
/* 56 */            Iterator it = arrayList.iterator();
/* 64 */            while (it.hasNext()) {
/* 72 */                editorEdit.remove((String) it.next());
                    }
/* 80 */            return Boolean.valueOf(editorEdit.commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Map<String, Object> getAll(String str, List<String> list) throws RuntimeException {
/* 11 */            return getAllPrefs(str, list == null ? null : new HashSet(list));
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 9 */             setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 6 */             Messages.SharedPreferencesApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean remove(String str) {
/* 15 */            return Boolean.valueOf(this.preferences.edit().remove(str).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean setBool(String str, Boolean bool) {
/* 19 */            return Boolean.valueOf(this.preferences.edit().putBoolean(str, bool.booleanValue()).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                @Deprecated
                public Boolean setDeprecatedStringList(String str, List<String> list) throws RuntimeException {
/* 35 */            return Boolean.valueOf(this.preferences.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.listEncoder.encode(list)).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean setDouble(String str, Double d) {
/* 5 */             String string = Double.toString(d.doubleValue());
/* 37 */            return Boolean.valueOf(this.preferences.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean setEncodedStringList(String str, String str2) throws RuntimeException {
/* 15 */            return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean setInt(String str, Long l) {
/* 19 */            return Boolean.valueOf(this.preferences.edit().putLong(str, l.longValue()).commit());
                }

                @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
                public Boolean setString(String str, String str2) {
/* 7 */             if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith(BIG_INTEGER_PREFIX) && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
/* 39 */                return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
                    }
/* 46 */            f42.m3663s("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
/* 49 */            return null;
                }

/* 9 */         public LegacySharedPreferencesPlugin(SharedPreferencesListEncoder sharedPreferencesListEncoder) {
/* 11 */            this.listEncoder = sharedPreferencesListEncoder;
                }
            }
