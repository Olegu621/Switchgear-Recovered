            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Cookie;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: xw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 81 */    public final class C2476xw {

                /* JADX INFO: renamed from: a */
                public final Cookie f19385a;

                public C2476xw(String str) throws JSONException {
/* 6 */             JSONObject jSONObject = new JSONObject(str);
/* 11 */            Cookie.Builder builder = new Cookie.Builder();
/* 16 */            String string = jSONObject.getString("name");
/* 20 */            string.getClass();
/* 23 */            Cookie.Builder builderName = builder.name(string);
/* 29 */            String string2 = jSONObject.getString(FirebaseAnalytics.Param.VALUE);
/* 33 */            string2.getClass();
/* 46 */            Cookie.Builder builderExpiresAt = builderName.value(string2).expiresAt(jSONObject.getLong("expiresAt"));
/* 52 */            String string3 = jSONObject.getString("domain");
/* 56 */            string3.getClass();
/* 59 */            Cookie.Builder builderDomain = builderExpiresAt.domain(string3);
/* 65 */            String string4 = jSONObject.getString("path");
/* 69 */            string4.getClass();
/* 80 */            this.f19385a = builderDomain.path(string4).build();
                }

                /* JADX INFO: renamed from: a */
                public final String m10033a() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Cookie cookie = this.f19385a;
/* 19 */            sb.append(cookie.secure() ? "https" : "http");
/* 24 */            sb.append("://");
/* 31 */            sb.append(cookie.domain());
/* 38 */            sb.append(cookie.path());
/* 43 */            sb.append('|');
/* 50 */            sb.append(cookie.name());
/* 53 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C2476xw)) {
/* 3 */                 return false;
                    }
/* 9 */             Cookie cookie = ((C2476xw) obj).f19385a;
/* 11 */            String strName = cookie.name();
/* 15 */            Cookie cookie2 = this.f19385a;
                    return Intrinsics.m6216a(strName, cookie2.name()) && Intrinsics.m6216a(cookie.domain(), cookie2.domain()) && Intrinsics.m6216a(cookie.path(), cookie2.path());
                }

                public final int hashCode() {
/* 1 */             Cookie cookie = this.f19385a;
/* 34 */            return cookie.path().hashCode() + ((cookie.domain().hashCode() + ((cookie.name().hashCode() + 527) * 31)) * 31);
                }

/* 82 */        public C2476xw(Cookie cookie) {
                    cookie.getClass();
/* 84 */            this.f19385a = cookie;
                }
            }
