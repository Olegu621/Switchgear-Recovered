            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ClientIdentity;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Collections;
            import java.util.List;
            import p000.AbstractC0208c9;
            import p000.de3;
            import p000.fm0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzj extends AbstractSafeParcelable {
                final com.google.android.gms.location.zzs zzc;
                final List<ClientIdentity> zzd;
                final String zze;
                static final List<ClientIdentity> zza = Collections.EMPTY_LIST;
                static final com.google.android.gms.location.zzs zzb = new com.google.android.gms.location.zzs(true, 50, 0.0f, Long.MAX_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
                public static final Parcelable.Creator<zzj> CREATOR = new zzk();

                public zzj(com.google.android.gms.location.zzs zzsVar, List<ClientIdentity> list, String str) {
/* 4 */             this.zzc = zzsVar;
/* 6 */             this.zzd = list;
/* 8 */             this.zze = str;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzj)) {
/* 3 */                 return false;
                    }
/* 7 */             zzj zzjVar = (zzj) obj;
                    return de3.m3029k(this.zzc, zzjVar.zzc) && de3.m3029k(this.zzd, zzjVar.zzd) && de3.m3029k(this.zze, zzjVar.zze);
                }

                public final int hashCode() {
/* 3 */             return this.zzc.hashCode();
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zzc);
/* 9 */             String strValueOf2 = String.valueOf(this.zzd);
/* 13 */            String str = this.zze;
/* 15 */            int length = strValueOf.length();
/* 37 */            StringBuilder sb = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
/* 44 */            fm0.m3796v(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
/* 51 */            return fm0.m3790p(sb, ", tag='", str, "'}");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.zzc, i, false);
/* 17 */            w11.m9414X(parcel, 2, this.zzd, false);
/* 23 */            w11.m9410T(parcel, 3, this.zze, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
