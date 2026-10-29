            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.Typeface;
            import android.util.AttributeSet;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class Placeholder extends View {

                /* JADX INFO: renamed from: a */
                public int f1154a;

                /* JADX INFO: renamed from: b */
                public View f1155b;

                /* JADX INFO: renamed from: c */
                public int f1156c;

                public Placeholder(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1154a = -1;
/* 8 */             this.f1155b = null;
/* 11 */            this.f1156c = 4;
/* 13 */            m521a(attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final void m521a(AttributeSet attributeSet) {
/* 3 */             super.setVisibility(this.f1156c);
/* 7 */             this.f1154a = -1;
/* 9 */             if (attributeSet != null) {
/* 17 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_placeholder);
/* 21 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 26 */                for (int i = 0; i < indexCount; i++) {
/* 28 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 34 */                    if (index == R$styleable.ConstraintLayout_placeholder_content) {
/* 42 */                        this.f1154a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1154a);
                            } else if (index == R$styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
/* 55 */                        this.f1156c = typedArrayObtainStyledAttributes.getInt(index, this.f1156c);
                            }
                        }
/* 60 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public View getContent() {
/* 1 */             return this.f1155b;
                }

                public int getEmptyVisibility() {
/* 1 */             return this.f1156c;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 5 */             if (isInEditMode()) {
/* 9 */                 canvas.drawRGB(223, 223, 223);
/* 14 */                Paint paint = new Paint();
/* 21 */                paint.setARGB(255, 210, 210, 210);
/* 26 */                paint.setTextAlign(Paint.Align.CENTER);
/* 36 */                paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
/* 41 */                Rect rect = new Rect();
/* 44 */                canvas.getClipBounds(rect);
/* 52 */                paint.setTextSize(rect.height());
/* 55 */                int iHeight = rect.height();
/* 59 */                int iWidth = rect.width();
/* 65 */                paint.setTextAlign(Paint.Align.LEFT);
/* 71 */                paint.getTextBounds("?", 0, 1, rect);
/* 102 */               canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
                    }
                }

                public void setContentId(int i) {
                    View viewFindViewById;
/* 3 */             if (this.f1154a == i) {
/* 49 */                return;
                    }
/* 6 */             View view = this.f1155b;
/* 8 */             if (view != null) {
/* 11 */                view.setVisibility(0);
/* 22 */                ((ConstraintLayout.LayoutParams) this.f1155b.getLayoutParams()).f1107f0 = false;
/* 25 */                this.f1155b = null;
                    }
/* 27 */            this.f1154a = i;
/* 30 */            if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
/* 49 */                return;
                    }
/* 46 */            viewFindViewById.setVisibility(8);
                }

                public void setEmptyVisibility(int i) {
/* 1 */             this.f1156c = i;
                }

/* 16 */        public Placeholder(Context context, AttributeSet attributeSet, int i) {
/* 17 */            super(context, attributeSet, i);
/* 18 */            this.f1154a = -1;
/* 19 */            this.f1155b = null;
/* 20 */            this.f1156c = 4;
/* 21 */            m521a(attributeSet);
                }
            }
