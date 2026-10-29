            package com.google.android.material.datepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CalendarConstraints implements Parcelable {
                public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C0344a();

                /* JADX INFO: renamed from: a */
                public final Month f4612a;

                /* JADX INFO: renamed from: b */
                public final Month f4613b;

                /* JADX INFO: renamed from: c */
                public final DateValidator f4614c;

                /* JADX INFO: renamed from: d */
                public final Month f4615d;

                /* JADX INFO: renamed from: e */
                public final int f4616e;

                /* JADX INFO: renamed from: f */
                public final int f4617f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface DateValidator extends Parcelable {
                    /* JADX INFO: renamed from: E0 */
                    boolean mo2287E0(long j);
                }

                public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
/* 4 */             this.f4612a = month;
/* 6 */             this.f4613b = month2;
/* 8 */             this.f4615d = month3;
/* 10 */            this.f4614c = dateValidator;
/* 13 */            if (month3 != null && month.f4626a.compareTo(month3.f4626a) > 0) {
/* 28 */                C1951n4.m6859j("start Month cannot be after current Month");
/* 31 */                throw null;
                    }
/* 32 */            if (month3 != null && month3.compareTo(month2) > 0) {
/* 43 */                C1951n4.m6859j("current Month cannot be after end Month");
/* 46 */                throw null;
                    }
/* 53 */            this.f4617f = month.m2304m(month2) + 1;
/* 62 */            this.f4616e = (month2.f4628c - month.f4628c) + 1;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof CalendarConstraints)) {
/* 7 */                 return false;
                    }
/* 11 */            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
                    return this.f4612a.equals(calendarConstraints.f4612a) && this.f4613b.equals(calendarConstraints.f4613b) && Objects.equals(this.f4615d, calendarConstraints.f4615d) && this.f4614c.equals(calendarConstraints.f4614c);
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f4612a, this.f4613b, this.f4615d, this.f4614c});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 4 */             parcel.writeParcelable(this.f4612a, 0);
/* 9 */             parcel.writeParcelable(this.f4613b, 0);
/* 14 */            parcel.writeParcelable(this.f4615d, 0);
/* 19 */            parcel.writeParcelable(this.f4614c, 0);
                }
            }
