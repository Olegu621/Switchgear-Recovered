            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.viewpager2.widget.ViewPager2;
            import java.lang.reflect.Array;
            import java.util.Arrays;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d82 extends r12 {

                /* JADX INFO: renamed from: a */
                public g43 f7042a;

                /* JADX INFO: renamed from: b */
                public final ViewPager2 f7043b;

                /* JADX INFO: renamed from: c */
                public final m43 f7044c;

                /* JADX INFO: renamed from: d */
                public final LinearLayoutManager f7045d;

                /* JADX INFO: renamed from: e */
                public int f7046e;

                /* JADX INFO: renamed from: f */
                public int f7047f;

                /* JADX INFO: renamed from: g */
                public final c82 f7048g;

                /* JADX INFO: renamed from: h */
                public int f7049h;

                /* JADX INFO: renamed from: i */
                public int f7050i;

                /* JADX INFO: renamed from: j */
                public boolean f7051j;

                /* JADX INFO: renamed from: k */
                public boolean f7052k;

                /* JADX INFO: renamed from: l */
                public boolean f7053l;

                public d82(ViewPager2 viewPager2) {
/* 4 */             this.f7043b = viewPager2;
/* 6 */             m43 m43Var = viewPager2.f2007U;
/* 8 */             this.f7044c = m43Var;
/* 16 */            this.f7045d = (LinearLayoutManager) m43Var.getLayoutManager();
/* 23 */            this.f7048g = new c82();
/* 25 */            m2963d();
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: a */
                public final void mo2309a(RecyclerView recyclerView, int i) {
                    g43 g43Var;
                    g43 g43Var2;
/* 1 */             int i2 = this.f7046e;
/* 5 */             if (!(i2 == 1 && this.f7047f == 1) && i == 1) {
/* 13 */                this.f7046e = 1;
/* 15 */                int i3 = this.f7050i;
/* 17 */                if (i3 != -1) {
/* 19 */                    this.f7049h = i3;
/* 21 */                    this.f7050i = -1;
                        } else if (this.f7049h == -1) {
/* 34 */                    this.f7049h = this.f7045d.m812V0();
                        }
/* 36 */                m2962c(1);
/* 39 */                return;
                    }
/* 42 */            if ((i2 == 1 || i2 == 4) && i == 2) {
/* 50 */                if (this.f7052k) {
/* 52 */                    m2962c(2);
/* 55 */                    this.f7051j = true;
/* 57 */                    return;
                        }
/* 149 */               return;
                    }
/* 58 */            c82 c82Var = this.f7048g;
/* 61 */            if ((i2 == 1 || i2 == 4) && i == 0) {
/* 67 */                m2964e();
/* 72 */                if (!this.f7052k) {
/* 74 */                    int i4 = c82Var.f2764a;
/* 76 */                    if (i4 != -1 && (g43Var2 = this.f7042a) != null) {
/* 83 */                        g43Var2.mo3872b(i4, 0.0f, 0);
                            }
                        } else if (c82Var.f2766c == 0) {
/* 91 */                    int i5 = this.f7049h;
/* 93 */                    int i6 = c82Var.f2764a;
/* 95 */                    if (i5 != i6 && (g43Var = this.f7042a) != null) {
/* 101 */                       g43Var.mo3873c(i6);
                            }
                        }
/* 104 */               m2962c(0);
/* 107 */               m2963d();
                    }
/* 112 */           if (this.f7046e == 2 && i == 0 && this.f7053l) {
/* 120 */               m2964e();
/* 125 */               if (c82Var.f2766c == 0) {
/* 127 */                   int i7 = this.f7050i;
/* 129 */                   int i8 = c82Var.f2764a;
/* 131 */                   if (i7 != i8) {
/* 133 */                       if (i8 == -1) {
/* 135 */                           i8 = 0;
                                }
/* 136 */                       g43 g43Var3 = this.f7042a;
/* 138 */                       if (g43Var3 != null) {
/* 140 */                           g43Var3.mo3873c(i8);
                                }
                            }
/* 143 */                   m2962c(0);
/* 146 */                   m2963d();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0028  */
                /* JADX WARN: Code duplicated, block: B:17:0x002c  */
                @Override // p000.r12
                /* JADX INFO: renamed from: b */
                public final void mo2310b(RecyclerView recyclerView, int i, int i2) {
                    int i3;
                    g43 g43Var;
/* 2 */             this.f7052k = true;
/* 4 */             m2964e();
/* 7 */             boolean z = this.f7051j;
/* 10 */            c82 c82Var = this.f7048g;
/* 13 */            if (z) {
/* 15 */                this.f7051j = false;
/* 17 */                if (i2 <= 0) {
/* 19 */                    if (i2 == 0) {
/* 39 */                        if ((i < 0) == (this.f7043b.f2024i.m989N() == 1)) {
/* 43 */                            if (c82Var.f2766c != 0) {
/* 47 */                                i3 = c82Var.f2764a + 1;
                                    }
                                }
                            }
/* 49 */                    i3 = c82Var.f2764a;
                        } else if (c82Var.f2766c != 0) {
/* 47 */                    i3 = c82Var.f2764a + 1;
                        } else {
/* 49 */                    i3 = c82Var.f2764a;
                        }
/* 51 */                this.f7050i = i3;
/* 55 */                if (this.f7049h != i3 && (g43Var = this.f7042a) != null) {
/* 61 */                    g43Var.mo3873c(i3);
                        }
                    } else if (this.f7046e == 0) {
/* 69 */                int i4 = c82Var.f2764a;
/* 71 */                if (i4 == -1) {
/* 73 */                    i4 = 0;
                        }
/* 74 */                g43 g43Var2 = this.f7042a;
/* 76 */                if (g43Var2 != null) {
/* 78 */                    g43Var2.mo3873c(i4);
                        }
                    }
/* 81 */            int i5 = c82Var.f2764a;
/* 83 */            if (i5 == -1) {
/* 85 */                i5 = 0;
                    }
/* 86 */            float f = c82Var.f2765b;
/* 88 */            int i6 = c82Var.f2766c;
/* 90 */            g43 g43Var3 = this.f7042a;
/* 92 */            if (g43Var3 != null) {
/* 94 */                g43Var3.mo3872b(i5, f, i6);
                    }
/* 97 */            int i7 = c82Var.f2764a;
/* 99 */            int i8 = this.f7050i;
/* 101 */           if ((i7 == i8 || i8 == -1) && c82Var.f2766c == 0 && this.f7047f != 1) {
/* 113 */               m2962c(0);
/* 116 */               m2963d();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2962c(int i) {
/* 4 */             if ((this.f7046e == 3 && this.f7047f == 0) || this.f7047f == i) {
/* 25 */                return;
                    }
/* 16 */            this.f7047f = i;
/* 18 */            g43 g43Var = this.f7042a;
/* 20 */            if (g43Var != null) {
/* 22 */                g43Var.mo3871a(i);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m2963d() {
/* 2 */             this.f7046e = 0;
/* 4 */             this.f7047f = 0;
/* 6 */             c82 c82Var = this.f7048g;
/* 9 */             c82Var.f2764a = -1;
/* 12 */            c82Var.f2765b = 0.0f;
/* 14 */            c82Var.f2766c = 0;
/* 16 */            this.f7049h = -1;
/* 18 */            this.f7050i = -1;
/* 20 */            this.f7051j = false;
/* 22 */            this.f7052k = false;
/* 24 */            this.f7053l = false;
                }

                /* JADX WARN: Code duplicated, block: B:61:0x0130  */
                /* JADX WARN: Code duplicated, block: B:65:0x013c  */
                /* JADX WARN: Code duplicated, block: B:67:0x0146 A[LOOP:2: B:64:0x013a->B:67:0x0146, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:82:0x0149 A[SYNTHETIC] */
                /* JADX INFO: renamed from: e */
                public final void m2964e() {
                    int top;
                    int iM986G;
                    int top2;
                    int i;
                    int bottom;
                    int i2;
/* 1 */             LinearLayoutManager linearLayoutManager = this.f7045d;
/* 3 */             int iM812V0 = linearLayoutManager.m812V0();
/* 7 */             c82 c82Var = this.f7048g;
/* 9 */             c82Var.f2764a = iM812V0;
/* 14 */            if (iM812V0 == -1) {
/* 16 */                c82Var.f2764a = -1;
/* 18 */                c82Var.f2765b = 0.0f;
/* 20 */                c82Var.f2766c = 0;
/* 22 */                return;
                    }
/* 23 */            View viewMo799B = linearLayoutManager.mo799B(iM812V0);
/* 27 */            if (viewMo799B == null) {
/* 29 */                c82Var.f2764a = -1;
/* 31 */                c82Var.f2765b = 0.0f;
/* 33 */                c82Var.f2766c = 0;
/* 35 */                return;
                    }
/* 44 */            int i3 = ((RecyclerView.LayoutParams) viewMo799B.getLayoutParams()).f1682b.left;
/* 54 */            int i4 = ((RecyclerView.LayoutParams) viewMo799B.getLayoutParams()).f1682b.right;
/* 64 */            int i5 = ((RecyclerView.LayoutParams) viewMo799B.getLayoutParams()).f1682b.top;
/* 74 */            int i6 = ((RecyclerView.LayoutParams) viewMo799B.getLayoutParams()).f1682b.bottom;
/* 76 */            ViewGroup.LayoutParams layoutParams = viewMo799B.getLayoutParams();
/* 82 */            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 84 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 88 */                i3 += marginLayoutParams.leftMargin;
/* 91 */                i4 += marginLayoutParams.rightMargin;
/* 94 */                i5 += marginLayoutParams.topMargin;
/* 97 */                i6 += marginLayoutParams.bottomMargin;
                    }
/* 103 */           int height = viewMo799B.getHeight() + i5 + i6;
/* 109 */           int width = viewMo799B.getWidth() + i3 + i4;
/* 110 */           int i7 = linearLayoutManager.f1586a0;
/* 113 */           m43 m43Var = this.f7044c;
/* 115 */           if (i7 == 0) {
/* 126 */               top = (viewMo799B.getLeft() - i3) - m43Var.getPaddingLeft();
/* 135 */               if (this.f7043b.f2024i.m989N() == 1) {
/* 137 */                   top = -top;
                        }
/* 138 */               height = width;
                    } else {
/* 149 */               top = (viewMo799B.getTop() - i5) - m43Var.getPaddingTop();
                    }
/* 151 */           int i8 = -top;
/* 152 */           c82Var.f2766c = i8;
/* 154 */           if (i8 >= 0) {
/* 357 */               c82Var.f2765b = height != 0 ? i8 / height : 0.0f;
/* 359 */               return;
                    }
/* 158 */           int iM986G2 = linearLayoutManager.m986G();
/* 162 */           if (iM986G2 != 0) {
/* 172 */               boolean z = linearLayoutManager.f1586a0 == 0;
/* 186 */               int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM986G2, 2);
/* 189 */               for (int i9 = 0; i9 < iM986G2; i9++) {
/* 191 */                   View viewM984F = linearLayoutManager.m984F(i9);
/* 195 */                   if (viewM984F == null) {
/* 257 */                       f42.m3656l("null view contained in the view hierarchy");
/* 260 */                       return;
                            }
/* 197 */                   ViewGroup.LayoutParams layoutParams2 = viewM984F.getLayoutParams();
/* 208 */                   ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C2135r8.f15911a;
/* 210 */                   int[] iArr2 = iArr[i9];
/* 212 */                   if (z) {
/* 214 */                       top2 = viewM984F.getLeft();
/* 218 */                       i = marginLayoutParams2.leftMargin;
                            } else {
/* 222 */                       top2 = viewM984F.getTop();
/* 226 */                       i = marginLayoutParams2.topMargin;
                            }
/* 229 */                   iArr2[0] = top2 - i;
/* 231 */                   int[] iArr3 = iArr[i9];
/* 233 */                   if (z) {
/* 235 */                       bottom = viewM984F.getRight();
/* 239 */                       i2 = marginLayoutParams2.rightMargin;
                            } else {
/* 243 */                       bottom = viewM984F.getBottom();
/* 247 */                       i2 = marginLayoutParams2.bottomMargin;
                            }
/* 250 */                   iArr3[1] = bottom + i2;
                        }
/* 266 */               Arrays.sort(iArr, new wa3(1));
/* 269 */               int i10 = 1;
                        while (true) {
/* 270 */                   if (i10 >= iM986G2) {
/* 288 */                       int[] iArr4 = iArr[0];
/* 290 */                       int i11 = iArr4[1];
/* 292 */                       int i12 = iArr4[0];
/* 294 */                       int i13 = i11 - i12;
/* 295 */                       if (i12 <= 0 && iArr[iM986G2 - 1][1] >= i13) {
/* 309 */                           if (linearLayoutManager.m986G() <= 1) {
                                    }
                                }
                            } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
/* 285 */                       i10++;
                            }
/* 311 */                   iM986G = linearLayoutManager.m986G();
/* 315 */                   for (int i14 = 0; i14 < iM986G; i14++) {
/* 325 */                       if (!C2135r8.m8079a(linearLayoutManager.m984F(i14))) {
/* 332 */                           f42.m3656l("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
/* 335 */                           return;
                                }
                            }
                        }
                    } else if (linearLayoutManager.m986G() <= 1) {
/* 311 */               iM986G = linearLayoutManager.m986G();
/* 315 */               while (i14 < iM986G) {
/* 325 */                   if (!C2135r8.m8079a(linearLayoutManager.m984F(i14))) {
/* 332 */                       f42.m3656l("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
/* 335 */                       return;
                            }
                        }
                    }
/* 336 */           Locale locale = Locale.US;
/* 346 */           f42.m3656l(fm0.m3781g(c82Var.f2766c, "Page can only be offset by a positive amount, not by "));
                }
            }
