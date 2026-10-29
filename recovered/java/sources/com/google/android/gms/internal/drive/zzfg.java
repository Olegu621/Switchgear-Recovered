            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.DriveId;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfg implements Parcelable.Creator<zzff> {
                @Override // android.os.Parcelable.Creator
                public final zzff createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DataHolder dataHolder = null;
/* 7 */             com.google.android.gms.drive.zza zzaVar = null;
/* 8 */             boolean zM7914y = false;
/* 9 */             ArrayList arrayListM7903n = null;
/* 14 */            while (parcel.dataPosition() < iM7883P) {
/* 16 */                int i = parcel.readInt();
/* 20 */                char c = (char) i;
/* 22 */                if (c == 2) {
/* 64 */                    dataHolder = (DataHolder) qj3.m7898i(parcel, i, DataHolder.CREATOR);
                        } else if (c == 3) {
/* 53 */                    arrayListM7903n = qj3.m7903n(parcel, i, DriveId.CREATOR);
                        } else if (c == 4) {
/* 48 */                    zzaVar = (com.google.android.gms.drive.zza) qj3.m7898i(parcel, i, com.google.android.gms.drive.zza.CREATOR);
                        } else if (c != 5) {
/* 33 */                    qj3.m7878K(i, parcel);
                        } else {
/* 37 */                    zM7914y = qj3.m7914y(i, parcel);
                        }
                    }
/* 67 */            qj3.m7908s(iM7883P, parcel);
/* 72 */            return new zzff(dataHolder, arrayListM7903n, zzaVar, zM7914y);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzff[] newArray(int i) {
/* 1 */             return new zzff[i];
                }
            }
