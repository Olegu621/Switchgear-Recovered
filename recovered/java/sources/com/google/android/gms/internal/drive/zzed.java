            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzed implements Parcelable.Creator<zzec> {
                @Override // android.os.Parcelable.Creator
                public final zzec createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             IBinder iBinderM7870C = null;
/* 10 */            while (parcel.dataPosition() < iM7883P) {
/* 12 */                int i = parcel.readInt();
/* 18 */                if (((char) i) != 2) {
/* 20 */                    qj3.m7878K(i, parcel);
                        } else {
/* 24 */                    iBinderM7870C = qj3.m7870C(i, parcel);
                        }
                    }
/* 29 */            qj3.m7908s(iM7883P, parcel);
/* 34 */            return new zzec(iBinderM7870C);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzec[] newArray(int i) {
/* 1 */             return new zzec[i];
                }
            }
