            package p000;

            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b53 extends c53 {

                /* JADX INFO: renamed from: g */
                public boolean f2232g;

                @Override // p000.c53
                /* JADX INFO: renamed from: b */
                public final boolean mo67b(float f, long j, d31 d31Var, View view) {
                    Method method;
/* 7 */             if (view instanceof MotionLayout) {
/* 16 */                ((MotionLayout) view).setProgress(m1537a(f, j, d31Var, view));
                    } else {
/* 22 */                if (this.f2232g) {
/* 24 */                    return false;
                        }
                        try {
/* 38 */                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                        } catch (NoSuchMethodException unused) {
/* 44 */                    this.f2232g = true;
/* 46 */                    method = null;
                        }
/* 47 */                if (method != null) {
                            try {
/* 61 */                        method.invoke(view, Float.valueOf(m1537a(f, j, d31Var, view)));
                            } catch (IllegalAccessException e) {
/* 75 */                        AbstractC1245n0.m4877e("ViewTimeCycle", "unable to setProgress", e);
                            } catch (InvocationTargetException e2) {
/* 71 */                        AbstractC1245n0.m4877e("ViewTimeCycle", "unable to setProgress", e2);
                            }
                        }
                    }
/* 78 */            return this.f2729d;
                }
            }
