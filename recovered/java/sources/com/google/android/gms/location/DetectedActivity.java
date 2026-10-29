            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DetectedActivity extends AbstractSafeParcelable {
                public static final Parcelable.Creator<DetectedActivity> CREATOR = new cl3(29);

                /* JADX INFO: renamed from: a */
                public int f4112a;

                /* JADX INFO: renamed from: b */
                public int f4113b;

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof DetectedActivity) {
/* 6 */                 DetectedActivity detectedActivity = (DetectedActivity) obj;
/* 12 */                if (this.f4112a == detectedActivity.f4112a && this.f4113b == detectedActivity.f4113b) {
/* 20 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4112a), Integer.valueOf(this.f4113b)});
                }

                public final String toString() {
                    String string;
/* 1 */             int i = this.f4112a;
/* 6 */             if (i > 22 || i < 0) {
/* 10 */                i = 4;
                    }
/* 11 */            if (i == 0) {
/* 74 */                string = "IN_VEHICLE";
                    } else if (i == 1) {
/* 71 */                string = "ON_BICYCLE";
                    } else if (i == 2) {
/* 68 */                string = "ON_FOOT";
                    } else if (i == 3) {
/* 65 */                string = "STILL";
                    } else if (i == 4) {
/* 62 */                string = "UNKNOWN";
                    } else if (i == 5) {
/* 59 */                string = "TILTING";
                    } else if (i == 7) {
/* 56 */                string = "WALKING";
                    } else if (i == 8) {
/* 53 */                string = "RUNNING";
                    } else if (i != 16) {
/* 47 */                string = i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE";
                    } else {
/* 50 */                string = "IN_ROAD_VEHICLE";
                    }
/* 76 */            int i2 = this.f4113b;
/* 90 */            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 48);
/* 95 */            sb.append("DetectedActivity [type=");
/* 98 */            sb.append(string);
/* 103 */           sb.append(", confidence=");
/* 106 */           sb.append(i2);
/* 111 */           sb.append("]");
/* 114 */           return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            int i2 = this.f4112a;
/* 14 */            w11.m9420b0(parcel, 1, 4);
/* 17 */            parcel.writeInt(i2);
/* 20 */            int i3 = this.f4113b;
/* 23 */            w11.m9420b0(parcel, 2, 4);
/* 26 */            parcel.writeInt(i3);
/* 29 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
