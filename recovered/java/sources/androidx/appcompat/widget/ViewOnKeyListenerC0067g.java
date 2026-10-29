            package androidx.appcompat.widget;

            import android.text.TextUtils;
            import android.view.KeyEvent;
            import android.view.View;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnKeyListenerC0067g implements View.OnKeyListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ SearchView f757a;

                public ViewOnKeyListenerC0067g(SearchView searchView) {
/* 4 */             this.f757a = searchView;
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
/* 1 */             SearchView searchView = this.f757a;
/* 3 */             SearchView.SearchAutoComplete searchAutoComplete = searchView.f612d0;
/* 8 */             if (searchView.f607M0 != null) {
/* 19 */                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
/* 117 */                   if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
/* 134 */                       view.cancelLongPress();
/* 156 */                       searchView.getContext().startActivity(searchView.m376j(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
/* 18 */                        return true;
                            }
                        } else if (searchView.f607M0 != null && searchView.f597C0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
/* 52 */                    if (i == 66 || i == 84 || i == 61) {
/* 105 */                       searchView.m380n(searchAutoComplete.getListSelection());
/* 18 */                        return true;
                            }
/* 65 */                    if (i == 21 || i == 22) {
/* 88 */                        searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
/* 91 */                        searchAutoComplete.setListSelection(0);
/* 94 */                        searchAutoComplete.clearListSelection();
/* 97 */                        searchAutoComplete.m390a();
/* 18 */                        return true;
                            }
/* 74 */                    if (i == 19) {
/* 76 */                        searchAutoComplete.getListSelection();
/* 7 */                         return false;
                            }
                        }
                    }
/* 7 */             return false;
                }
            }
