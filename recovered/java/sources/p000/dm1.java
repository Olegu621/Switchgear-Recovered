            package p000;

            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.google.android.material.internal.NavigationMenuView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dm1 extends c22 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ gm1 f7317f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dm1(gm1 gm1Var, NavigationMenuView navigationMenuView) {
/* 3 */             super(navigationMenuView);
/* 1 */             this.f7317f = gm1Var;
                }

                @Override // p000.c22, p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             super.mo128d(view, c0901f1);
/* 8 */             gm1 gm1Var = this.f7317f.f8727e.f19680g;
/* 21 */            int i = gm1Var.f8721b.getChildCount() == 0 ? 0 : 1;
/* 31 */            for (int i2 = 0; i2 < gm1Var.f8727e.f19677d.size(); i2++) {
/* 39 */                if (gm1Var.f8727e.mo957c(i2) == 0) {
/* 41 */                    i++;
                        }
                    }
/* 52 */            c0901f1.f7961a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false));
                }
            }
