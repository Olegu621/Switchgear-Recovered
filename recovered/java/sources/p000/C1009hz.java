            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.Map;
            
            /* JADX INFO: renamed from: hz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1009hz extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final boolean f9365b;

                /* JADX INFO: renamed from: c */
                public final String f9366c;

                /* JADX INFO: renamed from: d */
                public final String f9367d;

                /* JADX INFO: renamed from: e */
                public String f9368e;

                /* JADX INFO: renamed from: f */
                public String f9369f;

                /* JADX INFO: renamed from: g */
                public final LinkedList f9370g;

                public C1009hz(String str, String str2, boolean z) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 15 */            this.f9370g = new LinkedList();
/* 22 */            if (str.length() <= 0) {
/* 45 */                C1951n4.m6859j("Document ID cannot be empty");
/* 48 */                throw null;
                    }
/* 28 */            if (str2.length() <= 0) {
/* 39 */                C1951n4.m6859j("Document version cannot be empty");
/* 42 */                throw null;
                    }
/* 30 */            this.f9365b = z;
/* 32 */            this.f9366c = str;
/* 34 */            this.f9367d = str2;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: b */
                public final void mo3282b(uq2 uq2Var) {
/* 3 */             ArrayList<C0161az> arrayList = new ArrayList();
/* 12 */            C0161az c0161az = new C0161az(this.f9366c, this.f9367d);
/* 17 */            c0161az.f2142e = this.f9369f;
/* 21 */            c0161az.f2141d = this.f9368e;
/* 23 */            arrayList.add(c0161az);
/* 28 */            arrayList.addAll(this.f9370g);
/* 39 */            for (C0161az c0161az2 : arrayList) {
/* 49 */                c0161az2.getClass();
/* 63 */                this.f12550a.add(new b92("iglu:com.snowplowanalytics.snowplow/consent_document/jsonschema/1-0-0", c0161az2.mo104c()));
                    }
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("all", Boolean.valueOf(this.f9365b));
/* 17 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/consent_withdrawn/jsonschema/1-0-0";
                }
            }
