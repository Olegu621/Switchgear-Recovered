            package androidx.fragment.app;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.transition.Transition;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import p000.C0917fh;
            import p000.C0927fr;
            import p000.C1024id;
            import p000.C2122qw;
            import p000.RunnableC1784j8;
            import p000.RunnableC2166s2;
            import p000.RunnableC2558zo;
            import p000.e33;
            import p000.en0;
            import p000.fq1;
            import p000.jn0;
            import p000.kn0;
            import p000.l33;
            import p000.le2;
            import p000.ln0;
            import p000.qc3;
            import p000.s23;
            import p000.t60;
            import p000.u60;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0095g extends wf2 {

                /* JADX INFO: renamed from: c */
                public final ArrayList f1426c;

                /* JADX INFO: renamed from: d */
                public final C0091c0 f1427d;

                /* JADX INFO: renamed from: e */
                public final C0091c0 f1428e;

                /* JADX INFO: renamed from: f */
                public final ln0 f1429f;

                /* JADX INFO: renamed from: g */
                public final Object f1430g;

                /* JADX INFO: renamed from: h */
                public final ArrayList f1431h;

                /* JADX INFO: renamed from: i */
                public final ArrayList f1432i;

                /* JADX INFO: renamed from: j */
                public final C1024id f1433j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f1434k;

                /* JADX INFO: renamed from: l */
                public final ArrayList f1435l;

                /* JADX INFO: renamed from: m */
                public final C1024id f1436m;

                /* JADX INFO: renamed from: n */
                public final C1024id f1437n;

                /* JADX INFO: renamed from: o */
                public final boolean f1438o;

                /* JADX INFO: renamed from: p */
                public final C0927fr f1439p;

                public C0095g(ArrayList arrayList, C0091c0 c0091c0, C0091c0 c0091c1, ln0 ln0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, C1024id c1024id, ArrayList arrayList4, ArrayList arrayList5, C1024id c1024id2, C1024id c1024id3, boolean z) {
/* 1 */             arrayList4.getClass();
/* 7 */             this.f1426c = arrayList;
/* 9 */             this.f1427d = c0091c0;
/* 11 */            this.f1428e = c0091c1;
/* 13 */            this.f1429f = ln0Var;
/* 15 */            this.f1430g = obj;
/* 17 */            this.f1431h = arrayList2;
/* 19 */            this.f1432i = arrayList3;
/* 21 */            this.f1433j = c1024id;
/* 23 */            this.f1434k = arrayList4;
/* 25 */            this.f1435l = arrayList5;
/* 27 */            this.f1436m = c1024id2;
/* 29 */            this.f1437n = c1024id3;
/* 31 */            this.f1438o = z;
/* 38 */            this.f1439p = new C0927fr();
                }

                /* JADX INFO: renamed from: f */
                public static void m651f(View view, ArrayList arrayList) {
/* 3 */             if (!(view instanceof ViewGroup)) {
/* 51 */                if (arrayList.contains(view)) {
/* 56 */                    return;
                        }
/* 53 */                arrayList.add(view);
/* 56 */                return;
                    }
/* 6 */             ViewGroup viewGroup = (ViewGroup) view;
/* 12 */            if (l33.m6334b(viewGroup)) {
/* 18 */                if (arrayList.contains(view)) {
/* 56 */                    return;
                        }
/* 20 */                arrayList.add(view);
/* 23 */                return;
                    }
/* 24 */            int childCount = viewGroup.getChildCount();
/* 29 */            for (int i = 0; i < childCount; i++) {
/* 31 */                View childAt = viewGroup.getChildAt(i);
/* 39 */                if (childAt.getVisibility() == 0) {
/* 41 */                    m651f(childAt, arrayList);
                        }
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: a */
                public final boolean mo652a() {
/* 1 */             return false;
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: b */
                public final void mo641b(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 4 */             C0927fr c0927fr = this.f1439p;
                    synchronized (c0927fr) {
                        try {
/* 9 */                     if (c0927fr.f8325a) {
/* 12 */                        return;
                            }
/* 16 */                    c0927fr.f8325a = true;
/* 18 */                    c0927fr.f8327c = true;
/* 20 */                    qc3 qc3Var = c0927fr.f8326b;
/* 24 */                    if (qc3Var != null) {
                                try {
/* 30 */                            ((Transition) qc3Var.f15492b).cancel();
                                } catch (Throwable th) {
                                    synchronized (c0927fr) {
/* 36 */                                c0927fr.f8327c = false;
/* 38 */                                c0927fr.notifyAll();
/* 42 */                                throw th;
                                    }
                                }
                            }
                            synchronized (c0927fr) {
/* 47 */                        c0927fr.f8327c = false;
/* 49 */                        c0927fr.notifyAll();
                            }
                        } catch (Throwable th2) {
/* 58 */                    throw th2;
                        }
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: c */
                public final void mo642c(ViewGroup viewGroup) {
                    C1024id c1024id;
                    Object obj;
                    C0091c0 c0091c0;
                    C0091c0 c0091c1;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ln0 ln0Var;
                    ln0 ln0Var2;
                    Object obj2;
                    le2 le2Var;
                    int i;
                    ln0 ln0Var3;
                    Object obj3;
                    ArrayList arrayList3;
                    View view;
/* 5 */             viewGroup.getClass();
/* 8 */             boolean zIsLaidOut = viewGroup.isLaidOut();
/* 12 */            ArrayList<u60> arrayList4 = this.f1426c;
/* 15 */            if (!zIsLaidOut) {
/* 25 */                for (u60 u60Var : arrayList4) {
/* 33 */                    C0091c0 c0091c2 = u60Var.f1425a;
/* 39 */                    if (AbstractC0111w.m674K(2)) {
/* 41 */                        viewGroup.toString();
/* 44 */                        Objects.toString(c0091c2);
                            }
/* 49 */                    u60Var.f1425a.m645c(this);
                        }
/* 875 */               return;
                    }
/* 59 */            View view2 = new View(viewGroup.getContext());
/* 64 */            Rect rect = new Rect();
/* 67 */            Iterator it = arrayList4.iterator();
/* 71 */            View view3 = null;
/* 72 */            boolean z = false;
                    while (true) {
/* 73 */                boolean zHasNext = it.hasNext();
/* 77 */                c1024id = this.f1433j;
/* 79 */                obj = this.f1430g;
/* 81 */                c0091c0 = this.f1428e;
/* 83 */                c0091c1 = this.f1427d;
/* 85 */                arrayList = this.f1432i;
/* 87 */                arrayList2 = this.f1431h;
/* 89 */                ln0Var = this.f1429f;
/* 91 */                if (!zHasNext) {
                            break;
                        }
/* 101 */               if (((u60) it.next()).f17373d != null && c0091c1 != null && c0091c0 != null && !c1024id.isEmpty() && obj != null) {
/* 115 */                   Fragment fragment = c0091c0.f1410c;
/* 117 */                   Fragment fragment2 = c0091c1.f1410c;
/* 119 */                   jn0 jn0Var = en0.f7805a;
/* 121 */                   fragment.getClass();
/* 124 */                   fragment2.getClass();
/* 131 */                   if (this.f1438o) {
/* 133 */                       fragment2.getEnterTransitionCallback();
                            } else {
/* 137 */                       fragment.getEnterTransitionCallback();
                            }
/* 146 */                   fq1.m3803a(viewGroup, new RunnableC2558zo(3, c0091c0, c0091c1, this));
/* 149 */                   C1024id c1024id2 = this.f1436m;
/* 155 */                   arrayList2.addAll(c1024id2.values());
/* 158 */                   ArrayList arrayList5 = this.f1435l;
/* 164 */                   if (!arrayList5.isEmpty()) {
/* 167 */                       Object obj4 = arrayList5.get(0);
/* 171 */                       obj4.getClass();
/* 181 */                       View view4 = (View) c1024id2.getOrDefault((String) obj4, null);
/* 183 */                       ln0Var.mo5872m(view4, obj);
/* 186 */                       view3 = view4;
                            }
/* 187 */                   C1024id c1024id3 = this.f1437n;
/* 193 */                   arrayList.addAll(c1024id3.values());
/* 196 */                   ArrayList arrayList6 = this.f1434k;
/* 202 */                   if (!arrayList6.isEmpty()) {
/* 205 */                       Object obj5 = arrayList6.get(0);
/* 209 */                       obj5.getClass();
/* 219 */                       View view5 = (View) c1024id3.getOrDefault((String) obj5, null);
/* 221 */                       if (view5 != null) {
/* 228 */                           fq1.m3803a(viewGroup, new RunnableC1784j8(ln0Var, view5, rect));
/* 232 */                           z = true;
                                }
                            }
/* 233 */                   ln0Var.mo5875p(obj, view2, arrayList2);
/* 240 */                   Object obj6 = this.f1430g;
/* 250 */                   ln0Var.mo5871l(obj6, null, null, obj6, arrayList);
                        }
/* 253 */               it = it;
                    }
/* 262 */           ln0 ln0Var4 = ln0Var;
/* 265 */           ArrayList arrayList7 = new ArrayList();
/* 268 */           Iterator it2 = arrayList4.iterator();
/* 276 */           Object objMo5869j = null;
/* 277 */           Object objMo5869j2 = null;
                    while (true) {
/* 282 */               z = z;
/* 284 */               if (!it2.hasNext()) {
                            break;
                        }
/* 292 */               u60 u60Var2 = (u60) it2.next();
/* 294 */               it2 = it2;
/* 296 */               C0091c0 c0091c3 = u60Var2.f1425a;
/* 298 */               c1024id = c1024id;
/* 302 */               Object objMo5867f = ln0Var4.mo5867f(u60Var2.f17371b);
/* 306 */               if (objMo5867f != null) {
/* 310 */                   ArrayList arrayList8 = new ArrayList();
/* 313 */                   ArrayList arrayList9 = arrayList4;
/* 315 */                   Fragment fragment3 = c0091c3.f1410c;
/* 317 */                   Object obj7 = obj;
/* 319 */                   View view6 = fragment3.mView;
/* 321 */                   view6.getClass();
/* 324 */                   m651f(view6, arrayList8);
/* 327 */                   if (obj7 != null && (c0091c3 == c0091c1 || c0091c3 == c0091c0)) {
/* 333 */                       if (c0091c3 == c0091c1) {
/* 339 */                           arrayList8.removeAll(CollectionsKt.m6195N(arrayList2));
                                } else {
/* 347 */                           arrayList8.removeAll(CollectionsKt.m6195N(arrayList));
                                }
                            }
/* 354 */                   if (arrayList8.isEmpty()) {
/* 356 */                       ln0Var4.mo5863a(view2, objMo5867f);
/* 359 */                       ln0 ln0Var5 = ln0Var4;
/* 361 */                       arrayList3 = arrayList8;
/* 362 */                       obj3 = objMo5867f;
/* 363 */                       ln0Var3 = ln0Var5;
/* 365 */                       view = view2;
                            } else {
/* 368 */                       ln0Var4.mo5864b(objMo5867f, arrayList8);
/* 379 */                       ln0 ln0Var6 = ln0Var4;
/* 383 */                       ln0Var6.mo5871l(objMo5867f, objMo5867f, arrayList8, null, null);
/* 386 */                       ln0Var3 = ln0Var6;
/* 388 */                       obj3 = objMo5867f;
/* 390 */                       arrayList3 = arrayList8;
/* 394 */                       view = view2;
/* 397 */                       if (c0091c3.f1408a == 3) {
/* 400 */                           c0091c3.f1416i = false;
/* 404 */                           ArrayList arrayList10 = new ArrayList(arrayList3);
/* 409 */                           arrayList10.remove(fragment3.mView);
/* 414 */                           ln0Var3.mo5870k(obj3, fragment3.mView, arrayList10);
/* 424 */                           fq1.m3803a(viewGroup, new RunnableC2166s2(arrayList3, 13));
                                }
                            }
/* 430 */                   if (c0091c3.f1408a == 2) {
/* 432 */                       arrayList7.addAll(arrayList3);
/* 435 */                       if (z) {
/* 437 */                           ln0Var3.mo5873n(obj3, rect);
                                }
/* 444 */                       if (AbstractC0111w.m674K(2)) {
/* 446 */                           obj3.toString();
/* 457 */                           for (Object obj8 : arrayList3) {
/* 463 */                               obj8.getClass();
/* 468 */                               Objects.toString((View) obj8);
                                    }
                                }
                            } else {
/* 472 */                       ln0Var3.mo5872m(view3, obj3);
/* 481 */                       if (AbstractC0111w.m674K(2)) {
/* 483 */                           obj3.toString();
/* 494 */                           for (Object obj9 : arrayList3) {
/* 500 */                               obj9.getClass();
/* 505 */                               Objects.toString((View) obj9);
                                    }
                                }
                            }
/* 511 */                   if (u60Var2.f17372c) {
/* 513 */                       objMo5869j = ln0Var3.mo5869j(objMo5869j, obj3);
                            } else {
/* 534 */                       objMo5869j2 = ln0Var3.mo5869j(objMo5869j2, obj3);
                            }
/* 519 */                   ln0Var4 = ln0Var3;
/* 520 */                   view2 = view;
/* 528 */                   arrayList4 = arrayList9;
/* 530 */                   obj = obj7;
                        }
                    }
/* 549 */           ArrayList arrayList11 = arrayList4;
/* 551 */           le2 le2Var2 = c1024id;
/* 553 */           Object obj10 = obj;
/* 555 */           Object objMo5868i = ln0Var4.mo5868i(objMo5869j, objMo5869j2, obj10);
/* 565 */           if (AbstractC0111w.m674K(2)) {
/* 567 */               Objects.toString(objMo5868i);
                    }
/* 572 */           Pair pair = new Pair(arrayList7, objMo5868i);
/* 577 */           ArrayList arrayList12 = (ArrayList) pair.f12908a;
/* 589 */           ArrayList arrayList13 = new ArrayList(C2122qw.m8020h(arrayList11, 10));
/* 592 */           Iterator it3 = arrayList11.iterator();
/* 600 */           while (it3.hasNext()) {
/* 610 */               arrayList13.add(((u60) it3.next()).f1425a);
                    }
/* 614 */           Iterator it4 = arrayList13.iterator();
                    while (true) {
/* 618 */               boolean zHasNext2 = it4.hasNext();
/* 624 */               ln0Var2 = this.f1429f;
/* 626 */               obj2 = pair.f12909b;
/* 628 */               if (!zHasNext2) {
                            break;
                        }
/* 634 */               C0091c0 c0091c4 = (C0091c0) it4.next();
/* 636 */               Fragment fragment4 = c0091c4.f1410c;
/* 647 */               ln0Var2.mo5874o(obj2, this.f1439p, new RunnableC1784j8(13, c0091c4, this));
                    }
/* 653 */           t60 t60Var = new t60(this, viewGroup, obj2);
/* 657 */           en0.m3522a(4, arrayList12);
/* 662 */           ArrayList arrayList14 = new ArrayList();
/* 665 */           ArrayList arrayList15 = this.f1432i;
/* 667 */           int size = arrayList15.size();
/* 672 */           for (int i2 = 0; i2 < size; i2++) {
/* 678 */               View view7 = (View) arrayList15.get(i2);
/* 680 */               WeakHashMap weakHashMap = e33.f7494a;
/* 686 */               arrayList14.add(s23.m8373k(view7));
/* 690 */               s23.m8384v(view7, null);
                    }
/* 698 */           boolean zM674K = AbstractC0111w.m674K(2);
/* 702 */           ArrayList arrayList16 = this.f1431h;
/* 704 */           if (zM674K) {
/* 714 */               for (Object obj11 : arrayList16) {
/* 720 */                   obj11.getClass();
/* 723 */                   View view8 = (View) obj11;
/* 725 */                   Objects.toString(view8);
/* 728 */                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 730 */                   s23.m8373k(view8);
                        }
/* 742 */               for (Object obj12 : arrayList15) {
/* 748 */                   obj12.getClass();
/* 751 */                   View view9 = (View) obj12;
/* 753 */                   Objects.toString(view9);
/* 756 */                   WeakHashMap weakHashMap3 = e33.f7494a;
/* 758 */                   s23.m8373k(view9);
                        }
                    }
/* 762 */           t60Var.invoke();
/* 765 */           int size2 = arrayList15.size();
/* 771 */           ArrayList arrayList17 = new ArrayList();
/* 774 */           int i3 = 0;
/* 775 */           while (i3 < size2) {
/* 781 */               View view10 = (View) arrayList16.get(i3);
/* 783 */               WeakHashMap weakHashMap4 = e33.f7494a;
/* 785 */               String strM8373k = s23.m8373k(view10);
/* 789 */               arrayList17.add(strM8373k);
/* 792 */               if (strM8373k == null) {
/* 794 */                   i = i3;
/* 796 */                   le2Var = le2Var2;
                        } else {
/* 800 */                   s23.m8384v(view10, null);
/* 803 */                   le2Var = le2Var2;
/* 809 */                   String str = (String) le2Var.getOrDefault(strM8373k, null);
/* 811 */                   int i4 = 0;
                            while (true) {
/* 812 */                       i = i3;
/* 814 */                       if (i4 >= size2) {
                                    break;
                                }
/* 824 */                       if (str.equals(arrayList14.get(i4))) {
/* 832 */                           s23.m8384v((View) arrayList15.get(i4), strM8373k);
                                    break;
                                } else {
/* 836 */                           i4++;
/* 838 */                           i3 = i;
                                }
                            }
                        }
/* 841 */               i3 = i + 1;
/* 843 */               le2Var2 = le2Var;
                    }
/* 851 */           fq1.m3803a(viewGroup, new kn0(size2, arrayList15, arrayList14, arrayList16, arrayList17));
/* 855 */           en0.m3522a(0, arrayList12);
/* 858 */           ln0Var2.mo5876q(obj10, arrayList16, arrayList15);
/* 867 */           if (AbstractC0111w.m674K(2)) {
/* 869 */               Objects.toString(c0091c1);
/* 872 */               Objects.toString(c0091c0);
                    }
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: d */
                public final void mo648d(C0917fh c0917fh, ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
                }

                @Override // p000.wf2
                /* JADX INFO: renamed from: e */
                public final void mo649e(ViewGroup viewGroup) {
                    boolean z;
                    Object obj;
/* 1 */             viewGroup.getClass();
/* 4 */             boolean zIsLaidOut = viewGroup.isLaidOut();
/* 8 */             ArrayList arrayList = this.f1426c;
/* 10 */            if (!zIsLaidOut) {
/* 12 */                Iterator it = arrayList.iterator();
/* 20 */                while (it.hasNext()) {
/* 28 */                    C0091c0 c0091c0 = ((u60) it.next()).f1425a;
/* 35 */                    if (AbstractC0111w.m674K(2)) {
/* 37 */                        viewGroup.toString();
/* 40 */                        Objects.toString(c0091c0);
                            }
                        }
/* 44 */                return;
                    }
/* 49 */            if (!arrayList.isEmpty()) {
/* 52 */                Iterator it2 = arrayList.iterator();
                        while (true) {
/* 60 */                    if (!it2.hasNext()) {
/* 78 */                        z = true;
                                break;
                            } else if (!((u60) it2.next()).f1425a.f1410c.mTransitioning) {
/* 76 */                        z = false;
                                break;
                            }
                        }
                    } else {
/* 78 */                z = true;
                        break;
                    }
/* 79 */            if (!z || (obj = this.f1430g) == null) {
/* 98 */                return;
                    }
/* 85 */            Objects.toString(obj);
/* 90 */            Objects.toString(this.f1427d);
/* 95 */            Objects.toString(this.f1428e);
                }
            }
