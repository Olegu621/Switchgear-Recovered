            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Typeface;
            import android.text.TextPaint;
            import android.util.TypedValue;
            import com.google.android.material.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dn2 {

                /* JADX INFO: renamed from: a */
                public final ColorStateList f7337a;

                /* JADX INFO: renamed from: b */
                public final String f7338b;

                /* JADX INFO: renamed from: c */
                public final int f7339c;

                /* JADX INFO: renamed from: d */
                public final int f7340d;

                /* JADX INFO: renamed from: e */
                public final float f7341e;

                /* JADX INFO: renamed from: f */
                public final float f7342f;

                /* JADX INFO: renamed from: g */
                public final float f7343g;

                /* JADX INFO: renamed from: h */
                public final boolean f7344h;

                /* JADX INFO: renamed from: i */
                public final float f7345i;

                /* JADX INFO: renamed from: j */
                public ColorStateList f7346j;

                /* JADX INFO: renamed from: k */
                public float f7347k;

                /* JADX INFO: renamed from: l */
                public final int f7348l;

                /* JADX INFO: renamed from: m */
                public boolean f7349m = false;

                /* JADX INFO: renamed from: n */
                public Typeface f7350n;

                public dn2(Context context, int i) {
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
/* 20 */            this.f7347k = typedArrayObtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
/* 28 */            this.f7346j = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
/* 32 */            de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
/* 37 */            de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
/* 46 */            this.f7339c = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
/* 55 */            this.f7340d = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
/* 57 */            int i2 = R$styleable.TextAppearance_fontFamily;
/* 65 */            i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : R$styleable.TextAppearance_android_fontFamily;
/* 73 */            this.f7348l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
/* 79 */            this.f7338b = typedArrayObtainStyledAttributes.getString(i2);
/* 83 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
/* 92 */            this.f7337a = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
/* 100 */           this.f7341e = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
/* 108 */           this.f7342f = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
/* 116 */           this.f7343g = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
/* 118 */           typedArrayObtainStyledAttributes.recycle();
/* 123 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
/* 133 */           this.f7344h = typedArrayObtainStyledAttributes2.hasValue(R$styleable.MaterialTextAppearance_android_letterSpacing);
/* 141 */           this.f7345i = typedArrayObtainStyledAttributes2.getFloat(R$styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
/* 143 */           typedArrayObtainStyledAttributes2.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final void m3158a() {
                    String str;
/* 1 */             Typeface typeface = this.f7350n;
/* 3 */             int i = this.f7339c;
/* 5 */             if (typeface == null && (str = this.f7338b) != null) {
/* 15 */                this.f7350n = Typeface.create(str, i);
                    }
/* 19 */            if (this.f7350n == null) {
/* 22 */                int i2 = this.f7340d;
/* 24 */                if (i2 == 1) {
/* 49 */                    this.f7350n = Typeface.SANS_SERIF;
                        } else if (i2 == 2) {
/* 44 */                    this.f7350n = Typeface.SERIF;
                        } else if (i2 != 3) {
/* 34 */                    this.f7350n = Typeface.DEFAULT;
                        } else {
/* 39 */                    this.f7350n = Typeface.MONOSPACE;
                        }
/* 57 */                this.f7350n = Typeface.create(this.f7350n, i);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final Typeface m3159b(Context context) {
/* 3 */             if (this.f7349m) {
/* 5 */                 return this.f7350n;
                    }
/* 12 */            if (!context.isRestricted()) {
                        try {
/* 16 */                    Typeface typefaceM2923a = d42.m2923a(context, this.f7348l);
/* 20 */                    this.f7350n = typefaceM2923a;
/* 22 */                    if (typefaceM2923a != null) {
/* 30 */                        this.f7350n = Typeface.create(typefaceM2923a, this.f7339c);
                            }
                        } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
                        }
                    }
/* 32 */            m3158a();
/* 36 */            this.f7349m = true;
/* 38 */            return this.f7350n;
                }

                /* JADX INFO: renamed from: c */
                public final void m3160c(Context context, kb1 kb1Var) {
/* 5 */             if (m3161d(context)) {
/* 7 */                 m3159b(context);
                    } else {
/* 11 */                m3158a();
                    }
/* 15 */            int i = this.f7348l;
/* 17 */            if (i == 0) {
/* 19 */                this.f7349m = true;
                    }
/* 23 */            if (this.f7349m) {
/* 27 */                kb1Var.mo1412N(this.f7350n, true);
/* 30 */                return;
                    }
                    try {
/* 33 */                bn2 bn2Var = new bn2(this, kb1Var);
/* 36 */                ThreadLocal threadLocal = d42.f6978a;
/* 42 */                if (context.isRestricted()) {
/* 45 */                    bn2Var.m3046d(-4);
                        } else {
/* 58 */                    d42.m2924b(context, i, new TypedValue(), 0, bn2Var, false, false);
                        }
                    } catch (Resources.NotFoundException unused) {
/* 69 */                this.f7349m = true;
/* 71 */                kb1Var.mo1411M(1);
                    } catch (Exception unused2) {
/* 62 */                this.f7349m = true;
/* 65 */                kb1Var.mo1411M(-3);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final boolean m3161d(Context context) {
/* 1 */             Typeface typefaceM2924b = null;
/* 2 */             int i = this.f7348l;
/* 4 */             if (i != 0) {
/* 6 */                 ThreadLocal threadLocal = d42.f6978a;
/* 12 */                if (!context.isRestricted()) {
/* 25 */                    typefaceM2924b = d42.m2924b(context, i, new TypedValue(), 0, null, false, true);
                        }
                    }
                    return typefaceM2924b != null;
                }

                /* JADX INFO: renamed from: e */
                public final void m3162e(Context context, TextPaint textPaint, kb1 kb1Var) {
/* 1 */             m3163f(context, textPaint, kb1Var);
/* 4 */             ColorStateList colorStateList = this.f7346j;
/* 21 */            textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
/* 24 */            ColorStateList colorStateList2 = this.f7337a;
/* 46 */            textPaint.setShadowLayer(this.f7343g, this.f7341e, this.f7342f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
                }

                /* JADX INFO: renamed from: f */
                public final void m3163f(Context context, TextPaint textPaint, kb1 kb1Var) {
/* 5 */             if (m3161d(context)) {
/* 11 */                m3164g(context, textPaint, m3159b(context));
/* 14 */                return;
                    }
/* 15 */            m3158a();
/* 20 */            m3164g(context, textPaint, this.f7350n);
/* 28 */            m3160c(context, new cn2(this, context, textPaint, kb1Var));
                }

                /* JADX INFO: renamed from: g */
                public final void m3164g(Context context, TextPaint textPaint, Typeface typeface) {
/* 9 */             Typeface typefaceM5759s = jb1.m5759s(context.getResources().getConfiguration(), typeface);
/* 13 */            if (typefaceM5759s != null) {
/* 15 */                typeface = typefaceM5759s;
                    }
/* 16 */            textPaint.setTypeface(typeface);
/* 26 */            int i = (~typeface.getStyle()) & this.f7339c;
/* 34 */            textPaint.setFakeBoldText((i & 1) != 0);
/* 45 */            textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
/* 50 */            textPaint.setTextSize(this.f7347k);
/* 55 */            if (this.f7344h) {
/* 59 */                textPaint.setLetterSpacing(this.f7345i);
                    }
                }
            }
