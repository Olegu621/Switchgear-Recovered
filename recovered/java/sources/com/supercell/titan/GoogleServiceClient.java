            package com.supercell.titan;

            import android.content.Intent;
            import android.os.Looper;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.internal.games_v2.zzar;
            import com.google.android.gms.internal.games_v2.zzbr;
            import com.google.android.gms.internal.games_v2.zzce;
            import com.google.android.gms.internal.games_v2.zzef;
            import okhttp3.HttpUrl;
            import p000.AbstractC0213ce;
            import p000.C0983h9;
            import p000.fc3;
            import p000.kb1;
            import p000.mn0;
            import p000.nr0;
            import p000.pr0;
            import p000.qr0;
            import p000.s80;
            import p000.xr0;
            import p000.xt0;
            import p000.yr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GoogleServiceClient {

                /* JADX INFO: renamed from: a */
                public volatile boolean f5788a = false;

                /* JADX INFO: renamed from: b */
                public volatile boolean f5789b = false;

                /* JADX INFO: renamed from: c */
                public volatile boolean f5790c = false;

                /* JADX INFO: renamed from: d */
                public volatile String f5791d = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: e */
                public volatile String f5792e = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: f */
                public volatile String f5793f = HttpUrl.FRAGMENT_ENCODE_SET;

                public GoogleServiceClient(GameApp gameApp) {
/* 25 */            String stringResourceByName = GameApp.getInstance().getStringResourceByName("googleplay_clientid");
/* 29 */            if (stringResourceByName == null || stringResourceByName.isEmpty()) {
/* 40 */                return;
                    }
/* 37 */            updateNativeInstance(this);
                }

                public static native void onSignIn();

                public static native void onSignInCanceled();

                public static native void onSignInFailed();

                public static native void onSignOut();

                public static native void updateNativeInstance(GoogleServiceClient googleServiceClient);

                /* JADX INFO: renamed from: a */
                public final void m2730a() {
/* 1 */             GameApp.getInstance();
/* 4 */             zzbr.zzb();
/* 30 */            new zzef(zzar.zza(zzbr.zza())).getCurrentPlayer().addOnCompleteListener(new xr0(this, 4));
                }

                public void forNative_isAuthenticated() {
/* 11 */            GameApp.getInstance().runOnUiThread(new yr0(this, 2));
                }

                public void forNative_signIn(boolean z) {
/* 11 */            GameApp.getInstance().runOnUiThread(new yr0(this, 1));
                }

                public void forNative_signOut() {
/* 11 */            GameApp.getInstance().runOnUiThread(new yr0(this, 0));
                }

                public String getAuthCode() {
/* 1 */             return this.f5793f;
                }

                public String getPlayerDisplayName() {
/* 1 */             return this.f5792e;
                }

                public String getPlayerId() {
/* 1 */             return this.f5791d;
                }

                public void isAuthenticated() {
/* 5 */             if (isAvailable()) {
/* 7 */                 GameApp.getInstance();
/* 35 */                mn0.m6701q().isAuthenticated().addOnFailureListener(new s80(28)).addOnCompleteListener(new xr0(this, 3));
                    }
                }

                public boolean isAvailable() {
/* 3 */             if (this.f5789b) {
/* 5 */                 return this.f5788a;
                    }
/* 26 */            this.f5788a = pr0.f15259d.m8004c(GameApp.getInstance(), qr0.f15711a) == 0;
/* 28 */            this.f5789b = true;
/* 30 */            return this.f5788a;
                }

                public boolean isSignedIn() {
/* 1 */             return this.f5790c;
                }

                public void onActivityResult(int i, int i2, Intent intent) {
                }

                public void onStart() {
                }

                public void onStop() {
                }

                public void showAchievements() {
/* 1 */             GameApp.getInstance();
/* 4 */             zzbr.zzb();
/* 31 */            new zzce(zzar.zza(zzbr.zza())).getAchievementsIntent().addOnSuccessListener(new s80(27));
                }

                public void signIn() {
/* 5 */             if (isAvailable()) {
/* 7 */                 GameApp.getInstance();
/* 35 */                mn0.m6701q().signIn().addOnFailureListener(new s80(26)).addOnCompleteListener(new xr0(this, 1));
                    }
                }

                public void signOut() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 5 */             GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f3380W;
/* 9 */             kb1.m6061n(googleSignInOptions);
/* 12 */            C0983h9 c0983h9 = AbstractC0213ce.f2859b;
/* 18 */            xt0 xt0Var = new xt0(16);
/* 21 */            Looper mainLooper = gameApp.getMainLooper();
/* 27 */            kb1.m6062o(mainLooper, "Looper must not be null.");
/* 50 */            new fc3(gameApp, gameApp, c0983h9, googleSignInOptions, new nr0(xt0Var, mainLooper)).signOut().addOnCompleteListener(new xr0(this, 2));
                }

                public void unlockAchievement(String str) {
/* 1 */             GameApp.getInstance();
/* 4 */             zzbr.zzb();
/* 20 */            new zzce(zzar.zza(zzbr.zza())).unlock(str);
                }
            }
