            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfu implements Parcelable.Creator<zzft> {
                @Override // android.os.Parcelable.Creator
                public final zzft createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DataHolder dataHolder = null;
/* 6 */             boolean zM7914y = false;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 2) {
/* 39 */                    dataHolder = (DataHolder) qj3.m7898i(parcel, i, DataHolder.CREATOR);
                        } else if (c != 3) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 28 */                    zM7914y = qj3.m7914y(i, parcel);
                        }
                    }
/* 42 */            qj3.m7908s(iM7883P, parcel);
/* 47 */            return new zzft(dataHolder, zM7914y);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzft[] newArray(int i) {
/* 1 */             return new zzft[i];
                }
            }
