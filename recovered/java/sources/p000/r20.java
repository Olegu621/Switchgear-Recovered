            package p000;

            import android.database.DataSetObserver;
            import androidx.appcompat.widget.ListPopupWindow;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.tabs.TabLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r20 extends DataSetObserver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15831a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15832b;

                public /* synthetic */ r20(Object obj, int i) {
/* 1 */             this.f15831a = i;
/* 3 */             this.f15832b = obj;
                }

                @Override // android.database.DataSetObserver
                public final void onChanged() {
/* 1 */             int i = this.f15831a;
/* 3 */             Object obj = this.f15832b;
                    switch (i) {
                        case 0:
/* 34 */                    ni2 ni2Var = (ni2) obj;
/* 37 */                    ni2Var.f16387a = true;
/* 39 */                    ni2Var.notifyDataSetChanged();
                            break;
                        case 1:
/* 20 */                    ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
/* 28 */                    if (listPopupWindow.f591j0.isShowing()) {
/* 30 */                        listPopupWindow.show();
                            }
                            break;
                        case 2:
/* 16 */                    ((TabLayout) obj).m2388i();
                            break;
                        default:
/* 10 */                    ((ViewPager) obj).m1123e();
                            break;
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
/* 1 */             int i = this.f15831a;
/* 3 */             Object obj = this.f15832b;
                    switch (i) {
                        case 0:
/* 26 */                    ni2 ni2Var = (ni2) obj;
/* 29 */                    ni2Var.f16387a = false;
/* 31 */                    ni2Var.notifyDataSetInvalidated();
                            break;
                        case 1:
/* 22 */                    ((ListPopupWindow) obj).dismiss();
                            break;
                        case 2:
/* 16 */                    ((TabLayout) obj).m2388i();
                            break;
                        default:
/* 10 */                    ((ViewPager) obj).m1123e();
                            break;
                    }
                }
            }
