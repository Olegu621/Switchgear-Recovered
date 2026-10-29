            package p000;

            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class vi2 extends DialogInterfaceOnCancelListenerC0097i {

                /* JADX INFO: renamed from: b0 */
                public Dialog f18203b0;

                /* JADX INFO: renamed from: c0 */
                public DialogInterface.OnCancelListener f18204c0;

                /* JADX INFO: renamed from: d0 */
                public AlertDialog f18205d0;

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i
                /* JADX INFO: renamed from: h */
                public final Dialog mo667h() {
/* 1 */             Dialog dialog = this.f18203b0;
/* 3 */             if (dialog != null) {
/* 33 */                return dialog;
                    }
/* 6 */             this.f1459v = false;
/* 10 */            if (this.f18205d0 == null) {
/* 14 */                Context context = getContext();
/* 18 */                kb1.m6061n(context);
/* 28 */                this.f18205d0 = new AlertDialog.Builder(context).create();
                    }
/* 30 */            return this.f18205d0;
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 1 */             DialogInterface.OnCancelListener onCancelListener = this.f18204c0;
/* 3 */             if (onCancelListener != null) {
/* 5 */                 onCancelListener.onCancel(dialogInterface);
                    }
                }
            }
