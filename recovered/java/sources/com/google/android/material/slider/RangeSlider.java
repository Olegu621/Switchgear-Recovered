            package com.google.android.material.slider;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.AbsSavedState;
            import android.widget.SeekBar;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.a51;
            import p000.f42;
            import p000.fd1;
            import p000.rn2;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class RangeSlider extends BaseSlider<RangeSlider, Object, Object> {

                /* JADX INFO: renamed from: O0 */
                public float f4924O0;

                /* JADX INFO: renamed from: P0 */
                public int f4925P0;

                public RangeSlider(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 14 */            TypedArray typedArrayM8213d = rn2.m8213d(context, attributeSet, R$styleable.RangeSlider, i, BaseSlider.f4867N0, new int[0]);
/* 24 */            if (typedArrayM8213d.hasValue(R$styleable.RangeSlider_values)) {
/* 36 */                TypedArray typedArrayObtainTypedArray = typedArrayM8213d.getResources().obtainTypedArray(typedArrayM8213d.getResourceId(R$styleable.RangeSlider_values, 0));
/* 42 */                ArrayList arrayList = new ArrayList();
/* 49 */                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
/* 61 */                    arrayList.add(Float.valueOf(typedArrayObtainTypedArray.getFloat(i2, -1.0f)));
                        }
/* 67 */                setValues(arrayList);
                    }
/* 77 */            this.f4924O0 = typedArrayM8213d.getDimension(R$styleable.RangeSlider_minSeparation, 0.0f);
/* 79 */            typedArrayM8213d.recycle();
                }

                @Override // com.google.android.material.slider.BaseSlider, android.view.View
                public CharSequence getAccessibilityClassName() {
/* 3 */             return SeekBar.class.getName();
                }

                public int getActiveThumbIndex() {
/* 1 */             return this.f4913v0;
                }

                public int getFocusedThumbIndex() {
/* 1 */             return this.f4915w0;
                }

                public int getHaloRadius() {
/* 1 */             return this.f4904n0;
                }

                public ColorStateList getHaloTintList() {
/* 1 */             return this.f4871D0;
                }

                public int getLabelBehavior() {
/* 1 */             return this.f4899i0;
                }

                @Override // com.google.android.material.slider.BaseSlider
                public float getMinSeparation() {
/* 1 */             return this.f4924O0;
                }

                public float getStepSize() {
/* 1 */             return this.f4916x0;
                }

                public float getThumbElevation() {
/* 5 */             return this.f4876I0.f8151a.f7647m;
                }

                public int getThumbRadius() {
/* 1 */             return this.f4903m0;
                }

                public ColorStateList getThumbStrokeColor() {
/* 5 */             return this.f4876I0.f8151a.f7638d;
                }

                public float getThumbStrokeWidth() {
/* 5 */             return this.f4876I0.f8151a.f7644j;
                }

                public ColorStateList getThumbTintList() {
/* 5 */             return this.f4876I0.f8151a.f7637c;
                }

                public ColorStateList getTickActiveTintList() {
/* 1 */             return this.f4872E0;
                }

                public ColorStateList getTickInactiveTintList() {
/* 1 */             return this.f4873F0;
                }

                public ColorStateList getTickTintList() {
/* 9 */             if (this.f4873F0.equals(this.f4872E0)) {
/* 11 */                return this.f4872E0;
                    }
/* 16 */            f42.m3656l("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
/* 19 */            return null;
                }

                public ColorStateList getTrackActiveTintList() {
/* 1 */             return this.f4874G0;
                }

                public int getTrackHeight() {
/* 1 */             return this.f4900j0;
                }

                public ColorStateList getTrackInactiveTintList() {
/* 1 */             return this.f4875H0;
                }

                public int getTrackSidePadding() {
/* 1 */             return this.f4901k0;
                }

                public ColorStateList getTrackTintList() {
/* 9 */             if (this.f4875H0.equals(this.f4874G0)) {
/* 11 */                return this.f4874G0;
                    }
/* 16 */            f42.m3656l("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
/* 19 */            return null;
                }

                public int getTrackWidth() {
/* 1 */             return this.f4868A0;
                }

                @Override // com.google.android.material.slider.BaseSlider
                public float getValueFrom() {
/* 1 */             return this.f4909s0;
                }

                @Override // com.google.android.material.slider.BaseSlider
                public float getValueTo() {
/* 1 */             return this.f4910t0;
                }

                @Override // com.google.android.material.slider.BaseSlider
                public List<Float> getValues() {
/* 1 */             return super.getValues();
                }

                @Override // com.google.android.material.slider.BaseSlider, android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 1 */             RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
/* 7 */             super.onRestoreInstanceState(rangeSliderState.getSuperState());
/* 12 */            this.f4924O0 = rangeSliderState.f4926a;
/* 14 */            int i = rangeSliderState.f4927b;
/* 16 */            this.f4925P0 = i;
/* 18 */            setSeparationUnit(i);
                }

                @Override // com.google.android.material.slider.BaseSlider, android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
/* 12 */            rangeSliderState.f4926a = this.f4924O0;
/* 16 */            rangeSliderState.f4927b = this.f4925P0;
/* 18 */            return rangeSliderState;
                }

                public void setCustomThumbDrawable(int i) {
/* 9 */             setCustomThumbDrawable(getResources().getDrawable(i));
                }

                @Override // com.google.android.material.slider.BaseSlider
                public void setCustomThumbDrawablesForValues(int... iArr) {
/* 1 */             super.setCustomThumbDrawablesForValues(iArr);
                }

                @Override // com.google.android.material.slider.BaseSlider, android.view.View
                public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
