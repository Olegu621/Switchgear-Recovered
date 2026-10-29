            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzs implements Parcelable.Creator<zzr> {
                @Override // android.os.Parcelable.Creator
                public final zzr createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             int iM7871D = 536870912;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 19 */                if (((char) i) != 2) {
/* 21 */                    qj3.m7878K(i, parcel);
                        } else {
/* 25 */                    iM7871D = qj3.m7871D(i, parcel);
                        }
                    }
/* 30 */            qj3.m7908s(iM7883P, parcel);
/* 35 */            return new zzr(iM7871D);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzr[] newArray(int i) {
/* 1 */             return new zzr[i];
                }
            }
