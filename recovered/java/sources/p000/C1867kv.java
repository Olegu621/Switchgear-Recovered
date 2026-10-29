            package p000;

            import android.text.Editable;
            import android.text.TextUtils;
            import android.text.TextWatcher;
            import androidx.appcompat.widget.SearchView;
            import com.google.android.material.textfield.TextInputLayout;
            
            /* JADX INFO: renamed from: kv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1867kv implements TextWatcher {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13016a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13017b;

                public /* synthetic */ C1867kv(Object obj, int i) {
/* 1 */             this.f13016a = i;
/* 3 */             this.f13017b = obj;
                }

                /* JADX INFO: renamed from: a */
                private final void m6283a(Editable editable) {
                }

                /* JADX INFO: renamed from: b */
                private final void m6284b(int i, int i2, int i3, CharSequence charSequence) {
                }

                /* JADX INFO: renamed from: c */
                private final void m6285c(int i, int i2, int i3, CharSequence charSequence) {
                }

                /* JADX INFO: renamed from: d */
                private final void m6286d(int i, int i2, int i3, CharSequence charSequence) {
                }

                /* JADX INFO: renamed from: e */
                private final void m6287e(int i, int i2, int i3, CharSequence charSequence) {
                }

                /* JADX INFO: renamed from: f */
                private final void m6288f(int i, int i2, int i3, CharSequence charSequence) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
/* 1 */             int i = this.f13016a;
/* 3 */             Object obj = this.f13017b;
                    switch (i) {
                        case 0:
/* 41 */                    C2121qv c2121qv = (C2121qv) obj;
/* 49 */                    if (c2121qv.f7137a.getSuffixText() == null) {
/* 56 */                        c2121qv.m8019e(C2121qv.m8018d(c2121qv));
                                break;
                            }
                            break;
                        case 1:
                            break;
                        default:
/* 8 */                     TextInputLayout textInputLayout = (TextInputLayout) obj;
/* 15 */                    textInputLayout.m2415t(!textInputLayout.f5076s1, false);
/* 20 */                    if (textInputLayout.f5027W) {
/* 26 */                        textInputLayout.m2408m(editable.length());
                            }
/* 31 */                    if (textInputLayout.f5050g0) {
/* 37 */                        textInputLayout.m2416u(editable.length());
                            }
                            break;
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             int i4 = this.f13016a;
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    switch (this.f13016a) {
                        case 1:
/* 9 */                     SearchView searchView = (SearchView) this.f13017b;
/* 13 */                    Editable text = searchView.f612d0.getText();
/* 17 */                    searchView.f604J0 = text;
/* 19 */                    boolean zIsEmpty = TextUtils.isEmpty(text);
/* 25 */                    searchView.m388v(!zIsEmpty);
/* 30 */                    int i4 = 8;
/* 32 */                    if (searchView.f603I0 && !searchView.f596B0 && zIsEmpty) {
/* 42 */                        searchView.f617i0.setVisibility(8);
/* 45 */                        i4 = 0;
                            }
/* 48 */                    searchView.f619k0.setVisibility(i4);
/* 51 */                    searchView.m384r();
/* 54 */                    searchView.m387u();
/* 57 */                    charSequence.toString();
                            break;
                    }
                }
            }
