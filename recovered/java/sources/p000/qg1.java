            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.view.MenuItem;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qg1 {
                /* JADX INFO: renamed from: a */
                public static int m7790a(MenuItem menuItem) {
/* 1 */             return menuItem.getAlphabeticModifiers();
                }

                /* JADX INFO: renamed from: b */
                public static CharSequence m7791b(MenuItem menuItem) {
/* 1 */             return menuItem.getContentDescription();
                }

                /* JADX INFO: renamed from: c */
                public static ColorStateList m7792c(MenuItem menuItem) {
/* 1 */             return menuItem.getIconTintList();
                }

                /* JADX INFO: renamed from: d */
                public static PorterDuff.Mode m7793d(MenuItem menuItem) {
/* 1 */             return menuItem.getIconTintMode();
                }

                /* JADX INFO: renamed from: e */
                public static int m7794e(MenuItem menuItem) {
/* 1 */             return menuItem.getNumericModifiers();
                }

                /* JADX INFO: renamed from: f */
                public static CharSequence m7795f(MenuItem menuItem) {
/* 1 */             return menuItem.getTooltipText();
                }

                /* JADX INFO: renamed from: g */
                public static MenuItem m7796g(MenuItem menuItem, char c, int i) {
/* 1 */             return menuItem.setAlphabeticShortcut(c, i);
                }

                /* JADX INFO: renamed from: h */
                public static MenuItem m7797h(MenuItem menuItem, CharSequence charSequence) {
/* 1 */             return menuItem.setContentDescription(charSequence);
                }

                /* JADX INFO: renamed from: i */
                public static MenuItem m7798i(MenuItem menuItem, ColorStateList colorStateList) {
/* 1 */             return menuItem.setIconTintList(colorStateList);
                }

                /* JADX INFO: renamed from: j */
                public static MenuItem m7799j(MenuItem menuItem, PorterDuff.Mode mode) {
/* 1 */             return menuItem.setIconTintMode(mode);
                }

                /* JADX INFO: renamed from: k */
                public static MenuItem m7800k(MenuItem menuItem, char c, int i) {
/* 1 */             return menuItem.setNumericShortcut(c, i);
                }

                /* JADX INFO: renamed from: l */
                public static MenuItem m7801l(MenuItem menuItem, char c, char c2, int i, int i2) {
/* 1 */             return menuItem.setShortcut(c, c2, i, i2);
                }

                /* JADX INFO: renamed from: m */
                public static MenuItem m7802m(MenuItem menuItem, CharSequence charSequence) {
/* 1 */             return menuItem.setTooltipText(charSequence);
                }
            }
