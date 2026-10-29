            package androidx.recyclerview.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0140r implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
/* 10 */            savedState.f1714a = parcel.readInt();
/* 16 */            savedState.f1715b = parcel.readInt();
/* 18 */            int i = parcel.readInt();
/* 22 */            savedState.f1716c = i;
/* 24 */            if (i > 0) {
/* 26 */                int[] iArr = new int[i];
/* 28 */                savedState.f1717d = iArr;
/* 30 */                parcel.readIntArray(iArr);
                    }
/* 33 */            int i2 = parcel.readInt();
/* 37 */            savedState.f1718e = i2;
/* 39 */            if (i2 > 0) {
/* 41 */                int[] iArr2 = new int[i2];
/* 43 */                savedState.f1719f = iArr2;
/* 45 */                parcel.readIntArray(iArr2);
                    }
/* 59 */            savedState.f1721v = parcel.readInt() == 1;
/* 70 */            savedState.f1722w = parcel.readInt() == 1;
/* 79 */            savedState.f1713U = parcel.readInt() == 1;
/* 91 */            savedState.f1720i = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
/* 93 */            return savedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new StaggeredGridLayoutManager.SavedState[i];
                }
            }