/* 1 */             super.setEnabled(z);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
/* 1 */             super.setFocusedThumbIndex(i);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
/* 1 */             super.setHaloRadius(i);
                }

                public void setHaloRadiusResource(int i) {
/* 9 */             setHaloRadius(getResources().getDimensionPixelSize(i));
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
/* 1 */             super.setHaloTintList(colorStateList);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
/* 1 */             super.setLabelBehavior(i);
                }

                public /* bridge */ /* synthetic */ void setLabelFormatter(a51 a51Var) {
                }

                public void setMinSeparation(float f) {
/* 1 */             this.f4924O0 = f;
/* 4 */             this.f4925P0 = 0;
/* 6 */             setSeparationUnit(0);
                }

                public void setMinSeparationValue(float f) {
/* 1 */             this.f4924O0 = f;
/* 4 */             this.f4925P0 = 1;
/* 6 */             setSeparationUnit(1);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setStepSize(float f) {
/* 1 */             super.setStepSize(f);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
/* 1 */             super.setThumbElevation(f);
                }

                public void setThumbElevationResource(int i) {
/* 9 */             setThumbElevation(getResources().getDimension(i));
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
/* 1 */             super.setThumbRadius(i);
                }

                public void setThumbRadiusResource(int i) {
/* 9 */             setThumbRadius(getResources().getDimensionPixelSize(i));
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
/* 1 */             super.setThumbStrokeColor(colorStateList);
                }

                public void setThumbStrokeColorResource(int i) {
/* 1 */             if (i != 0) {
/* 11 */                setThumbStrokeColor(v00.getColorStateList(getContext(), i));
                    }
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
/* 1 */             super.setThumbStrokeWidth(f);
                }

                public void setThumbStrokeWidthResource(int i) {
/* 1 */             if (i != 0) {
/* 11 */                setThumbStrokeWidth(getResources().getDimension(i));
                    }
                }

                public void setThumbTintList(ColorStateList colorStateList) {
/* 1 */             fd1 fd1Var = this.f4876I0;
/* 11 */            if (colorStateList.equals(fd1Var.f8151a.f7637c)) {
/* 13 */                return;
                    }
/* 14 */            fd1Var.m3742n(colorStateList);
/* 17 */            invalidate();
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
/* 1 */             super.setTickActiveTintList(colorStateList);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
/* 1 */             super.setTickInactiveTintList(colorStateList);
                }

                public void setTickTintList(ColorStateList colorStateList) {
/* 1 */             setTickInactiveTintList(colorStateList);
/* 4 */             setTickActiveTintList(colorStateList);
                }

                public void setTickVisible(boolean z) {
/* 3 */             if (this.f4918z0 != z) {
/* 5 */                 this.f4918z0 = z;
/* 7 */                 postInvalidate();
                    }
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
/* 1 */             super.setTrackActiveTintList(colorStateList);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setTrackHeight(int i) {
/* 1 */             super.setTrackHeight(i);
                }

                @Override // com.google.android.material.slider.BaseSlider
                public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
/* 1 */             super.setTrackInactiveTintList(colorStateList);
                }

                public void setTrackTintList(ColorStateList colorStateList) {
/* 1 */             setTrackInactiveTintList(colorStateList);
/* 4 */             setTrackActiveTintList(colorStateList);
                }

                public void setValueFrom(float f) {
/* 1 */             this.f4909s0 = f;
/* 4 */             this.f4870C0 = true;
/* 6 */             postInvalidate();
                }

                public void setValueTo(float f) {
/* 1 */             this.f4910t0 = f;
/* 4 */             this.f4870C0 = true;
/* 6 */             postInvalidate();
                }

                @Override // com.google.android.material.slider.BaseSlider
                public void setValues(Float... fArr) {
/* 1 */             super.setValues(fArr);
                }

                @Override // com.google.android.material.slider.BaseSlider
/* 4 */         public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
/* 5 */             super.setCustomThumbDrawablesForValues(drawableArr);
                }

                @Override // com.google.android.material.slider.BaseSlider
/* 4 */         public void setValues(List<Float> list) {
/* 5 */             super.setValues(list);
                }

                @Override // com.google.android.material.slider.BaseSlider
/* 12 */        public void setCustomThumbDrawable(Drawable drawable) {
/* 13 */            super.setCustomThumbDrawable(drawable);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 25 */        public static class RangeSliderState extends AbsSavedState {
                    public static final Parcelable.Creator<RangeSliderState> CREATOR = new C0377g();

                    /* JADX INFO: renamed from: a */
                    public float f4926a;

                    /* JADX INFO: renamed from: b */
                    public int f4927b;

                    public RangeSliderState(Parcel parcel) {
/* 11 */                super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
/* 18 */                this.f4926a = parcel.readFloat();
/* 24 */                this.f4927b = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeFloat(this.f4926a);
/* 11 */                parcel.writeInt(this.f4927b);
                    }

/* 26 */            public RangeSliderState(Parcelable parcelable) {
/* 27 */                super(parcelable);
                    }
                }

/* 82 */        public RangeSlider(Context context, AttributeSet attributeSet) {
/* 83 */            this(context, attributeSet, R$attr.sliderStyle);
                }
            }
