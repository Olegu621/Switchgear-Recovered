            package androidx.appcompat.app;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
                public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new C0060a();

                /* JADX INFO: renamed from: a */
                public int f362a;

                /* JADX INFO: renamed from: b */
                public boolean f363b;

                /* JADX INFO: renamed from: c */
                public Bundle f364c;

                /* JADX INFO: renamed from: a */
                public static AppCompatDelegateImpl$PanelFeatureState$SavedState m324a(Parcel parcel, ClassLoader classLoader) {
/* 3 */             AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
/* 10 */            appCompatDelegateImpl$PanelFeatureState$SavedState.f362a = parcel.readInt();
/* 17 */            boolean z = parcel.readInt() == 1;
/* 21 */            appCompatDelegateImpl$PanelFeatureState$SavedState.f363b = z;
/* 23 */            if (z) {
/* 29 */                appCompatDelegateImpl$PanelFeatureState$SavedState.f364c = parcel.readBundle(classLoader);
                    }
/* 31 */            return appCompatDelegateImpl$PanelFeatureState$SavedState;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f362a);
/* 8 */             parcel.writeInt(this.f363b ? 1 : 0);
/* 13 */            if (this.f363b) {
/* 17 */                parcel.writeBundle(this.f364c);
                    }
                }
            }
