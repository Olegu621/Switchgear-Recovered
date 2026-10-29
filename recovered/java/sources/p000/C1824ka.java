            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.os.Build;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.FrameLayout;
            import androidx.appcompat.R$color;
            import androidx.appcompat.widget.ActionBarContextView;
            import java.lang.reflect.Method;
            import java.util.WeakHashMap;
            import okio.Segment;
            
            /* JADX INFO: renamed from: ka */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1824ka implements jp1, dh1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LayoutInflaterFactory2C2324wa f12665a;

                public /* synthetic */ C1824ka(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa) {
/* 1 */             this.f12665a = layoutInflaterFactory2C2324wa;
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: d */
                public void mo2938d(jg1 jg1Var, boolean z) {
                    C2286va c2286va;
/* 1 */             jg1 jg1VarMo4234k = jg1Var.mo4234k();
/* 5 */             int i = 0;
/* 11 */            boolean z2 = jg1VarMo4234k != jg1Var;
/* 12 */            if (z2) {
/* 14 */                jg1Var = jg1VarMo4234k;
                    }
/* 15 */            LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f12665a;
/* 17 */            C2286va[] c2286vaArr = layoutInflaterFactory2C2324wa.f18537w0;
/* 23 */            int length = c2286vaArr != null ? c2286vaArr.length : 0;
                    while (true) {
/* 24 */                if (i < length) {
/* 26 */                    c2286va = c2286vaArr[i];
/* 28 */                    if (c2286va != null && c2286va.f17937h == jg1Var) {
                                break;
                            } else {
/* 35 */                        i++;
                            }
                        } else {
/* 38 */                    c2286va = null;
                            break;
                        }
                    }
/* 39 */            if (c2286va != null) {
/* 41 */                if (!z2) {
/* 52 */                    layoutInflaterFactory2C2324wa.m9504s(c2286va, z);
                        } else {
/* 45 */                    layoutInflaterFactory2C2324wa.m9502q(c2286va.f17930a, c2286va, jg1VarMo4234k);
/* 48 */                    layoutInflaterFactory2C2324wa.m9504s(c2286va, true);
                        }
                    }
                }

                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
                    boolean z;
                    boolean z2;
/* 1 */             int iM6624d = m83Var.m6624d();
/* 5 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f12665a;
/* 7 */             Context context = layoutInflaterFactory2C2324wa.f18510V;
/* 9 */             int iM6624d2 = m83Var.m6624d();
/* 13 */            ActionBarContextView actionBarContextView = layoutInflaterFactory2C2324wa.f18521g0;
/* 18 */            if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
/* 340 */               z = false;
                    } else {
/* 34 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C2324wa.f18521g0.getLayoutParams();
/* 42 */                boolean z3 = true;
/* 43 */                if (layoutInflaterFactory2C2324wa.f18521g0.isShown()) {
/* 47 */                    if (layoutInflaterFactory2C2324wa.f18504N0 == null) {
/* 54 */                        layoutInflaterFactory2C2324wa.f18504N0 = new Rect();
/* 61 */                        layoutInflaterFactory2C2324wa.f18505O0 = new Rect();
                            }
/* 63 */                    Rect rect = layoutInflaterFactory2C2324wa.f18504N0;
/* 65 */                    Rect rect2 = layoutInflaterFactory2C2324wa.f18505O0;
/* 83 */                    rect.set(m83Var.m6622b(), m83Var.m6624d(), m83Var.m6623c(), m83Var.m6621a());
/* 86 */                    ViewGroup viewGroup = layoutInflaterFactory2C2324wa.f18526l0;
/* 94 */                    if (Build.VERSION.SDK_INT >= 29) {
/* 96 */                        boolean z4 = m53.f13568a;
/* 98 */                        i53.m4475a(viewGroup, rect, rect2);
                            } else {
/* 104 */                       if (!m53.f13568a) {
/* 106 */                           m53.f13568a = true;
                                    try {
/* 119 */                               Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
/* 123 */                               m53.f13569b = declaredMethod;
/* 129 */                               if (!declaredMethod.isAccessible()) {
/* 133 */                                   m53.f13569b.setAccessible(true);
                                        }
                                    } catch (NoSuchMethodException unused) {
                                    }
                                }
/* 136 */                       Method method = m53.f13569b;
/* 138 */                       if (method != null) {
                                    try {
/* 144 */                               method.invoke(viewGroup, rect, rect2);
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
/* 147 */                   int i = rect.top;
/* 149 */                   int i2 = rect.left;
/* 151 */                   int i3 = rect.right;
/* 153 */                   ViewGroup viewGroup2 = layoutInflaterFactory2C2324wa.f18526l0;
/* 155 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 157 */                   m83 m83VarM8681a = t23.m8681a(viewGroup2);
/* 165 */                   int iM6622b = m83VarM8681a == null ? 0 : m83VarM8681a.m6622b();
/* 173 */                   int iM6623c = m83VarM8681a == null ? 0 : m83VarM8681a.m6623c();
/* 179 */                   if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
/* 190 */                       z2 = false;
                            } else {
/* 192 */                       marginLayoutParams.topMargin = i;
/* 194 */                       marginLayoutParams.leftMargin = i2;
/* 196 */                       marginLayoutParams.rightMargin = i3;
/* 198 */                       z2 = true;
                            }
/* 199 */                   if (i <= 0 || layoutInflaterFactory2C2324wa.f18528n0 != null) {
/* 237 */                       View view2 = layoutInflaterFactory2C2324wa.f18528n0;
/* 239 */                       if (view2 != null) {
/* 245 */                           ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
/* 247 */                           int i4 = marginLayoutParams2.height;
/* 249 */                           int i5 = marginLayoutParams.topMargin;
/* 251 */                           if (i4 != i5 || marginLayoutParams2.leftMargin != iM6622b || marginLayoutParams2.rightMargin != iM6623c) {
/* 261 */                               marginLayoutParams2.height = i5;
/* 263 */                               marginLayoutParams2.leftMargin = iM6622b;
/* 265 */                               marginLayoutParams2.rightMargin = iM6623c;
/* 269 */                               layoutInflaterFactory2C2324wa.f18528n0.setLayoutParams(marginLayoutParams2);
                                    }
                                }
                            } else {
/* 207 */                       View view3 = new View(context);
/* 210 */                       layoutInflaterFactory2C2324wa.f18528n0 = view3;
/* 212 */                       view3.setVisibility(8);
/* 222 */                       FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
/* 225 */                       layoutParams.leftMargin = iM6622b;
/* 227 */                       layoutParams.rightMargin = iM6623c;
/* 233 */                       layoutInflaterFactory2C2324wa.f18526l0.addView(layoutInflaterFactory2C2324wa.f18528n0, -1, layoutParams);
                            }
/* 272 */                   View view4 = layoutInflaterFactory2C2324wa.f18528n0;
/* 274 */                   z3 = view4 != null;
/* 278 */                   if (z3 && view4.getVisibility() != 0) {
/* 286 */                       View view5 = layoutInflaterFactory2C2324wa.f18528n0;
/* 309 */                       view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? v00.getColor(context, R$color.abc_decor_view_status_guard_light) : v00.getColor(context, R$color.abc_decor_view_status_guard));
                            }
/* 314 */                   if (!layoutInflaterFactory2C2324wa.f18533s0 && z3) {
/* 318 */                       iM6624d2 = 0;
                            }
/* 319 */                   z = z3;
/* 320 */                   z3 = z2;
                        } else if (marginLayoutParams.topMargin != 0) {
/* 326 */                   marginLayoutParams.topMargin = 0;
/* 328 */                   z = false;
                        } else {
/* 330 */                   z = false;
/* 331 */                   z3 = false;
                        }
/* 332 */               if (z3) {
/* 336 */                   layoutInflaterFactory2C2324wa.f18521g0.setLayoutParams(marginLayoutParams);
                        }
                    }
/* 341 */           View view6 = layoutInflaterFactory2C2324wa.f18528n0;
/* 343 */           if (view6 != null) {
/* 348 */               view6.setVisibility(z ? 0 : 8);
                    }
/* 375 */           return e33.m3312h(view, iM6624d != iM6624d2 ? m83Var.m6625f(m83Var.m6622b(), iM6624d2, m83Var.m6623c(), m83Var.m6621a()) : m83Var);
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: z */
                public boolean mo2942z(jg1 jg1Var) {
                    Window.Callback callback;
/* 5 */             if (jg1Var != jg1Var.mo4234k()) {
/* 30 */                return true;
                    }
/* 7 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = this.f12665a;
/* 11 */            if (!layoutInflaterFactory2C2324wa.f18531q0 || (callback = layoutInflaterFactory2C2324wa.f18511W.getCallback()) == null || layoutInflaterFactory2C2324wa.f18492B0) {
/* 30 */                return true;
                    }
/* 27 */            callback.onMenuOpened(108, jg1Var);
/* 30 */            return true;
                }
            }
