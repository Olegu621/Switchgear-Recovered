            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.Contents;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class zzo extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzo> CREATOR = new zzp();
                private final Contents zzdf;
                private final int zzdh;
                private final Boolean zzdj;

                public zzo(Contents contents, Boolean bool, int i) {
/* 4 */             this.zzdf = contents;
/* 6 */             this.zzdj = bool;
/* 8 */             this.zzdh = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdf, i, false);
/* 17 */            w11.m9401K(parcel, 3, this.zzdj);
/* 20 */            int i2 = this.zzdh;
/* 23 */            w11.m9420b0(parcel, 4, 4);
/* 26 */            parcel.writeInt(i2);
/* 29 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 10 */        public zzo(int i, boolean z) {
/* 11 */            this(null, Boolean.FALSE, i);
                }
            }
