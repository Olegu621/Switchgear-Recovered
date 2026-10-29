            package com.google.android.gms.location;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Arrays;
            import p000.cl3;
            import p000.de3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new cl3(2);

                /* JADX INFO: renamed from: a */
                public ArrayList f4095a;

                /* JADX INFO: renamed from: b */
                public long f4096b;

                /* JADX INFO: renamed from: c */
                public long f4097c;

                /* JADX INFO: renamed from: d */
                public int f4098d;

                /* JADX INFO: renamed from: e */
                public Bundle f4099e;

                /* JADX INFO: renamed from: D1 */
                public static boolean m2157D1(Bundle bundle, Bundle bundle2) {
                    int length;
/* 3 */             if (bundle == null) {
                        return bundle2 == null;
                    }
/* 9 */             if (bundle2 == null || bundle.size() != bundle2.size()) {
/* 2 */                 return false;
                    }
/* 35 */            for (String str : bundle.keySet()) {
/* 47 */                if (!bundle2.containsKey(str)) {
/* 2 */                     return false;
                        }
/* 50 */                Object obj = bundle.get(str);
/* 54 */                Object obj2 = bundle2.get(str);
/* 58 */                if (obj == null) {
/* 60 */                    if (obj2 != null) {
/* 2 */                         return false;
                            }
                        } else if (obj instanceof Bundle) {
/* 79 */                    if (!m2157D1(bundle.getBundle(str), bundle2.getBundle(str))) {
/* 2 */                         return false;
                            }
                        } else {
/* 90 */                    if (obj.getClass().isArray()) {
/* 92 */                        if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
/* 116 */                           for (int i = 0; i < length; i++) {
/* 130 */                               if (de3.m3029k(Array.get(obj, i), Array.get(obj2, i))) {
                                        }
                                    }
                                }
/* 2 */                         return false;
                            }
/* 141 */                   if (!obj.equals(obj2)) {
/* 2 */                         return false;
                            }
                        }
                    }
/* 1 */             return true;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 61 */                return true;
                    }
/* 4 */             if (obj == null || getClass() != obj.getClass()) {
/* 63 */                return false;
                    }
/* 17 */            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                    return this.f4096b == activityRecognitionResult.f4096b && this.f4097c == activityRecognitionResult.f4097c && this.f4098d == activityRecognitionResult.f4098d && de3.m3029k(this.f4095a, activityRecognitionResult.f4095a) && m2157D1(this.f4099e, activityRecognitionResult.f4099e);
                }

                public final int hashCode() {
/* 27 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f4096b), Long.valueOf(this.f4097c), Integer.valueOf(this.f4098d), this.f4095a, this.f4099e});
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f4095a);
/* 7 */             long j = this.f4096b;
/* 9 */             long j2 = this.f4097c;
/* 19 */            StringBuilder sb = new StringBuilder(strValueOf.length() + 124);
/* 24 */            sb.append("ActivityRecognitionResult [probableActivities=");
/* 27 */            sb.append(strValueOf);
/* 32 */            sb.append(", timeMillis=");
/* 35 */            sb.append(j);
/* 40 */            sb.append(", elapsedRealtimeMillis=");
/* 43 */            sb.append(j2);
/* 48 */            sb.append("]");
/* 51 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f4095a, false);
/* 14 */            long j = this.f4096b;
/* 19 */            w11.m9420b0(parcel, 2, 8);
/* 22 */            parcel.writeLong(j);
/* 25 */            long j2 = this.f4097c;
/* 28 */            w11.m9420b0(parcel, 3, 8);
/* 31 */            parcel.writeLong(j2);
/* 34 */            int i2 = this.f4098d;
/* 37 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(i2);
/* 46 */            w11.m9402L(parcel, 5, this.f4099e, false);
/* 49 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
