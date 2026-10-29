            package p000;

            import android.text.InputFilter;
            import android.text.Spanned;
            import java.text.BreakIterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x53 implements InputFilter {

                /* JADX INFO: renamed from: a */
                public final int f18959a;

                public x53(int i) {
/* 4 */             this.f18959a = i;
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
/* 9 */             int length = this.f18959a - (spanned.length() - (i4 - i3));
/* 10 */            int i5 = i2 - i;
/* 12 */            if (length <= 0) {
/* 14 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 17 */            if (length >= i5) {
/* 65 */                return null;
                    }
/* 19 */            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
/* 31 */            characterInstance.setText(charSequence.subSequence(i, i2).toString());
/* 34 */            int iFirst = characterInstance.first();
/* 38 */            int next = characterInstance.next();
/* 42 */            int i6 = 0;
                    while (true) {
/* 43 */                int i7 = next;
/* 44 */                int i8 = iFirst;
/* 45 */                iFirst = i7;
/* 47 */                if (iFirst == -1 || iFirst > length) {
                            break;
                        }
/* 53 */                i6 += iFirst - i8;
/* 54 */                next = characterInstance.next();
                    }
/* 60 */            return charSequence.subSequence(i, i6 + i);
                }
            }
