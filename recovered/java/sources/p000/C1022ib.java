            package p000;

            import android.database.DataSetObserver;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ListAdapter;
            import android.widget.SpinnerAdapter;
            
            /* JADX INFO: renamed from: ib */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1022ib implements ListAdapter, SpinnerAdapter {

                /* JADX INFO: renamed from: a */
                public SpinnerAdapter f9517a;

                /* JADX INFO: renamed from: b */
                public ListAdapter f9518b;

                @Override // android.widget.ListAdapter
                public final boolean areAllItemsEnabled() {
/* 1 */             ListAdapter listAdapter = this.f9518b;
/* 3 */             if (listAdapter != null) {
/* 5 */                 return listAdapter.areAllItemsEnabled();
                    }
/* 10 */            return true;
                }

                @Override // android.widget.Adapter
                public final int getCount() {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return spinnerAdapter.getCount();
                }

                @Override // android.widget.SpinnerAdapter
                public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return null;
                    }
/* 7 */             return spinnerAdapter.getDropDownView(i, view, viewGroup);
                }

                @Override // android.widget.Adapter
                public final Object getItem(int i) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return null;
                    }
/* 7 */             return spinnerAdapter.getItem(i);
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return -1L;
                    }
/* 8 */             return spinnerAdapter.getItemId(i);
                }

                @Override // android.widget.Adapter
                public final int getItemViewType(int i) {
/* 1 */             return 0;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             return getDropDownView(i, view, viewGroup);
                }

                @Override // android.widget.Adapter
                public final int getViewTypeCount() {
/* 1 */             return 1;
                }

                @Override // android.widget.Adapter
                public final boolean hasStableIds() {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
                    return spinnerAdapter != null && spinnerAdapter.hasStableIds();
                }

                @Override // android.widget.Adapter
                public final boolean isEmpty() {
                    return getCount() == 0;
                }

                @Override // android.widget.ListAdapter
                public final boolean isEnabled(int i) {
/* 1 */             ListAdapter listAdapter = this.f9518b;
/* 3 */             if (listAdapter != null) {
/* 5 */                 return listAdapter.isEnabled(i);
                    }
/* 10 */            return true;
                }

                @Override // android.widget.Adapter
                public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter != null) {
/* 5 */                 spinnerAdapter.registerDataSetObserver(dataSetObserver);
                    }
                }

                @Override // android.widget.Adapter
                public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.f9517a;
/* 3 */             if (spinnerAdapter != null) {
/* 5 */                 spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
                    }
                }
            }
