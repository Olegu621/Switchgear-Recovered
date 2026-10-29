            package p000;

            import android.text.InputFilter;
            import android.text.Spanned;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w53 implements InputFilter {
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
/* 1 */             while (i < i2) {
/* 9 */                 if (charSequence.charAt(i) >= 128) {
/* 11 */                    return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 14 */                i++;
                    }
/* 17 */            return null;
                }
            }
