            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Color;
            import android.util.TypedValue;
            import android.view.View;
            import androidx.appcompat.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class sn2 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f16715a = new ThreadLocal();

                /* JADX INFO: renamed from: b */
                public static final int[] f16716b = {-16842910};

                /* JADX INFO: renamed from: c */
                public static final int[] f16717c = {R.attr.state_focused};

                /* JADX INFO: renamed from: d */
                public static final int[] f16718d = {R.attr.state_pressed};

                /* JADX INFO: renamed from: e */
                public static final int[] f16719e = {R.attr.state_checked};

                /* JADX INFO: renamed from: f */
                public static final int[] f16720f = new int[0];

                /* JADX INFO: renamed from: g */
                public static final int[] f16721g = new int[1];

                /* JADX INFO: renamed from: a */
                public static void m8583a(View view, Context context) {
/* 5 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R$styleable.AppCompatTheme);
                    try {
/* 15 */                if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
/* 40 */                    AbstractC1245n0.m4876d("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                        }
                    } finally {
/* 50 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static int m8584b(Context context, int i) {
/* 1 */             ColorStateList colorStateListM8586d = m8586d(context, i);
/* 5 */             if (colorStateListM8586d != null && colorStateListM8586d.isStateful()) {
/* 19 */                return colorStateListM8586d.getColorForState(f16716b, colorStateListM8586d.getDefaultColor());
                    }
/* 24 */            ThreadLocal threadLocal = f16715a;
/* 30 */            TypedValue typedValue = (TypedValue) threadLocal.get();
/* 32 */            if (typedValue == null) {
/* 36 */                typedValue = new TypedValue();
/* 39 */                threadLocal.set(typedValue);
                    }
/* 50 */            context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
/* 53 */            float f = typedValue.getFloat();
/* 57 */            int iM8585c = m8585c(context, i);
/* 71 */            return AbstractC0196bx.m1454f(iM8585c, Math.round(Color.alpha(iM8585c) * f));
                }

                /* JADX INFO: renamed from: c */
                public static int m8585c(Context context, int i) {
/* 1 */             int[] iArr = f16721g;
/* 4 */             iArr[0] = i;
/* 7 */             ac1 ac1VarM155G = ac1.m155G(context, null, iArr);
                    try {
/* 15 */                return ((TypedArray) ac1VarM155G.f178c).getColor(0, 0);
                    } finally {
/* 24 */                ac1VarM155G.m168J();
                    }
                }

                /* JADX INFO: renamed from: d */
                public static ColorStateList m8586d(Context context, int i) {
/* 1 */             int[] iArr = f16721g;
/* 4 */             iArr[0] = i;
/* 7 */             ac1 ac1VarM155G = ac1.m155G(context, null, iArr);
                    try {
/* 11 */                return ac1VarM155G.m183m(0);
                    } finally {
/* 20 */                ac1VarM155G.m168J();
                    }
                }
            }
