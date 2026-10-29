            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzz implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             int iM7871D = 0;
/* 6 */             zzaf zzafVar = null;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 1) {
/* 37 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c != 2) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 34 */                    zzafVar = (zzaf) qj3.m7898i(parcel, i, zzaf.CREATOR);
                        }
                    }
/* 42 */            qj3.m7908s(iM7883P, parcel);
/* 47 */            return new zzy(iM7871D, zzafVar);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new zzy[i];
                }
            }
