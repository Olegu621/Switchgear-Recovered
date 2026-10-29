            package p000;

            import com.google.android.gms.games.Player;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.GoogleServiceClient;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class xr0 implements OnCompleteListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19331a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ GoogleServiceClient f19332b;

                public /* synthetic */ xr0(GoogleServiceClient googleServiceClient, int i) {
/* 1 */             this.f19331a = i;
/* 3 */             this.f19332b = googleServiceClient;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
/* 1 */             int i = this.f19331a;
/* 5 */             int i2 = 0;
/* 6 */             GoogleServiceClient googleServiceClient = this.f19332b;
                    switch (i) {
                        case 0:
/* 149 */                   if (!task.isSuccessful()) {
/* 166 */                       googleServiceClient.f5790c = false;
/* 168 */                       googleServiceClient.f5793f = HttpUrl.FRAGMENT_ENCODE_SET;
/* 170 */                       GoogleServiceClient.onSignInFailed();
                            } else {
/* 152 */                       googleServiceClient.f5790c = true;
/* 160 */                       googleServiceClient.f5793f = (String) task.getResult();
/* 162 */                       GoogleServiceClient.onSignIn();
                            }
                            break;
                        case 1:
/* 121 */                   if (!task.isSuccessful()) {
/* 141 */                       GoogleServiceClient.onSignInFailed();
                            } else if (!((C0914fe) task.getResult()).f8176a) {
/* 137 */                       GoogleServiceClient.onSignInCanceled();
                            } else {
/* 133 */                       googleServiceClient.m2730a();
                            }
                            break;
                        case 2:
/* 105 */                   googleServiceClient.f5790c = false;
/* 107 */                   googleServiceClient.f5791d = HttpUrl.FRAGMENT_ENCODE_SET;
/* 109 */                   googleServiceClient.f5792e = HttpUrl.FRAGMENT_ENCODE_SET;
/* 111 */                   googleServiceClient.f5793f = HttpUrl.FRAGMENT_ENCODE_SET;
/* 113 */                   GoogleServiceClient.onSignOut();
                            break;
                        case 3:
/* 81 */                    if (!task.isSuccessful()) {
/* 101 */                       GoogleServiceClient.onSignInFailed();
                            } else if (!((C0914fe) task.getResult()).f8176a) {
/* 97 */                        GoogleServiceClient.onSignInCanceled();
                            } else {
/* 93 */                        googleServiceClient.m2730a();
                            }
                            break;
                        default:
/* 15 */                    if (!task.isSuccessful()) {
/* 73 */                        GoogleServiceClient.onSignInFailed();
                            } else {
/* 21 */                        Player player = (Player) task.getResult();
/* 27 */                        googleServiceClient.f5792e = player.mo2085f();
/* 33 */                        googleServiceClient.f5791d = player.mo2089t1();
/* 35 */                        player.getTitle();
/* 42 */                        Objects.toString(player.mo2084c());
/* 45 */                        GameApp.getInstance();
/* 69 */                        mn0.m6701q().requestServerSideAccess(GameApp.getInstance().getGooglePlayClientID(), false).addOnCompleteListener(new xr0(googleServiceClient, i2));
                            }
                            break;
                    }
                }
            }
