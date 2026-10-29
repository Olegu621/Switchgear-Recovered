            package androidx.transition;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.HashMap;
            import p000.nr2;
            import p000.or2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChangeScroll extends Transition {

                /* JADX INFO: renamed from: j0 */
                public static final String[] f1861j0 = {"android:changeScroll:x", "android:changeScroll:y"};

                public ChangeScroll(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                /* JADX INFO: renamed from: H */
                public static void m1071H(or2 or2Var) {
/* 1 */             HashMap map = or2Var.f14872a;
/* 3 */             View view = or2Var.f14873b;
/* 15 */            map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
/* 28 */            map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             m1071H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             m1071H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
                    ObjectAnimator objectAnimatorOfInt;
/* 1 */             ObjectAnimator objectAnimatorOfInt2 = null;
/* 2 */             if (or2Var != null) {
/* 4 */                 HashMap map = or2Var.f14872a;
/* 6 */                 if (or2Var2 != null) {
/* 9 */                     HashMap map2 = or2Var2.f14872a;
/* 11 */                    View view = or2Var2.f14873b;
/* 21 */                    int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
/* 31 */                    int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
/* 43 */                    int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
/* 53 */                    int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
/* 57 */                    if (iIntValue != iIntValue2) {
/* 59 */                        view.setScrollX(iIntValue);
/* 68 */                        objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                            } else {
/* 73 */                        objectAnimatorOfInt = null;
                            }
/* 74 */                    if (iIntValue3 != iIntValue4) {
/* 76 */                        view.setScrollY(iIntValue3);
/* 85 */                        objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                            }
/* 89 */                    boolean z = nr2.f14417a;
/* 91 */                    if (objectAnimatorOfInt == null) {
/* 93 */                        return objectAnimatorOfInt2;
                            }
/* 94 */                    if (objectAnimatorOfInt2 == null) {
/* 96 */                        return objectAnimatorOfInt;
                            }
/* 99 */                    AnimatorSet animatorSet = new AnimatorSet();
/* 111 */                   animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
/* 114 */                   return animatorSet;
                        }
                    }
/* 1 */             return null;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1861j0;
                }
            }
