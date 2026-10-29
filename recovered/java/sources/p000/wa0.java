            package p000;

            import android.text.Editable;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wa0 extends qn2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18541a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ de0 f18542b;

                public /* synthetic */ wa0(de0 de0Var, int i) {
/* 1 */             this.f18541a = i;
/* 3 */             this.f18542b = de0Var;
                }

                @Override // p000.qn2, android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    switch (this.f18541a) {
                        case 0:
/* 9 */                     za0 za0Var = (za0) this.f18542b;
/* 13 */                    EditText editText = za0Var.f7137a.getEditText();
/* 19 */                    if (!(editText instanceof AutoCompleteTextView)) {
/* 61 */                        f42.m3663s("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                            } else {
/* 21 */                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
/* 29 */                        if (za0Var.f20031q.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !za0Var.f7139c.hasFocus()) {
/* 45 */                            autoCompleteTextView.dismissDropDown();
                                }
/* 55 */                        autoCompleteTextView.post(new dp0(this, autoCompleteTextView, 7, false));
                            }
                            break;
                    }
                }

                @Override // p000.qn2, android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    switch (this.f18541a) {
                        case 1:
/* 9 */                     or1 or1Var = (or1) this.f18542b;
/* 19 */                    or1Var.f7139c.setChecked(!or1.m7238d(or1Var));
                            break;
                    }
                }
            }
