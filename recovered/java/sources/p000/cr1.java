            package p000;

            import android.view.View;
            import androidx.viewpager.widget.PagerTabStrip;
            import androidx.viewpager.widget.ViewPager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cr1 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6891a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PagerTabStrip f6892b;

                public /* synthetic */ cr1(PagerTabStrip pagerTabStrip, int i) {
/* 1 */             this.f6891a = i;
/* 3 */             this.f6892b = pagerTabStrip;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             int i = this.f6891a;
/* 3 */             PagerTabStrip pagerTabStrip = this.f6892b;
                    switch (i) {
                        case 0:
/* 20 */                    ViewPager viewPager = pagerTabStrip.f1937a;
/* 28 */                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                            break;
                        default:
/* 8 */                     ViewPager viewPager2 = pagerTabStrip.f1937a;
/* 16 */                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                            break;
                    }
                }
            }
