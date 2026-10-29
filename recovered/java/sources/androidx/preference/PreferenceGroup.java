            package androidx.preference;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 87 */    public abstract class PreferenceGroup extends Preference {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0119e();

                    /* JADX INFO: renamed from: a */
                    public final int f1567a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 8 */                 this.f1567a = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1567a);
                    }
                }

                public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
/* 2 */             super(context, attributeSet, i, 0);
/* 11 */            new Handler(Looper.getMainLooper());
/* 16 */            new ArrayList();
/* 21 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PreferenceGroup, i, 0);
/* 25 */            int i3 = R$styleable.PreferenceGroup_orderingFromXml;
/* 32 */            typedArrayObtainStyledAttributes.getBoolean(i3, typedArrayObtainStyledAttributes.getBoolean(i3, true));
/* 41 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.PreferenceGroup_initialExpandedChildrenCount)) {
/* 43 */                int i4 = R$styleable.PreferenceGroup_initialExpandedChildrenCount;
/* 56 */                if (typedArrayObtainStyledAttributes.getInt(i4, typedArrayObtainStyledAttributes.getInt(i4, AbstractC0208c9.API_PRIORITY_OTHER)) != Integer.MAX_VALUE && TextUtils.isEmpty(this.f1564e)) {
/* 82 */                    AbstractC1245n0.m4876d("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
                        }
                    }
/* 85 */            typedArrayObtainStyledAttributes.recycle();
                }

/* 88 */        public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
/* 89 */            this(context, attributeSet, i, 0);
                }

/* 89 */        public PreferenceGroup(Context context, AttributeSet attributeSet) {
/* 90 */            this(context, attributeSet, 0);
                }
            }
