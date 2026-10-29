            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0318a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
/* 8 */             BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
/* 9 */             String strM7899j = null;
/* 10 */            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
/* 11 */            boolean zM7914y = false;
/* 12 */            int iM7871D = 0;
/* 17 */            while (parcel.dataPosition() < iM7883P) {
/* 19 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
/* 73 */                        passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) qj3.m7898i(parcel, i, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                                break;
                            case 2:
/* 63 */                        googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) qj3.m7898i(parcel, i, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                                break;
                            case 3:
/* 51 */                        strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case 4:
/* 46 */                        zM7914y = qj3.m7914y(i, parcel);
                                break;
                            case 5:
/* 41 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case 6:
/* 38 */                        passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) qj3.m7898i(parcel, i, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                                break;
                            default:
/* 27 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 76 */            qj3.m7908s(iM7883P, parcel);
/* 81 */            return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strM7899j, zM7914y, iM7871D, passkeysRequestOptions);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new BeginSignInRequest[i];
                }
            }
