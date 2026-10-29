            package p000;

            import android.text.Editable;
            import android.text.Selection;
            import android.text.Spannable;
            import android.text.TextWatcher;
            import android.widget.EditText;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class id0 implements TextWatcher {

                /* JADX INFO: renamed from: a */
                public final EditText f9551a;

                /* JADX INFO: renamed from: b */
                public hd0 f9552b;

                /* JADX INFO: renamed from: c */
                public boolean f9553c = true;

                public id0(EditText editText) {
/* 4 */             this.f9551a = editText;
                }

                /* JADX INFO: renamed from: a */
                public static void m4518a(EditText editText, int i) {
                    int length;
/* 2 */             if (i == 1 && editText != null && editText.isAttachedToWindow()) {
/* 12 */                Editable editableText = editText.getEditableText();
/* 16 */                int selectionStart = Selection.getSelectionStart(editableText);
/* 20 */                int selectionEnd = Selection.getSelectionEnd(editableText);
/* 24 */                sc0 sc0VarM8471a = sc0.m8471a();
/* 29 */                if (editableText == null) {
/* 31 */                    length = 0;
                        } else {
/* 33 */                    sc0VarM8471a.getClass();
/* 36 */                    length = editableText.length();
                        }
/* 40 */                sc0VarM8471a.m8475e(editableText, 0, length);
/* 43 */                if (selectionStart >= 0 && selectionEnd >= 0) {
/* 47 */                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
/* 53 */                    Selection.setSelection(editableText, selectionStart);
                        } else if (selectionEnd >= 0) {
/* 59 */                    Selection.setSelection(editableText, selectionEnd);
                        }
                    }
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
/* 1 */             EditText editText = this.f9551a;
/* 7 */             if (editText.isInEditMode() || !this.f9553c || sc0.f16512k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
/* 71 */                return;
                    }
/* 27 */            int iM8472b = sc0.m8471a().m8472b();
/* 31 */            if (iM8472b != 0) {
/* 34 */                if (iM8472b == 1) {
/* 47 */                    sc0.m8471a().m8475e((Spannable) charSequence, i, i3 + i);
/* 50 */                    return;
                        } else if (iM8472b != 3) {
/* 71 */                    return;
                        }
                    }
/* 51 */            sc0 sc0VarM8471a = sc0.m8471a();
/* 57 */            if (this.f9552b == null) {
/* 64 */                this.f9552b = new hd0(editText);
                    }
/* 68 */            sc0VarM8471a.m8476f(this.f9552b);
                }
            }
