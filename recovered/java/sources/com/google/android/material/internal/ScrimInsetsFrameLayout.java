            package com.google.android.material.internal;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.widget.FrameLayout;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.er0;
            import p000.m83;
            import p000.rn2;
            import p000.s23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 55 */    public class ScrimInsetsFrameLayout extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public Drawable f4806a;

                /* JADX INFO: renamed from: b */
                public Rect f4807b;

                /* JADX INFO: renamed from: c */
                public final Rect f4808c;

                /* JADX INFO: renamed from: d */
                public boolean f4809d;

                /* JADX INFO: renamed from: e */
                public boolean f4810e;

                public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f4808c = new Rect();
/* 12 */            this.f4809d = true;
/* 14 */            this.f4810e = true;
/* 26 */            TypedArray typedArrayM8213d = rn2.m8213d(context, attributeSet, R$styleable.ScrimInsetsFrameLayout, i, R$style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
/* 36 */            this.f4806a = typedArrayM8213d.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
/* 38 */            typedArrayM8213d.recycle();
/* 41 */            setWillNotDraw(true);
/* 48 */            er0 er0Var = new er0(this, 15);
/* 51 */            WeakHashMap weakHashMap = e33.f7494a;
/* 53 */            s23.m8383u(this, er0Var);
                }

                /* JADX INFO: renamed from: a */
                public void mo2343a(m83 m83Var) {
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
/* 1 */             super.draw(canvas);
/* 4 */             int width = getWidth();
/* 8 */             int height = getHeight();
/* 14 */            if (this.f4807b == null || this.f4806a == null) {
/* 134 */               return;
                    }
/* 20 */            int iSave = canvas.save();
/* 34 */            canvas.translate(getScrollX(), getScrollY());
/* 37 */            boolean z = this.f4809d;
/* 40 */            Rect rect = this.f4808c;
/* 42 */            if (z) {
/* 48 */                rect.set(0, 0, width, this.f4807b.top);
/* 53 */                this.f4806a.setBounds(rect);
/* 58 */                this.f4806a.draw(canvas);
                    }
/* 63 */            if (this.f4810e) {
/* 71 */                rect.set(0, height - this.f4807b.bottom, width, height);
/* 76 */                this.f4806a.setBounds(rect);
/* 81 */                this.f4806a.draw(canvas);
                    }
/* 84 */            Rect rect2 = this.f4807b;
/* 94 */            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
/* 99 */            this.f4806a.setBounds(rect);
/* 104 */           this.f4806a.draw(canvas);
/* 107 */           Rect rect3 = this.f4807b;
/* 118 */           rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
/* 123 */           this.f4806a.setBounds(rect);
/* 128 */           this.f4806a.draw(canvas);
/* 131 */           canvas.restoreToCount(iSave);
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             Drawable drawable = this.f4806a;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.setCallback(this);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             Drawable drawable = this.f4806a;
/* 6 */             if (drawable != null) {
/* 9 */                 drawable.setCallback(null);
                    }
                }

                public void setDrawBottomInsetForeground(boolean z) {
/* 1 */             this.f4810e = z;
                }

                public void setDrawTopInsetForeground(boolean z) {
/* 1 */             this.f4809d = z;
                }

                public void setScrimInsetForeground(Drawable drawable) {
/* 1 */             this.f4806a = drawable;
                }

/* 56 */        public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
/* 57 */            this(context, attributeSet, 0);
                }
            }
