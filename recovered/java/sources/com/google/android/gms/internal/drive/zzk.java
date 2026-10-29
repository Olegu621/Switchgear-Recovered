            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzk implements Parcelable.Creator<zzj> {
                @Override // android.os.Parcelable.Creator
                public final zzj createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             DriveId driveId = null;
/* 8 */             com.google.android.gms.drive.events.zze zzeVar = null;
/* 9 */             com.google.android.gms.drive.events.zzx zzxVar = null;
/* 10 */            com.google.android.gms.drive.events.zzt zztVar = null;
/* 11 */            int iM7871D = 0;
/* 16 */            while (parcel.dataPosition() < iM7883P) {
/* 18 */                int i = parcel.readInt();
/* 22 */                char c = (char) i;
/* 24 */                if (c == 2) {
/* 84 */                    driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                        } else if (c == 3) {
/* 72 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 4) {
/* 69 */                    zzeVar = (com.google.android.gms.drive.events.zze) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zze.CREATOR);
                        } else if (c == 5) {
/* 59 */                    zzxVar = (com.google.android.gms.drive.events.zzx) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzx.CREATOR);
                        } else if (c != 6) {
/* 38 */                    qj3.m7878K(i, parcel);
                        } else {
/* 49 */                    zztVar = (com.google.android.gms.drive.events.zzt) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzt.CREATOR);
                        }
                    }
/* 87 */            qj3.m7908s(iM7883P, parcel);
/* 92 */            return new zzj(driveId, iM7871D, zzeVar, zzxVar, zztVar);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzj[] newArray(int i) {
/* 1 */             return new zzj[i];
                }
            }
