            package com.google.android.gms.auth.api.identity;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SignInCredential extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SignInCredential> CREATOR = new ub3(26);

                /* JADX INFO: renamed from: a */
                public final String f3343a;

                /* JADX INFO: renamed from: b */
                public final String f3344b;

                /* JADX INFO: renamed from: c */
                public final String f3345c;

                /* JADX INFO: renamed from: d */
                public final String f3346d;

                /* JADX INFO: renamed from: e */
                public final Uri f3347e;

                /* JADX INFO: renamed from: f */
                public final String f3348f;

                /* JADX INFO: renamed from: i */
                public final String f3349i;

                /* JADX INFO: renamed from: v */
                public final String f3350v;

                /* JADX INFO: renamed from: w */
                public final PublicKeyCredential f3351w;

                public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
/* 4 */             kb1.m6058k(str);
/* 7 */             this.f3343a = str;
/* 9 */             this.f3344b = str2;
/* 11 */            this.f3345c = str3;
/* 13 */            this.f3346d = str4;
/* 15 */            this.f3347e = uri;
/* 17 */            this.f3348f = str5;
/* 19 */            this.f3349i = str6;
/* 21 */            this.f3350v = str7;
/* 23 */            this.f3351w = publicKeyCredential;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof SignInCredential)) {
/* 3 */                 return false;
                    }
/* 7 */             SignInCredential signInCredential = (SignInCredential) obj;
                    return de3.m3029k(this.f3343a, signInCredential.f3343a) && de3.m3029k(this.f3344b, signInCredential.f3344b) && de3.m3029k(this.f3345c, signInCredential.f3345c) && de3.m3029k(this.f3346d, signInCredential.f3346d) && de3.m3029k(this.f3347e, signInCredential.f3347e) && de3.m3029k(this.f3348f, signInCredential.f3348f) && de3.m3029k(this.f3349i, signInCredential.f3349i) && de3.m3029k(this.f3350v, signInCredential.f3350v) && de3.m3029k(this.f3351w, signInCredential.f3351w);
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{this.f3343a, this.f3344b, this.f3345c, this.f3346d, this.f3347e, this.f3348f, this.f3349i, this.f3350v, this.f3351w});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3343a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f3344b, false);
/* 23 */            w11.m9410T(parcel, 3, this.f3345c, false);
/* 29 */            w11.m9410T(parcel, 4, this.f3346d, false);
/* 35 */            w11.m9409S(parcel, 5, this.f3347e, i, false);
/* 41 */            w11.m9410T(parcel, 6, this.f3348f, false);
/* 47 */            w11.m9410T(parcel, 7, this.f3349i, false);
/* 54 */            w11.m9410T(parcel, 8, this.f3350v, false);
/* 61 */            w11.m9409S(parcel, 9, this.f3351w, i, false);
/* 64 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
