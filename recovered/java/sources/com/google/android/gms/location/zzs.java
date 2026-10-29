            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzs extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzs> CREATOR = new dr3(9);

                /* JADX INFO: renamed from: a */
                public final boolean f4180a;

                /* JADX INFO: renamed from: b */
                public final long f4181b;

                /* JADX INFO: renamed from: c */
                public final float f4182c;

                /* JADX INFO: renamed from: d */
                public final long f4183d;

                /* JADX INFO: renamed from: e */
                public final int f4184e;

                public zzs(boolean z, long j, float f, long j2, int i) {
/* 4 */             this.f4180a = z;
/* 6 */             this.f4181b = j;
/* 8 */             this.f4182c = f;
/* 10 */            this.f4183d = j2;
/* 12 */            this.f4184e = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzs)) {
/* 7 */                 return false;
                    }
/* 11 */            zzs zzsVar = (zzs) obj;
                    return this.f4180a == zzsVar.f4180a && this.f4181b == zzsVar.f4181b && Float.compare(this.f4182c, zzsVar.f4182c) == 0 && this.f4183d == zzsVar.f4183d && this.f4184e == zzsVar.f4184e;
                }

                public final int hashCode() {
/* 35 */            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4180a), Long.valueOf(this.f4181b), Float.valueOf(this.f4182c), Long.valueOf(this.f4183d), Integer.valueOf(this.f4184e)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
/* 10 */            sb.append(this.f4180a);
/* 15 */            sb.append(" mMinimumSamplingPeriodMs=");
/* 20 */            sb.append(this.f4181b);
/* 25 */            sb.append(" mSmallestAngleChangeRadians=");
/* 30 */            sb.append(this.f4182c);
/* 38 */            long j = this.f4183d;
/* 42 */            if (j != Long.MAX_VALUE) {
/* 44 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 50 */                sb.append(" expireIn=");
/* 54 */                sb.append(j - jElapsedRealtime);
/* 59 */                sb.append("ms");
                    }
/* 65 */            int i = this.f4184e;
/* 67 */            if (i != Integer.MAX_VALUE) {
/* 71 */                sb.append(" num=");
/* 74 */                sb.append(i);
                    }
/* 79 */            sb.append(']');
/* 82 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4180a ? 1 : 0);
/* 20 */            w11.m9420b0(parcel, 2, 8);
/* 25 */            parcel.writeLong(this.f4181b);
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 34 */            parcel.writeFloat(this.f4182c);
/* 37 */            w11.m9420b0(parcel, 4, 8);
/* 42 */            parcel.writeLong(this.f4183d);
/* 46 */            w11.m9420b0(parcel, 5, 4);
/* 51 */            parcel.writeInt(this.f4184e);
/* 54 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
