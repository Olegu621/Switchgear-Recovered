            package com.google.android.material.appbar;

            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import p000.InterfaceC2091q1;
            
            /* JADX INFO: renamed from: com.google.android.material.appbar.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0335c implements InterfaceC2091q1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CoordinatorLayout f4408a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AppBarLayout f4409b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f4410c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f4411d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ AppBarLayout.BaseBehavior f4412e;

                public C0335c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
/* 4 */             this.f4412e = baseBehavior;
/* 6 */             this.f4408a = coordinatorLayout;
/* 8 */             this.f4409b = appBarLayout;
/* 10 */            this.f4410c = view;
/* 12 */            this.f4411d = i;
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public final boolean mo2236j(View view) {
/* 16 */            this.f4412e.m2213E(this.f4408a, this.f4409b, this.f4410c, this.f4411d, new int[]{0, 0});
/* 19 */            return true;
                }
            }
