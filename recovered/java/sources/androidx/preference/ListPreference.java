            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import io.sentry.android.core.AbstractC1245n0;
            import okhttp3.HttpUrl;
            import p000.ew1;
            import p000.k50;
            import p000.zb0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 99 */    public class ListPreference extends DialogPreference {

                /* JADX INFO: renamed from: v */
                public final CharSequence[] f1556v;

                /* JADX INFO: renamed from: w */
                public final String f1557w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0116b();

                    /* JADX INFO: renamed from: a */
                    public final String f1558a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 8 */                 this.f1558a = parcel.readString();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeString(this.f1558a);
                    }
                }

                public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPreference, i, 0);
/* 11 */            int i3 = R$styleable.ListPreference_entries;
/* 13 */            int i4 = R$styleable.ListPreference_android_entries;
/* 15 */            CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i3);
/* 25 */            this.f1556v = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i4) : textArray;
/* 27 */            int i5 = R$styleable.ListPreference_entryValues;
/* 29 */            int i6 = R$styleable.ListPreference_android_entryValues;
/* 35 */            if (typedArrayObtainStyledAttributes.getTextArray(i5) == null) {
/* 37 */                typedArrayObtainStyledAttributes.getTextArray(i6);
                    }
/* 40 */            int i7 = R$styleable.ListPreference_useSimpleSummaryProvider;
/* 50 */            if (typedArrayObtainStyledAttributes.getBoolean(i7, typedArrayObtainStyledAttributes.getBoolean(i7, false))) {
/* 54 */                if (zb0.f20058b == null) {
/* 63 */                    zb0.f20058b = new zb0(18);
                        }
/* 67 */                this.f1566i = zb0.f20058b;
/* 69 */                mo759b();
                    }
/* 72 */            typedArrayObtainStyledAttributes.recycle();
/* 77 */            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.Preference, i, 0);
/* 81 */            int i8 = R$styleable.Preference_summary;
/* 83 */            int i9 = R$styleable.Preference_android_summary;
/* 85 */            String string = typedArrayObtainStyledAttributes2.getString(i8);
/* 95 */            this.f1557w = string == null ? typedArrayObtainStyledAttributes2.getString(i9) : string;
/* 97 */            typedArrayObtainStyledAttributes2.recycle();
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: a */
                public final CharSequence mo761a() {
/* 1 */             ew1 ew1Var = this.f1566i;
/* 3 */             if (ew1Var != null) {
/* 5 */                 return ew1Var.mo3406e(this);
                    }
/* 10 */            CharSequence charSequenceMo761a = super.mo761a();
/* 14 */            String str = this.f1557w;
/* 16 */            if (str != null) {
/* 25 */                String str2 = String.format(str, HttpUrl.FRAGMENT_ENCODE_SET);
/* 33 */                if (!TextUtils.equals(str2, charSequenceMo761a)) {
/* 40 */                    AbstractC1245n0.m4889q("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
/* 43 */                    return str2;
                        }
                    }
/* 35 */            return charSequenceMo761a;
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: c */
                public final Object mo760c(TypedArray typedArray, int i) {
/* 1 */             return typedArray.getString(i);
                }

/* 100 */       public ListPreference(Context context, AttributeSet attributeSet, int i) {
/* 101 */           this(context, attributeSet, i, 0);
                }

/* 101 */       public ListPreference(Context context, AttributeSet attributeSet) {
/* 102 */           this(context, attributeSet, k50.m5981r(context, R$attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
                }
            }
