            package androidx.transition;

            import android.animation.Animator;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import p000.k50;
            import p000.l53;
            import p000.or2;
            import p000.rg0;
            import p000.tg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public class Fade extends Visibility {
                public Fade(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12591f);
/* 12 */            int i = this.f1914j0;
/* 28 */            m1115L(k50.m5988y((XmlResourceParser) attributeSet, "fadingMode") ? typedArrayObtainStyledAttributes.getInt(0, i) : i);
/* 31 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: J */
                public final Animator mo1073J(ViewGroup viewGroup, View view, or2 or2Var, or2 or2Var2) {
                    Float f;
/* 21 */            float fFloatValue = (or2Var == null || (f = (Float) or2Var.f14872a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
/* 30 */            return m1077M(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: K */
                public final Animator mo1074K(ViewGroup viewGroup, View view, or2 or2Var) {
                    Float f;
/* 3 */             l53.f13119a.getClass();
/* 28 */            return m1077M(view, (or2Var == null || (f = (Float) or2Var.f14872a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
                }

                /* JADX INFO: renamed from: M */
                public final ObjectAnimator m1077M(View view, float f, float f2) {
/* 3 */             if (f == f2) {
/* 5 */                 return null;
                    }
/* 7 */             l53.m6343b(view, f);
/* 18 */            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, l53.f13120b, f2);
/* 27 */            objectAnimatorOfFloat.addListener(new rg0(view));
/* 35 */            m1090a(new tg0(view, 0));
/* 38 */            return objectAnimatorOfFloat;
                }

                @Override // androidx.transition.Visibility, androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             Visibility.m1113H(or2Var);
/* 20 */            or2Var.f14872a.put("android:fade:transitionAlpha", Float.valueOf(l53.f13119a.mo7104u(or2Var.f14873b)));
                }

/* 34 */        public Fade(int i) {
/* 36 */            m1115L(i);
                }
            }
