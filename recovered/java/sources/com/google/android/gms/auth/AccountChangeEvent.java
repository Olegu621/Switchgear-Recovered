            package com.google.android.gms.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.AbstractC0886en;
            import p000.de3;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AccountChangeEvent extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new tc3(17);

                /* JADX INFO: renamed from: a */
                public final int f3223a;

                /* JADX INFO: renamed from: b */
                public final long f3224b;

                /* JADX INFO: renamed from: c */
                public final String f3225c;

                /* JADX INFO: renamed from: d */
                public final int f3226d;

                /* JADX INFO: renamed from: e */
                public final int f3227e;

                /* JADX INFO: renamed from: f */
                public final String f3228f;

                public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
/* 4 */             this.f3223a = i;
/* 6 */             this.f3224b = j;
/* 8 */             kb1.m6061n(str);
/* 11 */            this.f3225c = str;
/* 13 */            this.f3226d = i2;
/* 15 */            this.f3227e = i3;
/* 17 */            this.f3228f = str2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof AccountChangeEvent)) {
/* 3 */                 return false;
                    }
/* 8 */             if (obj == this) {
/* 7 */                 return true;
                    }
/* 11 */            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                    return this.f3223a == accountChangeEvent.f3223a && this.f3224b == accountChangeEvent.f3224b && de3.m3029k(this.f3225c, accountChangeEvent.f3225c) && this.f3226d == accountChangeEvent.f3226d && this.f3227e == accountChangeEvent.f3227e && de3.m3029k(this.f3228f, accountChangeEvent.f3228f);
                }

                public final int hashCode() {
/* 33 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3223a), Long.valueOf(this.f3224b), this.f3225c, Integer.valueOf(this.f3226d), Integer.valueOf(this.f3227e), this.f3228f});
                }

                public final String toString() {
                    String str;
/* 2 */             int i = this.f3226d;
/* 4 */             if (i == 1) {
/* 27 */                str = "ADDED";
                    } else if (i == 2) {
/* 24 */                str = "REMOVED";
                    } else if (i != 3) {
/* 18 */                str = i != 4 ? "UNKNOWN" : "RENAMED_TO";
                    } else {
/* 21 */                str = "RENAMED_FROM";
                    }
/* 37 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("AccountChangeEvent {accountName = ", this.f3225c, ", changeType = ", str, ", changeData = ");
/* 43 */            sbM3514r.append(this.f3228f);
/* 48 */            sbM3514r.append(", eventIndex = ");
/* 53 */            sbM3514r.append(this.f3227e);
/* 58 */            sbM3514r.append("}");
/* 61 */            return sbM3514r.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3223a);
/* 20 */            w11.m9420b0(parcel, 2, 8);
/* 25 */            parcel.writeLong(this.f3224b);
/* 32 */            w11.m9410T(parcel, 3, this.f3225c, false);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f3226d);
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f3227e);
/* 55 */            w11.m9410T(parcel, 6, this.f3228f, false);
/* 58 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
