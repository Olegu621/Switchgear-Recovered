            package com.google.android.material.datepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
                public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new qd3(5);

                /* JADX INFO: renamed from: a */
                public final long f4623a;

                public DateValidatorPointForward(long j) {
/* 4 */             this.f4623a = j;
                }

                @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
                /* JADX INFO: renamed from: E0 */
                public final boolean mo2287E0(long j) {
                    return j >= this.f4623a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof DateValidatorPointForward) && this.f4623a == ((DateValidatorPointForward) obj).f4623a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f4623a)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeLong(this.f4623a);
                }
            }
