            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<LocationAvailability> CREATOR = new md3(27);

                /* JADX INFO: renamed from: a */
                public int f4118a;

                /* JADX INFO: renamed from: b */
                public int f4119b;

                /* JADX INFO: renamed from: c */
                public long f4120c;

                /* JADX INFO: renamed from: d */
                public int f4121d;

                /* JADX INFO: renamed from: e */
                public zzbo[] f4122e;

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof LocationAvailability) {
/* 6 */                 LocationAvailability locationAvailability = (LocationAvailability) obj;
/* 12 */                if (this.f4118a == locationAvailability.f4118a && this.f4119b == locationAvailability.f4119b && this.f4120c == locationAvailability.f4120c && this.f4121d == locationAvailability.f4121d && Arrays.equals(this.f4122e, locationAvailability.f4122e)) {
/* 44 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 31 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4121d), Integer.valueOf(this.f4118a), Integer.valueOf(this.f4119b), Long.valueOf(this.f4120c), this.f4122e});
                }

                public final String toString() {
/* 9 */             boolean z = this.f4121d < 1000;
/* 14 */            StringBuilder sb = new StringBuilder(48);
/* 19 */            sb.append("LocationAvailability[isLocationAvailable: ");
/* 22 */            sb.append(z);
/* 27 */            sb.append("]");
/* 30 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f4118a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.f4119b;
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            long j = this.f4120c;
/* 31 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(j);
/* 37 */            int i4 = this.f4121d;
/* 39 */            w11.m9420b0(parcel, 4, 4);
/* 42 */            parcel.writeInt(i4);
/* 48 */            w11.m9413W(parcel, 5, this.f4122e, i);
/* 51 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
