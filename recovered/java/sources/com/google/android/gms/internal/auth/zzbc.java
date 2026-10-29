            package com.google.android.gms.internal.auth;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbc implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             int iM7871D = 0;
/* 6 */             String strM7899j = null;
/* 7 */             PendingIntent pendingIntent = null;
/* 12 */            while (parcel.dataPosition() < iM7883P) {
/* 14 */                int i = parcel.readInt();
/* 18 */                char c = (char) i;
/* 20 */                if (c == 1) {
/* 46 */                    iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 2) {
/* 41 */                    strM7899j = qj3.m7899j(i, parcel);
                        } else if (c != 3) {
/* 28 */                    qj3.m7878K(i, parcel);
                        } else {
/* 38 */                    pendingIntent = (PendingIntent) qj3.m7898i(parcel, i, PendingIntent.CREATOR);
                        }
                    }
/* 51 */            qj3.m7908s(iM7883P, parcel);
/* 56 */            return new zzbb(iM7871D, strM7899j, pendingIntent);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new zzbb[i];
                }
            }
