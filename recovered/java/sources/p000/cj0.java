            package p000;

            import android.content.Context;
            import android.text.TextUtils;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cj0 {

                /* JADX INFO: renamed from: a */
                public final String f2934a;

                /* JADX INFO: renamed from: b */
                public final String f2935b;

                /* JADX INFO: renamed from: c */
                public final String f2936c;

                /* JADX INFO: renamed from: d */
                public final String f2937d;

                /* JADX INFO: renamed from: e */
                public final String f2938e;

                /* JADX INFO: renamed from: f */
                public final String f2939f;

                /* JADX INFO: renamed from: g */
                public final String f2940g;

                public cj0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
/* 4 */             int i = xh2.f19096a;
/* 26 */            kb1.m6063p("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
/* 29 */            this.f2935b = str;
/* 31 */            this.f2934a = str2;
/* 33 */            this.f2936c = str3;
/* 35 */            this.f2937d = str4;
/* 37 */            this.f2938e = str5;
/* 39 */            this.f2939f = str6;
/* 41 */            this.f2940g = str7;
                }

                /* JADX INFO: renamed from: a */
                public static cj0 m1698a(Context context) {
/* 3 */             we2 we2Var = new we2(context);
/* 8 */             String strM9560j = we2Var.m9560j("google_app_id");
/* 16 */            if (TextUtils.isEmpty(strM9560j)) {
/* 18 */                return null;
                    }
/* 58 */            return new cj0(strM9560j, we2Var.m9560j("google_api_key"), we2Var.m9560j("firebase_database_url"), we2Var.m9560j("ga_trackingId"), we2Var.m9560j("gcm_defaultSenderId"), we2Var.m9560j("google_storage_bucket"), we2Var.m9560j("project_id"));
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof cj0)) {
/* 3 */                 return false;
                    }
/* 7 */             cj0 cj0Var = (cj0) obj;
                    return de3.m3029k(this.f2935b, cj0Var.f2935b) && de3.m3029k(this.f2934a, cj0Var.f2934a) && de3.m3029k(this.f2936c, cj0Var.f2936c) && de3.m3029k(this.f2937d, cj0Var.f2937d) && de3.m3029k(this.f2938e, cj0Var.f2938e) && de3.m3029k(this.f2939f, cj0Var.f2939f) && de3.m3029k(this.f2940g, cj0Var.f2940g);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f2935b, this.f2934a, this.f2936c, this.f2937d, this.f2938e, this.f2939f, this.f2940g});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f2935b, "applicationId");
/* 17 */            wc0Var.m9529d(this.f2934a, "apiKey");
/* 24 */            wc0Var.m9529d(this.f2936c, "databaseUrl");
/* 31 */            wc0Var.m9529d(this.f2938e, "gcmSenderId");
/* 38 */            wc0Var.m9529d(this.f2939f, "storageBucket");
/* 45 */            wc0Var.m9529d(this.f2940g, "projectId");
/* 48 */            return wc0Var.toString();
                }
            }
