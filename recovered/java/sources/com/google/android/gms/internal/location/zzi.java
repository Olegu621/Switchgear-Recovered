            package com.google.android.gms.internal.location;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import p000.C2345wv;
            import p000.k50;
            import p000.kr0;
            import p000.rr0;
            import p000.sr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzi extends kr0 {
                protected final zzbg<zzam> zze;
                private final String zzf;

                public zzi(Context context, Looper looper, rr0 rr0Var, sr0 sr0Var, String str, C2345wv c2345wv) {
/* 9 */             super(context, looper, 23, c2345wv, rr0Var, sr0Var);
/* 17 */            this.zze = new zzh(this);
/* 19 */            this.zzf = str;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return iInterfaceQueryLocalInterface instanceof zzam ? (zzam) iInterfaceQueryLocalInterface : new zzal(iBinder);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 1 */             return k50.f12598m;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putString("client_name", this.zzf);
/* 13 */            return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 11717000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.location.internal.GoogleLocationManagerService.START";
                }
            }
