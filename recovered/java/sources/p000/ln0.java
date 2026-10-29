            package p000;

            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ln0 {
                /* JADX INFO: renamed from: d */
                public static void m6510d(View view, List list) {
/* 1 */             int size = list.size();
/* 7 */             for (int i = 0; i < size; i++) {
/* 13 */                if (list.get(i) == view) {
/* 88 */                    return;
                        }
                    }
/* 19 */            WeakHashMap weakHashMap = e33.f7494a;
/* 25 */            if (s23.m8373k(view) != null) {
/* 27 */                list.add(view);
                    }
/* 35 */            for (int i2 = size; i2 < list.size(); i2++) {
/* 41 */                View view2 = (View) list.get(i2);
/* 45 */                if (view2 instanceof ViewGroup) {
/* 47 */                    ViewGroup viewGroup = (ViewGroup) view2;
/* 49 */                    int childCount = viewGroup.getChildCount();
/* 54 */                    for (int i3 = 0; i3 < childCount; i3++) {
/* 56 */                        View childAt = viewGroup.getChildAt(i3);
/* 60 */                        int i4 = 0;
                                while (true) {
/* 61 */                            if (i4 >= size) {
/* 77 */                                if (s23.m8373k(childAt) == null) {
                                            break;
                                        }
/* 79 */                                list.add(childAt);
                                        break;
                                    } else if (list.get(i4) == childAt) {
                                        break;
                                    } else {
/* 70 */                                i4++;
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public static void m6511g(Rect rect, View view) {
/* 5 */             if (view.isAttachedToWindow()) {
/* 10 */                RectF rectF = new RectF();
/* 24 */                rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
/* 31 */                view.getMatrix().mapRect(rectF);
/* 44 */                rectF.offset(view.getLeft(), view.getTop());
/* 47 */                Object parent = view.getParent();
/* 53 */                while (parent instanceof View) {
/* 55 */                    View view2 = (View) parent;
/* 69 */                    rectF.offset(-view2.getScrollX(), -view2.getScrollY());
/* 76 */                    view2.getMatrix().mapRect(rectF);
/* 89 */                    rectF.offset(view2.getLeft(), view2.getTop());
/* 92 */                    parent = view2.getParent();
                        }
/* 98 */                int[] iArr = new int[2];
/* 104 */               view.getRootView().getLocationOnScreen(iArr);
/* 115 */               rectF.offset(iArr[0], iArr[1]);
/* 142 */               rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    }
                }

                /* JADX INFO: renamed from: h */
                public static boolean m6512h(List list) {
                    return list == null || list.isEmpty();
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo5863a(View view, Object obj);

                /* JADX INFO: renamed from: b */
                public abstract void mo5864b(Object obj, ArrayList arrayList);

                /* JADX INFO: renamed from: c */
                public abstract void mo5865c(ViewGroup viewGroup, Object obj);

                /* JADX INFO: renamed from: e */
                public abstract boolean mo5866e(Object obj);

                /* JADX INFO: renamed from: f */
                public abstract Object mo5867f(Object obj);

                /* JADX INFO: renamed from: i */
                public abstract Object mo5868i(Object obj, Object obj2, Object obj3);

                /* JADX INFO: renamed from: j */
                public abstract Object mo5869j(Object obj, Object obj2);

                /* JADX INFO: renamed from: k */
                public abstract void mo5870k(Object obj, View view, ArrayList arrayList);

                /* JADX INFO: renamed from: l */
                public abstract void mo5871l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

                /* JADX INFO: renamed from: m */
                public abstract void mo5872m(View view, Object obj);

                /* JADX INFO: renamed from: n */
                public abstract void mo5873n(Object obj, Rect rect);

                /* JADX INFO: renamed from: o */
                public abstract void mo5874o(Object obj, C0927fr c0927fr, RunnableC1784j8 runnableC1784j8);

                /* JADX INFO: renamed from: p */
                public abstract void mo5875p(Object obj, View view, ArrayList arrayList);

                /* JADX INFO: renamed from: q */
                public abstract void mo5876q(Object obj, ArrayList arrayList, ArrayList arrayList2);

                /* JADX INFO: renamed from: r */
                public abstract Object mo5877r(Object obj);
            }
