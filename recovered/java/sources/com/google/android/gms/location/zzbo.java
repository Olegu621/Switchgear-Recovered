            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbo extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbo> CREATOR = new re3(6);

                /* JADX INFO: renamed from: a */
                public final int f4169a;

                /* JADX INFO: renamed from: b */
                public final int f4170b;

                /* JADX INFO: renamed from: c */
                public final long f4171c;

                /* JADX INFO: renamed from: d */
                public final long f4172d;

                public zzbo(int i, int i2, long j, long j2) {
/* 4 */             this.f4169a = i;
/* 6 */             this.f4170b = i2;
/* 8 */             this.f4171c = j;
/* 10 */            this.f4172d = j2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzbo) {
/* 6 */                 zzbo zzboVar = (zzbo) obj;
/* 12 */                if (this.f4169a == zzboVar.f4169a && this.f4170b == zzboVar.f4170b && this.f4171c == zzboVar.f4171c && this.f4172d == zzboVar.f4172d) {
/* 36 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4170b), Integer.valueOf(this.f4169a), Long.valueOf(this.f4172d), Long.valueOf(this.f4171c)});
                }

                public final String toString() {
/* 43 */            return "NetworkLocationStatus: Wifi status: " + this.f4169a + " Cell status: " + this.f4170b + " elapsed time NS: " + this.f4172d + " system time ms: " + this.f4171c;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4169a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f4170b);
/* 29 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(this.f4171c);
/* 37 */            w11.m9420b0(parcel, 4, 8);
/* 42 */            parcel.writeLong(this.f4172d);
/* 45 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
