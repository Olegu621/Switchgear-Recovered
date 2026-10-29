            package p000;

            import android.R;
            import android.content.Context;
            import android.os.Build;
            import android.util.TypedValue;
            import android.view.ViewConfiguration;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class i33 {

                /* JADX INFO: renamed from: a */
                public static final Method f9439a;

                static {
/* 5 */             if (Build.VERSION.SDK_INT == 25) {
                        try {
/* 16 */                    f9439a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
                        } catch (Exception unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public static float m4463a(ViewConfiguration viewConfiguration, Context context) {
                    Method method;
/* 5 */             if (Build.VERSION.SDK_INT >= 25 && (method = f9439a) != null) {
                        try {
/* 22 */                    return ((Integer) method.invoke(viewConfiguration, null)).intValue();
                        } catch (Exception unused) {
                        }
                    }
/* 26 */            TypedValue typedValue = new TypedValue();
/* 41 */            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
/* 51 */                return typedValue.getDimension(context.getResources().getDisplayMetrics());
                    }
/* 56 */            return 0.0f;
                }
            }
