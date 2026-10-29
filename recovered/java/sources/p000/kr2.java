            package p000;

            import android.animation.Animator;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.view.WindowId;
            import androidx.transition.Transition;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kr2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public Transition f12991a;

                /* JADX INFO: renamed from: b */
                public ViewGroup f12992b;

                /* JADX WARN: Code duplicated, block: B:104:0x0221  */
                /* JADX WARN: Code duplicated, block: B:106:0x022f  */
                /* JADX WARN: Code duplicated, block: B:110:0x024d  */
                /* JADX WARN: Code duplicated, block: B:134:0x02ad  */
                /* JADX WARN: Code duplicated, block: B:139:0x01f9 A[EDGE_INSN: B:139:0x01f9->B:94:0x01f9 BREAK  A[LOOP:1: B:19:0x0086->B:93:0x01f0], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:14:0x004d  */
                /* JADX WARN: Code duplicated, block: B:167:0x0219 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:170:0x023a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:17:0x0057 A[LOOP:0: B:15:0x0051->B:17:0x0057, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:21:0x008b  */
                /* JADX WARN: Code duplicated, block: B:23:0x008f  */
                /* JADX WARN: Code duplicated, block: B:25:0x0092  */
                /* JADX WARN: Code duplicated, block: B:27:0x0095  */
                /* JADX WARN: Code duplicated, block: B:31:0x009d  */
                /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
                /* JADX WARN: Code duplicated, block: B:50:0x0102  */
                /* JADX WARN: Code duplicated, block: B:52:0x0115  */
                /* JADX WARN: Code duplicated, block: B:64:0x015b  */
                /* JADX WARN: Code duplicated, block: B:66:0x0162  */
                /* JADX WARN: Code duplicated, block: B:68:0x0172  */
                /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
                /* JADX WARN: Code duplicated, block: B:83:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:97:0x0200  */
                /* JADX WARN: Code duplicated, block: B:99:0x020e  */
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ArrayList arrayList;
                    int i;
                    ra2 ra2Var;
                    ra2 ra2Var2;
                    C1024id c1024id;
                    C1024id c1024id2;
                    int i2;
                    int[] iArr;
                    boolean z;
                    int i3;
                    int i4;
                    C1024id c1024idM1081o;
                    int i5;
                    Animator animator;
                    hr2 hr2Var;
                    View view;
                    or2 or2Var;
                    or2 or2Var2;
                    int i6;
                    ra2 ra2Var3;
                    boolean z2;
                    int i7;
                    View view2;
                    or2 or2Var3;
                    C1024id c1024id3;
                    int i8;
                    int i9;
                    View view3;
                    View view4;
                    SparseArray sparseArray;
                    int size;
                    int i10;
                    View view5;
                    View view6;
                    ta1 ta1Var;
                    int iM8756e;
                    int i11;
                    View view7;
                    ra2 ra2Var4;
                    Iterator it;
/* 3 */             Transition transition = this.f12991a;
/* 5 */             ViewGroup viewGroup = this.f12992b;
/* 11 */            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
/* 14 */            viewGroup.removeOnAttachStateChangeListener(this);
/* 23 */            boolean z3 = true;
/* 24 */            if (!lr2.f13464c.remove(viewGroup)) {
/* 23 */                return true;
                    }
