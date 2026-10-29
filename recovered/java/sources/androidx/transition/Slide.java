            package androidx.transition;

            import android.animation.Animator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import org.xmlpull.v1.XmlPullParser;
            import p000.C1951n4;
            import p000.b40;
            import p000.k50;
            import p000.or2;
            import p000.wd2;
            import p000.xe2;
            import p000.ye2;
            import p000.ze2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Slide extends Visibility {

                /* JADX INFO: renamed from: m0 */
                public static final DecelerateInterpolator f1875m0 = new DecelerateInterpolator();

                /* JADX INFO: renamed from: n0 */
                public static final AccelerateInterpolator f1876n0 = new AccelerateInterpolator();

                /* JADX INFO: renamed from: o0 */
                public static final xe2 f1877o0 = new xe2(0);

                /* JADX INFO: renamed from: p0 */
                public static final xe2 f1878p0 = new xe2(1);

                /* JADX INFO: renamed from: q0 */
                public static final ye2 f1879q0 = new ye2(0);

                /* JADX INFO: renamed from: r0 */
                public static final xe2 f1880r0 = new xe2(2);

                /* JADX INFO: renamed from: s0 */
                public static final xe2 f1881s0 = new xe2(3);

                /* JADX INFO: renamed from: t0 */
                public static final ye2 f1882t0 = new ye2(1);

                /* JADX INFO: renamed from: l0 */
                public ze2 f1883l0;

                public Slide(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             this.f1883l0 = f1882t0;
/* 10 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12593h);
/* 28 */            int i = k50.m5988y((XmlPullParser) attributeSet, "slideEdge") ? typedArrayObtainStyledAttributes.getInt(0, 80) : 80;
/* 32 */            typedArrayObtainStyledAttributes.recycle();
/* 35 */            m1079M(i);
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: J */
                public final Animator mo1073J(ViewGroup viewGroup, View view, or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var2 == null) {
/* 3 */                 return null;
                    }
/* 13 */            int[] iArr = (int[]) or2Var2.f14872a.get("android:slide:screenPosition");
/* 15 */            float translationX = view.getTranslationX();
/* 19 */            float translationY = view.getTranslationY();
/* 46 */            return b40.m1226j(view, or2Var2, iArr[0], iArr[1], this.f1883l0.mo3045b(viewGroup, view), this.f1883l0.mo9789a(viewGroup, view), translationX, translationY, f1875m0, this);
                }

                @Override // androidx.transition.Visibility
                /* JADX INFO: renamed from: K */
                public final Animator mo1074K(ViewGroup viewGroup, View view, or2 or2Var) {
/* 1 */             if (or2Var == null) {
/* 3 */                 return null;
                    }
/* 13 */            int[] iArr = (int[]) or2Var.f14872a.get("android:slide:screenPosition");
/* 46 */            return b40.m1226j(view, or2Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f1883l0.mo3045b(viewGroup, view), this.f1883l0.mo9789a(viewGroup, view), f1876n0, this);
                }

                /* JADX INFO: renamed from: M */
                public final void m1079M(int i) {
/* 2 */             if (i == 3) {
/* 58 */                this.f1883l0 = f1877o0;
                    } else if (i == 5) {
/* 53 */                this.f1883l0 = f1880r0;
                    } else if (i == 48) {
/* 48 */                this.f1883l0 = f1879q0;
                    } else if (i == 80) {
/* 43 */                this.f1883l0 = f1882t0;
                    } else if (i == 8388611) {
/* 38 */                this.f1883l0 = f1878p0;
                    } else {
/* 23 */                if (i != 8388613) {
/* 32 */                    C1951n4.m6859j("Invalid slide direction");
/* 35 */                    return;
                        }
/* 27 */                this.f1883l0 = f1881s0;
                    }
/* 62 */            wd2 wd2Var = new wd2();
/* 65 */            wd2Var.f18589e = i;
/* 67 */            this.f1900d0 = wd2Var;
                }

                @Override // androidx.transition.Visibility, androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             Visibility.m1113H(or2Var);
/* 7 */             int[] iArr = new int[2];
/* 9 */             or2Var.f14873b.getLocationOnScreen(iArr);
/* 16 */            or2Var.f14872a.put("android:slide:screenPosition", iArr);
                }

                @Override // androidx.transition.Visibility, androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             Visibility.m1113H(or2Var);
/* 7 */             int[] iArr = new int[2];
/* 9 */             or2Var.f14873b.getLocationOnScreen(iArr);
/* 16 */            or2Var.f14872a.put("android:slide:screenPosition", iArr);
                }
            }
