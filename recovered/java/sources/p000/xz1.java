            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xz1 {

                /* JADX INFO: renamed from: a */
                public int f19422a;

                /* JADX INFO: renamed from: b */
                public final Map f19423b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashSet f19424c;

                /* JADX INFO: renamed from: d */
                public wp0 f19425d;

                public xz1() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 10 */            this.f19422a = 0;
/* 12 */            this.f19423b = linkedHashMap;
/* 19 */            this.f19424c = new LinkedHashSet();
                }

                /* JADX INFO: renamed from: a */
                public final void m10049a(int i, wz1 wz1Var) throws Throwable {
/* 1 */             String strM9669a = wz1Var.m9669a();
/* 5 */             Map map = this.f19423b;
/* 11 */            if (map.containsKey(strM9669a)) {
/* 38 */                rf2 rf2Var = (rf2) map.get(strM9669a);
/* 40 */                if (rf2Var != null) {
/* 48 */                    rf2Var.f16038a.add(Integer.valueOf(i));
/* 51 */                    return;
                        }
/* 51 */                return;
                    }
/* 15 */            rf2 rf2Var2 = new rf2();
/* 24 */            rf2Var2.f16038a.add(Integer.valueOf(i));
/* 27 */            map.put(strM9669a, rf2Var2);
/* 31 */            this.f19422a = 0;
                }

                /* JADX INFO: renamed from: b */
                public final ArrayList m10050b(Integer num) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (Map.Entry entry : this.f19423b.entrySet()) {
/* 32 */                rf2 rf2Var = (rf2) entry.getValue();
/* 38 */                String str = (String) entry.getKey();
/* 40 */                if (num != null) {
/* 42 */                    rf2Var.getClass();
/* 51 */                    if (rf2Var.f16038a.contains(num)) {
/* 55 */                        wz1.Companion.getClass();
/* 62 */                        arrayList.add(vz1.m9357a(str));
                            }
                        } else {
/* 68 */                    wz1.Companion.getClass();
/* 75 */                    arrayList.add(vz1.m9357a(str));
                        }
                    }
/* 79 */            return arrayList;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof xz1)) {
/* 7 */                 return false;
                    }
/* 11 */            xz1 xz1Var = (xz1) obj;
                    return this.f19422a == xz1Var.f19422a && Intrinsics.m6216a(this.f19423b, xz1Var.f19423b);
                }

                public final int hashCode() {
/* 15 */            return this.f19423b.hashCode() + (Integer.hashCode(this.f19422a) * 31);
                }

                public final String toString() {
/* 28 */            return "PurposeRestrictionVector(bitLength=" + this.f19422a + ", map=" + this.f19423b + ")";
                }
            }
