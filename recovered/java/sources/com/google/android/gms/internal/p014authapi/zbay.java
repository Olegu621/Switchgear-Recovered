            package com.google.android.gms.internal.p014authapi;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.RemoteException;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.auth.api.identity.BeginSignInRequest;
            import com.google.android.gms.auth.api.identity.BeginSignInResult;
            import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
            import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
            import com.google.android.gms.auth.api.identity.SignInCredential;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.Iterator;
            import java.util.Set;
            import p000.AbstractC2322w8;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.C1020i9;
            import p000.c32;
            import p000.f42;
            import p000.i13;
            import p000.kb1;
            import p000.nr0;
            import p000.or0;
            import p000.rc3;
            import p000.tm2;
            import p000.tr0;
            import p000.um2;
            import p000.ur0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class zbay extends or0 {
                private static final C0872e9 zba;
                private static final AbstractC2322w8 zbb;
                private static final C0983h9 zbc;
                private final String zbd;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zba = c0872e9;
/* 10 */            zbat zbatVar = new zbat();
/* 13 */            zbb = zbatVar;
/* 22 */            zbc = new C0983h9("Auth.Api.Identity.SignIn.API", zbatVar, c0872e9);
                }

                public zbay(Activity activity, rc3 rc3Var) {
/* 9 */             super(activity, activity, zbc, rc3Var, nr0.f14414c);
/* 16 */            this.zbd = zbbb.zba();
                }

                public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
/* 1 */             kb1.m6061n(beginSignInRequest);
/* 13 */            new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
/* 20 */            new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
/* 23 */            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.f3308b;
/* 25 */            kb1.m6061n(googleIdTokenRequestOptions);
/* 28 */            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.f3307a;
/* 30 */            kb1.m6061n(passwordRequestOptions);
/* 33 */            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f3312f;
/* 35 */            kb1.m6061n(passkeysRequestOptions);
/* 46 */            final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, this.zbd, beginSignInRequest.f3310d, beginSignInRequest.f3311e, passkeysRequestOptions);
/* 49 */            tm2 tm2VarBuilder = um2.builder();
/* 59 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zba};
/* 66 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbap
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zbay zbayVar = this.zba;
/* 3 */                     BeginSignInRequest beginSignInRequest3 = beginSignInRequest2;
/* 11 */                    zbau zbauVar = new zbau(zbayVar, (TaskCompletionSource) obj2);
/* 18 */                    zbai zbaiVar = (zbai) ((zbaz) obj).getService();
/* 20 */                    kb1.m6061n(beginSignInRequest3);
/* 23 */                    zbaiVar.zbc(zbauVar, beginSignInRequest3);
                        }
                    };
/* 68 */            tm2VarBuilder.f17186b = false;
/* 72 */            tm2VarBuilder.f17188d = 1553;
/* 78 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final String getPhoneNumberFromIntent(Intent intent) throws C1020i9 {
/* 1 */             Status status = Status.f3442i;
/* 3 */             if (intent == null) {
/* 57 */                throw new C1020i9(status);
                    }
/* 13 */            Status status2 = (Status) i13.m4435m(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
/* 15 */            if (status2 == null) {
/* 51 */                throw new C1020i9(Status.f3444w);
                    }
/* 21 */            if (!status2.m2006D1()) {
/* 43 */                throw new C1020i9(status2);
                    }
/* 25 */            String stringExtra = intent.getStringExtra("phone_number_hint_result");
/* 29 */            if (stringExtra != null) {
/* 31 */                return stringExtra;
                    }
/* 37 */            throw new C1020i9(status);
                }

                public final Task<PendingIntent> getPhoneNumberHintIntent(final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
/* 1 */             kb1.m6061n(getPhoneNumberHintIntentRequest);
/* 4 */             tm2 tm2VarBuilder = um2.builder();
/* 14 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zbh};
/* 21 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbas
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                     this.zba.zba(getPhoneNumberHintIntentRequest, (zbaz) obj, (TaskCompletionSource) obj2);
                        }
                    };
/* 25 */            tm2VarBuilder.f17188d = 1653;
/* 31 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws C1020i9 {
/* 1 */             Status status = Status.f3442i;
/* 3 */             if (intent == null) {
/* 61 */                throw new C1020i9(status);
                    }
/* 13 */            Status status2 = (Status) i13.m4435m(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
/* 15 */            if (status2 == null) {
/* 55 */                throw new C1020i9(Status.f3444w);
                    }
/* 21 */            if (!status2.m2006D1()) {
/* 47 */                throw new C1020i9(status2);
                    }
/* 31 */            SignInCredential signInCredential = (SignInCredential) i13.m4435m(intent, "sign_in_credential", SignInCredential.CREATOR);
/* 33 */            if (signInCredential != null) {
/* 35 */                return signInCredential;
                    }
/* 41 */            throw new C1020i9(status);
                }

                public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
/* 1 */             kb1.m6061n(getSignInIntentRequest);
/* 4 */             String str = getSignInIntentRequest.f3326a;
/* 6 */             kb1.m6061n(str);
/* 9 */             String str2 = getSignInIntentRequest.f3329d;
/* 21 */            final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(getSignInIntentRequest.f3331f, str, getSignInIntentRequest.f3327b, this.zbd, str2, getSignInIntentRequest.f3330e);
/* 24 */            tm2 tm2VarBuilder = um2.builder();
/* 34 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zbf};
/* 41 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbaq
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zbay zbayVar = this.zba;
/* 3 */                     GetSignInIntentRequest getSignInIntentRequest3 = getSignInIntentRequest2;
/* 11 */                    zbaw zbawVar = new zbaw(zbayVar, (TaskCompletionSource) obj2);
/* 18 */                    zbai zbaiVar = (zbai) ((zbaz) obj).getService();
/* 20 */                    kb1.m6061n(getSignInIntentRequest3);
/* 23 */                    zbaiVar.zbe(zbawVar, getSignInIntentRequest3);
                        }
                    };
/* 45 */            tm2VarBuilder.f17188d = 1555;
/* 51 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final Task<Void> signOut() {
/* 20 */            getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
/* 23 */            Set set = tr0.f17239a;
                    synchronized (set) {
                    }
/* 27 */            Iterator it = set.iterator();
/* 35 */            if (it.hasNext()) {
/* 80 */                ((tr0) it.next()).getClass();
/* 83 */                f42.m3660p();
/* 86 */                return null;
                    }
/* 37 */            ur0.m9123a();
/* 40 */            tm2 tm2VarBuilder = um2.builder();
/* 50 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zbb};
/* 57 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbar
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 7 */                     this.zba.zbb((zbaz) obj, (TaskCompletionSource) obj2);
                        }
                    };
/* 59 */            tm2VarBuilder.f17186b = false;
/* 63 */            tm2VarBuilder.f17188d = 1554;
/* 69 */            return doWrite(tm2VarBuilder.m8812a());
                }

                public final /* synthetic */ void zba(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbaz zbazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 14 */            ((zbai) zbazVar.getService()).zbd(new zbax(this, taskCompletionSource), getPhoneNumberHintIntentRequest, this.zbd);
                }

                public final /* synthetic */ void zbb(zbaz zbazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 14 */            ((zbai) zbazVar.getService()).zbf(new zbav(this, taskCompletionSource), this.zbd);
                }

/* 18 */        public zbay(Context context, rc3 rc3Var) {
/* 20 */            super(context, null, zbc, rc3Var, nr0.f14414c);
/* 21 */            this.zbd = zbbb.zba();
                }
            }
