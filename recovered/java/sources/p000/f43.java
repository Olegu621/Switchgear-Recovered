            package p000;

            import androidx.viewpager2.widget.ViewPager2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f43 extends j12 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7994a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f7995b;

                public /* synthetic */ f43(Object obj, int i) {
/* 1 */             this.f7994a = i;
/* 3 */             this.f7995b = obj;
                }

                @Override // p000.j12
                /* JADX INFO: renamed from: a */
                public final void mo1015a() {
/* 1 */             int i = this.f7994a;
/* 3 */             Object obj = this.f7995b;
                    switch (i) {
                        case 0:
/* 14 */                    ViewPager2 viewPager2 = (ViewPager2) obj;
/* 17 */                    viewPager2.f2018e = true;
/* 21 */                    viewPager2.f2009W.f7053l = true;
                            break;
                        default:
/* 10 */                    ((ra2) obj).m8118w();
                            break;
                    }
                }

                @Override // p000.j12
                /* JADX INFO: renamed from: b */
                public final void mo1016b(int i) {
/* 1 */             mo1015a();
                }
            }
