            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Build;
            import android.util.AttributeSet;
            import androidx.cardview.widget.CardView;
            import com.google.android.material.R$id;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.card.MaterialCardView;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zc1 {

                /* JADX INFO: renamed from: t */
                public static final double f20070t = Math.cos(Math.toRadians(45.0d));

                /* JADX INFO: renamed from: u */
                public static final ColorDrawable f20071u;

                /* JADX INFO: renamed from: a */
                public final MaterialCardView f20072a;

                /* JADX INFO: renamed from: b */
                public final Rect f20073b;

                /* JADX INFO: renamed from: c */
                public final fd1 f20074c;

                /* JADX INFO: renamed from: d */
                public final fd1 f20075d;

                /* JADX INFO: renamed from: e */
                public int f20076e;

                /* JADX INFO: renamed from: f */
                public int f20077f;

                /* JADX INFO: renamed from: g */
                public int f20078g;

                /* JADX INFO: renamed from: h */
                public int f20079h;

                /* JADX INFO: renamed from: i */
                public Drawable f20080i;

                /* JADX INFO: renamed from: j */
                public Drawable f20081j;

                /* JADX INFO: renamed from: k */
                public ColorStateList f20082k;

                /* JADX INFO: renamed from: l */
                public ColorStateList f20083l;

                /* JADX INFO: renamed from: m */
                public tc2 f20084m;

                /* JADX INFO: renamed from: n */
                public ColorStateList f20085n;

                /* JADX INFO: renamed from: o */
                public RippleDrawable f20086o;

                /* JADX INFO: renamed from: p */
                public LayerDrawable f20087p;

                /* JADX INFO: renamed from: q */
                public fd1 f20088q;

                /* JADX INFO: renamed from: r */
                public boolean f20089r;

                /* JADX INFO: renamed from: s */
                public boolean f20090s;

                static {
/* 29 */            f20071u = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
                }

                public zc1(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = MaterialCardView.f4566b0;
/* 11 */            this.f20073b = new Rect();
/* 14 */            this.f20089r = false;
/* 16 */            this.f20072a = materialCardView;
/* 24 */            fd1 fd1Var = new fd1(materialCardView.getContext(), attributeSet, i, i2);
/* 27 */            this.f20074c = fd1Var;
/* 33 */            fd1Var.m3739k(materialCardView.getContext());
/* 36 */            fd1Var.m3745q();
/* 43 */            sc2 sc2VarM8779f = fd1Var.f8151a.f7635a.m8779f();
/* 55 */            TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R$styleable.CardView, i, R$style.CardView);
/* 65 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardCornerRadius)) {
/* 74 */                sc2VarM8779f.m8479b(typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f));
                    }
/* 82 */            this.f20075d = new fd1();
/* 88 */            m10331g(sc2VarM8779f.m8478a());
/* 91 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: b */
                public static float m10325b(w11 w11Var, float f) {
/* 3 */             if (w11Var instanceof g52) {
/* 12 */                return (float) ((1.0d - f20070t) * ((double) f));
                    }
/* 16 */            if (w11Var instanceof r30) {
/* 20 */                return f / 2.0f;
                    }
/* 22 */            return 0.0f;
                }

                /* JADX INFO: renamed from: a */
                public final float m10326a() {
/* 3 */             w11 w11Var = this.f20084m.f17032a;
/* 5 */             fd1 fd1Var = this.f20074c;
/* 89 */            return Math.max(Math.max(m10325b(w11Var, fd1Var.m3737i()), m10325b(this.f20084m.f17033b, fd1Var.f8151a.f7635a.f17037f.mo47a(fd1Var.m3735g()))), Math.max(m10325b(this.f20084m.f17034c, fd1Var.f8151a.f7635a.f17038g.mo47a(fd1Var.m3735g())), m10325b(this.f20084m.f17035d, fd1Var.f8151a.f7635a.f17039h.mo47a(fd1Var.m3735g()))));
                }

                /* JADX INFO: renamed from: c */
                public final LayerDrawable m10327c() {
/* 3 */             if (this.f20086o == null) {
/* 5 */                 int[] iArr = c52.f2721a;
/* 14 */                this.f20088q = new fd1(this.f20084m);
/* 26 */                this.f20086o = new RippleDrawable(this.f20082k, null, this.f20088q);
                    }
/* 30 */            if (this.f20087p == null) {
/* 52 */                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f20086o, this.f20075d, this.f20081j});
/* 55 */                this.f20087p = layerDrawable;
/* 59 */                layerDrawable.setId(2, R$id.mtrl_card_checked_layer_id);
                    }
/* 62 */            return this.f20087p;
                }

                /* JADX INFO: renamed from: d */
                public final yc1 m10328d(Drawable drawable) {
                    int iCeil;
                    int i;
/* 1 */             MaterialCardView materialCardView = this.f20072a;
/* 7 */             if (materialCardView.getUseCompatPadding()) {
/* 35 */                int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m10332h() ? m10326a() : 0.0f));
/* 56 */                iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m10332h() ? m10326a() : 0.0f));
/* 58 */                i = iCeil2;
                    } else {
/* 61 */                iCeil = 0;
/* 62 */                i = 0;
                    }
