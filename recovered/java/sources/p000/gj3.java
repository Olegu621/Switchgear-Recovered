            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gj3 extends hj3 {

                /* JADX INFO: renamed from: b */
                public final Map f8637b;

                public gj3(kb1 kb1Var, kb1 kb1Var2) {
/* 6 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 9 */             m3952d(linkedHashMap, kb1Var);
/* 12 */            m3952d(linkedHashMap, kb1Var2);
/* 27 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 43 */                if (((ph3) entry.getKey()).f15133c) {
/* 55 */                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
/* 63 */            this.f8637b = Collections.unmodifiableMap(linkedHashMap);
                }

                /* JADX INFO: renamed from: d */
                public static void m3952d(LinkedHashMap linkedHashMap, kb1 kb1Var) {
/* 6 */             for (int i = 0; i < kb1Var.mo3438X(); i++) {
/* 8 */                 ph3 ph3VarMo3439Y = kb1Var.mo3439Y(i);
/* 12 */                Object obj = linkedHashMap.get(ph3VarMo3439Y);
/* 16 */                boolean z = ph3VarMo3439Y.f15133c;
/* 18 */                Class cls = ph3VarMo3439Y.f15132b;
/* 20 */                if (z) {
/* 22 */                    List arrayList = (List) obj;
/* 24 */                    if (arrayList == null) {
/* 28 */                        arrayList = new ArrayList();
/* 31 */                        linkedHashMap.put(ph3VarMo3439Y, arrayList);
                            }
/* 42 */                    arrayList.add(cls.cast(kb1Var.mo3440Z(i)));
                        } else {
/* 54 */                    linkedHashMap.put(ph3VarMo3439Y, cls.cast(kb1Var.mo3440Z(i)));
                        }
                    }
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: a */
                public final void mo1709a(ti3 ti3Var, ii3 ii3Var) {
/* 15 */            for (Map.Entry entry : this.f8637b.entrySet()) {
/* 27 */                ph3 ph3Var = (ph3) entry.getKey();
/* 29 */                Object value = entry.getValue();
/* 35 */                if (ph3Var.f15133c) {
/* 43 */                    ti3Var.m8792b(ph3Var, ((List) value).iterator(), ii3Var);
                        } else {
/* 47 */                    ti3Var.m8791a(ph3Var, value, ii3Var);
                        }
                    }
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: b */
                public final int mo1710b() {
/* 3 */             return this.f8637b.size();
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: c */
                public final Set mo1711c() {
/* 3 */             return this.f8637b.keySet();
                }
            }
