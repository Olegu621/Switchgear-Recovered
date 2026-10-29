            package com.google.android.gms.internal.fido;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import p000.C2345wv;
            import p000.kr0;
            import p000.rr0;
            import p000.sr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzag extends kr0 {
                public zzag(Context context, Looper looper, C2345wv c2345wv, rr0 rr0Var, sr0 sr0Var) {
/* 9 */             super(context, looper, 117, c2345wv, rr0Var, sr0Var);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
                    return iInterfaceQueryLocalInterface instanceof zzae ? (zzae) iInterfaceQueryLocalInterface : new zzae(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
/* 13 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 13000000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.fido.u2f.thirdparty.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
