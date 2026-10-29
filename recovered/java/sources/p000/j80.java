            package p000;

            import android.app.Dialog;
            import android.content.DialogInterface;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j80 implements DialogInterface.OnCancelListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DialogInterfaceOnCancelListenerC0097i f12137a;

                public j80(DialogInterfaceOnCancelListenerC0097i dialogInterfaceOnCancelListenerC0097i) {
/* 4 */             this.f12137a = dialogInterfaceOnCancelListenerC0097i;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 1 */             DialogInterfaceOnCancelListenerC0097i dialogInterfaceOnCancelListenerC0097i = this.f12137a;
/* 3 */             Dialog dialog = dialogInterfaceOnCancelListenerC0097i.f1447W;
/* 5 */             if (dialog != null) {
/* 7 */                 dialogInterfaceOnCancelListenerC0097i.onCancel(dialog);
                    }
                }
            }
