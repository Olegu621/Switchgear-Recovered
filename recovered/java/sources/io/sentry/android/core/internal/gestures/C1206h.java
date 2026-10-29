            package io.sentry.android.core.internal.gestures;

            import android.app.Activity;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.Window;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.internal.gestures.C1507b;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1709h;
            import java.util.Collections;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1206h extends AbstractWindowCallbackC1208j {

                /* JADX INFO: renamed from: b */
                public final Window.Callback f10095b;

                /* JADX INFO: renamed from: c */
                public final GestureDetectorOnGestureListenerC1205g f10096c;

                /* JADX INFO: renamed from: d */
                public final C1201c f10097d;

                /* JADX INFO: renamed from: e */
                public final C1554m6 f10098e;

                /* JADX INFO: renamed from: f */
                public final C1709h f10099f;

                /* JADX INFO: renamed from: i */
                public volatile boolean f10100i;

                public C1206h(Window.Callback callback, Activity activity, GestureDetectorOnGestureListenerC1205g gestureDetectorOnGestureListenerC1205g, C1554m6 c1554m6) {
/* 3 */             C1201c c1201c = new C1201c(activity, gestureDetectorOnGestureListenerC1205g);
/* 8 */             C1709h c1709h = new C1709h();
/* 11 */            super(callback);
/* 14 */            this.f10095b = callback;
/* 16 */            this.f10096c = gestureDetectorOnGestureListenerC1205g;
/* 18 */            this.f10098e = c1554m6;
/* 20 */            this.f10097d = c1201c;
/* 22 */            this.f10099f = c1709h;
                }

                /* JADX INFO: renamed from: a */
                public final void m4816a(MotionEvent motionEvent) {
                    String str;
/* 3 */             if (this.f10100i) {
/* 338 */               return;
                    }
/* 7 */             C1201c c1201c = this.f10097d;
/* 9 */             int i = c1201c.f10072c;
/* 11 */            GestureDetectorOnGestureListenerC1205g gestureDetectorOnGestureListenerC1205g = c1201c.f10070a;
/* 13 */            C1702a c1702a = c1201c.f10082m;
/* 15 */            c1702a.m5443c();
                    try {
/* 18 */                int actionMasked = motionEvent.getActionMasked();
/* 24 */                if (c1201c.f10081l == null) {
/* 30 */                    c1201c.f10081l = VelocityTracker.obtain();
                        }
/* 38 */                c1201c.f10081l.addMovement(motionEvent);
/* 43 */                if (actionMasked == 0) {
/* 185 */                   c1201c.f10076g = motionEvent.getX();
/* 187 */                   float y = motionEvent.getY();
/* 191 */                   c1201c.f10077h = y;
/* 195 */                   c1201c.f10078i = c1201c.f10076g;
/* 197 */                   c1201c.f10079j = y;
/* 199 */                   c1201c.f10074e = true;
/* 201 */                   c1201c.f10075f = false;
/* 203 */                   MotionEvent motionEvent2 = c1201c.f10080k;
/* 205 */                   if (motionEvent2 != null) {
/* 207 */                       motionEvent2.recycle();
                            }
/* 214 */                   c1201c.f10080k = MotionEvent.obtain(motionEvent);
/* 216 */                   gestureDetectorOnGestureListenerC1205g.onDown(motionEvent);
                        } else if (actionMasked != 1) {
/* 48 */                    if (actionMasked == 2) {
/* 69 */                        float x = motionEvent.getX();
/* 73 */                        float y2 = motionEvent.getY();
/* 79 */                        float f = x - c1201c.f10076g;
/* 83 */                        float f2 = y2 - c1201c.f10077h;
/* 93 */                        if ((f2 * f2) + (f * f) > c1201c.f10071b) {
/* 103 */                           gestureDetectorOnGestureListenerC1205g.onScroll(c1201c.f10080k, motionEvent, c1201c.f10078i - x, c1201c.f10079j - y2);
/* 106 */                           c1201c.f10074e = false;
/* 108 */                           c1201c.f10078i = x;
/* 110 */                           c1201c.f10079j = y2;
                                }
                            } else if (actionMasked == 3) {
/* 64 */                        c1201c.m4811a();
                            } else if (actionMasked == 5) {
/* 58 */                        c1201c.f10074e = false;
/* 60 */                        c1201c.f10075f = true;
                            }
                        } else if (c1201c.f10075f) {
/* 117 */                   c1201c.m4811a();
                        } else {
/* 123 */                   if (c1201c.f10074e) {
/* 125 */                       gestureDetectorOnGestureListenerC1205g.onSingleTapUp(motionEvent);
                            } else {
/* 129 */                       int pointerId = motionEvent.getPointerId(0);
/* 140 */                       c1201c.f10081l.computeCurrentVelocity(1000, c1201c.f10073d);
/* 145 */                       float xVelocity = c1201c.f10081l.getXVelocity(pointerId);
/* 151 */                       float yVelocity = c1201c.f10081l.getYVelocity(pointerId);
                                float f3 = i;
/* 162 */                       if (Math.abs(xVelocity) > f3 || Math.abs(yVelocity) > f3) {
/* 174 */                           gestureDetectorOnGestureListenerC1205g.onFling(c1201c.f10080k, motionEvent, xVelocity, yVelocity);
                                }
                            }
/* 177 */                   c1201c.m4811a();
                        }
/* 219 */               c1702a.close();
/* 226 */               if (motionEvent.getActionMasked() == 1) {
/* 228 */                   GestureDetectorOnGestureListenerC1205g gestureDetectorOnGestureListenerC1205g2 = this.f10096c;
/* 232 */                   View viewM4813b = gestureDetectorOnGestureListenerC1205g2.m4813b("onUp");
/* 236 */                   C1204f c1204f = gestureDetectorOnGestureListenerC1205g2.f10094g;
/* 238 */                   C1507b c1507b = c1204f.f10085b;
/* 240 */                   if (viewM4813b == null || c1507b == null) {
/* 338 */                       return;
                            }
/* 245 */                   EnumC1203e enumC1203e = c1204f.f10084a;
/* 247 */                   EnumC1203e enumC1203e2 = EnumC1203e.Unknown;
/* 249 */                   if (enumC1203e == enumC1203e2) {
/* 263 */                       gestureDetectorOnGestureListenerC1205g2.f10090c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
/* 266 */                       return;
                            }
/* 273 */                   float x2 = motionEvent.getX() - c1204f.f10086c;
/* 280 */                   float y3 = motionEvent.getY() - c1204f.f10087d;
/* 292 */                   if (Math.abs(x2) > Math.abs(y3)) {
/* 301 */                       str = x2 > 0.0f ? "right" : "left";
                            } else {
/* 311 */                       str = y3 > 0.0f ? "down" : "up";
                            }
/* 321 */                   gestureDetectorOnGestureListenerC1205g2.m4812a(c1507b, c1204f.f10084a, Collections.singletonMap("direction", str), motionEvent);
/* 326 */                   gestureDetectorOnGestureListenerC1205g2.m4814c(c1507b, c1204f.f10084a);
/* 330 */                   c1204f.f10085b = null;
/* 332 */                   c1204f.f10084a = enumC1203e2;
/* 334 */                   c1204f.f10086c = 0.0f;
/* 336 */                   c1204f.f10087d = 0.0f;
                        }
                    } catch (Throwable th) {
                        try {
/* 339 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 344 */                   th.addSuppressed(th2);
                        }
/* 347 */               throw th;
                    }
                }

                @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1208j, android.view.Window.Callback
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             if (motionEvent != null) {
/* 5 */                 this.f10099f.getClass();
/* 8 */                 MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        try {
/* 12 */                    m4816a(motionEventObtain);
                        } catch (Throwable th) {
/* 20 */                    C1554m6 c1554m6 = this.f10098e;
/* 22 */                    if (c1554m6 != null) {
                                try {
/* 32 */                            c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Error dispatching touch event", th);
                                } finally {
/* 37 */                            motionEventObtain.recycle();
                                }
                            }
                        }
                    }
/* 43 */            return this.f10104a.dispatchTouchEvent(motionEvent);
                }
            }
