            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbc extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
                final int zza;
                final zzba zzb;
                final com.google.android.gms.location.zzbd zzc;
                final PendingIntent zzd;
                final com.google.android.gms.location.zzba zze;
                final zzai zzf;

                public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = zzbaVar;
/* 8 */             zzai zzagVar = null;
/* 17 */            this.zzc = iBinder == null ? null : com.google.android.gms.location.zzbc.zzb(iBinder);
/* 19 */            this.zzd = pendingIntent;
/* 29 */            this.zze = iBinder2 == null ? null : com.google.android.gms.location.zzaz.zzb(iBinder2);
/* 31 */            if (iBinder3 != null) {
/* 36 */                IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
/* 49 */                zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
                    }
/* 52 */            this.zzf = zzagVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
                /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzbd] */
                public static zzbc zza(com.google.android.gms.location.zzbd zzbdVar, zzai zzaiVar) {
/* 3 */             if (zzaiVar == null) {
/* 5 */                 zzaiVar = null;
                    }
/* 12 */            return new zzbc(2, null, zzbdVar, null, null, zzaiVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
/* 9 */             return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
                /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzba] */
                public static zzbc zzc(com.google.android.gms.location.zzba zzbaVar, zzai zzaiVar) {
/* 3 */             if (zzaiVar == null) {
/* 5 */                 zzaiVar = null;
                    }
/* 12 */            return new zzbc(2, null, null, null, zzbaVar, zzaiVar);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9409S(parcel, 2, this.zzb, i, false);
/* 24 */            com.google.android.gms.location.zzbd zzbdVar = this.zzc;
/* 36 */            w11.m9405O(parcel, 3, zzbdVar == null ? null : zzbdVar.asBinder());
/* 41 */            w11.m9409S(parcel, 4, this.zzd, i, false);
/* 44 */            com.google.android.gms.location.zzba zzbaVar = this.zze;
/* 55 */            w11.m9405O(parcel, 5, zzbaVar == null ? null : zzbaVar.asBinder());
/* 58 */            zzai zzaiVar = this.zzf;
/* 68 */            w11.m9405O(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
/* 71 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
