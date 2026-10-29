            package com.google.android.material.datepicker;

            import android.view.View;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC0362s implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f4703a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0363t f4704b;

                public ViewOnClickListenerC0362s(C0363t c0363t, int i) {
/* 4 */             this.f4704b = c0363t;
/* 6 */             this.f4703a = i;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 3 */             C0355l c0355l = this.f4704b.f4705d;
/* 11 */            Month monthM2298b = Month.m2298b(this.f4703a, c0355l.f4662e.f4627b);
/* 15 */            CalendarConstraints calendarConstraints = c0355l.f4661d;
/* 17 */            Month month = calendarConstraints.f4613b;
/* 19 */            Month month2 = calendarConstraints.f4612a;
/* 25 */            if (monthM2298b.compareTo(month2) < 0) {
/* 27 */                monthM2298b = month2;
                    } else if (monthM2298b.compareTo(month) > 0) {
/* 35 */                monthM2298b = month;
                    }
/* 36 */            c0355l.m2312h(monthM2298b);
/* 40 */            c0355l.m2313i(1);
                }
            }
