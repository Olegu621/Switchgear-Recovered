            package com.google.android.material.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.SparseIntArray;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
                public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new qd3(9);

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 5 */             int[] iArr = new int[size()];
/* 11 */            int[] iArr2 = new int[size()];
/* 18 */            for (int i2 = 0; i2 < size(); i2++) {
/* 24 */                iArr[i2] = keyAt(i2);
/* 30 */                iArr2[i2] = valueAt(i2);
                    }
/* 39 */            parcel.writeInt(size());
/* 42 */            parcel.writeIntArray(iArr);
/* 45 */            parcel.writeIntArray(iArr2);
                }
            }
