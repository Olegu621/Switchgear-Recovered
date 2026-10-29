            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzhf> CREATOR = new zzhg();
                private final DriveId zzdd;
                private final MetadataBundle zzde;

                public zzhf(DriveId driveId, MetadataBundle metadataBundle) {
/* 4 */             this.zzdd = driveId;
/* 6 */             this.zzde = metadataBundle;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdd, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.zzde, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
