            package com.google.android.gms.internal.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public final class zzaz extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
                final int zza;
                public final String zzb;
                public final byte[] zzc;

                public zzaz(int i, String str, byte[] bArr) {
/* 5 */             this.zza = 1;
/* 7 */             kb1.m6061n(str);
/* 10 */            this.zzb = str;
/* 12 */            kb1.m6061n(bArr);
/* 15 */            this.zzc = bArr;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zza;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9410T(parcel, 2, this.zzb, false);
/* 27 */            w11.m9403M(parcel, 3, this.zzc, false);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 17 */        public zzaz(String str, byte[] bArr) {
/* 18 */            this(1, str, bArr);
                }
            }
