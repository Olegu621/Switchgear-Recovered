            package p000;

            import android.text.TextUtils;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ve2 {

                /* JADX INFO: renamed from: a */
                public final String f18023a;

                /* JADX INFO: renamed from: b */
                public final JSONObject f18024b;

                public ve2(String str) {
/* 4 */             this.f18023a = str;
/* 8 */             JSONObject jSONObject = new JSONObject(str);
/* 11 */            this.f18024b = jSONObject;
/* 23 */            if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
/* 47 */                C1951n4.m6859j("SKU cannot be empty.");
/* 51 */                throw null;
                    }
/* 35 */            if (TextUtils.isEmpty(jSONObject.optString("type"))) {
/* 40 */                C1951n4.m6859j("SkuType cannot be empty.");
/* 44 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final String m9259a() {
/* 5 */             return this.f18024b.optString("productId");
                }

                /* JADX INFO: renamed from: b */
                public final String m9260b() {
/* 5 */             return this.f18024b.optString("type");
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ve2) {
/* 17 */                return TextUtils.equals(this.f18023a, ((ve2) obj).f18023a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f18023a.hashCode();
                }

                public final String toString() {
/* 9 */             return "SkuDetails: ".concat(String.valueOf(this.f18023a));
                }
            }
