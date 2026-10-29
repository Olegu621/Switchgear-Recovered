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
            public class SleepClassifyEvent extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new re3(8);

                /* JADX INFO: renamed from: a */
                public final int f4146a;

                /* JADX INFO: renamed from: b */
                public final int f4147b;

                /* JADX INFO: renamed from: c */
                public final int f4148c;

                /* JADX INFO: renamed from: d */
                public final int f4149d;

                /* JADX INFO: renamed from: e */
                public final int f4150e;

                /* JADX INFO: renamed from: f */
                public final int f4151f;

                /* JADX INFO: renamed from: i */
                public final int f4152i;

                /* JADX INFO: renamed from: v */
                public final boolean f4153v;

                /* JADX INFO: renamed from: w */
                public final int f4154w;

                public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
/* 4 */             this.f4146a = i;
/* 6 */             this.f4147b = i2;
/* 8 */             this.f4148c = i3;
/* 10 */            this.f4149d = i4;
/* 12 */            this.f4150e = i5;
/* 14 */            this.f4151f = i6;
/* 16 */            this.f4152i = i7;
/* 18 */            this.f4153v = z;
/* 20 */            this.f4154w = i8;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SleepClassifyEvent)) {
/* 7 */                 return false;
                    }
/* 11 */            SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
                    return this.f4146a == sleepClassifyEvent.f4146a && this.f4147b == sleepClassifyEvent.f4147b;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4146a), Integer.valueOf(this.f4147b)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(65);
/* 10 */            sb.append(this.f4146a);
/* 15 */            sb.append(" Conf:");
/* 20 */            sb.append(this.f4147b);
/* 25 */            sb.append(" Motion:");
/* 30 */            sb.append(this.f4148c);
/* 35 */            sb.append(" Light:");
/* 40 */            sb.append(this.f4149d);
/* 43 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            w11.m9420b0(parcel, 1, 4);
/* 17 */            parcel.writeInt(this.f4146a);
/* 21 */            w11.m9420b0(parcel, 2, 4);
/* 26 */            parcel.writeInt(this.f4147b);
/* 30 */            w11.m9420b0(parcel, 3, 4);
/* 35 */            parcel.writeInt(this.f4148c);
/* 38 */            w11.m9420b0(parcel, 4, 4);
/* 43 */            parcel.writeInt(this.f4149d);
/* 47 */            w11.m9420b0(parcel, 5, 4);
/* 52 */            parcel.writeInt(this.f4150e);
/* 56 */            w11.m9420b0(parcel, 6, 4);
/* 61 */            parcel.writeInt(this.f4151f);
/* 65 */            w11.m9420b0(parcel, 7, 4);
/* 70 */            parcel.writeInt(this.f4152i);
/* 75 */            w11.m9420b0(parcel, 8, 4);
/* 80 */            parcel.writeInt(this.f4153v ? 1 : 0);
/* 85 */            w11.m9420b0(parcel, 9, 4);
/* 90 */            parcel.writeInt(this.f4154w);
/* 93 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
