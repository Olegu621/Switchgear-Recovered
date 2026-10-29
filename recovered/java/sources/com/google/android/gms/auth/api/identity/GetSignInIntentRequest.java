            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GetSignInIntentRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new ub3(20);

                /* JADX INFO: renamed from: a */
                public final String f3326a;

                /* JADX INFO: renamed from: b */
                public final String f3327b;

                /* JADX INFO: renamed from: c */
                public final String f3328c;

                /* JADX INFO: renamed from: d */
                public final String f3329d;

                /* JADX INFO: renamed from: e */
                public final boolean f3330e;

                /* JADX INFO: renamed from: f */
                public final int f3331f;

                public GetSignInIntentRequest(int i, String str, String str2, String str3, String str4, boolean z) {
/* 4 */             kb1.m6061n(str);
/* 7 */             this.f3326a = str;
/* 9 */             this.f3327b = str2;
/* 11 */            this.f3328c = str3;
/* 13 */            this.f3329d = str4;
/* 15 */            this.f3330e = z;
/* 17 */            this.f3331f = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof GetSignInIntentRequest)) {
/* 3 */                 return false;
                    }
/* 7 */             GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
                    return de3.m3029k(this.f3326a, getSignInIntentRequest.f3326a) && de3.m3029k(this.f3329d, getSignInIntentRequest.f3329d) && de3.m3029k(this.f3327b, getSignInIntentRequest.f3327b) && de3.m3029k(Boolean.valueOf(this.f3330e), Boolean.valueOf(getSignInIntentRequest.f3330e)) && this.f3331f == getSignInIntentRequest.f3331f;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f3326a, this.f3327b, this.f3329d, Boolean.valueOf(this.f3330e), Integer.valueOf(this.f3331f)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3326a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3327b, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3328c, false);
/* 29 */            w11.m9410T(parcel, 4, this.f3329d, false);
/* 33 */            w11.m9420b0(parcel, 5, 4);
/* 38 */            parcel.writeInt(this.f3330e ? 1 : 0);
/* 42 */            w11.m9420b0(parcel, 6, 4);
/* 47 */            parcel.writeInt(this.f3331f);
/* 50 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
