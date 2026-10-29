            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.internal.fido.zzap;
            import com.google.android.gms.internal.fido.zzaq;
            import com.google.android.gms.internal.fido.zzbl;
            import java.util.Arrays;
            import p000.cl3;
            import p000.de3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class SignResponseData extends ResponseData {
                public static final Parcelable.Creator<SignResponseData> CREATOR = new cl3(5);

                /* JADX INFO: renamed from: a */
                public final byte[] f3906a;

                /* JADX INFO: renamed from: b */
                public final String f3907b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3908c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3909d;

                public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
/* 4 */             kb1.m6061n(bArr);
/* 7 */             this.f3906a = bArr;
/* 9 */             kb1.m6061n(str);
/* 12 */            this.f3907b = str;
/* 14 */            kb1.m6061n(bArr2);
/* 17 */            this.f3908c = bArr2;
/* 19 */            kb1.m6061n(bArr3);
/* 22 */            this.f3909d = bArr3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SignResponseData)) {
/* 3 */                 return false;
                    }
/* 7 */             SignResponseData signResponseData = (SignResponseData) obj;
                    return Arrays.equals(this.f3906a, signResponseData.f3906a) && de3.m3029k(this.f3907b, signResponseData.f3907b) && Arrays.equals(this.f3908c, signResponseData.f3908c) && Arrays.equals(this.f3909d, signResponseData.f3909d);
                }

                public final int hashCode() {
/* 37 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3906a)), this.f3907b, Integer.valueOf(Arrays.hashCode(this.f3908c)), Integer.valueOf(Arrays.hashCode(this.f3909d))});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 5 */             zzbl zzblVarZzd = zzbl.zzd();
/* 9 */             byte[] bArr = this.f3906a;
/* 19 */            zzapVarZza.zzb("keyHandle", zzblVarZzd.zze(bArr, 0, bArr.length));
/* 26 */            zzapVarZza.zzb("clientDataString", this.f3907b);
/* 29 */            zzbl zzblVarZzd2 = zzbl.zzd();
/* 33 */            byte[] bArr2 = this.f3908c;
/* 42 */            zzapVarZza.zzb("signatureData", zzblVarZzd2.zze(bArr2, 0, bArr2.length));
/* 45 */            zzbl zzblVarZzd3 = zzbl.zzd();
/* 49 */            byte[] bArr3 = this.f3909d;
/* 58 */            zzapVarZza.zzb("application", zzblVarZzd3.zze(bArr3, 0, bArr3.length));
/* 61 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3906a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3907b, false);
/* 23 */            w11.m9403M(parcel, 4, this.f3908c, false);
/* 29 */            w11.m9403M(parcel, 5, this.f3909d, false);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
