            package p000;

            import android.content.Context;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.widget.OverScroller;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j33 {

                /* JADX INFO: renamed from: x */
                public static final g12 f12039x = new g12(1);

                /* JADX INFO: renamed from: a */
                public int f12040a;

                /* JADX INFO: renamed from: b */
                public int f12041b;

                /* JADX INFO: renamed from: d */
                public float[] f12043d;

                /* JADX INFO: renamed from: e */
                public float[] f12044e;

                /* JADX INFO: renamed from: f */
                public float[] f12045f;

                /* JADX INFO: renamed from: g */
                public float[] f12046g;

                /* JADX INFO: renamed from: h */
                public int[] f12047h;

                /* JADX INFO: renamed from: i */
                public int[] f12048i;

                /* JADX INFO: renamed from: j */
                public int[] f12049j;

                /* JADX INFO: renamed from: k */
                public int f12050k;

                /* JADX INFO: renamed from: l */
                public VelocityTracker f12051l;

                /* JADX INFO: renamed from: m */
                public final float f12052m;

                /* JADX INFO: renamed from: n */
                public float f12053n;

                /* JADX INFO: renamed from: o */
                public int f12054o;

                /* JADX INFO: renamed from: p */
                public final int f12055p;

                /* JADX INFO: renamed from: q */
                public int f12056q;

                /* JADX INFO: renamed from: r */
                public final OverScroller f12057r;

                /* JADX INFO: renamed from: s */
                public final hu0 f12058s;

                /* JADX INFO: renamed from: t */
                public View f12059t;

                /* JADX INFO: renamed from: u */
                public boolean f12060u;

                /* JADX INFO: renamed from: v */
                public final ViewGroup f12061v;

                /* JADX INFO: renamed from: c */
                public int f12042c = -1;

                /* JADX INFO: renamed from: w */
                public final RunnableC2495ye f12062w = new RunnableC2495ye(this, 27);

                public j33(Context context, ViewGroup viewGroup, hu0 hu0Var) {
/* 16 */            if (hu0Var == null) {
/* 79 */                C1951n4.m6859j("Callback may not be null");
/* 83 */                throw null;
                    }
/* 18 */            this.f12061v = viewGroup;
/* 20 */            this.f12058s = hu0Var;
/* 22 */            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 42 */            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
/* 43 */            this.f12055p = i;
/* 45 */            this.f12054o = i;
/* 51 */            this.f12041b = viewConfiguration.getScaledTouchSlop();
/* 58 */            this.f12052m = viewConfiguration.getScaledMaximumFlingVelocity();
/* 65 */            this.f12053n = viewConfiguration.getScaledMinimumFlingVelocity();
/* 74 */            this.f12057r = new OverScroller(context, f12039x);
                }

                /* JADX INFO: renamed from: l */
                public static boolean m5669l(View view, int i, int i2) {
                    return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
                }

                /* JADX INFO: renamed from: a */
                public final void m5670a() {
/* 1 */             m5671b();
/* 7 */             if (this.f12040a == 2) {
/* 9 */                 OverScroller overScroller = this.f12057r;
/* 11 */                overScroller.getCurrX();
/* 14 */                overScroller.getCurrY();
/* 17 */                overScroller.abortAnimation();
/* 32 */                this.f12058s.mo629w0(this.f12059t, overScroller.getCurrX(), overScroller.getCurrY());
                    }
/* 36 */            m5686r(0);
                }

                /* JADX INFO: renamed from: b */
                public final void m5671b() {
/* 2 */             this.f12042c = -1;
/* 4 */             float[] fArr = this.f12043d;
/* 6 */             if (fArr != null) {
/* 10 */                Arrays.fill(fArr, 0.0f);
/* 15 */                Arrays.fill(this.f12044e, 0.0f);
/* 20 */                Arrays.fill(this.f12045f, 0.0f);
/* 25 */                Arrays.fill(this.f12046g, 0.0f);
/* 31 */                Arrays.fill(this.f12047h, 0);
/* 36 */                Arrays.fill(this.f12048i, 0);
/* 41 */                Arrays.fill(this.f12049j, 0);
/* 44 */                this.f12050k = 0;
                    }
/* 46 */            VelocityTracker velocityTracker = this.f12051l;
/* 48 */            if (velocityTracker != null) {
/* 50 */                velocityTracker.recycle();
/* 54 */                this.f12051l = null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5672c(int i, View view) {
/* 1 */             ViewParent parent = view.getParent();
/* 5 */             ViewGroup viewGroup = this.f12061v;
/* 7 */             if (parent != viewGroup) {
/* 27 */                C1697u2.m5435k(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")");
/* 30 */                return;
                    }
/* 9 */             this.f12059t = view;
/* 11 */            this.f12042c = i;
/* 15 */            this.f12058s.mo627u0(i, view);
/* 19 */            m5686r(1);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m5673d(float f, float f2, int i, int i2) {
/* 1 */             float fAbs = Math.abs(f);
/* 5 */             float fAbs2 = Math.abs(f2);
/* 14 */            if ((this.f12047h[i] & i2) != i2 || (this.f12056q & i2) == 0 || (this.f12049j[i] & i2) == i2 || (this.f12048i[i] & i2) == i2) {
/* 75 */                return false;
                    }
/* 35 */            float f3 = this.f12041b;
/* 40 */            if (fAbs <= f3 && fAbs2 <= f3) {
/* 75 */                return false;
                    }
/* 52 */            if (fAbs < fAbs2 * 0.5f) {
/* 56 */                this.f12058s.getClass();
                    }
                    return (this.f12048i[i] & i2) == 0 && fAbs > ((float) this.f12041b);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
                /* JADX INFO: renamed from: e */
                public final boolean m5674e(View view, float f, float f2) {
/* 2 */             if (view != null) {
/* 5 */                 hu0 hu0Var = this.f12058s;
/* 16 */                boolean z = hu0Var.mo624i0(view) > 0;
/* 25 */                boolean z2 = hu0Var.mo4365j0() > 0;
/* 26 */                if (z && z2) {
/* 32 */                    float f3 = (f2 * f2) + (f * f);
/* 33 */                    int i = this.f12041b;
/* 39 */                    if (f3 > i * i) {
/* 11 */                        return true;
                            }
                        } else if (!z ? !(!z2 || Math.abs(f2) <= this.f12041b) : Math.abs(f) > this.f12041b) {
/* 11 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final void m5675f(int i) {
/* 1 */             float[] fArr = this.f12043d;
/* 3 */             if (fArr != null) {
/* 5 */                 int i2 = this.f12050k;
/* 8 */                 int i3 = 1 << i;
/* 11 */                if ((i2 & i3) != 0) {
/* 14 */                    fArr[i] = 0.0f;
/* 18 */                    this.f12044e[i] = 0.0f;
/* 22 */                    this.f12045f[i] = 0.0f;
/* 26 */                    this.f12046g[i] = 0.0f;
/* 31 */                    this.f12047h[i] = 0;
/* 35 */                    this.f12048i[i] = 0;
/* 39 */                    this.f12049j[i] = 0;
/* 43 */                    this.f12050k = (~i3) & i2;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final int m5676g(int i, int i2, int i3) {
/* 1 */             if (i == 0) {
/* 3 */                 return 0;
                    }
/* 7 */             int width = this.f12061v.getWidth();
/* 11 */            float f = width / 2;
/* 41 */            float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
/* 42 */            int iAbs = Math.abs(i2);
/* 78 */            return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
                }

                /* JADX INFO: renamed from: h */
                public final boolean m5677h() {
/* 5 */             if (this.f12040a == 2) {
/* 7 */                 OverScroller overScroller = this.f12057r;
/* 9 */                 boolean zComputeScrollOffset = overScroller.computeScrollOffset();
/* 13 */                int currX = overScroller.getCurrX();
/* 17 */                int currY = overScroller.getCurrY();
/* 27 */                int left = currX - this.f12059t.getLeft();
/* 35 */                int top = currY - this.f12059t.getTop();
/* 37 */                if (left != 0) {
/* 39 */                    View view = this.f12059t;
/* 41 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 43 */                    view.offsetLeftAndRight(left);
                        }
/* 46 */                if (top != 0) {
/* 48 */                    View view2 = this.f12059t;
/* 50 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 52 */                    view2.offsetTopAndBottom(top);
                        }
/* 55 */                if (left != 0 || top != 0) {
/* 63 */                    this.f12058s.mo629w0(this.f12059t, currX, currY);
                        }
/* 66 */                if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
/* 80 */                    overScroller.abortAnimation();
/* 83 */                    zComputeScrollOffset = false;
                        }
/* 84 */                if (!zComputeScrollOffset) {
/* 90 */                    this.f12061v.post(this.f12062w);
                        }
                    }
                    return this.f12040a == 2;
                }

                /* JADX INFO: renamed from: i */
                public final View m5678i(int i, int i2) {
/* 1 */             ViewGroup viewGroup = this.f12061v;
/* 9 */             for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
/* 13 */                this.f12058s.getClass();
/* 16 */                View childAt = viewGroup.getChildAt(childCount);
/* 24 */                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
/* 44 */                    return childAt;
                        }
                    }
/* 48 */            return null;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m5679j(int i, int i2, int i3, int i4) {
                    float f;
                    float f2;
                    float f3;
                    float f4;
/* 3 */             int left = this.f12059t.getLeft();
/* 9 */             int top = this.f12059t.getTop();
/* 13 */            int i5 = i - left;
/* 15 */            int i6 = i2 - top;
/* 18 */            OverScroller overScroller = this.f12057r;
/* 20 */            if (i5 == 0 && i6 == 0) {
/* 24 */                overScroller.abortAnimation();
/* 27 */                m5686r(0);
/* 17 */                return false;
                    }
/* 31 */            View view = this.f12059t;
/* 35 */            int i7 = (int) this.f12053n;
/* 38 */            int i8 = (int) this.f12052m;
/* 39 */            int iAbs = Math.abs(i3);
/* 43 */            if (iAbs < i7) {
/* 45 */                i3 = 0;
                    } else if (iAbs > i8) {
/* 53 */                i3 = i3 > 0 ? i8 : -i8;
                    }
/* 56 */            int i9 = (int) this.f12053n;
/* 57 */            int iAbs2 = Math.abs(i4);
/* 61 */            if (iAbs2 < i9) {
/* 63 */                i4 = 0;
                    } else if (iAbs2 > i8) {
/* 71 */                i4 = i4 > 0 ? i8 : -i8;
                    }
/* 72 */            int iAbs3 = Math.abs(i5);
/* 76 */            int iAbs4 = Math.abs(i6);
/* 80 */            int iAbs5 = Math.abs(i3);
/* 84 */            int iAbs6 = Math.abs(i4);
/* 88 */            int i10 = iAbs5 + iAbs6;
/* 90 */            int i11 = iAbs3 + iAbs4;
/* 92 */            if (i3 != 0) {
                        f = iAbs5;
                        f2 = i10;
                    } else {
                        f = iAbs3;
                        f2 = i11;
                    }
/* 96 */            float f5 = f / f2;
/* 101 */           if (i4 != 0) {
                        f3 = iAbs6;
                        f4 = i10;
                    } else {
                        f3 = iAbs4;
                        f4 = i11;
                    }
/* 105 */           float f6 = f3 / f4;
/* 110 */           hu0 hu0Var = this.f12058s;
/* 134 */           overScroller.startScroll(left, top, i5, i6, (int) ((m5676g(i6, i4, hu0Var.mo4365j0()) * f6) + (m5676g(i5, i3, hu0Var.mo624i0(view)) * f5)));
/* 138 */           m5686r(2);
/* 141 */           return true;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m5680k(int i) {
/* 7 */             if ((this.f12050k & (1 << i)) != 0) {
/* 3 */                 return true;
                    }
/* 31 */            AbstractC1245n0.m4876d("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
/* 34 */            return false;
                }

                /* JADX INFO: renamed from: m */
                public final void m5681m(MotionEvent motionEvent) {
                    int i;
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 5 */             int actionIndex = motionEvent.getActionIndex();
/* 9 */             if (actionMasked == 0) {
/* 11 */                m5671b();
                    }
/* 16 */            if (this.f12051l == null) {
/* 22 */                this.f12051l = VelocityTracker.obtain();
                    }
/* 26 */            this.f12051l.addMovement(motionEvent);
/* 29 */            hu0 hu0Var = this.f12058s;
/* 31 */            int i2 = 0;
/* 32 */            if (actionMasked == 0) {
/* 398 */               float x = motionEvent.getX();
/* 402 */               float y = motionEvent.getY();
/* 406 */               int pointerId = motionEvent.getPointerId(0);
/* 412 */               View viewM5678i = m5678i((int) x, (int) y);
/* 416 */               m5684p(x, y, pointerId);
/* 419 */               m5690v(pointerId, viewM5678i);
/* 429 */               if ((this.f12056q & this.f12047h[pointerId]) != 0) {
/* 431 */                   hu0Var.mo626t0(pointerId);
/* 434 */                   return;
                        }
/* 434 */               return;
                    }
/* 35 */            if (actionMasked == 1) {
/* 389 */               if (this.f12040a == 1) {
/* 391 */                   m5682n();
                        }
/* 394 */               m5671b();
/* 397 */               return;
                    }
/* 38 */            if (actionMasked == 2) {
/* 203 */               if (this.f12040a != 1) {
/* 316 */                   int pointerCount = motionEvent.getPointerCount();
/* 320 */                   while (i2 < pointerCount) {
/* 322 */                       int pointerId2 = motionEvent.getPointerId(i2);
/* 330 */                       if (m5680k(pointerId2)) {
/* 333 */                           float x2 = motionEvent.getX(i2);
/* 337 */                           float y2 = motionEvent.getY(i2);
/* 345 */                           float f = x2 - this.f12043d[pointerId2];
/* 351 */                           float f2 = y2 - this.f12044e[pointerId2];
/* 353 */                           m5683o(f, f2, pointerId2);
/* 358 */                           if (this.f12040a != 1) {
/* 363 */                               View viewM5678i2 = m5678i((int) x2, (int) y2);
/* 371 */                               if (m5674e(viewM5678i2, f, f2) && m5690v(pointerId2, viewM5678i2)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
/* 380 */                       i2++;
                            }
/* 383 */                   m5685q(motionEvent);
/* 386 */                   return;
                        }
/* 211 */               if (m5680k(this.f12042c)) {
/* 217 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.f12042c);
/* 221 */                   float x3 = motionEvent.getX(iFindPointerIndex);
/* 225 */                   float y3 = motionEvent.getY(iFindPointerIndex);
/* 229 */                   float[] fArr = this.f12045f;
/* 231 */                   int i3 = this.f12042c;
/* 236 */                   int i4 = (int) (x3 - fArr[i3]);
/* 242 */                   int i5 = (int) (y3 - this.f12046g[i3]);
/* 249 */                   int left = this.f12059t.getLeft() + i4;
/* 256 */                   int top = this.f12059t.getTop() + i5;
/* 259 */                   int left2 = this.f12059t.getLeft();
/* 265 */                   int top2 = this.f12059t.getTop();
/* 269 */                   if (i4 != 0) {
/* 273 */                       left = hu0Var.mo622M(left, this.f12059t);
/* 281 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 283 */                       this.f12059t.offsetLeftAndRight(left - left2);
                            }
/* 286 */                   if (i5 != 0) {
/* 290 */                       top = hu0Var.mo623N(top, this.f12059t);
/* 298 */                       WeakHashMap weakHashMap2 = e33.f7494a;
/* 300 */                       this.f12059t.offsetTopAndBottom(top - top2);
                            }
/* 303 */                   if (i4 != 0 || i5 != 0) {
/* 309 */                       hu0Var.mo629w0(this.f12059t, left, top);
                            }
/* 312 */                   m5685q(motionEvent);
/* 315 */                   return;
                        }
/* 434 */               return;
                    }
/* 41 */            if (actionMasked == 3) {
/* 178 */               if (this.f12040a == 1) {
/* 180 */                   this.f12060u = true;
/* 185 */                   hu0Var.mo630x0(this.f12059t, 0.0f, 0.0f);
/* 188 */                   this.f12060u = false;
/* 192 */                   if (this.f12040a == 1) {
/* 194 */                       m5686r(0);
                            }
                        }
/* 197 */               m5671b();
/* 200 */               return;
                    }
/* 44 */            if (actionMasked == 5) {
/* 119 */               int pointerId3 = motionEvent.getPointerId(actionIndex);
/* 123 */               float x4 = motionEvent.getX(actionIndex);
/* 127 */               float y4 = motionEvent.getY(actionIndex);
/* 131 */               m5684p(x4, y4, pointerId3);
/* 136 */               if (this.f12040a != 0) {
/* 168 */                   if (m5669l(this.f12059t, (int) x4, (int) y4)) {
/* 172 */                       m5690v(pointerId3, this.f12059t);
/* 175 */                       return;
                            }
/* 434 */                   return;
                        }
/* 144 */               m5690v(pointerId3, m5678i((int) x4, (int) y4));
/* 154 */               if ((this.f12056q & this.f12047h[pointerId3]) != 0) {
/* 156 */                   hu0Var.mo626t0(pointerId3);
/* 159 */                   return;
                        }
/* 434 */               return;
                    }
/* 47 */            if (actionMasked != 6) {
/* 434 */               return;
                    }
/* 51 */            int pointerId4 = motionEvent.getPointerId(actionIndex);
/* 57 */            if (this.f12040a == 1 && pointerId4 == this.f12042c) {
/* 63 */                int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
/* 68 */                    if (i2 >= pointerCount2) {
/* 109 */                       i = -1;
                                break;
                            }
/* 70 */                    int pointerId5 = motionEvent.getPointerId(i2);
/* 76 */                    if (pointerId5 != this.f12042c) {
/* 89 */                        View viewM5678i3 = m5678i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
/* 93 */                        View view = this.f12059t;
/* 95 */                        if (viewM5678i3 == view && m5690v(pointerId5, view)) {
/* 103 */                           i = this.f12042c;
                                    break;
                                }
                            }
/* 106 */                   i2++;
                        }
/* 110 */               if (i == -1) {
/* 112 */                   m5682n();
                        }
                    }
/* 115 */           m5675f(pointerId4);
                }

                /* JADX INFO: renamed from: n */
                public final void m5682n() {
/* 1 */             VelocityTracker velocityTracker = this.f12051l;
/* 5 */             float f = this.f12052m;
/* 7 */             velocityTracker.computeCurrentVelocity(1000, f);
/* 14 */            float xVelocity = this.f12051l.getXVelocity(this.f12042c);
/* 18 */            float f2 = this.f12053n;
/* 20 */            float fAbs = Math.abs(xVelocity);
/* 27 */            if (fAbs < f2) {
/* 29 */                xVelocity = 0.0f;
                    } else if (fAbs > f) {
/* 41 */                xVelocity = xVelocity > 0.0f ? f : -f;
                    }
/* 46 */            float yVelocity = this.f12051l.getYVelocity(this.f12042c);
/* 50 */            float f3 = this.f12053n;
/* 52 */            float fAbs2 = Math.abs(yVelocity);
/* 58 */            if (fAbs2 < f3) {
/* 60 */                f = 0.0f;
                    } else if (fAbs2 <= f) {
/* 73 */                f = yVelocity;
                    } else if (yVelocity <= 0.0f) {
/* 71 */                f = -f;
                    }
/* 75 */            this.f12060u = true;
/* 81 */            this.f12058s.mo630x0(this.f12059t, xVelocity, f);
/* 85 */            this.f12060u = false;
/* 89 */            if (this.f12040a == 1) {
/* 91 */                m5686r(0);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v16 */
                /* JADX WARN: Type inference failed for: r0v2 */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v4, types: [int] */
                /* JADX WARN: Type inference failed for: r2v1, types: [hu0] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: o */
                public final void m5683o(float f, float f2, int i) {
                    int i2;
/* 2 */             boolean zM5673d = m5673d(f, f2, i, 1);
                    ?? r0 = zM5673d;
/* 11 */            if (m5673d(f2, f, i, 4)) {
/* 13 */                r0 = (zM5673d ? 1 : 0) | 4;
                    }
                    ?? r1 = r0;
/* 20 */            if (m5673d(f, f2, i, 2)) {
/* 22 */                r1 = (r0 == true ? 1 : 0) | 2;
                    }
                    ?? r2 = r1;
/* 30 */            if (m5673d(f2, f, i, 8)) {
/* 32 */                i2 = (r1 == true ? 1 : 0) | 8;
                    }
/* 34 */            if (r2 == 0) {
                        r2 = i2;
/* 48 */                return;
                    }
                    r2 = i2;
/* 36 */            int[] iArr = this.f12048i;
/* 41 */            iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
/* 45 */            this.f12058s.mo625s0(r2, i);
                }

                /* JADX INFO: renamed from: p */
                public final void m5684p(float f, float f2, int i) {
/* 1 */             float[] fArr = this.f12043d;
/* 4 */             if (fArr == null || fArr.length <= i) {
/* 9 */                 int i2 = i + 1;
/* 11 */                float[] fArr2 = new float[i2];
/* 13 */                float[] fArr3 = new float[i2];
/* 15 */                float[] fArr4 = new float[i2];
/* 17 */                float[] fArr5 = new float[i2];
/* 19 */                int[] iArr = new int[i2];
/* 21 */                int[] iArr2 = new int[i2];
/* 23 */                int[] iArr3 = new int[i2];
/* 25 */                if (fArr != null) {
/* 28 */                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
/* 31 */                    float[] fArr6 = this.f12044e;
/* 34 */                    System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
/* 37 */                    float[] fArr7 = this.f12045f;
/* 40 */                    System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
/* 43 */                    float[] fArr8 = this.f12046g;
/* 46 */                    System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
/* 49 */                    int[] iArr4 = this.f12047h;
/* 52 */                    System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
/* 55 */                    int[] iArr5 = this.f12048i;
/* 58 */                    System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
/* 61 */                    int[] iArr6 = this.f12049j;
/* 64 */                    System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
                        }
/* 67 */                this.f12043d = fArr2;
/* 69 */                this.f12044e = fArr3;
/* 71 */                this.f12045f = fArr4;
/* 73 */                this.f12046g = fArr5;
/* 75 */                this.f12047h = iArr;
/* 77 */                this.f12048i = iArr2;
/* 79 */                this.f12049j = iArr3;
                    }
/* 81 */            float[] fArr9 = this.f12043d;
/* 85 */            this.f12045f[i] = f;
/* 87 */            fArr9[i] = f;
/* 89 */            float[] fArr10 = this.f12044e;
/* 93 */            this.f12046g[i] = f2;
/* 95 */            fArr10[i] = f2;
/* 97 */            int[] iArr7 = this.f12047h;
/* 99 */            int i3 = (int) f;
/* 100 */           int i4 = (int) f2;
/* 101 */           ViewGroup viewGroup = this.f12061v;
/* 111 */           int i5 = i3 < viewGroup.getLeft() + this.f12054o ? 1 : 0;
/* 121 */           if (i4 < viewGroup.getTop() + this.f12054o) {
/* 123 */               i5 |= 4;
                    }
/* 132 */           if (i3 > viewGroup.getRight() - this.f12054o) {
/* 134 */               i5 |= 2;
                    }
/* 143 */           if (i4 > viewGroup.getBottom() - this.f12054o) {
/* 145 */               i5 |= 8;
                    }
/* 147 */           iArr7[i] = i5;
/* 154 */           this.f12050k |= 1 << i;
                }

                /* JADX INFO: renamed from: q */
                public final void m5685q(MotionEvent motionEvent) {
/* 1 */             int pointerCount = motionEvent.getPointerCount();
/* 6 */             for (int i = 0; i < pointerCount; i++) {
/* 8 */                 int pointerId = motionEvent.getPointerId(i);
/* 16 */                if (m5680k(pointerId)) {
/* 19 */                    float x = motionEvent.getX(i);
/* 23 */                    float y = motionEvent.getY(i);
/* 29 */                    this.f12045f[pointerId] = x;
/* 33 */                    this.f12046g[pointerId] = y;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m5686r(int i) {
/* 5 */             this.f12061v.removeCallbacks(this.f12062w);
/* 10 */            if (this.f12040a != i) {
/* 12 */                this.f12040a = i;
/* 16 */                this.f12058s.mo628v0(i);
/* 21 */                if (this.f12040a == 0) {
/* 24 */                    this.f12059t = null;
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public final boolean m5687s(int i, int i2) {
/* 3 */             if (this.f12060u) {
/* 23 */                return m5679j(i, i2, (int) this.f12051l.getXVelocity(this.f12042c), (int) this.f12051l.getYVelocity(this.f12042c));
                    }
/* 30 */            f42.m3656l("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
/* 33 */            return false;
                }

                /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
                /* JADX INFO: renamed from: t */
                public final boolean m5688t(MotionEvent motionEvent) {
                    View viewM5678i;
/* 5 */             int actionMasked = motionEvent.getActionMasked();
/* 9 */             int actionIndex = motionEvent.getActionIndex();
/* 13 */            if (actionMasked == 0) {
/* 15 */                m5671b();
                    }
/* 20 */            if (this.f12051l == null) {
/* 26 */                this.f12051l = VelocityTracker.obtain();
                    }
/* 30 */            this.f12051l.addMovement(motionEvent);
/* 35 */            hu0 hu0Var = this.f12058s;
/* 38 */            if (actionMasked == 0) {
/* 250 */               float x = motionEvent.getX();
/* 254 */               float y = motionEvent.getY();
/* 258 */               int pointerId = motionEvent.getPointerId(0);
/* 262 */               m5684p(x, y, pointerId);
/* 267 */               View viewM5678i2 = m5678i((int) x, (int) y);
/* 273 */               if (viewM5678i2 == this.f12059t && this.f12040a == 2) {
/* 279 */                   m5690v(pointerId, viewM5678i2);
                        }
/* 289 */               if ((this.f12047h[pointerId] & this.f12056q) != 0) {
/* 291 */                   hu0Var.mo626t0(pointerId);
                        }
                    } else if (actionMasked == 1) {
/* 246 */               m5671b();
                    } else if (actionMasked != 2) {
/* 45 */                if (actionMasked == 3) {
/* 246 */                   m5671b();
                        } else if (actionMasked == 5) {
/* 64 */                    int pointerId2 = motionEvent.getPointerId(actionIndex);
/* 68 */                    float x2 = motionEvent.getX(actionIndex);
/* 72 */                    float y2 = motionEvent.getY(actionIndex);
/* 76 */                    m5684p(x2, y2, pointerId2);
/* 79 */                    int i = this.f12040a;
/* 81 */                    if (i == 0) {
/* 90 */                        if ((this.f12047h[pointerId2] & this.f12056q) != 0) {
/* 92 */                            hu0Var.mo626t0(pointerId2);
                                }
                            } else if (i == 2 && (viewM5678i = m5678i((int) x2, (int) y2)) == this.f12059t) {
/* 109 */                       m5690v(pointerId2, viewM5678i);
                            }
                        } else if (actionMasked == 6) {
/* 59 */                    m5675f(motionEvent.getPointerId(actionIndex));
                        }
                    } else if (this.f12043d != null && this.f12044e != null) {
/* 124 */               int pointerCount = motionEvent.getPointerCount();
/* 129 */               for (int i2 = 0; i2 < pointerCount; i2++) {
/* 131 */                   int pointerId3 = motionEvent.getPointerId(i2);
/* 139 */                   if (m5680k(pointerId3)) {
/* 142 */                       float x3 = motionEvent.getX(i2);
/* 146 */                       float y3 = motionEvent.getY(i2);
/* 154 */                       float f = x3 - this.f12043d[pointerId3];
/* 160 */                       float f2 = y3 - this.f12044e[pointerId3];
/* 164 */                       View viewM5678i3 = m5678i((int) x3, (int) y3);
/* 178 */                       boolean z = viewM5678i3 != null && m5674e(viewM5678i3, f, f2);
/* 179 */                       if (!z) {
/* 222 */                           m5683o(f, f2, pointerId3);
/* 227 */                           if (this.f12040a != 1) {
                                        break;
                                    }
                                } else {
/* 181 */                           int left = viewM5678i3.getLeft();
/* 187 */                           int iMo622M = hu0Var.mo622M(((int) f) + left, viewM5678i3);
/* 191 */                           int top = viewM5678i3.getTop();
/* 197 */                           int iMo623N = hu0Var.mo623N(((int) f2) + top, viewM5678i3);
/* 201 */                           int iMo624i0 = hu0Var.mo624i0(viewM5678i3);
/* 205 */                           int iMo4365j0 = hu0Var.mo4365j0();
/* 209 */                           if ((iMo624i0 == 0 || (iMo624i0 > 0 && iMo622M == left)) && (iMo4365j0 == 0 || (iMo4365j0 > 0 && iMo623N == top))) {
                                        break;
                                    }
/* 222 */                           m5683o(f, f2, pointerId3);
/* 227 */                           if (this.f12040a != 1 || (z && m5690v(pointerId3, viewM5678i3))) {
                                        break;
                                    }
                                }
                            }
                        }
/* 242 */               m5685q(motionEvent);
                    }
                    return this.f12040a == 1;
                }

                /* JADX INFO: renamed from: u */
                public final boolean m5689u(View view, int i, int i2) {
/* 1 */             this.f12059t = view;
/* 4 */             this.f12042c = -1;
/* 7 */             boolean zM5679j = m5679j(i, i2, 0, 0);
/* 11 */            if (!zM5679j && this.f12040a == 0 && this.f12059t != null) {
/* 22 */                this.f12059t = null;
                    }
/* 24 */            return zM5679j;
                }

                /* JADX INFO: renamed from: v */
                public final boolean m5690v(int i, View view) {
/* 4 */             if (view == this.f12059t && this.f12042c == i) {
/* 3 */                 return true;
                    }
/* 11 */            if (view == null || !this.f12058s.mo621G0(i, view)) {
/* 27 */                return false;
                    }
/* 21 */            this.f12042c = i;
/* 23 */            m5672c(i, view);
/* 3 */             return true;
                }
            }
