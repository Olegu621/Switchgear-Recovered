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
            public class SignInPassword extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SignInPassword> CREATOR = new ub3(27);

                /* JADX INFO: renamed from: a */
                public final String f3352a;

                /* JADX INFO: renamed from: b */
                public final String f3353b;

                public SignInPassword(String str, String str2) {
/* 6 */             kb1.m6062o(str, "Account identifier cannot be null");
/* 9 */             String strTrim = str.trim();
/* 15 */            kb1.m6059l(strTrim, "Account identifier cannot be empty");
/* 18 */            this.f3352a = strTrim;
/* 20 */            kb1.m6058k(str2);
/* 23 */            this.f3353b = str2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SignInPassword)) {
/* 3 */                 return false;
                    }
/* 7 */             SignInPassword signInPassword = (SignInPassword) obj;
                    return de3.m3029k(this.f3352a, signInPassword.f3352a) && de3.m3029k(this.f3353b, signInPassword.f3353b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3352a, this.f3353b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3352a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3353b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
