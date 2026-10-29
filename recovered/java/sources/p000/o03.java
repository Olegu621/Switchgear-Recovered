            package p000;

            import android.app.Activity;
            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import com.usercentrics.sdk.UsercentricsReadyStatus;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final /* synthetic */ class o03 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14581a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UsercentricsSDK f14582b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Activity f14583c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f14584d;

                public /* synthetic */ o03(Activity activity, UsercentricsSDK usercentricsSDK, int i) {
/* 7 */             this.f14583c = activity;
/* 9 */             this.f14582b = usercentricsSDK;
/* 11 */            this.f14584d = i;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f14581a;
/* 3 */             int i2 = this.f14584d;
/* 5 */             Activity activity = this.f14583c;
/* 7 */             UsercentricsSDK usercentricsSDK = this.f14582b;
/* 9 */             UsercentricsReadyStatus usercentricsReadyStatus = (UsercentricsReadyStatus) obj;
                    switch (i) {
                        case 0:
/* 1 */                     return UsercentricsSDK.showDialog$lambda$6(activity, usercentricsSDK, i2, usercentricsReadyStatus);
                        default:
/* 1 */                     return UsercentricsSDK.getConsentOrShowDialog$lambda$0(usercentricsSDK, activity, i2, usercentricsReadyStatus);
                    }
                }

/* 13 */        public /* synthetic */ o03(UsercentricsSDK usercentricsSDK, Activity activity, int i) {
                    this.f14582b = usercentricsSDK;
                    this.f14583c = activity;
                    this.f14584d = i;
                }
            }
