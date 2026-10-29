            package p000;

            import com.google.android.material.tabs.TabLayout;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jm2 implements e43 {

                /* JADX INFO: renamed from: a */
                public final WeakReference f12381a;

                /* JADX INFO: renamed from: b */
                public int f12382b;

                /* JADX INFO: renamed from: c */
                public int f12383c;

                public jm2(TabLayout tabLayout) {
/* 9 */             this.f12381a = new WeakReference(tabLayout);
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: b */
                public final void mo3182b(float f, int i) {
/* 7 */             TabLayout tabLayout = (TabLayout) this.f12381a.get();
/* 9 */             if (tabLayout != null) {
/* 11 */                int i2 = this.f12383c;
/* 33 */                tabLayout.m2391l(i, f, i2 != 2 || this.f12382b == 1, (i2 == 2 && this.f12382b == 0) ? false : true);
                    }
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: c */
                public final void mo3183c(int i) {
/* 3 */             this.f12382b = this.f12383c;
/* 5 */             this.f12383c = i;
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: d */
                public final void mo3184d(int i) {
/* 7 */             TabLayout tabLayout = (TabLayout) this.f12381a.get();
/* 9 */             if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
/* 45 */                return;
                    }
/* 23 */            int i2 = this.f12383c;
/* 42 */            tabLayout.m2389j(tabLayout.m2386g(i), i2 == 0 || (i2 == 2 && this.f12382b == 0));
                }
            }
