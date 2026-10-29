            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import p000.qj3;
            
            /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0319b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             boolean zM7914y = false;
/* 8 */             boolean zM7914y2 = false;
/* 9 */             boolean zM7914y3 = false;
/* 10 */            String strM7899j = null;
/* 11 */            String strM7899j2 = null;
/* 12 */            String strM7899j3 = null;
/* 13 */            ArrayList arrayListM7901l = null;
/* 18 */            while (parcel.dataPosition() < iM7883P) {
/* 20 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
/* 62 */                        zM7914y = qj3.m7914y(i, parcel);
                                break;
                            case 2:
/* 57 */                        strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case 3:
/* 52 */                        strM7899j2 = qj3.m7899j(i, parcel);
                                break;
                            case 4:
/* 47 */                        zM7914y2 = qj3.m7914y(i, parcel);
                                break;
                            case 5:
/* 42 */                        strM7899j3 = qj3.m7899j(i, parcel);
                                break;
                            case 6:
/* 37 */                        arrayListM7901l = qj3.m7901l(i, parcel);
                                break;
                            case 7:
/* 32 */                        zM7914y3 = qj3.m7914y(i, parcel);
                                break;
                            default:
/* 28 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 67 */            qj3.m7908s(iM7883P, parcel);
/* 72 */            return new BeginSignInRequest.GoogleIdTokenRequestOptions(zM7914y, strM7899j, strM7899j2, zM7914y2, strM7899j3, arrayListM7901l, zM7914y3);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
                }
            }
