            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fi2 extends AbstractC1812k {

                /* JADX INFO: renamed from: b */
                public final String f8220b;

                /* JADX INFO: renamed from: c */
                public final String f8221c;

                /* JADX INFO: renamed from: d */
                public String f8222d;

                /* JADX INFO: renamed from: e */
                public String f8223e;

                /* JADX INFO: renamed from: f */
                public Double f8224f;

                public fi2(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 14 */            if (str.length() <= 0) {
/* 36 */                C1951n4.m6859j("category cannot be empty");
/* 40 */                throw null;
                    }
/* 20 */            if (str2.length() <= 0) {
/* 29 */                C1951n4.m6859j("action cannot be empty");
/* 33 */                throw null;
                    }
/* 22 */            this.f8220b = str;
/* 24 */            this.f8221c = str2;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 4 */             HashMap map = new HashMap(5);
/* 11 */            map.put("se_ca", this.f8220b);
/* 18 */            map.put("se_ac", this.f8221c);
/* 21 */            String str = this.f8222d;
/* 23 */            if (str != null) {
/* 27 */                map.put("se_la", str);
                    }
/* 30 */            String str2 = this.f8223e;
/* 32 */            if (str2 != null) {
/* 36 */                map.put("se_pr", str2);
                    }
/* 39 */            Double d = this.f8224f;
/* 41 */            if (d != null) {
/* 53 */                map.put("se_va", String.valueOf(d.doubleValue()));
                    }
/* 56 */            return map;
                }
            }
