            package androidx.fragment.app;

            import android.view.View;
            import p000.f42;
            import p000.fm0;
            import p000.mm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0099k extends mm0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Fragment f1462a;

                public C0099k(Fragment fragment) {
/* 4 */             this.f1462a = fragment;
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: b */
                public final View mo669b(int i) {
/* 1 */             Fragment fragment = this.f1462a;
/* 3 */             View view = fragment.mView;
/* 5 */             if (view != null) {
/* 7 */                 return view.findViewById(i);
                    }
/* 20 */            f42.m3656l(fm0.m3782h("Fragment ", fragment, " does not have a view"));
/* 23 */            return null;
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: c */
                public final boolean mo670c() {
                    return this.f1462a.mView != null;
                }
            }
