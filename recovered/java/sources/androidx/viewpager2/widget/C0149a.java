            package androidx.viewpager2.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.viewpager2.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class C0149a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 4 */             ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, null);
/* 11 */            savedState.f2027a = parcel.readInt();
/* 17 */            savedState.f2028b = parcel.readInt();
/* 23 */            savedState.f2029c = parcel.readParcelable(null);
/* 25 */            return savedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new ViewPager2.SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
/* 25 */        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
/* 27 */            ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
/* 28 */            savedState.f2027a = parcel.readInt();
/* 29 */            savedState.f2028b = parcel.readInt();
/* 30 */            savedState.f2029c = parcel.readParcelable(classLoader);
                    return savedState;
                }
            }
