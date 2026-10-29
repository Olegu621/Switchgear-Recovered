            package androidx.drawerlayout.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.drawerlayout.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class C0084a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 4 */             return new DrawerLayout.SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new DrawerLayout.SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
/* 7 */         public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
/* 8 */             return new DrawerLayout.SavedState(parcel, classLoader);
                }
            }
