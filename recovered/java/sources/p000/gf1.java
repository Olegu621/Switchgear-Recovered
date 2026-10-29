            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gf1 extends AbstractC1910m0 implements kf1 {

                /* JADX INFO: renamed from: b */
                public double f8583b;

                /* JADX INFO: renamed from: c */
                public Double f8584c;

                @Override // p000.kf1
                /* JADX INFO: renamed from: a */
                public final void mo3758a(if1 if1Var) {
                    Double d;
/* 3 */             if (this.f8584c == null && (d = if1Var.f9577m) != null) {
/* 17 */                this.f8584c = Double.valueOf(d.doubleValue());
                    }
/* 25 */            if1Var.f9577m = Double.valueOf(this.f8583b);
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 27 */            Map mapM7131e = oc1.m7131e(new Pair("previousRate", this.f8584c), new Pair("newRate", Double.valueOf(this.f8583b)));
/* 33 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 48 */            for (Map.Entry entry : mapM7131e.entrySet()) {
/* 62 */                if (((Double) entry.getValue()) != null) {
/* 72 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 76 */            return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 3 */             return mn0.m6697m("playback_rate_change");
                }
            }
