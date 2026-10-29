            package p000;

            import android.graphics.drawable.Drawable;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import com.google.android.material.internal.CheckableImageButton;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: mv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1941mv {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14030a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ de0 f14031b;

                public /* synthetic */ C1941mv(de0 de0Var, int i) {
/* 1 */             this.f14030a = i;
/* 3 */             this.f14031b = de0Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m6810a(TextInputLayout textInputLayout) {
/* 1 */             int i = this.f14030a;
/* 4 */             de0 de0Var = this.f14031b;
                    switch (i) {
                        case 0:
/* 148 */                   EditText editText = textInputLayout.getEditText();
/* 152 */                   C2121qv c2121qv = (C2121qv) de0Var;
/* 158 */                   textInputLayout.setEndIconVisible(C2121qv.m8018d(c2121qv));
/* 161 */                   ViewOnFocusChangeListenerC1904lv viewOnFocusChangeListenerC1904lv = c2121qv.f15765f;
/* 163 */                   editText.setOnFocusChangeListener(viewOnFocusChangeListenerC1904lv);
/* 168 */                   c2121qv.f7139c.setOnFocusChangeListener(viewOnFocusChangeListenerC1904lv);
/* 171 */                   C1867kv c1867kv = c2121qv.f15764e;
/* 173 */                   editText.removeTextChangedListener(c1867kv);
/* 176 */                   editText.addTextChangedListener(c1867kv);
                            break;
                        case 1:
/* 34 */                    EditText editText2 = textInputLayout.getEditText();
/* 40 */                    if (!(editText2 instanceof AutoCompleteTextView)) {
/* 144 */                       f42.m3663s("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                            } else {
/* 42 */                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
/* 44 */                        za0 za0Var = (za0) de0Var;
/* 46 */                        wa0 wa0Var = za0Var.f20019e;
/* 50 */                        int boxBackgroundMode = za0Var.f7137a.getBoxBackgroundMode();
/* 55 */                        if (boxBackgroundMode == 2) {
/* 59 */                            autoCompleteTextView.setDropDownBackgroundDrawable(za0Var.f20030p);
                                } else if (boxBackgroundMode == 1) {
/* 67 */                            autoCompleteTextView.setDropDownBackgroundDrawable(za0Var.f20029o);
                                }
/* 70 */                        za0Var.m10295e(autoCompleteTextView);
/* 78 */                        autoCompleteTextView.setOnTouchListener(new ya0(za0Var, autoCompleteTextView));
/* 83 */                        autoCompleteTextView.setOnFocusChangeListener(za0Var.f20020f);
/* 91 */                        autoCompleteTextView.setOnDismissListener(new va0(za0Var));
/* 95 */                        autoCompleteTextView.setThreshold(0);
/* 98 */                        autoCompleteTextView.removeTextChangedListener(wa0Var);
/* 101 */                       autoCompleteTextView.addTextChangedListener(wa0Var);
/* 104 */                       textInputLayout.setEndIconCheckable(true);
/* 108 */                       textInputLayout.setErrorIconDrawable((Drawable) null);
/* 115 */                       if (autoCompleteTextView.getKeyListener() == null && za0Var.f20031q.isTouchExplorationEnabled()) {
/* 126 */                           CheckableImageButton checkableImageButton = za0Var.f7139c;
/* 128 */                           WeakHashMap weakHashMap = e33.f7494a;
/* 130 */                           checkableImageButton.setImportantForAccessibility(2);
                                }
/* 135 */                       textInputLayout.setTextInputAccessibilityDelegate(za0Var.f20021g);
/* 138 */                       textInputLayout.setEndIconVisible(true);
                            }
                            break;
                        default:
/* 9 */                     EditText editText3 = textInputLayout.getEditText();
/* 13 */                    or1 or1Var = (or1) de0Var;
/* 22 */                    or1Var.f7139c.setChecked(true ^ or1.m7238d(or1Var));
/* 25 */                    wa0 wa0Var2 = or1Var.f14869e;
/* 27 */                    editText3.removeTextChangedListener(wa0Var2);
/* 30 */                    editText3.addTextChangedListener(wa0Var2);
                            break;
                    }
                }
            }
