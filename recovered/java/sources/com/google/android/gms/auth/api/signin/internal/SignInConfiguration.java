            package com.google.android.gms.auth.api.signin.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<SignInConfiguration> CREATOR = new ub3(28);

                /* JADX INFO: renamed from: a */
                public final String f3401a;

                /* JADX INFO: renamed from: b */
                public final GoogleSignInOptions f3402b;

                public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
/* 4 */             kb1.m6058k(str);
/* 7 */             this.f3401a = str;
/* 9 */             this.f3402b = googleSignInOptions;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SignInConfiguration)) {
/* 3 */                 return false;
                    }
/* 7 */             SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
/* 17 */            if (this.f3401a.equals(signInConfiguration.f3401a)) {
/* 19 */                GoogleSignInOptions googleSignInOptions = signInConfiguration.f3402b;
/* 21 */                GoogleSignInOptions googleSignInOptions2 = this.f3402b;
/* 23 */                if (googleSignInOptions2 == null) {
/* 25 */                    if (googleSignInOptions == null) {
/* 35 */                        return true;
                            }
                        } else if (googleSignInOptions2.equals(googleSignInOptions)) {
/* 35 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 2 */             int i = 1 * 31;
/* 5 */             String str = this.f3401a;
/* 16 */            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
/* 18 */            GoogleSignInOptions googleSignInOptions = this.f3402b;
/* 27 */            return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3401a, false);
/* 17 */            w11.m9409S(parcel, 5, this.f3402b, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
