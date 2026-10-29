            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.Map;
            
            /* JADX INFO: renamed from: dz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0861dz extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final String f7448b;

                /* JADX INFO: renamed from: c */
                public final String f7449c;

                /* JADX INFO: renamed from: d */
                public final String f7450d;

                /* JADX INFO: renamed from: e */
                public String f7451e;

                /* JADX INFO: renamed from: f */
                public String f7452f;

                /* JADX INFO: renamed from: g */
                public final LinkedList f7453g;

                public C0861dz(String str, String str2, String str3) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 18 */            this.f7453g = new LinkedList();
/* 25 */            if (str.length() <= 0) {
/* 60 */                C1951n4.m6859j("Expiry cannot be empty");
/* 63 */                throw null;
                    }
/* 31 */            if (str2.length() <= 0) {
/* 54 */                C1951n4.m6859j("Document ID cannot be empty");
/* 57 */                throw null;
                    }
/* 37 */            if (str3.length() <= 0) {
/* 48 */                C1951n4.m6859j("Document version cannot be empty");
/* 51 */                throw null;
                    }
/* 39 */            this.f7448b = str;
/* 41 */            this.f7449c = str2;
/* 43 */            this.f7450d = str3;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: b */
                public final void mo3282b(uq2 uq2Var) {
/* 3 */             ArrayList<C0161az> arrayList = new ArrayList();
/* 12 */            C0161az c0161az = new C0161az(this.f7449c, this.f7450d);
/* 17 */            c0161az.f2142e = this.f7452f;
/* 21 */            c0161az.f2141d = this.f7451e;
/* 23 */            arrayList.add(c0161az);
/* 28 */            arrayList.addAll(this.f7453g);
/* 39 */            for (C0161az c0161az2 : arrayList) {
/* 49 */                c0161az2.getClass();
/* 63 */                this.f12550a.add(new b92("iglu:com.snowplowanalytics.snowplow/consent_document/jsonschema/1-0-0", c0161az2.mo104c()));
                    }
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("expiry", this.f7448b);
/* 13 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/consent_granted/jsonschema/1-0-0";
                }
            }
