            package com.google.android.material.datepicker;

            import android.content.Context;
            import android.icu.text.DateFormat;
            import android.icu.util.TimeZone;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import android.widget.TextView;
            import com.google.android.material.R$layout;
            import java.util.Calendar;
            import java.util.Collection;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.C1969nm;
            import p000.C2093q3;
            import p000.h13;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0358o extends BaseAdapter {

                /* JADX INFO: renamed from: f */
                public static final int f4689f = h13.m4086f(null).getMaximum(4);

                /* JADX INFO: renamed from: a */
                public final Month f4690a;

                /* JADX INFO: renamed from: b */
                public final DateSelector f4691b;

                /* JADX INFO: renamed from: c */
                public Collection f4692c;

                /* JADX INFO: renamed from: d */
                public C1969nm f4693d;

                /* JADX INFO: renamed from: e */
                public final CalendarConstraints f4694e;

                public C0358o(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
/* 4 */             this.f4690a = month;
/* 6 */             this.f4691b = dateSelector;
/* 8 */             this.f4694e = calendarConstraints;
/* 14 */            this.f4692c = dateSelector.mo2291Q0();
                }

                @Override // android.widget.Adapter
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long getItem(int i) {
/* 1 */             Month month = this.f4690a;
/* 7 */             if (i < month.m2301e() || i > m2321b()) {
/* 32 */                return null;
                    }
/* 27 */            return Long.valueOf(month.m2302j((i - month.m2301e()) + 1));
                }

                /* JADX INFO: renamed from: b */
                public final int m2321b() {
/* 1 */             Month month = this.f4690a;
/* 10 */            return (month.m2301e() + month.f4630e) - 1;
                }

                /* JADX INFO: renamed from: c */
                public final void m2322c(TextView textView, long j) {
                    C2093q3 c2093q3;
/* 1 */             if (textView == null) {
/* 3 */                 return;
                    }
/* 12 */            if (this.f4694e.f4614c.mo2287E0(j)) {
/* 15 */                textView.setEnabled(true);
/* 24 */                Iterator it = this.f4691b.mo2291Q0().iterator();
/* 32 */                while (it.hasNext()) {
/* 54 */                    if (h13.m4081a(j) == h13.m4081a(((Long) it.next()).longValue())) {
/* 60 */                        c2093q3 = (C2093q3) this.f4693d.f14374b;
                            }
                        }
/* 67 */                long timeInMillis = h13.m4085e().getTimeInMillis();
/* 73 */                C1969nm c1969nm = this.f4693d;
/* 84 */                c2093q3 = timeInMillis == j ? (C2093q3) c1969nm.f14375c : (C2093q3) c1969nm.f14373a;
                    } else {
/* 88 */                textView.setEnabled(false);
/* 95 */                c2093q3 = (C2093q3) this.f4693d.f14379g;
                    }
/* 97 */            c2093q3.m7692m(textView);
                }

                /* JADX INFO: renamed from: d */
                public final void m2323d(MaterialCalendarGridView materialCalendarGridView, long j) {
/* 1 */             Month monthM2299d = Month.m2299d(j);
/* 5 */             Month month = this.f4690a;
/* 11 */            if (monthM2299d.equals(month)) {
/* 15 */                Calendar calendarM4082b = h13.m4082b(month.f4626a);
/* 19 */                calendarM4082b.setTimeInMillis(j);
/* 51 */                m2322c((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m2296a().f4690a.m2301e() + (calendarM4082b.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
                    }
                }

                @Override // android.widget.Adapter
                public final int getCount() {
/* 1 */             Month month = this.f4690a;
/* 9 */             return month.f4630e + month.m2301e();
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 6 */             return i / this.f4690a.f4629d;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             Context context = viewGroup.getContext();
/* 7 */             if (this.f4693d == null) {
/* 14 */                this.f4693d = new C1969nm(context);
                    }
/* 17 */            TextView textView = (TextView) view;
/* 20 */            if (view == null) {
/* 37 */                textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day, viewGroup, false);
                    }
/* 39 */            Month month = this.f4690a;
/* 45 */            int iM2301e = i - month.m2301e();
/* 47 */            if (iM2301e < 0 || iM2301e >= month.f4630e) {
/* 175 */               textView.setVisibility(8);
/* 178 */               textView.setEnabled(false);
                    } else {
/* 55 */                int i2 = iM2301e + 1;
/* 56 */                textView.setTag(month);
/* 83 */                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
/* 86 */                long jM2302j = month.m2302j(i2);
/* 105 */               if (month.f4628c == new Month(h13.m4085e()).f4628c) {
/* 113 */                   DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
/* 121 */                   instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 133 */                   textView.setContentDescription(instanceForSkeleton.format(new Date(jM2302j)));
                        } else {
/* 143 */                   DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
/* 151 */                   instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 163 */                   textView.setContentDescription(instanceForSkeleton2.format(new Date(jM2302j)));
                        }
/* 166 */               textView.setVisibility(0);
/* 169 */               textView.setEnabled(true);
                    }
/* 181 */           Long item = getItem(i);
/* 185 */           if (item == null) {
/* 187 */               return textView;
                    }
/* 192 */           m2322c(textView, item.longValue());
/* 195 */           return textView;
                }

                @Override // android.widget.BaseAdapter, android.widget.Adapter
                public final boolean hasStableIds() {
/* 1 */             return true;
                }
            }
