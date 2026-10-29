            package com.google.android.material.datepicker;

            import android.R;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import android.widget.ListAdapter;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import java.util.Calendar;
            import java.util.Iterator;
            import p000.C1951n4;
            import p000.f42;
            import p000.h13;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0361r extends AbstractC0129g {

                /* JADX INFO: renamed from: d */
                public final CalendarConstraints f4699d;

                /* JADX INFO: renamed from: e */
                public final DateSelector f4700e;

                /* JADX INFO: renamed from: f */
                public final C0351h f4701f;

                /* JADX INFO: renamed from: g */
                public final int f4702g;

                public C0361r(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, C0351h c0351h) {
/* 4 */             Month month = calendarConstraints.f4612a;
/* 6 */             Month month2 = calendarConstraints.f4613b;
/* 8 */             Month month3 = calendarConstraints.f4615d;
/* 15 */            if (month.compareTo(month3) > 0) {
/* 92 */                C1951n4.m6859j("firstPage cannot be after currentPage");
/* 95 */                throw null;
                    }
/* 21 */            if (month3.compareTo(month2) > 0) {
/* 86 */                C1951n4.m6859j("currentPage cannot be after lastPage");
/* 89 */                throw null;
                    }
/* 58 */            this.f4702g = (contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * C0358o.f4689f) + (C0356m.m2315k(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) : 0);
/* 60 */            this.f4699d = calendarConstraints;
/* 62 */            this.f4700e = dateSelector;
/* 64 */            this.f4701f = c0351h;
/* 72 */            if (this.f1748a.m4416a()) {
/* 80 */                f42.m3656l("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
/* 83 */                throw null;
                    }
/* 75 */            this.f1749b = true;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: a */
                public final int mo955a() {
/* 3 */             return this.f4699d.f4617f;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: b */
                public final long mo956b(int i) {
/* 7 */             Calendar calendarM4082b = h13.m4082b(this.f4699d.f4612a.f4626a);
/* 12 */            calendarM4082b.add(2, i);
/* 22 */            return new Month(calendarM4082b).f4626a.getTimeInMillis();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: e */
                public final void mo959e(AbstractC0137o abstractC0137o, int i) {
/* 1 */             C0360q c0360q = (C0360q) abstractC0137o;
/* 3 */             CalendarConstraints calendarConstraints = this.f4699d;
/* 9 */             Calendar calendarM4082b = h13.m4082b(calendarConstraints.f4612a.f4626a);
/* 14 */            calendarM4082b.add(2, i);
/* 19 */            Month month = new Month(calendarM4082b);
/* 28 */            c0360q.f4697u.setText(month.m2303k());
/* 39 */            MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0360q.f4698v.findViewById(R$id.month_grid);
/* 45 */            if (materialCalendarGridView.m2296a() == null || !month.equals(materialCalendarGridView.m2296a().f4690a)) {
/* 135 */               C0358o c0358o = new C0358o(month, this.f4700e, calendarConstraints);
/* 140 */               materialCalendarGridView.setNumColumns(month.f4629d);
/* 143 */               materialCalendarGridView.setAdapter((ListAdapter) c0358o);
                    } else {
/* 59 */                materialCalendarGridView.invalidate();
/* 62 */                C0358o c0358oM2296a = materialCalendarGridView.m2296a();
/* 66 */                DateSelector dateSelector = c0358oM2296a.f4691b;
/* 70 */                Iterator it = c0358oM2296a.f4692c.iterator();
/* 78 */                while (it.hasNext()) {
/* 90 */                    c0358oM2296a.m2323d(materialCalendarGridView, ((Long) it.next()).longValue());
                        }
/* 94 */                if (dateSelector != null) {
/* 100 */                   Iterator it2 = dateSelector.mo2291Q0().iterator();
/* 108 */                   while (it2.hasNext()) {
/* 120 */                       c0358oM2296a.m2323d(materialCalendarGridView, ((Long) it2.next()).longValue());
                            }
/* 128 */                   c0358oM2296a.f4692c = dateSelector.mo2291Q0();
                        }
                    }
/* 151 */           materialCalendarGridView.setOnItemClickListener(new C0359p(this, materialCalendarGridView));
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: f */
                public final AbstractC0137o mo960f(ViewGroup viewGroup, int i) {
/* 16 */            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, viewGroup, false);
/* 29 */            if (!C0356m.m2315k(viewGroup.getContext(), R.attr.windowFullscreen)) {
/* 51 */                return new C0360q(linearLayout, false);
                    }
/* 39 */            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f4702g));
/* 45 */            return new C0360q(linearLayout, true);
                }
            }
