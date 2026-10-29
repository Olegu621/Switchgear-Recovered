            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.customview.view.AbsSavedState;
            import com.google.android.material.internal.ParcelableSparseArray;
            import com.google.android.material.stateful.ExtendableSavedState;
            
            /* JADX INFO: renamed from: c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public final class C0198c implements Parcelable.ClassLoaderCreator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2646a;

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    switch (this.f2646a) {
                        case 0:
/* 22 */                    if (parcel.readParcelable(classLoader) == null) {
/* 24 */                        return AbsSavedState.f1291b;
                            }
/* 29 */                    f42.m3656l("superState must be null");
/* 32 */                    return null;
                        case 1:
/* 14 */                    return new ExtendableSavedState(parcel, classLoader);
                        default:
/* 8 */                     return new ParcelableSparseArray(parcel, classLoader);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    switch (this.f2646a) {
                        case 0:
/* 12 */                    return new AbsSavedState[i];
                        case 1:
/* 9 */                     return new ExtendableSavedState[i];
                        default:
/* 6 */                     return new ParcelableSparseArray[i];
                    }
                }

                @Override // android.os.Parcelable.Creator
/* 34 */        public final Object createFromParcel(Parcel parcel) {
                    switch (this.f2646a) {
                        case 0:
/* 37 */                    if (parcel.readParcelable(null) == null) {
/* 38 */                        return AbsSavedState.f1291b;
                            }
/* 39 */                    f42.m3656l("superState must be null");
                            return null;
                        case 1:
/* 36 */                    return new ExtendableSavedState(parcel, null);
                        default:
/* 35 */                    return new ParcelableSparseArray(parcel, null);
                    }
                }
            }
