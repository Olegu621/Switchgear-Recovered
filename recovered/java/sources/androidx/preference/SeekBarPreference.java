            package androidx.preference;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 75 */    public class SeekBarPreference extends Preference {

                /* JADX INFO: renamed from: v */
                public final int f1568v;

                /* JADX INFO: renamed from: w */
                public final int f1569w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0120f();

                    /* JADX INFO: renamed from: a */
                    public final int f1570a;

                    /* JADX INFO: renamed from: b */
                    public final int f1571b;

                    /* JADX INFO: renamed from: c */
                    public final int f1572c;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 8 */                 this.f1570a = parcel.readInt();
/* 14 */                this.f1571b = parcel.readInt();
/* 20 */                this.f1572c = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1570a);
/* 11 */                parcel.writeInt(this.f1571b);
/* 16 */                parcel.writeInt(this.f1572c);
                    }
                }

                public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SeekBarPreference, i, 0);
/* 13 */            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.SeekBarPreference_min, 0);
/* 21 */            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.SeekBarPreference_android_max, 100);
/* 25 */            i3 = i3 < i2 ? i2 : i3;
/* 30 */            if (i3 != this.f1568v) {
/* 32 */                this.f1568v = i3;
                    }
/* 36 */            int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.SeekBarPreference_seekBarIncrement, 0);
/* 42 */            if (i4 != this.f1569w) {
/* 55 */                this.f1569w = Math.min(this.f1568v - i2, Math.abs(i4));
                    }
/* 60 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_adjustable, true);
/* 65 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_showSeekBarValue, false);
/* 70 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_updatesContinuously, false);
/* 73 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: c */
                public final Object mo760c(TypedArray typedArray, int i) {
/* 6 */             return Integer.valueOf(typedArray.getInt(i, 0));
                }

/* 76 */        public SeekBarPreference(Context context, AttributeSet attributeSet) {
/* 77 */            this(context, attributeSet, R$attr.seekBarPreferenceStyle);
                }
            }
