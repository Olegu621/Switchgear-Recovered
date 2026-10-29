            package com.google.android.material.datepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.format.DateUtils;
            import java.util.Arrays;
            import java.util.Calendar;
            import java.util.GregorianCalendar;
            import p000.C1951n4;
            import p000.h13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class Month implements Comparable<Month>, Parcelable {
                public static final Parcelable.Creator<Month> CREATOR = new C0357n();

                /* JADX INFO: renamed from: a */
                public final Calendar f4626a;

                /* JADX INFO: renamed from: b */
                public final int f4627b;

                /* JADX INFO: renamed from: c */
                public final int f4628c;

                /* JADX INFO: renamed from: d */
                public final int f4629d;

                /* JADX INFO: renamed from: e */
                public final int f4630e;

                /* JADX INFO: renamed from: f */
                public final long f4631f;

                /* JADX INFO: renamed from: i */
                public String f4632i;

                public Month(Calendar calendar) {
/* 6 */             calendar.set(5, 1);
/* 9 */             Calendar calendarM4082b = h13.m4082b(calendar);
/* 13 */            this.f4626a = calendarM4082b;
/* 20 */            this.f4627b = calendarM4082b.get(2);
/* 26 */            this.f4628c = calendarM4082b.get(1);
/* 33 */            this.f4629d = calendarM4082b.getMaximum(7);
/* 39 */            this.f4630e = calendarM4082b.getActualMaximum(5);
/* 45 */            this.f4631f = calendarM4082b.getTimeInMillis();
                }

                /* JADX INFO: renamed from: b */
                public static Month m2298b(int i, int i2) {
/* 2 */             Calendar calendarM4086f = h13.m4086f(null);
/* 7 */             calendarM4086f.set(1, i);
/* 11 */            calendarM4086f.set(2, i2);
/* 16 */            return new Month(calendarM4086f);
                }

                /* JADX INFO: renamed from: d */
                public static Month m2299d(long j) {
/* 2 */             Calendar calendarM4086f = h13.m4086f(null);
/* 6 */             calendarM4086f.setTimeInMillis(j);
/* 11 */            return new Month(calendarM4086f);
                }

                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final int compareTo(Month month) {
/* 5 */             return this.f4626a.compareTo(month.f4626a);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                /* JADX INFO: renamed from: e */
                public final int m2301e() {
/* 2 */             Calendar calendar = this.f4626a;
/* 12 */            int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
                    return firstDayOfWeek < 0 ? firstDayOfWeek + this.f4629d : firstDayOfWeek;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Month)) {
/* 7 */                 return false;
                    }
/* 11 */            Month month = (Month) obj;
                    return this.f4627b == month.f4627b && this.f4628c == month.f4628c;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4627b), Integer.valueOf(this.f4628c)});
                }

                /* JADX INFO: renamed from: j */
                public final long m2302j(int i) {
/* 3 */             Calendar calendarM4082b = h13.m4082b(this.f4626a);
/* 8 */             calendarM4082b.set(5, i);
/* 11 */            return calendarM4082b.getTimeInMillis();
                }

                /* JADX INFO: renamed from: k */
                public final String m2303k() {
/* 3 */             if (this.f4632i == null) {
/* 18 */                this.f4632i = DateUtils.formatDateTime(null, this.f4626a.getTimeInMillis(), 8228);
                    }
/* 20 */            return this.f4632i;
                }

                /* JADX INFO: renamed from: m */
                public final int m2304m(Month month) {
/* 5 */             if (this.f4626a instanceof GregorianCalendar) {
/* 19 */                return (month.f4627b - this.f4627b) + ((month.f4628c - this.f4628c) * 12);
                    }
/* 23 */            C1951n4.m6859j("Only Gregorian calendars are supported.");
/* 26 */            return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f4628c);
/* 8 */             parcel.writeInt(this.f4627b);
                }
            }
