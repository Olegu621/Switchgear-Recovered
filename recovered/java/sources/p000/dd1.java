            package p000;

            import androidx.fragment.app.Fragment;
            import com.google.android.material.datepicker.C0356m;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dd1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7124a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Fragment f7125b;

                public /* synthetic */ dd1(Fragment fragment, int i) {
/* 1 */             this.f7124a = i;
/* 3 */             this.f7125b = fragment;
                }

                /* JADX INFO: renamed from: a */
                public final void m3003a() {
/* 1 */             int i = this.f7124a;
/* 3 */             Fragment fragment = this.f7125b;
                    switch (i) {
                        case 0:
/* 38 */                    ((C0356m) fragment).f4687v0.setEnabled(false);
                            break;
                        default:
/* 12 */                    Iterator it = ((gd1) fragment).f20305a.iterator();
/* 20 */                    while (it.hasNext()) {
/* 28 */                        ((dd1) it.next()).m3003a();
                            }
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3004b(Object obj) {
/* 1 */             int i = this.f7124a;
/* 3 */             Fragment fragment = this.f7125b;
                    switch (i) {
                        case 0:
/* 33 */                    C0356m c0356m = (C0356m) fragment;
/* 35 */                    c0356m.m2318m();
/* 48 */                    c0356m.f4687v0.setEnabled(c0356m.m2316i().mo2290J0());
                            break;
                        default:
/* 12 */                    Iterator it = ((gd1) fragment).f20305a.iterator();
/* 20 */                    while (it.hasNext()) {
/* 28 */                        ((dd1) it.next()).m3004b(obj);
                            }
                            break;
                    }
                }
            }
