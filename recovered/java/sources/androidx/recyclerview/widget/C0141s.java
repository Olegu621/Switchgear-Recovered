            package androidx.recyclerview.widget;

            import android.view.View;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0141s {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1799a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public int f1800b = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: c */
                public int f1801c = Integer.MIN_VALUE;

                /* JADX INFO: renamed from: d */
                public int f1802d = 0;

                /* JADX INFO: renamed from: e */
                public final int f1803e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ StaggeredGridLayoutManager f1804f;

                public C0141s(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
/* 4 */             this.f1804f = staggeredGridLayoutManager;
/* 22 */            this.f1803e = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m1037a() {
/* 1 */             ArrayList arrayList = this.f1799a;
/* 13 */            View view = (View) arrayList.get(arrayList.size() - 1);
/* 19 */            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
/* 29 */            this.f1801c = this.f1804f.f1688c0.mo941b(view);
/* 31 */            layoutParams.getClass();
                }

                /* JADX INFO: renamed from: b */
                public final void m1038b() {
/* 3 */             this.f1799a.clear();
/* 8 */             this.f1800b = Integer.MIN_VALUE;
/* 10 */            this.f1801c = Integer.MIN_VALUE;
/* 13 */            this.f1802d = 0;
                }

                /* JADX INFO: renamed from: c */
                public final int m1039c() {
/* 3 */             boolean z = this.f1804f.f1693h0;
/* 5 */             ArrayList arrayList = this.f1799a;
                    return z ? m1041e(arrayList.size() - 1, -1) : m1041e(0, arrayList.size());
                }

                /* JADX INFO: renamed from: d */
                public final int m1040d() {
/* 3 */             boolean z = this.f1804f.f1693h0;
/* 5 */             ArrayList arrayList = this.f1799a;
                    return z ? m1041e(0, arrayList.size()) : m1041e(arrayList.size() - 1, -1);
                }

                /* JADX INFO: renamed from: e */
                public final int m1041e(int i, int i2) {
/* 1 */             StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1804f;
/* 5 */             int iMo950k = staggeredGridLayoutManager.f1688c0.mo950k();
/* 11 */            int iMo946g = staggeredGridLayoutManager.f1688c0.mo946g();
/* 21 */            int i3 = i2 > i ? 1 : -1;
/* 22 */            while (i != i2) {
/* 30 */                View view = (View) this.f1799a.get(i);
/* 34 */                int iMo944e = staggeredGridLayoutManager.f1688c0.mo944e(view);
/* 40 */                int iMo941b = staggeredGridLayoutManager.f1688c0.mo941b(view);
/* 49 */                boolean z = iMo944e <= iMo946g;
/* 50 */                boolean z2 = iMo941b >= iMo950k;
/* 53 */                if (z && z2 && (iMo944e < iMo950k || iMo941b > iMo946g)) {
/* 61 */                    return AbstractC0133k.m974O(view);
                        }
/* 66 */                i += i3;
                    }
/* 15 */            return -1;
                }

                /* JADX INFO: renamed from: f */
                public final int m1042f(int i) {
/* 1 */             int i2 = this.f1801c;
/* 5 */             if (i2 != Integer.MIN_VALUE) {
/* 7 */                 return i2;
                    }
/* 14 */            if (this.f1799a.size() == 0) {
/* 16 */                return i;
                    }
/* 17 */            m1037a();
/* 20 */            return this.f1801c;
                }

                /* JADX INFO: renamed from: g */
                public final View m1043g(int i, int i2) {
/* 1 */             StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1804f;
/* 3 */             View view = null;
/* 5 */             ArrayList arrayList = this.f1799a;
/* 7 */             if (i2 != -1) {
/* 58 */                int size = arrayList.size() - 1;
/* 60 */                while (size >= 0) {
/* 66 */                    View view2 = (View) arrayList.get(size);
/* 70 */                    if ((staggeredGridLayoutManager.f1693h0 && AbstractC0133k.m974O(view2) >= i) || ((!staggeredGridLayoutManager.f1693h0 && AbstractC0133k.m974O(view2) <= i) || !view2.hasFocusable())) {
                                break;
                            }
/* 95 */                    size--;
/* 97 */                    view = view2;
                        }
/* 99 */                return view;
                    }
/* 9 */             int size2 = arrayList.size();
/* 13 */            int i3 = 0;
/* 14 */            while (i3 < size2) {
/* 20 */                View view3 = (View) arrayList.get(i3);
/* 24 */                if ((staggeredGridLayoutManager.f1693h0 && AbstractC0133k.m974O(view3) <= i) || ((!staggeredGridLayoutManager.f1693h0 && AbstractC0133k.m974O(view3) >= i) || !view3.hasFocusable())) {
                            break;
                        }
/* 49 */                i3++;
/* 51 */                view = view3;
                    }
/* 53 */            return view;
                }

                /* JADX INFO: renamed from: h */
                public final int m1044h(int i) {
/* 1 */             int i2 = this.f1800b;
/* 5 */             if (i2 != Integer.MIN_VALUE) {
/* 7 */                 return i2;
                    }
/* 8 */             ArrayList arrayList = this.f1799a;
/* 14 */            if (arrayList.size() == 0) {
/* 16 */                return i;
                    }
/* 22 */            View view = (View) arrayList.get(0);
/* 28 */            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
/* 38 */            this.f1800b = this.f1804f.f1688c0.mo944e(view);
/* 40 */            layoutParams.getClass();
/* 43 */            return this.f1800b;
                }
            }
