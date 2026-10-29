            package p000;

            import android.text.InputFilter;
            import android.text.Spanned;
            import android.widget.TextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bd0 implements InputFilter {

                /* JADX INFO: renamed from: a */
                public final TextView f2373a;

                /* JADX INFO: renamed from: b */
                public ad0 f2374b;

                public bd0(TextView textView) {
/* 4 */             this.f2373a = textView;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
                
                    if (r1 != 3) goto L27;
                 */
                @Override // android.text.InputFilter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
/* 1 */             TextView textView = this.f2373a;
/* 7 */             if (!textView.isInEditMode()) {
/* 14 */                int iM8472b = sc0.m8471a().m8472b();
/* 18 */                if (iM8472b != 0) {
/* 21 */                    if (iM8472b == 1) {
/* 27 */                        if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
/* 46 */                            if (i != 0 || i2 != charSequence.length()) {
/* 55 */                                charSequence = charSequence.subSequence(i, i2);
                                    }
/* 68 */                            return sc0.m8471a().m8475e(charSequence, 0, charSequence.length());
                                }
                            }
                        }
/* 74 */                sc0 sc0VarM8471a = sc0.m8471a();
/* 80 */                if (this.f2374b == null) {
/* 87 */                    this.f2374b = new ad0(textView, this);
                        }
/* 91 */                sc0VarM8471a.m8476f(this.f2374b);
/* 94 */                return charSequence;
                    }
/* 73 */            return charSequence;
                }
            }
