            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<LocationRequest> CREATOR = new md3(29);

                /* JADX INFO: renamed from: a */
                public int f4123a;

                /* JADX INFO: renamed from: b */
                public long f4124b;

                /* JADX INFO: renamed from: c */
                public long f4125c;

                /* JADX INFO: renamed from: d */
                public boolean f4126d;

                /* JADX INFO: renamed from: e */
                public long f4127e;

                /* JADX INFO: renamed from: f */
                public int f4128f;

                /* JADX INFO: renamed from: i */
                public float f4129i;

                /* JADX INFO: renamed from: v */
                public long f4130v;

                /* JADX INFO: renamed from: w */
                public boolean f4131w;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof LocationRequest)) {
/* 85 */                return false;
                    }
/* 5 */             LocationRequest locationRequest = (LocationRequest) obj;
/* 11 */            if (this.f4123a != locationRequest.f4123a) {
/* 85 */                return false;
                    }
/* 13 */            long j = this.f4124b;
/* 15 */            long j2 = locationRequest.f4124b;
/* 19 */            if (j != j2 || this.f4125c != locationRequest.f4125c || this.f4126d != locationRequest.f4126d || this.f4127e != locationRequest.f4127e || this.f4128f != locationRequest.f4128f || this.f4129i != locationRequest.f4129i) {
/* 85 */                return false;
                    }
/* 57 */            long j3 = this.f4130v;
/* 61 */            if (j3 >= j) {
/* 64 */                j = j3;
                    }
/* 65 */            long j4 = locationRequest.f4130v;
/* 69 */            if (j4 >= j2) {
/* 72 */                j2 = j4;
                    }
                    return j == j2 && this.f4131w == locationRequest.f4131w;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4123a), Long.valueOf(this.f4124b), Float.valueOf(this.f4129i), Long.valueOf(this.f4130v)});
                }

                public final String toString() {
                    String str;
/* 1 */             int i = this.f4128f;
/* 3 */             float f = this.f4129i;
/* 5 */             long j = this.f4130v;
/* 7 */             long j2 = this.f4124b;
/* 13 */            StringBuilder sb = new StringBuilder("Request[");
/* 16 */            int i2 = this.f4123a;
/* 22 */            if (i2 == 100) {
/* 46 */                str = "PRIORITY_HIGH_ACCURACY";
                    } else if (i2 == 102) {
/* 43 */                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                    } else if (i2 != 104) {
/* 37 */                str = i2 != 105 ? "???" : "PRIORITY_NO_POWER";
                    } else {
/* 40 */                str = "PRIORITY_LOW_POWER";
                    }
/* 48 */            sb.append(str);
/* 53 */            if (i2 != 105) {
/* 57 */                sb.append(" requested=");
/* 60 */                sb.append(j2);
/* 63 */                sb.append("ms");
                    }
/* 68 */            sb.append(" fastest=");
/* 73 */            sb.append(this.f4125c);
/* 76 */            sb.append("ms");
/* 81 */            if (j > j2) {
/* 85 */                sb.append(" maxWait=");
/* 88 */                sb.append(j);
/* 91 */                sb.append("ms");
                    }
/* 97 */            if (f > 0.0f) {
/* 101 */               sb.append(" smallestDisplacement=");
/* 104 */               sb.append(f);
/* 109 */               sb.append("m");
                    }
/* 112 */           long j3 = this.f4127e;
/* 121 */           if (j3 != Long.MAX_VALUE) {
/* 123 */               long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 129 */               sb.append(" expireIn=");
/* 133 */               sb.append(j3 - jElapsedRealtime);
/* 136 */               sb.append("ms");
                    }
/* 142 */           if (i != Integer.MAX_VALUE) {
/* 146 */               sb.append(" num=");
/* 149 */               sb.append(i);
                    }
/* 154 */           sb.append(']');
/* 157 */           return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f4123a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            long j = this.f4124b;
/* 22 */            w11.m9420b0(parcel, 2, 8);
/* 25 */            parcel.writeLong(j);
/* 28 */            long j2 = this.f4125c;
/* 31 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(j2);
/* 37 */            boolean z = this.f4126d;
/* 39 */            w11.m9420b0(parcel, 4, 4);
/* 42 */            parcel.writeInt(z ? 1 : 0);
/* 45 */            long j3 = this.f4127e;
/* 48 */            w11.m9420b0(parcel, 5, 8);
/* 51 */            parcel.writeLong(j3);
/* 54 */            int i3 = this.f4128f;
/* 57 */            w11.m9420b0(parcel, 6, 4);
/* 60 */            parcel.writeInt(i3);
/* 63 */            float f = this.f4129i;
/* 66 */            w11.m9420b0(parcel, 7, 4);
/* 69 */            parcel.writeFloat(f);
/* 72 */            long j4 = this.f4130v;
/* 74 */            w11.m9420b0(parcel, 8, 8);
/* 77 */            parcel.writeLong(j4);
/* 80 */            boolean z2 = this.f4131w;
/* 84 */            w11.m9420b0(parcel, 9, 4);
/* 87 */            parcel.writeInt(z2 ? 1 : 0);
/* 90 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
