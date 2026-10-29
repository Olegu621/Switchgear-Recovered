            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xf1 extends AbstractC1910m0 implements kf1 {

                /* JADX INFO: renamed from: b */
                public int f19074b;

                /* JADX INFO: renamed from: c */
                public Integer f19075c;

                @Override // p000.kf1
                /* JADX INFO: renamed from: a */
                public final void mo3758a(if1 if1Var) {
                    Integer num;
/* 3 */             if (this.f19075c == null && (num = if1Var.f9579o) != null) {
/* 17 */                this.f19075c = Integer.valueOf(num.intValue());
                    }
/* 25 */            if1Var.f9579o = Integer.valueOf(this.f19074b);
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 27 */            Map mapM7131e = oc1.m7131e(new Pair("previousVolume", this.f19075c), new Pair("newVolume", Integer.valueOf(this.f19074b)));
/* 33 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 48 */            for (Map.Entry entry : mapM7131e.entrySet()) {
/* 62 */                if (((Integer) entry.getValue()) != null) {
/* 72 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 76 */            return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 3 */             return mn0.m6697m("volume_change");
                }
            }
