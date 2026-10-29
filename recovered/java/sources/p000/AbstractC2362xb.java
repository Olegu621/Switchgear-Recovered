            package p000;

            import android.text.Layout;
            import android.text.StaticLayout;
            import android.text.TextPaint;
            import android.widget.TextView;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: xb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2362xb {
                /* JADX INFO: renamed from: a */
                public static StaticLayout m9747a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, AbstractC0014ac abstractC0014ac) {
/* 6 */             StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
/* 46 */            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
/* 51 */            if (i2 == -1) {
/* 53 */                i2 = AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 56 */            hyphenationFrequency.setMaxLines(i2);
                    try {
/* 59 */                abstractC0014ac.mo150a(builderObtain, textView);
                    } catch (ClassCastException unused) {
/* 67 */                AbstractC1245n0.m4889q("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
/* 70 */            return builderObtain.build();
                }
            }
