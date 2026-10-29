            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.widget.AppCompatSeekBar;
            
            /* JADX INFO: renamed from: eb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0874eb extends C0210cb {

                /* JADX INFO: renamed from: U */
                public PorterDuff.Mode f7597U;

                /* JADX INFO: renamed from: V */
                public boolean f7598V;

                /* JADX INFO: renamed from: W */
                public boolean f7599W;

                /* JADX INFO: renamed from: i */
                public final AppCompatSeekBar f7600i;

                /* JADX INFO: renamed from: v */
                public Drawable f7601v;

                /* JADX INFO: renamed from: w */
                public ColorStateList f7602w;

                public C0874eb(AppCompatSeekBar appCompatSeekBar) {
/* 2 */             super(appCompatSeekBar, 0);
/* 6 */             this.f7602w = null;
/* 8 */             this.f7597U = null;
/* 10 */            this.f7598V = false;
/* 12 */            this.f7599W = false;
/* 14 */            this.f7600i = appCompatSeekBar;
                }

                @Override // p000.C0210cb
                /* JADX INFO: renamed from: B */
                public final void mo1568B(AttributeSet attributeSet, int i) {
/* 1 */             super.mo1568B(attributeSet, i);
/* 4 */             AppCompatSeekBar appCompatSeekBar = this.f7600i;
/* 12 */            ac1 ac1VarM156H = ac1.m156H(appCompatSeekBar.getContext(), attributeSet, R$styleable.AppCompatSeekBar, i);
/* 19 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 34 */            e33.m3317m(appCompatSeekBar, appCompatSeekBar.getContext(), R$styleable.AppCompatSeekBar, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
/* 39 */            Drawable drawableM185o = ac1VarM156H.m185o(R$styleable.AppCompatSeekBar_android_thumb);
/* 43 */            if (drawableM185o != null) {
/* 45 */                appCompatSeekBar.setThumb(drawableM185o);
                    }
/* 50 */            Drawable drawableM184n = ac1VarM156H.m184n(R$styleable.AppCompatSeekBar_tickMark);
/* 54 */            Drawable drawable = this.f7601v;
/* 56 */            if (drawable != null) {
/* 59 */                drawable.setCallback(null);
                    }
/* 62 */            this.f7601v = drawableM184n;
/* 64 */            if (drawableM184n != null) {
/* 66 */                drawableM184n.setCallback(appCompatSeekBar);
/* 73 */                t90.m8739b(drawableM184n, appCompatSeekBar.getLayoutDirection());
/* 80 */                if (drawableM184n.isStateful()) {
/* 86 */                    drawableM184n.setState(appCompatSeekBar.getDrawableState());
                        }
/* 89 */                m3355O();
                    }
/* 92 */            appCompatSeekBar.invalidate();
/* 102 */           if (typedArray.hasValue(R$styleable.AppCompatSeekBar_tickMarkTintMode)) {
/* 117 */               this.f7597U = w90.m9485c(typedArray.getInt(R$styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f7597U);
/* 119 */               this.f7599W = true;
                    }
/* 127 */           if (typedArray.hasValue(R$styleable.AppCompatSeekBar_tickMarkTint)) {
/* 135 */               this.f7602w = ac1VarM156H.m183m(R$styleable.AppCompatSeekBar_tickMarkTint);
/* 137 */               this.f7598V = true;
                    }
/* 139 */           ac1VarM156H.m168J();
/* 142 */           m3355O();
                }

                /* JADX INFO: renamed from: O */
                public final void m3355O() {
/* 1 */             Drawable drawable = this.f7601v;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.f7598V || this.f7599W) {
/* 13 */                    Drawable drawableMutate = drawable.mutate();
/* 17 */                    this.f7601v = drawableMutate;
/* 21 */                    if (this.f7598V) {
/* 25 */                        s90.m8448h(drawableMutate, this.f7602w);
                            }
/* 30 */                    if (this.f7599W) {
/* 36 */                        s90.m8449i(this.f7601v, this.f7597U);
                            }
/* 45 */                    if (this.f7601v.isStateful()) {
/* 55 */                        this.f7601v.setState(this.f7600i.getDrawableState());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public final void m3356P(Canvas canvas) {
/* 3 */             if (this.f7601v != null) {
/* 5 */                 AppCompatSeekBar appCompatSeekBar = this.f7600i;
/* 7 */                 int max = appCompatSeekBar.getMax();
/* 12 */                if (max > 1) {
/* 16 */                    int intrinsicWidth = this.f7601v.getIntrinsicWidth();
/* 22 */                    int intrinsicHeight = this.f7601v.getIntrinsicHeight();
/* 31 */                    int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
/* 34 */                    int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
/* 40 */                    this.f7601v.setBounds(-i, -i2, i, i2);
/* 59 */                    float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
/* 60 */                    int iSave = canvas.save();
/* 76 */                    canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
/* 80 */                    for (int i3 = 0; i3 <= max; i3++) {
/* 84 */                        this.f7601v.draw(canvas);
/* 88 */                        canvas.translate(width, 0.0f);
                            }
/* 94 */                    canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
