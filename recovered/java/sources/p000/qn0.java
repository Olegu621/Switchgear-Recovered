            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.transition.Transition;
            import androidx.transition.TransitionSet;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class qn0 extends ln0 {
                @Override // p000.ln0
                /* JADX INFO: renamed from: a */
                public final void mo5863a(View view, Object obj) {
/* 3 */             ((Transition) obj).mo1091b(view);
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: b */
                public final void mo5864b(Object obj, ArrayList arrayList) {
/* 1 */             Transition transition = (Transition) obj;
/* 3 */             if (transition == null) {
/* 82 */                return;
                    }
/* 8 */             int i = 0;
/* 9 */             if (transition instanceof TransitionSet) {
/* 11 */                TransitionSet transitionSet = (TransitionSet) transition;
/* 15 */                int size = transitionSet.f1908j0.size();
/* 19 */                while (i < size) {
/* 42 */                    mo5864b((i < 0 || i >= transitionSet.f1908j0.size()) ? null : (Transition) transitionSet.f1908j0.get(i), arrayList);
/* 45 */                    i++;
                        }
/* 82 */                return;
                    }
/* 54 */            if (ln0.m6512h(transition.f1901e) && ln0.m6512h(transition.f1903f)) {
/* 64 */                int size2 = arrayList.size();
/* 68 */                while (i < size2) {
/* 76 */                    transition.mo1091b((View) arrayList.get(i));
/* 79 */                    i++;
                        }
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: c */
                public final void mo5865c(ViewGroup viewGroup, Object obj) {
/* 3 */             lr2.m6525a(viewGroup, (Transition) obj);
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: e */
                public final boolean mo5866e(Object obj) {
/* 1 */             return obj instanceof Transition;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: f */
                public final Object mo5867f(Object obj) {
/* 1 */             if (obj != null) {
/* 5 */                 return ((Transition) obj).clone();
                    }
/* 10 */            return null;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: i */
                public final Object mo5868i(Object obj, Object obj2, Object obj3) {
/* 1 */             Transition transition = (Transition) obj;
/* 3 */             Transition transition2 = (Transition) obj2;
/* 5 */             Transition transition3 = (Transition) obj3;
/* 7 */             if (transition != null && transition2 != null) {
/* 13 */                TransitionSet transitionSet = new TransitionSet();
/* 16 */                transitionSet.m1109H(transition);
/* 19 */                transitionSet.m1109H(transition2);
/* 23 */                transitionSet.m1112K(1);
/* 26 */                transition = transitionSet;
                    } else if (transition == null) {
/* 35 */                transition = transition2 != null ? transition2 : null;
                    }
/* 36 */            if (transition3 == null) {
/* 52 */                return transition;
                    }
/* 40 */            TransitionSet transitionSet2 = new TransitionSet();
/* 43 */            if (transition != null) {
/* 45 */                transitionSet2.m1109H(transition);
                    }
/* 48 */            transitionSet2.m1109H(transition3);
/* 51 */            return transitionSet2;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: j */
                public final Object mo5869j(Object obj, Object obj2) {
/* 3 */             TransitionSet transitionSet = new TransitionSet();
/* 6 */             if (obj != null) {
/* 10 */                transitionSet.m1109H((Transition) obj);
                    }
/* 15 */            transitionSet.m1109H((Transition) obj2);
/* 18 */            return transitionSet;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: k */
                public final void mo5870k(Object obj, View view, ArrayList arrayList) {
/* 8 */             ((Transition) obj).m1090a(new nn0(view, arrayList));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: l */
                public final void mo5871l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
/* 13 */            ((Transition) obj).m1090a(new on0(this, obj2, arrayList, obj3, arrayList2));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: m */
                public final void mo5872m(View view, Object obj) {
/* 1 */             if (view != null) {
/* 7 */                 Rect rect = new Rect();
/* 10 */                ln0.m6511g(rect, view);
/* 19 */                ((Transition) obj).mo1083A(new mn0(0, rect));
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: n */
                public final void mo5873n(Object obj, Rect rect) {
/* 9 */             ((Transition) obj).mo1083A(new mn0(1, rect));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: o */
                public final void mo5874o(Object obj, C0927fr c0927fr, RunnableC1784j8 runnableC1784j8) {
/* 1 */             Transition transition = (Transition) obj;
/* 7 */             qc3 qc3Var = new qc3(transition, 28);
                    synchronized (c0927fr) {
/* 13 */                while (c0927fr.f8327c) {
                            try {
                                try {
/* 15 */                            c0927fr.wait();
                                } catch (InterruptedException unused) {
                                }
                            } catch (Throwable th) {
/* 54 */                        throw th;
                            }
                        }
/* 21 */                if (c0927fr.f8326b != qc3Var) {
/* 27 */                    c0927fr.f8326b = qc3Var;
/* 31 */                    if (c0927fr.f8325a) {
/* 38 */                        ((Transition) qc3Var.f15492b).cancel();
                            }
                        }
                    }
/* 49 */            transition.m1090a(new pn0(runnableC1784j8, 0));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: p */
                public final void mo5875p(Object obj, View view, ArrayList arrayList) {
/* 1 */             TransitionSet transitionSet = (TransitionSet) obj;
/* 3 */             ArrayList arrayList2 = transitionSet.f1903f;
/* 5 */             arrayList2.clear();
/* 8 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 21 */                ln0.m6510d((View) arrayList.get(i), arrayList2);
                    }
/* 27 */            arrayList2.add(view);
/* 30 */            arrayList.add(view);
/* 33 */            mo5864b(transitionSet, arrayList);
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: q */
                public final void mo5876q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             TransitionSet transitionSet = (TransitionSet) obj;
/* 3 */             if (transitionSet != null) {
/* 5 */                 ArrayList arrayList3 = transitionSet.f1903f;
/* 7 */                 arrayList3.clear();
/* 10 */                arrayList3.addAll(arrayList2);
/* 13 */                m7954s(transitionSet, arrayList, arrayList2);
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: r */
                public final Object mo5877r(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 7 */             TransitionSet transitionSet = new TransitionSet();
/* 12 */            transitionSet.m1109H((Transition) obj);
/* 15 */            return transitionSet;
                }

                /* JADX INFO: renamed from: s */
                public final void m7954s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             Transition transition = (Transition) obj;
/* 5 */             int i = 0;
/* 6 */             if (transition instanceof TransitionSet) {
/* 8 */                 TransitionSet transitionSet = (TransitionSet) transition;
/* 12 */                int size = transitionSet.f1908j0.size();
/* 16 */                while (i < size) {
/* 39 */                    m7954s((i < 0 || i >= transitionSet.f1908j0.size()) ? null : (Transition) transitionSet.f1908j0.get(i), arrayList, arrayList2);
/* 42 */                    i++;
                        }
/* 113 */               return;
                    }
/* 51 */            if (ln0.m6512h(transition.f1901e)) {
/* 53 */                ArrayList arrayList3 = transition.f1903f;
/* 63 */                if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
/* 75 */                    int size2 = arrayList2 == null ? 0 : arrayList2.size();
/* 79 */                    while (i < size2) {
/* 87 */                        transition.mo1091b((View) arrayList2.get(i));
/* 90 */                        i++;
                            }
/* 99 */                    for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
/* 107 */                       transition.mo1105w((View) arrayList.get(size3));
                            }
                        }
                    }
                }
            }
