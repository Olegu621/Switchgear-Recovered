            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.signin.internal.zaf;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ie2 extends kr0 {

                /* JADX INFO: renamed from: a */
                public final boolean f9560a;

                /* JADX INFO: renamed from: b */
                public final C2345wv f9561b;

                /* JADX INFO: renamed from: c */
                public final Bundle f9562c;

                /* JADX INFO: renamed from: d */
                public final Integer f9563d;

                public ie2(Context context, Looper looper, C2345wv c2345wv, rr0 rr0Var, sr0 sr0Var, Bundle bundle) {
/* 9 */             super(context, looper, 44, c2345wv, rr0Var, sr0Var);
/* 13 */            this.f9560a = true;
/* 15 */            this.f9561b = c2345wv;
/* 17 */            this.f9562c = bundle;
/* 21 */            this.f9563d = c2345wv.f18830h;
                }

                /* JADX INFO: renamed from: b */
                public static Bundle m4519b(C2345wv c2345wv) {
/* 1 */             c2345wv.getClass();
/* 4 */             Integer num = c2345wv.f18830h;
/* 8 */             Bundle bundle = new Bundle();
/* 15 */            bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2345wv.f18823a);
/* 18 */            if (num != null) {
/* 26 */                bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                    }
/* 32 */            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
/* 37 */            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
/* 43 */            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
/* 49 */            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
/* 54 */            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
/* 59 */            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
/* 64 */            bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
/* 69 */            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
/* 72 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
                    return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService");
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 1 */             C2345wv c2345wv = this.f9561b;
/* 13 */            boolean zEquals = getContext().getPackageName().equals(c2345wv.f18827e);
/* 17 */            Bundle bundle = this.f9562c;
/* 19 */            if (!zEquals) {
/* 25 */                bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c2345wv.f18827e);
                    }
/* 28 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.signin.internal.ISignInService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.signin.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final boolean requiresSignIn() {
/* 1 */             return this.f9560a;
                }
            }
