            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.C1951n4;
            import p000.C2547zd;
            import p000.de3;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredentialCreationOptions extends RequestOptions {
                public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new tc3(22);

                /* JADX INFO: renamed from: U */
                public final AttestationConveyancePreference f3799U;

                /* JADX INFO: renamed from: V */
                public final AuthenticationExtensions f3800V;

                /* JADX INFO: renamed from: a */
                public final PublicKeyCredentialRpEntity f3801a;

                /* JADX INFO: renamed from: b */
                public final PublicKeyCredentialUserEntity f3802b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3803c;

                /* JADX INFO: renamed from: d */
                public final List f3804d;

                /* JADX INFO: renamed from: e */
                public final Double f3805e;

                /* JADX INFO: renamed from: f */
                public final List f3806f;

                /* JADX INFO: renamed from: i */
                public final AuthenticatorSelectionCriteria f3807i;

                /* JADX INFO: renamed from: v */
                public final Integer f3808v;

                /* JADX INFO: renamed from: w */
                public final TokenBinding f3809w;

                public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
/* 4 */             kb1.m6061n(publicKeyCredentialRpEntity);
/* 7 */             this.f3801a = publicKeyCredentialRpEntity;
/* 9 */             kb1.m6061n(publicKeyCredentialUserEntity);
/* 12 */            this.f3802b = publicKeyCredentialUserEntity;
/* 14 */            kb1.m6061n(bArr);
/* 17 */            this.f3803c = bArr;
/* 19 */            kb1.m6061n(arrayList);
/* 22 */            this.f3804d = arrayList;
/* 24 */            this.f3805e = d;
/* 26 */            this.f3806f = arrayList2;
/* 28 */            this.f3807i = authenticatorSelectionCriteria;
/* 30 */            this.f3808v = num;
/* 32 */            this.f3809w = tokenBinding;
/* 35 */            if (str != null) {
                        try {
/* 41 */                    this.f3799U = AttestationConveyancePreference.m2053a(str);
                        } catch (C2547zd e) {
/* 45 */                    C1951n4.m6863n(e);
/* 48 */                    throw null;
                        }
                    } else {
/* 49 */                this.f3799U = null;
                    }
/* 51 */            this.f3800V = authenticationExtensions;
                }

                public final boolean equals(Object obj) {
                    List list;
/* 4 */             if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
/* 9 */             List list2 = publicKeyCredentialCreationOptions.f3804d;
/* 11 */            List list3 = publicKeyCredentialCreationOptions.f3806f;
/* 21 */            if (de3.m3029k(this.f3801a, publicKeyCredentialCreationOptions.f3801a) && de3.m3029k(this.f3802b, publicKeyCredentialCreationOptions.f3802b) && Arrays.equals(this.f3803c, publicKeyCredentialCreationOptions.f3803c) && de3.m3029k(this.f3805e, publicKeyCredentialCreationOptions.f3805e)) {
/* 53 */                List list4 = this.f3804d;
/* 59 */                if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f3806f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && de3.m3029k(this.f3807i, publicKeyCredentialCreationOptions.f3807i) && de3.m3029k(this.f3808v, publicKeyCredentialCreationOptions.f3808v) && de3.m3029k(this.f3809w, publicKeyCredentialCreationOptions.f3809w) && de3.m3029k(this.f3799U, publicKeyCredentialCreationOptions.f3799U) && de3.m3029k(this.f3800V, publicKeyCredentialCreationOptions.f3800V))) {
/* 139 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 35 */            return Arrays.hashCode(new Object[]{this.f3801a, this.f3802b, Integer.valueOf(Arrays.hashCode(this.f3803c)), this.f3804d, this.f3805e, this.f3806f, this.f3807i, this.f3808v, this.f3809w, this.f3799U, this.f3800V});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3801a, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.f3802b, i, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3803c, false);
/* 29 */            w11.m9414X(parcel, 5, this.f3804d, false);
/* 35 */            w11.m9404N(parcel, 6, this.f3805e);
/* 41 */            w11.m9414X(parcel, 7, this.f3806f, false);
/* 48 */            w11.m9409S(parcel, 8, this.f3807i, i, false);
/* 55 */            w11.m9407Q(parcel, 9, this.f3808v);
/* 62 */            w11.m9409S(parcel, 10, this.f3809w, i, false);
/* 65 */            AttestationConveyancePreference attestationConveyancePreference = this.f3799U;
/* 75 */            w11.m9410T(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.f3747a, false);
/* 82 */            w11.m9409S(parcel, 12, this.f3800V, i, false);
/* 85 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
