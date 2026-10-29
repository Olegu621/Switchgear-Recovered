            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.FrameLayout;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$styleable;
            import p000.C2202t1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class ActionBarContainer extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public boolean f396a;

                /* JADX INFO: renamed from: b */
                public View f397b;

                /* JADX INFO: renamed from: c */
                public View f398c;

                /* JADX INFO: renamed from: d */
                public Drawable f399d;

                /* JADX INFO: renamed from: e */
                public Drawable f400e;

                /* JADX INFO: renamed from: f */
                public Drawable f401f;

                /* JADX INFO: renamed from: i */
                public final boolean f402i;

                /* JADX INFO: renamed from: v */
                public boolean f403v;

                /* JADX INFO: renamed from: w */
                public final int f404w;

                public ActionBarContainer(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             setBackground(new C2202t1(this));
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
/* 24 */            this.f399d = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
/* 32 */            this.f400e = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
/* 41 */            this.f404w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
/* 49 */            boolean z = true;
/* 50 */            if (getId() == R$id.split_action_bar) {
/* 52 */                this.f402i = true;
/* 60 */                this.f401f = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
                    }
/* 62 */            typedArrayObtainStyledAttributes.recycle();
/* 68 */            if (!this.f402i ? this.f399d != null || this.f400e != null : this.f401f != null) {
/* 75 */                z = false;
                    }
/* 85 */            setWillNotDraw(z);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             Drawable drawable = this.f399d;
/* 6 */             if (drawable != null && drawable.isStateful()) {
/* 20 */                this.f399d.setState(getDrawableState());
                    }
/* 23 */            Drawable drawable2 = this.f400e;
/* 25 */            if (drawable2 != null && drawable2.isStateful()) {
/* 39 */                this.f400e.setState(getDrawableState());
                    }
/* 42 */            Drawable drawable3 = this.f401f;
/* 44 */            if (drawable3 == null || !drawable3.isStateful()) {
/* 61 */                return;
                    }
/* 58 */            this.f401f.setState(getDrawableState());
                }

                public View getTabContainer() {
/* 1 */             return null;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 4 */             Drawable drawable = this.f399d;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.jumpToCurrentState();
                    }
/* 11 */            Drawable drawable2 = this.f400e;
/* 13 */            if (drawable2 != null) {
/* 15 */                drawable2.jumpToCurrentState();
                    }
/* 18 */            Drawable drawable3 = this.f401f;
/* 20 */            if (drawable3 != null) {
/* 22 */                drawable3.jumpToCurrentState();
                    }
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 10 */            this.f397b = findViewById(R$id.action_bar);
/* 18 */            this.f398c = findViewById(R$id.action_context_bar);
                }

                @Override // android.view.View
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             super.onHoverEvent(motionEvent);
/* 4 */             return true;
                }

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return this.f396a || super.onInterceptTouchEvent(motionEvent);
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 6 */             boolean z2 = true;
/* 8 */             if (this.f402i) {
/* 10 */                Drawable drawable = this.f401f;
/* 12 */                if (drawable != null) {
/* 22 */                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        } else {
/* 26 */                    z2 = false;
                        }
                    } else {
/* 30 */                if (this.f399d == null) {
/* 116 */                   z2 = false;
                        } else if (this.f397b.getVisibility() == 0) {
/* 66 */                    this.f399d.setBounds(this.f397b.getLeft(), this.f397b.getTop(), this.f397b.getRight(), this.f397b.getBottom());
                        } else {
/* 70 */                    View view = this.f398c;
/* 72 */                    if (view == null || view.getVisibility() != 0) {
/* 112 */                       this.f399d.setBounds(0, 0, 0, 0);
                            } else {
/* 106 */                       this.f399d.setBounds(this.f398c.getLeft(), this.f398c.getTop(), this.f398c.getRight(), this.f398c.getBottom());
                            }
                        }
/* 117 */               this.f403v = false;
                    }
/* 119 */           if (z2) {
/* 121 */               invalidate();
                    }
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 3 */             if (this.f397b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f404w) >= 0) {
/* 25 */                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
                    }
