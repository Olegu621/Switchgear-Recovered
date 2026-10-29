            package p000;

            import android.R;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
            import androidx.appcompat.widget.AppCompatButton;
            import androidx.appcompat.widget.AppCompatCheckBox;
            import androidx.appcompat.widget.AppCompatRadioButton;
            import androidx.appcompat.widget.AppCompatTextView;
            import java.lang.reflect.Constructor;
            
            /* JADX INFO: renamed from: dc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0839dc {

                /* JADX INFO: renamed from: b */
                public static final Class[] f7086b = {Context.class, AttributeSet.class};

                /* JADX INFO: renamed from: c */
                public static final int[] f7087c = {R.attr.onClick};

                /* JADX INFO: renamed from: d */
                public static final int[] f7088d = {R.attr.accessibilityHeading};

                /* JADX INFO: renamed from: e */
                public static final int[] f7089e = {R.attr.accessibilityPaneTitle};

                /* JADX INFO: renamed from: f */
                public static final int[] f7090f = {R.attr.screenReaderFocusable};

                /* JADX INFO: renamed from: g */
                public static final String[] f7091g = {"android.widget.", "android.view.", "android.webkit."};

                /* JADX INFO: renamed from: h */
                public static final le2 f7092h = new le2();

                /* JADX INFO: renamed from: a */
                public final Object[] f7093a = new Object[2];

                /* JADX INFO: renamed from: a */
                public AppCompatAutoCompleteTextView mo2421a(Context context, AttributeSet attributeSet) {
/* 3 */             return new AppCompatAutoCompleteTextView(context, attributeSet);
                }

                /* JADX INFO: renamed from: b */
                public AppCompatButton mo2422b(Context context, AttributeSet attributeSet) {
/* 3 */             return new AppCompatButton(context, attributeSet);
                }

                /* JADX INFO: renamed from: c */
                public AppCompatCheckBox mo2423c(Context context, AttributeSet attributeSet) {
/* 3 */             return new AppCompatCheckBox(context, attributeSet);
                }

                /* JADX INFO: renamed from: d */
                public AppCompatRadioButton mo2424d(Context context, AttributeSet attributeSet) {
/* 3 */             return new AppCompatRadioButton(context, attributeSet);
                }

                /* JADX INFO: renamed from: e */
                public AppCompatTextView mo2425e(Context context, AttributeSet attributeSet) {
/* 3 */             return new AppCompatTextView(context, attributeSet);
                }

                /* JADX INFO: renamed from: f */
                public final View m2984f(Context context, String str, String str2) {
                    String strConcat;
/* 1 */             le2 le2Var = f7092h;
/* 8 */             Constructor constructor = (Constructor) le2Var.getOrDefault(str, null);
/* 10 */            if (constructor == null) {
/* 12 */                if (str2 != null) {
                            try {
/* 14 */                        strConcat = str2.concat(str);
                            } catch (Exception unused) {
/* 3 */                         return null;
                            }
                        } else {
/* 19 */                    strConcat = str;
                        }
/* 37 */                constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7086b);
/* 41 */                le2Var.put(str, constructor);
                    }
/* 45 */            constructor.setAccessible(true);
/* 54 */            return (View) constructor.newInstance(this.f7093a);
                }
            }
