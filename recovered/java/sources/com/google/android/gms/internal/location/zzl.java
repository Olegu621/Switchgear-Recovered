            package com.google.android.gms.internal.location;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzl extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzl> CREATOR = new zzm();
                final int zza;
                final zzj zzb;
                final com.google.android.gms.location.zzax zzc;
                final zzai zzd;

                public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = zzjVar;
/* 8 */             zzai zzagVar = null;
/* 17 */            this.zzc = iBinder == null ? null : com.google.android.gms.location.zzaw.zzb(iBinder);
/* 19 */            if (iBinder2 != null) {
/* 24 */                IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
/* 37 */                zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
                    }
/* 40 */            this.zzd = zzagVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9409S(parcel, 2, this.zzb, i, false);
/* 24 */            com.google.android.gms.location.zzax zzaxVar = this.zzc;
/* 36 */            w11.m9405O(parcel, 3, zzaxVar == null ? null : zzaxVar.asBinder());
/* 39 */            zzai zzaiVar = this.zzd;
/* 48 */            w11.m9405O(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
/* 51 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
