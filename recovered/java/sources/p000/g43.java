            package p000;

            import androidx.viewpager2.widget.ViewPager2;
            import java.util.ArrayList;
            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class g43 extends j43 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8470a;

                /* JADX INFO: renamed from: b */
                public final Object f8471b;

                public g43() {
/* 2 */             this.f8470a = 2;
/* 13 */            this.f8471b = new ArrayList(3);
                }

                @Override // p000.j43
                /* JADX INFO: renamed from: a */
                public void mo3871a(int i) {
/* 1 */             int i2 = this.f8470a;
/* 3 */             Object obj = this.f8471b;
                    switch (i2) {
                        case 0:
/* 41 */                    if (i == 0) {
/* 45 */                        ((ViewPager2) obj).m1143d();
/* 48 */                        return;
                            }
/* 48 */                    return;
                        case 1:
                        default:
/* 8 */                     return;
                        case 2:
                            try {
/* 11 */                        Iterator it = ((ArrayList) obj).iterator();
/* 19 */                        while (it.hasNext()) {
/* 27 */                            ((j43) it.next()).mo3871a(i);
                                }
/* 31 */                        return;
                            } catch (ConcurrentModificationException e) {
/* 40 */                        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                            }
                    }
                }

                @Override // p000.j43
                /* JADX INFO: renamed from: b */
                public void mo3872b(int i, float f, int i2) {
                    switch (this.f8470a) {
                        case 2:
                            try {
/* 11 */                        Iterator it = ((ArrayList) this.f8471b).iterator();
/* 19 */                        while (it.hasNext()) {
/* 27 */                            ((j43) it.next()).mo3872b(i, f, i2);
                                }
/* 31 */                        return;
                            } catch (ConcurrentModificationException e) {
/* 40 */                        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                            }
                        default:
/* 6 */                     return;
                    }
                }

                @Override // p000.j43
                /* JADX INFO: renamed from: c */
                public final void mo3873c(int i) {
/* 1 */             int i2 = this.f8470a;
/* 3 */             Object obj = this.f8471b;
                    switch (i2) {
                        case 0:
/* 58 */                    ViewPager2 viewPager2 = (ViewPager2) obj;
/* 62 */                    if (viewPager2.f2016d != i) {
/* 64 */                        viewPager2.f2016d = i;
/* 68 */                        viewPager2.f2023h0.m8118w();
/* 71 */                        return;
                            }
/* 71 */                    return;
                        case 1:
/* 40 */                    ViewPager2 viewPager3 = (ViewPager2) obj;
/* 42 */                    viewPager3.clearFocus();
/* 49 */                    if (viewPager3.hasFocus()) {
/* 54 */                        viewPager3.f2007U.requestFocus(2);
/* 57 */                        return;
                            }
/* 57 */                    return;
                        default:
                            try {
/* 10 */                        Iterator it = ((ArrayList) obj).iterator();
/* 18 */                        while (it.hasNext()) {
/* 26 */                            ((j43) it.next()).mo3873c(i);
                                }
/* 30 */                        return;
                            } catch (ConcurrentModificationException e) {
/* 39 */                        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                            }
                    }
                }

/* 15 */        public /* synthetic */ g43(ViewPager2 viewPager2, int i) {
/* 16 */            this.f8470a = i;
                    this.f8471b = viewPager2;
                }
            }
