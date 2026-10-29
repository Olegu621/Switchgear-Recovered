            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.widget.TextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class kn2 {
                /* JADX INFO: renamed from: a */
                public static int m6144a(TextView textView) {
/* 1 */             return textView.getBreakStrategy();
                }

                /* JADX INFO: renamed from: b */
                public static ColorStateList m6145b(TextView textView) {
/* 1 */             return textView.getCompoundDrawableTintList();
                }

                /* JADX INFO: renamed from: c */
                public static PorterDuff.Mode m6146c(TextView textView) {
/* 1 */             return textView.getCompoundDrawableTintMode();
                }

                /* JADX INFO: renamed from: d */
                public static int m6147d(TextView textView) {
/* 1 */             return textView.getHyphenationFrequency();
                }

                /* JADX INFO: renamed from: e */
                public static void m6148e(TextView textView, int i) {
/* 1 */             textView.setBreakStrategy(i);
                }

                /* JADX INFO: renamed from: f */
                public static void m6149f(TextView textView, ColorStateList colorStateList) {
/* 1 */             textView.setCompoundDrawableTintList(colorStateList);
                }

                /* JADX INFO: renamed from: g */
                public static void m6150g(TextView textView, PorterDuff.Mode mode) {
/* 1 */             textView.setCompoundDrawableTintMode(mode);
                }

                /* JADX INFO: renamed from: h */
                public static void m6151h(TextView textView, int i) {
/* 1 */             textView.setHyphenationFrequency(i);
                }
            }
