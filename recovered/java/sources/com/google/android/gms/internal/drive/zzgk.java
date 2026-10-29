            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgk implements Parcelable.Creator<zzgj> {
                @Override // android.os.Parcelable.Creator
                public final zzgj createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DriveId driveId = null;
/* 6 */             int iM7871D = 0;
/* 7 */             int iM7871D2 = 0;
/* 12 */            while (parcel.dataPosition() < iM7883P) {
/* 14 */                int i = parcel.readInt();
/* 18 */                char c = (char) i;
/* 20 */                if (c == 2) {
/* 48 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c == 3) {
/* 37 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c != 4) {
/* 28 */                    qj3.m7878K(i, parcel);
                        } else {
/* 32 */                    iM7871D2 = qj3.m7871D(i, parcel);
                        }
                    }
/* 51 */            qj3.m7908s(iM7883P, parcel);
/* 56 */            return new zzgj(driveId, iM7871D, iM7871D2);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgj[] newArray(int i) {
/* 1 */             return new zzgj[i];
                }
            }
