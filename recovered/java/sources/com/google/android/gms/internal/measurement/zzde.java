            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzde implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 9 */             Bundle bundleM7895f = null;
/* 10 */            String strM7899j = null;
/* 11 */            boolean zM7914y = false;
/* 12 */            long jM7873F = 0;
/* 13 */            long jM7873F2 = 0;
/* 18 */            while (parcel.dataPosition() < iM7883P) {
/* 20 */                int i = parcel.readInt();
/* 24 */                char c = (char) i;
/* 26 */                if (c == 1) {
/* 69 */                    jM7873F = qj3.m7873F(i, parcel);
                        } else if (c == 2) {
/* 63 */                    jM7873F2 = qj3.m7873F(i, parcel);
                        } else if (c == 3) {
/* 57 */                    zM7914y = qj3.m7914y(i, parcel);
                        } else if (c == 7) {
/* 51 */                    bundleM7895f = qj3.m7895f(i, parcel);
                        } else if (c != '\b') {
/* 41 */                    qj3.m7878K(i, parcel);
                        } else {
/* 45 */                    strM7899j = qj3.m7899j(i, parcel);
                        }
                    }
/* 75 */            qj3.m7908s(iM7883P, parcel);
/* 80 */            return new zzdd(jM7873F, jM7873F2, zM7914y, bundleM7895f, strM7899j);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new zzdd[i];
                }
            }
