            package com.google.android.gms.common.internal;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zat extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zat> CREATOR = new ub3(10);

                /* JADX INFO: renamed from: a */
                public final int f3526a;

                /* JADX INFO: renamed from: b */
                public final Account f3527b;

                /* JADX INFO: renamed from: c */
                public final int f3528c;

                /* JADX INFO: renamed from: d */
                public final GoogleSignInAccount f3529d;

                public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
/* 4 */             this.f3526a = i;
/* 6 */             this.f3527b = account;
/* 8 */             this.f3528c = i2;
/* 10 */            this.f3529d = googleSignInAccount;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3526a);
/* 21 */            w11.m9409S(parcel, 2, this.f3527b, i, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3528c);
/* 35 */            w11.m9409S(parcel, 4, this.f3529d, i, false);
/* 38 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
