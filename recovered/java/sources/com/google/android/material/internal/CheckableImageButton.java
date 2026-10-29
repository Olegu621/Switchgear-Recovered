            package com.google.android.material.internal;

            import android.R;
            import android.content.Context;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.Checkable;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.widget.AppCompatImageButton;
            import androidx.customview.view.AbsSavedState;
            import p000.C2343wt;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public class CheckableImageButton extends AppCompatImageButton implements Checkable {

                /* JADX INFO: renamed from: i */
                public static final int[] f4780i = {R.attr.state_checked};

                /* JADX INFO: renamed from: d */
                public boolean f4781d;

                /* JADX INFO: renamed from: e */
                public boolean f4782e;

                /* JADX INFO: renamed from: f */
                public boolean f4783f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0364a();

                    /* JADX INFO: renamed from: c */
                    public boolean f4784c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 13 */                this.f4784c = parcel.readInt() == 1;
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f4784c ? 1 : 0);
                    }
                }

                public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f4782e = true;
/* 7 */             this.f4783f = true;
/* 15 */            e33.m3318n(this, new C2343wt(this, 0));
                }

                @Override // android.widget.Checkable
                public final boolean isChecked() {
/* 1 */             return this.f4781d;
                }

                @Override // android.widget.ImageView, android.view.View
                public final int[] onCreateDrawableState(int i) {
                    return this.f4781d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f4780i) : super.onCreateDrawableState(i);
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            setChecked(savedState.f4784c);
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            savedState.f4784c = this.f4781d;
/* 14 */            return savedState;
                }

                public void setCheckable(boolean z) {
/* 3 */             if (this.f4782e != z) {
/* 5 */                 this.f4782e = z;
/* 8 */                 sendAccessibilityEvent(0);
                    }
                }

                @Override // android.widget.Checkable
                public void setChecked(boolean z) {
/* 3 */             if (!this.f4782e || this.f4781d == z) {
/* 19 */                return;
                    }
/* 9 */             this.f4781d = z;
/* 11 */            refreshDrawableState();
/* 16 */            sendAccessibilityEvent(2048);
                }

                public void setPressable(boolean z) {
/* 1 */             this.f4783f = z;
                }

                @Override // android.view.View
                public void setPressed(boolean z) {
/* 3 */             if (this.f4783f) {
/* 5 */                 super.setPressed(z);
                    }
                }

                @Override // android.widget.Checkable
                public final void toggle() {
/* 5 */             setChecked(!this.f4781d);
                }

/* 18 */        public CheckableImageButton(Context context, AttributeSet attributeSet) {
/* 19 */            this(context, attributeSet, R$attr.imageButtonStyle);
                }
            }
