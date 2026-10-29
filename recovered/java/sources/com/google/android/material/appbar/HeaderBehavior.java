            package com.google.android.material.appbar;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.widget.OverScroller;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.e33;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

                /* JADX INFO: renamed from: c */
                public RunnableC0339g f4384c;

                /* JADX INFO: renamed from: d */
                public OverScroller f4385d;

                /* JADX INFO: renamed from: e */
                public boolean f4386e;

                /* JADX INFO: renamed from: f */
                public int f4387f;

                /* JADX INFO: renamed from: g */
                public int f4388g;

                /* JADX INFO: renamed from: h */
                public int f4389h;

                /* JADX INFO: renamed from: i */
                public VelocityTracker f4390i;

                public HeaderBehavior(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f4387f = -1;
/* 7 */             this.f4389h = -1;
                }

                /* JADX INFO: renamed from: A */
                public int mo2211A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
                    int iM7892c;
/* 1 */             int iM2234s = m2234s();
/* 5 */             if (i2 == 0 || iM2234s < i2 || iM2234s > i3 || iM2234s == (iM7892c = qj3.m7892c(i, i2, i3))) {
/* 22 */                return 0;
                    }
/* 17 */            m2235v(iM7892c);
/* 20 */            return iM2234s - iM7892c;
                }

                /* JADX INFO: renamed from: B */
                public final void m2231B(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 10 */            mo2211A(coordinatorLayout, view, i, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0046  */
                /* JADX WARN: Code duplicated, block: B:26:0x0060  */
                /* JADX WARN: Code duplicated, block: B:29:0x0065  */
                /* JADX WARN: Code duplicated, block: B:31:0x0071  */
                /* JADX WARN: Code duplicated, block: B:40:0x008b  */
                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: g */
                public boolean mo569g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                    VelocityTracker velocityTracker;
                    int y;
                    boolean z;
                    OverScroller overScroller;
                    int iFindPointerIndex;
/* 3 */             if (this.f4389h < 0) {
/* 17 */                this.f4389h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
                    }
/* 27 */            if (motionEvent.getActionMasked() == 2 && this.f4386e) {
/* 33 */                int i = this.f4387f;
/* 35 */                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
/* 49 */                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
/* 60 */                    if (Math.abs(y2 - this.f4388g) > this.f4389h) {
/* 62 */                        this.f4388g = y2;
/* 24 */                        return true;
                            }
/* 69 */                    if (motionEvent.getActionMasked() == 0) {
/* 71 */                        this.f4387f = -1;
/* 77 */                        int x = (int) motionEvent.getX();
/* 82 */                        y = (int) motionEvent.getY();
/* 87 */                        if (mo2218w(view)) {
/* 97 */                            z = false;
                                } else {
/* 97 */                            z = false;
                                }
/* 98 */                        this.f4386e = z;
/* 100 */                       if (z) {
/* 102 */                           this.f4388g = y;
/* 108 */                           this.f4387f = motionEvent.getPointerId(0);
/* 112 */                           if (this.f4390i == null) {
/* 118 */                               this.f4390i = VelocityTracker.obtain();
                                    }
/* 120 */                           overScroller = this.f4385d;
/* 122 */                           if (overScroller != null) {
/* 132 */                               this.f4385d.abortAnimation();
/* 24 */                                return true;
                                    }
                                }
                            }
/* 136 */                   velocityTracker = this.f4390i;
/* 138 */                   if (velocityTracker != null) {
/* 140 */                       velocityTracker.addMovement(motionEvent);
                            }
                        }
                    } else {
/* 69 */                if (motionEvent.getActionMasked() == 0) {
/* 71 */                    this.f4387f = -1;
/* 77 */                    int x2 = (int) motionEvent.getX();
/* 82 */                    y = (int) motionEvent.getY();
/* 87 */                    if (mo2218w(view) || !coordinatorLayout.m555n(view, x2, y)) {
/* 97 */                        z = false;
                            } else {
/* 95 */                        z = true;
                            }
/* 98 */                    this.f4386e = z;
/* 100 */                   if (z) {
/* 102 */                       this.f4388g = y;
/* 108 */                       this.f4387f = motionEvent.getPointerId(0);
/* 112 */                       if (this.f4390i == null) {
/* 118 */                           this.f4390i = VelocityTracker.obtain();
                                }
/* 120 */                       overScroller = this.f4385d;
/* 122 */                       if (overScroller != null && !overScroller.isFinished()) {
/* 132 */                           this.f4385d.abortAnimation();
/* 24 */                            return true;
                                }
                            }
                        }
/* 136 */               velocityTracker = this.f4390i;
/* 138 */               if (velocityTracker != null) {
/* 140 */                   velocityTracker.addMovement(motionEvent);
                        }
                    }
/* 26 */            return false;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:43:0x00da A[ADDED_TO_REGION] */
                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: r */
                public boolean mo580r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                    boolean z;
                    VelocityTracker velocityTracker;
                    VelocityTracker velocityTracker2;
/* 7 */             int actionMasked = motionEvent.getActionMasked();
/* 15 */            if (actionMasked != 1) {
/* 18 */                if (actionMasked == 2) {
/* 55 */                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4387f);
/* 59 */                    if (iFindPointerIndex != -1) {
/* 67 */                        int y = (int) motionEvent.getY(iFindPointerIndex);
/* 70 */                        int i = this.f4388g - y;
/* 71 */                        this.f4388g = y;
/* 86 */                        mo2211A(coordinatorLayout, view, mo2217t() - i, mo2219x(view), 0);
                            }
                        }
/* 21 */                if (actionMasked != 3) {
/* 24 */                    if (actionMasked == 6) {
/* 35 */                        int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
/* 40 */                        this.f4387f = motionEvent.getPointerId(i2);
/* 50 */                        this.f4388g = (int) (motionEvent.getY(i2) + 0.5f);
                            }
                        }
/* 89 */                z = false;
/* 208 */               velocityTracker2 = this.f4390i;
/* 210 */               if (velocityTracker2 != null) {
/* 212 */                   velocityTracker2.addMovement(motionEvent);
                        }
                        return !this.f4386e || z;
                    }
