            package p000;

            import android.view.View;
            import android.widget.AdapterView;
            import androidx.appcompat.widget.AppCompatSpinner;
            import androidx.appcompat.widget.ListPopupWindow;
            import androidx.appcompat.widget.SearchView;
            import com.google.android.material.textfield.MaterialAutoCompleteTextView;
            
            /* JADX INFO: renamed from: jb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1787jb implements AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12167a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12168b;

                public /* synthetic */ C1787jb(Object obj, int i) {
/* 1 */             this.f12167a = i;
/* 3 */             this.f12168b = obj;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    Object item;
/* 1 */             int i2 = this.f12167a;
/* 3 */             Object obj = this.f12168b;
                    switch (i2) {
                        case 0:
/* 126 */                   C1884lb c1884lb = (C1884lb) obj;
/* 128 */                   AppCompatSpinner appCompatSpinner = c1884lb.f13168q0;
/* 130 */                   appCompatSpinner.setSelection(i);
/* 137 */                   if (appCompatSpinner.getOnItemClickListener() != null) {
/* 145 */                       appCompatSpinner.performItemClick(view, i, c1884lb.f13165n0.getItemId(i));
                            }
/* 148 */                   c1884lb.dismiss();
                            break;
                        case 1:
/* 14 */                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
/* 16 */                    ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f4996e;
/* 19 */                    if (i < 0) {
/* 33 */                        item = !listPopupWindow.f591j0.isShowing() ? null : listPopupWindow.f579c.getSelectedItem();
                            } else {
/* 42 */                        item = materialAutoCompleteTextView.getAdapter().getItem(i);
                            }
/* 46 */                    MaterialAutoCompleteTextView.m2394a(materialAutoCompleteTextView, item);
/* 49 */                    AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
/* 53 */                    if (onItemClickListener != null) {
/* 55 */                        if (view == null || i < 0) {
/* 76 */                            view = !listPopupWindow.f591j0.isShowing() ? null : listPopupWindow.f579c.getSelectedView();
/* 94 */                            i = !listPopupWindow.f591j0.isShowing() ? -1 : listPopupWindow.f579c.getSelectedItemPosition();
/* 112 */                           j = !listPopupWindow.f591j0.isShowing() ? Long.MIN_VALUE : listPopupWindow.f579c.getSelectedItemId();
                                }
/* 119 */                       onItemClickListener.onItemClick(listPopupWindow.f579c, view, i, j);
                            }
/* 122 */                   listPopupWindow.dismiss();
                            break;
                        default:
/* 10 */                    ((SearchView) obj).m380n(i);
                            break;
                    }
                }
            }
