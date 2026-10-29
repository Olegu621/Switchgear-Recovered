            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.C0996hm;
            import p000.C1951n4;
            import p000.kb1;
            import p000.nz1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
                public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new tc3(28);

                /* JADX INFO: renamed from: a */
                public final PublicKeyCredentialType f3813a;

                /* JADX INFO: renamed from: b */
                public final COSEAlgorithmIdentifier f3814b;

                public PublicKeyCredentialParameters(String str, int i) {
/* 4 */             kb1.m6061n(str);
                    try {
/* 12 */                this.f3813a = PublicKeyCredentialType.m2056a(str);
                        try {
/* 18 */                    this.f3814b = COSEAlgorithmIdentifier.m2054a(i);
                        } catch (C0996hm e) {
/* 22 */                    C1951n4.m6863n(e);
/* 25 */                    throw null;
                        }
                    } catch (nz1 e2) {
/* 27 */                C1951n4.m6863n(e2);
/* 30 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PublicKeyCredentialParameters)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
                    return this.f3813a.equals(publicKeyCredentialParameters.f3813a) && this.f3814b.equals(publicKeyCredentialParameters.f3814b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3813a, this.f3814b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             this.f3813a.getClass();
/* 16 */            w11.m9410T(parcel, 2, "public-key", false);
/* 32 */            w11.m9407Q(parcel, 3, Integer.valueOf(this.f3814b.f3780a.mo5931a()));
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