/* 68 */            return new yc1(drawable, iCeil, i, iCeil, i);
                }

                /* JADX INFO: renamed from: e */
                public final void m10329e(int i, int i2) {
                    int iCeil;
                    int iCeil2;
                    int i3;
                    int i4;
/* 5 */             if (this.f20087p != null) {
/* 7 */                 MaterialCardView materialCardView = this.f20072a;
/* 14 */                if (materialCardView.getUseCompatPadding()) {
/* 45 */                    iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m10332h() ? m10326a() : 0.0f)) * 2.0f);
/* 67 */                    iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m10332h() ? m10326a() : 0.0f)) * 2.0f);
                        } else {
/* 69 */                    iCeil = 0;
/* 70 */                    iCeil2 = 0;
                        }
/* 71 */                int i5 = this.f20078g;
/* 83 */                boolean z = (i5 & 8388613) == 8388613;
/* 84 */                int i6 = this.f20076e;
/* 95 */                int i7 = z ? ((i - i6) - this.f20077f) - iCeil2 : i6;
/* 115 */               int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.f20077f) - iCeil;
/* 134 */               int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.f20077f) - iCeil2;
/* 140 */               if ((i5 & 80) == 80) {
/* 147 */                   i6 = ((i2 - i6) - this.f20077f) - iCeil;
                        }
/* 149 */               int i10 = i6;
/* 150 */               WeakHashMap weakHashMap = e33.f7494a;
/* 156 */               if (materialCardView.getLayoutDirection() == 1) {
/* 158 */                   i4 = i9;
/* 159 */                   i3 = i7;
                        } else {
/* 162 */                   i3 = i9;
/* 164 */                   i4 = i7;
                        }
/* 168 */               this.f20087p.setLayerInset(2, i4, i10, i3, i8);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m10330f(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 3 */                 Drawable drawableMutate = drawable.mutate();
/* 7 */                 this.f20081j = drawableMutate;
/* 11 */                s90.m8448h(drawableMutate, this.f20083l);
/* 16 */                boolean z = this.f20072a.f4570w;
/* 18 */                Drawable drawable2 = this.f20081j;
/* 20 */                if (drawable2 != null) {
/* 28 */                    drawable2.setAlpha(z ? 255 : 0);
                        }
                    } else {
/* 34 */                this.f20081j = f20071u;
                    }
/* 36 */            LayerDrawable layerDrawable = this.f20087p;
/* 38 */            if (layerDrawable != null) {
/* 44 */                layerDrawable.setDrawableByLayerId(R$id.mtrl_card_checked_layer_id, this.f20081j);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m10331g(tc2 tc2Var) {
/* 1 */             this.f20084m = tc2Var;
/* 3 */             fd1 fd1Var = this.f20074c;
/* 5 */             fd1Var.setShapeAppearanceModel(tc2Var);
/* 14 */            fd1Var.f8163g0 = !fd1Var.m3740l();
/* 16 */            fd1 fd1Var2 = this.f20075d;
/* 18 */            if (fd1Var2 != null) {
/* 20 */                fd1Var2.setShapeAppearanceModel(tc2Var);
                    }
/* 23 */            fd1 fd1Var3 = this.f20088q;
/* 25 */            if (fd1Var3 != null) {
/* 27 */                fd1Var3.setShapeAppearanceModel(tc2Var);
                    }
                }

                /* JADX INFO: renamed from: h */
                public final boolean m10332h() {
/* 1 */             MaterialCardView materialCardView = this.f20072a;
                    return materialCardView.getPreventCornerOverlap() && this.f20074c.m3740l() && materialCardView.getUseCompatPadding();
                }

                /* JADX INFO: renamed from: i */
                public final void m10333i() {
/* 1 */             MaterialCardView materialCardView = this.f20072a;
/* 7 */             float cardViewRadius = 0.0f;
/* 30 */            float fM10326a = ((!materialCardView.getPreventCornerOverlap() || this.f20074c.m3740l()) && !m10332h()) ? 0.0f : m10326a();
/* 35 */            if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
/* 54 */                cardViewRadius = (float) ((1.0d - f20070t) * ((double) materialCardView.getCardViewRadius()));
                    }
/* 56 */            int i = (int) (fM10326a - cardViewRadius);
/* 57 */            Rect rect = this.f20073b;
/* 73 */            materialCardView.f816c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
/* 76 */            C0210cb c0210cb = materialCardView.f818e;
/* 80 */            CardView cardView = (CardView) c0210cb.f2805c;
/* 86 */            if (!cardView.getUseCompatPadding()) {
/* 89 */                c0210cb.m1575I(0, 0, 0, 0);
/* 92 */                return;
                    }
/* 95 */            e52 e52Var = (e52) c0210cb.f2804b;
/* 97 */            float f = e52Var.f7519e;
/* 99 */            float f2 = e52Var.f7515a;
/* 114 */           int iCeil = (int) Math.ceil(f52.m3670a(f, f2, cardView.getPreventCornerOverlap()));
/* 128 */           int iCeil2 = (int) Math.ceil(f52.m3671b(f, f2, cardView.getPreventCornerOverlap()));
/* 129 */           c0210cb.m1575I(iCeil, iCeil2, iCeil, iCeil2);
                }

                /* JADX INFO: renamed from: j */
                public final void m10334j() {
/* 1 */             boolean z = this.f20089r;
/* 3 */             MaterialCardView materialCardView = this.f20072a;
/* 5 */             if (!z) {
/* 13 */                materialCardView.setBackgroundInternal(m10328d(this.f20074c));
                    }
/* 22 */            materialCardView.setForeground(m10328d(this.f20080i));
                }
            }
