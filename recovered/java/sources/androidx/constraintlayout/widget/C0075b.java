            package androidx.constraintlayout.widget;

            import android.view.View;
            import android.view.ViewGroup;
            import androidx.core.app.NotificationCompat;
            import p000.C2051oz;
            import p000.C2332wi;
            import p000.C2569zz;
            import p000.EnumC2516yz;
            import p000.InterfaceC2462xi;
            import p000.a00;
            import p000.kb1;
            import p000.y53;
            
            /* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0075b implements InterfaceC2462xi {

                /* JADX INFO: renamed from: a */
                public final ConstraintLayout f1168a;

                /* JADX INFO: renamed from: b */
                public int f1169b;

                /* JADX INFO: renamed from: c */
                public int f1170c;

                /* JADX INFO: renamed from: d */
                public int f1171d;

                /* JADX INFO: renamed from: e */
                public int f1172e;

                /* JADX INFO: renamed from: f */
                public int f1173f;

                /* JADX INFO: renamed from: g */
                public int f1174g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ConstraintLayout f1175h;

                public C0075b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
/* 4 */             this.f1175h = constraintLayout;
/* 6 */             this.f1168a = constraintLayout2;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m523a(int i, int i2, int i3) {
/* 1 */             if (i == i2) {
/* 31 */                return true;
                    }
/* 4 */             int mode = View.MeasureSpec.getMode(i);
/* 8 */             View.MeasureSpec.getSize(i);
/* 11 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 15 */            int size = View.MeasureSpec.getSize(i2);
/* 21 */            if (mode2 == 1073741824) {
                        return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
                    }
/* 33 */            return false;
                }

                /* JADX INFO: renamed from: b */
                public final void m524b(C2569zz c2569zz, C2332wi c2332wi) {
                    int iMakeMeasureSpec;
                    int iMakeMeasureSpec2;
                    int iMax;
                    int iMax2;
                    boolean z;
                    int baseline;
                    int i;
/* 7 */             if (c2569zz == null) {
/* 464 */               return;
                    }
/* 11 */            C2051oz c2051oz = c2569zz.f20406L;
/* 13 */            C2051oz c2051oz2 = c2569zz.f20404J;
/* 20 */            if (c2569zz.f20438i0 == 8 && !c2569zz.f20400F) {
/* 26 */                c2332wi.f18641e = 0;
/* 28 */                c2332wi.f18642f = 0;
/* 30 */                c2332wi.f18643g = 0;
/* 32 */                return;
                    }
/* 35 */            if (c2569zz.f20416V == null) {
/* 464 */               return;
                    }
/* 39 */            EnumC2516yz enumC2516yz = c2332wi.f18637a;
/* 41 */            EnumC2516yz enumC2516yz2 = c2332wi.f18638b;
/* 43 */            int i2 = c2332wi.f18639c;
/* 45 */            int i3 = c2332wi.f18640d;
/* 51 */            int i4 = this.f1169b + this.f1170c;
/* 52 */            int i5 = this.f1171d;
/* 54 */            View view = c2569zz.f20436h0;
/* 56 */            int iOrdinal = enumC2516yz.ordinal();
/* 63 */            if (iOrdinal == 0) {
/* 170 */               iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                    } else if (iOrdinal == 1) {
/* 163 */               iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1173f, i5, -2);
                    } else if (iOrdinal == 2) {
/* 97 */                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1173f, i5, -2);
/* 107 */               boolean z2 = c2569zz.f20455r == 1;
/* 108 */               int i6 = c2332wi.f18646j;
/* 110 */               if (i6 == 1 || i6 == 2) {
/* 126 */                   boolean z3 = view.getMeasuredHeight() == c2569zz.m10472l();
/* 129 */                   if (c2332wi.f18646j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || c2569zz.mo1422B())) {
/* 153 */                       iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c2569zz.m10475r(), 1073741824);
                            }
                        }
                    } else if (iOrdinal != 3) {
/* 71 */                iMakeMeasureSpec = 0;
                    } else {
/* 74 */                int i7 = this.f1173f;
/* 81 */                int i8 = c2051oz2 != null ? c2051oz2.f14930g : 0;
/* 82 */                if (c2051oz != null) {
/* 86 */                    i8 += c2051oz.f14930g;
                        }
/* 89 */                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
                    }
/* 174 */           int iOrdinal2 = enumC2516yz2.ordinal();
/* 178 */           if (iOrdinal2 == 0) {
/* 290 */               iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else if (iOrdinal2 == 1) {
/* 283 */               iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1174g, i4, -2);
                    } else if (iOrdinal2 == 2) {
/* 217 */               iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1174g, i4, -2);
/* 227 */               boolean z4 = c2569zz.f20457s == 1;
/* 228 */               int i9 = c2332wi.f18646j;
/* 230 */               if (i9 == 1 || i9 == 2) {
/* 246 */                   boolean z5 = view.getMeasuredWidth() == c2569zz.m10475r();
/* 249 */                   if (c2332wi.f18646j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || c2569zz.mo1423C())) {
/* 273 */                       iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2569zz.m10472l(), 1073741824);
                            }
                        }
                    } else if (iOrdinal2 != 3) {
/* 187 */               iMakeMeasureSpec2 = 0;
                    } else {
/* 190 */               int i10 = this.f1174g;
/* 199 */               int i11 = c2051oz2 != null ? c2569zz.f20405K.f14930g : 0;
/* 200 */               if (c2051oz != null) {
/* 206 */                   i11 += c2569zz.f20407M.f14930g;
                        }
/* 209 */               iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
                    }
