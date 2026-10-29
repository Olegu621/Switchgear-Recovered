            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.query.internal.FilterHolder;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgn implements Parcelable.Creator<zzgm> {
                @Override // android.os.Parcelable.Creator
                public final zzgm createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             String strM7899j = null;
/* 6 */             String[] strArrM7900k = null;
/* 7 */             DriveId driveId = null;
/* 8 */             FilterHolder filterHolder = null;
/* 13 */            while (parcel.dataPosition() < iM7883P) {
/* 15 */                int i = parcel.readInt();
/* 19 */                char c = (char) i;
/* 21 */                if (c == 2) {
/* 59 */                    strM7899j = qj3.m7899j(i, parcel);
                        } else if (c == 3) {
/* 54 */                    strArrM7900k = qj3.m7900k(i, parcel);
                        } else if (c == 4) {
/* 51 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c != 5) {
/* 32 */                    qj3.m7878K(i, parcel);
                        } else {
/* 42 */                    filterHolder = (FilterHolder) qj3.m7898i(parcel, i, FilterHolder.CREATOR);
                        }
                    }
/* 64 */            qj3.m7908s(iM7883P, parcel);
/* 69 */            return new zzgm(strM7899j, strArrM7900k, driveId, filterHolder);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgm[] newArray(int i) {
/* 1 */             return new zzgm[i];
                }
            }
