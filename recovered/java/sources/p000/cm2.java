            package p000;

            import androidx.viewpager.widget.PagerAdapter;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.tabs.TabLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cm2 implements d43 {

                /* JADX INFO: renamed from: a */
                public boolean f3002a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TabLayout f3003b;

                public cm2(TabLayout tabLayout) {
/* 4 */             this.f3003b = tabLayout;
                }

                @Override // p000.d43
                /* JADX INFO: renamed from: a */
                public final void mo1728a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
/* 1 */             TabLayout tabLayout = this.f3003b;
/* 5 */             if (tabLayout.f4994y0 == viewPager) {
/* 9 */                 tabLayout.m2390k(pagerAdapter2, this.f3002a);
                    }
                }
            }
