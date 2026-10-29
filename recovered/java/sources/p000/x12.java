            package p000;

            import android.graphics.PointF;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.C0126d;
            import androidx.recyclerview.widget.RecyclerView;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class x12 {

                /* JADX INFO: renamed from: a */
                public int f18902a = -1;

                /* JADX INFO: renamed from: b */
                public RecyclerView f18903b;

                /* JADX INFO: renamed from: c */
                public AbstractC0133k f18904c;

                /* JADX INFO: renamed from: d */
                public boolean f18905d;

                /* JADX INFO: renamed from: e */
                public boolean f18906e;

                /* JADX INFO: renamed from: f */
                public View f18907f;

                /* JADX INFO: renamed from: g */
                public final v12 f18908g;

                /* JADX INFO: renamed from: h */
                public boolean f18909h;

                public x12() {
/* 9 */             v12 v12Var = new v12();
/* 12 */            v12Var.f17838d = -1;
/* 15 */            v12Var.f17840f = false;
/* 17 */            v12Var.f17841g = 0;
/* 19 */            v12Var.f17835a = 0;
/* 21 */            v12Var.f17836b = 0;
/* 25 */            v12Var.f17837c = Integer.MIN_VALUE;
/* 28 */            v12Var.f17839e = null;
/* 30 */            this.f18908g = v12Var;
                }

                /* JADX INFO: renamed from: a */
                public final PointF m9680a(int i) {
/* 1 */             Object obj = this.f18904c;
/* 5 */             if (obj instanceof w12) {
/* 9 */                 return ((w12) obj).mo817a(i);
                    }
/* 36 */            AbstractC1245n0.m4889q("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + w12.class.getCanonicalName());
/* 39 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
                /* JADX INFO: renamed from: b */
                public final void m9681b(int i, int i2) {
                    PointF pointFM9680a;
/* 1 */             RecyclerView recyclerView = this.f18903b;
/* 6 */             if (this.f18902a == -1 || recyclerView == null) {
/* 10 */                m9682d();
                    }
/* 17 */            if (this.f18905d && this.f18907f == null && this.f18904c != null && (pointFM9680a = m9680a(this.f18902a)) != null) {
/* 35 */                float f = pointFM9680a.x;
/* 39 */                if (f != 0.0f || pointFM9680a.y != 0.0f) {
/* 59 */                    recyclerView.m874b0((int) Math.signum(f), (int) Math.signum(pointFM9680a.y), null);
                        }
                    }
/* 63 */            this.f18905d = false;
/* 65 */            View view = this.f18907f;
/* 67 */            v12 v12Var = this.f18908g;
/* 69 */            if (view != null) {
/* 73 */                this.f18903b.getClass();
/* 76 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 88 */                if ((abstractC0137oM843J != null ? abstractC0137oM843J.m1018b() : -1) == this.f18902a) {
/* 90 */                    View view2 = this.f18907f;
/* 92 */                    y12 y12Var = recyclerView.f1624R0;
/* 94 */                    mo938c(view2, v12Var);
/* 97 */                    v12Var.m9189a(recyclerView);
/* 100 */                   m9682d();
                        } else {
/* 108 */                   AbstractC1245n0.m4876d("RecyclerView", "Passed over target position while smooth scrolling.");
/* 111 */                   this.f18907f = null;
                        }
                    }
/* 115 */           if (this.f18906e) {
/* 117 */               y12 y12Var2 = recyclerView.f1624R0;
/* 120 */               C0126d c0126d = (C0126d) this;
/* 131 */               if (c0126d.f18903b.f1637a0.m986G() == 0) {
/* 133 */                   c0126d.m9682d();
                        } else {
/* 138 */                   int i3 = c0126d.f1746o;
/* 140 */                   int i4 = i3 - i;
/* 143 */                   if (i3 * i4 <= 0) {
/* 145 */                       i4 = 0;
                            }
/* 146 */                   c0126d.f1746o = i4;
/* 148 */                   int i5 = c0126d.f1747p;
/* 150 */                   int i6 = i5 - i2;
/* 153 */                   if (i5 * i6 <= 0) {
/* 155 */                       i6 = 0;
                            }
/* 156 */                   c0126d.f1747p = i6;
/* 158 */                   if (i4 == 0 && i6 == 0) {
/* 164 */                       PointF pointFM9680a2 = c0126d.m9680a(c0126d.f18902a);
/* 168 */                       if (pointFM9680a2 != null) {
/* 170 */                           float f2 = pointFM9680a2.x;
/* 174 */                           if (f2 == 0.0f && pointFM9680a2.y == 0.0f) {
/* 254 */                               v12Var.f17838d = c0126d.f18902a;
/* 256 */                               c0126d.m9682d();
                                    } else {
/* 184 */                               float f3 = pointFM9680a2.y;
/* 193 */                               float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
/* 196 */                               float f4 = pointFM9680a2.x / fSqrt;
/* 197 */                               pointFM9680a2.x = f4;
/* 201 */                               float f5 = pointFM9680a2.y / fSqrt;
/* 202 */                               pointFM9680a2.y = f5;
/* 204 */                               c0126d.f1742k = pointFM9680a2;
/* 211 */                               c0126d.f1746o = (int) (f4 * 10000.0f);
/* 215 */                               c0126d.f1747p = (int) (f5 * 10000.0f);
/* 219 */                               int iMo940g = c0126d.mo940g(10000);
/* 230 */                               int i7 = (int) (c0126d.f1746o * 1.2f);
/* 235 */                               int i8 = (int) (c0126d.f1747p * 1.2f);
/* 239 */                               v12Var.f17835a = i7;
/* 241 */                               v12Var.f17836b = i8;
/* 243 */                               v12Var.f17837c = (int) (iMo940g * 1.2f);
/* 247 */                               v12Var.f17839e = c0126d.f1740i;
/* 249 */                               v12Var.f17840f = true;
                                    }
                                } else {
/* 254 */                           v12Var.f17838d = c0126d.f18902a;
/* 256 */                           c0126d.m9682d();
                                }
                            }
                        }
/* 261 */               boolean z = v12Var.f17838d >= 0;
/* 264 */               v12Var.m9189a(recyclerView);
/* 267 */               if (z && this.f18906e) {
/* 273 */                   this.f18905d = true;
/* 277 */                   recyclerView.f1621O0.m40a();
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public abstract void mo938c(View view, v12 v12Var);

                /* JADX INFO: renamed from: d */
                public final void m9682d() {
/* 3 */             if (this.f18906e) {
/* 7 */                 this.f18906e = false;
/* 10 */                C0126d c0126d = (C0126d) this;
/* 12 */                c0126d.f1747p = 0;
/* 14 */                c0126d.f1746o = 0;
/* 17 */                c0126d.f1742k = null;
/* 24 */                this.f18903b.f1624R0.f19437a = -1;
/* 26 */                this.f18907f = null;
/* 28 */                this.f18902a = -1;
/* 30 */                this.f18905d = false;
/* 32 */                AbstractC0133k abstractC0133k = this.f18904c;
/* 36 */                if (abstractC0133k.f1763e == this) {
/* 38 */                    abstractC0133k.f1763e = null;
                        }
/* 40 */                this.f18904c = null;
/* 42 */                this.f18903b = null;
                    }
                }
            }
