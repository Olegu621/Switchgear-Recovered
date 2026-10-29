            package com.google.android.material.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import p000.C0198c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
                public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new C0198c(2);

                public ParcelableSparseArray(Parcel parcel, ClassLoader classLoader) {
/* 4 */             int i = parcel.readInt();
/* 8 */             int[] iArr = new int[i];
/* 10 */            parcel.readIntArray(iArr);
/* 13 */            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
/* 18 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                put(iArr[i2], parcelableArray[i2]);
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int size = size();
/* 5 */             int[] iArr = new int[size];
/* 7 */             Parcelable[] parcelableArr = new Parcelable[size];
/* 10 */            for (int i2 = 0; i2 < size; i2++) {
/* 16 */                iArr[i2] = keyAt(i2);
/* 24 */                parcelableArr[i2] = valueAt(i2);
                    }
/* 29 */            parcel.writeInt(size);
/* 32 */            parcel.writeIntArray(iArr);
/* 35 */            parcel.writeParcelableArray(parcelableArr, i);
                }
            }
