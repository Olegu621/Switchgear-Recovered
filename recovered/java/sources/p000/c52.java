            package p000;

            import android.R;
            import android.content.res.ColorStateList;
            import android.graphics.Color;
            import android.os.Build;
            import android.util.StateSet;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class c52 {

                /* JADX INFO: renamed from: a */
                public static final int[] f2721a = {R.attr.state_pressed};

                /* JADX INFO: renamed from: b */
                public static final int[] f2722b = {R.attr.state_selected, R.attr.state_pressed};

                /* JADX INFO: renamed from: c */
                public static final int[] f2723c = {R.attr.state_selected};

                /* JADX INFO: renamed from: d */
                public static final int[] f2724d = {R.attr.state_enabled, R.attr.state_pressed};

                /* JADX INFO: renamed from: e */
                public static final String f2725e = c52.class.getSimpleName();

                /* JADX INFO: renamed from: a */
                public static ColorStateList m1534a(ColorStateList colorStateList) {
                    int colorForState;
/* 1 */             int colorForState2 = 0;
/* 2 */             if (colorStateList != null) {
/* 10 */                colorForState = colorStateList.getColorForState(f2722b, colorStateList.getDefaultColor());
                    } else {
/* 15 */                colorForState = 0;
                    }
/* 28 */            int iM1454f = AbstractC0196bx.m1454f(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
/* 36 */            int[][] iArr = {f2723c, StateSet.NOTHING};
/* 40 */            if (colorStateList != null) {
/* 48 */                colorForState2 = colorStateList.getColorForState(f2721a, colorStateList.getDefaultColor());
                    }
/* 72 */            return new ColorStateList(iArr, new int[]{iM1454f, AbstractC0196bx.m1454f(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
                }

                /* JADX INFO: renamed from: b */
                public static ColorStateList m1535b(ColorStateList colorStateList) {
/* 2 */             if (colorStateList == null) {
/* 40 */                return ColorStateList.valueOf(0);
                    }
/* 8 */             if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f2724d, 0)) != 0) {
/* 36 */                AbstractC1245n0.m4889q(f2725e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
                    }
/* 39 */            return colorStateList;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m1536c(int[] iArr) {
/* 4 */             boolean z = false;
/* 5 */             boolean z2 = false;
/* 7 */             for (int i : iArr) {
/* 14 */                if (i == 16842910) {
/* 16 */                    z = true;
                        } else if (i == 16842908 || i == 16842919 || i == 16843623) {
/* 23 */                    z2 = true;
                        }
                    }
                    return z && z2;
                }
            }
