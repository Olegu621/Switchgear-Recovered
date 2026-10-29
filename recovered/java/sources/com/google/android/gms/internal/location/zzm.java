            package com.google.android.gms.internal.location;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzm implements Parcelable.Creator<zzl> {
                @Override // android.os.Parcelable.Creator
                public final zzl createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 6 */             zzj zzjVar = null;
/* 7 */             int iM7871D = 1;
/* 8 */             IBinder iBinderM7870C = null;
/* 9 */             IBinder iBinderM7870C2 = null;
/* 14 */            while (parcel.dataPosition() < iM7883P) {
/* 16 */                int i = parcel.readInt();
/* 20 */                char c = (char) i;
/* 21 */                if (c == 1) {
/* 55 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 2) {
/* 52 */                    zzjVar = (zzj) qj3.m7898i(parcel, i, zzj.CREATOR);
                        } else if (c == 3) {
/* 41 */                    iBinderM7870C = qj3.m7870C(i, parcel);
                        } else if (c != 4) {
/* 32 */                    qj3.m7878K(i, parcel);
                        } else {
/* 36 */                    iBinderM7870C2 = qj3.m7870C(i, parcel);
                        }
                    }
/* 60 */            qj3.m7908s(iM7883P, parcel);
/* 65 */            return new zzl(iM7871D, zzjVar, iBinderM7870C, iBinderM7870C2);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ zzl[] newArray(int i) {
/* 1 */             return new zzl[i];
                }
            }
