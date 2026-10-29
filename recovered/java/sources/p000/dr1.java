            package p000;

            import android.database.DataSetObserver;
            import androidx.viewpager.widget.PagerAdapter;
            import androidx.viewpager.widget.PagerTitleStrip;
            import androidx.viewpager.widget.ViewPager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dr1 extends DataSetObserver implements e43, d43 {

                /* JADX INFO: renamed from: a */
                public int f7392a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PagerTitleStrip f7393b;

                public dr1(PagerTitleStrip pagerTitleStrip) {
/* 1 */             this.f7393b = pagerTitleStrip;
                }

                @Override // p000.d43
                /* JADX INFO: renamed from: a */
                public final void mo1728a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
/* 3 */             this.f7393b.m1117a(pagerAdapter, pagerAdapter2);
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: b */
                public final void mo3182b(float f, int i) {
/* 5 */             if (f > 0.5f) {
/* 7 */                 i++;
                    }
/* 12 */            this.f7393b.mo1116c(i, f, false);
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: c */
                public final void mo3183c(int i) {
/* 1 */             this.f7392a = i;
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: d */
                public final void mo3184d(int i) {
/* 3 */             if (this.f7392a == 0) {
/* 5 */                 PagerTitleStrip pagerTitleStrip = this.f7393b;
/* 19 */                pagerTitleStrip.m1118b(pagerTitleStrip.f1937a.getCurrentItem(), pagerTitleStrip.f1937a.getAdapter());
/* 22 */                float f = pagerTitleStrip.f1944f;
/* 27 */                if (f < 0.0f) {
/* 30 */                    f = 0.0f;
                        }
/* 38 */                pagerTitleStrip.mo1116c(pagerTitleStrip.f1937a.getCurrentItem(), f, true);
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onChanged() {
/* 1 */             PagerTitleStrip pagerTitleStrip = this.f7393b;
/* 15 */            pagerTitleStrip.m1118b(pagerTitleStrip.f1937a.getCurrentItem(), pagerTitleStrip.f1937a.getAdapter());
/* 18 */            float f = pagerTitleStrip.f1944f;
/* 23 */            if (f < 0.0f) {
/* 26 */                f = 0.0f;
                    }
/* 34 */            pagerTitleStrip.mo1116c(pagerTitleStrip.f1937a.getCurrentItem(), f, true);
                }
            }
