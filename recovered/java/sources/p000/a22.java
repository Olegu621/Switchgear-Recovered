            package p000;

            import android.view.animation.Interpolator;
            import android.widget.OverScroller;
            import androidx.recyclerview.widget.C0126d;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a22 implements Runnable {

                /* JADX INFO: renamed from: a */
                public int f49a;

                /* JADX INFO: renamed from: b */
                public int f50b;

                /* JADX INFO: renamed from: c */
                public OverScroller f51c;

                /* JADX INFO: renamed from: d */
                public Interpolator f52d;

                /* JADX INFO: renamed from: e */
                public boolean f53e;

                /* JADX INFO: renamed from: f */
                public boolean f54f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ RecyclerView f55i;

                public a22(RecyclerView recyclerView) {
/* 4 */             this.f55i = recyclerView;
/* 6 */             g12 g12Var = RecyclerView.f1606m1;
/* 8 */             this.f52d = g12Var;
/* 11 */            this.f53e = false;
/* 13 */            this.f54f = false;
/* 24 */            this.f51c = new OverScroller(recyclerView.getContext(), g12Var);
                }

                /* JADX INFO: renamed from: a */
                public final void m40a() {
/* 3 */             if (this.f53e) {
/* 6 */                 this.f54f = true;
/* 8 */                 return;
                    }
/* 9 */             RecyclerView recyclerView = this.f55i;
/* 11 */            recyclerView.removeCallbacks(this);
/* 14 */            WeakHashMap weakHashMap = e33.f7494a;
/* 16 */            recyclerView.postOnAnimation(this);
                }

                /* JADX INFO: renamed from: b */
                public final void m41b(int i, int i2, int i3, Interpolator interpolator) {
/* 4 */             RecyclerView recyclerView = this.f55i;
/* 6 */             if (i3 == Integer.MIN_VALUE) {
/* 8 */                 int iAbs = Math.abs(i);
/* 12 */                int iAbs2 = Math.abs(i2);
/* 20 */                boolean z = iAbs > iAbs2;
/* 28 */                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
/* 32 */                if (!z) {
/* 35 */                    iAbs = iAbs2;
                        }
/* 48 */                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
                    }
/* 52 */            int i4 = i3;
/* 53 */            if (interpolator == null) {
/* 55 */                interpolator = RecyclerView.f1606m1;
                    }
/* 59 */            if (this.f52d != interpolator) {
/* 61 */                this.f52d = interpolator;
/* 72 */                this.f51c = new OverScroller(recyclerView.getContext(), interpolator);
                    }
/* 74 */            this.f50b = 0;
/* 76 */            this.f49a = 0;
/* 79 */            recyclerView.setScrollState(2);
/* 88 */            this.f51c.startScroll(0, 0, i, i2, i4);
/* 91 */            m40a();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
/* 1 */             RecyclerView recyclerView = this.f55i;
/* 3 */             int[] iArr = recyclerView.f1647d1;
/* 7 */             if (recyclerView.f1637a0 == null) {
/* 9 */                 recyclerView.removeCallbacks(this);
/* 14 */                this.f51c.abortAnimation();
/* 17 */                return;
                    }
/* 19 */            this.f54f = false;
/* 22 */            this.f53e = true;
/* 24 */            recyclerView.m887m();
/* 27 */            OverScroller overScroller = this.f51c;
/* 33 */            if (overScroller.computeScrollOffset()) {
/* 35 */                int currX = overScroller.getCurrX();
/* 39 */                int currY = overScroller.getCurrY();
/* 45 */                int i6 = currX - this.f49a;
/* 49 */                int i7 = currY - this.f50b;
/* 51 */                this.f49a = currX;
/* 53 */                this.f50b = currY;
/* 56 */                int[] iArr2 = recyclerView.f1647d1;
/* 58 */                iArr2[0] = 0;
/* 60 */                iArr2[1] = 0;
/* 69 */                if (recyclerView.m893s(i6, i7, iArr2, null, 1)) {
/* 73 */                    i = i6 - iArr[0];
/* 77 */                    i2 = i7 - iArr[1];
                        } else {
/* 80 */                    i = i6;
/* 81 */                    i2 = i7;
                        }
/* 87 */                if (recyclerView.getOverScrollMode() != 2) {
/* 89 */                    recyclerView.m886l(i, i2);
                        }
/* 94 */                if (recyclerView.f1631W != null) {
/* 96 */                    iArr[0] = 0;
/* 98 */                    iArr[1] = 0;
/* 100 */                   recyclerView.m874b0(i, i2, iArr);
/* 103 */                   i3 = iArr[0];
/* 105 */                   i4 = iArr[1];
/* 107 */                   i -= i3;
/* 108 */                   i2 -= i4;
/* 111 */                   C0126d c0126d = recyclerView.f1637a0.f1763e;
/* 113 */                   if (c0126d != null && !c0126d.f18905d && c0126d.f18906e) {
/* 125 */                       int iM10082b = recyclerView.f1624R0.m10082b();
/* 129 */                       if (iM10082b == 0) {
/* 131 */                           c0126d.m9682d();
                                } else if (c0126d.f18902a >= iM10082b) {
/* 140 */                           c0126d.f18902a = iM10082b - 1;
/* 142 */                           c0126d.m9681b(i3, i4);
                                } else {
/* 146 */                           c0126d.m9681b(i3, i4);
                                }
                            }
                        } else {
/* 150 */                   i3 = 0;
/* 151 */                   i4 = 0;
                        }
/* 158 */               if (!recyclerView.f1643c0.isEmpty()) {
/* 160 */                   recyclerView.invalidate();
                        }
/* 163 */               int[] iArr3 = recyclerView.f1647d1;
/* 165 */               iArr3[0] = 0;
/* 167 */               iArr3[1] = 0;
/* 171 */               recyclerView.m894t(i3, i4, i, i2, null, 1, iArr3);
/* 176 */               int i8 = i - iArr[0];
/* 179 */               int i9 = i2 - iArr[1];
/* 180 */               if (i3 != 0 || i4 != 0) {
/* 184 */                   recyclerView.m895u(i3, i4);
                        }
/* 191 */               if (!recyclerView.awakenScrollBars()) {
/* 193 */                   recyclerView.invalidate();
                        }
/* 239 */               boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
/* 242 */               C0126d c0126d2 = recyclerView.f1637a0.f1763e;
/* 244 */               if ((c0126d2 == null || !c0126d2.f18905d) && z) {
/* 258 */                   if (recyclerView.getOverScrollMode() != 2) {
/* 264 */                       int currVelocity = (int) overScroller.getCurrVelocity();
/* 265 */                       if (i8 < 0) {
/* 267 */                           i5 = -currVelocity;
                                } else {
/* 273 */                           i5 = i8 > 0 ? currVelocity : 0;
                                }
/* 274 */                       if (i9 < 0) {
/* 276 */                           currVelocity = -currVelocity;
                                } else if (i9 <= 0) {
/* 281 */                           currVelocity = 0;
                                }
/* 282 */                       if (i5 < 0) {
/* 284 */                           recyclerView.m897w();
/* 293 */                           if (recyclerView.f1675v0.isFinished()) {
/* 298 */                               recyclerView.f1675v0.onAbsorb(-i5);
                                    }
                                } else if (i5 > 0) {
/* 304 */                           recyclerView.m898x();
/* 313 */                           if (recyclerView.f1678x0.isFinished()) {
/* 317 */                               recyclerView.f1678x0.onAbsorb(i5);
                                    }
                                }
/* 320 */                       if (currVelocity < 0) {
/* 322 */                           recyclerView.m899y();
/* 331 */                           if (recyclerView.f1677w0.isFinished()) {
/* 336 */                               recyclerView.f1677w0.onAbsorb(-currVelocity);
                                    }
                                } else if (currVelocity > 0) {
/* 342 */                           recyclerView.m896v();
/* 351 */                           if (recyclerView.f1679y0.isFinished()) {
/* 355 */                               recyclerView.f1679y0.onAbsorb(currVelocity);
                                    }
                                }
/* 358 */                       if (i5 != 0 || currVelocity != 0) {
/* 362 */                           WeakHashMap weakHashMap = e33.f7494a;
/* 364 */                           recyclerView.postInvalidateOnAnimation();
                                }
                            }
/* 367 */                   C1771iw c1771iw = recyclerView.f1623Q0;
/* 371 */                   int[] iArr4 = (int[]) c1771iw.f11948e;
/* 373 */                   if (iArr4 != null) {
/* 376 */                       Arrays.fill(iArr4, -1);
                            }
/* 379 */                   c1771iw.f11947d = 0;
                        } else {
/* 382 */                   m40a();
/* 385 */                   hq0 hq0Var = recyclerView.f1622P0;
/* 387 */                   if (hq0Var != null) {
/* 389 */                       hq0Var.m4263a(recyclerView, i3, i4);
                            }
                        }
                    }
/* 394 */           C0126d c0126d3 = recyclerView.f1637a0.f1763e;
/* 396 */           if (c0126d3 != null && c0126d3.f18905d) {
/* 402 */               c0126d3.m9681b(0, 0);
                    }
/* 405 */           this.f53e = false;
/* 409 */           if (!this.f54f) {
/* 420 */               recyclerView.setScrollState(0);
/* 423 */               recyclerView.m883h0(1);
                    } else {
/* 411 */               recyclerView.removeCallbacks(this);
/* 414 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 416 */               recyclerView.postOnAnimation(this);
                    }
                }
            }
