            package p000;

            import android.view.View;
            import android.view.ViewPropertyAnimator;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f12 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7965a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ RecyclerView f7966b;

                public /* synthetic */ f12(RecyclerView recyclerView, int i) {
/* 1 */             this.f7965a = i;
/* 3 */             this.f7966b = recyclerView;
                }

                /* JADX WARN: Code duplicated, block: B:44:0x0115  */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
/* 3 */             int i = this.f7965a;
/* 5 */             RecyclerView recyclerView = this.f7966b;
                    switch (i) {
                        case 0:
/* 284 */                   if (recyclerView.f1656h0 && !recyclerView.isLayoutRequested()) {
/* 295 */                       if (!recyclerView.f1652f0) {
/* 297 */                           recyclerView.requestLayout();
                                } else if (recyclerView.f1663k0) {
/* 306 */                           recyclerView.f1661j0 = true;
                                } else {
/* 309 */                           recyclerView.m887m();
                                }
                                break;
                            }
                            break;
                        default:
/* 10 */                    n12 n12Var = recyclerView.f1680z0;
/* 12 */                    if (n12Var != null) {
/* 14 */                        j60 j60Var = (j60) n12Var;
/* 16 */                        long j = j60Var.f14097d;
/* 18 */                        ArrayList<AbstractC0137o> arrayList = j60Var.f12084h;
/* 20 */                        boolean zIsEmpty = arrayList.isEmpty();
/* 24 */                        ArrayList arrayList2 = j60Var.f12086j;
/* 26 */                        boolean zIsEmpty2 = arrayList2.isEmpty();
/* 30 */                        ArrayList arrayList3 = j60Var.f12087k;
/* 32 */                        boolean zIsEmpty3 = arrayList3.isEmpty();
/* 36 */                        ArrayList arrayList4 = j60Var.f12085i;
/* 38 */                        boolean zIsEmpty4 = arrayList4.isEmpty();
/* 42 */                        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
/* 278 */                           z = false;
                                } else {
/* 60 */                            for (AbstractC0137o abstractC0137o : arrayList) {
/* 68 */                                View view = abstractC0137o.f1778a;
/* 70 */                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
/* 78 */                                j60Var.f12093q.add(abstractC0137o);
/* 101 */                               viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new e60(j60Var, abstractC0137o, viewPropertyAnimatorAnimate, view)).start();
/* 104 */                               arrayList = arrayList;
/* 106 */                               zIsEmpty = zIsEmpty;
                                    }
/* 111 */                           boolean z2 = zIsEmpty;
/* 113 */                           arrayList.clear();
/* 116 */                           if (!zIsEmpty2) {
/* 120 */                               ArrayList arrayList5 = new ArrayList();
/* 123 */                               arrayList5.addAll(arrayList2);
/* 128 */                               j60Var.f12089m.add(arrayList5);
/* 131 */                               arrayList2.clear();
/* 137 */                               d60 d60Var = new d60(j60Var, arrayList5, 0);
/* 140 */                               if (z2) {
/* 158 */                                   d60Var.run();
                                        } else {
/* 150 */                                   View view2 = ((i60) arrayList5.get(0)).f9460a.f1778a;
/* 152 */                                   WeakHashMap weakHashMap = e33.f7494a;
/* 154 */                                   view2.postOnAnimationDelayed(d60Var, j);
                                        }
                                    }
/* 161 */                           if (!zIsEmpty3) {
/* 165 */                               ArrayList arrayList6 = new ArrayList();
/* 168 */                               arrayList6.addAll(arrayList3);
/* 173 */                               j60Var.f12090n.add(arrayList6);
/* 176 */                               arrayList3.clear();
/* 183 */                               dp0 dp0Var = new dp0(j60Var, arrayList6, 6, false);
/* 186 */                               if (z2) {
/* 204 */                                   dp0Var.run();
                                        } else {
/* 196 */                                   View view3 = ((h60) arrayList6.get(0)).f8912a.f1778a;
/* 198 */                                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 200 */                                   view3.postOnAnimationDelayed(dp0Var, j);
                                        }
                                    }
/* 207 */                           if (zIsEmpty4) {
/* 278 */                               z = false;
                                    } else {
/* 211 */                               ArrayList arrayList7 = new ArrayList();
/* 214 */                               arrayList7.addAll(arrayList4);
/* 219 */                               j60Var.f12088l.add(arrayList7);
/* 222 */                               arrayList4.clear();
/* 228 */                               d60 d60Var2 = new d60(j60Var, arrayList7, 1);
/* 231 */                               if (z2 && zIsEmpty2 && zIsEmpty3) {
/* 238 */                                   d60Var2.run();
/* 278 */                                   z = false;
                                        } else {
/* 244 */                                   if (z2) {
/* 247 */                                       j = 0;
                                            }
/* 262 */                                   long jMax = Math.max(!zIsEmpty2 ? j60Var.f14098e : 0L, zIsEmpty3 ? 0L : j60Var.f14099f) + j;
/* 263 */                                   z = false;
/* 270 */                                   View view4 = ((AbstractC0137o) arrayList7.get(0)).f1778a;
/* 272 */                                   WeakHashMap weakHashMap3 = e33.f7494a;
/* 274 */                                   view4.postOnAnimationDelayed(d60Var2, jMax);
                                        }
                                    }
                                }
                            } else {
/* 278 */                       z = false;
                            }
/* 279 */                   recyclerView.f1633X0 = z;
                            break;
                    }
                }
            }
