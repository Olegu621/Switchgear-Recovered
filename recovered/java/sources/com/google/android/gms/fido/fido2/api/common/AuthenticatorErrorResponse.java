            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.internal.fido.zzap;
            import com.google.android.gms.internal.fido.zzaq;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.de3;
            import p000.pe0;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AuthenticatorErrorResponse extends AuthenticatorResponse {
                public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new tf3(23);

                /* JADX INFO: renamed from: a */
                public final ErrorCode f3768a;

                /* JADX INFO: renamed from: b */
                public final String f3769b;

                public AuthenticatorErrorResponse(int i, String str) {
                    try {
/* 8 */                 this.f3768a = ErrorCode.m2055a(i);
/* 10 */                this.f3769b = str;
                    } catch (pe0 e) {
/* 14 */                C1951n4.m6863n(e);
/* 18 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticatorErrorResponse)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                    return de3.m3029k(this.f3768a, authenticatorErrorResponse.f3768a) && de3.m3029k(this.f3769b, authenticatorErrorResponse.f3769b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3768a, this.f3769b});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 11 */            zzapVarZza.zza("errorCode", this.f3768a.f3782a);
/* 14 */            String str = this.f3769b;
/* 16 */            if (str != null) {
/* 20 */                zzapVarZza.zzb("errorMessage", str);
                    }
/* 23 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             int i2 = this.f3768a.f3782a;
/* 13 */            w11.m9420b0(parcel, 2, 4);
/* 16 */            parcel.writeInt(i2);
/* 23 */            w11.m9410T(parcel, 3, this.f3769b, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
