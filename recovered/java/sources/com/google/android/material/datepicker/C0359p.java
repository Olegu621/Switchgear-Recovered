            package com.google.android.material.datepicker;

            import android.view.View;
            import android.widget.AdapterView;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.Iterator;
            import p000.dd1;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0359p implements AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ MaterialCalendarGridView f4695a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0361r f4696b;

                public C0359p(C0361r c0361r, MaterialCalendarGridView materialCalendarGridView) {
/* 4 */             this.f4696b = c0361r;
/* 6 */             this.f4695a = materialCalendarGridView;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 1 */             MaterialCalendarGridView materialCalendarGridView = this.f4695a;
/* 3 */             C0358o c0358oM2296a = materialCalendarGridView.m2296a();
/* 13 */            if (i < c0358oM2296a.f4690a.m2301e() || i > c0358oM2296a.m2321b()) {
/* 102 */               return;
                    }
/* 23 */            C0351h c0351h = this.f4696b.f4701f;
/* 33 */            long jLongValue = materialCalendarGridView.m2296a().getItem(i).longValue();
/* 37 */            C0355l c0355l = c0351h.f4647a;
/* 47 */            if (c0355l.f4661d.f4614c.mo2287E0(jLongValue)) {
/* 51 */                c0355l.f4660c.mo2293n1(jLongValue);
/* 56 */                Iterator it = c0355l.f20305a.iterator();
/* 64 */                while (it.hasNext()) {
/* 78 */                    ((dd1) it.next()).m3004b(c0355l.f4660c.mo2292a1());
                        }
/* 88 */                c0355l.f4666w.getAdapter().m958d();
/* 91 */                RecyclerView recyclerView = c0355l.f4665v;
/* 93 */                if (recyclerView != null) {
/* 99 */                    recyclerView.getAdapter().m958d();
                        }
                    }
                }
            }
