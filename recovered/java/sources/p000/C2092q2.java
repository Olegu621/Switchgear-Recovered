            package p000;

            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.widget.ActivityChooserView;
            
            /* JADX INFO: renamed from: q2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2092q2 extends BaseAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ActivityChooserView f15367a;

                public C2092q2(ActivityChooserView activityChooserView) {
/* 1 */             this.f15367a = activityChooserView;
                }

                @Override // android.widget.Adapter
                public final int getCount() {
/* 2 */             throw null;
                }

                @Override // android.widget.Adapter
                public final Object getItem(int i) {
/* 2 */             throw null;
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 1 */             return i;
                }

                @Override // android.widget.BaseAdapter, android.widget.Adapter
                public final int getItemViewType(int i) {
/* 1 */             return 0;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             ActivityChooserView activityChooserView = this.f15367a;
/* 3 */             if (view == null || view.getId() != R$id.list_item) {
/* 24 */                view = LayoutInflater.from(activityChooserView.getContext()).inflate(R$layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
/* 32 */            activityChooserView.getContext().getPackageManager();
/* 44 */            throw null;
                }

                @Override // android.widget.BaseAdapter, android.widget.Adapter
                public final int getViewTypeCount() {
/* 1 */             return 3;
                }
            }
