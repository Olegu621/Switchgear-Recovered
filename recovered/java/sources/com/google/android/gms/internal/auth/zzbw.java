            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class zzbw extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
                final int zza;
                String zzb;

                public zzbw(int i, String str) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9410T(parcel, 2, this.zzb, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final zzbw zza(String str) {
/* 1 */             this.zzb = str;
/* 3 */             return this;
                }

/* 8 */         public zzbw() {
/* 10 */            this.zza = 1;
                }
            }
