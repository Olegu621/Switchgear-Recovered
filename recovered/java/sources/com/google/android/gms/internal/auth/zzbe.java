            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.text.TextUtils;
            import io.sentry.C1697u2;
            import p000.AbstractC0841de;
            import p000.C0877ee;
            import p000.C2345wv;
            import p000.InterfaceC2478xy;
            import p000.kr0;
            import p000.wp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbe extends kr0 {
                private final Bundle zze;

                public zzbe(Context context, Looper looper, C2345wv c2345wv, C0877ee c0877ee, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 9 */             super(context, looper, 16, c2345wv, interfaceC2478xy, wp1Var);
/* 27 */            this.zze = c0877ee == null ? new Bundle() : new Bundle(c0877ee.f7654a);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 1 */             return this.zze;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.api.internal.IAuthService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final boolean requiresSignIn() {
/* 1 */             C2345wv clientSettings = getClientSettings();
/* 5 */             Account account = clientSettings.f18823a;
/* 18 */            if (!TextUtils.isEmpty(account != null ? account.name : null)) {
/* 28 */                if (clientSettings.f18826d.get(AbstractC0841de.f7136a) != null) {
/* 40 */                    C1697u2.m5431g();
                        } else if (!clientSettings.f18824b.isEmpty()) {
/* 38 */                    return true;
                        }
                    }
/* 17 */            return false;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
