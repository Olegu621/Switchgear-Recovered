            package p000;

            import android.animation.Animator;
            import android.animation.ValueAnimator;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.TextView;
            import androidx.transition.Transition;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jn2 extends Transition {
                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 5 */             if (view instanceof TextView) {
/* 21 */                or2Var.f14872a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 5 */             if (view instanceof TextView) {
/* 21 */                or2Var.f14872a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var == null || or2Var2 == null || !(or2Var.f14873b instanceof TextView)) {
/* 90 */                return null;
                    }
/* 11 */            View view = or2Var2.f14873b;
/* 15 */            if (!(view instanceof TextView)) {
/* 90 */                return null;
                    }
/* 18 */            TextView textView = (TextView) view;
/* 20 */            HashMap map = or2Var.f14872a;
/* 22 */            HashMap map2 = or2Var2.f14872a;
/* 45 */            float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
/* 58 */            float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
/* 64 */            if (fFloatValue == fFloatValue2) {
/* 90 */                return null;
                    }
/* 76 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
/* 86 */            valueAnimatorOfFloat.addUpdateListener(new C2184sk(textView, 7));
/* 89 */            return valueAnimatorOfFloat;
                }
            }
