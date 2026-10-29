            package p000;

            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z33 extends a43 {

                /* JADX INFO: renamed from: d */
                public boolean f19924d;

                @Override // p000.a43
                /* JADX INFO: renamed from: d */
                public final void mo58d(View view, float f) {
                    Method method;
/* 7 */             if (view instanceof MotionLayout) {
/* 15 */                ((MotionLayout) view).setProgress(m56a(f));
/* 18 */                return;
                    }
/* 21 */            if (this.f19924d) {
/* 74 */                return;
                    }
                    try {
/* 36 */                method = view.getClass().getMethod("setProgress", Float.TYPE);
                    } catch (NoSuchMethodException unused) {
/* 42 */                this.f19924d = true;
/* 44 */                method = null;
                    }
/* 45 */            if (method != null) {
                        try {
/* 59 */                    method.invoke(view, Float.valueOf(m56a(f)));
                        } catch (IllegalAccessException e) {
/* 71 */                    AbstractC1245n0.m4877e("ViewOscillator", "unable to setProgress", e);
                        } catch (InvocationTargetException e2) {
/* 67 */                    AbstractC1245n0.m4877e("ViewOscillator", "unable to setProgress", e2);
                        }
                    }
                }
            }
