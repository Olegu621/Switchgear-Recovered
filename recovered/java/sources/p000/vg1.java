            package p000;

            import android.view.MenuItem;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vg1 implements MenuItem.OnActionExpandListener {

                /* JADX INFO: renamed from: a */
                public final MenuItem.OnActionExpandListener f18053a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ wg1 f18054b;

                public vg1(wg1 wg1Var, MenuItem.OnActionExpandListener onActionExpandListener) {
/* 4 */             this.f18054b = wg1Var;
/* 6 */             this.f18053a = onActionExpandListener;
                }

                @Override // android.view.MenuItem.OnActionExpandListener
                public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
/* 9 */             return this.f18053a.onMenuItemActionCollapse(this.f18054b.m8749i(menuItem));
                }

                @Override // android.view.MenuItem.OnActionExpandListener
                public final boolean onMenuItemActionExpand(MenuItem menuItem) {
/* 9 */             return this.f18053a.onMenuItemActionExpand(this.f18054b.m8749i(menuItem));
                }
            }
