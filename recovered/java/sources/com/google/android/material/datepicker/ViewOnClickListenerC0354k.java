            package com.google.android.material.datepicker;

            import android.view.View;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import java.util.Calendar;
            import p000.h13;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC0354k implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f4654a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0361r f4655b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0355l f4656c;

                public /* synthetic */ ViewOnClickListenerC0354k(C0355l c0355l, C0361r c0361r, int i) {
/* 1 */             this.f4654a = i;
/* 3 */             this.f4656c = c0355l;
/* 5 */             this.f4655b = c0361r;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             int i = this.f4654a;
/* 4 */             C0361r c0361r = this.f4655b;
/* 6 */             C0355l c0355l = this.f4656c;
                    switch (i) {
                        case 0:
/* 61 */                    int iM812V0 = ((LinearLayoutManager) c0355l.f4666w.getLayoutManager()).m812V0() + 1;
/* 73 */                    if (iM812V0 < c0355l.f4666w.getAdapter().mo955a()) {
/* 81 */                        Calendar calendarM4082b = h13.m4082b(c0361r.f4699d.f4612a.f4626a);
/* 85 */                        calendarM4082b.add(2, iM812V0);
/* 93 */                        c0355l.m2312h(new Month(calendarM4082b));
                            }
                            break;
                        default:
/* 23 */                    int iM813W0 = ((LinearLayoutManager) c0355l.f4666w.getLayoutManager()).m813W0() - 1;
/* 25 */                    if (iM813W0 >= 0) {
/* 33 */                        Calendar calendarM4082b2 = h13.m4082b(c0361r.f4699d.f4612a.f4626a);
/* 37 */                        calendarM4082b2.add(2, iM813W0);
/* 45 */                        c0355l.m2312h(new Month(calendarM4082b2));
                            }
                            break;
                    }
                }
            }
