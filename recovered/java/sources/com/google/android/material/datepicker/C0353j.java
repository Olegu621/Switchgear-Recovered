            package com.google.android.material.datepicker;

            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.button.MaterialButton;
            import java.util.Calendar;
            import p000.h13;
            import p000.r12;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0353j extends r12 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0361r f4651a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MaterialButton f4652b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0355l f4653c;

                public C0353j(C0355l c0355l, C0361r c0361r, MaterialButton materialButton) {
/* 4 */             this.f4653c = c0355l;
/* 6 */             this.f4651a = c0361r;
/* 8 */             this.f4652b = materialButton;
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: a */
                public final void mo2309a(RecyclerView recyclerView, int i) {
/* 1 */             if (i == 0) {
/* 9 */                 recyclerView.announceForAccessibility(this.f4652b.getText());
                    }
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: b */
                public final void mo2310b(RecyclerView recyclerView, int i, int i2) {
/* 3 */             CalendarConstraints calendarConstraints = this.f4651a.f4699d;
/* 5 */             C0355l c0355l = this.f4653c;
/* 7 */             RecyclerView recyclerView2 = c0355l.f4666w;
/* 28 */            int iM812V0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).m812V0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).m813W0();
/* 36 */            Calendar calendarM4082b = h13.m4082b(calendarConstraints.f4612a.f4626a);
/* 41 */            calendarM4082b.add(2, iM812V0);
/* 49 */            c0355l.f4662e = new Month(calendarM4082b);
/* 55 */            Calendar calendarM4082b2 = h13.m4082b(calendarConstraints.f4612a.f4626a);
/* 59 */            calendarM4082b2.add(2, iM812V0);
/* 73 */            this.f4652b.setText(new Month(calendarM4082b2).m2303k());
                }
            }
