            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfw implements Parcelable.Creator<zzfv> {
                @Override // android.os.Parcelable.Creator
                public final zzfv createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             DataHolder dataHolder = null;
/* 10 */            while (parcel.dataPosition() < iM7883P) {
/* 12 */                int i = parcel.readInt();
/* 18 */                if (((char) i) != 2) {
/* 20 */                    qj3.m7878K(i, parcel);
                        } else {
/* 30 */                    dataHolder = (DataHolder) qj3.m7898i(parcel, i, DataHolder.CREATOR);
                        }
                    }
/* 33 */            qj3.m7908s(iM7883P, parcel);
/* 38 */            return new zzfv(dataHolder);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzfv[] newArray(int i) {
/* 1 */             return new zzfv[i];
                }
            }
