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
            public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
                public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new cl3(4);

                /* JADX INFO: renamed from: a */
                public final PublicKeyCredentialRequestOptions f3777a;

                /* JADX INFO: renamed from: b */
                public final Uri f3778b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3779c;

                public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
/* 4 */             kb1.m6061n(publicKeyCredentialRequestOptions);
/* 7 */             this.f3777a = publicKeyCredentialRequestOptions;
/* 9 */             kb1.m6061n(uri);
/* 25 */            kb1.m6053f("origin scheme must be non-empty", uri.getScheme() != null);
/* 39 */            kb1.m6053f("origin authority must be non-empty", uri.getAuthority() != null);
/* 42 */            this.f3778b = uri;
/* 54 */            kb1.m6053f("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
/* 57 */            this.f3779c = bArr;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
/* 3 */                 return false;
                    }
/* 7 */             BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
                    return de3.m3029k(this.f3777a, browserPublicKeyCredentialRequestOptions.f3777a) && de3.m3029k(this.f3778b, browserPublicKeyCredentialRequestOptions.f3778b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3777a, this.f3778b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3777a, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.f3778b, i, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3779c, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
