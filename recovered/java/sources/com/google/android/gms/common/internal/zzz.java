            package com.google.android.gms.common.internal;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import com.google.android.gms.internal.common.zzb;
            import com.google.android.gms.internal.common.zzc;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzz extends zzb implements IGmsCallbacks {
                @Override // com.google.android.gms.internal.common.zzb
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 5 */             if (i == 1) {
/* 93 */                int i3 = parcel.readInt();
/* 97 */                IBinder strongBinder = parcel.readStrongBinder();
/* 107 */               Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
/* 109 */               zzc.zzf(parcel);
/* 112 */               zzd zzdVar = (zzd) this;
/* 116 */               kb1.m6062o(zzdVar.f3541a, "onPostInitComplete can be called only once per call to getRemoteService");
/* 123 */               zzdVar.f3541a.onPostInitHandler(i3, strongBinder, bundle, zzdVar.f3542b);
/* 126 */               zzdVar.f3541a = null;
                    } else if (i == 2) {
/* 66 */                parcel.readInt();
/* 77 */                zzc.zzf(parcel);
/* 89 */                AbstractC1245n0.m4893u("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                    } else {
/* 11 */                if (i != 3) {
/* 13 */                    return false;
                        }
/* 15 */                int i4 = parcel.readInt();
/* 19 */                IBinder strongBinder2 = parcel.readStrongBinder();
/* 29 */                zzj zzjVar = (zzj) zzc.zzb(parcel, zzj.CREATOR);
/* 31 */                zzc.zzf(parcel);
/* 34 */                zzd zzdVar2 = (zzd) this;
/* 36 */                AbstractC0322a abstractC0322a = zzdVar2.f3541a;
/* 40 */                kb1.m6062o(abstractC0322a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
/* 43 */                kb1.m6061n(zzjVar);
/* 46 */                abstractC0322a.zzc(zzjVar);
/* 49 */                Bundle bundle2 = zzjVar.f3543a;
/* 53 */                kb1.m6062o(zzdVar2.f3541a, "onPostInitComplete can be called only once per call to getRemoteService");
/* 60 */                zzdVar2.f3541a.onPostInitHandler(i4, strongBinder2, bundle2, zzdVar2.f3542b);
/* 63 */                zzdVar2.f3541a = null;
                    }
/* 128 */           parcel2.writeNoException();
/* 4 */             return true;
                }
            }
