            package com.google.android.material.appbar;

            import android.view.View;
            import android.widget.ScrollView;
            import p000.C0901f1;
            import p000.C2201t0;
            
            /* JADX INFO: renamed from: com.google.android.material.appbar.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0334b extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AppBarLayout.BaseBehavior f4407d;

                public C0334b(AppBarLayout.BaseBehavior baseBehavior) {
/* 1 */             this.f4407d = baseBehavior;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 12 */            c0901f1.m3631l(this.f4407d.f4343o);
/* 21 */            c0901f1.m3628i(ScrollView.class.getName());
                }
            }
