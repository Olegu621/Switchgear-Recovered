            package androidx.slidingpanelayout.widget;

            import android.view.View;
            import android.view.ViewGroup;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import p000.fm0;
            import p000.hu0;
            
            /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0142a extends hu0 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ SlidingPaneLayout f1835e;

                public C0142a(SlidingPaneLayout slidingPaneLayout) {
/* 4 */             this.f1835e = slidingPaneLayout;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: G0 */
                public final boolean mo621G0(int i, View view) {
/* 5 */             if (m1051M0()) {
/* 15 */                return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f1831b;
                    }
/* 7 */             return false;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: M */
                public final int mo622M(int i, View view) {
/* 1 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 9 */             SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f1819f.getLayoutParams();
/* 15 */            if (!slidingPaneLayout.m1046b()) {
/* 55 */                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
/* 63 */                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.f1828w + paddingLeft);
                    }
/* 35 */            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f1819f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
/* 44 */            return Math.max(Math.min(i, width), width - slidingPaneLayout.f1828w);
                }

                /* JADX INFO: renamed from: M0 */
                public final boolean m1051M0() {
/* 1 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 5 */             if (slidingPaneLayout.f1806U || slidingPaneLayout.getLockMode() == 3) {
/* 43 */                return false;
                    }
/* 21 */            if (slidingPaneLayout.m1047c() && slidingPaneLayout.getLockMode() == 1) {
/* 43 */                return false;
                    }
                    return slidingPaneLayout.m1047c() || slidingPaneLayout.getLockMode() != 2;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: N */
                public final int mo623N(int i, View view) {
/* 1 */             return view.getTop();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: i0 */
                public final int mo624i0(View view) {
/* 3 */             return this.f1835e.f1828w;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: s0 */
                public final void mo625s0(int i, int i2) {
/* 5 */             if (m1051M0()) {
/* 8 */                 SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 14 */                slidingPaneLayout.f1814c0.m5672c(i2, slidingPaneLayout.f1819f);
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: t0 */
                public final void mo626t0(int i) {
/* 5 */             if (m1051M0()) {
/* 8 */                 SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 14 */                slidingPaneLayout.f1814c0.m5672c(i, slidingPaneLayout.f1819f);
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: u0 */
                public final void mo627u0(int i, View view) {
/* 1 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 3 */             int childCount = slidingPaneLayout.getChildCount();
/* 9 */             for (int i2 = 0; i2 < childCount; i2++) {
/* 11 */                View childAt = slidingPaneLayout.getChildAt(i2);
/* 20 */                if (childAt.getVisibility() == 4) {
/* 22 */                    childAt.setVisibility(0);
                        }
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: v0 */
                public final void mo628v0(int i) {
/* 1 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 3 */             CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f1812b0;
/* 9 */             if (slidingPaneLayout.f1814c0.f12040a == 0) {
/* 11 */                float f = slidingPaneLayout.f1823i;
/* 17 */                View view = slidingPaneLayout.f1819f;
/* 21 */                if (f != 1.0f) {
/* 48 */                    Iterator it = copyOnWriteArrayList.iterator();
/* 56 */                    if (it.hasNext()) {
/* 69 */                        throw fm0.m3780f(it);
                            }
/* 58 */                    slidingPaneLayout.sendAccessibilityEvent(32);
/* 62 */                    slidingPaneLayout.f1816d0 = true;
/* 64 */                    return;
                        }
/* 23 */                slidingPaneLayout.m1050f(view);
/* 26 */                Iterator it2 = copyOnWriteArrayList.iterator();
/* 34 */                if (it2.hasNext()) {
/* 47 */                    throw fm0.m3780f(it2);
                        }
/* 36 */                slidingPaneLayout.sendAccessibilityEvent(32);
/* 40 */                slidingPaneLayout.f1816d0 = false;
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: w0 */
                public final void mo629w0(View view, int i, int i2) {
/* 1 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 5 */             if (slidingPaneLayout.f1819f == null) {
/* 8 */                 slidingPaneLayout.f1823i = 0.0f;
                    } else {
/* 11 */                boolean zM1046b = slidingPaneLayout.m1046b();
/* 21 */                SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f1819f.getLayoutParams();
/* 25 */                int width = slidingPaneLayout.f1819f.getWidth();
/* 29 */                if (zM1046b) {
/* 36 */                    i = (slidingPaneLayout.getWidth() - i) - width;
                        }
/* 62 */                float paddingRight = (i - ((zM1046b ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zM1046b ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f1828w;
/* 63 */                slidingPaneLayout.f1823i = paddingRight;
/* 67 */                if (slidingPaneLayout.f1807V != 0) {
/* 69 */                    slidingPaneLayout.m1048d(paddingRight);
                        }
/* 74 */                Iterator it = slidingPaneLayout.f1812b0.iterator();
/* 82 */                if (it.hasNext()) {
/* 92 */                    throw fm0.m3780f(it);
                        }
                    }
/* 84 */            slidingPaneLayout.invalidate();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: x0 */
                public final void mo630x0(View view, float f, float f2) {
                    int paddingLeft;
/* 5 */             SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
/* 7 */             SlidingPaneLayout slidingPaneLayout = this.f1835e;
/* 16 */            if (slidingPaneLayout.m1046b()) {
/* 24 */                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 27 */                if (f < 0.0f || (f == 0.0f && slidingPaneLayout.f1823i > 0.5f)) {
/* 41 */                    paddingRight += slidingPaneLayout.f1828w;
                        }
/* 53 */                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f1819f.getWidth();
                    } else {
/* 61 */                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
/* 64 */                if (f > 0.0f || (f == 0.0f && slidingPaneLayout.f1823i > 0.5f)) {
/* 76 */                    paddingLeft += slidingPaneLayout.f1828w;
                        }
                    }
/* 83 */            slidingPaneLayout.f1814c0.m5687s(paddingLeft, view.getTop());
/* 86 */            slidingPaneLayout.invalidate();
                }
            }
