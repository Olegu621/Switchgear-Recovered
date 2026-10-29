            package androidx.transition;

            import android.animation.Animator;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import java.util.HashMap;
            import p000.AbstractC2155rs;
            import p000.C1938ms;
            import p000.C2493yc;
            import p000.kd1;
            import p000.ld1;
            import p000.mr2;
            import p000.or2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChangeImageTransform extends Transition {

                /* JADX INFO: renamed from: j0 */
                public static final String[] f1858j0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

                /* JADX INFO: renamed from: k0 */
                public static final C2493yc f1859k0 = new C2493yc(1);

                /* JADX INFO: renamed from: l0 */
                public static final C1938ms f1860l0 = new C1938ms("animatedTransform", Matrix.class, 5);

                public ChangeImageTransform(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                /* JADX INFO: renamed from: H */
                public static void m1070H(or2 or2Var) {
                    Matrix matrix;
/* 1 */             View view = or2Var.f14873b;
/* 5 */             if ((view instanceof ImageView) && view.getVisibility() == 0) {
/* 16 */                ImageView imageView = (ImageView) view;
/* 22 */                if (imageView.getDrawable() == null) {
/* 211 */                   return;
                        }
/* 26 */                HashMap map = or2Var.f14872a;
/* 51 */                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
/* 54 */                Drawable drawable = imageView.getDrawable();
/* 62 */                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
/* 203 */                   matrix = new Matrix(imageView.getImageMatrix());
                        } else {
/* 80 */                    int i = AbstractC2155rs.f16253a[imageView.getScaleType().ordinal()];
/* 83 */                    if (i == 1) {
/* 161 */                       Drawable drawable2 = imageView.getDrawable();
/* 167 */                       Matrix matrix2 = new Matrix();
/* 192 */                       matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
/* 195 */                       matrix = matrix2;
                            } else if (i != 2) {
/* 94 */                        matrix = new Matrix(imageView.getImageMatrix());
                            } else {
/* 98 */                        Drawable drawable3 = imageView.getDrawable();
/* 102 */                       int intrinsicWidth = drawable3.getIntrinsicWidth();
/* 106 */                       float width = imageView.getWidth();
                                float f = intrinsicWidth;
/* 114 */                       int intrinsicHeight = drawable3.getIntrinsicHeight();
/* 118 */                       float height = imageView.getHeight();
                                float f2 = intrinsicHeight;
/* 126 */                       float fMax = Math.max(width / f, height / f2);
/* 136 */                       int iRound = Math.round((width - (f * fMax)) / 2.0f);
/* 142 */                       int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
/* 148 */                       Matrix matrix3 = new Matrix();
/* 151 */                       matrix3.postScale(fMax, fMax);
/* 156 */                       matrix3.postTranslate(iRound, iRound2);
/* 159 */                       matrix = matrix3;
                            }
                        }
/* 208 */               map.put("android:changeImageTransform:matrix", matrix);
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             m1070H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             m1070H(or2Var);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var == null) {
/* 134 */               return null;
                    }
/* 3 */             HashMap map = or2Var.f14872a;
/* 5 */             if (or2Var2 == null) {
/* 134 */               return null;
                    }
/* 9 */             HashMap map2 = or2Var2.f14872a;
/* 17 */            Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
/* 23 */            Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
/* 25 */            if (rect == null || rect2 == null) {
/* 134 */               return null;
                    }
/* 36 */            Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
/* 42 */            Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
/* 60 */            boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
/* 65 */            if (rect.equals(rect2) && z) {
/* 134 */               return null;
                    }
/* 72 */            ImageView imageView = (ImageView) or2Var2.f14873b;
/* 74 */            Drawable drawable = imageView.getDrawable();
/* 78 */            int intrinsicWidth = drawable.getIntrinsicWidth();
/* 82 */            int intrinsicHeight = drawable.getIntrinsicHeight();
/* 86 */            C1938ms c1938ms = f1860l0;
/* 88 */            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
/* 121 */               kd1 kd1Var = ld1.f13196a;
/* 129 */               return ObjectAnimator.ofObject(imageView, c1938ms, f1859k0, kd1Var, kd1Var);
                    }
/* 93 */            if (matrix == null) {
/* 95 */                matrix = ld1.f13196a;
                    }
/* 97 */            if (matrix2 == null) {
/* 99 */                matrix2 = ld1.f13196a;
                    }
/* 101 */           c1938ms.set(imageView, matrix);
/* 113 */           return ObjectAnimator.ofObject(imageView, c1938ms, new mr2(), matrix, matrix2);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1858j0;
                }
            }
