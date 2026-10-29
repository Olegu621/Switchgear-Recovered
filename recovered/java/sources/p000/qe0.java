            package p000;

            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.app.DialogFragment;
            import android.content.DialogInterface;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class qe0 extends DialogFragment {

                /* JADX INFO: renamed from: a */
                public Dialog f15500a;

                /* JADX INFO: renamed from: b */
                public DialogInterface.OnCancelListener f15501b;

                /* JADX INFO: renamed from: c */
                public AlertDialog f15502c;

                @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 1 */             DialogInterface.OnCancelListener onCancelListener = this.f15501b;
/* 3 */             if (onCancelListener != null) {
/* 5 */                 onCancelListener.onCancel(dialogInterface);
                    }
                }

                @Override // android.app.DialogFragment
                public final Dialog onCreateDialog(Bundle bundle) {
/* 1 */             Dialog dialog = this.f15500a;
/* 3 */             if (dialog != null) {
/* 34 */                return dialog;
                    }
/* 6 */             setShowsDialog(false);
/* 11 */            if (this.f15502c == null) {
/* 15 */                Activity activity = getActivity();
/* 19 */                kb1.m6061n(activity);
/* 29 */                this.f15502c = new AlertDialog.Builder(activity).create();
                    }
/* 31 */            return this.f15502c;
                }
            }
