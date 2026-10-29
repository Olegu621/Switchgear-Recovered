            package com.google.android.flexbox;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: com.google.android.flexbox.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0316e implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             FlexboxLayoutManager.SavedState savedState = new FlexboxLayoutManager.SavedState();
/* 10 */            savedState.f3188a = parcel.readInt();
/* 16 */            savedState.f3189b = parcel.readInt();
/* 18 */            return savedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new FlexboxLayoutManager.SavedState[i];
                }
            }
