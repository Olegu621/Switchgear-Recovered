            package p000;

            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class em0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final float f7792a;

                /* JADX INFO: renamed from: b */
                public final int f7793b;

                /* JADX INFO: renamed from: c */
                public final int f7794c;

                /* JADX INFO: renamed from: d */
                public final View f7795d;

                /* JADX INFO: renamed from: e */
                public dm0 f7796e;

                /* JADX INFO: renamed from: f */
                public dm0 f7797f;

                /* JADX INFO: renamed from: i */
                public boolean f7798i;

                /* JADX INFO: renamed from: v */
                public int f7799v;

                /* JADX INFO: renamed from: w */
                public final int[] f7800w = new int[2];

                public em0(View view) {
/* 9 */             this.f7795d = view;
/* 12 */            view.setLongClickable(true);
/* 15 */            view.addOnAttachStateChangeListener(this);
/* 31 */            this.f7792a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
/* 33 */            int tapTimeout = ViewConfiguration.getTapTimeout();
/* 37 */            this.f7793b = tapTimeout;
/* 45 */            this.f7794c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
                }

                /* JADX INFO: renamed from: a */
                public final void m3491a() {
/* 1 */             dm0 dm0Var = this.f7797f;
/* 3 */             View view = this.f7795d;
/* 5 */             if (dm0Var != null) {
/* 7 */                 view.removeCallbacks(dm0Var);
                    }
/* 10 */            dm0 dm0Var2 = this.f7796e;
/* 12 */            if (dm0Var2 != null) {
/* 14 */                view.removeCallbacks(dm0Var2);
                    }
                }

                /* JADX INFO: renamed from: b */
                public abstract vd2 mo1200b();

                /* JADX INFO: renamed from: c */
                public abstract boolean mo1201c();

                /* JADX INFO: renamed from: d */
                public boolean mo1202d() {
/* 1 */             vd2 vd2VarMo1200b = mo1200b();
/* 5 */             if (vd2VarMo1200b == null || !vd2VarMo1200b.mo365a()) {
/* 16 */                return true;
                    }
/* 13 */            vd2VarMo1200b.dismiss();
/* 16 */            return true;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x005c  */
                /* JADX WARN: Code duplicated, block: B:24:0x0062  */
                /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    ra0 ra0VarMo370j;
/* 1 */             boolean z2 = this.f7798i;
/* 4 */             View view2 = this.f7795d;
/* 8 */             if (z2) {
/* 10 */                vd2 vd2VarMo1200b = mo1200b();
/* 14 */                if (vd2VarMo1200b != null && vd2VarMo1200b.mo365a() && (ra0VarMo370j = vd2VarMo1200b.mo370j()) != null && ra0VarMo370j.isShown()) {
/* 36 */                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
/* 40 */                    int[] iArr = this.f7800w;
/* 42 */                    view2.getLocationOnScreen(iArr);
/* 51 */                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
/* 54 */                    ra0VarMo370j.getLocationOnScreen(iArr);
/* 65 */                    motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
/* 70 */                    boolean zM8099b = ra0VarMo370j.m8099b(motionEventObtainNoHistory, this.f7799v);
/* 74 */                    motionEventObtainNoHistory.recycle();
/* 77 */                    int actionMasked = motionEvent.getActionMasked();
/* 87 */                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
/* 88 */                    if (zM8099b && z3) {
/* 99 */                        z = true;
                            } else if (mo1202d()) {
/* 102 */                       z = false;
                            } else {
/* 99 */                        z = true;
                            }
                        } else if (mo1202d()) {
/* 99 */                    z = true;
                        } else {
/* 102 */                   z = false;
                        }
                    } else {
/* 109 */               if (view2.isEnabled()) {
/* 113 */                   int actionMasked2 = motionEvent.getActionMasked();
/* 117 */                   if (actionMasked2 == 0) {
/* 212 */                       this.f7799v = motionEvent.getPointerId(0);
/* 216 */                       if (this.f7796e == null) {
/* 223 */                           this.f7796e = new dm0(this, 0);
                                }
/* 230 */                       view2.postDelayed(this.f7796e, this.f7793b);
/* 235 */                       if (this.f7797f == null) {
/* 242 */                           this.f7797f = new dm0(this, 1);
                                }
/* 249 */                       view2.postDelayed(this.f7797f, this.f7794c);
                            } else if (actionMasked2 == 1) {
/* 204 */                       m3491a();
                            } else if (actionMasked2 == 2) {
/* 130 */                       int iFindPointerIndex = motionEvent.findPointerIndex(this.f7799v);
/* 134 */                       if (iFindPointerIndex >= 0) {
/* 136 */                           float x = motionEvent.getX(iFindPointerIndex);
/* 140 */                           float y = motionEvent.getY(iFindPointerIndex);
/* 144 */                           float f = this.f7792a;
/* 146 */                           float f2 = -f;
/* 149 */                           if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
/* 186 */                               m3491a();
/* 193 */                               view2.getParent().requestDisallowInterceptTouchEvent(true);
/* 200 */                               if (mo1201c()) {
/* 202 */                                   z = true;
                                        }
                                    }
                                }
                            } else if (actionMasked2 == 3) {
/* 204 */                       m3491a();
                            }
/* 252 */                   z = false;
                        } else {
/* 252 */                   z = false;
                        }
/* 253 */               if (z) {
/* 255 */                   long jUptimeMillis = SystemClock.uptimeMillis();
/* 264 */                   MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 268 */                   view2.onTouchEvent(motionEventObtain);
/* 271 */                   motionEventObtain.recycle();
                        }
                    }
/* 274 */           this.f7798i = z;
                    return z || z2;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 2 */             this.f7798i = false;
/* 5 */             this.f7799v = -1;
/* 7 */             dm0 dm0Var = this.f7796e;
/* 9 */             if (dm0Var != null) {
/* 13 */                this.f7795d.removeCallbacks(dm0Var);
                    }
                }
            }
