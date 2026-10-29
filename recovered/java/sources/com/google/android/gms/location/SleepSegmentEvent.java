            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SleepSegmentEvent extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new re3(9);

                /* JADX INFO: renamed from: a */
                public final long f4155a;

                /* JADX INFO: renamed from: b */
                public final long f4156b;

                /* JADX INFO: renamed from: c */
                public final int f4157c;

                /* JADX INFO: renamed from: d */
                public final int f4158d;

                /* JADX INFO: renamed from: e */
                public final int f4159e;

                public SleepSegmentEvent(int i, int i2, int i3, long j, long j2) {
/* 13 */            kb1.m6053f("endTimeMillis must be greater than or equal to startTimeMillis", j <= j2);
/* 16 */            this.f4155a = j;
/* 18 */            this.f4156b = j2;
/* 20 */            this.f4157c = i;
/* 22 */            this.f4158d = i2;
/* 24 */            this.f4159e = i3;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof SleepSegmentEvent) {
/* 6 */                 SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
/* 14 */                if (this.f4155a == sleepSegmentEvent.f4155a && this.f4156b == sleepSegmentEvent.f4156b && this.f4157c == sleepSegmentEvent.f4157c && this.f4158d == sleepSegmentEvent.f4158d && this.f4159e == sleepSegmentEvent.f4159e) {
/* 42 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f4155a), Long.valueOf(this.f4156b), Integer.valueOf(this.f4157c)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(84);
/* 10 */            sb.append("startMillis=");
/* 15 */            sb.append(this.f4155a);
/* 20 */            sb.append(", endMillis=");
/* 25 */            sb.append(this.f4156b);
/* 30 */            sb.append(", status=");
/* 35 */            sb.append(this.f4157c);
/* 38 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9420b0(parcel, 1, 8);
/* 18 */            parcel.writeLong(this.f4155a);
/* 22 */            w11.m9420b0(parcel, 2, 8);
/* 27 */            parcel.writeLong(this.f4156b);
/* 32 */            w11.m9420b0(parcel, 3, 4);
/* 37 */            parcel.writeInt(this.f4157c);
/* 40 */            w11.m9420b0(parcel, 4, 4);
/* 45 */            parcel.writeInt(this.f4158d);
/* 49 */            w11.m9420b0(parcel, 5, 4);
/* 54 */            parcel.writeInt(this.f4159e);
/* 57 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
