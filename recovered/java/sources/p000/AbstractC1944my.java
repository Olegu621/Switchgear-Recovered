            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.widget.CompoundButton;
            
            /* JADX INFO: renamed from: my */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1944my {
                /* JADX INFO: renamed from: a */
                public static ColorStateList m6811a(CompoundButton compoundButton) {
/* 1 */             return compoundButton.getButtonTintList();
                }

                /* JADX INFO: renamed from: b */
                public static PorterDuff.Mode m6812b(CompoundButton compoundButton) {
/* 1 */             return compoundButton.getButtonTintMode();
                }

                /* JADX INFO: renamed from: c */
                public static void m6813c(CompoundButton compoundButton, ColorStateList colorStateList) {
/* 1 */             compoundButton.setButtonTintList(colorStateList);
                }

                /* JADX INFO: renamed from: d */
                public static void m6814d(CompoundButton compoundButton, PorterDuff.Mode mode) {
/* 1 */             compoundButton.setButtonTintMode(mode);
                }
            }
