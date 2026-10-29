            package com.google.android.material.navigation;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.customview.view.AbsSavedState;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class NavigationBarView$SavedState extends AbsSavedState {
                public static final Parcelable.Creator<NavigationBarView$SavedState> CREATOR = new C0367c();

                /* JADX INFO: renamed from: c */
                public Bundle f4814c;

                public NavigationBarView$SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */             super(parcel, classLoader);
/* 18 */            this.f4814c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
                }

                @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 6 */             parcel.writeBundle(this.f4814c);
                }
            }
