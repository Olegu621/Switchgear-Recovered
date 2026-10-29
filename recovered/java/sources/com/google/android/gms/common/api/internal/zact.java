            package com.google.android.gms.common.api.internal;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Handler;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.common.internal.zat;
            import com.google.android.gms.signin.internal.zac;
            import com.google.android.gms.signin.internal.zaf;
            import com.google.android.gms.signin.internal.zai;
            import com.google.android.gms.signin.internal.zak;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Set;
            import p000.C2323w9;
            import p000.C2345wv;
            import p000.cb3;
            import p000.dp0;
            import p000.eh2;
            import p000.ie2;
            import p000.kb1;
            import p000.pb3;
            import p000.rr0;
            import p000.sr0;
            import p000.u93;
            import p000.ur0;
            import p000.va3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zact extends zac implements rr0, sr0 {

                /* JADX INFO: renamed from: j */
                public static final va3 f3452j = pb3.f15056a;

                /* JADX INFO: renamed from: a */
                public final Context f3453a;

                /* JADX INFO: renamed from: b */
                public final Handler f3454b;

                /* JADX INFO: renamed from: c */
                public final va3 f3455c;

                /* JADX INFO: renamed from: d */
                public final Set f3456d;

                /* JADX INFO: renamed from: e */
                public final C2345wv f3457e;

                /* JADX INFO: renamed from: f */
                public ie2 f3458f;

                /* JADX INFO: renamed from: i */
                public u93 f3459i;

                public zact(Context context, Handler handler, C2345wv c2345wv) {
/* 3 */             super("com.google.android.gms.signin.internal.ISignInCallbacks");
/* 6 */             this.f3453a = context;
/* 8 */             this.f3454b = handler;
/* 10 */            this.f3457e = c2345wv;
/* 14 */            this.f3456d = c2345wv.f18824b;
/* 18 */            this.f3455c = f3452j;
                }

                @Override // p000.InterfaceC2478xy
                /* JADX INFO: renamed from: a */
                public final void mo1610a(int i) {
/* 1 */             u93 u93Var = this.f3459i;
/* 17 */            cb3 cb3Var = (cb3) ((ur0) u93Var.f17433f).f17691j.get((C2323w9) u93Var.f17430c);
/* 19 */            if (cb3Var != null) {
/* 23 */                if (cb3Var.f2828k) {
/* 33 */                    cb3Var.m1626q(new ConnectionResult(17, null, null));
                        } else {
/* 37 */                    cb3Var.mo1610a(i);
                        }
                    }
                }

                @Override // p000.wp1
                /* JADX INFO: renamed from: b */
                public final void mo1611b(ConnectionResult connectionResult) {
/* 3 */             this.f3459i.m8983A(connectionResult);
                }

                @Override // p000.InterfaceC2478xy
                public final void onConnected() {
/* 1 */             ie2 ie2Var = this.f3458f;
/* 3 */             ie2Var.getClass();
                    try {
/* 10 */                Account account = ie2Var.f9561b.f18823a;
/* 14 */                if (account == null) {
/* 21 */                    account = new Account(AbstractC0322a.DEFAULT_ACCOUNT, "com.google");
                        }
/* 47 */                GoogleSignInAccount googleSignInAccountM3434b = AbstractC0322a.DEFAULT_ACCOUNT.equals(account.name) ? eh2.m3432a(ie2Var.getContext()).m3434b() : null;
/* 50 */                Integer num = ie2Var.f9563d;
/* 52 */                kb1.m6061n(num);
/* 60 */                zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountM3434b);
/* 67 */                zaf zafVar = (zaf) ie2Var.getService();
/* 71 */                zai zaiVar = new zai(1, zatVar);
/* 74 */                Parcel parcelZaa = zafVar.zaa();
/* 78 */                com.google.android.gms.internal.base.zac.zac(parcelZaa, zaiVar);
/* 81 */                com.google.android.gms.internal.base.zac.zad(parcelZaa, this);
/* 86 */                zafVar.zac(12, parcelZaa);
                    } catch (RemoteException e) {
/* 94 */                AbstractC1245n0.m4889q("SignInClientImpl", "Remote service probably died when signIn is called");
                        try {
/* 109 */                   mo2011q(new zak(1, new ConnectionResult(8, null, null), null));
                        } catch (RemoteException unused) {
/* 115 */                   AbstractC1245n0.m4893u("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                        }
                    }
                }

                @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
                /* JADX INFO: renamed from: q */
                public final void mo2011q(zak zakVar) {
/* 11 */            this.f3454b.post(new dp0(this, zakVar, 22, false));
                }
            }
