            package p000;

            import android.app.AlertDialog;
            import com.google.android.gms.internal.base.zau;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ec3 extends fb3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AlertDialog f7625a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ cp0 f7626b;

                public ec3(cp0 cp0Var, AlertDialog alertDialog) {
/* 1 */             this.f7626b = cp0Var;
/* 3 */             this.f7625a = alertDialog;
                }

                @Override // p000.fb3
                /* JADX INFO: renamed from: a */
                public final void mo3408a() {
/* 5 */             ya3 ya3Var = (ya3) this.f7626b.f6869c;
/* 10 */            ya3Var.f19557b.set(null);
/* 15 */            zau zauVar = ya3Var.f19561f.f17695n;
/* 22 */            zauVar.sendMessage(zauVar.obtainMessage(3));
/* 25 */            AlertDialog alertDialog = this.f7625a;
/* 31 */            if (alertDialog.isShowing()) {
/* 33 */                alertDialog.dismiss();
                    }
                }
            }