/* 29 */            super.onMeasure(i, i2);
/* 34 */            if (this.f397b == null) {
/* 36 */                return;
                    }
/* 37 */            View.MeasureSpec.getMode(i2);
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             super.onTouchEvent(motionEvent);
/* 4 */             return true;
                }

                public void setPrimaryBackground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f399d;
/* 3 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
/* 11 */                unscheduleDrawable(this.f399d);
                    }
/* 14 */            this.f399d = drawable;
/* 16 */            if (drawable != null) {
/* 18 */                drawable.setCallback(this);
/* 21 */                View view = this.f397b;
/* 23 */                if (view != null) {
/* 49 */                    this.f399d.setBounds(view.getLeft(), this.f397b.getTop(), this.f397b.getRight(), this.f397b.getBottom());
                        }
                    }
/* 54 */            boolean z = false;
/* 56 */            if (!this.f402i ? !(this.f399d != null || this.f400e != null) : this.f401f == null) {
/* 62 */                z = true;
                    }
/* 73 */            setWillNotDraw(z);
/* 76 */            invalidate();
/* 79 */            invalidateOutline();
                }

                public void setSplitBackground(Drawable drawable) {
                    Drawable drawable2;
/* 1 */             Drawable drawable3 = this.f401f;
/* 3 */             if (drawable3 != null) {
/* 6 */                 drawable3.setCallback(null);
/* 11 */                unscheduleDrawable(this.f401f);
                    }
/* 14 */            this.f401f = drawable;
/* 16 */            boolean z = this.f402i;
/* 18 */            boolean z2 = false;
/* 19 */            if (drawable != null) {
/* 21 */                drawable.setCallback(this);
/* 24 */                if (z && (drawable2 = this.f401f) != null) {
/* 38 */                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
/* 42 */            if (!z ? !(this.f399d != null || this.f400e != null) : this.f401f == null) {
/* 48 */                z2 = true;
                    }
/* 59 */            setWillNotDraw(z2);
/* 62 */            invalidate();
/* 65 */            invalidateOutline();
                }

                public void setStackedBackground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f400e;
/* 4 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
/* 11 */                unscheduleDrawable(this.f400e);
                    }
/* 14 */            this.f400e = drawable;
/* 16 */            if (drawable != null) {
/* 18 */                drawable.setCallback(this);
/* 23 */                if (this.f403v && this.f400e != null) {
/* 30 */                    throw null;
                        }
                    }
/* 33 */            boolean z = false;
/* 35 */            if (!this.f402i ? !(this.f399d != null || this.f400e != null) : this.f401f == null) {
/* 41 */                z = true;
                    }
/* 52 */            setWillNotDraw(z);
/* 55 */            invalidate();
/* 58 */            invalidateOutline();
                }

                public void setTabContainer(AbstractC0065e abstractC0065e) {
                }

                public void setTransitioning(boolean z) {
/* 1 */             this.f396a = z;
/* 10 */            setDescendantFocusability(z ? 393216 : 262144);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 9 */             boolean z = i == 0;
/* 10 */            Drawable drawable = this.f399d;
/* 12 */            if (drawable != null) {
/* 14 */                drawable.setVisible(z, false);
                    }
/* 17 */            Drawable drawable2 = this.f400e;
/* 19 */            if (drawable2 != null) {
/* 21 */                drawable2.setVisible(z, false);
                    }
/* 24 */            Drawable drawable3 = this.f401f;
/* 26 */            if (drawable3 != null) {
/* 28 */                drawable3.setVisible(z, false);
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
/* 1 */             if (i != 0) {
/* 3 */                 return super.startActionModeForChild(view, callback, i);
                    }
/* 8 */             return null;
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f399d;
/* 3 */             boolean z = this.f402i;
/* 5 */             if (drawable == drawable2 && !z) {
/* 29 */                return true;
                    }
/* 11 */            if (drawable == this.f400e && this.f403v) {
/* 29 */                return true;
                    }
                    return (drawable == this.f401f && z) || super.verifyDrawable(drawable);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 9 */         public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
/* 10 */            return null;
                }
            }
