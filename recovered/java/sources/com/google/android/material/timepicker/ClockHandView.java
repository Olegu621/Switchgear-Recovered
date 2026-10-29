            package com.google.android.material.timepicker;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.InterfaceC2565zv;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 103 */   class ClockHandView extends View {

                /* JADX INFO: renamed from: U */
                public int f5107U;

                /* JADX INFO: renamed from: a */
                public final ArrayList f5108a;

                /* JADX INFO: renamed from: b */
                public final int f5109b;

                /* JADX INFO: renamed from: c */
                public final float f5110c;

                /* JADX INFO: renamed from: d */
                public final Paint f5111d;

                /* JADX INFO: renamed from: e */
                public final RectF f5112e;

                /* JADX INFO: renamed from: f */
                public final int f5113f;

                /* JADX INFO: renamed from: i */
                public float f5114i;

                /* JADX INFO: renamed from: v */
                public boolean f5115v;

                /* JADX INFO: renamed from: w */
                public double f5116w;

                public ClockHandView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f5108a = new ArrayList();
/* 13 */            Paint paint = new Paint();
/* 16 */            this.f5111d = paint;
/* 23 */            this.f5112e = new RectF();
/* 29 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
/* 40 */            this.f5107U = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
/* 48 */            this.f5109b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
/* 50 */            Resources resources = getResources();
/* 60 */            this.f5113f = resources.getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
/* 69 */            this.f5110c = resources.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
/* 73 */            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
/* 78 */            paint.setAntiAlias(true);
/* 81 */            paint.setColor(color);
/* 85 */            m2427a(0.0f);
/* 92 */            ViewConfiguration.get(context).getScaledTouchSlop();
/* 95 */            WeakHashMap weakHashMap = e33.f7494a;
/* 98 */            setImportantForAccessibility(2);
/* 101 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final void m2427a(float f) {
/* 3 */             float f2 = f % 360.0f;
/* 4 */             this.f5114i = f2;
/* 15 */            this.f5116w = Math.toRadians(f2 - 90.0f);
/* 21 */            int height = getHeight() / 2;
/* 41 */            float fCos = (this.f5107U * ((float) Math.cos(this.f5116w))) + (getWidth() / 2);
/* 54 */            float fSin = (this.f5107U * ((float) Math.sin(this.f5116w))) + height;
/* 55 */            float f3 = this.f5109b;
/* 66 */            this.f5112e.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
/* 71 */            Iterator it = this.f5108a.iterator();
/* 79 */            while (it.hasNext()) {
/* 87 */                ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC2565zv) it.next());
/* 101 */               if (Math.abs(clockFaceView.f5105v0 - f2) > 0.001f) {
/* 103 */                   clockFaceView.f5105v0 = f2;
/* 105 */                   clockFaceView.m2426k();
                        }
                    }
/* 109 */           invalidate();
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 8 */             int height = getHeight() / 2;
/* 14 */            int width = getWidth() / 2;
                    float f = width;
/* 28 */            float fCos = (this.f5107U * ((float) Math.cos(this.f5116w))) + f;
                    float f2 = height;
/* 41 */            float fSin = (this.f5107U * ((float) Math.sin(this.f5116w))) + f2;
/* 43 */            Paint paint = this.f5111d;
/* 45 */            paint.setStrokeWidth(0.0f);
/* 48 */            int i = this.f5109b;
/* 51 */            canvas.drawCircle(fCos, fSin, i, paint);
/* 56 */            double dSin = Math.sin(this.f5116w);
/* 62 */            double dCos = Math.cos(this.f5116w);
/* 68 */            double d = this.f5107U - i;
/* 82 */            paint.setStrokeWidth(this.f5113f);
/* 87 */            canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
/* 92 */            canvas.drawCircle(f, f2, this.f5110c, paint);
                }

                @Override // android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 6 */             m2427a(this.f5114i);
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    boolean z2;
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 5 */             float x = motionEvent.getX();
/* 9 */             float y = motionEvent.getY();
/* 15 */            boolean z3 = false;
/* 16 */            if (actionMasked == 0) {
/* 29 */                this.f5115v = false;
/* 31 */                z = true;
/* 32 */                z2 = false;
                    } else if (actionMasked == 1 || actionMasked == 2) {
/* 25 */                z2 = this.f5115v;
/* 27 */                z = false;
                    } else {
/* 22 */                z2 = false;
/* 23 */                z = false;
                    }
/* 33 */            boolean z4 = this.f5115v;
/* 59 */            int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
/* 60 */            int i = degrees + 90;
/* 62 */            if (i < 0) {
/* 64 */                i = degrees + 450;
                    }
                    float f = i;
/* 75 */            boolean z5 = this.f5114i != f;
/* 76 */            if (z && z5) {
/* 80 */                z3 = true;
                    } else if (z5 || z2) {
/* 86 */                m2427a(f);
/* 80 */                z3 = true;
                    }
/* 92 */            this.f5115v = z4 | z3;
/* 14 */            return true;
                }

/* 104 */       public ClockHandView(Context context, AttributeSet attributeSet) {
/* 105 */           this(context, attributeSet, R$attr.materialClockStyle);
                }
            }
