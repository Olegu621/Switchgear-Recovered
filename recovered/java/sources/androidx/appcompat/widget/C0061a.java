            package androidx.appcompat.widget;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0061a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
/* 10 */            actionMenuPresenter$SavedState.f456a = parcel.readInt();
/* 12 */            return actionMenuPresenter$SavedState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new ActionMenuPresenter$SavedState[i];
                }
            }
