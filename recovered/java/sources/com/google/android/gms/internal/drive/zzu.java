            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzu extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzu> CREATOR = new zzv();
                private final String zzba;
                private final DriveId zzbd;
                private final MetadataBundle zzdn;
                private final Integer zzdo;
                private final int zzj;

                public zzu(MetadataBundle metadataBundle, int i, String str, DriveId driveId, Integer num) {
/* 4 */             this.zzdn = metadataBundle;
/* 6 */             this.zzj = i;
/* 8 */             this.zzba = str;
/* 10 */            this.zzbd = driveId;
/* 12 */            this.zzdo = num;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdn, i, false);
/* 14 */            int i2 = this.zzj;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(i2);
/* 26 */            w11.m9410T(parcel, 4, this.zzba, false);
/* 32 */            w11.m9409S(parcel, 5, this.zzbd, i, false);
/* 38 */            w11.m9407Q(parcel, 6, this.zzdo);
/* 41 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
