            package p000;

            import com.supercell.titan.GoogleServiceClient;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class yr0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19769a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ GoogleServiceClient f19770b;

                public /* synthetic */ yr0(GoogleServiceClient googleServiceClient, int i) {
/* 1 */             this.f19769a = i;
/* 3 */             this.f19770b = googleServiceClient;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19769a;
/* 3 */             GoogleServiceClient googleServiceClient = this.f19770b;
                    switch (i) {
                        case 0:
/* 16 */                    googleServiceClient.signOut();
                            break;
                        case 1:
/* 12 */                    googleServiceClient.signIn();
                            break;
                        default:
/* 8 */                     googleServiceClient.isAuthenticated();
                            break;
                    }
                }
            }
