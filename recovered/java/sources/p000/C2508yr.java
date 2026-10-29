            package p000;

            import com.usercentrics.ccpa.C0810a;
            import com.usercentrics.ccpa.CCPAData;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: yr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2508yr {

                /* JADX INFO: renamed from: a */
                public final g80 f19765a;

                /* JADX INFO: renamed from: b */
                public final i03 f19766b;

                /* JADX INFO: renamed from: c */
                public Boolean f19767c;

                /* JADX INFO: renamed from: d */
                public final C0810a f19768d;

                public C2508yr(g80 g80Var, i03 i03Var) {
/* 1 */             g80Var.getClass();
/* 4 */             i03Var.getClass();
/* 10 */            this.f19765a = g80Var;
/* 12 */            this.f19766b = i03Var;
/* 18 */            od2 od2Var = ((pz2) g80Var).f15353d;
/* 20 */            od2Var.getClass();
/* 37 */            this.f19768d = new C0810a(new qc3(od2Var), new C1983o(this, 4));
                }

                /* JADX INFO: renamed from: a */
                public final CCPAData m10171a() {
/* 1 */             C0810a c0810a = this.f19768d;
/* 3 */             c0810a.getClass();
/* 10 */            od2 od2Var = (od2) c0810a.f6020a.f15492b;
/* 18 */            String string = od2Var.f14716a.getString("IABUSPrivacy_String", HttpUrl.FRAGMENT_ENCODE_SET);
/* 23 */            if (string == null || !(!StringsKt.m6228D(string))) {
/* 55 */                string = "1---";
                    } else if (!AbstractC0885em.f7791a.m6223b(string)) {
/* 49 */                c0810a.f6021b.invoke("Stored CCPA String is invalid: ".concat(string));
/* 52 */                od2Var.m7135a("IABUSPrivacy_String");
/* 55 */                string = "1---";
                    }
/* 59 */            CCPAData.Companion.getClass();
/* 69 */            if (string.length() != 4) {
/* 134 */               C2502yl.Companion.getClass();
/* 147 */               throw new C2502yl("Cannot parse the CCPA String: ".concat(string), null);
                    }
                    try {
/* 112 */               return new CCPAData(Integer.parseInt(String.valueOf(string.charAt(0))), hu0.m4314H(string.charAt(1)), hu0.m4314H(string.charAt(2)), hu0.m4314H(string.charAt(3)));
                    } catch (IllegalArgumentException e) {
/* 119 */               C2502yl.Companion.getClass();
/* 131 */               throw new C2502yl("Cannot parse the CCPA String: ".concat(string), e);
                    }
                }
            }
