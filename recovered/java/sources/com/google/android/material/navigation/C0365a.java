            package com.google.android.material.navigation;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.material.internal.ParcelableSparseArray;
            
            /* JADX INFO: renamed from: com.google.android.material.navigation.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0365a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
/* 10 */            navigationBarPresenter$SavedState.f4812a = parcel.readInt();
/* 24 */            navigationBarPresenter$SavedState.f4813b = (ParcelableSparseArray) parcel.readParcelable(NavigationBarPresenter$SavedState.class.getClassLoader());
/* 26 */            return navigationBarPresenter$SavedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new NavigationBarPresenter$SavedState[i];
                }
            }
