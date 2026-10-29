            package com.google.android.gms.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.md3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class Feature extends AbstractSafeParcelable {
                public static final Parcelable.Creator<Feature> CREATOR = new md3(25);

                /* JADX INFO: renamed from: a */
                public final String f3420a;

                /* JADX INFO: renamed from: b */
                public final int f3421b;

                /* JADX INFO: renamed from: c */
                public final long f3422c;

                /* JADX INFO: renamed from: d */
                public final boolean f3423d;

                public Feature(int i, long j, String str, boolean z) {
/* 4 */             this.f3420a = str;
/* 6 */             this.f3421b = i;
/* 8 */             this.f3422c = j;
/* 10 */            this.f3423d = z;
                }

                /* JADX INFO: renamed from: D1 */
                public final long m2004D1() {
/* 3 */             long j = this.f3422c;
                    return j == -1 ? this.f3421b : j;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof Feature) {
/* 6 */                 Feature feature = (Feature) obj;
/* 16 */                if (de3.m3029k(this.f3420a, feature.f3420a) && m2004D1() == feature.m2004D1() && this.f3423d == feature.f3423d) {
/* 36 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.f3420a, Long.valueOf(m2004D1()), Boolean.valueOf(this.f3423d)});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f3420a, "name");
/* 23 */            wc0Var.m9529d(Long.valueOf(m2004D1()), "version");
/* 34 */            wc0Var.m9529d(Boolean.valueOf(this.f3423d), "is_fully_rolled_out");
/* 37 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3420a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3421b);
/* 24 */            long jM2004D1 = m2004D1();
/* 31 */            w11.m9420b0(parcel, 3, 8);
/* 34 */            parcel.writeLong(jM2004D1);
/* 37 */            w11.m9420b0(parcel, 4, 4);
/* 42 */            parcel.writeInt(this.f3423d ? 1 : 0);
/* 45 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 12 */        public Feature(String str, long j) {
/* 13 */            this(-1, j, str, false);
                }
            }
