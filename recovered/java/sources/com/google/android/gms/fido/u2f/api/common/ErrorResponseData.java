            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.internal.fido.zzap;
            import com.google.android.gms.internal.fido.zzaq;
            import java.util.Arrays;
            import p000.de3;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class ErrorResponseData extends ResponseData {
                public static final Parcelable.Creator<ErrorResponseData> CREATOR = new tf3(1);

                /* JADX INFO: renamed from: a */
                public final ErrorCode f3873a;

                /* JADX INFO: renamed from: b */
                public final String f3874b;

                public ErrorResponseData(int i, String str) {
/* 10 */            for (ErrorCode errorCode : ErrorCode.values()) {
/* 16 */                if (i == errorCode.f3872a) {
/* 24 */                    this.f3873a = errorCode;
/* 26 */                    this.f3874b = str;
                        }
                    }
/* 22 */            errorCode = ErrorCode.OTHER_ERROR;
/* 24 */            this.f3873a = errorCode;
/* 26 */            this.f3874b = str;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ErrorResponseData)) {
/* 3 */                 return false;
                    }
/* 7 */             ErrorResponseData errorResponseData = (ErrorResponseData) obj;
                    return de3.m3029k(this.f3873a, errorResponseData.f3873a) && de3.m3029k(this.f3874b, errorResponseData.f3874b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3873a, this.f3874b});
                }

                public final String toString() {
/* 1 */             zzap zzapVarZza = zzaq.zza(this);
/* 11 */            zzapVarZza.zza("errorCode", this.f3873a.f3872a);
/* 14 */            String str = this.f3874b;
/* 16 */            if (str != null) {
/* 20 */                zzapVarZza.zzb("errorMessage", str);
                    }
/* 23 */            return zzapVarZza.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             int i2 = this.f3873a.f3872a;
/* 13 */            w11.m9420b0(parcel, 2, 4);
/* 16 */            parcel.writeInt(i2);
/* 23 */            w11.m9410T(parcel, 3, this.f3874b, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
