            package androidx.fragment.app;

            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.fragment.R$id;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.Set;
            import java.util.WeakHashMap;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1024id;
            import p000.C1951n4;
            import p000.C1983o;
            import p000.C2270uw;
            import p000.e22;
            import p000.e33;
            import p000.en0;
            import p000.fm0;
            import p000.jm0;
            import p000.jn0;
            import p000.kx0;
            import p000.ln0;
            import p000.o60;
            import p000.s23;
            import p000.u60;
            import p000.wc0;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0096h {

                /* JADX INFO: renamed from: a */
                public final ViewGroup f1440a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f1441b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f1442c;

                /* JADX INFO: renamed from: d */
                public boolean f1443d;

                /* JADX INFO: renamed from: e */
                public boolean f1444e;

                public C0096h(ViewGroup viewGroup) {
/* 1 */             viewGroup.getClass();
/* 7 */             this.f1440a = viewGroup;
/* 14 */            this.f1441b = new ArrayList();
/* 21 */            this.f1442c = new ArrayList();
                }

                /* JADX INFO: renamed from: f */
                public static void m653f(C1024id c1024id, View view) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             String strM8373k = s23.m8373k(view);
/* 7 */             if (strM8373k != null) {
/* 9 */                 c1024id.put(strM8373k, view);
                    }
/* 14 */            if (view instanceof ViewGroup) {
/* 16 */                ViewGroup viewGroup = (ViewGroup) view;
/* 18 */                int childCount = viewGroup.getChildCount();
/* 23 */                for (int i = 0; i < childCount; i++) {
/* 25 */                    View childAt = viewGroup.getChildAt(i);
/* 33 */                    if (childAt.getVisibility() == 0) {
/* 35 */                        m653f(c1024id, childAt);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public static final C0096h m654j(ViewGroup viewGroup, AbstractC0111w abstractC0111w) {
/* 1 */             viewGroup.getClass();
/* 4 */             abstractC0111w.getClass();
/* 11 */            abstractC0111w.m685J().getClass();
/* 16 */            Object tag = viewGroup.getTag(R$id.special_effects_controller_view_tag);
/* 22 */            if (tag instanceof C0096h) {
/* 24 */                return (C0096h) tag;
                    }
/* 29 */            C0096h c0096h = new C0096h(viewGroup);
/* 34 */            viewGroup.setTag(R$id.special_effects_controller_view_tag, c0096h);
/* 37 */            return c0096h;
                }

                /* JADX INFO: renamed from: a */
                public final void m655a(C0091c0 c0091c0) {
/* 1 */             c0091c0.getClass();
/* 6 */             if (c0091c0.f1416i) {
/* 8 */                 int i = c0091c0.f1408a;
/* 12 */                View viewRequireView = c0091c0.f1410c.requireView();
/* 16 */                viewRequireView.getClass();
/* 21 */                fm0.m3775a(i, viewRequireView, this.f1440a);
/* 25 */                c0091c0.f1416i = false;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:150:0x03bd A[LOOP:18: B:148:0x03b7->B:150:0x03bd, LOOP_END] */
                /* JADX INFO: renamed from: b */
                public final void m656b(ArrayList arrayList, boolean z) {
                    int i;
                    Object next;
                    Object objPrevious;
                    boolean z2;
                    ArrayList<C0092d> arrayList2;
                    int i2;
                    C0095g c0095g;
                    boolean z3;
                    Iterator it;
                    boolean z4;
                    Object objMo5877r;
                    ArrayList<String> sharedElementSourceNames;
                    ArrayList arrayList3;
                    C0091c0 c0091c0;
                    ArrayList arrayList4;
                    C0091c0 c0091c1;
                    ArrayList<String> sharedElementTargetNames;
                    Pair pair;
/* 5 */             Iterator it2 = arrayList.iterator();
                    while (true) {
/* 19 */                i = 2;
/* 20 */                if (!it2.hasNext()) {
/* 75 */                    next = null;
                            break;
                        }
/* 22 */                next = it2.next();
/* 27 */                C0091c0 c0091c2 = (C0091c0) next;
/* 31 */                View view = c0091c2.f1410c.mView;
/* 33 */                view.getClass();
/* 42 */                if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
/* 51 */                    int visibility = view.getVisibility();
/* 55 */                    if (visibility == 0) {
/* 72 */                        if (c0091c2.f1408a != 2) {
                                    break;
                                }
                            } else {
/* 57 */                        if (visibility != 4 && visibility != 8) {
/* 66 */                            C1951n4.m6859j(fm0.m3781g(visibility, "Unknown visibility "));
/* 69 */                            return;
                                }
                            }
                        }
                    }
/* 76 */            C0091c0 c0091c3 = (C0091c0) next;
/* 84 */            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
/* 92 */                if (!listIterator.hasPrevious()) {
/* 147 */                   objPrevious = null;
                            break;
                        }
/* 94 */                objPrevious = listIterator.previous();
/* 99 */                C0091c0 c0091c4 = (C0091c0) objPrevious;
/* 103 */               View view2 = c0091c4.f1410c.mView;
/* 105 */               view2.getClass();
/* 114 */               if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
/* 123 */                   int visibility2 = view2.getVisibility();
/* 127 */                   if (visibility2 == 0) {
                                continue;
                            } else if (visibility2 != 4 && visibility2 != 8) {
/* 138 */                       C1951n4.m6859j(fm0.m3781g(visibility2, "Unknown visibility "));
/* 141 */                       return;
                            }
                        }
/* 144 */               if (c0091c4.f1408a == 2) {
                            break;
                        }
                    }
/* 149 */           C0091c0 c0091c5 = (C0091c0) objPrevious;
/* 155 */           if (AbstractC0111w.m674K(2)) {
/* 157 */               Objects.toString(c0091c3);
/* 160 */               Objects.toString(c0091c5);
                    }
/* 165 */           ArrayList arrayList5 = new ArrayList();
/* 170 */           ArrayList arrayList6 = new ArrayList();
/* 179 */           Fragment fragment = ((C0091c0) CollectionsKt.m6204y(arrayList)).f1410c;
/* 181 */           Iterator it3 = arrayList.iterator();
/* 189 */           while (it3.hasNext()) {
/* 199 */               jm0 jm0Var = ((C0091c0) it3.next()).f1410c.mAnimationInfo;
/* 201 */               jm0 jm0Var2 = fragment.mAnimationInfo;
/* 205 */               jm0Var.f12363b = jm0Var2.f12363b;
/* 209 */               jm0Var.f12364c = jm0Var2.f12364c;
/* 213 */               jm0Var.f12365d = jm0Var2.f12365d;
/* 217 */               jm0Var.f12366e = jm0Var2.f12366e;
                    }
/* 220 */           Iterator it4 = arrayList.iterator();
                    while (true) {
/* 228 */               z2 = false;
/* 231 */               if (!it4.hasNext()) {
                            break;
                        }
/* 237 */               C0091c0 c0091c6 = (C0091c0) it4.next();
/* 244 */               arrayList5.add(new C0092d(c0091c6, z));
/* 264 */               arrayList6.add(new u60(c0091c6, z, !z ? c0091c6 != c0091c5 : c0091c6 != c0091c3));
/* 274 */               c0091c6.f1411d.add(new o60(this, c0091c6, 0));
                    }
/* 280 */           ArrayList arrayList7 = new ArrayList();
/* 291 */           for (Object obj : arrayList6) {
/* 304 */               if (!((u60) obj).m650a()) {
/* 306 */                   arrayList7.add(obj);
                        }
                    }
/* 312 */           ArrayList<u60> arrayList8 = new ArrayList();
/* 323 */           for (Object obj2 : arrayList7) {
/* 336 */               if (((u60) obj2).m8961b() != null) {
/* 338 */                   arrayList8.add(obj2);
                        }
                    }
/* 347 */           ln0 ln0Var = null;
/* 352 */           for (u60 u60Var : arrayList8) {
/* 360 */               ln0 ln0VarM8961b = u60Var.m8961b();
/* 364 */               if (ln0Var != null && ln0VarM8961b != ln0Var) {
/* 373 */                   StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
/* 380 */                   sb.append(u60Var.f1425a.f1410c);
/* 383 */                   Object obj3 = u60Var.f17371b;
/* 387 */                   sb.append(" returned Transition ");
/* 390 */                   sb.append(obj3);
/* 395 */                   sb.append(" which uses a different Transition type than other Fragments.");
/* 411 */                   throw new IllegalArgumentException(sb.toString().toString());
                        }
/* 412 */               ln0Var = ln0VarM8961b;
                    }
/* 414 */           if (ln0Var == null) {
/* 416 */               arrayList2 = arrayList5;
/* 418 */               i2 = 2;
/* 420 */               z3 = false;
                    } else {
/* 425 */               ArrayList arrayList9 = new ArrayList();
/* 430 */               ArrayList arrayList10 = new ArrayList();
/* 436 */               C1024id c1024id = new C1024id();
/* 441 */               ArrayList<String> arrayList11 = new ArrayList<>();
/* 446 */               ArrayList<String> arrayList12 = new ArrayList<>();
/* 452 */               C1024id c1024id2 = new C1024id();
/* 455 */               ArrayList<String> arrayList13 = arrayList12;
/* 459 */               C1024id c1024id3 = new C1024id();
/* 462 */               Iterator it5 = arrayList8.iterator();
                        loop10: while (true) {
/* 468 */                   Object obj4 = null;
                            while (true) {
/* 473 */                       if (!it5.hasNext()) {
/* 888 */                           arrayList2 = arrayList5;
/* 890 */                           C0091c0 c0091c7 = c0091c3;
/* 892 */                           ArrayList arrayList14 = arrayList8;
/* 894 */                           C0091c0 c0091c8 = c0091c5;
/* 896 */                           boolean z5 = z2;
/* 897 */                           i2 = i;
/* 899 */                           if (obj4 == null) {
/* 905 */                               if (!arrayList14.isEmpty()) {
/* 909 */                                   Iterator it6 = arrayList14.iterator();
                                            while (true) {
/* 917 */                                       if (it6.hasNext()) {
/* 927 */                                           if (((u60) it6.next()).f17371b != null) {
/* 932 */                                               z3 = z5;
/* 945 */                                               c0095g = new C0095g(arrayList14, c0091c7, c0091c8, ln0Var, obj4, arrayList9, arrayList10, c1024id, arrayList11, arrayList13, c1024id2, c1024id3, z);
/* 948 */                                               it = arrayList14.iterator();
/* 956 */                                               while (it.hasNext()) {
/* 968 */                                                   ((u60) it.next()).f1425a.f1417j.add(c0095g);
                                                        }
                                                        break loop10;
                                                        break loop10;
                                                    }
                                                }
                                            }
                                        }
/* 907 */                               z3 = z5;
                                        break loop10;
                                    }
/* 932 */                           z3 = z5;
/* 945 */                           c0095g = new C0095g(arrayList14, c0091c7, c0091c8, ln0Var, obj4, arrayList9, arrayList10, c1024id, arrayList11, arrayList13, c1024id2, c1024id3, z);
/* 948 */                           it = arrayList14.iterator();
/* 956 */                           while (it.hasNext()) {
/* 968 */                               ((u60) it.next()).f1425a.f1417j.add(c0095g);
                                    }
                                    break loop10;
                                }
/* 479 */                       i = i;
/* 485 */                       Object obj5 = ((u60) it5.next()).f17373d;
/* 487 */                       if (obj5 == null || c0091c3 == null) {
/* 874 */                           z4 = z2;
/* 875 */                           z2 = z4;
/* 878 */                           arrayList5 = arrayList5;
/* 880 */                           c0091c3 = c0091c3;
/* 882 */                           arrayList8 = arrayList8;
/* 884 */                           c0091c5 = c0091c5;
                                } else {
/* 491 */                           Fragment fragment2 = c0091c3.f1410c;
/* 493 */                           if (c0091c5 != null) {
/* 495 */                               Fragment fragment3 = c0091c5.f1410c;
/* 501 */                               objMo5877r = ln0Var.mo5877r(ln0Var.mo5867f(obj5));
/* 505 */                               sharedElementSourceNames = fragment3.getSharedElementSourceNames();
/* 509 */                               sharedElementSourceNames.getClass();
/* 512 */                               ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
/* 516 */                               sharedElementSourceNames2.getClass();
/* 519 */                               arrayList3 = arrayList5;
/* 521 */                               ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
/* 525 */                               sharedElementTargetNames2.getClass();
/* 528 */                               c0091c0 = c0091c3;
/* 530 */                               int size = sharedElementTargetNames2.size();
/* 534 */                               arrayList4 = arrayList8;
/* 536 */                               c0091c1 = c0091c5;
/* 538 */                               int i3 = 0;
/* 540 */                               while (i3 < size) {
/* 542 */                                   int i4 = size;
/* 548 */                                   int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i3));
/* 552 */                                   if (iIndexOf != -1) {
/* 558 */                                       sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i3));
                                            }
/* 561 */                                   i3++;
/* 563 */                                   size = i4;
                                        }
/* 566 */                               sharedElementTargetNames = fragment3.getSharedElementTargetNames();
/* 570 */                               sharedElementTargetNames.getClass();
/* 573 */                               if (z) {
/* 589 */                                   fragment2.getEnterTransitionCallback();
/* 592 */                                   fragment3.getExitTransitionCallback();
/* 597 */                                   pair = new Pair(null, null);
                                        } else {
/* 575 */                                   fragment2.getExitTransitionCallback();
/* 578 */                                   fragment3.getEnterTransitionCallback();
/* 584 */                                   pair = new Pair(null, null);
                                        }
/* 602 */                               if (pair.f12908a != null) {
/* 852 */                                   C1697u2.m5431g();
/* 855 */                                   return;
                                        }
/* 606 */                               if (pair.f12909b != null) {
/* 848 */                                   C1697u2.m5431g();
/* 851 */                                   return;
                                        }
/* 608 */                               int size2 = sharedElementSourceNames.size();
/* 613 */                               for (int i5 = 0; i5 < size2; i5++) {
/* 615 */                                   String str = sharedElementSourceNames.get(i5);
/* 619 */                                   str.getClass();
/* 624 */                                   String str2 = str;
/* 626 */                                   String str3 = sharedElementTargetNames.get(i5);
/* 630 */                                   str3.getClass();
/* 637 */                                   c1024id.put(str2, str3);
                                        }
/* 649 */                               if (AbstractC0111w.m674K(i)) {
/* 659 */                                   for (String str4 : sharedElementTargetNames) {
                                            }
/* 676 */                                   for (String str5 : sharedElementSourceNames) {
                                            }
                                        }
/* 685 */                               View view3 = fragment2.mView;
/* 687 */                               view3.getClass();
/* 690 */                               m653f(c1024id2, view3);
/* 693 */                               kx0.m6291t(c1024id2, sharedElementSourceNames);
/* 700 */                               kx0.m6291t(c1024id, c1024id2.keySet());
/* 703 */                               View view4 = fragment3.mView;
/* 705 */                               view4.getClass();
/* 708 */                               m653f(c1024id3, view4);
/* 711 */                               kx0.m6291t(c1024id3, sharedElementTargetNames);
/* 718 */                               kx0.m6291t(c1024id3, c1024id.values());
/* 721 */                               jn0 jn0Var = en0.f7805a;
/* 728 */                               for (int i6 = c1024id.f13213c - 1; -1 < i6; i6--) {
/* 740 */                                   if (!c1024id3.containsKey((String) c1024id.m6430j(i6))) {
/* 742 */                                       c1024id.m6429i(i6);
                                            }
                                        }
/* 748 */                               Set setKeySet = c1024id.keySet();
/* 752 */                               setKeySet.getClass();
/* 755 */                               Set setEntrySet = c1024id2.entrySet();
/* 759 */                               setEntrySet.getClass();
/* 764 */                               int i7 = 7;
/* 769 */                               C2270uw.m9142m(setEntrySet, new C1983o(setKeySet, i7), false);
/* 772 */                               Collection collectionValues = c1024id.values();
/* 776 */                               collectionValues.getClass();
/* 779 */                               Set setEntrySet2 = c1024id3.entrySet();
/* 783 */                               setEntrySet2.getClass();
/* 791 */                               C2270uw.m9142m(setEntrySet2, new C1983o(collectionValues, i7), false);
/* 798 */                               if (c1024id.isEmpty()) {
                                            break;
                                        }
/* 831 */                               z2 = false;
/* 832 */                               obj4 = objMo5877r;
/* 833 */                               arrayList13 = sharedElementSourceNames;
/* 837 */                               c0091c3 = c0091c0;
/* 839 */                               arrayList8 = arrayList4;
/* 841 */                               c0091c5 = c0091c1;
/* 843 */                               arrayList11 = sharedElementTargetNames;
/* 844 */                               arrayList5 = arrayList3;
                                    } else {
/* 864 */                               z4 = false;
/* 875 */                               z2 = z4;
/* 878 */                               arrayList5 = arrayList5;
/* 880 */                               c0091c3 = c0091c3;
/* 882 */                               arrayList8 = arrayList8;
/* 884 */                               c0091c5 = c0091c5;
                                    }
                                }
                            }
/* 800 */                   Objects.toString(objMo5877r);
/* 803 */                   c0091c0.toString();
/* 806 */                   c0091c1.toString();
/* 809 */                   arrayList9.clear();
/* 812 */                   arrayList10.clear();
/* 815 */                   arrayList11 = sharedElementTargetNames;
/* 816 */                   z2 = false;
/* 817 */                   arrayList13 = sharedElementSourceNames;
/* 819 */                   i = i;
/* 821 */                   arrayList5 = arrayList3;
/* 823 */                   c0091c3 = c0091c0;
/* 825 */                   arrayList8 = arrayList4;
/* 827 */                   c0091c5 = c0091c1;
                        }
                    }
