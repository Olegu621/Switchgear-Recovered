            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzy extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzy> CREATOR = new zzz();
                private final int zza;
                private final zzaf zzb;

                public zzy(int i, zzaf zzafVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = zzafVar;
                }

                public static zzy zzb(int i) {
/* 4 */             return new zzy(i, null);
                }

                public static zzy zzc(int i, zzaf zzafVar) {
/* 3 */             return new zzy(i, zzafVar);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzy)) {
/* 7 */                 return false;
                    }
/* 11 */            zzy zzyVar = (zzy) obj;
                    return this.zza == zzyVar.zza && de3.m3029k(this.zzb, zzyVar.zzb);
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(Integer.valueOf(this.zza), "signInType");
/* 21 */            wc0Var.m9529d(this.zzb, "previousStepResolutionResult");
/* 24 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9409S(parcel, 2, this.zzb, i, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final int zza() {
/* 1 */             return this.zza;
                }

                public final boolean zzd() {
                    return this.zzb == null;
                }
            }
