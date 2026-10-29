            package androidx.fragment.app;

            import android.os.Bundle;
            import p000.km0;
            import p000.mn0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0098j extends km0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Fragment f1461a;

                public C0098j(Fragment fragment) {
/* 4 */             this.f1461a = fragment;
                }

                @Override // p000.km0
                /* JADX INFO: renamed from: a */
                public final void mo668a() {
/* 1 */             Fragment fragment = this.f1461a;
/* 5 */             fragment.mSavedStateRegistryController.m10113a();
/* 8 */             mn0.m6696l(fragment);
/* 11 */            Bundle bundle = fragment.mSavedFragmentState;
/* 25 */            fragment.mSavedStateRegistryController.m10114b(bundle != null ? bundle.getBundle("registryState") : null);
                }
            }
