            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.view.MenuItem;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.FrameLayout;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xg1 implements vd2, eh1, AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: a */
                public Rect f19082a;

                /* JADX INFO: renamed from: n */
                public static int m9791n(ListAdapter listAdapter, Context context, int i) {
/* 2 */             int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 6 */             int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 10 */            int count = listAdapter.getCount();
/* 15 */            int i2 = 0;
/* 16 */            int i3 = 0;
/* 17 */            FrameLayout frameLayout = null;
/* 18 */            View view = null;
/* 19 */            for (int i4 = 0; i4 < count; i4++) {
/* 21 */                int itemViewType = listAdapter.getItemViewType(i4);
/* 25 */                if (itemViewType != i3) {
/* 27 */                    view = null;
/* 28 */                    i3 = itemViewType;
                        }
/* 29 */                if (frameLayout == null) {
/* 33 */                    frameLayout = new FrameLayout(context);
                        }
/* 36 */                view = listAdapter.getView(i4, view, frameLayout);
/* 40 */                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 43 */                int measuredWidth = view.getMeasuredWidth();
/* 47 */                if (measuredWidth >= i) {
/* 49 */                    return i;
                        }
/* 50 */                if (measuredWidth > i2) {
/* 52 */                    i2 = measuredWidth;
                        }
                    }
/* 56 */            return i2;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: f */
                public final boolean mo433f(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                public final int getId() {
/* 1 */             return 0;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: i */
                public final boolean mo434i(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
                }

                /* JADX INFO: renamed from: m */
                public abstract void mo5818m(jg1 jg1Var);

                /* JADX INFO: renamed from: o */
                public abstract void mo5819o(View view);

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 5 */             ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
/* 39 */            (listAdapter instanceof HeaderViewListAdapter ? (gg1) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (gg1) listAdapter).f8595a.m5809q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC2341wr) ? 0 : 4);
                }

                /* JADX INFO: renamed from: p */
                public abstract void mo5820p(boolean z);

                /* JADX INFO: renamed from: q */
                public abstract void mo5821q(int i);

                /* JADX INFO: renamed from: r */
                public abstract void mo5822r(int i);

                /* JADX INFO: renamed from: s */
                public abstract void mo5823s(PopupWindow.OnDismissListener onDismissListener);

                /* JADX INFO: renamed from: t */
                public abstract void mo5824t(boolean z);

                /* JADX INFO: renamed from: u */
                public abstract void mo5825u(int i);
            }
