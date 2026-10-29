            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzen implements Parcelable.Creator<zzem> {
                @Override // android.os.Parcelable.Creator
                public final zzem createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             ArrayList arrayListM7903n = null;
/* 6 */             int iM7871D = 0;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 2) {
/* 35 */                    arrayListM7903n = qj3.m7903n(parcel, i, com.google.android.gms.drive.zzr.CREATOR);
                        } else if (c != 3) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 28 */                    iM7871D = qj3.m7871D(i, parcel);
                        }
                    }
/* 40 */            qj3.m7908s(iM7883P, parcel);
/* 45 */            return new zzem(arrayListM7903n, iM7871D);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzem[] newArray(int i) {
/* 1 */             return new zzem[i];
                }
            }
