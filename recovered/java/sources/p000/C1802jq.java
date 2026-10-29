            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            /* JADX INFO: renamed from: jq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1802jq {

                /* JADX INFO: renamed from: b */
                public static final C1802jq f12419b;

                /* JADX INFO: renamed from: c */
                public static final C1802jq f12420c;

                /* JADX INFO: renamed from: a */
                public final LinkedHashSet f12421a;

                static {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            linkedHashSet.add(new q61(0));
/* 20 */            f12419b = new C1802jq(linkedHashSet);
/* 24 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 33 */            linkedHashSet2.add(new q61(1));
/* 41 */            f12420c = new C1802jq(linkedHashSet2);
                }

                public C1802jq(LinkedHashSet linkedHashSet) {
/* 4 */             this.f12421a = linkedHashSet;
                }

                /* JADX INFO: renamed from: a */
                public final ArrayList m5879a(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList(arrayList);
/* 16 */            for (q61 q61Var : this.f12421a) {
/* 24 */                List<InterfaceC2469xp> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
/* 28 */                q61Var.getClass();
/* 33 */                ArrayList arrayList3 = new ArrayList();
/* 44 */                for (InterfaceC2469xp interfaceC2469xp : listUnmodifiableList) {
/* 56 */                    de3.m3023e("The camera info doesn't contain internal implementation.", interfaceC2469xp instanceof InterfaceC2469xp);
/* 65 */                    if (interfaceC2469xp.mo312d() == q61Var.f15410a) {
/* 67 */                        arrayList3.add(interfaceC2469xp);
                            }
                        }
/* 71 */                arrayList2 = arrayList3;
                    }
/* 73 */            arrayList2.retainAll(arrayList);
/* 76 */            return arrayList2;
                }

                /* JADX INFO: renamed from: b */
                public final Integer m5880b() {
/* 8 */             Integer num = null;
/* 13 */            for (q61 q61Var : this.f12421a) {
/* 23 */                if (q61Var instanceof q61) {
/* 27 */                    Integer numValueOf = Integer.valueOf(q61Var.f15410a);
/* 31 */                    if (num == null) {
/* 33 */                        num = numValueOf;
                            } else if (!num.equals(numValueOf)) {
/* 44 */                        f42.m3656l("Multiple conflicting lens facing requirements exist.");
/* 7 */                         return null;
                            }
                        }
                    }
/* 48 */            return num;
                }

                /* JADX INFO: renamed from: c */
                public final InterfaceC2559zp m5881c(LinkedHashSet linkedHashSet) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = linkedHashSet.iterator();
/* 14 */            while (it.hasNext()) {
/* 26 */                arrayList.add(((InterfaceC2559zp) it.next()).mo8073m());
                    }
/* 30 */            ArrayList arrayListM5879a = m5879a(arrayList);
/* 36 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 39 */            Iterator it2 = linkedHashSet.iterator();
/* 47 */            while (it2.hasNext()) {
/* 53 */                InterfaceC2559zp interfaceC2559zp = (InterfaceC2559zp) it2.next();
/* 63 */                if (arrayListM5879a.contains(interfaceC2559zp.mo8073m())) {
/* 65 */                    linkedHashSet2.add(interfaceC2559zp);
                        }
                    }
/* 69 */            Iterator it3 = linkedHashSet2.iterator();
/* 77 */            if (it3.hasNext()) {
/* 83 */                return (InterfaceC2559zp) it3.next();
                    }
/* 88 */            C1951n4.m6859j("No available camera can be found");
/* 91 */            return null;
                }
            }
