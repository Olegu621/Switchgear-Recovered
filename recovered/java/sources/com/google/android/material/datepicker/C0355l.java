            package com.google.android.material.datepicker;

            import android.R;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.GridView;
            import android.widget.ListAdapter;
            import androidx.recyclerview.widget.GridLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$integer;
            import com.google.android.material.R$layout;
            import com.google.android.material.button.MaterialButton;
            import p000.C1969nm;
            import p000.C2343wt;
            import p000.RunnableC2503ym;
            import p000.ViewOnClickListenerC2239u1;
            import p000.aa0;
            import p000.br1;
            import p000.dd1;
            import p000.e33;
            import p000.i50;
            import p000.wc1;
            import p000.zr1;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0355l<S> extends zr1 {

                /* JADX INFO: renamed from: U */
                public View f4657U;

                /* JADX INFO: renamed from: V */
                public View f4658V;

                /* JADX INFO: renamed from: b */
                public int f4659b;

                /* JADX INFO: renamed from: c */
                public DateSelector f4660c;

                /* JADX INFO: renamed from: d */
                public CalendarConstraints f4661d;

                /* JADX INFO: renamed from: e */
                public Month f4662e;

                /* JADX INFO: renamed from: f */
                public int f4663f;

                /* JADX INFO: renamed from: i */
                public C1969nm f4664i;

                /* JADX INFO: renamed from: v */
                public RecyclerView f4665v;

                /* JADX INFO: renamed from: w */
                public RecyclerView f4666w;

                @Override // p000.zr1
                /* JADX INFO: renamed from: g */
                public final void mo2311g(dd1 dd1Var) {
/* 3 */             this.f20305a.add(dd1Var);
                }

                /* JADX INFO: renamed from: h */
                public final void m2312h(Month month) {
/* 7 */             C0361r c0361r = (C0361r) this.f4666w.getAdapter();
/* 13 */            int iM2304m = c0361r.f4699d.f4612a.m2304m(month);
/* 27 */            int iM2304m2 = iM2304m - c0361r.f4699d.f4612a.m2304m(this.f4662e);
/* 40 */            boolean z = Math.abs(iM2304m2) > 3;
/* 41 */            boolean z2 = iM2304m2 > 0;
/* 44 */            this.f4662e = month;
/* 46 */            int i = 2;
/* 47 */            if (z && z2) {
/* 55 */                this.f4666w.m875c0(iM2304m - 3);
/* 65 */                this.f4666w.post(new RunnableC2503ym(this, iM2304m, i));
/* 68 */                return;
                    }
/* 69 */            RecyclerView recyclerView = this.f4666w;
/* 71 */            if (!z) {
/* 94 */                recyclerView.post(new RunnableC2503ym(this, iM2304m, i));
                    } else {
/* 75 */                recyclerView.m875c0(iM2304m + 3);
/* 85 */                this.f4666w.post(new RunnableC2503ym(this, iM2304m, i));
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m2313i(int i) {
/* 1 */             this.f4663f = i;
/* 7 */             if (i == 2) {
/* 36 */                this.f4665v.getLayoutManager().mo841y0(this.f4662e.f4628c - ((C0363t) this.f4665v.getAdapter()).f4705d.f4661d.f4612a.f4628c);
/* 41 */                this.f4657U.setVisibility(0);
/* 46 */                this.f4658V.setVisibility(8);
/* 49 */                return;
                    }
/* 51 */            if (i == 1) {
/* 55 */                this.f4657U.setVisibility(8);
/* 60 */                this.f4658V.setVisibility(0);
/* 65 */                m2312h(this.f4662e);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle == null) {
/* 6 */                 bundle = getArguments();
                    }
/* 16 */            this.f4659b = bundle.getInt("THEME_RES_ID_KEY");
/* 26 */            this.f4660c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
/* 36 */            this.f4661d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
/* 46 */            this.f4662e = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
                }

                @Override // androidx.fragment.app.Fragment
                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                    int i;
                    int i2;
/* 9 */             ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f4659b);
/* 17 */            this.f4664i = new C1969nm(contextThemeWrapper);
/* 19 */            LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
/* 25 */            Month month = this.f4661d.f4612a;
/* 34 */            int i3 = 0;
/* 35 */            int i4 = 1;
/* 36 */            if (C0356m.m2315k(contextThemeWrapper, R.attr.windowFullscreen)) {
/* 38 */                i = R$layout.mtrl_calendar_vertical;
/* 40 */                i2 = 1;
                    } else {
/* 42 */                i = R$layout.mtrl_calendar_horizontal;
/* 44 */                i2 = 0;
                    }
/* 45 */            View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
/* 53 */            Resources resources = requireContext().getResources();
/* 76 */            int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height);
/* 79 */            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
/* 83 */            int i5 = C0358o.f4689f;
/* 110 */           viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding));
/* 119 */           GridView gridView = (GridView) viewInflate.findViewById(R$id.mtrl_calendar_days_of_week);
/* 126 */           e33.m3318n(gridView, new aa0(i4));
/* 134 */           gridView.setAdapter((ListAdapter) new i50());
/* 139 */           gridView.setNumColumns(month.f4629d);
/* 142 */           gridView.setEnabled(false);
/* 153 */           this.f4666w = (RecyclerView) viewInflate.findViewById(R$id.mtrl_calendar_months);
/* 157 */           getContext();
/* 165 */           this.f4666w.setLayoutManager(new wc1(this, i2, i2));
/* 172 */           this.f4666w.setTag("MONTHS_VIEW_GROUP_TAG");
/* 186 */           C0361r c0361r = new C0361r(contextThemeWrapper, this.f4660c, this.f4661d, new C0351h(this));
/* 191 */           this.f4666w.setAdapter(c0361r);
/* 200 */           int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
/* 210 */           RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
/* 212 */           this.f4665v = recyclerView;
/* 214 */           if (recyclerView != null) {
/* 216 */               recyclerView.setHasFixedSize(true);
/* 226 */               this.f4665v.setLayoutManager(new GridLayoutManager(integer));
/* 236 */               this.f4665v.setAdapter(new C0363t(this));
/* 246 */               this.f4665v.m880g(new C0352i(this));
                    }
