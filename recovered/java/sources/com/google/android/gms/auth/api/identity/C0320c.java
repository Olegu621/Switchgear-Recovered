            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0320c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             byte[] bArrM7896g = null;
/* 7 */             boolean zM7914y = false;
/* 8 */             String strM7899j = null;
/* 13 */            while (parcel.dataPosition() < iM7883P) {
/* 15 */                int i = parcel.readInt();
/* 19 */                char c = (char) i;
/* 21 */                if (c == 1) {
/* 43 */                    zM7914y = qj3.m7914y(i, parcel);
                        } else if (c == 2) {
/* 38 */                    bArrM7896g = qj3.m7896g(i, parcel);
                        } else if (c != 3) {
/* 29 */                    qj3.m7878K(i, parcel);
                        } else {
/* 33 */                    strM7899j = qj3.m7899j(i, parcel);
                        }
                    }
/* 48 */            qj3.m7908s(iM7883P, parcel);
/* 53 */            return new BeginSignInRequest.PasskeysRequestOptions(zM7914y, bArrM7896g, strM7899j);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new BeginSignInRequest.PasskeysRequestOptions[i];
                }
            }
