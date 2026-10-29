            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzag implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             Intent intent = null;
/* 10 */            while (parcel.dataPosition() < iM7883P) {
/* 12 */                int i = parcel.readInt();
/* 18 */                if (((char) i) != 1) {
/* 20 */                    qj3.m7878K(i, parcel);
                        } else {
/* 30 */                    intent = (Intent) qj3.m7898i(parcel, i, Intent.CREATOR);
                        }
                    }
/* 33 */            qj3.m7908s(iM7883P, parcel);
/* 38 */            return new zzaf(intent);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new zzaf[i];
                }
            }
