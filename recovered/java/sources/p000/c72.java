            package p000;

            import android.content.ComponentName;
            import android.os.RemoteException;
            import android.support.customtabs.ICustomTabsService;
            import com.supercell.titan.ScExternalWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c72 extends l30 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ScExternalWebView f2755a;

                public c72(ScExternalWebView scExternalWebView) {
/* 4 */             this.f2755a = scExternalWebView;
                }

                @Override // p000.l30
                public final void onCustomTabsServiceConnected(ComponentName componentName, e30 e30Var) {
/* 4 */             ScExternalWebView scExternalWebView = this.f2755a;
/* 6 */             scExternalWebView.f5894c = (k30) e30Var;
                    try {
/* 12 */                e30Var.f7492a.warmup(0L);
                    } catch (RemoteException unused) {
                    }
/* 15 */            k30 k30Var = scExternalWebView.f5894c;
/* 17 */            e72 e72Var = scExternalWebView.f5900i;
/* 19 */            ICustomTabsService iCustomTabsService = k30Var.f7492a;
/* 23 */            d30 d30Var = new d30(e72Var);
/* 26 */            o30 o30Var = null;
                    try {
/* 31 */                if (iCustomTabsService.newSession(d30Var)) {
/* 38 */                    o30Var = new o30(iCustomTabsService, d30Var, k30Var.f7493b);
                        }
                    } catch (RemoteException unused2) {
                    }
/* 41 */            if (o30Var != null) {
/* 45 */                i30 i30Var = new i30(o30Var);
/* 53 */                i30Var.f9432a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
/* 60 */                scExternalWebView.f5893b = i30Var.m4451a();
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 4 */             this.f2755a.f5894c = null;
                }
            }
