            package androidx.transition;

            import android.animation.Animator;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import p000.C2315w1;
            import p000.e33;
            import p000.l53;
            import p000.or2;
            import p000.pj0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChangeClipBounds extends Transition {

                /* JADX INFO: renamed from: j0 */
                public static final String[] f1857j0 = {"android:clipBounds:clip"};

                public ChangeClipBounds(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                /* JADX INFO: renamed from: H */
                public static void m1069H(or2 or2Var) {
/* 1 */             View view = or2Var.f14873b;
/* 3 */             HashMap map = or2Var.f14872a;
/* 11 */            if (view.getVisibility() == 8) {
/* 46 */                return;
                    }
/* 14 */            WeakHashMap weakHashMap = e33.f7494a;
/* 16 */            Rect clipBounds = view.getClipBounds();
/* 22 */            map.put("android:clipBounds:clip", clipBounds);
/* 25 */            if (clipBounds == null) {
/* 43 */                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
                    }
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: d */
                public final void mo1065d(or2 or2Var) {
/* 1 */             m1069H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: g */
                public final void mo1066g(or2 or2Var) {
/* 1 */             m1069H(or2Var);
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: k */
                public final Animator mo1067k(ViewGroup viewGroup, or2 or2Var, or2 or2Var2) {
/* 1 */             if (or2Var == null) {
/* 116 */               return null;
                    }
/* 3 */             HashMap map = or2Var.f14872a;
/* 5 */             if (or2Var2 == null) {
/* 116 */               return null;
                    }
/* 7 */             View view = or2Var2.f14873b;
/* 9 */             HashMap map2 = or2Var2.f14872a;
/* 17 */            if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
/* 116 */               return null;
                    }
/* 30 */            Rect rect = (Rect) map.get("android:clipBounds:clip");
/* 36 */            Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
/* 43 */            boolean z = rect2 == null;
/* 44 */            if (rect == null && rect2 == null) {
/* 116 */               return null;
                    }
/* 51 */            if (rect == null) {
/* 58 */                rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
/* 68 */                rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
/* 74 */            if (rect.equals(rect2)) {
/* 116 */               return null;
                    }
/* 77 */            WeakHashMap weakHashMap = e33.f7494a;
/* 79 */            view.setClipBounds(rect);
/* 86 */            Rect rect3 = new Rect();
/* 90 */            pj0 pj0Var = new pj0(2);
/* 93 */            pj0Var.f15141b = rect3;
/* 101 */           ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, l53.f13121c, pj0Var, rect, rect2);
/* 105 */           if (z) {
/* 112 */               objectAnimatorOfObject.addListener(new C2315w1(view, 1));
                    }
/* 115 */           return objectAnimatorOfObject;
                }

                @Override // androidx.transition.Transition
                /* JADX INFO: renamed from: p */
                public final String[] mo1068p() {
/* 1 */             return f1857j0;
                }
            }
