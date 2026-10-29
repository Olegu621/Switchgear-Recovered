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
            public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
                public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new tf3(16);

                /* JADX INFO: renamed from: a */
                public final byte[] f3759a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3760b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3761c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3762d;

                /* JADX INFO: renamed from: e */
                public final byte[] f3763e;

                public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
/* 4 */             kb1.m6061n(bArr);
/* 7 */             this.f3759a = bArr;
/* 9 */             kb1.m6061n(bArr2);
/* 12 */            this.f3760b = bArr2;
/* 14 */            kb1.m6061n(bArr3);
/* 17 */            this.f3761c = bArr3;
/* 19 */            kb1.m6061n(bArr4);
/* 22 */            this.f3762d = bArr4;
/* 24 */            this.f3763e = bArr5;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AuthenticatorAssertionResponse)) {
/* 3 */                 return false;
                    }
/* 7 */             AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
                    return Arrays.equals(this.f3759a, authenticatorAssertionResponse.f3759a) && Arrays.equals(this.f3760b, authenticatorAssertionResponse.f3760b) && Arrays.equals(this.f3761c, authenticatorAssertionResponse.f3761c) && Arrays.equals(this.f3762d, authenticatorAssertionResponse.f3762d) && Arrays.equals(this.f3763e, authenticatorAssertionResponse.f3763e);
                }

                public final int hashCode() {
/* 55 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3759a)), Integer.valueOf(Arrays.hashCode(this.f3760b)), Integer.valueOf(Arrays.hashCode(this.f3761c)), Integer.valueOf(Arrays.hashCode(this.f3762d)), Integer.valueOf(Arrays.hashCode(this.f3763e))});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 5 */             zzbl zzblVarZzd = zzbl.zzd();
/* 9 */             byte[] bArr = this.f3759a;
/* 19 */            zzapVarZza.zzb("keyHandle", zzblVarZzd.zze(bArr, 0, bArr.length));
/* 22 */            zzbl zzblVarZzd2 = zzbl.zzd();
/* 26 */            byte[] bArr2 = this.f3760b;
/* 35 */            zzapVarZza.zzb("clientDataJSON", zzblVarZzd2.zze(bArr2, 0, bArr2.length));
/* 38 */            zzbl zzblVarZzd3 = zzbl.zzd();
/* 42 */            byte[] bArr3 = this.f3761c;
/* 51 */            zzapVarZza.zzb("authenticatorData", zzblVarZzd3.zze(bArr3, 0, bArr3.length));
/* 54 */            zzbl zzblVarZzd4 = zzbl.zzd();
/* 58 */            byte[] bArr4 = this.f3762d;
/* 67 */            zzapVarZza.zzb("signature", zzblVarZzd4.zze(bArr4, 0, bArr4.length));
/* 70 */            byte[] bArr5 = this.f3763e;
/* 72 */            if (bArr5 != null) {
/* 85 */                zzapVarZza.zzb("userHandle", zzbl.zzd().zze(bArr5, 0, bArr5.length));
                    }
/* 88 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3759a, false);
/* 17 */            w11.m9403M(parcel, 3, this.f3760b, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3761c, false);
/* 29 */            w11.m9403M(parcel, 5, this.f3762d, false);
/* 35 */            w11.m9403M(parcel, 6, this.f3763e, false);
/* 38 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
