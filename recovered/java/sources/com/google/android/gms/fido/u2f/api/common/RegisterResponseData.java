            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.internal.fido.zzap;
            import com.google.android.gms.internal.fido.zzaq;
            import com.google.android.gms.internal.fido.zzbl;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.de3;
            import p000.hz1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class RegisterResponseData extends ResponseData {
                public static final Parcelable.Creator<RegisterResponseData> CREATOR = new tf3(24);

                /* JADX INFO: renamed from: a */
                public final byte[] f3893a;

                /* JADX INFO: renamed from: b */
                public final ProtocolVersion f3894b;

                /* JADX INFO: renamed from: c */
                public final String f3895c;

                public RegisterResponseData(byte[] bArr, String str, String str2) {
/* 4 */             this.f3893a = bArr;
                    try {
/* 10 */                this.f3894b = ProtocolVersion.m2061a(str);
/* 12 */                this.f3895c = str2;
                    } catch (hz1 e) {
/* 16 */                C1951n4.m6863n(e);
/* 20 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof RegisterResponseData)) {
/* 3 */                 return false;
                    }
/* 7 */             RegisterResponseData registerResponseData = (RegisterResponseData) obj;
                    return de3.m3029k(this.f3894b, registerResponseData.f3894b) && Arrays.equals(this.f3893a, registerResponseData.f3893a) && de3.m3029k(this.f3895c, registerResponseData.f3895c);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3894b, Integer.valueOf(Arrays.hashCode(this.f3893a)), this.f3895c});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 9 */             zzapVarZza.zzb("protocolVersion", this.f3894b);
/* 12 */            zzbl zzblVarZzd = zzbl.zzd();
/* 16 */            byte[] bArr = this.f3893a;
/* 26 */            zzapVarZza.zzb("registerData", zzblVarZzd.zze(bArr, 0, bArr.length));
/* 29 */            String str = this.f3895c;
/* 31 */            if (str != null) {
/* 35 */                zzapVarZza.zzb("clientDataString", str);
                    }
/* 38 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9403M(parcel, 2, this.f3893a, false);
/* 19 */            w11.m9410T(parcel, 3, this.f3894b.f3881a, false);
/* 25 */            w11.m9410T(parcel, 4, this.f3895c, false);
/* 28 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
