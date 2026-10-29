            package androidx.recyclerview.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0125c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             LinearLayoutManager.SavedState savedState = new LinearLayoutManager.SavedState();
/* 10 */            savedState.f1601a = parcel.readInt();
/* 16 */            savedState.f1602b = parcel.readInt();
/* 27 */            savedState.f1603c = parcel.readInt() == 1;
/* 29 */            return savedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new LinearLayoutManager.SavedState[i];
                }
            }
