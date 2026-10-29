            package com.google.android.gms.auth.api.signin;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<SignInAccount> CREATOR = new ub3(16);

                /* JADX INFO: renamed from: a */
                public String f3395a;

                /* JADX INFO: renamed from: b */
                public GoogleSignInAccount f3396b;

                /* JADX INFO: renamed from: c */
                public String f3397c;

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 4, this.f3395a, false);
/* 17 */            w11.m9409S(parcel, 7, this.f3396b, i, false);
/* 24 */            w11.m9410T(parcel, 8, this.f3397c, false);
/* 27 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
