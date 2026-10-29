            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.AbsSavedState;
            import p000.AbstractC0208c9;
            import p000.ew1;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 288 */   public class Preference implements Comparable<Preference> {

                /* JADX INFO: renamed from: a */
                public final Context f1560a;

                /* JADX INFO: renamed from: b */
                public final int f1561b;

                /* JADX INFO: renamed from: c */
                public final CharSequence f1562c;

                /* JADX INFO: renamed from: d */
                public final CharSequence f1563d;

                /* JADX INFO: renamed from: e */
                public final String f1564e;

                /* JADX INFO: renamed from: f */
                public final Object f1565f;

                /* JADX INFO: renamed from: i */
                public ew1 f1566i;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class BaseSavedState extends AbsSavedState {
                    public static final Parcelable.Creator<BaseSavedState> CREATOR = new C0118d();

                    public BaseSavedState(Parcel parcel) {
/* 1 */                 super(parcel);
                    }
                }

                public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
/* 7 */             this.f1561b = AbstractC0208c9.API_PRIORITY_OTHER;
/* 9 */             this.f1560a = context;
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Preference, i, 0);
/* 26 */            typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_icon, typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_android_icon, 0));
/* 29 */            int i3 = R$styleable.Preference_key;
/* 31 */            int i4 = R$styleable.Preference_android_key;
/* 33 */            String string = typedArrayObtainStyledAttributes.getString(i3);
/* 43 */            this.f1564e = string == null ? typedArrayObtainStyledAttributes.getString(i4) : string;
/* 45 */            int i5 = R$styleable.Preference_title;
/* 47 */            int i6 = R$styleable.Preference_android_title;
/* 49 */            CharSequence text = typedArrayObtainStyledAttributes.getText(i5);
/* 59 */            this.f1562c = text == null ? typedArrayObtainStyledAttributes.getText(i6) : text;
/* 61 */            int i7 = R$styleable.Preference_summary;
/* 63 */            int i8 = R$styleable.Preference_android_summary;
/* 65 */            CharSequence text2 = typedArrayObtainStyledAttributes.getText(i7);
/* 75 */            this.f1563d = text2 == null ? typedArrayObtainStyledAttributes.getText(i8) : text2;
/* 89 */            this.f1561b = typedArrayObtainStyledAttributes.getInt(R$styleable.Preference_order, typedArrayObtainStyledAttributes.getInt(R$styleable.Preference_android_order, AbstractC0208c9.API_PRIORITY_OTHER));
/* 91 */            int i9 = R$styleable.Preference_fragment;
/* 93 */            int i10 = R$styleable.Preference_android_fragment;
/* 99 */            if (typedArrayObtainStyledAttributes.getString(i9) == null) {
/* 101 */               typedArrayObtainStyledAttributes.getString(i10);
                    }
/* 114 */           typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_layout, typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_android_layout, R$layout.preference));
/* 125 */           typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_widgetLayout, typedArrayObtainStyledAttributes.getResourceId(R$styleable.Preference_android_widgetLayout, 0));
/* 137 */           typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_enabled, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_enabled, true));
/* 148 */           boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_selectable, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_selectable, true));
/* 160 */           typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_persistent, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_persistent, true));
/* 163 */           int i11 = R$styleable.Preference_dependency;
/* 165 */           int i12 = R$styleable.Preference_android_dependency;
/* 171 */           if (typedArrayObtainStyledAttributes.getString(i11) == null) {
/* 173 */               typedArrayObtainStyledAttributes.getString(i12);
                    }
/* 176 */           int i13 = R$styleable.Preference_allowDividerAbove;
/* 182 */           typedArrayObtainStyledAttributes.getBoolean(i13, typedArrayObtainStyledAttributes.getBoolean(i13, z));
/* 185 */           int i14 = R$styleable.Preference_allowDividerBelow;
/* 191 */           typedArrayObtainStyledAttributes.getBoolean(i14, typedArrayObtainStyledAttributes.getBoolean(i14, z));
/* 200 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Preference_defaultValue)) {
/* 208 */               this.f1565f = mo760c(typedArrayObtainStyledAttributes, R$styleable.Preference_defaultValue);
                    } else if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Preference_android_defaultValue)) {
/* 225 */               this.f1565f = mo760c(typedArrayObtainStyledAttributes, R$styleable.Preference_android_defaultValue);
                    }
/* 235 */           typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_shouldDisableView, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_shouldDisableView, true));
/* 244 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Preference_singleLineTitle)) {
/* 254 */               typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_singleLineTitle, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_singleLineTitle, true));
                    }
/* 265 */           typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_iconSpaceReserved, typedArrayObtainStyledAttributes.getBoolean(R$styleable.Preference_android_iconSpaceReserved, false));
/* 268 */           int i15 = R$styleable.Preference_isPreferenceVisible;
/* 274 */           typedArrayObtainStyledAttributes.getBoolean(i15, typedArrayObtainStyledAttributes.getBoolean(i15, true));
/* 277 */           int i16 = R$styleable.Preference_enableCopying;
/* 283 */           typedArrayObtainStyledAttributes.getBoolean(i16, typedArrayObtainStyledAttributes.getBoolean(i16, false));
/* 286 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public CharSequence mo761a() {
/* 1 */             ew1 ew1Var = this.f1566i;
                    return ew1Var != null ? ew1Var.mo3406e(this) : this.f1563d;
                }

                /* JADX INFO: renamed from: b */
                public void mo759b() {
                }

                /* JADX INFO: renamed from: c */
                public Object mo760c(TypedArray typedArray, int i) {
/* 1 */             return null;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Preference preference) {
/* 1 */             Preference preference2 = preference;
/* 3 */             int i = preference2.f1561b;
/* 5 */             CharSequence charSequence = preference2.f1562c;
/* 7 */             int i2 = this.f1561b;
/* 9 */             if (i2 != i) {
/* 11 */                return i2 - i;
                    }
/* 13 */            CharSequence charSequence2 = this.f1562c;
/* 15 */            if (charSequence2 == charSequence) {
/* 17 */                return 0;
                    }
/* 19 */            if (charSequence2 == null) {
/* 21 */                return 1;
                    }
/* 23 */            if (charSequence == null) {
/* 25 */                return -1;
                    }
/* 35 */            return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             CharSequence charSequence = this.f1562c;
/* 14 */            if (!TextUtils.isEmpty(charSequence)) {
/* 16 */                sb.append(charSequence);
/* 19 */                sb.append(' ');
                    }
/* 22 */            CharSequence charSequenceMo761a = mo761a();
/* 30 */            if (!TextUtils.isEmpty(charSequenceMo761a)) {
/* 32 */                sb.append(charSequenceMo761a);
/* 35 */                sb.append(' ');
                    }
/* 42 */            if (sb.length() > 0) {
/* 50 */                sb.setLength(sb.length() - 1);
                    }
/* 53 */            return sb.toString();
                }

/* 289 */       public Preference(Context context, AttributeSet attributeSet, int i) {
/* 290 */           this(context, attributeSet, i, 0);
                }

/* 290 */       public Preference(Context context, AttributeSet attributeSet) {
/* 291 */           this(context, attributeSet, k50.m5981r(context, R$attr.preferenceStyle, R.attr.preferenceStyle));
                }
            }
