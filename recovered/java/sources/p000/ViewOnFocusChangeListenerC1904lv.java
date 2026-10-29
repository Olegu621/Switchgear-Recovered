            package p000;

            import android.view.View;
            import androidx.appcompat.widget.SearchView;
            
            /* JADX INFO: renamed from: lv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnFocusChangeListenerC1904lv implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13498a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13499b;

                public /* synthetic */ ViewOnFocusChangeListenerC1904lv(Object obj, int i) {
/* 1 */             this.f13498a = i;
/* 3 */             this.f13499b = obj;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
/* 1 */             int i = this.f13498a;
/* 3 */             Object obj = this.f13499b;
                    switch (i) {
                        case 0:
/* 34 */                    C2121qv c2121qv = (C2121qv) obj;
/* 40 */                    c2121qv.m8019e(C2121qv.m8018d(c2121qv));
                            break;
                        case 1:
/* 18 */                    za0 za0Var = (za0) obj;
/* 22 */                    za0Var.f7137a.setEndIconActivated(z);
/* 25 */                    if (!z) {
/* 28 */                        za0Var.m10298i(false);
/* 31 */                        za0Var.f20026l = false;
                            }
                            break;
                        default:
/* 8 */                     SearchView searchView = (SearchView) obj;
/* 10 */                    View.OnFocusChangeListener onFocusChangeListener = searchView.f633y0;
/* 12 */                    if (onFocusChangeListener != null) {
/* 14 */                        onFocusChangeListener.onFocusChange(searchView, z);
                            }
                            break;
                    }
                }
            }