/* 974 */           ArrayList<C0092d> arrayList15 = new ArrayList();
/* 979 */           ArrayList arrayList16 = new ArrayList();
/* 982 */           Iterator it7 = arrayList2.iterator();
/* 990 */           while (it7.hasNext()) {
/* 1002 */              C2270uw.m9140k(arrayList16, ((C0092d) it7.next()).f1425a.f1418k);
                    }
/* 1006 */          boolean zIsEmpty = arrayList16.isEmpty();
/* 1014 */          boolean z6 = z3;
/* 1019 */          for (C0092d c0092d : arrayList2) {
/* 1029 */              Context context = this.f1440a.getContext();
/* 1033 */              C0091c0 c0091c9 = c0092d.f1425a;
/* 1035 */              context.getClass();
/* 1038 */              wc0 wc0VarM647b = c0092d.m647b(context);
/* 1042 */              if (wc0VarM647b != null) {
/* 1049 */                  if (((AnimatorSet) wc0VarM647b.f18578c) == null) {
/* 1051 */                      arrayList15.add(c0092d);
                            } else {
/* 1055 */                      Fragment fragment4 = c0091c9.f1410c;
/* 1063 */                      if (c0091c9.f1418k.isEmpty()) {
/* 1078 */                          if (c0091c9.f1408a == 3) {
/* 1080 */                              c0091c9.f1416i = z3;
                                    }
/* 1089 */                          c0091c9.f1417j.add(new C0093e(c0092d));
/* 1092 */                          z6 = true;
                                } else if (AbstractC0111w.m674K(i2)) {
/* 1071 */                          Objects.toString(fragment4);
                                }
                            }
                        }
                    }
