            package com.google.android.material.divider;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.View;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.de3;
            import p000.e33;
            import p000.fd1;
            import p000.hd1;
            import p000.rn2;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    public class MaterialDivider extends View {

                /* JADX INFO: renamed from: f */
                public static final int f4706f = R$style.Widget_MaterialComponents_MaterialDivider;

                /* JADX INFO: renamed from: a */
                public final fd1 f4707a;

                /* JADX INFO: renamed from: b */
                public int f4708b;

                /* JADX INFO: renamed from: c */
                public int f4709c;

                /* JADX INFO: renamed from: d */
                public int f4710d;

                /* JADX INFO: renamed from: e */
                public int f4711e;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4706f;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            Context context2 = getContext();
/* 19 */            this.f4707a = new fd1();
/* 28 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialDivider, i, i2, new int[0]);
/* 48 */            this.f4708b = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R$dimen.material_divider_thickness));
/* 56 */            this.f4710d = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetStart, 0);
/* 64 */            this.f4711e = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetEnd, 0);
/* 76 */            setDividerColor(de3.m3033o(context2, typedArrayM8213d, R$styleable.MaterialDivider_dividerColor).getDefaultColor());
/* 79 */            typedArrayM8213d.recycle();
                }

                public int getDividerColor() {
/* 1 */             return this.f4709c;
                }

                public int getDividerInsetEnd() {
/* 1 */             return this.f4711e;
                }

                public int getDividerInsetStart() {
/* 1 */             return this.f4710d;
                }

                public int getDividerThickness() {
/* 1 */             return this.f4708b;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int width;
                    int i;
/* 1 */             super.onDraw(canvas);
/* 4 */             WeakHashMap weakHashMap = e33.f7494a;
/* 12 */            boolean z = getLayoutDirection() == 1;
/* 21 */            int i2 = z ? this.f4711e : this.f4710d;
/* 23 */            if (z) {
/* 25 */                width = getWidth();
/* 29 */                i = this.f4710d;
                    } else {
/* 33 */                width = getWidth();
/* 37 */                i = this.f4711e;
                    }
/* 31 */            int i3 = width - i;
/* 48 */            int bottom = getBottom() - getTop();
/* 49 */            fd1 fd1Var = this.f4707a;
/* 51 */            fd1Var.setBounds(i2, 0, i3, bottom);
/* 54 */            fd1Var.draw(canvas);
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 4 */             int mode = View.MeasureSpec.getMode(i2);
/* 8 */             int measuredHeight = getMeasuredHeight();
/* 14 */            if (mode == Integer.MIN_VALUE || mode == 0) {
/* 20 */                int i3 = this.f4708b;
/* 22 */                if (i3 > 0 && measuredHeight != i3) {
/* 26 */                    measuredHeight = i3;
                        }
/* 31 */                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                    }
                }

                public void setDividerColor(int i) {
/* 3 */             if (this.f4709c != i) {
/* 5 */                 this.f4709c = i;
/* 13 */                this.f4707a.m3742n(ColorStateList.valueOf(i));
/* 16 */                invalidate();
                    }
                }

                public void setDividerColorResource(int i) {
/* 9 */             setDividerColor(v00.getColor(getContext(), i));
                }

                public void setDividerInsetEnd(int i) {
/* 1 */             this.f4711e = i;
                }

                public void setDividerInsetEndResource(int i) {
/* 13 */            setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
                }

                public void setDividerInsetStart(int i) {
/* 1 */             this.f4710d = i;
                }

                public void setDividerInsetStartResource(int i) {
/* 13 */            setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
                }

                public void setDividerThickness(int i) {
/* 3 */             if (this.f4708b != i) {
/* 5 */                 this.f4708b = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setDividerThicknessResource(int i) {
/* 13 */            setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
                }

/* 82 */        public MaterialDivider(Context context, AttributeSet attributeSet) {
/* 83 */            this(context, attributeSet, R$attr.materialDividerStyle);
                }
            }
