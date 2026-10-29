            package com.google.android.gms.internal.measurement;

            import android.app.Activity;
            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Objects;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
                public final int zza;
                public final String zzb;
                public final Intent zzc;

                public zzdf(int i, String str, Intent intent) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = str;
/* 8 */             this.zzc = intent;
                }

                public static zzdf zza(Activity activity) {
/* 19 */            return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzdf)) {
/* 7 */                 return false;
                    }
/* 11 */            zzdf zzdfVar = (zzdf) obj;
                    return this.zza == zzdfVar.zza && Objects.equals(this.zzb, zzdfVar.zzb) && Objects.equals(this.zzc, zzdfVar.zzc);
                }

                public final int hashCode() {
/* 1 */             return this.zza;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = this.zza;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9410T(parcel, 2, this.zzb, false);
/* 27 */            w11.m9409S(parcel, 3, this.zzc, i, false);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
