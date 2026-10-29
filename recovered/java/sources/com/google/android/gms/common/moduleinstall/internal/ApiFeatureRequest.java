            package com.google.android.gms.common.moduleinstall.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.de3;
            import p000.kb1;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ApiFeatureRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new qd3(24);

                /* JADX INFO: renamed from: a */
                public final List f3558a;

                /* JADX INFO: renamed from: b */
                public final boolean f3559b;

                /* JADX INFO: renamed from: c */
                public final String f3560c;

                /* JADX INFO: renamed from: d */
                public final String f3561d;

                public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             this.f3558a = arrayList;
/* 9 */             this.f3559b = z;
/* 11 */            this.f3560c = str;
/* 13 */            this.f3561d = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null || !(obj instanceof ApiFeatureRequest)) {
/* 1 */                 return false;
                    }
/* 10 */            ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
                    return this.f3559b == apiFeatureRequest.f3559b && de3.m3029k(this.f3558a, apiFeatureRequest.f3558a) && de3.m3029k(this.f3560c, apiFeatureRequest.f3560c) && de3.m3029k(this.f3561d, apiFeatureRequest.f3561d);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3559b), this.f3558a, this.f3560c, this.f3561d});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f3558a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3559b ? 1 : 0);
/* 27 */            w11.m9410T(parcel, 3, this.f3560c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f3561d, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