/* 27 */            C1024id c1024idM6526b = lr2.m6526b();
/* 36 */            ArrayList arrayList2 = (ArrayList) c1024idM6526b.getOrDefault(viewGroup, null);
/* 38 */            if (arrayList2 != null) {
/* 58 */                arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
/* 61 */                arrayList2.add(transition);
/* 69 */                transition.m1090a(new C2266us(this, c1024idM6526b));
/* 72 */                i = 0;
/* 73 */                transition.m1094h(viewGroup, false);
/* 76 */                if (arrayList != null) {
/* 78 */                    it = arrayList.iterator();
/* 86 */                    while (it.hasNext()) {
/* 94 */                        ((Transition) it.next()).mo1106x(viewGroup);
                            }
                        }
/* 103 */               transition.f1888V = new ArrayList();
/* 110 */               transition.f1889W = new ArrayList();
/* 112 */               ra2Var = transition.f1905i;
/* 114 */               ra2Var2 = transition.f1906v;
/* 122 */               c1024id = new C1024id((C1024id) ra2Var.f15955a);
/* 131 */               c1024id2 = new C1024id((C1024id) ra2Var2.f15955a);
/* 134 */               i2 = 0;
                        while (true) {
/* 135 */                   iArr = transition.f1887U;
/* 138 */                   if (i2 < iArr.length) {
                                break;
                            }
/* 140 */                   i6 = iArr[i2];
/* 142 */                   if (i6 != z3) {
/* 439 */                       ra2Var3 = ra2Var2;
/* 440 */                       z2 = z3;
/* 446 */                       for (i7 = c1024id.f13213c - 1; i7 >= 0; i7--) {
/* 452 */                           view2 = (View) c1024id.m6428h(i7);
/* 454 */                           if (view2 == null && transition.m1102s(view2) && (or2Var3 = (or2) c1024id2.remove(view2)) != null && transition.m1102s(or2Var3.f14873b)) {
/* 486 */                               transition.f1888V.add((or2) c1024id.m6429i(i7));
/* 491 */                               transition.f1889W.add(or2Var3);
                                    }
                                }
                            } else if (i6 != 2) {
/* 148 */                       if (i6 != 3) {
/* 151 */                           if (i6 == 4) {
/* 160 */                               ta1Var = (ta1) ra2Var.f15957c;
/* 164 */                               ta1 ta1Var2 = (ta1) ra2Var2.f15957c;
/* 166 */                               iM8756e = ta1Var.m8756e();
/* 170 */                               i11 = i;
/* 171 */                               while (i11 < iM8756e) {
/* 177 */                                   view7 = (View) ta1Var.m8757f(i11);
/* 179 */                                   if (view7 == null && transition.m1102s(view7)) {
/* 189 */                                       if (ta1Var.f17005a) {
/* 191 */                                           ta1Var.m8753b();
                                                }
/* 196 */                                       ra2Var4 = ra2Var2;
/* 204 */                                       View view8 = (View) ta1Var2.m8754c(ta1Var.f17006b[i11]);
/* 206 */                                       if (view8 != null && transition.m1102s(view8)) {
/* 219 */                                           or2 or2Var4 = (or2) c1024id.getOrDefault(view7, null);
/* 227 */                                           or2 or2Var5 = (or2) c1024id2.getOrDefault(view8, null);
/* 229 */                                           if (or2Var4 != null && or2Var5 != null) {
/* 235 */                                               transition.f1888V.add(or2Var4);
/* 240 */                                               transition.f1889W.add(or2Var5);
/* 243 */                                               c1024id.remove(view7);
/* 246 */                                               c1024id2.remove(view8);
                                                    }
                                                }
                                            } else {
/* 250 */                                       ra2Var4 = ra2Var2;
                                            }
/* 252 */                                   i11++;
/* 254 */                                   ra2Var2 = ra2Var4;
                                        }
                                    }
/* 153 */                           ra2Var3 = ra2Var2;
                                } else {
/* 263 */                           sparseArray = (SparseArray) ra2Var.f15956b;
/* 265 */                           ra2Var3 = ra2Var2;
/* 269 */                           SparseArray sparseArray2 = (SparseArray) ra2Var3.f15956b;
/* 271 */                           size = sparseArray.size();
/* 275 */                           i10 = 0;
/* 276 */                           while (i10 < size) {
/* 282 */                               view5 = (View) sparseArray.valueAt(i10);
/* 284 */                               if (view5 == null && transition.m1102s(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && transition.m1102s(view6)) {
/* 315 */                                   or2 or2Var6 = (or2) c1024id.getOrDefault(view5, null);
/* 323 */                                   or2 or2Var7 = (or2) c1024id2.getOrDefault(view6, null);
/* 325 */                                   if (or2Var6 != null && or2Var7 != null) {
/* 333 */                                       transition.f1888V.add(or2Var6);
/* 338 */                                       transition.f1889W.add(or2Var7);
/* 341 */                                       c1024id.remove(view5);
/* 344 */                                       c1024id2.remove(view6);
                                            }
                                        }
/* 350 */                               i10++;
/* 352 */                               z3 = z3;
                                    }
                                }
/* 154 */                       z2 = z3;
                            } else {
/* 355 */                       ra2Var3 = ra2Var2;
/* 356 */                       z2 = z3;
/* 360 */                       c1024id3 = (C1024id) ra2Var.f15958d;
/* 364 */                       C1024id c1024id4 = (C1024id) ra2Var3.f15958d;
/* 366 */                       i8 = c1024id3.f13213c;
/* 369 */                       for (i9 = 0; i9 < i8; i9++) {
/* 375 */                           view3 = (View) c1024id3.m6430j(i9);
/* 377 */                           if (view3 == null && transition.m1102s(view3) && (view4 = (View) c1024id4.getOrDefault(c1024id3.m6428h(i9), null)) != null && transition.m1102s(view4)) {
/* 408 */                               or2 or2Var8 = (or2) c1024id.getOrDefault(view3, null);
/* 414 */                               or2 or2Var9 = (or2) c1024id2.getOrDefault(view4, null);
/* 416 */                               if (or2Var8 != null && or2Var9 != null) {
/* 422 */                                   transition.f1888V.add(or2Var8);
/* 427 */                                   transition.f1889W.add(or2Var9);
/* 430 */                                   c1024id.remove(view3);
/* 433 */                                   c1024id2.remove(view4);
                                        }
                                    }
                                }
                            }
/* 497 */                   i2++;
/* 499 */                   ra2Var2 = ra2Var3;
/* 500 */                   z3 = z2;
/* 502 */                   i = 0;
                        }
/* 506 */               z = z3;
/* 511 */               for (i3 = 0; i3 < c1024id.f13213c; i3++) {
/* 517 */                   or2Var2 = (or2) c1024id.m6430j(i3);
/* 525 */                   if (transition.m1102s(or2Var2.f14873b)) {
/* 529 */                       transition.f1888V.add(or2Var2);
/* 535 */                       transition.f1889W.add(null);
                            }
                        }
/* 544 */               for (i4 = 0; i4 < c1024id2.f13213c; i4++) {
/* 550 */                   or2Var = (or2) c1024id2.m6430j(i4);
/* 558 */                   if (transition.m1102s(or2Var.f14873b)) {
/* 562 */                       transition.f1889W.add(or2Var);
/* 568 */                       transition.f1888V.add(null);
                            }
                        }
/* 574 */               c1024idM1081o = Transition.m1081o();
/* 578 */               int i12 = c1024idM1081o.f13213c;
/* 580 */               n53 n53Var = l53.f13119a;
/* 582 */               WindowId windowId = viewGroup.getWindowId();
/* 586 */               i5 = i12 - 1;
/* 588 */               while (i5 >= 0) {
/* 594 */                   animator = (Animator) c1024idM1081o.m6428h(i5);
/* 596 */                   if (animator == null && (hr2Var = (hr2) c1024idM1081o.getOrDefault(animator, null)) != null && (view = hr2Var.f9212a) != null && hr2Var.f9215d.f17409a.equals(windowId)) {
/* 621 */                       or2 or2Var10 = hr2Var.f9214c;
/* 623 */                       boolean z4 = z;
/* 625 */                       or2 or2VarM1100q = transition.m1100q(view, z4);
/* 629 */                       or2 or2VarM1099n = transition.m1099n(view, z4);
/* 633 */                       if (or2VarM1100q == null && or2VarM1099n == null) {
/* 649 */                           or2VarM1099n = (or2) ((C1024id) transition.f1906v.f15955a).getOrDefault(view, null);
                                }
/* 653 */                       if ((or2VarM1100q != null || or2VarM1099n != null) && hr2Var.f9216e.mo1101r(or2Var10, or2VarM1099n)) {
/* 669 */                           if (animator.isRunning() || animator.isStarted()) {
/* 682 */                               animator.cancel();
                                    } else {
/* 678 */                               c1024idM1081o.remove(animator);
                                    }
                                }
                            }
/* 687 */                   i5--;
/* 689 */                   z = true;
                        }
/* 706 */               transition.mo1097l(viewGroup, transition.f1905i, transition.f1906v, transition.f1888V, transition.f1889W);
/* 709 */               transition.mo1107y();
/* 712 */               return true;
                    }
/* 42 */            arrayList2 = new ArrayList();
/* 45 */            c1024idM6526b.put(viewGroup, arrayList2);
/* 61 */            arrayList2.add(transition);
/* 69 */            transition.m1090a(new C2266us(this, c1024idM6526b));
/* 72 */            i = 0;
/* 73 */            transition.m1094h(viewGroup, false);
/* 76 */            if (arrayList != null) {
/* 78 */                it = arrayList.iterator();
/* 86 */                while (it.hasNext()) {
/* 94 */                    ((Transition) it.next()).mo1106x(viewGroup);
                        }
                    }
/* 103 */           transition.f1888V = new ArrayList();
/* 110 */           transition.f1889W = new ArrayList();
/* 112 */           ra2Var = transition.f1905i;
/* 114 */           ra2Var2 = transition.f1906v;
/* 122 */           c1024id = new C1024id((C1024id) ra2Var.f15955a);
/* 131 */           c1024id2 = new C1024id((C1024id) ra2Var2.f15955a);
/* 134 */           i2 = 0;
                    while (true) {
/* 135 */               iArr = transition.f1887U;
/* 138 */               if (i2 < iArr.length) {
                            break;
                            break;
                        }
/* 140 */               i6 = iArr[i2];
/* 142 */               if (i6 != z3) {
/* 439 */                   ra2Var3 = ra2Var2;
/* 440 */                   z2 = z3;
/* 446 */                   while (i7 >= 0) {
/* 452 */                       view2 = (View) c1024id.m6428h(i7);
/* 454 */                       if (view2 == null) {
                                }
                            }
                        } else if (i6 != 2) {
/* 148 */                   if (i6 != 3) {
/* 151 */                       if (i6 == 4) {
/* 160 */                           ta1Var = (ta1) ra2Var.f15957c;
/* 164 */                           ta1 ta1Var3 = (ta1) ra2Var2.f15957c;
/* 166 */                           iM8756e = ta1Var.m8756e();
/* 170 */                           i11 = i;
/* 171 */                           while (i11 < iM8756e) {
/* 177 */                               view7 = (View) ta1Var.m8757f(i11);
/* 179 */                               if (view7 == null) {
/* 250 */                                   ra2Var4 = ra2Var2;
                                        } else {
/* 250 */                                   ra2Var4 = ra2Var2;
                                        }
/* 252 */                               i11++;
/* 254 */                               ra2Var2 = ra2Var4;
                                    }
                                }
/* 153 */                       ra2Var3 = ra2Var2;
                            } else {
/* 263 */                       sparseArray = (SparseArray) ra2Var.f15956b;
/* 265 */                       ra2Var3 = ra2Var2;
/* 269 */                       SparseArray sparseArray3 = (SparseArray) ra2Var3.f15956b;
/* 271 */                       size = sparseArray.size();
/* 275 */                       i10 = 0;
/* 276 */                       while (i10 < size) {
/* 282 */                           view5 = (View) sparseArray.valueAt(i10);
/* 284 */                           if (view5 == null) {
                                    }
/* 350 */                           i10++;
/* 352 */                           z3 = z3;
                                }
                            }
/* 154 */                   z2 = z3;
                        } else {
/* 355 */                   ra2Var3 = ra2Var2;
/* 356 */                   z2 = z3;
/* 360 */                   c1024id3 = (C1024id) ra2Var.f15958d;
/* 364 */                   C1024id c1024id5 = (C1024id) ra2Var3.f15958d;
/* 366 */                   i8 = c1024id3.f13213c;
/* 369 */                   while (i9 < i8) {
/* 375 */                       view3 = (View) c1024id3.m6430j(i9);
/* 377 */                       if (view3 == null) {
                                }
                            }
                        }
/* 497 */               i2++;
/* 499 */               ra2Var2 = ra2Var3;
/* 500 */               z3 = z2;
/* 502 */               i = 0;
                    }
/* 506 */           z = z3;
/* 511 */           while (i3 < c1024id.f13213c) {
/* 517 */               or2Var2 = (or2) c1024id.m6430j(i3);
/* 525 */               if (transition.m1102s(or2Var2.f14873b)) {
/* 529 */                   transition.f1888V.add(or2Var2);
/* 535 */                   transition.f1889W.add(null);
                        }
                    }
/* 544 */           while (i4 < c1024id2.f13213c) {
/* 550 */               or2Var = (or2) c1024id2.m6430j(i4);
/* 558 */               if (transition.m1102s(or2Var.f14873b)) {
/* 562 */                   transition.f1889W.add(or2Var);
/* 568 */                   transition.f1888V.add(null);
                        }
                    }
/* 574 */           c1024idM1081o = Transition.m1081o();
/* 578 */           int i13 = c1024idM1081o.f13213c;
/* 580 */           n53 n53Var2 = l53.f13119a;
/* 582 */           WindowId windowId2 = viewGroup.getWindowId();
/* 586 */           i5 = i13 - 1;
/* 588 */           while (i5 >= 0) {
/* 594 */               animator = (Animator) c1024idM1081o.m6428h(i5);
/* 596 */               if (animator == null) {
                        }
/* 687 */               i5--;
/* 689 */               z = true;
                    }
/* 706 */           transition.mo1097l(viewGroup, transition.f1905i, transition.f1906v, transition.f1888V, transition.f1889W);
/* 709 */           transition.mo1107y();
/* 712 */           return true;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             ViewGroup viewGroup = this.f12992b;
/* 7 */             viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
/* 10 */            viewGroup.removeOnAttachStateChangeListener(this);
/* 15 */            lr2.f13464c.remove(viewGroup);
/* 27 */            ArrayList arrayList = (ArrayList) lr2.m6526b().getOrDefault(viewGroup, null);
/* 29 */            if (arrayList != null && arrayList.size() > 0) {
/* 37 */                Iterator it = arrayList.iterator();
/* 45 */                while (it.hasNext()) {
/* 53 */                    ((Transition) it.next()).mo1106x(viewGroup);
                        }
                    }
/* 60 */            this.f12991a.m1095i(true);
                }
            }
