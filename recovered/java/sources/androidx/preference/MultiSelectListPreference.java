            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import java.util.Collections;
            import java.util.HashSet;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 44 */    public class MultiSelectListPreference extends DialogPreference {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0117c();

                    /* JADX INFO: renamed from: a */
                    public final HashSet f1559a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 4 */                 int i = parcel.readInt();
/* 10 */                HashSet hashSet = new HashSet();
/* 13 */                this.f1559a = hashSet;
/* 15 */                String[] strArr = new String[i];
/* 17 */                parcel.readStringArray(strArr);
/* 20 */                Collections.addAll(hashSet, strArr);
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 4 */                 HashSet hashSet = this.f1559a;
/* 10 */                parcel.writeInt(hashSet.size());
/* 25 */                parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
                    }
                }

                public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             new HashSet();
/* 12 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiSelectListPreference, i, 0);
/* 16 */            int i2 = R$styleable.MultiSelectListPreference_entries;
/* 18 */            int i3 = R$styleable.MultiSelectListPreference_android_entries;
/* 24 */            if (typedArrayObtainStyledAttributes.getTextArray(i2) == null) {
/* 26 */                typedArrayObtainStyledAttributes.getTextArray(i3);
                    }
/* 29 */            int i4 = R$styleable.MultiSelectListPreference_entryValues;
/* 31 */            int i5 = R$styleable.MultiSelectListPreference_android_entryValues;
/* 37 */            if (typedArrayObtainStyledAttributes.getTextArray(i4) == null) {
/* 39 */                typedArrayObtainStyledAttributes.getTextArray(i5);
                    }
/* 42 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: c */
                public final Object mo760c(TypedArray typedArray, int i) {
/* 1 */             CharSequence[] textArray = typedArray.getTextArray(i);
/* 7 */             HashSet hashSet = new HashSet();
/* 12 */            for (CharSequence charSequence : textArray) {
/* 20 */                hashSet.add(charSequence.toString());
                    }
/* 26 */            return hashSet;
                }

/* 45 */        public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
/* 46 */            this(context, attributeSet, k50.m5981r(context, R$attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
                }
            }
