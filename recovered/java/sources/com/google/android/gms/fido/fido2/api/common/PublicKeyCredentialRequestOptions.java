            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.C1951n4;
            import p000.de3;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            import p000.wd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredentialRequestOptions extends RequestOptions {
                public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new tc3(29);

                /* JADX INFO: renamed from: a */
                public final byte[] f3815a;

                /* JADX INFO: renamed from: b */
                public final Double f3816b;

                /* JADX INFO: renamed from: c */
                public final String f3817c;

                /* JADX INFO: renamed from: d */
                public final List f3818d;

                /* JADX INFO: renamed from: e */
                public final Integer f3819e;

                /* JADX INFO: renamed from: f */
                public final TokenBinding f3820f;

                /* JADX INFO: renamed from: i */
                public final zzat f3821i;

                /* JADX INFO: renamed from: v */
                public final AuthenticationExtensions f3822v;

                /* JADX INFO: renamed from: w */
                public final Long f3823w;

                public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
/* 4 */             kb1.m6061n(bArr);
/* 7 */             this.f3815a = bArr;
/* 9 */             this.f3816b = d;
/* 11 */            kb1.m6061n(str);
/* 14 */            this.f3817c = str;
/* 16 */            this.f3818d = arrayList;
/* 18 */            this.f3819e = num;
/* 20 */            this.f3820f = tokenBinding;
/* 22 */            this.f3823w = l;
/* 25 */            if (str2 != null) {
                        try {
/* 31 */                    this.f3821i = zzat.m2059a(str2);
                        } catch (wd3 e) {
/* 35 */                    C1951n4.m6863n(e);
/* 38 */                    throw null;
                        }
                    } else {
/* 39 */                this.f3821i = null;
                    }
/* 41 */            this.f3822v = authenticationExtensions;
                }

                public final boolean equals(Object obj) {
                    List list;
/* 4 */             if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
/* 9 */             List list2 = publicKeyCredentialRequestOptions.f3818d;
                    return Arrays.equals(this.f3815a, publicKeyCredentialRequestOptions.f3815a) && de3.m3029k(this.f3816b, publicKeyCredentialRequestOptions.f3816b) && de3.m3029k(this.f3817c, publicKeyCredentialRequestOptions.f3817c) && (((list = this.f3818d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && de3.m3029k(this.f3819e, publicKeyCredentialRequestOptions.f3819e) && de3.m3029k(this.f3820f, publicKeyCredentialRequestOptions.f3820f) && de3.m3029k(this.f3821i, publicKeyCredentialRequestOptions.f3821i) && de3.m3029k(this.f3822v, publicKeyCredentialRequestOptions.f3822v) && de3.m3029k(this.f3823w, publicKeyCredentialRequestOptions.f3823w);
                }

                public final int hashCode() {
/* 31 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3815a)), this.f3816b, this.f3817c, this.f3818d, this.f3819e, this.f3820f, this.f3821i, this.f3822v, this.f3823w});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3815a, false);
/* 17 */            w11.m9404N(parcel, 3, this.f3816b);
/* 23 */            w11.m9410T(parcel, 4, this.f3817c, false);
/* 29 */            w11.m9414X(parcel, 5, this.f3818d, false);
/* 35 */            w11.m9407Q(parcel, 6, this.f3819e);
/* 41 */            w11.m9409S(parcel, 7, this.f3820f, i, false);
/* 44 */            zzat zzatVar = this.f3821i;
/* 54 */            w11.m9410T(parcel, 8, zzatVar == null ? null : zzatVar.f3846a, false);
/* 61 */            w11.m9409S(parcel, 9, this.f3822v, i, false);
/* 68 */            w11.m9408R(parcel, 10, this.f3823w);
/* 71 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
