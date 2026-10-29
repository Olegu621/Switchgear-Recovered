            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.text.TextPaint;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$string;
            import com.google.android.material.R$style;
            import com.google.android.material.badge.BadgeState$State;
            import java.lang.ref.WeakReference;
            import java.text.NumberFormat;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: mh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1927mh extends Drawable implements fn2 {

                /* JADX INFO: renamed from: Y */
                public static final int f13767Y = R$style.Widget_MaterialComponents_Badge;

                /* JADX INFO: renamed from: Z */
                public static final int f13768Z = R$attr.badgeStyle;

                /* JADX INFO: renamed from: U */
                public float f13769U;

                /* JADX INFO: renamed from: V */
                public float f13770V;

                /* JADX INFO: renamed from: W */
                public WeakReference f13771W;

                /* JADX INFO: renamed from: X */
                public WeakReference f13772X;

                /* JADX INFO: renamed from: a */
                public final WeakReference f13773a;

                /* JADX INFO: renamed from: b */
                public final fd1 f13774b;

                /* JADX INFO: renamed from: c */
                public final gn2 f13775c;

                /* JADX INFO: renamed from: d */
                public final Rect f13776d;

                /* JADX INFO: renamed from: e */
                public final C1964nh f13777e;

                /* JADX INFO: renamed from: f */
                public float f13778f;

                /* JADX INFO: renamed from: i */
                public float f13779i;

                /* JADX INFO: renamed from: v */
                public final int f13780v;

                /* JADX INFO: renamed from: w */
                public float f13781w;

                public C1927mh(Context context, BadgeState$State badgeState$State) {
                    dn2 dn2Var;
                    Context context2;
/* 6 */             WeakReference weakReference = new WeakReference(context);
/* 9 */             this.f13773a = weakReference;
/* 15 */            rn2.m8212c(context, rn2.f16200b, "Theme.MaterialComponents");
/* 23 */            this.f13776d = new Rect();
/* 27 */            fd1 fd1Var = new fd1();
/* 30 */            this.f13774b = fd1Var;
/* 34 */            gn2 gn2Var = new gn2(this);
/* 37 */            this.f13775c = gn2Var;
/* 39 */            Paint.Align align = Paint.Align.CENTER;
/* 41 */            TextPaint textPaint = gn2Var.f8747a;
/* 43 */            textPaint.setTextAlign(align);
/* 46 */            int i = R$style.TextAppearance_MaterialComponents_Badge;
/* 52 */            Context context3 = (Context) weakReference.get();
/* 54 */            if (context3 != null && gn2Var.f8752f != (dn2Var = new dn2(context3, i)) && (context2 = (Context) weakReference.get()) != null) {
/* 76 */                gn2Var.m3978b(dn2Var, context2);
/* 79 */                m6654g();
                    }
/* 84 */            C1964nh c1964nh = new C1964nh(context, badgeState$State);
/* 87 */            this.f13777e = c1964nh;
/* 89 */            BadgeState$State badgeState$State2 = c1964nh.f14263b;
/* 106 */           this.f13780v = ((int) Math.pow(10.0d, ((double) badgeState$State2.f4433f) - 1.0d)) - 1;
/* 108 */           gn2Var.f8750d = true;
/* 110 */           m6654g();
/* 113 */           invalidateSelf();
/* 116 */           gn2Var.f8750d = true;
/* 118 */           m6654g();
/* 121 */           invalidateSelf();
/* 128 */           textPaint.setAlpha(getAlpha());
/* 131 */           invalidateSelf();
/* 140 */           ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f4427b.intValue());
/* 148 */           if (fd1Var.f8151a.f7637c != colorStateListValueOf) {
/* 150 */               fd1Var.m3742n(colorStateListValueOf);
/* 153 */               invalidateSelf();
                    }
/* 162 */           textPaint.setColor(badgeState$State2.f4429c.intValue());
/* 165 */           invalidateSelf();
/* 168 */           WeakReference weakReference2 = this.f13771W;
/* 170 */           if (weakReference2 != null && weakReference2.get() != null) {
/* 184 */               View view = (View) this.f13771W.get();
/* 186 */               WeakReference weakReference3 = this.f13772X;
/* 198 */               m6653f(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
                    }
/* 201 */           m6654g();
/* 211 */           setVisible(badgeState$State2.f4421W.booleanValue(), false);
                }

                @Override // p000.fn2
                /* JADX INFO: renamed from: a */
                public final void mo3729a() {
/* 1 */             invalidateSelf();
                }

                /* JADX INFO: renamed from: b */
                public final String m6649b() {
/* 1 */             int iM6651d = m6651d();
/* 5 */             C1964nh c1964nh = this.f13777e;
/* 7 */             int i = this.f13780v;
/* 9 */             if (iM6651d <= i) {
/* 24 */                return NumberFormat.getInstance(c1964nh.f14263b.f4434i).format(m6651d());
                    }
/* 35 */            Context context = (Context) this.f13773a.get();
                    return context == null ? HttpUrl.FRAGMENT_ENCODE_SET : String.format(c1964nh.f14263b.f4434i, context.getString(R$string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
                }

                /* JADX INFO: renamed from: c */
                public final CharSequence m6650c() {
                    Context context;
/* 5 */             if (!isVisible()) {
/* 85 */                return null;
                    }
/* 8 */             boolean zM6652e = m6652e();
/* 12 */            C1964nh c1964nh = this.f13777e;
/* 14 */            if (!zM6652e) {
/* 89 */                return c1964nh.f14263b.f4435v;
                    }
/* 16 */            BadgeState$State badgeState$State = c1964nh.f14263b;
/* 18 */            BadgeState$State badgeState$State2 = c1964nh.f14263b;
/* 22 */            if (badgeState$State.f4436w == 0 || (context = (Context) this.f13773a.get()) == null) {
/* 85 */                return null;
                    }
/* 35 */            int iM6651d = m6651d();
/* 39 */            int i = this.f13780v;
                    return iM6651d <= i ? context.getResources().getQuantityString(badgeState$State2.f4436w, m6651d(), Integer.valueOf(m6651d())) : context.getString(badgeState$State2.f4419U, Integer.valueOf(i));
                }

                /* JADX INFO: renamed from: d */
                public final int m6651d() {
/* 5 */             if (m6652e()) {
/* 11 */                return this.f13777e.f14263b.f4432e;
                    }
/* 14 */            return 0;
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 9 */             if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
/* 73 */                return;
                    }
/* 26 */            this.f13774b.draw(canvas);
/* 33 */            if (m6652e()) {
/* 37 */                Rect rect = new Rect();
/* 40 */                String strM6649b = m6649b();
/* 44 */                gn2 gn2Var = this.f13775c;
/* 53 */                gn2Var.f8747a.getTextBounds(strM6649b, 0, strM6649b.length(), rect);
/* 70 */                canvas.drawText(strM6649b, this.f13778f, this.f13779i + (rect.height() / 2), gn2Var.f8747a);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m6652e() {
                    return this.f13777e.f14263b.f4432e != -1;
                }

                /* JADX INFO: renamed from: f */
                public final void m6653f(View view, FrameLayout frameLayout) {
/* 6 */             this.f13771W = new WeakReference(view);
/* 13 */            this.f13772X = new WeakReference(frameLayout);
/* 19 */            ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 22 */            viewGroup.setClipChildren(false);
/* 25 */            viewGroup.setClipToPadding(false);
/* 28 */            m6654g();
/* 31 */            invalidateSelf();
                }

                /* JADX INFO: renamed from: g */
                public final void m6654g() {
/* 7 */             Context context = (Context) this.f13773a.get();
/* 9 */             WeakReference weakReference = this.f13771W;
/* 21 */            View view = weakReference != null ? (View) weakReference.get() : null;
/* 22 */            if (context == null || view == null) {
/* 347 */               return;
                    }
/* 30 */            Rect rect = new Rect();
/* 33 */            Rect rect2 = this.f13776d;
/* 35 */            rect.set(rect2);
/* 40 */            Rect rect3 = new Rect();
/* 43 */            view.getDrawingRect(rect3);
/* 46 */            WeakReference weakReference2 = this.f13772X;
/* 54 */            FrameLayout frameLayout = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
/* 56 */            if (frameLayout != null) {
/* 59 */                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
                    }
/* 62 */            boolean zM6652e = m6652e();
/* 66 */            C1964nh c1964nh = this.f13777e;
/* 83 */            int iIntValue = zM6652e ? c1964nh.f14263b.f4426a0.intValue() : c1964nh.f14263b.f4423Y.intValue();
/* 87 */            BadgeState$State badgeState$State = c1964nh.f14263b;
/* 89 */            BadgeState$State badgeState$State2 = c1964nh.f14263b;
/* 91 */            float f = c1964nh.f14265d;
/* 99 */            int iIntValue2 = badgeState$State.f4430c0.intValue() + iIntValue;
/* 102 */           int iIntValue3 = badgeState$State2.f4420V.intValue();
/* 109 */           if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
/* 127 */               this.f13779i = rect3.bottom - iIntValue2;
                    } else {
/* 120 */               this.f13779i = rect3.top + iIntValue2;
                    }
/* 135 */           if (m6651d() <= 9) {
/* 141 */               if (!m6652e()) {
/* 143 */                   f = c1964nh.f14264c;
                        }
/* 145 */               this.f13781w = f;
/* 147 */               this.f13770V = f;
/* 149 */               this.f13769U = f;
                    } else {
/* 152 */               this.f13781w = f;
/* 154 */               this.f13770V = f;
/* 172 */               this.f13769U = (this.f13775c.m3977a(m6649b()) / 2.0f) + c1964nh.f14266e;
                    }
/* 189 */           int dimensionPixelSize = context.getResources().getDimensionPixelSize(m6652e() ? R$dimen.mtrl_badge_text_horizontal_edge_offset : R$dimen.mtrl_badge_horizontal_edge_offset);
/* 218 */           int iIntValue4 = badgeState$State.f4428b0.intValue() + (m6652e() ? badgeState$State.f4424Z.intValue() : badgeState$State2.f4422X.intValue());
/* 221 */           int iIntValue5 = badgeState$State2.f4420V.intValue();
/* 228 */           if (iIntValue5 == 8388659 || iIntValue5 == 8388691) {
/* 264 */               WeakHashMap weakHashMap = e33.f7494a;
/* 293 */               this.f13778f = view.getLayoutDirection() == 0 ? (rect3.left - this.f13769U) + dimensionPixelSize + iIntValue4 : ((rect3.right + this.f13769U) - dimensionPixelSize) - iIntValue4;
                    } else {
/* 232 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 261 */               this.f13778f = view.getLayoutDirection() == 0 ? ((rect3.right + this.f13769U) - dimensionPixelSize) - iIntValue4 : (rect3.left - this.f13769U) + dimensionPixelSize + iIntValue4;
                    }
/* 295 */           float f2 = this.f13778f;
/* 297 */           float f3 = this.f13779i;
/* 299 */           float f4 = this.f13769U;
/* 301 */           float f5 = this.f13770V;
/* 313 */           rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
/* 316 */           float f6 = this.f13781w;
/* 318 */           fd1 fd1Var = this.f13774b;
/* 324 */           sc2 sc2VarM8779f = fd1Var.f8151a.f7635a.m8779f();
/* 328 */           sc2VarM8779f.m8479b(f6);
/* 335 */           fd1Var.setShapeAppearanceModel(sc2VarM8779f.m8478a());
/* 342 */           if (rect.equals(rect2)) {
/* 347 */               return;
                    }
/* 344 */           fd1Var.setBounds(rect2);
                }

                @Override // android.graphics.drawable.Drawable
                public final int getAlpha() {
/* 5 */             return this.f13777e.f14263b.f4431d;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 3 */             return this.f13776d.height();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 3 */             return this.f13776d.width();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean isStateful() {
/* 1 */             return false;
                }

                @Override // android.graphics.drawable.Drawable, p000.fn2
                public final boolean onStateChange(int[] iArr) {
/* 1 */             return super.onStateChange(iArr);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 1 */             C1964nh c1964nh = this.f13777e;
/* 5 */             c1964nh.f14262a.f4431d = i;
/* 9 */             c1964nh.f14263b.f4431d = i;
/* 19 */            this.f13775c.f8747a.setAlpha(getAlpha());
/* 22 */            invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                }
            }
