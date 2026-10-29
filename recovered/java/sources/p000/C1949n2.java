            package p000;

            import android.database.DataSetObserver;
            import androidx.appcompat.widget.ActivityChooserView;
            
            /* JADX INFO: renamed from: n2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1949n2 extends DataSetObserver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14101a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ActivityChooserView f14102b;

                public /* synthetic */ C1949n2(ActivityChooserView activityChooserView, int i) {
/* 1 */             this.f14101a = i;
/* 3 */             this.f14102b = activityChooserView;
                }

                @Override // android.database.DataSetObserver
                public final void onChanged() {
/* 1 */             int i = this.f14101a;
/* 3 */             ActivityChooserView activityChooserView = this.f14102b;
                    switch (i) {
                        case 0:
/* 18 */                    super.onChanged();
/* 23 */                    activityChooserView.f477a.notifyDataSetChanged();
/* 26 */                    return;
                        default:
/* 8 */                     super.onChanged();
/* 13 */                    activityChooserView.f477a.getClass();
/* 17 */                    throw null;
                    }
                }

                @Override // android.database.DataSetObserver
                public void onInvalidated() {
                    switch (this.f14101a) {
                        case 0:
/* 10 */                    super.onInvalidated();
/* 17 */                    this.f14102b.f477a.notifyDataSetInvalidated();
                            break;
                        default:
/* 6 */                     super.onInvalidated();
                            break;
                    }
                }
            }
