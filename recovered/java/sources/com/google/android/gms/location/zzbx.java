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
            public final class zzbx extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbx> CREATOR = new re3(11);

                /* JADX INFO: renamed from: a */
                public final int f4176a;

                /* JADX INFO: renamed from: b */
                public final int f4177b;

                /* JADX INFO: renamed from: c */
                public final int f4178c;

                /* JADX INFO: renamed from: d */
                public final int f4179d;

                public zzbx(int i, int i2, int i3, int i4) {
/* 17 */            kb1.m6063p("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
/* 31 */            kb1.m6063p("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
/* 43 */            kb1.m6063p("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
/* 55 */            kb1.m6063p("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
/* 68 */            kb1.m6063p("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
/* 71 */            this.f4176a = i;
/* 73 */            this.f4177b = i2;
/* 75 */            this.f4178c = i3;
/* 77 */            this.f4179d = i4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzbx)) {
/* 7 */                 return false;
                    }
/* 11 */            zzbx zzbxVar = (zzbx) obj;
                    return this.f4176a == zzbxVar.f4176a && this.f4177b == zzbxVar.f4177b && this.f4178c == zzbxVar.f4178c && this.f4179d == zzbxVar.f4179d;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4176a), Integer.valueOf(this.f4177b), Integer.valueOf(this.f4178c), Integer.valueOf(this.f4179d)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(117);
/* 10 */            sb.append("UserPreferredSleepWindow [startHour=");
/* 15 */            sb.append(this.f4176a);
/* 20 */            sb.append(", startMinute=");
/* 25 */            sb.append(this.f4177b);
/* 30 */            sb.append(", endHour=");
/* 35 */            sb.append(this.f4178c);
/* 40 */            sb.append(", endMinute=");
/* 45 */            sb.append(this.f4179d);
/* 50 */            sb.append(']');
/* 53 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            w11.m9420b0(parcel, 1, 4);
/* 17 */            parcel.writeInt(this.f4176a);
/* 21 */            w11.m9420b0(parcel, 2, 4);
/* 26 */            parcel.writeInt(this.f4177b);
/* 30 */            w11.m9420b0(parcel, 3, 4);
/* 35 */            parcel.writeInt(this.f4178c);
/* 38 */            w11.m9420b0(parcel, 4, 4);
/* 43 */            parcel.writeInt(this.f4179d);
/* 46 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
