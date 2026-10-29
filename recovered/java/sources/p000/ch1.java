            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.widget.HeaderViewListAdapter;
            import android.widget.ListAdapter;
            import androidx.appcompat.view.menu.ListMenuItemView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ch1 extends ra0 {

                /* JADX INFO: renamed from: a0 */
                public final int f2921a0;

                /* JADX INFO: renamed from: b0 */
                public final int f2922b0;

                /* JADX INFO: renamed from: c0 */
                public rg1 f2923c0;

                /* JADX INFO: renamed from: d0 */
                public sg1 f2924d0;

                public ch1(Context context, boolean z) {
/* 1 */             super(context, z);
/* 21 */            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
/* 23 */                this.f2921a0 = 21;
/* 25 */                this.f2922b0 = 22;
                    } else {
/* 28 */                this.f2921a0 = 22;
/* 30 */                this.f2922b0 = 21;
                    }
                }

                @Override // p000.ra0, android.view.View
                public final boolean onHoverEvent(MotionEvent motionEvent) {
                    gg1 gg1Var;
                    int headersCount;
                    int iPointToPosition;
                    int i;
/* 3 */             if (this.f2923c0 != null) {
/* 5 */                 ListAdapter adapter = getAdapter();
/* 11 */                if (adapter instanceof HeaderViewListAdapter) {
/* 13 */                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
/* 15 */                    headersCount = headerViewListAdapter.getHeadersCount();
/* 23 */                    gg1Var = (gg1) headerViewListAdapter.getWrappedAdapter();
                        } else {
/* 26 */                    gg1Var = (gg1) adapter;
/* 28 */                    headersCount = 0;
                        }
/* 68 */                sg1 sg1VarM3923b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= gg1Var.getCount()) ? null : gg1Var.getItem(i);
/* 69 */                sg1 sg1Var = this.f2924d0;
/* 71 */                if (sg1Var != sg1VarM3923b) {
/* 73 */                    jg1 jg1Var = gg1Var.f8595a;
/* 75 */                    if (sg1Var != null) {
/* 79 */                        this.f2923c0.mo429c(jg1Var, sg1Var);
                            }
/* 82 */                    this.f2924d0 = sg1VarM3923b;
/* 84 */                    if (sg1VarM3923b != null) {
/* 88 */                        this.f2923c0.mo430i(jg1Var, sg1VarM3923b);
                            }
                        }
                    }
/* 91 */            return super.onHoverEvent(motionEvent);
                }

                @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 5 */             ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
/* 8 */             if (listMenuItemView != null && i == this.f2921a0) {
/* 18 */                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
/* 38 */                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                        }
/* 7 */                 return true;
                    }
/* 42 */            if (listMenuItemView == null || i != this.f2922b0) {
/* 78 */                return super.onKeyDown(i, keyEvent);
                    }
/* 49 */            setSelection(-1);
/* 52 */            ListAdapter adapter = getAdapter();
/* 74 */            (adapter instanceof HeaderViewListAdapter ? (gg1) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (gg1) adapter).f8595a.m5803c(false);
/* 7 */             return true;
                }

                public void setHoverListener(rg1 rg1Var) {
/* 1 */             this.f2923c0 = rg1Var;
                }

                @Override // p000.ra0, android.widget.AbsListView
                public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
/* 1 */             super.setSelector(drawable);
                }
            }
