            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a81 extends c81 {

                /* JADX INFO: renamed from: c */
                public static final Class f113c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

                /* JADX INFO: renamed from: d */
                public static List m100d(Object obj, int i, long j) {
                    List listMo2899x;
/* 7 */             List list = (List) my2.f14064c.m6313i(obj, j);
/* 13 */            if (list.isEmpty()) {
/* 17 */                if (list instanceof u51) {
/* 21 */                    listMo2899x = new t51(i);
                        } else {
/* 42 */                    listMo2899x = ((list instanceof hx1) && (list instanceof cz0)) ? ((cz0) list).mo2899x(i) : new ArrayList(i);
                        }
/* 45 */                my2.m6830p(obj, j, listMo2899x);
/* 48 */                return listMo2899x;
                    }
/* 59 */            if (f113c.isAssignableFrom(list.getClass())) {
/* 68 */                ArrayList arrayList = new ArrayList(list.size() + i);
/* 71 */                arrayList.addAll(list);
/* 74 */                my2.m6830p(obj, j, arrayList);
/* 77 */                return arrayList;
                    }
/* 80 */            if (list instanceof zx2) {
/* 84 */                zx2 zx2Var = (zx2) list;
/* 93 */                t51 t51Var = new t51(zx2Var.f20376a.size() + i);
/* 96 */                t51Var.addAll(zx2Var);
/* 99 */                my2.m6830p(obj, j, t51Var);
/* 102 */               return t51Var;
                    }
/* 105 */           if ((list instanceof hx1) && (list instanceof cz0)) {
/* 112 */               cz0 cz0Var = (cz0) list;
/* 119 */               if (!((AbstractC0827d0) cz0Var).f6945a) {
/* 126 */                   cz0 cz0VarMo2899x = cz0Var.mo2899x(list.size() + i);
/* 130 */                   my2.m6830p(obj, j, cz0VarMo2899x);
/* 133 */                   return cz0VarMo2899x;
                        }
                    }
/* 134 */           return list;
                }

                @Override // p000.c81
                /* JADX INFO: renamed from: a */
                public final void mo101a(Object obj, long j) {
                    Object objUnmodifiableList;
/* 7 */             List list = (List) my2.f14064c.m6313i(obj, j);
/* 11 */            if (list instanceof u51) {
/* 15 */                objUnmodifiableList = ((u51) list).mo8696X0();
                    } else {
/* 30 */                if (f113c.isAssignableFrom(list.getClass())) {
/* 52 */                    return;
                        }
/* 35 */                if ((list instanceof hx1) && (list instanceof cz0)) {
/* 43 */                    AbstractC0827d0 abstractC0827d0 = (AbstractC0827d0) ((cz0) list);
/* 47 */                    if (abstractC0827d0.f6945a) {
/* 50 */                        abstractC0827d0.f6945a = false;
/* 52 */                        return;
                            }
/* 52 */                    return;
                        }
/* 53 */                objUnmodifiableList = Collections.unmodifiableList(list);
                    }
/* 57 */            my2.m6830p(obj, j, objUnmodifiableList);
                }

                @Override // p000.c81
                /* JADX INFO: renamed from: b */
                public final void mo102b(Object obj, long j, Object obj2) {
/* 7 */             List list = (List) my2.f14064c.m6313i(obj2, j);
/* 13 */            List listM100d = m100d(obj, list.size(), j);
/* 17 */            int size = listM100d.size();
/* 21 */            int size2 = list.size();
/* 25 */            if (size > 0 && size2 > 0) {
/* 29 */                listM100d.addAll(list);
                    }
/* 32 */            if (size > 0) {
/* 34 */                list = listM100d;
                    }
/* 35 */            my2.m6830p(obj, j, list);
                }

                @Override // p000.c81
                /* JADX INFO: renamed from: c */
                public final List mo103c(Object obj, long j) {
/* 3 */             return m100d(obj, 10, j);
                }
            }
