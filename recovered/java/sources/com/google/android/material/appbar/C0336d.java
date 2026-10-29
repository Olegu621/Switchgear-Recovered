            package com.google.android.material.appbar;

            import android.view.View;
            import p000.InterfaceC2091q1;
            
            /* JADX INFO: renamed from: com.google.android.material.appbar.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0336d implements InterfaceC2091q1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AppBarLayout f4413a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f4414b;

                public C0336d(AppBarLayout appBarLayout, boolean z) {
/* 4 */             this.f4413a = appBarLayout;
/* 6 */             this.f4414b = z;
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public final boolean mo2236j(View view) {
/* 5 */             this.f4413a.setExpanded(this.f4414b);
/* 8 */             return true;
                }
            }
