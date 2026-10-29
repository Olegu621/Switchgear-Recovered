            package androidx.transition;

            import android.animation.Animator;
            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import p000.C2268uu;
            import p000.b40;
            import p000.mn0;
            import p000.or2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Explode extends Visibility {

                /* JADX INFO: renamed from: m0 */
                public static final DecelerateInterpolator f1869m0 = new DecelerateInterpolator();

                /* JADX INFO: renamed from: n0 */
                public static final AccelerateInterpolator f1870n0 = new AccelerateInterpolator();

                /* JADX INFO: renamed from: l0 */
                public final int[] f1871l0;

                public Explode(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 7 */             this.f1871l0 = new int[2];
/* 14 */            this.f1900d0 = new C2268uu();
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: J */
                public final Animator mo1073J(ViewGroup viewGroup, View view, or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var2 == null) {
/* 3 */                 return null;
                    }
/* 13 */            Rect rect = (Rect) or2Var2.f14872a.get("android:explode:screenBounds");
/* 15 */            float translationX = view.getTranslationX();
/* 19 */            float translationY = view.getTranslationY();
/* 23 */            int[] iArr = this.f1871l0;
/* 25 */            m1075M(viewGroup, rect, iArr);
/* 49 */            return b40.m1226j(view, or2Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f1869m0, this);
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: K */
                public final Animator mo1074K(ViewGroup viewGroup, View view, or2 or2Var) {
                    float f;
                    float f2;
/* 1 */             if (or2Var == null) {
/* 3 */                 return null;
                    }
/* 13 */            Rect rect = (Rect) or2Var.f14872a.get("android:explode:screenBounds");
/* 15 */            int i = rect.left;
/* 17 */            int i2 = rect.top;
/* 19 */            float translationX = view.getTranslationX();
/* 23 */            float translationY = view.getTranslationY();
/* 35 */            int[] iArr = (int[]) or2Var.f14873b.getTag(R$id.transition_position);
/* 39 */            if (iArr != null) {
/* 41 */                int i3 = iArr[0];
/* 48 */                f = (i3 - rect.left) + translationX;
/* 49 */                int i4 = iArr[1];
/* 56 */                f2 = (i4 - rect.top) + translationY;
/* 57 */                rect.offsetTo(i3, i4);
                    } else {
/* 61 */                f = translationX;
/* 62 */                f2 = translationY;
                    }
/* 63 */            int[] iArr2 = this.f1871l0;
/* 65 */            m1075M(viewGroup, rect, iArr2);
/* 83 */            return b40.m1226j(view, or2Var, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f1870n0, this);
                }

                /* JADX INFO: renamed from: M */
                public final void m1075M(ViewGroup viewGroup, Rect rect, int[] iArr) {
                    int iCenterX;
                    int iCenterY;
/* 1 */             int[] iArr2 = this.f1871l0;
/* 3 */             viewGroup.getLocationOnScreen(iArr2);
/* 7 */             int i = iArr2[0];
/* 10 */            int i2 = iArr2[1];
/* 12 */            mn0 mn0Var = this.f1902e0;
/* 18 */            Rect rectM6710w = mn0Var == null ? null : mn0Var.m6710w();
/* 22 */            if (rectM6710w == null) {
/* 39 */                iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
/* 55 */                iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
                    } else {
/* 57 */                iCenterX = rectM6710w.centerX();
/* 61 */                iCenterY = rectM6710w.centerY();
                    }
/* 73 */            float fCenterX = rect.centerX() - iCenterX;
/* 75 */            float fCenterY = rect.centerY() - iCenterY;
/* 80 */            if (fCenterX == 0.0f && fCenterY == 0.0f) {
/* 96 */                fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
/* 103 */               fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
                    }
/* 115 */           float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
/* 118 */           int i3 = iCenterX - i;
/* 119 */           int i4 = iCenterY - i2;
/* 125 */           float fMax = Math.max(i3, viewGroup.getWidth() - i3);
/* 134 */           float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
/* 148 */           float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
/* 154 */           iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
/* 161 */           iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
                }

                /* JADX INFO: renamed from: N */
                public final void m1076N(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 3 */             int[] iArr = this.f1871l0;
/* 5 */             view.getLocationOnScreen(iArr);
/* 9 */             int i = iArr[0];
/* 12 */            int i2 = iArr[1];
/* 33 */            or2Var.f14872a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
                }

                @Override // androidx.transition.Visibility, androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             Visibility.m1113H(or2Var);
/* 4 */             m1076N(or2Var);
                }

                @Override // androidx.transition.Visibility, androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             Visibility.m1113H(or2Var);
/* 4 */             m1076N(or2Var);
                }
            }
