            package androidx.constraintlayout.utils.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Path;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import android.view.ViewOutlineProvider;
            import androidx.appcompat.widget.AppCompatButton;
            import androidx.constraintlayout.widget.R$styleable;
            import p000.wj1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public class MotionButton extends AppCompatButton {

                /* JADX INFO: renamed from: d */
                public float f983d;

                /* JADX INFO: renamed from: e */
                public float f984e;

                /* JADX INFO: renamed from: f */
                public Path f985f;

                /* JADX INFO: renamed from: i */
                public ViewOutlineProvider f986i;

                /* JADX INFO: renamed from: v */
                public RectF f987v;

                public MotionButton(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f983d = 0.0f;
/* 9 */             this.f984e = Float.NaN;
/* 11 */            m496a(attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final void m496a(AttributeSet attributeSet) {
/* 2 */             setPadding(0, 0, 0, 0);
/* 5 */             if (attributeSet != null) {
/* 13 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
/* 17 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 21 */                for (int i = 0; i < indexCount; i++) {
/* 23 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 30 */                    if (index == R$styleable.ImageFilterView_round) {
/* 36 */                        setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_roundPercent) {
/* 48 */                        setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            }
                        }
/* 54 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public float getRound() {
/* 1 */             return this.f984e;
                }

                public float getRoundPercent() {
/* 1 */             return this.f983d;
                }

                public void setRound(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 this.f984e = f;
/* 9 */                 float f2 = this.f983d;
/* 13 */                this.f983d = -1.0f;
/* 15 */                setRoundPercent(f2);
/* 18 */                return;
                    }
/* 29 */            boolean z = this.f984e != f;
/* 30 */            this.f984e = f;
/* 35 */            if (f != 0.0f) {
/* 39 */                if (this.f985f == null) {
/* 46 */                    this.f985f = new Path();
                        }
/* 50 */                if (this.f987v == null) {
/* 57 */                    this.f987v = new RectF();
                        }
/* 61 */                if (this.f986i == null) {
/* 66 */                    wj1 wj1Var = new wj1(this, 1);
/* 69 */                    this.f986i = wj1Var;
/* 71 */                    setOutlineProvider(wj1Var);
                        }
/* 74 */                setClipToOutline(true);
/* 89 */                this.f987v.set(0.0f, 0.0f, getWidth(), getHeight());
/* 94 */                this.f985f.reset();
/* 97 */                Path path = this.f985f;
/* 99 */                RectF rectF = this.f987v;
/* 101 */               float f3 = this.f984e;
/* 105 */               path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                    } else {
/* 109 */               setClipToOutline(false);
                    }
/* 112 */           if (z) {
/* 114 */               invalidateOutline();
                    }
                }

                public void setRoundPercent(float f) {
/* 11 */            boolean z = this.f983d != f;
/* 12 */            this.f983d = f;
/* 17 */            if (f != 0.0f) {
/* 21 */                if (this.f985f == null) {
/* 28 */                    this.f985f = new Path();
                        }
/* 32 */                if (this.f987v == null) {
/* 39 */                    this.f987v = new RectF();
                        }
/* 43 */                if (this.f986i == null) {
/* 48 */                    wj1 wj1Var = new wj1(this, 0);
/* 51 */                    this.f986i = wj1Var;
/* 53 */                    setOutlineProvider(wj1Var);
                        }
/* 56 */                setClipToOutline(true);
/* 59 */                int width = getWidth();
/* 63 */                int height = getHeight();
/* 77 */                float fMin = (Math.min(width, height) * this.f983d) / 2.0f;
/* 82 */                this.f987v.set(0.0f, 0.0f, width, height);
/* 87 */                this.f985f.reset();
/* 96 */                this.f985f.addRoundRect(this.f987v, fMin, fMin, Path.Direction.CW);
                    } else {
/* 100 */               setClipToOutline(false);
                    }
/* 103 */           if (z) {
/* 105 */               invalidateOutline();
                    }
                }

/* 14 */        public MotionButton(Context context, AttributeSet attributeSet, int i) {
/* 15 */            super(context, attributeSet, i);
/* 16 */            this.f983d = 0.0f;
/* 17 */            this.f984e = Float.NaN;
/* 18 */            m496a(attributeSet);
                }
            }
