            package p000;

            import android.text.TextUtils;
            import java.util.ArrayList;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sz1 {

                /* JADX INFO: renamed from: a */
                public final String f16879a;

                /* JADX INFO: renamed from: b */
                public final String f16880b;

                /* JADX INFO: renamed from: c */
                public final JSONObject f16881c;

                public sz1(String str, String str2) {
/* 4 */             this.f16879a = str;
/* 6 */             this.f16880b = str2;
/* 13 */            this.f16881c = new JSONObject(str);
                }

                /* JADX INFO: renamed from: a */
                public final ArrayList m8667a() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             JSONObject jSONObject = this.f16881c;
/* 14 */            if (jSONObject.has("productIds")) {
/* 16 */                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
/* 20 */                if (jSONArrayOptJSONArray != null) {
/* 27 */                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
/* 33 */                        arrayList.add(jSONArrayOptJSONArray.optString(i));
                            }
                        }
                    } else if (jSONObject.has("productId")) {
/* 51 */                arrayList.add(jSONObject.optString("productId"));
                    }
/* 54 */            return arrayList;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof sz1)) {
/* 7 */                 return false;
                    }
/* 11 */            sz1 sz1Var = (sz1) obj;
                    return TextUtils.equals(this.f16879a, sz1Var.f16879a) && TextUtils.equals(this.f16880b, sz1Var.f16880b);
                }

                public final int hashCode() {
/* 3 */             return this.f16879a.hashCode();
                }

                public final String toString() {
/* 9 */             return "Purchase. Json: ".concat(String.valueOf(this.f16879a));
                }
            }
