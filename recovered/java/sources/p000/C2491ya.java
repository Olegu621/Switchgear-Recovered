            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            
            /* JADX INFO: renamed from: ya */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2491ya {

                /* JADX INFO: renamed from: b */
                public static final PorterDuff.Mode f19551b = PorterDuff.Mode.SRC_IN;

                /* JADX INFO: renamed from: c */
                public static C2491ya f19552c;

                /* JADX INFO: renamed from: a */
                public x32 f19553a;

                /* JADX INFO: renamed from: a */
                public static synchronized C2491ya m10132a() {
                    try {
/* 6 */                 if (f19552c == null) {
/* 8 */                     m10134d();
                        }
                    } catch (Throwable th) {
/* 19 */                throw th;
                    }
/* 14 */            return f19552c;
                }

                /* JADX INFO: renamed from: c */
                public static synchronized PorterDuffColorFilter m10133c(int i, PorterDuff.Mode mode) {
/* 4 */             return x32.m9696e(i, mode);
                }

                /* JADX INFO: renamed from: d */
                public static synchronized void m10134d() {
/* 6 */             if (f19552c == null) {
/* 10 */                C2491ya c2491ya = new C2491ya();
/* 13 */                f19552c = c2491ya;
/* 19 */                c2491ya.f19553a = x32.m9695b();
/* 23 */                x32 x32Var = f19552c.f19553a;
/* 27 */                qi1 qi1Var = new qi1();
                        synchronized (x32Var) {
/* 31 */                    x32Var.f18934e = qi1Var;
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static void m10135e(Drawable drawable, vo2 vo2Var, int[] iArr) {
/* 1 */             PorterDuff.Mode mode = x32.f18927f;
/* 3 */             int[] state = drawable.getState();
/* 11 */            if (drawable.mutate() == drawable) {
/* 16 */                if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
/* 26 */                    drawable.setState(new int[0]);
/* 29 */                    drawable.setState(state);
                        }
/* 32 */                boolean z = vo2Var.f18264d;
/* 34 */                if (!z && !vo2Var.f18263c) {
/* 41 */                    drawable.clearColorFilter();
/* 44 */                    return;
                        }
/* 45 */                PorterDuffColorFilter porterDuffColorFilterM9696e = null;
/* 51 */                ColorStateList colorStateList = z ? vo2Var.f18261a : null;
/* 59 */                PorterDuff.Mode mode2 = vo2Var.f18263c ? vo2Var.f18262b : x32.f18927f;
/* 61 */                if (colorStateList != null && mode2 != null) {
/* 70 */                    porterDuffColorFilterM9696e = x32.m9696e(colorStateList.getColorForState(iArr, 0), mode2);
                        }
/* 74 */                drawable.setColorFilter(porterDuffColorFilterM9696e);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final synchronized Drawable m10136b(Context context, int i) {
/* 4 */             return this.f19553a.m9698c(context, i);
                }
            }
