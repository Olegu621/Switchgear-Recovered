            package p000;

            import android.text.InputFilter;
            import android.text.Selection;
            import android.text.Spannable;
            import android.widget.TextView;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ad0 extends qc0 {

                /* JADX INFO: renamed from: a */
                public final WeakReference f186a;

                /* JADX INFO: renamed from: b */
                public final WeakReference f187b;

                public ad0(TextView textView, bd0 bd0Var) {
/* 9 */             this.f186a = new WeakReference(textView);
/* 16 */            this.f187b = new WeakReference(bd0Var);
                }

                @Override // p000.qc0
                /* JADX INFO: renamed from: b */
                public final void mo203b() throws Throwable {
                    InputFilter[] filters;
                    int length;
/* 7 */             TextView textView = (TextView) this.f186a.get();
/* 15 */            InputFilter inputFilter = (InputFilter) this.f187b.get();
/* 17 */            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
/* 110 */               return;
                    }
/* 32 */            for (InputFilter inputFilter2 : filters) {
/* 36 */                if (inputFilter2 == inputFilter) {
/* 42 */                    if (textView.isAttachedToWindow()) {
/* 44 */                        CharSequence text = textView.getText();
/* 48 */                        sc0 sc0VarM8471a = sc0.m8471a();
/* 52 */                        if (text == null) {
/* 54 */                            length = 0;
                                } else {
/* 56 */                            sc0VarM8471a.getClass();
/* 59 */                            length = text.length();
                                }
/* 63 */                        CharSequence charSequenceM8475e = sc0VarM8471a.m8475e(text, 0, length);
/* 67 */                        if (text == charSequenceM8475e) {
/* 110 */                           return;
                                }
/* 70 */                        int selectionStart = Selection.getSelectionStart(charSequenceM8475e);
/* 74 */                        int selectionEnd = Selection.getSelectionEnd(charSequenceM8475e);
/* 78 */                        textView.setText(charSequenceM8475e);
/* 83 */                        if (charSequenceM8475e instanceof Spannable) {
/* 85 */                            Spannable spannable = (Spannable) charSequenceM8475e;
/* 87 */                            if (selectionStart >= 0 && selectionEnd >= 0) {
/* 91 */                                Selection.setSelection(spannable, selectionStart, selectionEnd);
/* 94 */                                return;
                                    } else if (selectionStart >= 0) {
/* 97 */                                Selection.setSelection(spannable, selectionStart);
/* 100 */                               return;
                                    } else {
/* 101 */                               if (selectionEnd >= 0) {
/* 103 */                                   Selection.setSelection(spannable, selectionEnd);
/* 106 */                                   return;
                                        }
/* 110 */                               return;
                                    }
                                }
/* 110 */                       return;
                            }
/* 110 */                   return;
                        }
                    }
                }
            }
