            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgt implements Parcelable.Creator<zzgs> {
                @Override // android.os.Parcelable.Creator
                public final zzgs createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DriveId driveId = null;
/* 7 */             int iM7871D = 0;
/* 8 */             com.google.android.gms.drive.events.zzt zztVar = null;
/* 13 */            while (parcel.dataPosition() < iM7883P) {
/* 15 */                int i = parcel.readInt();
/* 19 */                char c = (char) i;
/* 21 */                if (c == 2) {
/* 53 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c == 3) {
/* 42 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c != 4) {
/* 29 */                    qj3.m7878K(i, parcel);
                        } else {
/* 39 */                    zztVar = (com.google.android.gms.drive.events.zzt) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzt.CREATOR);
                        }
                    }
/* 56 */            qj3.m7908s(iM7883P, parcel);
/* 61 */            return new zzgs(driveId, iM7871D, zztVar);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgs[] newArray(int i) {
/* 1 */             return new zzgs[i];
                }
            }
