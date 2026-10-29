            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.Network;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class et0 extends ConnectivityManager.NetworkCallback {

                /* JADX INFO: renamed from: a */
                public Context f7870a;

                /* JADX INFO: renamed from: b */
                public ps0 f7871b;

                /* JADX INFO: renamed from: a */
                public final ConnectivityManager m3598a() {
                    try {
/* 9 */                 return (ConnectivityManager) this.f7870a.getSystemService("connectivity");
                    } catch (Exception e) {
/* 17 */                xe2.m9777o("AboveNConnectvtManager", "Exception while getting connectivity manager", e);
/* 20 */                return null;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
/* 1 */             ps0 ps0Var = this.f7871b;
/* 3 */             if (ps0Var != null) {
/* 5 */                 ps0Var.mo2886a();
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
/* 1 */             ps0 ps0Var = this.f7871b;
/* 3 */             if (ps0Var != null) {
/* 5 */                 ps0Var.mo2887e();
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onUnavailable() {
/* 1 */             ps0 ps0Var = this.f7871b;
/* 3 */             if (ps0Var != null) {
/* 5 */                 ps0Var.mo2887e();
                    }
                }
            }
