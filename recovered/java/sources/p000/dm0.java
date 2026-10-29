            package p000;

            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewParent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dm0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7315a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ em0 f7316b;

                public /* synthetic */ dm0(em0 em0Var, int i) {
/* 1 */             this.f7315a = i;
/* 3 */             this.f7316b = em0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7315a;
/* 4 */             em0 em0Var = this.f7316b;
                    switch (i) {
                        case 0:
/* 65 */                    ViewParent parent = em0Var.f7795d.getParent();
/* 69 */                    if (parent != null) {
/* 71 */                        parent.requestDisallowInterceptTouchEvent(true);
                            }
                            break;
                        default:
/* 9 */                     em0Var.m3491a();
/* 12 */                    View view = em0Var.f7795d;
/* 18 */                    if (view.isEnabled() && !view.isLongClickable() && em0Var.mo1201c()) {
/* 38 */                        view.getParent().requestDisallowInterceptTouchEvent(true);
/* 41 */                        long jUptimeMillis = SystemClock.uptimeMillis();
/* 50 */                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 54 */                        view.onTouchEvent(motionEventObtain);
/* 57 */                        motionEventObtain.recycle();
/* 60 */                        em0Var.f7798i = true;
                                break;
                            }
                            break;
                    }
                }
            }
