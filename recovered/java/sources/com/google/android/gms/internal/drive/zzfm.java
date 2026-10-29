            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfm implements Parcelable.Creator<zzfl> {
                @Override // android.os.Parcelable.Creator
                public final zzfl createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 9 */             long jM7873F = 0;
/* 10 */            long jM7873F2 = 0;
/* 11 */            int iM7871D = 0;
/* 12 */            ArrayList arrayListM7903n = null;
/* 17 */            while (parcel.dataPosition() < iM7883P) {
/* 19 */                int i = parcel.readInt();
/* 23 */                char c = (char) i;
/* 25 */                if (c == 2) {
/* 57 */                    jM7873F = qj3.m7873F(i, parcel);
                        } else if (c == 3) {
/* 52 */                    jM7873F2 = qj3.m7873F(i, parcel);
                        } else if (c == 4) {
/* 47 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c != 5) {
/* 36 */                    qj3.m7878K(i, parcel);
                        } else {
/* 42 */                    arrayListM7903n = qj3.m7903n(parcel, i, com.google.android.gms.drive.zzh.CREATOR);
                        }
                    }
/* 62 */            qj3.m7908s(iM7883P, parcel);
/* 67 */            return new zzfl(jM7873F, jM7873F2, iM7871D, arrayListM7903n);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzfl[] newArray(int i) {
/* 1 */             return new zzfl[i];
                }
            }
