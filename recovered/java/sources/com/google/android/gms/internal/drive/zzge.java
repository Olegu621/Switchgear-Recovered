            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzge implements Parcelable.Creator<zzgd> {
                @Override // android.os.Parcelable.Creator
                public final zzgd createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             ArrayList arrayListM7901l = null;
/* 10 */            while (parcel.dataPosition() < iM7883P) {
/* 12 */                int i = parcel.readInt();
/* 18 */                if (((char) i) != 2) {
/* 20 */                    qj3.m7878K(i, parcel);
                        } else {
/* 24 */                    arrayListM7901l = qj3.m7901l(i, parcel);
                        }
                    }
/* 29 */            qj3.m7908s(iM7883P, parcel);
/* 34 */            return new zzgd(arrayListM7901l);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgd[] newArray(int i) {
/* 1 */             return new zzgd[i];
                }
            }
