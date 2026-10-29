            package androidx.recyclerview.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0138p implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
/* 10 */            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a = parcel.readInt();
/* 16 */            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1710b = parcel.readInt();
/* 27 */            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1712d = parcel.readInt() == 1;
/* 29 */            int i = parcel.readInt();
/* 33 */            if (i > 0) {
/* 35 */                int[] iArr = new int[i];
/* 37 */                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1711c = iArr;
/* 39 */                parcel.readIntArray(iArr);
                    }
/* 42 */            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
                }
            }
