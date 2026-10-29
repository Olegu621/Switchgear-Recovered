            package p000;

            import android.icu.text.DecimalFormatSymbols;
            import android.text.PrecomputedText;
            import android.widget.TextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class mn2 {
                /* JADX INFO: renamed from: a */
                public static CharSequence m6711a(PrecomputedText precomputedText) {
/* 1 */             return precomputedText;
                }

                /* JADX INFO: renamed from: b */
                public static String[] m6712b(DecimalFormatSymbols decimalFormatSymbols) {
/* 1 */             return decimalFormatSymbols.getDigitStrings();
                }

                /* JADX INFO: renamed from: c */
                public static PrecomputedText.Params m6713c(TextView textView) {
/* 1 */             return textView.getTextMetricsParams();
                }

                /* JADX INFO: renamed from: d */
                public static void m6714d(TextView textView, int i) {
/* 1 */             textView.setFirstBaselineToTopHeight(i);
                }
            }
