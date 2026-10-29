            package com.google.android.gms.auth;

            import android.accounts.Account;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AccountChangeEventsRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new md3(20);

                /* JADX INFO: renamed from: a */
                public final int f3229a;

                /* JADX INFO: renamed from: b */
                public final int f3230b;

                /* JADX INFO: renamed from: c */
                public final String f3231c;

                /* JADX INFO: renamed from: d */
                public final Account f3232d;

                public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
/* 4 */             this.f3229a = i;
/* 6 */             this.f3230b = i2;
/* 8 */             this.f3231c = str;
/* 10 */            if (account != null || TextUtils.isEmpty(str)) {
/* 28 */                this.f3232d = account;
                    } else {
/* 25 */                this.f3232d = new Account(str, "com.google");
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3229a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3230b);
/* 30 */            w11.m9410T(parcel, 3, this.f3231c, false);
/* 35 */            w11.m9409S(parcel, 4, this.f3232d, i, false);
/* 38 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
