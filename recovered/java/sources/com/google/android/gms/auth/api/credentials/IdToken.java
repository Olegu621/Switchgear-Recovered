            package com.google.android.gms.auth.api.credentials;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.de3;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<IdToken> CREATOR = new ub3(21);

                /* JADX INFO: renamed from: a */
                public final String f3305a;

                /* JADX INFO: renamed from: b */
                public final String f3306b;

                public IdToken(String str, String str2) {
/* 12 */            kb1.m6053f("account type string cannot be null or empty", !TextUtils.isEmpty(str));
/* 23 */            kb1.m6053f("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
/* 26 */            this.f3305a = str;
/* 28 */            this.f3306b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IdToken)) {
/* 7 */                 return false;
                    }
/* 11 */            IdToken idToken = (IdToken) obj;
                    return de3.m3029k(this.f3305a, idToken.f3305a) && de3.m3029k(this.f3306b, idToken.f3306b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3305a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3306b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
