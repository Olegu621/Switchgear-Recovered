            package io.sentry.android.core.internal.gestures;

            import android.content.Context;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.ViewConfiguration;
            import io.sentry.util.C1702a;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1201c {

                /* JADX INFO: renamed from: a */
                public final GestureDetectorOnGestureListenerC1205g f10070a;

                /* JADX INFO: renamed from: b */
                public final int f10071b;

                /* JADX INFO: renamed from: c */
                public final int f10072c;

                /* JADX INFO: renamed from: d */
                public final int f10073d;

                /* JADX INFO: renamed from: e */
                public boolean f10074e;

                /* JADX INFO: renamed from: f */
                public boolean f10075f;

                /* JADX INFO: renamed from: g */
                public float f10076g;

                /* JADX INFO: renamed from: h */
                public float f10077h;

                /* JADX INFO: renamed from: i */
                public float f10078i;

                /* JADX INFO: renamed from: j */
                public float f10079j;

                /* JADX INFO: renamed from: k */
                public MotionEvent f10080k;

                /* JADX INFO: renamed from: l */
                public VelocityTracker f10081l;

                /* JADX INFO: renamed from: m */
                public final C1702a f10082m = new C1702a();

                public C1201c(Context context, GestureDetectorOnGestureListenerC1205g gestureDetectorOnGestureListenerC1205g) {
/* 11 */            this.f10070a = gestureDetectorOnGestureListenerC1205g;
/* 13 */            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 17 */            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
/* 22 */            this.f10071b = scaledTouchSlop * scaledTouchSlop;
/* 28 */            this.f10072c = viewConfiguration.getScaledMinimumFlingVelocity();
/* 34 */            this.f10073d = viewConfiguration.getScaledMaximumFlingVelocity();
                }

                /* JADX INFO: renamed from: a */
                public final void m4811a() {
/* 1 */             C1702a c1702a = this.f10082m;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 MotionEvent motionEvent = this.f10080k;
/* 9 */                 this.f10080k = null;
/* 11 */                VelocityTracker velocityTracker = this.f10081l;
/* 13 */                this.f10081l = null;
/* 15 */                c1702a.close();
/* 18 */                if (motionEvent != null) {
/* 20 */                    motionEvent.recycle();
                        }
/* 23 */                if (velocityTracker != null) {
/* 25 */                    velocityTracker.recycle();
                        }
                    } catch (Throwable th) {
                        try {
/* 30 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 35 */                    th.addSuppressed(th2);
                        }
/* 38 */                throw th;
                    }
                }
            }
