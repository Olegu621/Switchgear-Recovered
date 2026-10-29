            package com.google.android.gms.recaptchabase;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ExecuteRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ExecuteRequest> CREATOR = new md3(22);

                /* JADX INFO: renamed from: a */
                public String f4266a;

                /* JADX INFO: renamed from: b */
                public String f4267b;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ExecuteRequest) {
/* 10 */                ExecuteRequest executeRequest = (ExecuteRequest) obj;
/* 20 */                if (de3.m3029k(this.f4266a, executeRequest.f4266a) && de3.m3029k(this.f4267b, executeRequest.f4267b)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f4266a, this.f4267b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4266a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f4267b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
