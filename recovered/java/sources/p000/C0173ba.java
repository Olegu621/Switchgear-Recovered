            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.appcompat.R$styleable;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: ba */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0173ba {

                /* JADX INFO: renamed from: a */
                public final View f2333a;

                /* JADX INFO: renamed from: d */
                public vo2 f2336d;

                /* JADX INFO: renamed from: e */
                public vo2 f2337e;

                /* JADX INFO: renamed from: f */
                public vo2 f2338f;

                /* JADX INFO: renamed from: c */
                public int f2335c = -1;

                /* JADX INFO: renamed from: b */
                public final C2491ya f2334b = C2491ya.m10132a();

                public C0173ba(View view) {
/* 7 */             this.f2333a = view;
                }

                /* JADX INFO: renamed from: a */
                public final void m1301a() {
/* 1 */             View view = this.f2333a;
/* 3 */             Drawable background = view.getBackground();
/* 7 */             if (background != null) {
/* 11 */                if (this.f2336d != null) {
/* 15 */                    if (this.f2338f == null) {
/* 22 */                        this.f2338f = new vo2();
                            }
/* 24 */                    vo2 vo2Var = this.f2338f;
/* 27 */                    vo2Var.f18261a = null;
/* 30 */                    vo2Var.f18264d = false;
/* 32 */                    vo2Var.f18262b = null;
/* 34 */                    vo2Var.f18263c = false;
/* 36 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 38 */                    ColorStateList colorStateListM8369g = s23.m8369g(view);
/* 43 */                    if (colorStateListM8369g != null) {
/* 45 */                        vo2Var.f18264d = true;
/* 47 */                        vo2Var.f18261a = colorStateListM8369g;
                            }
/* 49 */                    PorterDuff.Mode modeM8370h = s23.m8370h(view);
/* 53 */                    if (modeM8370h != null) {
/* 55 */                        vo2Var.f18263c = true;
/* 57 */                        vo2Var.f18262b = modeM8370h;
                            }
/* 61 */                    if (vo2Var.f18264d || vo2Var.f18263c) {
/* 71 */                        C2491ya.m10135e(background, vo2Var, view.getDrawableState());
/* 74 */                        return;
                            }
                        }
/* 75 */                vo2 vo2Var2 = this.f2337e;
/* 77 */                if (vo2Var2 != null) {
/* 83 */                    C2491ya.m10135e(background, vo2Var2, view.getDrawableState());
/* 86 */                    return;
                        }
/* 87 */                vo2 vo2Var3 = this.f2336d;
/* 89 */                if (vo2Var3 != null) {
/* 95 */                    C2491ya.m10135e(background, vo2Var3, view.getDrawableState());
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final ColorStateList m1302b() {
/* 1 */             vo2 vo2Var = this.f2337e;
/* 3 */             if (vo2Var != null) {
/* 5 */                 return vo2Var.f18261a;
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: c */
                public final PorterDuff.Mode m1303c() {
/* 1 */             vo2 vo2Var = this.f2337e;
/* 3 */             if (vo2Var != null) {
/* 5 */                 return vo2Var.f18262b;
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: d */
                public final void m1304d(AttributeSet attributeSet, int i) {
                    ColorStateList colorStateListM9700f;
/* 1 */             View view = this.f2333a;
/* 9 */             ac1 ac1VarM156H = ac1.m156H(view.getContext(), attributeSet, R$styleable.ViewBackgroundHelper, i);
/* 15 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 17 */            View view2 = this.f2333a;
/* 32 */            e33.m3317m(view2, view2.getContext(), R$styleable.ViewBackgroundHelper, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
                    try {
/* 42 */                if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_android_background)) {
/* 50 */                    this.f2335c = typedArray.getResourceId(R$styleable.ViewBackgroundHelper_android_background, -1);
/* 52 */                    C2491ya c2491ya = this.f2334b;
/* 54 */                    Context context = view.getContext();
/* 58 */                    int i2 = this.f2335c;
                            synchronized (c2491ya) {
/* 63 */                        colorStateListM9700f = c2491ya.f19553a.m9700f(context, i2);
                            }
/* 68 */                    if (colorStateListM9700f != null) {
/* 70 */                        m1307g(colorStateListM9700f);
                            }
                        }
/* 87 */                if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_backgroundTint)) {
/* 95 */                    s23.m8379q(view, ac1VarM156H.m183m(R$styleable.ViewBackgroundHelper_backgroundTint));
                        }
/* 104 */               if (typedArray.hasValue(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
/* 117 */                   s23.m8380r(view, w90.m9485c(typedArray.getInt(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
                        }
/* 120 */               ac1VarM156H.m168J();
                    } catch (Throwable th) {
/* 124 */               ac1VarM156H.m168J();
/* 127 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m1305e() {
/* 2 */             this.f2335c = -1;
/* 5 */             m1307g(null);
/* 8 */             m1301a();
                }

                /* JADX INFO: renamed from: f */
                public final void m1306f(int i) {
                    ColorStateList colorStateListM9700f;
/* 1 */             this.f2335c = i;
/* 3 */             C2491ya c2491ya = this.f2334b;
/* 5 */             if (c2491ya != null) {
/* 9 */                 Context context = this.f2333a.getContext();
                        synchronized (c2491ya) {
/* 16 */                    colorStateListM9700f = c2491ya.f19553a.m9700f(context, i);
                        }
                    } else {
/* 25 */                colorStateListM9700f = null;
                    }
/* 26 */            m1307g(colorStateListM9700f);
/* 29 */            m1301a();
                }

                /* JADX INFO: renamed from: g */
                public final void m1307g(ColorStateList colorStateList) {
/* 1 */             if (colorStateList != null) {
/* 5 */                 if (this.f2336d == null) {
/* 12 */                    this.f2336d = new vo2();
                        }
/* 14 */                vo2 vo2Var = this.f2336d;
/* 16 */                vo2Var.f18261a = colorStateList;
/* 19 */                vo2Var.f18264d = true;
                    } else {
/* 23 */                this.f2336d = null;
                    }
/* 25 */            m1301a();
                }

                /* JADX INFO: renamed from: h */
                public final void m1308h(ColorStateList colorStateList) {
/* 3 */             if (this.f2337e == null) {
/* 10 */                this.f2337e = new vo2();
                    }
/* 12 */            vo2 vo2Var = this.f2337e;
/* 14 */            vo2Var.f18261a = colorStateList;
/* 17 */            vo2Var.f18264d = true;
/* 19 */            m1301a();
                }

                /* JADX INFO: renamed from: i */
                public final void m1309i(PorterDuff.Mode mode) {
/* 3 */             if (this.f2337e == null) {
/* 10 */                this.f2337e = new vo2();
                    }
/* 12 */            vo2 vo2Var = this.f2337e;
/* 14 */            vo2Var.f18262b = mode;
/* 17 */            vo2Var.f18263c = true;
/* 19 */            m1301a();
                }
            }
