            package p000;

            import android.graphics.Rect;
            import android.transition.Transition;
            import android.transition.TransitionManager;
            import android.transition.TransitionSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jn0 extends ln0 {
                /* JADX INFO: renamed from: s */
                public static boolean m5862s(Transition transition) {
                    return (ln0.m6512h(transition.getTargetIds()) && ln0.m6512h(transition.getTargetNames()) && ln0.m6512h(transition.getTargetTypes())) ? false : true;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: a */
                public final void mo5863a(View view, Object obj) {
/* 3 */             ((Transition) obj).addTarget(view);
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: b */
                public final void mo5864b(Object obj, ArrayList arrayList) {
/* 1 */             Transition transition = (Transition) obj;
/* 3 */             if (transition == null) {
/* 63 */                return;
                    }
/* 8 */             int i = 0;
/* 9 */             if (transition instanceof TransitionSet) {
/* 11 */                TransitionSet transitionSet = (TransitionSet) transition;
/* 13 */                int transitionCount = transitionSet.getTransitionCount();
/* 17 */                while (i < transitionCount) {
/* 23 */                    mo5864b(transitionSet.getTransitionAt(i), arrayList);
/* 26 */                    i++;
                        }
/* 63 */                return;
                    }
/* 33 */            if (m5862s(transition) || !ln0.m6512h(transition.getTargets())) {
/* 63 */                return;
                    }
/* 45 */            int size = arrayList.size();
/* 49 */            while (i < size) {
/* 57 */                transition.addTarget((View) arrayList.get(i));
/* 60 */                i++;
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: c */
                public final void mo5865c(ViewGroup viewGroup, Object obj) {
/* 3 */             TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
/* 1 */             Transition ordering = (Transition) obj;
/* 3 */             Transition transition = (Transition) obj2;
/* 5 */             Transition transition2 = (Transition) obj3;
/* 7 */             if (ordering != null && transition != null) {
/* 25 */                ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
                    } else if (ordering == null) {
/* 37 */                ordering = transition != null ? transition : null;
                    }
/* 38 */            if (transition2 == null) {
/* 54 */                return ordering;
                    }
/* 42 */            TransitionSet transitionSet = new TransitionSet();
/* 45 */            if (ordering != null) {
/* 47 */                transitionSet.addTransition(ordering);
                    }
/* 50 */            transitionSet.addTransition(transition2);
/* 53 */            return transitionSet;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: j */
                public final Object mo5869j(Object obj, Object obj2) {
/* 3 */             TransitionSet transitionSet = new TransitionSet();
/* 6 */             if (obj != null) {
/* 10 */                transitionSet.addTransition((Transition) obj);
                    }
/* 15 */            transitionSet.addTransition((Transition) obj2);
/* 18 */            return transitionSet;
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: k */
                public final void mo5870k(Object obj, View view, ArrayList arrayList) {
/* 8 */             ((Transition) obj).addListener(new gn0(view, arrayList));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: l */
                public final void mo5871l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
/* 13 */            ((Transition) obj).addListener(new hn0(this, obj2, arrayList, obj3, arrayList2));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: m */
                public final void mo5872m(View view, Object obj) {
/* 1 */             if (view != null) {
/* 7 */                 Rect rect = new Rect();
/* 10 */                ln0.m6511g(rect, view);
/* 19 */                ((Transition) obj).setEpicenterCallback(new fn0(0, rect));
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: n */
                public final void mo5873n(Object obj, Rect rect) {
/* 9 */             ((Transition) obj).setEpicenterCallback(new fn0(1, rect));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: o */
                public final void mo5874o(Object obj, C0927fr c0927fr, RunnableC1784j8 runnableC1784j8) {
/* 8 */             ((Transition) obj).addListener(new in0(runnableC1784j8));
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: p */
                public final void mo5875p(Object obj, View view, ArrayList arrayList) {
/* 1 */             TransitionSet transitionSet = (TransitionSet) obj;
/* 3 */             List<View> targets = transitionSet.getTargets();
/* 7 */             targets.clear();
/* 10 */            int size = arrayList.size();
/* 15 */            for (int i = 0; i < size; i++) {
/* 23 */                ln0.m6510d((View) arrayList.get(i), targets);
                    }
/* 29 */            targets.add(view);
/* 32 */            arrayList.add(view);
/* 35 */            mo5864b(transitionSet, arrayList);
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: q */
                public final void mo5876q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             TransitionSet transitionSet = (TransitionSet) obj;
/* 3 */             if (transitionSet != null) {
/* 9 */                 transitionSet.getTargets().clear();
/* 16 */                transitionSet.getTargets().addAll(arrayList2);
/* 19 */                m5878t(transitionSet, arrayList, arrayList2);
                    }
                }

                @Override // p000.ln0
                /* JADX INFO: renamed from: r */
                public final Object mo5877r(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 7 */             TransitionSet transitionSet = new TransitionSet();
/* 12 */            transitionSet.addTransition((Transition) obj);
/* 15 */            return transitionSet;
                }

                /* JADX INFO: renamed from: t */
                public final void m5878t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
                    List<View> targets;
/* 1 */             Transition transition = (Transition) obj;
/* 5 */             int i = 0;
/* 6 */             if (transition instanceof TransitionSet) {
/* 8 */                 TransitionSet transitionSet = (TransitionSet) transition;
/* 10 */                int transitionCount = transitionSet.getTransitionCount();
/* 14 */                while (i < transitionCount) {
/* 20 */                    m5878t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
/* 23 */                    i++;
                        }
/* 96 */                return;
                    }
/* 30 */            if (m5862s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
/* 96 */                return;
                    }
/* 58 */            int size = arrayList2 == null ? 0 : arrayList2.size();
/* 62 */            while (i < size) {
/* 70 */                transition.addTarget((View) arrayList2.get(i));
/* 73 */                i++;
                    }
/* 82 */            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
/* 90 */                transition.removeTarget((View) arrayList.get(size2));
                    }
                }
            }
