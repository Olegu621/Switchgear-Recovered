            package com.google.android.gms.common.api;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.fm0;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ApiMetadata extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ApiMetadata> CREATOR = qd3.f15495b;

                /* JADX INFO: renamed from: d */
                public static final ApiMetadata f3428d;

                /* JADX INFO: renamed from: a */
                public final ComplianceOptions f3429a;

                /* JADX INFO: renamed from: b */
                public final boolean f3430b;

                /* JADX INFO: renamed from: c */
                public boolean f3431c;

                static {
/* 9 */             ApiMetadata apiMetadata = new ApiMetadata(null, false);
/* 12 */            apiMetadata.f3431c = false;
/* 14 */            f3428d = apiMetadata;
                }

                public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
/* 4 */             this.f3429a = complianceOptions;
/* 6 */             this.f3430b = z;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ApiMetadata)) {
/* 32 */                return false;
                    }
/* 6 */             ApiMetadata apiMetadata = (ApiMetadata) obj;
                    return de3.m3029k(this.f3429a, apiMetadata.f3429a) && this.f3431c == apiMetadata.f3431c && this.f3430b == apiMetadata.f3430b;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3429a, Boolean.valueOf(this.f3431c), Boolean.valueOf(this.f3430b)});
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f3429a);
/* 22 */            return fm0.m3790p(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             if (this.f3431c) {
/* 11 */                parcel.setDataPosition(parcel.dataPosition() - 4);
/* 20 */                parcel.setDataSize(parcel.dataSize() - 4);
/* 23 */                return;
                    }
/* 27 */            parcel.writeInt(-204102970);
/* 32 */            int iM9422c0 = w11.m9422c0(20293, parcel);
/* 40 */            w11.m9409S(parcel, 1, this.f3429a, i, false);
/* 45 */            w11.m9420b0(parcel, 2, 4);
/* 50 */            parcel.writeInt(this.f3430b ? 1 : 0);
/* 53 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
