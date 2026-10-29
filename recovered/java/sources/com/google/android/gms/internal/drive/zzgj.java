            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgj extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgj> CREATOR = new zzgk();
                private final int mode;
                private final DriveId zzdd;
                private final int zzip;

                public zzgj(DriveId driveId, int i, int i2) {
/* 4 */             this.zzdd = driveId;
/* 6 */             this.mode = i;
/* 8 */             this.zzip = i2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdd, i, false);
/* 14 */            int i2 = this.mode;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(i2);
/* 24 */            int i3 = this.zzip;
/* 26 */            w11.m9420b0(parcel, 4, 4);
/* 29 */            parcel.writeInt(i3);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
