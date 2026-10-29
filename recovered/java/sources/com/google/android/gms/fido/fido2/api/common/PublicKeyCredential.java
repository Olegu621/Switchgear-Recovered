            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredential extends AbstractSafeParcelable {
                public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new tc3(24);

                /* JADX INFO: renamed from: a */
                public final String f3791a;

                /* JADX INFO: renamed from: b */
                public final String f3792b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3793c;

                /* JADX INFO: renamed from: d */
                public final AuthenticatorAttestationResponse f3794d;

                /* JADX INFO: renamed from: e */
                public final AuthenticatorAssertionResponse f3795e;

                /* JADX INFO: renamed from: f */
                public final AuthenticatorErrorResponse f3796f;

                /* JADX INFO: renamed from: i */
                public final AuthenticationExtensionsClientOutputs f3797i;

                /* JADX INFO: renamed from: v */
                public final String f3798v;

                public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
/* 4 */             boolean z = true;
/* 5 */             if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
/* 25 */                z = false;
                    }
/* 26 */            kb1.m6054g(z);
/* 29 */            this.f3791a = str;
/* 31 */            this.f3792b = str2;
/* 33 */            this.f3793c = bArr;
/* 35 */            this.f3794d = authenticatorAttestationResponse;
/* 37 */            this.f3795e = authenticatorAssertionResponse;
/* 39 */            this.f3796f = authenticatorErrorResponse;
/* 41 */            this.f3797i = authenticationExtensionsClientOutputs;
/* 43 */            this.f3798v = str3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PublicKeyCredential)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
                    return de3.m3029k(this.f3791a, publicKeyCredential.f3791a) && de3.m3029k(this.f3792b, publicKeyCredential.f3792b) && Arrays.equals(this.f3793c, publicKeyCredential.f3793c) && de3.m3029k(this.f3794d, publicKeyCredential.f3794d) && de3.m3029k(this.f3795e, publicKeyCredential.f3795e) && de3.m3029k(this.f3796f, publicKeyCredential.f3796f) && de3.m3029k(this.f3797i, publicKeyCredential.f3797i) && de3.m3029k(this.f3798v, publicKeyCredential.f3798v);
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.f3791a, this.f3792b, this.f3793c, this.f3795e, this.f3794d, this.f3796f, this.f3797i, this.f3798v});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3791a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3792b, false);
/* 23 */            w11.m9403M(parcel, 3, this.f3793c, false);
/* 29 */            w11.m9409S(parcel, 4, this.f3794d, i, false);
/* 35 */            w11.m9409S(parcel, 5, this.f3795e, i, false);
/* 41 */            w11.m9409S(parcel, 6, this.f3796f, i, false);
/* 47 */            w11.m9409S(parcel, 7, this.f3797i, i, false);
/* 54 */            w11.m9410T(parcel, 8, this.f3798v, false);
/* 57 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
