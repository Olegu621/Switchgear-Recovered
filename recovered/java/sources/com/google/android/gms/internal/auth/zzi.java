            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.C2345wv;
            import p000.InterfaceC2478xy;
            import p000.kr0;
            import p000.qj3;
            import p000.wp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzi extends kr0 {
                public zzi(Context context, Looper looper, C2345wv c2345wv, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 9 */             super(context, looper, 224, c2345wv, interfaceC2478xy, wp1Var);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
                    return iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void disconnect(String str) {
/* 13 */            AbstractC1245n0.m4889q("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
/* 16 */            super.disconnect(str);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 7 */             return new Feature[]{qj3.f15590k, qj3.f15589j, qj3.f15588i};
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 17895000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.account.data.IGoogleAuthService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.account.authapi.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean getUseDynamicLookup() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
