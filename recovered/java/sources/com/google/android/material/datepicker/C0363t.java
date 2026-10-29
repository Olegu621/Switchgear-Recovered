            package com.google.android.material.datepicker;

            import android.view.LayoutInflater;
            import android.view.ViewGroup;
            import android.widget.TextView;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import java.util.Calendar;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.C1969nm;
            import p000.C2093q3;
            import p000.h13;
            import p000.q93;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0363t extends AbstractC0129g {

                /* JADX INFO: renamed from: d */
                public final C0355l f4705d;

                public C0363t(C0355l c0355l) {
/* 4 */             this.f4705d = c0355l;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: a */
                public final int mo955a() {
/* 5 */             return this.f4705d.f4661d.f4616e;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: e */
                public final void mo959e(AbstractC0137o abstractC0137o, int i) {
/* 3 */             C0355l c0355l = this.f4705d;
/* 11 */            int i2 = c0355l.f4661d.f4612a.f4628c + i;
/* 12 */            TextView textView = ((q93) abstractC0137o).f15453u;
/* 20 */            String string = textView.getContext().getString(R$string.mtrl_picker_navigate_to_year_description);
/* 42 */            textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
/* 57 */            textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
/* 60 */            C1969nm c1969nm = c0355l.f4664i;
/* 62 */            Calendar calendarM4085e = h13.m4085e();
/* 75 */            C2093q3 c2093q3 = (C2093q3) (calendarM4085e.get(1) == i2 ? c1969nm.f14378f : c1969nm.f14376d);
/* 87 */            Iterator it = c0355l.f4660c.mo2291Q0().iterator();
/* 95 */            while (it.hasNext()) {
/* 107 */               calendarM4085e.setTimeInMillis(((Long) it.next()).longValue());
/* 114 */               if (calendarM4085e.get(1) == i2) {
/* 118 */                   c2093q3 = (C2093q3) c1969nm.f14377e;
                        }
                    }
/* 121 */           c2093q3.m7692m(textView);
/* 129 */           textView.setOnClickListener(new ViewOnClickListenerC0362s(this, i2));
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: f */
                public final AbstractC0137o mo960f(ViewGroup viewGroup, int i) {
/* 20 */            return new q93((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_year, viewGroup, false));
                }
            }
