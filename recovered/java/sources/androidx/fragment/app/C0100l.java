            package androidx.fragment.app;

            import android.view.View;
            import p000.d71;
            import p000.g71;
            import p000.t61;
            
            /* JADX INFO: renamed from: androidx.fragment.app.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0100l implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Fragment f1463a;

                public C0100l(Fragment fragment) {
/* 4 */             this.f1463a = fragment;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
                    View view;
/* 3 */             if (t61Var != t61.ON_STOP || (view = this.f1463a.mView) == null) {
/* 14 */                return;
                    }
/* 11 */            view.cancelPendingInputEvents();
                }
            }
