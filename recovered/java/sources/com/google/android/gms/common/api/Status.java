            package com.google.android.gms.common.api;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.hu0;
            import p000.p42;
            import p000.tf3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Status extends AbstractSafeParcelable implements p42, ReflectedParcelable {

                /* JADX INFO: renamed from: a */
                public final int f3445a;

                /* JADX INFO: renamed from: b */
                public final String f3446b;

                /* JADX INFO: renamed from: c */
                public final PendingIntent f3447c;

                /* JADX INFO: renamed from: d */
                public final ConnectionResult f3448d;

                /* JADX INFO: renamed from: e */
                public static final Status f3440e = new Status(0, null, null, null);

                /* JADX INFO: renamed from: f */
                public static final Status f3441f = new Status(14, null, null, null);

                /* JADX INFO: renamed from: i */
                public static final Status f3442i = new Status(8, null, null, null);

                /* JADX INFO: renamed from: v */
                public static final Status f3443v = new Status(15, null, null, null);

                /* JADX INFO: renamed from: w */
                public static final Status f3444w = new Status(16, null, null, null);
                public static final Parcelable.Creator<Status> CREATOR = new tf3(4);

                public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
/* 4 */             this.f3445a = i;
/* 6 */             this.f3446b = str;
/* 8 */             this.f3447c = pendingIntent;
/* 10 */            this.f3448d = connectionResult;
                }

                /* JADX INFO: renamed from: D1 */
                public final boolean m2006D1() {
                    return this.f3445a <= 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Status)) {
/* 3 */                 return false;
                    }
/* 7 */             Status status = (Status) obj;
                    return this.f3445a == status.f3445a && de3.m3029k(this.f3446b, status.f3446b) && de3.m3029k(this.f3447c, status.f3447c) && de3.m3029k(this.f3448d, status.f3448d);
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3445a), this.f3446b, this.f3447c, this.f3448d});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 6 */             String strM4338g0 = this.f3446b;
/* 8 */             if (strM4338g0 == null) {
/* 13 */                strM4338g0 = hu0.m4338g0(this.f3445a);
                    }
/* 19 */            wc0Var.m9529d(strM4338g0, "statusCode");
/* 26 */            wc0Var.m9529d(this.f3447c, "resolution");
/* 29 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3445a);
/* 21 */            w11.m9410T(parcel, 2, this.f3446b, false);
/* 27 */            w11.m9409S(parcel, 3, this.f3447c, i, false);
/* 32 */            w11.m9409S(parcel, 4, this.f3448d, i, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
