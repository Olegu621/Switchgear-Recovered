            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lf1 extends AbstractC1910m0 implements kf1 {

                /* JADX INFO: renamed from: b */
                public String f13223b;

                /* JADX INFO: renamed from: c */
                public String f13224c;

                /* JADX INFO: renamed from: d */
                public Integer f13225d;

                /* JADX INFO: renamed from: e */
                public Integer f13226e;

                /* JADX INFO: renamed from: f */
                public Boolean f13227f;

                @Override // p000.kf1
                /* JADX INFO: renamed from: a */
                public final void mo3758a(if1 if1Var) {
                    String str;
/* 3 */             if (this.f13224c == null && (str = if1Var.f9578n) != null) {
/* 9 */                 this.f13224c = str;
                    }
/* 13 */            if1Var.f9578n = this.f13223b;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 50 */            Map mapM7131e = oc1.m7131e(new Pair("previousQuality", this.f13224c), new Pair("newQuality", this.f13223b), new Pair("bitrate", this.f13225d), new Pair("framesPerSecond", this.f13226e), new Pair("automatic", this.f13227f));
/* 56 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 71 */            for (Map.Entry entry : mapM7131e.entrySet()) {
/* 83 */                if (entry.getValue() != null) {
/* 93 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 97 */            return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 3 */             return mn0.m6697m("quality_change");
                }
            }
