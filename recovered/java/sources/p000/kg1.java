            package p000;

            import android.content.DialogInterface;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.Window;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kg1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, dh1 {

                /* JADX INFO: renamed from: a */
                public hi2 f12744a;

                /* JADX INFO: renamed from: b */
                public DialogInterfaceC1991o7 f12745b;

                /* JADX INFO: renamed from: c */
                public k81 f12746c;

                @Override // p000.dh1
                /* JADX INFO: renamed from: d */
                public final void mo2938d(jg1 jg1Var, boolean z) {
                    DialogInterfaceC1991o7 dialogInterfaceC1991o7;
/* 1 */             if ((z || jg1Var == this.f12744a) && (dialogInterfaceC1991o7 = this.f12745b) != null) {
/* 11 */                dialogInterfaceC1991o7.dismiss();
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
/* 1 */             hi2 hi2Var = this.f12744a;
/* 3 */             k81 k81Var = this.f12746c;
/* 7 */             if (k81Var.f12653i == null) {
/* 14 */                k81Var.f12653i = new j81(k81Var);
                    }
/* 24 */            hi2Var.m5809q(k81Var.f12653i.getItem(i), null, 0);
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
/* 6 */             this.f12746c.mo421d(this.f12744a, true);
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    Window window;
                    View decorView;
                    KeyEvent.DispatcherState keyDispatcherState;
                    View decorView2;
                    KeyEvent.DispatcherState keyDispatcherState2;
/* 1 */             hi2 hi2Var = this.f12744a;
/* 5 */             if (i == 82 || i == 4) {
/* 15 */                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 25 */                    Window window2 = this.f12745b.getWindow();
/* 29 */                    if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
/* 43 */                        keyDispatcherState2.startTracking(keyEvent, this);
/* 14 */                        return true;
                            }
                        } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f12745b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
/* 85 */                    hi2Var.m5803c(true);
/* 88 */                    dialogInterface.dismiss();
/* 14 */                    return true;
                        }
                    }
/* 93 */            return hi2Var.performShortcut(i, keyEvent, 0);
                }

                @Override // p000.dh1
                /* JADX INFO: renamed from: z */
                public final boolean mo2942z(jg1 jg1Var) {
/* 1 */             return false;
                }
            }