/* 92 */            VelocityTracker velocityTracker3 = this.f4390i;
/* 94 */            if (velocityTracker3 != null) {
/* 96 */                velocityTracker3.addMovement(motionEvent);
/* 103 */               this.f4390i.computeCurrentVelocity(1000);
/* 110 */               float yVelocity = this.f4390i.getYVelocity(this.f4387f);
/* 118 */               int i3 = -mo2220y(view);
/* 119 */               Runnable runnable = this.f4384c;
/* 121 */               if (runnable != null) {
/* 123 */                   view.removeCallbacks(runnable);
/* 126 */                   this.f4384c = null;
                        }
/* 130 */               if (this.f4385d == null) {
/* 141 */                   this.f4385d = new OverScroller(view.getContext());
                        }
/* 161 */               this.f4385d.fling(0, m2234s(), 0, Math.round(yVelocity), 0, 0, i3, 0);
/* 170 */               if (this.f4385d.computeScrollOffset()) {
/* 176 */                   RunnableC0339g runnableC0339g = new RunnableC0339g(this, coordinatorLayout, view);
/* 179 */                   this.f4384c = runnableC0339g;
/* 181 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 183 */                   view.postOnAnimation(runnableC0339g);
                        } else {
/* 189 */                   mo2221z(coordinatorLayout, view);
                        }
/* 192 */               z = true;
                    }
/* 195 */           this.f4386e = false;
/* 197 */           this.f4387f = -1;
/* 199 */           velocityTracker = this.f4390i;
/* 201 */           if (velocityTracker != null) {
/* 203 */               velocityTracker.recycle();
/* 206 */               this.f4390i = null;
                    }
/* 208 */           velocityTracker2 = this.f4390i;
/* 210 */           if (velocityTracker2 != null) {
/* 212 */               velocityTracker2.addMovement(motionEvent);
                    }
                    if (this.f4386e) {
                    }
/* 194 */           z = false;
/* 195 */           this.f4386e = false;
/* 197 */           this.f4387f = -1;
/* 199 */           velocityTracker = this.f4390i;
/* 201 */           if (velocityTracker != null) {
/* 203 */               velocityTracker.recycle();
/* 206 */               this.f4390i = null;
                    }
/* 208 */           velocityTracker2 = this.f4390i;
/* 210 */           if (velocityTracker2 != null) {
/* 212 */               velocityTracker2.addMovement(motionEvent);
                    }
                    if (this.f4386e) {
                    }
                }

                /* JADX INFO: renamed from: w */
                public boolean mo2218w(View view) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: x */
                public int mo2219x(View view) {
/* 5 */             return -view.getHeight();
                }

                /* JADX INFO: renamed from: y */
                public int mo2220y(View view) {
/* 1 */             return view.getHeight();
                }

                /* JADX INFO: renamed from: z */
                public void mo2221z(CoordinatorLayout coordinatorLayout, View view) {
                }
            }
