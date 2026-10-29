            package androidx.fragment.app;

            import android.view.View;
            import android.view.Window;
            import p000.AbstractC1816k3;
            import p000.InterfaceC1876l3;
            import p000.aq1;
            import p000.bq1;
            import p000.c00;
            import p000.eq1;
            import p000.fh1;
            import p000.lg1;
            import p000.om0;
            import p000.sp1;
            import p000.t33;
            import p000.tp1;
            import p000.u33;
            import p000.v61;
            import p000.vp1;
            import p000.x62;
            import p000.xm0;
            import p000.z62;
            
            /* JADX INFO: renamed from: androidx.fragment.app.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0105q extends om0 implements vp1, eq1, aq1, bq1, u33, tp1, InterfaceC1876l3, z62, xm0, lg1 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ FragmentActivity f1468e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0105q(FragmentActivity fragmentActivity) {
/* 3 */             super(fragmentActivity);
/* 1 */             this.f1468e = fragmentActivity;
                }

                @Override // p000.xm0
                /* JADX INFO: renamed from: a */
                public final void mo672a(Fragment fragment) {
/* 3 */             this.f1468e.onAttachFragment(fragment);
                }

                @Override // p000.lg1
                public final void addMenuProvider(fh1 fh1Var) {
/* 3 */             this.f1468e.addMenuProvider(fh1Var);
                }

                @Override // p000.vp1
                public final void addOnConfigurationChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.addOnConfigurationChangedListener(c00Var);
                }

                @Override // p000.aq1
                public final void addOnMultiWindowModeChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.addOnMultiWindowModeChangedListener(c00Var);
                }

                @Override // p000.bq1
                public final void addOnPictureInPictureModeChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.addOnPictureInPictureModeChangedListener(c00Var);
                }

                @Override // p000.eq1
                public final void addOnTrimMemoryListener(c00 c00Var) {
/* 3 */             this.f1468e.addOnTrimMemoryListener(c00Var);
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: b */
                public final View mo669b(int i) {
/* 3 */             return this.f1468e.findViewById(i);
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: c */
                public final boolean mo670c() {
/* 3 */             Window window = this.f1468e.getWindow();
                    return (window == null || window.peekDecorView() == null) ? false : true;
                }

                @Override // p000.InterfaceC1876l3
                public final AbstractC1816k3 getActivityResultRegistry() {
/* 3 */             return this.f1468e.getActivityResultRegistry();
                }

                @Override // p000.g71
                public final v61 getLifecycle() {
/* 3 */             return this.f1468e.mFragmentLifecycleRegistry;
                }

                @Override // p000.tp1
                public final sp1 getOnBackPressedDispatcher() {
/* 3 */             return this.f1468e.getOnBackPressedDispatcher();
                }

                @Override // p000.z62
                public final x62 getSavedStateRegistry() {
/* 3 */             return this.f1468e.getSavedStateRegistry();
                }

                @Override // p000.u33
                public final t33 getViewModelStore() {
/* 3 */             return this.f1468e.getViewModelStore();
                }

                @Override // p000.lg1
                public final void removeMenuProvider(fh1 fh1Var) {
/* 3 */             this.f1468e.removeMenuProvider(fh1Var);
                }

                @Override // p000.vp1
                public final void removeOnConfigurationChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.removeOnConfigurationChangedListener(c00Var);
                }

                @Override // p000.aq1
                public final void removeOnMultiWindowModeChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.removeOnMultiWindowModeChangedListener(c00Var);
                }

                @Override // p000.bq1
                public final void removeOnPictureInPictureModeChangedListener(c00 c00Var) {
/* 3 */             this.f1468e.removeOnPictureInPictureModeChangedListener(c00Var);
                }

                @Override // p000.eq1
                public final void removeOnTrimMemoryListener(c00 c00Var) {
/* 3 */             this.f1468e.removeOnTrimMemoryListener(c00Var);
                }
            }
