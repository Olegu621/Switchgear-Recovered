            package p000;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zu0 {
                public static final yu0 Companion = new yu0();

                /* JADX INFO: renamed from: d */
                public static final Regex f20330d = new Regex("max-age=(\\d+)");

                /* JADX INFO: renamed from: a */
                public final Map f20331a;

                /* JADX INFO: renamed from: b */
                public final String f20332b;

                /* JADX INFO: renamed from: c */
                public final int f20333c;

                public zu0(int i, String str, Map map) {
/* 1 */             map.getClass();
/* 7 */             this.f20331a = map;
/* 9 */             this.f20332b = str;
/* 11 */            this.f20333c = i;
                }

                /* JADX INFO: renamed from: a */
                public final UsercentricsLocation m10442a() {
/* 9 */             String str = (String) this.f20331a.get("x-client-geo-location");
/* 11 */            Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
/* 13 */            if (str == null) {
/* 15 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 7 */             List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
/* 32 */            if (listSplit$default.isEmpty()) {
/* 36 */                return new UsercentricsLocation();
                    }
/* 44 */            String str2 = (String) listSplit$default.get(0);
/* 52 */            if (1 <= listSplit$default.size() - 1) {
/* 54 */                obj = listSplit$default.get(1);
                    }
/* 62 */            return new UsercentricsLocation(str2, (String) obj);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof zu0)) {
/* 39 */                return false;
                    }
/* 9 */             zu0 zu0Var = (zu0) obj;
                    return Intrinsics.m6216a(this.f20331a, zu0Var.f20331a) && this.f20332b.equals(zu0Var.f20332b) && this.f20333c == zu0Var.f20333c;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.f20333c) + pm2.m7485h(this.f20331a.hashCode() * 31, 31, this.f20332b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HttpResponse(headers=");
/* 10 */            sb.append(this.f20331a);
/* 15 */            sb.append(", body=");
/* 20 */            sb.append(this.f20332b);
/* 25 */            sb.append(", statusCode=");
/* 32 */            return fm0.m3786l(sb, this.f20333c, ")");
                }
            }
