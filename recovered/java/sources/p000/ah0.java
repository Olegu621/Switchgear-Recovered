            package p000;

            import android.R;
            import android.animation.ValueAnimator;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.StateListDrawable;
            import androidx.recyclerview.widget.AbstractC0130h;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ah0 extends AbstractC0130h {

                /* JADX INFO: renamed from: C */
                public static final int[] f256C = {R.attr.state_pressed};

                /* JADX INFO: renamed from: D */
                public static final int[] f257D = new int[0];

                /* JADX INFO: renamed from: A */
                public int f258A;

                /* JADX INFO: renamed from: B */
                public final RunnableC2495ye f259B;

                /* JADX INFO: renamed from: a */
                public final int f260a;

                /* JADX INFO: renamed from: b */
                public final int f261b;

                /* JADX INFO: renamed from: c */
                public final StateListDrawable f262c;

                /* JADX INFO: renamed from: d */
                public final Drawable f263d;

                /* JADX INFO: renamed from: e */
                public final int f264e;

                /* JADX INFO: renamed from: f */
                public final int f265f;

                /* JADX INFO: renamed from: g */
                public final StateListDrawable f266g;

                /* JADX INFO: renamed from: h */
                public final Drawable f267h;

                /* JADX INFO: renamed from: i */
                public final int f268i;

                /* JADX INFO: renamed from: j */
                public final int f269j;

                /* JADX INFO: renamed from: k */
                public int f270k;

                /* JADX INFO: renamed from: l */
                public int f271l;

                /* JADX INFO: renamed from: m */
                public float f272m;

                /* JADX INFO: renamed from: n */
                public int f273n;

                /* JADX INFO: renamed from: o */
                public int f274o;

                /* JADX INFO: renamed from: p */
                public float f275p;

                /* JADX INFO: renamed from: s */
                public final RecyclerView f278s;

                /* JADX INFO: renamed from: z */
                public final ValueAnimator f285z;

                /* JADX INFO: renamed from: q */
                public int f276q = 0;

                /* JADX INFO: renamed from: r */
                public int f277r = 0;

                /* JADX INFO: renamed from: t */
                public boolean f279t = false;

                /* JADX INFO: renamed from: u */
                public boolean f280u = false;

                /* JADX INFO: renamed from: v */
                public int f281v = 0;

                /* JADX INFO: renamed from: w */
                public int f282w = 0;

                /* JADX INFO: renamed from: x */
                public final int[] f283x = new int[2];

                /* JADX INFO: renamed from: y */
                public final int[] f284y = new int[2];

                public ah0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
/* 31 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 35 */            this.f285z = valueAnimatorOfFloat;
/* 37 */            this.f258A = 0;
/* 42 */            RunnableC2495ye runnableC2495ye = new RunnableC2495ye(this, 7);
/* 45 */            this.f259B = runnableC2495ye;
/* 49 */            zg0 zg0Var = new zg0(this);
/* 52 */            this.f262c = stateListDrawable;
/* 54 */            this.f263d = drawable;
/* 56 */            this.f266g = stateListDrawable2;
/* 58 */            this.f267h = drawable2;
/* 68 */            this.f264e = Math.max(i, stateListDrawable.getIntrinsicWidth());
/* 78 */            this.f265f = Math.max(i, drawable.getIntrinsicWidth());
/* 88 */            this.f268i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
/* 98 */            this.f269j = Math.max(i, drawable2.getIntrinsicWidth());
/* 100 */           this.f260a = i2;
/* 102 */           this.f261b = i3;
/* 106 */           stateListDrawable.setAlpha(255);
/* 109 */           drawable.setAlpha(255);
/* 117 */           valueAnimatorOfFloat.addListener(new rg0(this));
/* 126 */           valueAnimatorOfFloat.addUpdateListener(new C2184sk(this, 4));
/* 129 */           RecyclerView recyclerView2 = this.f278s;
/* 131 */           if (recyclerView2 == recyclerView) {
/* 133 */               return;
                    }
/* 134 */           if (recyclerView2 != null) {
/* 136 */               ArrayList arrayList = recyclerView2.f1643c0;
/* 138 */               AbstractC0133k abstractC0133k = recyclerView2.f1637a0;
/* 140 */               if (abstractC0133k != null) {
/* 144 */                   abstractC0133k.mo829m("Cannot remove item decoration during a scroll  or layout");
                        }
/* 147 */               arrayList.remove(this);
/* 154 */               if (arrayList.isEmpty()) {
/* 163 */                   recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                        }
/* 166 */               recyclerView2.m862P();
/* 169 */               recyclerView2.requestLayout();
/* 172 */               RecyclerView recyclerView3 = this.f278s;
/* 176 */               recyclerView3.f1646d0.remove(this);
/* 181 */               if (recyclerView3.f1649e0 == this) {
/* 184 */                   recyclerView3.f1649e0 = null;
                        }
/* 188 */               ArrayList arrayList2 = this.f278s.f1626T0;
/* 190 */               if (arrayList2 != null) {
/* 192 */                   arrayList2.remove(zg0Var);
                        }
/* 197 */               this.f278s.removeCallbacks(runnableC2495ye);
                    }
/* 200 */           this.f278s = recyclerView;
/* 202 */           recyclerView.m880g(this);
/* 209 */           this.f278s.f1646d0.add(this);
/* 214 */           this.f278s.m882h(zg0Var);
                }

                /* JADX INFO: renamed from: f */
                public static int m280f(float f, float f2, int[] iArr, int i, int i2, int i3) {
/* 7 */             int i4 = iArr[1] - iArr[0];
/* 8 */             if (i4 != 0) {
/* 14 */                int i5 = i - i3;
/* 17 */                int i6 = (int) (((f2 - f) / i4) * i5);
/* 18 */                int i7 = i2 + i6;
/* 19 */                if (i7 < i5 && i7 >= 0) {
/* 23 */                    return i6;
                        }
                    }
/* 4 */             return 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0130h
                /* JADX INFO: renamed from: c */
                public final void mo281c(Canvas canvas) {
/* 1 */             int i = this.f276q;
/* 3 */             RecyclerView recyclerView = this.f278s;
/* 10 */            if (i != recyclerView.getWidth() || this.f277r != recyclerView.getHeight()) {
/* 172 */               this.f276q = recyclerView.getWidth();
/* 178 */               this.f277r = recyclerView.getHeight();
/* 180 */               m284g(0);
/* 183 */               return;
                    }
/* 24 */            if (this.f258A != 0) {
/* 29 */                if (this.f279t) {
/* 31 */                    int i2 = this.f276q;
/* 33 */                    int i3 = this.f264e;
/* 35 */                    int i4 = i2 - i3;
/* 36 */                    int i5 = this.f271l;
/* 38 */                    int i6 = this.f270k;
/* 42 */                    int i7 = i5 - (i6 / 2);
/* 43 */                    StateListDrawable stateListDrawable = this.f262c;
/* 45 */                    stateListDrawable.setBounds(0, 0, i3, i6);
/* 48 */                    int i8 = this.f265f;
/* 50 */                    int i9 = this.f277r;
/* 52 */                    Drawable drawable = this.f263d;
/* 54 */                    drawable.setBounds(0, 0, i8, i9);
/* 57 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 64 */                    if (recyclerView.getLayoutDirection() == 1) {
/* 66 */                        drawable.draw(canvas);
/* 71 */                        canvas.translate(i3, i7);
/* 78 */                        canvas.scale(-1.0f, 1.0f);
/* 81 */                        stateListDrawable.draw(canvas);
/* 84 */                        canvas.scale(-1.0f, 1.0f);
/* 91 */                        canvas.translate(-i3, -i7);
                            } else {
/* 96 */                        canvas.translate(i4, 0.0f);
/* 99 */                        drawable.draw(canvas);
/* 103 */                       canvas.translate(0.0f, i7);
/* 106 */                       stateListDrawable.draw(canvas);
/* 113 */                       canvas.translate(-i4, -i7);
                            }
                        }
/* 118 */               if (this.f280u) {
/* 120 */                   int i10 = this.f277r;
/* 122 */                   int i11 = this.f268i;
/* 124 */                   int i12 = i10 - i11;
/* 125 */                   int i13 = this.f274o;
/* 127 */                   int i14 = this.f273n;
/* 131 */                   int i15 = i13 - (i14 / 2);
/* 132 */                   StateListDrawable stateListDrawable2 = this.f266g;
/* 134 */                   stateListDrawable2.setBounds(0, 0, i14, i11);
/* 137 */                   int i16 = this.f276q;
/* 139 */                   int i17 = this.f269j;
/* 141 */                   Drawable drawable2 = this.f267h;
/* 143 */                   drawable2.setBounds(0, 0, i16, i17);
/* 147 */                   canvas.translate(0.0f, i12);
/* 150 */                   drawable2.draw(canvas);
/* 154 */                   canvas.translate(i15, 0.0f);
/* 157 */                   stateListDrawable2.draw(canvas);
/* 164 */                   canvas.translate(-i15, -i12);
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final boolean m282d(float f, float f2) {
/* 9 */             if (f2 < this.f277r - this.f268i) {
/* 34 */                return false;
                    }
/* 11 */            int i = this.f274o;
/* 13 */            int i2 = this.f273n;
                    return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
                }

                /* JADX INFO: renamed from: e */
                public final boolean m283e(float f, float f2) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 5 */             int layoutDirection = this.f278s.getLayoutDirection();
/* 9 */             int i = this.f264e;
/* 12 */            if (layoutDirection == 1) {
/* 17 */                if (f > i) {
/* 48 */                    return false;
                        }
                    } else if (f < this.f276q - i) {
/* 48 */                return false;
                    }
/* 28 */            int i2 = this.f271l;
/* 32 */            int i3 = this.f270k / 2;
                    return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
                }

                /* JADX INFO: renamed from: g */
                public final void m284g(int i) {
/* 1 */             RecyclerView recyclerView = this.f278s;
/* 3 */             RunnableC2495ye runnableC2495ye = this.f259B;
/* 5 */             StateListDrawable stateListDrawable = this.f262c;
/* 8 */             if (i == 2 && this.f281v != 2) {
/* 16 */                stateListDrawable.setState(f256C);
/* 19 */                recyclerView.removeCallbacks(runnableC2495ye);
                    }
/* 22 */            if (i == 0) {
/* 24 */                recyclerView.invalidate();
                    } else {
/* 28 */                m285h();
                    }
/* 33 */            if (this.f281v == 2 && i != 2) {
/* 39 */                stateListDrawable.setState(f257D);
/* 42 */                recyclerView.removeCallbacks(runnableC2495ye);
/* 47 */                recyclerView.postDelayed(runnableC2495ye, 1200L);
                    } else if (i == 1) {
/* 54 */                recyclerView.removeCallbacks(runnableC2495ye);
/* 59 */                recyclerView.postDelayed(runnableC2495ye, 1500L);
                    }
/* 62 */            this.f281v = i;
                }

                /* JADX INFO: renamed from: h */
                public final void m285h() {
/* 1 */             int i = this.f258A;
/* 3 */             ValueAnimator valueAnimator = this.f285z;
/* 5 */             if (i != 0) {
/* 8 */                 if (i != 3) {
/* 10 */                    return;
                        } else {
/* 11 */                    valueAnimator.cancel();
                        }
                    }
/* 15 */            this.f258A = 1;
/* 37 */            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
/* 42 */            valueAnimator.setDuration(500L);
/* 47 */            valueAnimator.setStartDelay(0L);
/* 50 */            valueAnimator.start();
                }
            }
