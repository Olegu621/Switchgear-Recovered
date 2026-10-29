            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cp3 extends ep3 {

                /* JADX INFO: renamed from: c */
                public static final Class f6872c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                @Override // p000.ep3
                /* JADX INFO: renamed from: a */
                public final void mo2828a(Object obj, long j) {
                    Object objUnmodifiableList;
/* 5 */             List list = (List) tq3.m8872j(obj, j);
/* 9 */             if (list instanceof ap3) {
/* 13 */                objUnmodifiableList = ((ap3) list).zzi();
                    } else if (f6872c.isAssignableFrom(list.getClass())) {
/* 30 */                return;
                    } else {
/* 31 */                objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 35 */            tq3.m8873k(obj, j, objUnmodifiableList);
                }

                @Override // p000.ep3
                /* JADX INFO: renamed from: b */
                public final void mo2829b(Object obj, Object obj2, long j) {
                    List list;
                    List list2;
/* 5 */             List list3 = (List) tq3.m8872j(obj2, j);
/* 7 */             int size = list3.size();
/* 15 */            List list4 = (List) tq3.m8872j(obj, j);
/* 21 */            if (list4.isEmpty()) {
/* 35 */                List zo3Var = list4 instanceof ap3 ? new zo3(size) : new ArrayList(size);
/* 38 */                tq3.m8873k(obj, j, zo3Var);
                        list2 = zo3Var;
                    } else {
/* 52 */                if (f6872c.isAssignableFrom(list4.getClass())) {
/* 61 */                    ArrayList arrayList = new ArrayList(list4.size() + size);
/* 64 */                    arrayList.addAll(list4);
/* 67 */                    tq3.m8873k(obj, j, arrayList);
                            list = arrayList;
                        } else if (list4 instanceof oq3) {
                            list2 = list4;
/* 78 */                    oq3 oq3Var = (oq3) list4;
/* 85 */                    zo3 zo3Var2 = new zo3(oq3Var.size() + size);
/* 94 */                    zo3Var2.addAll(zo3Var2.f20285b.size(), oq3Var);
/* 97 */                    tq3.m8873k(obj, j, zo3Var2);
                            list = zo3Var2;
                        }
/* 70 */                list2 = list;
                    }
                    list2 = list4;
/* 101 */           int size2 = list2.size();
/* 105 */           int size3 = list3.size();
/* 109 */           if (size2 > 0 && size3 > 0) {
/* 113 */               list2.addAll(list3);
                    }
/* 116 */           if (size2 > 0) {
/* 119 */               list3 = list2;
                    }
/* 120 */           tq3.m8873k(obj, j, list3);
                }
            }