/* 255 */           if (viewInflate.findViewById(R$id.month_navigation_fragment_toggle) != null) {
/* 263 */               MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R$id.month_navigation_fragment_toggle);
/* 267 */               materialButton.setTag("SELECTOR_TOGGLE_TAG");
/* 276 */               e33.m3318n(materialButton, new C2343wt(this, 3));
/* 285 */               MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(R$id.month_navigation_previous);
/* 289 */               materialButton2.setTag("NAVIGATION_PREV_TAG");
/* 298 */               MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(R$id.month_navigation_next);
/* 302 */               materialButton3.setTag("NAVIGATION_NEXT_TAG");
/* 311 */               this.f4657U = viewInflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
/* 319 */               this.f4658V = viewInflate.findViewById(R$id.mtrl_calendar_day_selector_frame);
/* 321 */               m2313i(1);
/* 330 */               materialButton.setText(this.f4662e.m2303k());
/* 340 */               this.f4666w.m882h(new C0353j(this, c0361r, materialButton));
/* 349 */               materialButton.setOnClickListener(new ViewOnClickListenerC2239u1(this, 5));
/* 357 */               materialButton3.setOnClickListener(new ViewOnClickListenerC0354k(this, c0361r, i3));
/* 365 */               materialButton2.setOnClickListener(new ViewOnClickListenerC0354k(this, c0361r, i4));
                    }
/* 372 */           if (!C0356m.m2315k(contextThemeWrapper, R.attr.windowFullscreen)) {
/* 381 */               new br1().m1415a(this.f4666w);
                    }
/* 396 */           this.f4666w.m875c0(c0361r.f4699d.f4612a.m2304m(this.f4662e));
/* 399 */           return viewInflate;
                }

                @Override // androidx.fragment.app.Fragment
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putInt("THEME_RES_ID_KEY", this.f4659b);
/* 15 */            bundle.putParcelable("GRID_SELECTOR_KEY", this.f4660c);
/* 22 */            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4661d);
/* 29 */            bundle.putParcelable("CURRENT_MONTH_KEY", this.f4662e);
                }
            }
