            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import p000.C2345wv;
            import p000.kr0;
            import p000.qj3;
            import p000.rr0;
            import p000.sr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzam extends kr0 {
                public zzam(Context context, Looper looper, C2345wv c2345wv, rr0 rr0Var, sr0 sr0Var) {
/* 9 */             super(context, looper, 120, c2345wv, rr0Var, sr0Var);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             int i = com.google.android.gms.auth.account.zzd.f3242a;
/* 3 */             if (iBinder == null) {
/* 5 */                 return null;
                    }
/* 9 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.auth.account.zze ? (com.google.android.gms.auth.account.zze) iInterfaceQueryLocalInterface : new com.google.android.gms.auth.account.zzc(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 3 */             return new Feature[]{qj3.f15591l};
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.account.IWorkAccountService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.account.workaccount.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
