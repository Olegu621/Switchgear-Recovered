            package p000;

            import android.view.View;
            import android.widget.AdapterView;
            import androidx.appcompat.widget.ListPopupWindow;
            import androidx.appcompat.widget.SearchView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l81 implements AdapterView.OnItemSelectedListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13149a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13150b;

                public /* synthetic */ l81(Object obj, int i) {
/* 1 */             this.f13149a = i;
/* 3 */             this.f13150b = obj;
                }

                /* JADX INFO: renamed from: a */
                private final void m6404a(AdapterView adapterView) {
                }

                /* JADX INFO: renamed from: b */
                private final void m6405b(AdapterView adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                    ra0 ra0Var;
/* 1 */             int i2 = this.f13149a;
/* 3 */             Object obj = this.f13150b;
                    switch (i2) {
                        case 0:
/* 15 */                    if (i != -1 && (ra0Var = ((ListPopupWindow) obj).f579c) != null) {
/* 24 */                        ra0Var.setListSelectionHidden(false);
                                break;
                            }
                            break;
                        default:
/* 10 */                    ((SearchView) obj).m381o(i);
                            break;
                    }
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
/* 1 */             int i = this.f13149a;
                }
            }
