            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.graphics.PointF;
            import android.util.DisplayMetrics;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.DecelerateInterpolator;
            import android.view.animation.LinearInterpolator;
            import p000.C1951n4;
            import p000.v12;
            import p000.x12;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0126d extends x12 {

                /* JADX INFO: renamed from: k */
                public PointF f1742k;

                /* JADX INFO: renamed from: l */
                public final DisplayMetrics f1743l;

                /* JADX INFO: renamed from: n */
                public float f1745n;

                /* JADX INFO: renamed from: i */
                public final LinearInterpolator f1740i = new LinearInterpolator();

                /* JADX INFO: renamed from: j */
                public final DecelerateInterpolator f1741j = new DecelerateInterpolator();

                /* JADX INFO: renamed from: m */
                public boolean f1744m = false;

                /* JADX INFO: renamed from: o */
                public int f1746o = 0;

                /* JADX INFO: renamed from: p */
                public int f1747p = 0;

                public C0126d(Context context) {
/* 33 */            this.f1743l = context.getResources().getDisplayMetrics();
                }

                /* JADX INFO: renamed from: e */
                public static int m937e(int i, int i2, int i3, int i4, int i5) {
/* 2 */             if (i5 == -1) {
/* 28 */                return i3 - i;
                    }
/* 4 */             if (i5 != 0) {
/* 7 */                 if (i5 == 1) {
/* 9 */                     return i4 - i2;
                        }
/* 13 */                C1951n4.m6859j("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
/* 16 */                return 0;
                    }
/* 18 */            int i6 = i3 - i;
/* 19 */            if (i6 > 0) {
/* 21 */                return i6;
                    }
/* 22 */            int i7 = i4 - i2;
/* 23 */            if (i7 < 0) {
/* 25 */                return i7;
                    }
/* 26 */            return 0;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0015  */
                /* JADX WARN: Code duplicated, block: B:25:0x0055  */
                @Override // p000.x12
                /* JADX INFO: renamed from: c */
                public void mo938c(View view, v12 v12Var) {
                    int i;
                    int iM937e;
/* 1 */             PointF pointF = this.f1742k;
/* 3 */             int i2 = -1;
/* 5 */             int iM937e2 = 0;
/* 7 */             if (pointF != null) {
/* 9 */                 float f = pointF.x;
/* 13 */                if (f == 0.0f) {
/* 22 */                    i = 0;
                        } else {
/* 20 */                    i = f > 0.0f ? 1 : -1;
                        }
                    } else {
/* 22 */                i = 0;
                    }
/* 23 */            AbstractC0133k abstractC0133k = this.f18904c;
/* 25 */            if (abstractC0133k == null || !abstractC0133k.mo832o()) {
/* 70 */                iM937e = 0;
                    } else {
/* 38 */                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 65 */                iM937e = m937e(AbstractC0133k.m971K(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, AbstractC0133k.m972L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, abstractC0133k.getPaddingLeft(), abstractC0133k.f1757Y - abstractC0133k.getPaddingRight(), i);
                    }
/* 71 */            PointF pointF2 = this.f1742k;
/* 73 */            if (pointF2 != null) {
/* 75 */                float f2 = pointF2.y;
/* 79 */                if (f2 == 0.0f) {
/* 86 */                    i2 = 0;
                        } else if (f2 > 0.0f) {
/* 84 */                    i2 = 1;
                        }
                    } else {
/* 86 */                i2 = 0;
                    }
/* 87 */            AbstractC0133k abstractC0133k2 = this.f18904c;
/* 89 */            if (abstractC0133k2 != null && abstractC0133k2.mo835p()) {
/* 102 */               RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 129 */               iM937e2 = m937e(AbstractC0133k.m973M(view) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, AbstractC0133k.m970J(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, abstractC0133k2.getPaddingTop(), abstractC0133k2.f1758Z - abstractC0133k2.getPaddingBottom(), i2);
                    }
/* 159 */           int iCeil = (int) Math.ceil(((double) mo940g((int) Math.sqrt((iM937e2 * iM937e2) + (iM937e * iM937e)))) / 0.3356d);
/* 160 */           if (iCeil > 0) {
/* 164 */               v12Var.f17835a = -iM937e;
/* 166 */               v12Var.f17836b = -iM937e2;
/* 168 */               v12Var.f17837c = iCeil;
/* 172 */               v12Var.f17839e = this.f1741j;
/* 174 */               v12Var.f17840f = true;
                    }
                }

                /* JADX INFO: renamed from: f */
                public float mo939f(DisplayMetrics displayMetrics) {
/* 6 */             return 25.0f / displayMetrics.densityDpi;
                }

                /* JADX INFO: renamed from: g */
                public int mo940g(int i) {
/* 1 */             float fAbs = Math.abs(i);
/* 8 */             if (!this.f1744m) {
/* 16 */                this.f1745n = mo939f(this.f1743l);
/* 19 */                this.f1744m = true;
                    }
/* 29 */            return (int) Math.ceil(fAbs * this.f1745n);
                }
            }
