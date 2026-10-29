            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdd extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
                public final long zza;
                public final long zzb;
                public final boolean zzc;
                public final Bundle zzd;
                public final String zze;

                public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
/* 4 */             this.zza = j;
/* 6 */             this.zzb = j2;
/* 8 */             this.zzc = z;
/* 10 */            this.zzd = bundle;
/* 12 */            this.zze = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             long j = this.zza;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(j);
/* 18 */            long j2 = this.zzb;
/* 21 */            w11.m9420b0(parcel, 2, 8);
/* 24 */            parcel.writeLong(j2);
/* 27 */            boolean z = this.zzc;
/* 31 */            w11.m9420b0(parcel, 3, 4);
/* 34 */            parcel.writeInt(z ? 1 : 0);
/* 41 */            w11.m9402L(parcel, 7, this.zzd, false);
/* 46 */            w11.m9410T(parcel, 8, this.zze, false);
/* 49 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
