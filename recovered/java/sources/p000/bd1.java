            package p000;

            import android.view.View;
            import com.google.android.material.datepicker.C0356m;
            import io.sentry.C1697u2;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bd1 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2375a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0356m f2376b;

                public /* synthetic */ bd1(C0356m c0356m, int i) {
/* 1 */             this.f2375a = i;
/* 3 */             this.f2376b = c0356m;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             int i = this.f2375a;
/* 4 */             C0356m c0356m = this.f2376b;
                    switch (i) {
                        case 0:
/* 64 */                    Iterator it = c0356m.f4667b0.iterator();
/* 72 */                    if (!it.hasNext()) {
/* 74 */                        c0356m.m666g(false, false);
/* 87 */                        return;
                            } else if (it.next() != null) {
/* 84 */                        C1697u2.m5431g();
/* 87 */                        return;
                            } else {
/* 92 */                        c0356m.m2316i().getClass();
/* 96 */                        throw null;
                            }
                        case 1:
/* 38 */                    Iterator it2 = c0356m.f4668c0.iterator();
/* 46 */                    while (it2.hasNext()) {
/* 54 */                        ((View.OnClickListener) it2.next()).onClick(view);
                            }
/* 58 */                    c0356m.m666g(false, false);
/* 61 */                    return;
                        default:
/* 19 */                    c0356m.f4687v0.setEnabled(c0356m.m2316i().mo2290J0());
/* 24 */                    c0356m.f4685t0.toggle();
/* 29 */                    c0356m.m2319n(c0356m.f4685t0);
/* 32 */                    c0356m.m2317l();
/* 35 */                    return;
                    }
                }
            }
