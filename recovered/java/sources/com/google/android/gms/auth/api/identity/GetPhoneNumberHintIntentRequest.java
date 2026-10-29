            package com.google.android.gms.auth.api.identity;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new ub3(18);

                /* JADX INFO: renamed from: a */
                public final int f3325a;

                public GetPhoneNumberHintIntentRequest(int i) {
/* 4 */             this.f3325a = i;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof GetPhoneNumberHintIntentRequest) {
/* 21 */                return de3.m3029k(Integer.valueOf(this.f3325a), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f3325a));
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3325a)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3325a);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
