            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
                public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new md3(3);

                /* JADX INFO: renamed from: a */
                public final byte[] f3828a;

                /* JADX INFO: renamed from: b */
                public final String f3829b;

                /* JADX INFO: renamed from: c */
                public final String f3830c;

                /* JADX INFO: renamed from: d */
                public final String f3831d;

                public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
/* 4 */             kb1.m6061n(bArr);
/* 7 */             this.f3828a = bArr;
/* 9 */             kb1.m6061n(str);
/* 12 */            this.f3829b = str;
/* 14 */            this.f3830c = str2;
/* 16 */            kb1.m6061n(str3);
/* 19 */            this.f3831d = str3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PublicKeyCredentialUserEntity)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
                    return Arrays.equals(this.f3828a, publicKeyCredentialUserEntity.f3828a) && de3.m3029k(this.f3829b, publicKeyCredentialUserEntity.f3829b) && de3.m3029k(this.f3830c, publicKeyCredentialUserEntity.f3830c) && de3.m3029k(this.f3831d, publicKeyCredentialUserEntity.f3831d);
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f3828a, this.f3829b, this.f3830c, this.f3831d});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3828a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3829b, false);
/* 23 */            w11.m9410T(parcel, 4, this.f3830c, false);
/* 29 */            w11.m9410T(parcel, 5, this.f3831d, false);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
