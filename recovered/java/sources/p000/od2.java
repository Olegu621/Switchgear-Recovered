            package p000;

            import android.content.SharedPreferences;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class od2 {

                /* JADX INFO: renamed from: a */
                public final SharedPreferences f14716a;

                public od2(SharedPreferences sharedPreferences) {
/* 4 */             this.f14716a = sharedPreferences;
                }

                /* JADX INFO: renamed from: a */
                public final void m7135a(String str) {
/* 11 */            this.f14716a.edit().remove(str).apply();
                }

                /* JADX INFO: renamed from: b */
                public final void m7136b(String str, Set set) {
/* 1 */             set.getClass();
/* 4 */             SharedPreferences sharedPreferences = this.f14716a;
/* 6 */             SharedPreferences.Editor editorEdit = sharedPreferences.edit();
/* 26 */            for (String str2 : sharedPreferences.getAll().keySet()) {
/* 34 */                str2.getClass();
/* 42 */                if (C1852e.m6263m(str2, str, false) && !set.contains(StringsKt.m6233I(str2, str))) {
/* 54 */                    editorEdit.remove(str2);
                        }
                    }
/* 58 */            editorEdit.apply();
                }

                /* JADX INFO: renamed from: c */
                public final LinkedHashMap m7137c() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 8 */             Map<String, ?> all = this.f14716a.getAll();
/* 12 */            all.getClass();
/* 27 */            for (Map.Entry<String, ?> entry : all.entrySet()) {
/* 35 */                String key = entry.getKey();
/* 41 */                Object value = entry.getValue();
/* 45 */                key.getClass();
/* 55 */                if (C1852e.m6263m(key, "settings-", false) && (value instanceof String)) {
/* 61 */                    linkedHashMap.put(key, value);
                        }
                    }
/* 65 */            return linkedHashMap;
                }

                /* JADX INFO: renamed from: d */
                public final void m7138d(String str, String str2) {
/* 1 */             str2.getClass();
/* 14 */            this.f14716a.edit().putString(str, str2).apply();
                }
            }
