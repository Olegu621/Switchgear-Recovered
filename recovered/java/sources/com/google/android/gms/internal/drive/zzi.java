            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzi implements Parcelable.Creator<zzh> {
                @Override // android.os.Parcelable.Creator
                public final zzh createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 9 */             int iM7871D = 0;
/* 10 */            int iM7871D2 = 0;
/* 11 */            DriveId driveId = null;
/* 12 */            long jM7873F = 0;
/* 13 */            long jM7873F2 = 0;
/* 18 */            while (parcel.dataPosition() < iM7883P) {
/* 20 */                int i = parcel.readInt();
/* 24 */                char c = (char) i;
/* 26 */                if (c == 2) {
/* 69 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 3) {
/* 66 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c == 4) {
/* 54 */                    iM7871D2 = qj3.m7871D(i, parcel);
                        } else if (c == 5) {
/* 49 */                    jM7873F = qj3.m7873F(i, parcel);
                        } else if (c != 6) {
/* 40 */                    qj3.m7878K(i, parcel);
                        } else {
/* 44 */                    jM7873F2 = qj3.m7873F(i, parcel);
                        }
                    }
/* 74 */            qj3.m7908s(iM7883P, parcel);
/* 79 */            return new zzh(iM7871D, driveId, iM7871D2, jM7873F, jM7873F2);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzh[] newArray(int i) {
/* 1 */             return new zzh[i];
                }
            }