/* 296 */           a00 a00Var = (a00) c2569zz.f20416V;
/* 298 */           ConstraintLayout constraintLayout = this.f1175h;
/* 300 */           if (a00Var != null && kb1.m6029B(constraintLayout.f1069w, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == c2569zz.m10475r() && view.getMeasuredWidth() < a00Var.m10475r() && view.getMeasuredHeight() == c2569zz.m10472l() && view.getMeasuredHeight() < a00Var.m10472l() && view.getBaseline() == c2569zz.f20426c0 && !c2569zz.m10455A() && m523a(c2569zz.f20402H, iMakeMeasureSpec, c2569zz.m10475r()) && m523a(c2569zz.f20403I, iMakeMeasureSpec2, c2569zz.m10472l())) {
/* 394 */               c2332wi.f18641e = c2569zz.m10475r();
/* 400 */               c2332wi.f18642f = c2569zz.m10472l();
/* 404 */               c2332wi.f18643g = c2569zz.f20426c0;
/* 406 */               return;
                    }
/* 407 */           EnumC2516yz enumC2516yz3 = EnumC2516yz.f19867c;
/* 413 */           boolean z6 = enumC2516yz == enumC2516yz3;
/* 418 */           boolean z7 = enumC2516yz2 == enumC2516yz3;
/* 419 */           EnumC2516yz enumC2516yz4 = EnumC2516yz.f19865a;
/* 421 */           EnumC2516yz enumC2516yz5 = EnumC2516yz.f19868d;
/* 430 */           boolean z8 = enumC2516yz2 == enumC2516yz5 || enumC2516yz2 == enumC2516yz4;
/* 438 */           boolean z9 = enumC2516yz == enumC2516yz5 || enumC2516yz == enumC2516yz4;
/* 450 */           boolean z10 = z6 && c2569zz.f20419Y > 0.0f;
/* 461 */           boolean z11 = z7 && c2569zz.f20419Y > 0.0f;
/* 462 */           if (view == null) {
/* 464 */               return;
                    }
/* 469 */           ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
/* 471 */           int i12 = c2332wi.f18646j;
/* 473 */           if (i12 != 1 && i12 != 2 && z6 && c2569zz.f20455r == 0 && z7 && c2569zz.f20457s == 0) {
/* 490 */               i = -1;
/* 491 */               z = false;
/* 492 */               baseline = 0;
/* 493 */               iMax = 0;
/* 494 */               iMax2 = 0;
                    } else {
/* 499 */               if ((view instanceof VirtualLayout) && (c2569zz instanceof y53)) {
/* 511 */                   ((VirtualLayout) view).mo459r((y53) c2569zz, iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
/* 515 */                   view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
/* 518 */               c2569zz.f20402H = iMakeMeasureSpec;
/* 520 */               c2569zz.f20403I = iMakeMeasureSpec2;
/* 523 */               c2569zz.f20433g = false;
/* 525 */               int measuredWidth = view.getMeasuredWidth();
/* 529 */               int measuredHeight = view.getMeasuredHeight();
/* 533 */               int baseline2 = view.getBaseline();
/* 537 */               int i13 = c2569zz.f20461u;
/* 546 */               iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
/* 547 */               int i14 = c2569zz.f20462v;
/* 549 */               if (i14 > 0) {
/* 551 */                   iMax = Math.min(i14, iMax);
                        }
/* 555 */               int i15 = c2569zz.f20464x;
/* 566 */               iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
/* 563 */               int i16 = iMakeMeasureSpec2;
/* 568 */               int i17 = c2569zz.f20465y;
/* 570 */               if (i17 > 0) {
/* 572 */                   iMax2 = Math.min(i17, iMax2);
                        }
/* 583 */               if (!kb1.m6029B(constraintLayout.f1069w, 1)) {
/* 587 */                   if (z10 && z8) {
/* 596 */                       iMax = (int) ((iMax2 * c2569zz.f20419Y) + 0.5f);
                            } else if (z11 && z9) {
/* 608 */                       iMax2 = (int) ((iMax / c2569zz.f20419Y) + 0.5f);
                            }
                        }
/* 610 */               if (measuredWidth == iMax && measuredHeight == iMax2) {
/* 615 */                   baseline = baseline2;
/* 616 */                   i = -1;
/* 617 */                   z = false;
                        } else {
/* 621 */                   if (measuredWidth != iMax) {
/* 623 */                       iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                            }
/* 634 */                   int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
/* 636 */                   view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
/* 639 */                   c2569zz.f20402H = iMakeMeasureSpec;
/* 641 */                   c2569zz.f20403I = iMakeMeasureSpec3;
/* 643 */                   z = false;
/* 644 */                   c2569zz.f20433g = false;
/* 646 */                   int measuredWidth2 = view.getMeasuredWidth();
/* 650 */                   int measuredHeight2 = view.getMeasuredHeight();
/* 654 */                   baseline = view.getBaseline();
/* 658 */                   iMax = measuredWidth2;
/* 659 */                   iMax2 = measuredHeight2;
/* 660 */                   i = -1;
                        }
                    }
/* 665 */           boolean z12 = baseline != i ? true : z;
/* 678 */           c2332wi.f18645i = (iMax == c2332wi.f18639c && iMax2 == c2332wi.f18640d) ? z : true;
/* 686 */           boolean z13 = layoutParams.f1101c0 ? true : z12;
/* 687 */           if (z13 && baseline != -1 && c2569zz.f20426c0 != baseline) {
/* 697 */               c2332wi.f18645i = true;
                    }
/* 699 */           c2332wi.f18641e = iMax;
/* 701 */           c2332wi.f18642f = iMax2;
/* 703 */           c2332wi.f18644h = z13;
/* 705 */           c2332wi.f18643g = baseline;
                }
            }
