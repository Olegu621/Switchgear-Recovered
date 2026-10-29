            package p000;

            import android.view.View;
            import android.view.ViewPropertyAnimator;
            import androidx.recyclerview.widget.AbstractC0137o;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d60 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7015a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f7016b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ j60 f7017c;

                public /* synthetic */ d60(j60 j60Var, ArrayList arrayList, int i) {
/* 1 */             this.f7015a = i;
/* 3 */             this.f7017c = j60Var;
/* 5 */             this.f7016b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7015a;
/* 3 */             ArrayList arrayList = this.f7016b;
                    switch (i) {
                        case 0:
/* 74 */                    Iterator it = arrayList.iterator();
                            while (true) {
/* 78 */                        boolean zHasNext = it.hasNext();
/* 82 */                        j60 j60Var = this.f7017c;
/* 84 */                        if (!zHasNext) {
/* 160 */                           arrayList.clear();
/* 165 */                           j60Var.f12089m.remove(arrayList);
                                } else {
/* 90 */                            i60 i60Var = (i60) it.next();
/* 92 */                            AbstractC0137o abstractC0137o = i60Var.f9460a;
/* 94 */                            int i2 = i60Var.f9461b;
/* 96 */                            int i3 = i60Var.f9462c;
/* 98 */                            int i4 = i60Var.f9463d;
/* 100 */                           int i5 = i60Var.f9464e;
/* 102 */                           j60Var.getClass();
/* 106 */                           View view = abstractC0137o.f1778a;
/* 108 */                           int i6 = i4 - i2;
/* 110 */                           int i7 = i5 - i3;
/* 113 */                           if (i6 != 0) {
/* 119 */                               view.animate().translationX(0.0f);
                                    }
/* 122 */                           if (i7 != 0) {
/* 128 */                               view.animate().translationY(0.0f);
                                    }
/* 131 */                           ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
/* 137 */                           j60Var.f12092p.add(abstractC0137o);
/* 156 */                           viewPropertyAnimatorAnimate.setDuration(j60Var.f14098e).setListener(new f60(j60Var, abstractC0137o, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                                }
                                break;
                            }
                            break;
                        default:
/* 8 */                     Iterator it2 = arrayList.iterator();
                            while (true) {
/* 12 */                        boolean zHasNext2 = it2.hasNext();
/* 16 */                        j60 j60Var2 = this.f7017c;
/* 18 */                        if (!zHasNext2) {
/* 65 */                            arrayList.clear();
/* 70 */                            j60Var2.f12088l.remove(arrayList);
                                } else {
/* 24 */                            AbstractC0137o abstractC0137o2 = (AbstractC0137o) it2.next();
/* 26 */                            j60Var2.getClass();
/* 29 */                            View view2 = abstractC0137o2.f1778a;
/* 31 */                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
/* 37 */                            j60Var2.f12091o.add(abstractC0137o2);
/* 61 */                            viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(j60Var2.f14096c).setListener(new e60(j60Var2, abstractC0137o2, view2, viewPropertyAnimatorAnimate2)).start();
                                }
                                break;
                            }
                            break;
                    }
                }
            }
