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
            public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
                public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new md3(1);

                /* JADX INFO: renamed from: a */
                public final String f3824a;

                /* JADX INFO: renamed from: b */
                public final String f3825b;

                /* JADX INFO: renamed from: c */
                public final String f3826c;

                public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
/* 4 */             kb1.m6061n(str);
/* 7 */             this.f3824a = str;
/* 9 */             kb1.m6061n(str2);
/* 12 */            this.f3825b = str2;
/* 14 */            this.f3826c = str3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PublicKeyCredentialRpEntity)) {
/* 3 */                 return false;
                    }
/* 7 */             PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
                    return de3.m3029k(this.f3824a, publicKeyCredentialRpEntity.f3824a) && de3.m3029k(this.f3825b, publicKeyCredentialRpEntity.f3825b) && de3.m3029k(this.f3826c, publicKeyCredentialRpEntity.f3826c);
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{this.f3824a, this.f3825b, this.f3826c});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3824a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3825b, false);
/* 23 */            w11.m9410T(parcel, 4, this.f3826c, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
