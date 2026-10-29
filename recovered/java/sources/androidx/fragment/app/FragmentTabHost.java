            package androidx.fragment.app;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.TabHost;
            import java.util.ArrayList;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1381a;

                /* JADX INFO: renamed from: b */
                public TabHost.OnTabChangeListener f1382b;

                /* JADX INFO: renamed from: c */
                public boolean f1383c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0087a0();

                    /* JADX INFO: renamed from: a */
                    public String f1384a;

                    public final String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
/* 16 */                sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */                sb.append(" curTab=");
/* 28 */                return fm0.m3789o(sb, this.f1384a, "}");
                    }

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeString(this.f1384a);
                    }
                }

                @Deprecated
                public FragmentTabHost(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f1381a = new ArrayList();
/* 19 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
/* 23 */            typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 26 */            typedArrayObtainStyledAttributes.recycle();
/* 29 */            super.setOnTabChangedListener(this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             getCurrentTabTag();
/* 7 */             ArrayList arrayList = this.f1381a;
/* 14 */            if (arrayList.size() > 0) {
/* 35 */                throw pm2.m7486i(0, arrayList);
                    }
/* 17 */            this.f1383c = true;
/* 23 */            if (arrayList.size() > 0) {
/* 30 */                throw pm2.m7486i(0, arrayList);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             this.f1383c = false;
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 15 */            super.onRestoreInstanceState(savedState.getSuperState());
/* 20 */            setCurrentTabByTag(savedState.f1384a);
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 14 */            savedState.f1384a = getCurrentTabTag();
/* 16 */            return savedState;
                }

                @Override // android.widget.TabHost.OnTabChangeListener
                public final void onTabChanged(String str) {
/* 3 */             if (this.f1383c) {
/* 5 */                 ArrayList arrayList = this.f1381a;
/* 11 */                if (arrayList.size() > 0) {
/* 19 */                    throw pm2.m7486i(0, arrayList);
                        }
                    }
/* 20 */            TabHost.OnTabChangeListener onTabChangeListener = this.f1382b;
/* 22 */            if (onTabChangeListener != null) {
/* 24 */                onTabChangeListener.onTabChanged(str);
                    }
                }

                @Override // android.widget.TabHost
                @Deprecated
                public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
/* 1 */             this.f1382b = onTabChangeListener;
                }

                @Override // android.widget.TabHost
                public final void setup() {
/* 8 */             throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
                }
            }
