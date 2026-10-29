            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.internal.fido.zzap;
            import com.google.android.gms.internal.fido.zzaq;
            import com.google.android.gms.internal.fido.zzbl;
            import java.util.Arrays;
            import p000.kb1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
                public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new tf3(20);

                /* JADX INFO: renamed from: a */
                public final byte[] f3764a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3765b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3766c;

                /* JADX INFO: renamed from: d */
                public final String[] f3767d;

                public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
/* 4 */             kb1.m6061n(bArr);
/* 7 */             this.f3764a = bArr;
/* 9 */             kb1.m6061n(bArr2);
/* 12 */            this.f3765b = bArr2;
/* 14 */            kb1.m6061n(bArr3);
/* 17 */            this.f3766c = bArr3;
/* 19 */            kb1.m6061n(strArr);
/* 22 */            this.f3767d = strArr;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticatorAttestationResponse)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
                    return Arrays.equals(this.f3764a, authenticatorAttestationResponse.f3764a) && Arrays.equals(this.f3765b, authenticatorAttestationResponse.f3765b) && Arrays.equals(this.f3766c, authenticatorAttestationResponse.f3766c);
                }

                public final int hashCode() {
/* 35 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3764a)), Integer.valueOf(Arrays.hashCode(this.f3765b)), Integer.valueOf(Arrays.hashCode(this.f3766c))});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 5 */             zzbl zzblVarZzd = zzbl.zzd();
/* 9 */             byte[] bArr = this.f3764a;
/* 19 */            zzapVarZza.zzb("keyHandle", zzblVarZzd.zze(bArr, 0, bArr.length));
/* 22 */            zzbl zzblVarZzd2 = zzbl.zzd();
/* 26 */            byte[] bArr2 = this.f3765b;
/* 35 */            zzapVarZza.zzb("clientDataJSON", zzblVarZzd2.zze(bArr2, 0, bArr2.length));
/* 38 */            zzbl zzblVarZzd3 = zzbl.zzd();
/* 42 */            byte[] bArr3 = this.f3766c;
/* 51 */            zzapVarZza.zzb("attestationObject", zzblVarZzd3.zze(bArr3, 0, bArr3.length));
/* 62 */            zzapVarZza.zzb("transports", Arrays.toString(this.f3767d));
/* 65 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3764a, false);
/* 17 */            w11.m9403M(parcel, 3, this.f3765b, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3766c, false);
/* 29 */            w11.m9411U(parcel, 5, this.f3767d, false);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
