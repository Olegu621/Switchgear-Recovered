            package p000;

            import android.app.Dialog;
            import android.view.View;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l80 extends mm0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ mm0 f13147a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DialogInterfaceOnCancelListenerC0097i f13148b;

                public l80(DialogInterfaceOnCancelListenerC0097i dialogInterfaceOnCancelListenerC0097i, mm0 mm0Var) {
/* 4 */             this.f13148b = dialogInterfaceOnCancelListenerC0097i;
/* 6 */             this.f13147a = mm0Var;
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: b */
                public final View mo669b(int i) {
/* 1 */             mm0 mm0Var = this.f13147a;
/* 7 */             if (mm0Var.mo670c()) {
/* 9 */                 return mm0Var.mo669b(i);
                    }
/* 16 */            Dialog dialog = this.f13148b.f1447W;
/* 18 */            if (dialog != null) {
/* 20 */                return dialog.findViewById(i);
                    }
/* 25 */            return null;
                }

                @Override // p000.mm0
                /* JADX INFO: renamed from: c */
                public final boolean mo670c() {
                    return this.f13147a.mo670c() || this.f13148b.f1452a0;
                }
            }
