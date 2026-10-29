            package com.google.android.gms.fido.fido2.api.common;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
                public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new cl3(0);

                /* JADX INFO: renamed from: a */
                public final PublicKeyCredentialCreationOptions f3774a;

                /* JADX INFO: renamed from: b */
                public final Uri f3775b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3776c;

                public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
/* 4 */             kb1.m6061n(publicKeyCredentialCreationOptions);
/* 7 */             this.f3774a = publicKeyCredentialCreationOptions;
/* 9 */             kb1.m6061n(uri);
/* 25 */            kb1.m6053f("origin scheme must be non-empty", uri.getScheme() != null);
/* 39 */            kb1.m6053f("origin authority must be non-empty", uri.getAuthority() != null);
/* 42 */            this.f3775b = uri;
/* 54 */            kb1.m6053f("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
/* 57 */            this.f3776c = bArr;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
/* 3 */                 return false;
                    }
/* 7 */             BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
                    return de3.m3029k(this.f3774a, browserPublicKeyCredentialCreationOptions.f3774a) && de3.m3029k(this.f3775b, browserPublicKeyCredentialCreationOptions.f3775b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3774a, this.f3775b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3774a, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.f3775b, i, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3776c, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
