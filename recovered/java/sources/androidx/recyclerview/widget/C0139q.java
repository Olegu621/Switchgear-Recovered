            package androidx.recyclerview.widget;

            import java.util.ArrayList;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0139q {

                /* JADX INFO: renamed from: a */
                public int[] f1797a;

                /* JADX INFO: renamed from: b */
                public ArrayList f1798b;

                /* JADX INFO: renamed from: a */
                public final void m1033a() {
/* 1 */             int[] iArr = this.f1797a;
/* 3 */             if (iArr != null) {
/* 6 */                 Arrays.fill(iArr, -1);
                    }
/* 10 */            this.f1798b = null;
                }

                /* JADX INFO: renamed from: b */
                public final void m1034b(int i) {
/* 1 */             int[] iArr = this.f1797a;
/* 4 */             if (iArr == null) {
/* 14 */                int[] iArr2 = new int[Math.max(i, 10) + 1];
/* 16 */                this.f1797a = iArr2;
/* 18 */                Arrays.fill(iArr2, -1);
                    } else if (i >= iArr.length) {
/* 25 */                int length = iArr.length;
/* 26 */                while (length <= i) {
/* 28 */                    length *= 2;
                        }
/* 31 */                int[] iArr3 = new int[length];
/* 33 */                this.f1797a = iArr3;
/* 37 */                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
/* 40 */                int[] iArr4 = this.f1797a;
/* 44 */                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m1035c(int i, int i2) {
/* 1 */             int[] iArr = this.f1797a;
/* 3 */             if (iArr == null || i >= iArr.length) {
/* 60 */                return;
                    }
/* 9 */             int i3 = i + i2;
/* 11 */            m1034b(i3);
/* 14 */            int[] iArr2 = this.f1797a;
/* 19 */            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
/* 25 */            Arrays.fill(this.f1797a, i, i3, -1);
/* 28 */            ArrayList arrayList = this.f1798b;
/* 30 */            if (arrayList == null) {
/* 60 */                return;
                    }
/* 39 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 47 */                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f1798b.get(size);
/* 49 */                int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a;
/* 51 */                if (i4 >= i) {
/* 55 */                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a = i4 + i2;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m1036d(int i, int i2) {
/* 1 */             int[] iArr = this.f1797a;
/* 3 */             if (iArr == null || i >= iArr.length) {
/* 71 */                return;
                    }
/* 9 */             int i3 = i + i2;
/* 11 */            m1034b(i3);
/* 14 */            int[] iArr2 = this.f1797a;
/* 19 */            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
/* 22 */            int[] iArr3 = this.f1797a;
/* 28 */            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
/* 31 */            ArrayList arrayList = this.f1798b;
/* 33 */            if (arrayList == null) {
/* 71 */                return;
                    }
/* 42 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 50 */                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f1798b.get(size);
/* 52 */                int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a;
/* 54 */                if (i4 >= i) {
/* 57 */                    if (i4 < i3) {
/* 61 */                        this.f1798b.remove(size);
                            } else {
/* 66 */                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a = i4 - i2;
                            }
                        }
                    }
                }
            }
