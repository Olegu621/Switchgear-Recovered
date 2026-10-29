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
            public class SavePasswordRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new ub3(24);

                /* JADX INFO: renamed from: a */
                public final SignInPassword f3339a;

                /* JADX INFO: renamed from: b */
                public final String f3340b;

                /* JADX INFO: renamed from: c */
                public final int f3341c;

                public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
/* 4 */             kb1.m6061n(signInPassword);
/* 7 */             this.f3339a = signInPassword;
/* 9 */             this.f3340b = str;
/* 11 */            this.f3341c = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SavePasswordRequest)) {
/* 3 */                 return false;
                    }
/* 7 */             SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
                    return de3.m3029k(this.f3339a, savePasswordRequest.f3339a) && de3.m3029k(this.f3340b, savePasswordRequest.f3340b) && this.f3341c == savePasswordRequest.f3341c;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3339a, this.f3340b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3339a, i, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3340b, false);
/* 22 */            w11.m9420b0(parcel, 3, 4);
/* 27 */            parcel.writeInt(this.f3341c);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
