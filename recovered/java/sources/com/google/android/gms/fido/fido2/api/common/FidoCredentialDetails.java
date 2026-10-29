            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FidoCredentialDetails extends AbstractSafeParcelable {
                public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new dr3(17);

                /* JADX INFO: renamed from: a */
                public final String f3784a;

                /* JADX INFO: renamed from: b */
                public final String f3785b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3786c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3787d;

                /* JADX INFO: renamed from: e */
                public final boolean f3788e;

                /* JADX INFO: renamed from: f */
                public final boolean f3789f;

                public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
/* 4 */             this.f3784a = str;
/* 6 */             this.f3785b = str2;
/* 8 */             this.f3786c = bArr;
/* 10 */            this.f3787d = bArr2;
/* 12 */            this.f3788e = z;
/* 14 */            this.f3789f = z2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof FidoCredentialDetails)) {
/* 3 */                 return false;
                    }
/* 7 */             FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
                    return de3.m3029k(this.f3784a, fidoCredentialDetails.f3784a) && de3.m3029k(this.f3785b, fidoCredentialDetails.f3785b) && Arrays.equals(this.f3786c, fidoCredentialDetails.f3786c) && Arrays.equals(this.f3787d, fidoCredentialDetails.f3787d) && this.f3788e == fidoCredentialDetails.f3788e && this.f3789f == fidoCredentialDetails.f3789f;
                }

                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{this.f3784a, this.f3785b, this.f3786c, this.f3787d, Boolean.valueOf(this.f3788e), Boolean.valueOf(this.f3789f)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3784a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3785b, false);
/* 23 */            w11.m9403M(parcel, 3, this.f3786c, false);
/* 29 */            w11.m9403M(parcel, 4, this.f3787d, false);
/* 33 */            w11.m9420b0(parcel, 5, 4);
/* 38 */            parcel.writeInt(this.f3788e ? 1 : 0);
/* 42 */            w11.m9420b0(parcel, 6, 4);
/* 47 */            parcel.writeInt(this.f3789f ? 1 : 0);
/* 50 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
