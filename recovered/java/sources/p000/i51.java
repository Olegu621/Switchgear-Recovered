            package p000;

            import android.content.Context;
            import android.widget.PopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i51 implements PopupWindow.OnDismissListener {

                /* JADX INFO: renamed from: a */
                public final Context f9449a;

                /* JADX INFO: renamed from: b */
                public final PopupWindow f9450b;

                /* JADX INFO: renamed from: c */
                public n01 f9451c;

                public i51(Context context, ew2 ew2Var) {
/* 1 */             context.getClass();
/* 4 */             ew2Var.getClass();
/* 10 */            this.f9449a = context;
/* 17 */            this.f9450b = new PopupWindow();
                }

                /* JADX INFO: renamed from: a */
                public final int m4473a() {
/* 5 */             return yy1.m10220o(this.f9449a, 8);
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
/* 1 */             PopupWindow popupWindow = this.f9450b;
/* 7 */             if (popupWindow.isShowing()) {
/* 9 */                 popupWindow.dismiss();
                    }
                }
            }
