            package p000;

            import com.google.firebase.installations.FirebaseInstallations;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class xi0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19165a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ FirebaseInstallations f19166b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f19167c;

                public /* synthetic */ xi0(FirebaseInstallations firebaseInstallations, boolean z, int i) {
/* 1 */             this.f19165a = i;
/* 3 */             this.f19166b = firebaseInstallations;
/* 5 */             this.f19167c = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19165a;
/* 3 */             boolean z = this.f19167c;
/* 5 */             FirebaseInstallations firebaseInstallations = this.f19166b;
                    switch (i) {
                        case 0:
/* 1 */                     firebaseInstallations.lambda$doRegistrationOrRefresh$3(z);
                            break;
                        default:
/* 1 */                     firebaseInstallations.lambda$getToken$2(z);
                            break;
                    }
                }
            }
