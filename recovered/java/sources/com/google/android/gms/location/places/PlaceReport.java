            package com.google.android.gms.location.places;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import p000.de3;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<PlaceReport> CREATOR = new tc3(12);

                /* JADX INFO: renamed from: a */
                public final int f4162a;

                /* JADX INFO: renamed from: b */
                public final String f4163b;

                /* JADX INFO: renamed from: c */
                public final String f4164c;

                /* JADX INFO: renamed from: d */
                public final String f4165d;

                public PlaceReport(int i, String str, String str2, String str3) {
/* 4 */             this.f4162a = i;
/* 6 */             this.f4163b = str;
/* 8 */             this.f4164c = str2;
/* 10 */            this.f4165d = str3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof PlaceReport)) {
/* 3 */                 return false;
                    }
/* 7 */             PlaceReport placeReport = (PlaceReport) obj;
                    return de3.m3029k(this.f4163b, placeReport.f4163b) && de3.m3029k(this.f4164c, placeReport.f4164c) && de3.m3029k(this.f4165d, placeReport.f4165d);
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{this.f4163b, this.f4164c, this.f4165d});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4163b, "placeId");
/* 17 */            wc0Var.m9529d(this.f4164c, "tag");
/* 22 */            String str = this.f4165d;
/* 28 */            if (!"unknown".equals(str)) {
/* 32 */                wc0Var.m9529d(str, FirebaseAnalytics.Param.SOURCE);
                    }
/* 35 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4162a);
/* 21 */            w11.m9410T(parcel, 2, this.f4163b, false);
/* 27 */            w11.m9410T(parcel, 3, this.f4164c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f4165d, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
