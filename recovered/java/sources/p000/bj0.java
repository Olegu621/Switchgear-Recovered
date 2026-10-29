            package p000;

            import com.google.android.gms.cloudmessaging.CloudMessage;
            import com.google.android.gms.tasks.OnSuccessListener;
            import com.google.firebase.messaging.FirebaseMessaging;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class bj0 implements OnSuccessListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2444a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ FirebaseMessaging f2445b;

                public /* synthetic */ bj0(FirebaseMessaging firebaseMessaging, int i) {
/* 1 */             this.f2444a = i;
/* 3 */             this.f2445b = firebaseMessaging;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    boolean z;
/* 1 */             int i = this.f2444a;
/* 3 */             FirebaseMessaging firebaseMessaging = this.f2445b;
                    switch (i) {
                        case 0:
/* 21 */                    iq2 iq2Var = (iq2) obj;
/* 29 */                    if (!firebaseMessaging.f5301e.m8800h() || iq2Var.f11907h.m3987a() == null) {
/* 54 */                        return;
                            }
                            synchronized (iq2Var) {
/* 40 */                        z = iq2Var.f11906g;
                            }
/* 43 */                    if (z) {
/* 54 */                        return;
                            }
/* 47 */                    iq2Var.m5542f(0L);
/* 54 */                    return;
                        default:
/* 8 */                     CloudMessage cloudMessage = (CloudMessage) obj;
/* 10 */                    if (cloudMessage != null) {
/* 14 */                        b40.m1240x(cloudMessage.f3410a);
/* 17 */                        firebaseMessaging.m2530e();
/* 20 */                        return;
                            }
/* 20 */                    return;
                    }
                }
            }
