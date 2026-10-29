            package p000;

            import android.text.PrecomputedText;
            import android.text.TextPaint;
            import android.view.DisplayCutout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class rt1 {
                /* JADX INFO: renamed from: e */
                public static /* synthetic */ PrecomputedText.Params.Builder m8245e(TextPaint textPaint) {
/* 3 */             return new PrecomputedText.Params.Builder(textPaint);
                }

                /* JADX INFO: renamed from: g */
                public static /* bridge */ /* synthetic */ DisplayCutout m8247g(Object obj) {
/* 1 */             return (DisplayCutout) obj;
                }

                /* JADX INFO: renamed from: n */
                public static /* bridge */ /* synthetic */ boolean m8254n(CharSequence charSequence) {
/* 1 */             return charSequence instanceof PrecomputedText;
                }

                /* JADX INFO: renamed from: o */
                public static /* bridge */ /* synthetic */ boolean m8255o(Object obj) {
/* 1 */             return obj instanceof DisplayCutout;
                }
            }
