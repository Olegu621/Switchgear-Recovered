            package androidx.constraintlayout.utils.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 70 */    public class MockView extends View {

                /* JADX INFO: renamed from: U */
                public int f972U;

                /* JADX INFO: renamed from: V */
                public int f973V;

                /* JADX INFO: renamed from: a */
                public final Paint f974a;

                /* JADX INFO: renamed from: b */
                public final Paint f975b;

                /* JADX INFO: renamed from: c */
                public final Paint f976c;

                /* JADX INFO: renamed from: d */
                public boolean f977d;

                /* JADX INFO: renamed from: e */
                public boolean f978e;

                /* JADX INFO: renamed from: f */
                public String f979f;

                /* JADX INFO: renamed from: i */
                public final Rect f980i;

                /* JADX INFO: renamed from: v */
                public int f981v;

                /* JADX INFO: renamed from: w */
                public int f982w;

                public MockView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f974a = new Paint();
/* 16 */            this.f975b = new Paint();
/* 23 */            this.f976c = new Paint();
/* 26 */            this.f977d = true;
/* 28 */            this.f978e = true;
/* 31 */            this.f979f = null;
/* 38 */            this.f980i = new Rect();
/* 47 */            this.f981v = Color.argb(255, 0, 0, 0);
/* 55 */            this.f982w = Color.argb(255, 200, 200, 200);
/* 63 */            this.f972U = Color.argb(255, 50, 50, 50);
/* 66 */            this.f973V = 4;
/* 68 */            m495a(context, attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final void m495a(Context context, AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 5 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MockView);
/* 9 */                 int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 14 */                for (int i = 0; i < indexCount; i++) {
/* 16 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 22 */                    if (index == R$styleable.MockView_mock_label) {
/* 28 */                        this.f979f = typedArrayObtainStyledAttributes.getString(index);
                            } else if (index == R$styleable.MockView_mock_showDiagonals) {
/* 41 */                        this.f977d = typedArrayObtainStyledAttributes.getBoolean(index, this.f977d);
                            } else if (index == R$styleable.MockView_mock_diagonalsColor) {
/* 54 */                        this.f981v = typedArrayObtainStyledAttributes.getColor(index, this.f981v);
                            } else if (index == R$styleable.MockView_mock_labelBackgroundColor) {
/* 67 */                        this.f972U = typedArrayObtainStyledAttributes.getColor(index, this.f972U);
                            } else if (index == R$styleable.MockView_mock_labelColor) {
/* 80 */                        this.f982w = typedArrayObtainStyledAttributes.getColor(index, this.f982w);
                            } else if (index == R$styleable.MockView_mock_showLabel) {
/* 93 */                        this.f978e = typedArrayObtainStyledAttributes.getBoolean(index, this.f978e);
                            }
                        }
/* 98 */                typedArrayObtainStyledAttributes.recycle();
                    }
/* 103 */           if (this.f979f == null) {
                        try {
/* 117 */                   this.f979f = context.getResources().getResourceEntryName(getId());
                        } catch (Exception unused) {
                        }
                    }
/* 119 */           int i2 = this.f981v;
/* 121 */           Paint paint = this.f974a;
/* 123 */           paint.setColor(i2);
/* 127 */           paint.setAntiAlias(true);
/* 130 */           int i3 = this.f982w;
/* 132 */           Paint paint2 = this.f975b;
/* 134 */           paint2.setColor(i3);
/* 137 */           paint2.setAntiAlias(true);
/* 144 */           this.f976c.setColor(this.f972U);
/* 168 */           this.f973V = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f973V);
                }

                @Override // android.view.View
                public void onDraw(Canvas canvas) {
                    Canvas canvas2;
/* 1 */             super.onDraw(canvas);
/* 4 */             int width = getWidth();
/* 8 */             int height = getHeight();
/* 14 */            if (this.f977d) {
/* 16 */                width--;
/* 18 */                height--;
                        float f = width;
                        float f2 = height;
/* 27 */                canvas2 = canvas;
/* 28 */                canvas2.drawLine(0.0f, 0.0f, f, f2, this.f974a);
/* 36 */                canvas2.drawLine(0.0f, f2, f, 0.0f, this.f974a);
/* 44 */                canvas2.drawLine(0.0f, 0.0f, f, 0.0f, this.f974a);
/* 51 */                canvas2.drawLine(f, 0.0f, f, f2, this.f974a);
/* 58 */                canvas2.drawLine(f, f2, 0.0f, f2, this.f974a);
/* 67 */                canvas2.drawLine(0.0f, f2, 0.0f, 0.0f, this.f974a);
                    } else {
/* 71 */                canvas2 = canvas;
                    }
/* 72 */            String str = this.f979f;
/* 74 */            if (str == null || !this.f978e) {
/* 146 */               return;
                    }
/* 81 */            int length = str.length();
/* 85 */            Paint paint = this.f975b;
/* 87 */            Rect rect = this.f980i;
/* 89 */            paint.getTextBounds(str, 0, length, rect);
/* 100 */           float fWidth = (width - rect.width()) / 2.0f;
/* 113 */           float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
/* 116 */           rect.offset((int) fWidth, (int) fHeight);
/* 119 */           int i = rect.left;
/* 121 */           int i2 = this.f973V;
/* 133 */           rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
/* 138 */           canvas2.drawRect(rect, this.f976c);
/* 143 */           canvas2.drawText(this.f979f, fWidth, fHeight, paint);
                }

/* 71 */        public MockView(Context context, AttributeSet attributeSet, int i) {
/* 72 */            super(context, attributeSet, i);
/* 73 */            this.f974a = new Paint();
/* 74 */            this.f975b = new Paint();
/* 75 */            this.f976c = new Paint();
/* 76 */            this.f977d = true;
/* 77 */            this.f978e = true;
/* 78 */            this.f979f = null;
/* 79 */            this.f980i = new Rect();
/* 80 */            this.f981v = Color.argb(255, 0, 0, 0);
/* 81 */            this.f982w = Color.argb(255, 200, 200, 200);
/* 82 */            this.f972U = Color.argb(255, 50, 50, 50);
/* 83 */            this.f973V = 4;
/* 84 */            m495a(context, attributeSet);
                }
            }
