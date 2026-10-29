            package com.google.android.material.snackbar;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import p000.AbstractC2182si;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Snackbar$SnackbarLayout extends AbstractC2182si {
                public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // p000.AbstractC2182si, android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 4 */             int childCount = getChildCount();
/* 21 */            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
/* 23 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 25 */                View childAt = getChildAt(i3);
/* 36 */                if (childAt.getLayoutParams().width == -1) {
/* 52 */                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                        }
                    }
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
/* 1 */             super.setBackground(drawable);
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             super.setBackgroundTintList(colorStateList);
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             super.setBackgroundTintMode(mode);
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             super.setLayoutParams(layoutParams);
                }

                @Override // p000.AbstractC2182si, android.view.View
                public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             super.setOnClickListener(onClickListener);
                }
            }
