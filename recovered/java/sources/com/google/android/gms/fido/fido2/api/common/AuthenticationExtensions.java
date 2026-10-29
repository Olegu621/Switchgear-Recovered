            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AuthenticationExtensions extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new tf3(0);

                /* JADX INFO: renamed from: a */
                public final FidoAppIdExtension f3748a;

                /* JADX INFO: renamed from: b */
                public final zzp f3749b;

                /* JADX INFO: renamed from: c */
                public final UserVerificationMethodExtension f3750c;

                /* JADX INFO: renamed from: d */
                public final zzw f3751d;

                /* JADX INFO: renamed from: e */
                public final zzy f3752e;

                /* JADX INFO: renamed from: f */
                public final zzaa f3753f;

                /* JADX INFO: renamed from: i */
                public final zzr f3754i;

                /* JADX INFO: renamed from: v */
                public final zzad f3755v;

                /* JADX INFO: renamed from: w */
                public final GoogleThirdPartyPaymentExtension f3756w;

                public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzp zzpVar, UserVerificationMethodExtension userVerificationMethodExtension, zzw zzwVar, zzy zzyVar, zzaa zzaaVar, zzr zzrVar, zzad zzadVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
/* 4 */             this.f3748a = fidoAppIdExtension;
/* 6 */             this.f3750c = userVerificationMethodExtension;
/* 8 */             this.f3749b = zzpVar;
/* 10 */            this.f3751d = zzwVar;
/* 12 */            this.f3752e = zzyVar;
/* 14 */            this.f3753f = zzaaVar;
/* 16 */            this.f3754i = zzrVar;
/* 18 */            this.f3755v = zzadVar;
/* 20 */            this.f3756w = googleThirdPartyPaymentExtension;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticationExtensions)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
                    return de3.m3029k(this.f3748a, authenticationExtensions.f3748a) && de3.m3029k(this.f3749b, authenticationExtensions.f3749b) && de3.m3029k(this.f3750c, authenticationExtensions.f3750c) && de3.m3029k(this.f3751d, authenticationExtensions.f3751d) && de3.m3029k(this.f3752e, authenticationExtensions.f3752e) && de3.m3029k(this.f3753f, authenticationExtensions.f3753f) && de3.m3029k(this.f3754i, authenticationExtensions.f3754i) && de3.m3029k(this.f3755v, authenticationExtensions.f3755v) && de3.m3029k(this.f3756w, authenticationExtensions.f3756w);
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f3748a, this.f3749b, this.f3750c, this.f3751d, this.f3752e, this.f3753f, this.f3754i, this.f3755v, this.f3756w});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3748a, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.f3749b, i, false);
/* 23 */            w11.m9409S(parcel, 4, this.f3750c, i, false);
/* 29 */            w11.m9409S(parcel, 5, this.f3751d, i, false);
/* 35 */            w11.m9409S(parcel, 6, this.f3752e, i, false);
/* 41 */            w11.m9409S(parcel, 7, this.f3753f, i, false);
/* 48 */            w11.m9409S(parcel, 8, this.f3754i, i, false);
/* 55 */            w11.m9409S(parcel, 9, this.f3755v, i, false);
/* 62 */            w11.m9409S(parcel, 10, this.f3756w, i, false);
/* 65 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