/* 1103 */          for (C0092d c0092d2 : arrayList15) {
/* 1111 */              C0091c0 c0091c10 = c0092d2.f1425a;
/* 1113 */              Fragment fragment5 = c0091c10.f1410c;
/* 1115 */              if (zIsEmpty) {
/* 1127 */                  if (!z6) {
/* 1146 */                      c0091c10.f1417j.add(new C0090c(c0092d2));
                            } else if (AbstractC0111w.m674K(i2)) {
/* 1135 */                      Objects.toString(fragment5);
                            }
                        } else if (AbstractC0111w.m674K(i2)) {
/* 1123 */                  Objects.toString(fragment5);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m657c(List list) {
/* 1 */             list.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             Iterator it = list.iterator();
/* 17 */            while (it.hasNext()) {
/* 27 */                C2270uw.m9140k(arrayList, ((C0091c0) it.next()).f1418k);
                    }
/* 35 */            List listM6192K = CollectionsKt.m6192K(CollectionsKt.m6195N(arrayList));
/* 39 */            int size = listM6192K.size();
/* 45 */            for (int i = 0; i < size; i++) {
/* 55 */                ((wf2) listM6192K.get(i)).mo642c(this.f1440a);
                    }
/* 61 */            int size2 = list.size();
/* 66 */            for (int i2 = 0; i2 < size2; i2++) {
/* 74 */                m655a((C0091c0) list.get(i2));
                    }
/* 80 */            List listM6192K2 = CollectionsKt.m6192K(list);
/* 84 */            int size3 = listM6192K2.size();
/* 88 */            for (int i3 = 0; i3 < size3; i3++) {
/* 94 */                C0091c0 c0091c0 = (C0091c0) listM6192K2.get(i3);
/* 102 */               if (c0091c0.f1418k.isEmpty()) {
/* 104 */                   c0091c0.m644b();
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m658d(int i, int i2, C0113y c0113y) {
                    synchronized (this.f1441b) {
                        try {
/* 4 */                     Fragment fragment = c0113y.f1526c;
/* 6 */                     fragment.getClass();
/* 9 */                     C0091c0 c0091c0M660g = m660g(fragment);
/* 13 */                    if (c0091c0M660g == null) {
/* 15 */                        Fragment fragment2 = c0113y.f1526c;
/* 28 */                        c0091c0M660g = fragment2.mTransitioning ? m661h(fragment2) : null;
                            }
/* 29 */                    if (c0091c0M660g != null) {
/* 31 */                        c0091c0M660g.m646d(i, i2);
/* 35 */                        return;
                            }
/* 38 */                    final C0091c0 c0091c0 = new C0091c0(i, i2, c0113y);
/* 43 */                    this.f1441b.add(c0091c0);
/* 53 */                    c0091c0.f1411d.add(new Runnable() { // from class: androidx.fragment.app.b0
                                @Override // java.lang.Runnable
                                public final void run() {
/* 1 */                             C0096h c0096h = this.f1405a;
/* 3 */                             ArrayList arrayList = c0096h.f1441b;
/* 5 */                             C0091c0 c0091c1 = c0091c0;
/* 11 */                            if (arrayList.contains(c0091c1)) {
/* 13 */                                int i3 = c0091c1.f1408a;
/* 17 */                                View view = c0091c1.f1410c.mView;
/* 19 */                                view.getClass();
/* 24 */                                fm0.m3775a(i3, view, c0096h.f1440a);
                                    }
                                }
                            });
/* 64 */                    c0091c0.f1411d.add(new o60(this, c0091c0, 1));
                        } catch (Throwable th) {
/* 70 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:78:0x0139  */
                /* JADX INFO: renamed from: e */
                public final void m659e() {
                    boolean z;
                    boolean z2;
/* 3 */             if (this.f1444e) {
/* 5 */                 return;
                    }
/* 13 */            if (!this.f1440a.isAttachedToWindow()) {
/* 15 */                m662i();
/* 18 */                this.f1443d = false;
/* 20 */                return;
                    }
                    synchronized (this.f1441b) {
                        try {
/* 26 */                    boolean zIsEmpty = this.f1441b.isEmpty();
/* 30 */                    ArrayList arrayList = this.f1442c;
/* 33 */                    if (zIsEmpty) {
/* 35 */                        ArrayList<C0091c0> arrayListM6194M = CollectionsKt.m6194M(arrayList);
/* 41 */                        this.f1442c.clear();
/* 52 */                        for (C0091c0 c0091c0 : arrayListM6194M) {
/* 64 */                            if (AbstractC0111w.m674K(2)) {
/* 66 */                                Objects.toString(c0091c0);
                                    }
/* 73 */                            ViewGroup viewGroup = this.f1440a;
/* 75 */                            c0091c0.getClass();
/* 78 */                            viewGroup.getClass();
/* 83 */                            if (!c0091c0.f1412e) {
/* 86 */                                c0091c0.m643a(viewGroup);
                                    }
/* 91 */                            if (!c0091c0.f1413f) {
/* 95 */                                this.f1442c.add(c0091c0);
                                    }
                                }
                            } else {
/* 99 */                        ArrayList arrayListM6194M2 = CollectionsKt.m6194M(arrayList);
/* 105 */                       this.f1442c.clear();
/* 108 */                       Iterator it = arrayListM6194M2.iterator();
                                while (true) {
/* 116 */                           z = true;
/* 117 */                           if (!it.hasNext()) {
                                        break;
                                    }
/* 123 */                           C0091c0 c0091c1 = (C0091c0) it.next();
/* 129 */                           if (AbstractC0111w.m674K(2)) {
/* 131 */                               Objects.toString(c0091c1);
                                    }
/* 134 */                           ViewGroup viewGroup2 = this.f1440a;
/* 138 */                           boolean z3 = c0091c1.f1410c.mTransitioning;
/* 140 */                           viewGroup2.getClass();
/* 145 */                           if (!c0091c1.f1412e) {
/* 148 */                               if (z3) {
/* 150 */                                   c0091c1.f1414g = true;
                                        }
/* 152 */                               c0091c1.m643a(viewGroup2);
                                    }
/* 157 */                           if (!c0091c1.f1413f) {
/* 161 */                               this.f1442c.add(c0091c1);
                                    }
                                }
/* 165 */                       m665m();
/* 170 */                       ArrayList<C0091c0> arrayListM6194M3 = CollectionsKt.m6194M(this.f1441b);
/* 178 */                       if (arrayListM6194M3.isEmpty()) {
/* 181 */                           return;
                                }
/* 184 */                       this.f1441b.clear();
/* 189 */                       this.f1442c.addAll(arrayListM6194M3);
/* 194 */                       m656b(arrayListM6194M3, this.f1443d);
/* 199 */                       e22 e22Var = new e22();
/* 202 */                       e22Var.f7490a = true;
/* 208 */                       boolean z4 = true;
/* 213 */                       for (C0091c0 c0091c2 : arrayListM6194M3) {
/* 227 */                           if (c0091c2.f1418k.isEmpty()) {
/* 265 */                               z2 = false;
                                    } else {
/* 229 */                               ArrayList arrayList2 = c0091c2.f1418k;
/* 231 */                               if (arrayList2 == null || !arrayList2.isEmpty()) {
/* 240 */                                   Iterator it2 = arrayList2.iterator();
                                            while (true) {
/* 248 */                                       if (it2.hasNext()) {
/* 260 */                                           if (!((wf2) it2.next()).mo652a()) {
/* 265 */                                               z2 = false;
                                                    }
                                                }
                                            }
                                        }
/* 263 */                               z2 = true;
                                    }
/* 266 */                           e22Var.f7490a = z2;
/* 272 */                           if (!c0091c2.f1410c.mTransitioning) {
/* 274 */                               z4 = false;
                                    }
                                }
/* 278 */                       if (e22Var.f7490a) {
/* 282 */                           ArrayList arrayList3 = new ArrayList();
/* 285 */                           Iterator it3 = arrayListM6194M3.iterator();
/* 293 */                           while (it3.hasNext()) {
/* 303 */                               C2270uw.m9140k(arrayList3, ((C0091c0) it3.next()).f1418k);
                                    }
/* 311 */                           if (arrayList3.isEmpty()) {
/* 314 */                               z = false;
                                    }
                                } else {
/* 314 */                           z = false;
                                }
/* 315 */                       e22Var.f7490a = z;
/* 317 */                       if (!z4) {
/* 319 */                           m664l(arrayListM6194M3);
/* 322 */                           m657c(arrayListM6194M3);
                                } else if (z) {
/* 328 */                           m664l(arrayListM6194M3);
/* 331 */                           int size = arrayListM6194M3.size();
/* 336 */                           for (int i = 0; i < size; i++) {
/* 344 */                               m655a((C0091c0) arrayListM6194M3.get(i));
                                    }
                                }
/* 350 */                       this.f1443d = false;
                            }
                        } catch (Throwable th) {
/* 355 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final C0091c0 m660g(Fragment fragment) {
                    Object next;
/* 3 */             Iterator it = this.f1441b.iterator();
/* 11 */            while (it.hasNext()) {
/* 13 */                next = it.next();
/* 18 */                C0091c0 c0091c0 = (C0091c0) next;
/* 26 */                if (Intrinsics.m6216a(c0091c0.f1410c, fragment) && !c0091c0.f1412e) {
/* 34 */                    return (C0091c0) next;
                        }
                    }
/* 33 */            next = null;
/* 34 */            return (C0091c0) next;
                }

                /* JADX INFO: renamed from: h */
                public final C0091c0 m661h(Fragment fragment) {
                    Object next;
/* 3 */             Iterator it = this.f1442c.iterator();
/* 11 */            while (it.hasNext()) {
/* 13 */                next = it.next();
/* 18 */                C0091c0 c0091c0 = (C0091c0) next;
/* 26 */                if (Intrinsics.m6216a(c0091c0.f1410c, fragment) && !c0091c0.f1412e) {
/* 34 */                    return (C0091c0) next;
                        }
                    }
/* 33 */            next = null;
/* 34 */            return (C0091c0) next;
                }

                /* JADX INFO: renamed from: i */
                public final void m662i() {
/* 3 */             boolean zIsAttachedToWindow = this.f1440a.isAttachedToWindow();
                    synchronized (this.f1441b) {
                        try {
/* 10 */                    m665m();
/* 15 */                    m664l(this.f1441b);
/* 33 */                    for (C0091c0 c0091c0 : CollectionsKt.m6194M(this.f1442c)) {
/* 45 */                        if (AbstractC0111w.m674K(2)) {
/* 47 */                            if (!zIsAttachedToWindow) {
/* 52 */                                Objects.toString(this.f1440a);
                                    }
/* 55 */                            Objects.toString(c0091c0);
                                }
/* 63 */                        c0091c0.m643a(this.f1440a);
                            }
/* 81 */                    for (C0091c0 c0091c1 : CollectionsKt.m6194M(this.f1441b)) {
/* 93 */                        if (AbstractC0111w.m674K(2)) {
/* 95 */                            if (!zIsAttachedToWindow) {
/* 100 */                               Objects.toString(this.f1440a);
                                    }
/* 103 */                           Objects.toString(c0091c1);
                                }
/* 108 */                       c0091c1.m643a(this.f1440a);
                            }
                        } catch (Throwable th) {
/* 115 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m663k() {
                    Object objPrevious;
                    synchronized (this.f1441b) {
                        try {
/* 4 */                     m665m();
/* 7 */                     ArrayList arrayList = this.f1441b;
/* 13 */                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (true) {
/* 22 */                        if (!listIterator.hasPrevious()) {
/* 100 */                           objPrevious = null;
                                    break;
                                }
/* 24 */                        objPrevious = listIterator.previous();
/* 29 */                        C0091c0 c0091c0 = (C0091c0) objPrevious;
/* 33 */                        View view = c0091c0.f1410c.mView;
/* 35 */                        view.getClass();
/* 46 */                        char c = 4;
/* 47 */                        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
/* 56 */                            int visibility = view.getVisibility();
/* 60 */                            if (visibility == 0) {
/* 90 */                                c = 2;
                                    } else if (visibility != 4) {
/* 66 */                                if (visibility != 8) {
/* 89 */                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
/* 68 */                                c = 3;
                                    }
                                }
/* 93 */                        if (c0091c0.f1408a == 2 && c != 2) {
                                    break;
                                }
                            }
/* 101 */                   C0091c0 c0091c1 = (C0091c0) objPrevious;
/* 105 */                   Fragment fragment = c0091c1 != null ? c0091c1.f1410c : null;
/* 115 */                   this.f1444e = fragment != null ? fragment.isPostponed() : false;
                        } catch (Throwable th) {
/* 120 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m664l(List list) {
/* 1 */             int size = list.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 14 */                C0091c0 c0091c0 = (C0091c0) list.get(i);
/* 16 */                C0113y c0113y = c0091c0.f1419l;
/* 20 */                if (!c0091c0.f1415h) {
/* 24 */                    c0091c0.f1415h = true;
/* 26 */                    int i2 = c0091c0.f1409b;
/* 29 */                    if (i2 == 2) {
/* 31 */                        Fragment fragment = c0113y.f1526c;
/* 33 */                        fragment.getClass();
/* 38 */                        View viewFindFocus = fragment.mView.findFocus();
/* 42 */                        if (viewFindFocus != null) {
/* 44 */                            fragment.setFocusedView(viewFindFocus);
/* 51 */                            if (AbstractC0111w.m674K(2)) {
/* 53 */                                viewFindFocus.toString();
/* 56 */                                fragment.toString();
                                    }
                                }
/* 61 */                        View viewRequireView = c0091c0.f1410c.requireView();
/* 65 */                        viewRequireView.getClass();
/* 73 */                        if (viewRequireView.getParent() == null) {
/* 75 */                            c0113y.m733a();
/* 78 */                            viewRequireView.setAlpha(0.0f);
                                }
/* 87 */                        if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
/* 96 */                            viewRequireView.setVisibility(4);
                                }
/* 103 */                       viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                            } else if (i2 == 3) {
/* 110 */                       Fragment fragment2 = c0113y.f1526c;
/* 112 */                       fragment2.getClass();
/* 115 */                       View viewRequireView2 = fragment2.requireView();
/* 119 */                       viewRequireView2.getClass();
/* 126 */                       if (AbstractC0111w.m674K(2)) {
/* 132 */                           Objects.toString(viewRequireView2.findFocus());
/* 135 */                           viewRequireView2.toString();
/* 138 */                           fragment2.toString();
                                }
/* 141 */                       viewRequireView2.clearFocus();
                            }
                        }
                    }
/* 150 */           ArrayList arrayList = new ArrayList();
/* 153 */           Iterator it = list.iterator();
/* 161 */           while (it.hasNext()) {
/* 171 */               C2270uw.m9140k(arrayList, ((C0091c0) it.next()).f1418k);
                    }
/* 179 */           List listM6192K = CollectionsKt.m6192K(CollectionsKt.m6195N(arrayList));
/* 183 */           int size2 = listM6192K.size();
/* 187 */           for (int i3 = 0; i3 < size2; i3++) {
/* 193 */               wf2 wf2Var = (wf2) listM6192K.get(i3);
/* 195 */               wf2Var.getClass();
/* 198 */               ViewGroup viewGroup = this.f1440a;
/* 200 */               viewGroup.getClass();
/* 205 */               if (!wf2Var.f18606a) {
/* 207 */                   wf2Var.mo649e(viewGroup);
                        }
/* 210 */               wf2Var.f18606a = true;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m665m() {
/* 11 */            for (C0091c0 c0091c0 : this.f1441b) {
/* 21 */                int i = 2;
/* 22 */                if (c0091c0.f1409b == 2) {
/* 26 */                    View viewRequireView = c0091c0.f1410c.requireView();
/* 30 */                    viewRequireView.getClass();
/* 33 */                    int visibility = viewRequireView.getVisibility();
/* 37 */                    if (visibility != 0) {
/* 39 */                        i = 4;
/* 40 */                        if (visibility != 4) {
/* 44 */                            if (visibility != 8) {
/* 54 */                                C1951n4.m6859j(fm0.m3781g(visibility, "Unknown visibility "));
/* 57 */                                return;
                                    }
/* 46 */                            i = 3;
                                }
                            }
/* 59 */                    c0091c0.m646d(i, 1);
                        }
                    }
                }
            }
