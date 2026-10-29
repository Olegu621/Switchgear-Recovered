            package com.google.android.material.timepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class TimeModel implements Parcelable {
                public static final Parcelable.Creator<TimeModel> CREATOR = new C0383e();

                /* JADX INFO: renamed from: a */
                public final int f5120a;

                /* JADX INFO: renamed from: b */
                public final int f5121b;

                /* JADX INFO: renamed from: c */
                public final int f5122c;

                /* JADX INFO: renamed from: d */
                public final int f5123d;

                public TimeModel(Parcel parcel) {
/* 1 */             int i = parcel.readInt();
/* 5 */             int i2 = parcel.readInt();
/* 9 */             int i3 = parcel.readInt();
/* 13 */            int i4 = parcel.readInt();
/* 20 */            this.f5121b = i;
/* 22 */            this.f5122c = i2;
/* 24 */            this.f5123d = i3;
/* 26 */            this.f5120a = i4;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TimeModel)) {
/* 7 */                 return false;
                    }
/* 11 */            TimeModel timeModel = (TimeModel) obj;
                    return this.f5121b == timeModel.f5121b && this.f5122c == timeModel.f5122c && this.f5120a == timeModel.f5120a && this.f5123d == timeModel.f5123d;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5120a), Integer.valueOf(this.f5121b), Integer.valueOf(this.f5122c), Integer.valueOf(this.f5123d)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f5121b);
/* 8 */             parcel.writeInt(this.f5122c);
/* 13 */            parcel.writeInt(this.f5123d);
/* 18 */            parcel.writeInt(this.f5120a);
                }
            }
