            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class zzav extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
                final int zza;
                public final String zzb;
                public final int zzc;

                public zzav(int i, String str, int i2) {
/* 5 */             this.zza = 1;
/* 7 */             kb1.m6061n(str);
/* 10 */            this.zzb = str;
/* 12 */            this.zzc = i2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9410T(parcel, 2, this.zzb, false);
/* 24 */            int i3 = this.zzc;
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(i3);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 14 */        public zzav(String str, int i) {
/* 15 */            this(1, str, i);
                }
            }
