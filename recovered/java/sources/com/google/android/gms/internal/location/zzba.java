            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ClientIdentity;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.location.LocationRequest;
            import java.util.Collections;
            import java.util.List;
            import p000.de3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzba extends AbstractSafeParcelable {
                final LocationRequest zzb;
                final List<ClientIdentity> zzc;
                final String zzd;
                final boolean zze;
                final boolean zzf;
                final boolean zzg;
                final String zzh;
                final boolean zzi;
                boolean zzj;
                String zzk;
                long zzl;
                static final List<ClientIdentity> zza = Collections.EMPTY_LIST;
                public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

                public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
/* 4 */             this.zzb = locationRequest;
/* 6 */             this.zzc = list;
/* 8 */             this.zzd = str;
/* 10 */            this.zze = z;
/* 12 */            this.zzf = z2;
/* 14 */            this.zzg = z3;
/* 16 */            this.zzh = str2;
/* 18 */            this.zzi = z4;
/* 20 */            this.zzj = z5;
/* 22 */            this.zzk = str3;
/* 24 */            this.zzl = j;
                }

                public static zzba zza(String str, LocationRequest locationRequest) {
/* 19 */            return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzba) {
/* 6 */                 zzba zzbaVar = (zzba) obj;
/* 16 */                if (de3.m3029k(this.zzb, zzbaVar.zzb) && de3.m3029k(this.zzc, zzbaVar.zzc) && de3.m3029k(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && de3.m3029k(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && de3.m3029k(this.zzk, zzbaVar.zzk)) {
/* 88 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zzb.hashCode();
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.zzb);
/* 13 */            if (this.zzd != null) {
/* 17 */                sb.append(" tag=");
/* 22 */                sb.append(this.zzd);
                    }
/* 27 */            if (this.zzh != null) {
/* 31 */                sb.append(" moduleId=");
/* 36 */                sb.append(this.zzh);
                    }
/* 41 */            if (this.zzk != null) {
/* 45 */                sb.append(" contextAttributionTag=");
/* 50 */                sb.append(this.zzk);
                    }
/* 55 */            sb.append(" hideAppOps=");
/* 60 */            sb.append(this.zze);
/* 65 */            sb.append(" clients=");
/* 70 */            sb.append(this.zzc);
/* 75 */            sb.append(" forceCoarseLocation=");
/* 80 */            sb.append(this.zzf);
/* 85 */            if (this.zzg) {
/* 89 */                sb.append(" exemptFromBackgroundThrottle");
                    }
/* 94 */            if (this.zzi) {
/* 98 */                sb.append(" locationSettingsIgnored");
                    }
/* 103 */           if (this.zzj) {
/* 107 */               sb.append(" inaccurateLocationsDelayed");
                    }
/* 110 */           return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.zzb, i, false);
/* 17 */            w11.m9414X(parcel, 5, this.zzc, false);
/* 23 */            w11.m9410T(parcel, 6, this.zzd, false);
/* 26 */            boolean z = this.zze;
/* 30 */            w11.m9420b0(parcel, 7, 4);
/* 33 */            parcel.writeInt(z ? 1 : 0);
/* 36 */            boolean z2 = this.zzf;
/* 40 */            w11.m9420b0(parcel, 8, 4);
/* 43 */            parcel.writeInt(z2 ? 1 : 0);
/* 46 */            boolean z3 = this.zzg;
/* 50 */            w11.m9420b0(parcel, 9, 4);
/* 53 */            parcel.writeInt(z3 ? 1 : 0);
/* 60 */            w11.m9410T(parcel, 10, this.zzh, false);
/* 63 */            boolean z4 = this.zzi;
/* 67 */            w11.m9420b0(parcel, 11, 4);
/* 70 */            parcel.writeInt(z4 ? 1 : 0);
/* 73 */            boolean z5 = this.zzj;
/* 77 */            w11.m9420b0(parcel, 12, 4);
/* 80 */            parcel.writeInt(z5 ? 1 : 0);
/* 87 */            w11.m9410T(parcel, 13, this.zzk, false);
/* 90 */            long j = this.zzl;
/* 94 */            w11.m9420b0(parcel, 14, 8);
/* 97 */            parcel.writeLong(j);
/* 100 */           w11.m9428f0(iM9422c0, parcel);
                }

                public final zzba zzb(long j) {
/* 1 */             LocationRequest locationRequest = this.zzb;
/* 3 */             long j2 = locationRequest.f4130v;
/* 5 */             long j3 = locationRequest.f4124b;
/* 16 */            if ((j2 < j3 ? j3 : j2) <= j3) {
/* 20 */                this.zzl = 10000L;
/* 22 */                return this;
                    }
/* 27 */            if (j2 < j3) {
/* 29 */                j2 = j3;
                    }
/* 34 */            StringBuilder sb = new StringBuilder(120);
/* 39 */            sb.append("could not set max age when location batching is requested, interval=");
/* 42 */            sb.append(j3);
/* 47 */            sb.append("maxWaitTime=");
/* 50 */            sb.append(j2);
/* 60 */            throw new IllegalArgumentException(sb.toString());
                }

                public final zzba zzc(String str) {
/* 1 */             this.zzk = str;
/* 3 */             return this;
                }

                public final zzba zzd(boolean z) {
/* 2 */             this.zzj = true;
/* 4 */             return this;
                }
            }
