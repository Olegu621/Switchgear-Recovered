            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv implements Parcelable.Creator<zzu> {
                @Override // android.os.Parcelable.Creator
                public final zzu createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             MetadataBundle metadataBundle = null;
/* 8 */             String strM7899j = null;
/* 9 */             DriveId driveId = null;
/* 10 */            Integer numM7872E = null;
/* 11 */            int iM7871D = 0;
/* 16 */            while (parcel.dataPosition() < iM7883P) {
/* 18 */                int i = parcel.readInt();
/* 22 */                char c = (char) i;
/* 24 */                if (c == 2) {
/* 74 */                    metadataBundle = (MetadataBundle) qj3.m7898i(parcel, i, MetadataBundle.CREATOR);
                        } else if (c == 3) {
/* 62 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 4) {
/* 57 */                    strM7899j = qj3.m7899j(i, parcel);
                        } else if (c == 5) {
/* 54 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c != 6) {
/* 38 */                    qj3.m7878K(i, parcel);
                        } else {
/* 42 */                    numM7872E = qj3.m7872E(i, parcel);
                        }
                    }
/* 77 */            qj3.m7908s(iM7883P, parcel);
/* 82 */            return new zzu(metadataBundle, iM7871D, strM7899j, driveId, numM7872E);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzu[] newArray(int i) {
/* 1 */             return new zzu[i];
                }
            }
