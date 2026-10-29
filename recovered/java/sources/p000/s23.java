            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.os.Build;
            import android.view.View;
            import android.view.WindowInsets;
            import androidx.core.R$id;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class s23 {
                /* JADX INFO: renamed from: a */
                public static void m8363a(WindowInsets windowInsets, View view) {
/* 7 */             View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback);
/* 9 */             if (onApplyWindowInsetsListener != null) {
/* 11 */                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static m83 m8364b(View view, m83 m83Var, Rect rect) {
/* 1 */             WindowInsets windowInsetsM6626g = m83Var.m6626g();
/* 5 */             if (windowInsetsM6626g != null) {
/* 11 */                return m83.m6620h(view.computeSystemWindowInsets(windowInsetsM6626g, rect), view);
                    }
/* 16 */            rect.setEmpty();
/* 19 */            return m83Var;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m8365c(View view, float f, float f2, boolean z) {
/* 1 */             return view.dispatchNestedFling(f, f2, z);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m8366d(View view, float f, float f2) {
/* 1 */             return view.dispatchNestedPreFling(f, f2);
                }

                /* JADX INFO: renamed from: e */
                public static boolean m8367e(View view, int i, int i2, int[] iArr, int[] iArr2) {
/* 1 */             return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
                }

                /* JADX INFO: renamed from: f */
                public static boolean m8368f(View view, int i, int i2, int i3, int i4, int[] iArr) {
/* 1 */             return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
                }

                /* JADX INFO: renamed from: g */
                public static ColorStateList m8369g(View view) {
/* 1 */             return view.getBackgroundTintList();
                }

                /* JADX INFO: renamed from: h */
                public static PorterDuff.Mode m8370h(View view) {
/* 1 */             return view.getBackgroundTintMode();
                }

                /* JADX INFO: renamed from: i */
                public static float m8371i(View view) {
/* 1 */             return view.getElevation();
                }

                /* JADX INFO: renamed from: j */
                public static m83 m8372j(View view) {
                    c83 a83Var;
/* 4 */             if (y73.f19518d && view.isAttachedToWindow()) {
                        try {
/* 20 */                    Object obj = y73.f19515a.get(view.getRootView());
/* 24 */                    if (obj != null) {
/* 32 */                        Rect rect = (Rect) y73.f19516b.get(obj);
/* 40 */                        Rect rect2 = (Rect) y73.f19517c.get(obj);
/* 42 */                        if (rect != null && rect2 != null) {
/* 46 */                            int i = Build.VERSION.SDK_INT;
/* 50 */                            if (i >= 30) {
/* 54 */                                a83Var = new b83();
                                    } else {
/* 70 */                                a83Var = i >= 29 ? new a83() : new z73();
                                    }
/* 85 */                            a83Var.mo107c(ly0.m6573a(rect.left, rect.top, rect.right, rect.bottom));
/* 100 */                           a83Var.mo108d(ly0.m6573a(rect2.left, rect2.top, rect2.right, rect2.bottom));
/* 103 */                           m83 m83VarMo106b = a83Var.mo106b();
/* 109 */                           m83VarMo106b.f13660a.mo2975p(m83VarMo106b);
/* 118 */                           m83VarMo106b.f13660a.mo2969d(view.getRootView());
/* 121 */                           return m83VarMo106b;
                                }
                            }
                        } catch (IllegalAccessException e) {
/* 143 */                   AbstractC1245n0.m4891s("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                        }
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: k */
                public static String m8373k(View view) {
/* 1 */             return view.getTransitionName();
                }

                /* JADX INFO: renamed from: l */
                public static float m8374l(View view) {
/* 1 */             return view.getTranslationZ();
                }

                /* JADX INFO: renamed from: m */
                public static float m8375m(View view) {
/* 1 */             return view.getZ();
                }

                /* JADX INFO: renamed from: n */
                public static boolean m8376n(View view) {
/* 1 */             return view.hasNestedScrollingParent();
                }

                /* JADX INFO: renamed from: o */
                public static boolean m8377o(View view) {
/* 1 */             return view.isImportantForAccessibility();
                }

                /* JADX INFO: renamed from: p */
                public static boolean m8378p(View view) {
/* 1 */             return view.isNestedScrollingEnabled();
                }

                /* JADX INFO: renamed from: q */
                public static void m8379q(View view, ColorStateList colorStateList) {
/* 1 */             view.setBackgroundTintList(colorStateList);
                }

                /* JADX INFO: renamed from: r */
                public static void m8380r(View view, PorterDuff.Mode mode) {
/* 1 */             view.setBackgroundTintMode(mode);
                }

                /* JADX INFO: renamed from: s */
                public static void m8381s(View view, float f) {
/* 1 */             view.setElevation(f);
                }

                /* JADX INFO: renamed from: t */
                public static void m8382t(View view, boolean z) {
/* 1 */             view.setNestedScrollingEnabled(z);
                }

                /* JADX INFO: renamed from: u */
                public static void m8383u(View view, jp1 jp1Var) {
/* 5 */             if (Build.VERSION.SDK_INT < 30) {
/* 9 */                 view.setTag(R$id.tag_on_apply_window_listener, jp1Var);
                    }
/* 12 */            if (jp1Var == null) {
/* 22 */                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback));
                    } else {
/* 31 */                view.setOnApplyWindowInsetsListener(new r23(view, jp1Var));
                    }
                }

                /* JADX INFO: renamed from: v */
                public static void m8384v(View view, String str) {
/* 1 */             view.setTransitionName(str);
                }

                /* JADX INFO: renamed from: w */
                public static void m8385w(View view, float f) {
/* 1 */             view.setTranslationZ(f);
                }

                /* JADX INFO: renamed from: x */
                public static void m8386x(View view, float f) {
/* 1 */             view.setZ(f);
                }

                /* JADX INFO: renamed from: y */
                public static boolean m8387y(View view, int i) {
/* 1 */             return view.startNestedScroll(i);
                }

                /* JADX INFO: renamed from: z */
                public static void m8388z(View view) {
/* 1 */             view.stopNestedScroll();
                }
            }
