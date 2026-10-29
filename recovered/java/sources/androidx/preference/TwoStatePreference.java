            package androidx.preference;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public abstract class TwoStatePreference extends Preference {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0121g();

                    /* JADX INFO: renamed from: a */
                    public final boolean f1573a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 13 */                this.f1573a = parcel.readInt() == 1;
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1573a ? 1 : 0);
                    }
                }

                public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: c */
                public final Object mo760c(TypedArray typedArray, int i) {
/* 6 */             return Boolean.valueOf(typedArray.getBoolean(i, false));
                }

/* 5 */         public TwoStatePreference(Context context, AttributeSet attributeSet) {
/* 6 */             this(context, attributeSet, 0);
                }
            }
