            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgp implements Parcelable.Creator<zzgo> {
                @Override // android.os.Parcelable.Creator
                public final zzgo createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             int iM7871D = 0;
/* 6 */             int iM7871D2 = 0;
/* 7 */             boolean zM7914y = false;
/* 12 */            while (parcel.dataPosition() < iM7883P) {
/* 14 */                int i = parcel.readInt();
/* 18 */                char c = (char) i;
/* 20 */                if (c == 2) {
/* 42 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 3) {
/* 37 */                    iM7871D2 = qj3.m7871D(i, parcel);
                        } else if (c != 4) {
/* 28 */                    qj3.m7878K(i, parcel);
                        } else {
/* 32 */                    zM7914y = qj3.m7914y(i, parcel);
                        }
                    }
/* 47 */            qj3.m7908s(iM7883P, parcel);
/* 52 */            return new zzgo(iM7871D, iM7871D2, zM7914y);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgo[] newArray(int i) {
/* 1 */             return new zzgo[i];
                }
            }
