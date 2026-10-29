            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgx implements Parcelable.Creator<zzgw> {
                @Override // android.os.Parcelable.Creator
                public final zzgw createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DriveId driveId = null;
/* 6 */             ArrayList arrayListM7903n = null;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 2) {
/* 41 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c != 3) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 30 */                    arrayListM7903n = qj3.m7903n(parcel, i, DriveId.CREATOR);
                        }
                    }
/* 44 */            qj3.m7908s(iM7883P, parcel);
/* 49 */            return new zzgw(driveId, arrayListM7903n);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgw[] newArray(int i) {
/* 1 */             return new zzgw[i];
                }
            }
