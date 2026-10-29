            package com.google.android.material.progressindicator;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.os.SystemClock;
            import android.provider.Settings;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.ProgressBar;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            import p000.AbstractC2002oi;
            import p000.C1951n4;
            import p000.C1965ni;
            import p000.C2284v8;
            import p000.RunnableC1928mi;
            import p000.ca0;
            import p000.e33;
            import p000.hd1;
            import p000.lx0;
            import p000.rn2;
            import p000.xe2;
            import p000.y90;
            import p000.z70;
            
            /* JADX INFO: renamed from: com.google.android.material.progressindicator.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0370a extends ProgressBar {

                /* JADX INFO: renamed from: W */
                public static final int f4851W = R$style.Widget_MaterialComponents_ProgressIndicator;

                /* JADX INFO: renamed from: U */
                public final C1965ni f4852U;

                /* JADX INFO: renamed from: V */
                public final C1965ni f4853V;

                /* JADX INFO: renamed from: a */
                public final AbstractC2002oi f4854a;

                /* JADX INFO: renamed from: b */
                public int f4855b;

                /* JADX INFO: renamed from: c */
                public final boolean f4856c;

                /* JADX INFO: renamed from: d */
                public final int f4857d;

                /* JADX INFO: renamed from: e */
                public C2284v8 f4858e;

                /* JADX INFO: renamed from: f */
                public boolean f4859f;

                /* JADX INFO: renamed from: i */
                public int f4860i;

                /* JADX INFO: renamed from: v */
                public final RunnableC1928mi f4861v;

                /* JADX INFO: renamed from: w */
                public final RunnableC1928mi f4862w;

                public AbstractC0370a(Context context, AttributeSet attributeSet, int i, int i2) {
/* 7 */             super(hd1.m4176a(context, attributeSet, i, f4851W), attributeSet, i);
/* 11 */            this.f4859f = false;
/* 14 */            this.f4860i = 4;
/* 21 */            this.f4861v = new RunnableC1928mi(this, 0);
/* 29 */            this.f4862w = new RunnableC1928mi(this, 1);
/* 36 */            this.f4852U = new C1965ni(this, 0);
/* 43 */            this.f4853V = new C1965ni(this, 1);
/* 45 */            Context context2 = getContext();
/* 53 */            this.f4854a = mo2347a(context2, attributeSet);
/* 62 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.BaseProgressIndicator, i, i2, new int[0]);
/* 69 */            typedArrayM8213d.getInt(R$styleable.BaseProgressIndicator_showDelay, -1);
/* 84 */            this.f4857d = Math.min(typedArrayM8213d.getInt(R$styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
/* 86 */            typedArrayM8213d.recycle();
/* 94 */            this.f4858e = new C2284v8();
/* 96 */            this.f4856c = true;
                }

                private ca0 getCurrentDrawingDelegate() {
/* 6 */             if (isIndeterminate()) {
/* 12 */                if (getIndeterminateDrawable() == null) {
/* 5 */                     return null;
                        }
/* 19 */                return getIndeterminateDrawable().f13516W;
                    }
/* 26 */            if (getProgressDrawable() == null) {
/* 5 */                 return null;
                    }
/* 33 */            return getProgressDrawable().f19958W;
                }

                /* JADX INFO: renamed from: a */
                public abstract AbstractC2002oi mo2347a(Context context, AttributeSet attributeSet);

                /* JADX INFO: renamed from: b */
                public void mo2349b(int i) {
/* 5 */             if (!isIndeterminate()) {
/* 74 */                super.setProgress(i);
/* 81 */                if (getProgressDrawable() != null) {
/* 87 */                    getProgressDrawable().jumpToCurrentState();
/* 90 */                    return;
                        }
/* 90 */                return;
                    }
/* 11 */            if (getProgressDrawable() != null) {
/* 13 */                this.f4855b = i;
/* 16 */                this.f4859f = true;
/* 26 */                if (getIndeterminateDrawable().isVisible()) {
/* 28 */                    C2284v8 c2284v8 = this.f4858e;
/* 34 */                    ContentResolver contentResolver = getContext().getContentResolver();
/* 38 */                    c2284v8.getClass();
/* 52 */                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
/* 61 */                        getIndeterminateDrawable().f13517X.mo6300s();
/* 64 */                        return;
                            }
                        }
/* 65 */                getIndeterminateDrawable();
/* 70 */                this.f4852U.m6984a();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m2350c() {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             if (!isAttachedToWindow() || getWindowVisibility() != 0) {
/* 45 */                return false;
                    }
/* 15 */            View view = this;
/* 20 */            while (view.getVisibility() == 0) {
/* 23 */                Object parent = view.getParent();
/* 27 */                if (parent == null) {
                            return getWindowVisibility() == 0;
                        }
/* 38 */                if (!(parent instanceof View)) {
/* 40 */                    return true;
                        }
/* 42 */                view = (View) parent;
                    }
/* 45 */            return false;
                }

                @Override // android.widget.ProgressBar
                public Drawable getCurrentDrawable() {
                    return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
                }

                public int getHideAnimationBehavior() {
/* 3 */             return this.f4854a.f14767f;
                }

                @Override // android.widget.ProgressBar
                public lx0 getIndeterminateDrawable() {
/* 5 */             return (lx0) super.getIndeterminateDrawable();
                }

                public int[] getIndicatorColor() {
/* 3 */             return this.f4854a.f14764c;
                }

                @Override // android.widget.ProgressBar
                public z70 getProgressDrawable() {
/* 5 */             return (z70) super.getProgressDrawable();
                }

                public int getShowAnimationBehavior() {
/* 3 */             return this.f4854a.f14766e;
                }

                public int getTrackColor() {
/* 3 */             return this.f4854a.f14765d;
                }

                public int getTrackCornerRadius() {
/* 3 */             return this.f4854a.f14763b;
                }

                public int getTrackThickness() {
/* 3 */             return this.f4854a.f14762a;
                }

                @Override // android.view.View
                public final void invalidate() {
/* 1 */             super.invalidate();
/* 8 */             if (getCurrentDrawable() != null) {
/* 14 */                getCurrentDrawable().invalidateSelf();
                    }
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
/* 24 */                getIndeterminateDrawable().f13517X.mo6299r(this.f4852U);
                    }
/* 27 */            z70 progressDrawable = getProgressDrawable();
/* 31 */            C1965ni c1965ni = this.f4853V;
/* 33 */            if (progressDrawable != null) {
/* 35 */                z70 progressDrawable2 = getProgressDrawable();
/* 41 */                if (progressDrawable2.f19534f == null) {
/* 48 */                    progressDrawable2.f19534f = new ArrayList();
                        }
/* 56 */                if (!progressDrawable2.f19534f.contains(c1965ni)) {
/* 60 */                    progressDrawable2.f19534f.add(c1965ni);
                        }
                    }
/* 67 */            if (getIndeterminateDrawable() != null) {
/* 69 */                lx0 indeterminateDrawable = getIndeterminateDrawable();
/* 75 */                if (indeterminateDrawable.f19534f == null) {
/* 82 */                    indeterminateDrawable.f19534f = new ArrayList();
                        }
/* 90 */                if (!indeterminateDrawable.f19534f.contains(c1965ni)) {
/* 94 */                    indeterminateDrawable.f19534f.add(c1965ni);
                        }
                    }
/* 101 */           if (m2350c()) {
/* 105 */               if (this.f4857d > 0) {
/* 107 */                   SystemClock.uptimeMillis();
                        }
/* 111 */               setVisibility(0);
                    }
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final void onDetachedFromWindow() {
/* 3 */             removeCallbacks(this.f4862w);
/* 8 */             removeCallbacks(this.f4861v);
/* 18 */            ((y90) getCurrentDrawable()).m10130e(false, false, false);
/* 21 */            lx0 indeterminateDrawable = getIndeterminateDrawable();
/* 25 */            C1965ni c1965ni = this.f4853V;
/* 27 */            if (indeterminateDrawable != null) {
/* 33 */                getIndeterminateDrawable().m10131g(c1965ni);
/* 42 */                getIndeterminateDrawable().f13517X.mo6303w();
                    }
/* 49 */            if (getProgressDrawable() != null) {
/* 55 */                getProgressDrawable().m10131g(c1965ni);
                    }
/* 58 */            super.onDetachedFromWindow();
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final synchronized void onDraw(Canvas canvas) {
                    try {
/* 2 */                 int iSave = canvas.save();
/* 10 */                if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
/* 31 */                    canvas.translate(getPaddingLeft(), getPaddingTop());
                        }
/* 38 */                if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
/* 75 */                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                        }
/* 82 */                getCurrentDrawable().draw(canvas);
/* 85 */                canvas.restoreToCount(iSave);
                    } catch (Throwable th) {
/* 91 */                throw th;
                    }
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final synchronized void onMeasure(int i, int i2) {
                    try {
/* 2 */                 super.onMeasure(i, i2);
/* 5 */                 ca0 currentDrawingDelegate = getCurrentDrawingDelegate();
/* 9 */                 if (currentDrawingDelegate == null) {
/* 12 */                    return;
                        }
/* 13 */                int iMo1559e = currentDrawingDelegate.mo1559e();
/* 17 */                int iMo1558d = currentDrawingDelegate.mo1558d();
/* 57 */                setMeasuredDimension(iMo1559e < 0 ? getMeasuredWidth() : iMo1559e + getPaddingLeft() + getPaddingRight(), iMo1558d < 0 ? getMeasuredHeight() : iMo1558d + getPaddingTop() + getPaddingBottom());
                    } catch (Throwable th) {
/* 63 */                throw th;
                    }
                }

                @Override // android.view.View
                public final void onVisibilityChanged(View view, int i) {
/* 1 */             super.onVisibilityChanged(view, i);
/* 9 */             boolean z = i == 0;
/* 12 */            if (this.f4856c) {
/* 25 */                ((y90) getCurrentDrawable()).m10130e(m2350c(), false, z);
                    }
                }

                @Override // android.view.View
                public final void onWindowVisibilityChanged(int i) {
/* 1 */             super.onWindowVisibilityChanged(i);
/* 6 */             if (this.f4856c) {
/* 20 */                ((y90) getCurrentDrawable()).m10130e(m2350c(), false, false);
                    }
                }

                public void setAnimatorDurationScaleProvider(C2284v8 c2284v8) {
/* 1 */             this.f4858e = c2284v8;
/* 7 */             if (getProgressDrawable() != null) {
/* 13 */                getProgressDrawable().f19531c = c2284v8;
                    }
/* 19 */            if (getIndeterminateDrawable() != null) {
/* 25 */                getIndeterminateDrawable().f19531c = c2284v8;
                    }
                }

                public void setHideAnimationBehavior(int i) {
/* 3 */             this.f4854a.f14767f = i;
/* 5 */             invalidate();
                }

                @Override // android.widget.ProgressBar
                public synchronized void setIndeterminate(boolean z) {
                    try {
/* 6 */                 if (z == isIndeterminate()) {
/* 9 */                     return;
                        }
/* 14 */                y90 y90Var = (y90) getCurrentDrawable();
/* 17 */                if (y90Var != null) {
/* 19 */                    y90Var.m10130e(false, false, false);
                        }
/* 25 */                super.setIndeterminate(z);
/* 32 */                y90 y90Var2 = (y90) getCurrentDrawable();
/* 34 */                if (y90Var2 != null) {
/* 40 */                    y90Var2.m10130e(m2350c(), false, false);
                        }
/* 45 */                if ((y90Var2 instanceof lx0) && m2350c()) {
/* 57 */                    ((lx0) y90Var2).f13517X.mo6301u();
                        }
/* 60 */                this.f4859f = false;
                    } catch (Throwable th) {
/* 65 */                throw th;
                    }
                }

                @Override // android.widget.ProgressBar
                public void setIndeterminateDrawable(Drawable drawable) {
/* 1 */             if (drawable == null) {
/* 4 */                 super.setIndeterminateDrawable(null);
                    } else if (!(drawable instanceof lx0)) {
/* 25 */                C1951n4.m6859j("Cannot set framework drawable as indeterminate drawable.");
                    } else {
/* 16 */                ((y90) drawable).m10130e(false, false, false);
/* 19 */                super.setIndeterminateDrawable(drawable);
                    }
                }

                public void setIndicatorColor(int... iArr) {
/* 2 */             if (iArr.length == 0) {
/* 5 */                 iArr = new int[]{xe2.m9780r(getContext(), R$attr.colorPrimary, -1)};
                    }
/* 29 */            if (Arrays.equals(getIndicatorColor(), iArr)) {
/* 47 */                return;
                    }
/* 33 */            this.f4854a.f14764c = iArr;
/* 41 */            getIndeterminateDrawable().f13517X.mo6295n();
/* 44 */            invalidate();
                }

                @Override // android.widget.ProgressBar
                public synchronized void setProgress(int i) {
/* 6 */             if (isIndeterminate()) {
/* 9 */                 return;
                    }
/* 10 */            mo2349b(i);
                }

                @Override // android.widget.ProgressBar
                public void setProgressDrawable(Drawable drawable) {
/* 1 */             if (drawable == null) {
/* 4 */                 super.setProgressDrawable(null);
/* 7 */                 return;
                    }
/* 10 */            if (!(drawable instanceof z70)) {
/* 43 */                C1951n4.m6859j("Cannot set framework drawable as progress drawable.");
/* 46 */                return;
                    }
/* 12 */            z70 z70Var = (z70) drawable;
/* 15 */            z70Var.m10130e(false, false, false);
/* 18 */            super.setProgressDrawable(z70Var);
/* 37 */            z70Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                }

                public void setShowAnimationBehavior(int i) {
/* 3 */             this.f4854a.f14766e = i;
/* 5 */             invalidate();
                }

                public void setTrackColor(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 5 */             if (abstractC2002oi.f14765d != i) {
/* 7 */                 abstractC2002oi.f14765d = i;
/* 9 */                 invalidate();
                    }
                }

                public void setTrackCornerRadius(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 5 */             if (abstractC2002oi.f14763b != i) {
/* 15 */                abstractC2002oi.f14763b = Math.min(i, abstractC2002oi.f14762a / 2);
                    }
                }

                public void setTrackThickness(int i) {
/* 1 */             AbstractC2002oi abstractC2002oi = this.f4854a;
/* 5 */             if (abstractC2002oi.f14762a != i) {
/* 7 */                 abstractC2002oi.f14762a = i;
/* 9 */                 requestLayout();
                    }
                }

                public void setVisibilityAfterHide(int i) {
/* 1 */             if (i == 0 || i == 4 || i == 8) {
/* 17 */                this.f4860i = i;
                    } else {
/* 13 */                C1951n4.m6859j("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
                    }
                }
            }
