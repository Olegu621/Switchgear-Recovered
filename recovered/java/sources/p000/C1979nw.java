            package p000;

            import android.animation.TimeInterpolator;
            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Typeface;
            import android.os.Build;
            import android.text.Layout;
            import android.text.StaticLayout;
            import android.text.TextDirectionHeuristics;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.view.Gravity;
            import android.view.ViewGroup;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: nw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1979nw {

                /* JADX INFO: renamed from: A */
                public Typeface f14484A;

                /* JADX INFO: renamed from: B */
                public Typeface f14485B;

                /* JADX INFO: renamed from: C */
                public Typeface f14486C;

                /* JADX INFO: renamed from: D */
                public Typeface f14487D;

                /* JADX INFO: renamed from: E */
                public C0190br f14488E;

                /* JADX INFO: renamed from: F */
                public C0190br f14489F;

                /* JADX INFO: renamed from: G */
                public CharSequence f14490G;

                /* JADX INFO: renamed from: H */
                public CharSequence f14491H;

                /* JADX INFO: renamed from: I */
                public boolean f14492I;

                /* JADX INFO: renamed from: K */
                public Bitmap f14494K;

                /* JADX INFO: renamed from: L */
                public float f14495L;

                /* JADX INFO: renamed from: M */
                public float f14496M;

                /* JADX INFO: renamed from: N */
                public float f14497N;

                /* JADX INFO: renamed from: O */
                public float f14498O;

                /* JADX INFO: renamed from: P */
                public float f14499P;

                /* JADX INFO: renamed from: Q */
                public int f14500Q;

                /* JADX INFO: renamed from: R */
                public int[] f14501R;

                /* JADX INFO: renamed from: S */
                public boolean f14502S;

                /* JADX INFO: renamed from: T */
                public final TextPaint f14503T;

                /* JADX INFO: renamed from: U */
                public final TextPaint f14504U;

                /* JADX INFO: renamed from: V */
                public TimeInterpolator f14505V;

                /* JADX INFO: renamed from: W */
                public TimeInterpolator f14506W;

                /* JADX INFO: renamed from: X */
                public float f14507X;

                /* JADX INFO: renamed from: Y */
                public float f14508Y;

                /* JADX INFO: renamed from: Z */
                public float f14509Z;

                /* JADX INFO: renamed from: a */
                public final ViewGroup f14510a;

                /* JADX INFO: renamed from: a0 */
                public ColorStateList f14511a0;

                /* JADX INFO: renamed from: b */
                public boolean f14512b;

                /* JADX INFO: renamed from: b0 */
                public float f14513b0;

                /* JADX INFO: renamed from: c */
                public float f14514c;

                /* JADX INFO: renamed from: c0 */
                public float f14515c0;

                /* JADX INFO: renamed from: d */
                public boolean f14516d;

                /* JADX INFO: renamed from: d0 */
                public float f14517d0;

                /* JADX INFO: renamed from: e */
                public float f14518e;

                /* JADX INFO: renamed from: e0 */
                public ColorStateList f14519e0;

                /* JADX INFO: renamed from: f */
                public float f14520f;

                /* JADX INFO: renamed from: f0 */
                public float f14521f0;

                /* JADX INFO: renamed from: g */
                public int f14522g;

                /* JADX INFO: renamed from: g0 */
                public float f14523g0;

                /* JADX INFO: renamed from: h */
                public final Rect f14524h;

                /* JADX INFO: renamed from: h0 */
                public float f14525h0;

                /* JADX INFO: renamed from: i */
                public final Rect f14526i;

                /* JADX INFO: renamed from: i0 */
                public StaticLayout f14527i0;

                /* JADX INFO: renamed from: j */
                public final RectF f14528j;

                /* JADX INFO: renamed from: j0 */
                public float f14529j0;

                /* JADX INFO: renamed from: k0 */
                public float f14531k0;

                /* JADX INFO: renamed from: l0 */
                public float f14533l0;

                /* JADX INFO: renamed from: m0 */
                public CharSequence f14535m0;

                /* JADX INFO: renamed from: o */
                public ColorStateList f14538o;

                /* JADX INFO: renamed from: p */
                public ColorStateList f14540p;

                /* JADX INFO: renamed from: q */
                public int f14542q;

                /* JADX INFO: renamed from: r */
                public float f14544r;

                /* JADX INFO: renamed from: s */
                public float f14545s;

                /* JADX INFO: renamed from: t */
                public float f14546t;

                /* JADX INFO: renamed from: u */
                public float f14547u;

                /* JADX INFO: renamed from: v */
                public float f14548v;

                /* JADX INFO: renamed from: w */
                public float f14549w;

                /* JADX INFO: renamed from: x */
                public Typeface f14550x;

                /* JADX INFO: renamed from: y */
                public Typeface f14551y;

                /* JADX INFO: renamed from: z */
                public Typeface f14552z;

                /* JADX INFO: renamed from: k */
                public int f14530k = 16;

                /* JADX INFO: renamed from: l */
                public int f14532l = 16;

                /* JADX INFO: renamed from: m */
                public float f14534m = 15.0f;

                /* JADX INFO: renamed from: n */
                public float f14536n = 15.0f;

                /* JADX INFO: renamed from: J */
                public boolean f14493J = true;

                /* JADX INFO: renamed from: n0 */
                public int f14537n0 = 1;

                /* JADX INFO: renamed from: o0 */
                public float f14539o0 = 0.0f;

                /* JADX INFO: renamed from: p0 */
                public float f14541p0 = 1.0f;

                /* JADX INFO: renamed from: q0 */
                public int f14543q0 = 1;

                public C1979nw(ViewGroup viewGroup) {
/* 30 */            this.f14510a = viewGroup;
/* 36 */            TextPaint textPaint = new TextPaint(129);
/* 39 */            this.f14503T = textPaint;
/* 46 */            this.f14504U = new TextPaint(textPaint);
/* 53 */            this.f14526i = new Rect();
/* 60 */            this.f14524h = new Rect();
/* 67 */            this.f14528j = new RectF();
/* 69 */            float f = this.f14518e;
/* 77 */            this.f14520f = AbstractC0886en.m3503g(1.0f, f, 0.5f, f);
/* 91 */            m7052h(viewGroup.getContext().getResources().getConfiguration());
                }

                /* JADX INFO: renamed from: a */
                public static int m7045a(int i, float f, int i2) {
/* 3 */             float f2 = 1.0f - f;
/* 72 */            return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
                }

                /* JADX INFO: renamed from: g */
                public static float m7046g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
/* 1 */             if (timeInterpolator != null) {
/* 3 */                 f3 = timeInterpolator.getInterpolation(f3);
                    }
/* 7 */             return AbstractC2246u8.m8970a(f, f2, f3);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m7047b(CharSequence charSequence) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 10 */            boolean z = this.f14510a.getLayoutDirection() == 1;
/* 16 */            if (this.f14493J) {
/* 29 */                return (z ? en2.f7811d : en2.f7810c).m10433i(charSequence, charSequence.length());
                    }
/* 34 */            return z;
                }

                /* JADX INFO: renamed from: c */
                public final void m7048c(float f, boolean z) {
                    boolean z2;
                    float f2;
                    float f3;
                    boolean z3;
                    Layout.Alignment alignment;
/* 7 */             if (this.f14490G == null) {
/* 178 */               return;
                    }
/* 13 */            float fWidth = this.f14526i.width();
/* 20 */            float fWidth2 = this.f14524h.width();
/* 41 */            if (Math.abs(f - 1.0f) < 1.0E-5f) {
/* 43 */                f2 = this.f14536n;
/* 45 */                f3 = this.f14521f0;
/* 47 */                this.f14495L = 1.0f;
/* 49 */                Typeface typeface = this.f14487D;
/* 51 */                Typeface typeface2 = this.f14550x;
/* 53 */                if (typeface != typeface2) {
/* 55 */                    this.f14487D = typeface2;
/* 57 */                    z3 = true;
                        } else {
/* 59 */                    z3 = false;
                        }
                    } else {
/* 61 */                float f4 = this.f14534m;
/* 63 */                float f5 = this.f14523g0;
/* 65 */                Typeface typeface3 = this.f14487D;
/* 67 */                Typeface typeface4 = this.f14484A;
/* 69 */                if (typeface3 != typeface4) {
/* 71 */                    this.f14487D = typeface4;
/* 73 */                    z2 = true;
                        } else {
/* 75 */                    z2 = false;
                        }
/* 84 */                if (Math.abs(f - 0.0f) < 1.0E-5f) {
/* 86 */                    this.f14495L = 1.0f;
                        } else {
/* 102 */                   this.f14495L = m7046g(this.f14534m, this.f14536n, f, this.f14506W) / this.f14534m;
                        }
/* 108 */               float f6 = this.f14536n / this.f14534m;
/* 123 */               fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
/* 114 */               f2 = f4;
/* 115 */               f3 = f5;
/* 116 */               z3 = z2;
                    }
                    boolean z4 = z3;
/* 131 */           if (fWidth > 0.0f) {
/* 164 */               boolean z5 = ((this.f14496M > f2 ? 1 : (this.f14496M == f2 ? 0 : -1)) != 0) || ((this.f14525h0 > f3 ? 1 : (this.f14525h0 == f3 ? 0 : -1)) != 0) || this.f14502S || z3;
/* 165 */               this.f14496M = f2;
/* 167 */               this.f14525h0 = f3;
/* 169 */               this.f14502S = false;
                        z4 = z5;
                    }
/* 173 */           if (this.f14491H == null || z4) {
/* 179 */               float f7 = this.f14496M;
/* 181 */               TextPaint textPaint = this.f14503T;
/* 183 */               textPaint.setTextSize(f7);
/* 188 */               textPaint.setTypeface(this.f14487D);
/* 193 */               textPaint.setLetterSpacing(this.f14525h0);
/* 205 */               textPaint.setLinearText(this.f14495L != 1.0f);
/* 210 */               boolean zM7047b = m7047b(this.f14490G);
/* 214 */               this.f14492I = zM7047b;
/* 216 */               int i = this.f14537n0;
/* 218 */               if (i <= 1 || (zM7047b && !this.f14516d)) {
/* 227 */                   i = 1;
                        }
/* 228 */               if (i == 1) {
/* 230 */                   alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
/* 239 */                   int absoluteGravity = Gravity.getAbsoluteGravity(this.f14530k, zM7047b ? 1 : 0) & 7;
/* 241 */                   if (absoluteGravity != 1) {
/* 243 */                       boolean z6 = this.f14492I;
/* 246 */                       if (absoluteGravity != 5) {
/* 253 */                           alignment = z6 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                                } else {
/* 261 */                           alignment = z6 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                }
                            } else {
/* 264 */                       alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                        }
/* 266 */               CharSequence charSequenceEllipsize = this.f14490G;
/* 268 */               int i2 = (int) fWidth;
/* 269 */               int length = charSequenceEllipsize.length();
/* 273 */               Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
/* 275 */               TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
/* 277 */               float f8 = this.f14539o0;
/* 279 */               float f9 = this.f14541p0;
/* 281 */               int i3 = this.f14543q0;
/* 283 */               if (charSequenceEllipsize == null) {
/* 285 */                   charSequenceEllipsize = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 287 */               int iMax = Math.max(0, i2);
/* 293 */               if (i == 1) {
/* 296 */                   charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, truncateAt);
                        }
/* 304 */               int iMin = Math.min(charSequenceEllipsize.length(), length);
/* 308 */               if (zM7047b && i == 1) {
/* 312 */                   alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
/* 314 */               StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
/* 318 */               builderObtain.setAlignment(alignment);
/* 321 */               builderObtain.setIncludePad(false);
/* 331 */               builderObtain.setTextDirection(zM7047b ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
/* 334 */               if (truncateAt != null) {
/* 336 */                   builderObtain.setEllipsize(truncateAt);
                        }
/* 339 */               builderObtain.setMaxLines(i);
/* 344 */               if (f8 != 0.0f || f9 != 1.0f) {
/* 350 */                   builderObtain.setLineSpacing(f8, f9);
                        }
/* 353 */               if (i > 1) {
/* 355 */                   builderObtain.setHyphenationFrequency(i3);
                        }
/* 358 */               StaticLayout staticLayoutBuild = builderObtain.build();
/* 362 */               staticLayoutBuild.getClass();
/* 365 */               this.f14527i0 = staticLayoutBuild;
/* 371 */               this.f14491H = staticLayoutBuild.getText();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m7049d(Canvas canvas) {
/* 1 */             int iSave = canvas.save();
/* 7 */             if (this.f14491H == null || !this.f14512b) {
/* 247 */               return;
                    }
/* 13 */            float f = this.f14496M;
/* 15 */            TextPaint textPaint = this.f14503T;
/* 17 */            textPaint.setTextSize(f);
/* 20 */            float f2 = this.f14548v;
/* 22 */            float f3 = this.f14549w;
/* 24 */            float f4 = this.f14495L;
/* 30 */            if (f4 != 1.0f && !this.f14516d) {
/* 36 */                canvas.scale(f4, f4, f2, f3);
                    }
/* 42 */            if (this.f14537n0 <= 1 || ((this.f14492I && !this.f14516d) || (this.f14516d && this.f14514c <= this.f14520f))) {
/* 236 */               canvas.translate(f2, f3);
/* 241 */               this.f14527i0.draw(canvas);
                    } else {
/* 74 */                float lineStart = this.f14548v - this.f14527i0.getLineStart(0);
/* 75 */                int alpha = textPaint.getAlpha();
/* 79 */                canvas.translate(lineStart, f3);
                        float f5 = alpha;
/* 87 */                textPaint.setAlpha((int) (this.f14533l0 * f5));
/* 90 */                int i = Build.VERSION.SDK_INT;
/* 94 */                if (i >= 31) {
/* 112 */                   textPaint.setShadowLayer(this.f14497N, this.f14498O, this.f14499P, xe2.m9772j(this.f14500Q, textPaint.getAlpha()));
                        }
/* 117 */               this.f14527i0.draw(canvas);
/* 124 */               textPaint.setAlpha((int) (this.f14531k0 * f5));
/* 127 */               if (i >= 31) {
/* 145 */                   textPaint.setShadowLayer(this.f14497N, this.f14498O, this.f14499P, xe2.m9772j(this.f14500Q, textPaint.getAlpha()));
                        }
/* 150 */               int lineBaseline = this.f14527i0.getLineBaseline(0);
/* 154 */               CharSequence charSequence = this.f14535m0;
                        float f6 = lineBaseline;
/* 164 */               canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
/* 167 */               if (i >= 31) {
/* 177 */                   textPaint.setShadowLayer(this.f14497N, this.f14498O, this.f14499P, this.f14500Q);
                        }
/* 182 */               if (!this.f14516d) {
/* 190 */                   String strTrim = this.f14535m0.toString().trim();
/* 200 */                   if (strTrim.endsWith("…")) {
/* 207 */                       strTrim = strTrim.substring(0, strTrim.length() - 1);
                            }
/* 211 */                   String str = strTrim;
/* 212 */                   textPaint.setAlpha(alpha);
/* 231 */                   canvas.drawText(str, 0, Math.min(this.f14527i0.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
                        }
/* 234 */               canvas = canvas;
                    }
/* 244 */           canvas.restoreToCount(iSave);
                }

                /* JADX INFO: renamed from: e */
                public final float m7050e() {
/* 1 */             float f = this.f14536n;
/* 3 */             TextPaint textPaint = this.f14504U;
/* 5 */             textPaint.setTextSize(f);
/* 10 */            textPaint.setTypeface(this.f14550x);
/* 15 */            textPaint.setLetterSpacing(this.f14521f0);
/* 22 */            return -textPaint.ascent();
                }

                /* JADX INFO: renamed from: f */
                public final int m7051f(ColorStateList colorStateList) {
/* 2 */             if (colorStateList == null) {
/* 1 */                 return 0;
                    }
/* 5 */             int[] iArr = this.f14501R;
                    return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
                }

                /* JADX INFO: renamed from: h */
                public final void m7052h(Configuration configuration) {
/* 5 */             if (Build.VERSION.SDK_INT >= 31) {
/* 7 */                 Typeface typeface = this.f14552z;
/* 9 */                 if (typeface != null) {
/* 15 */                    this.f14551y = jb1.m5759s(configuration, typeface);
                        }
/* 17 */                Typeface typeface2 = this.f14486C;
/* 19 */                if (typeface2 != null) {
/* 25 */                    this.f14485B = jb1.m5759s(configuration, typeface2);
                        }
/* 27 */                Typeface typeface3 = this.f14551y;
/* 29 */                if (typeface3 == null) {
/* 32 */                    typeface3 = this.f14552z;
                        }
/* 34 */                this.f14550x = typeface3;
/* 36 */                Typeface typeface4 = this.f14485B;
/* 38 */                if (typeface4 == null) {
/* 41 */                    typeface4 = this.f14486C;
                        }
/* 43 */                this.f14484A = typeface4;
/* 46 */                m7054j(true);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:11:0x001e  */
                /* JADX INFO: renamed from: i */
                public final void m7053i() {
                    boolean z;
/* 1 */             Rect rect = this.f14526i;
/* 7 */             if (rect.width() <= 0 || rect.height() <= 0) {
/* 31 */                z = false;
                    } else {
/* 15 */                Rect rect2 = this.f14524h;
/* 21 */                if (rect2.width() <= 0 || rect2.height() <= 0) {
/* 31 */                    z = false;
                        } else {
/* 29 */                    z = true;
                        }
                    }
/* 32 */            this.f14512b = z;
                }

                /* JADX INFO: renamed from: j */
                public final void m7054j(boolean z) {
                    float fMeasureText;
                    float f;
                    StaticLayout staticLayout;
/* 5 */             ViewGroup viewGroup = this.f14510a;
/* 11 */            if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
/* 619 */               return;
                    }
/* 23 */            m7048c(1.0f, z);
/* 26 */            CharSequence charSequence = this.f14491H;
/* 28 */            TextPaint textPaint = this.f14503T;
/* 30 */            if (charSequence != null && (staticLayout = this.f14527i0) != null) {
/* 47 */                this.f14535m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
                    }
/* 49 */            CharSequence charSequence2 = this.f14535m0;
/* 53 */            if (charSequence2 != null) {
/* 63 */                this.f14529j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
                    } else {
/* 66 */                this.f14529j0 = 0.0f;
                    }
/* 72 */            int absoluteGravity = Gravity.getAbsoluteGravity(this.f14532l, this.f14492I ? 1 : 0);
/* 76 */            int i = absoluteGravity & 112;
/* 78 */            Rect rect = this.f14526i;
/* 86 */            if (i == 48) {
/* 123 */               this.f14545s = rect.top;
                    } else if (i != 80) {
/* 106 */               this.f14545s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                    } else {
/* 117 */               this.f14545s = textPaint.ascent() + rect.bottom;
                    }
/* 128 */           int i2 = absoluteGravity & 8388615;
/* 131 */           if (i2 == 1) {
/* 159 */               this.f14547u = rect.centerX() - (this.f14529j0 / 2.0f);
                    } else if (i2 != 5) {
/* 138 */               this.f14547u = rect.left;
                    } else {
/* 147 */               this.f14547u = rect.right - this.f14529j0;
                    }
/* 161 */           m7048c(0.0f, z);
/* 164 */           StaticLayout staticLayout2 = this.f14527i0;
/* 174 */           float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
/* 175 */           StaticLayout staticLayout3 = this.f14527i0;
/* 177 */           if (staticLayout3 == null || this.f14537n0 <= 1) {
/* 189 */               CharSequence charSequence3 = this.f14491H;
/* 202 */               fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
                    } else {
/* 183 */               fMeasureText = staticLayout3.getWidth();
                    }
/* 203 */           StaticLayout staticLayout4 = this.f14527i0;
/* 213 */           this.f14542q = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
/* 221 */           int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f14530k, this.f14492I ? 1 : 0);
/* 225 */           int i3 = absoluteGravity2 & 112;
/* 229 */           Rect rect2 = this.f14524h;
/* 231 */           if (i3 == 48) {
/* 261 */               this.f14544r = rect2.top;
                    } else if (i3 != 80) {
/* 243 */               this.f14544r = rect2.centerY() - (height / 2.0f);
                    } else {
/* 255 */               this.f14544r = textPaint.descent() + (rect2.bottom - height);
                    }
/* 263 */           int i4 = absoluteGravity2 & 8388615;
/* 265 */           if (i4 == 1) {
/* 290 */               this.f14546t = rect2.centerX() - (fMeasureText / 2.0f);
                    } else if (i4 != 5) {
/* 272 */               this.f14546t = rect2.left;
                    } else {
/* 279 */               this.f14546t = rect2.right - fMeasureText;
                    }
/* 292 */           Bitmap bitmap = this.f14494K;
/* 294 */           if (bitmap != null) {
/* 296 */               bitmap.recycle();
/* 300 */               this.f14494K = null;
                    }
/* 304 */           m7062r(this.f14514c);
/* 307 */           float f2 = this.f14514c;
/* 309 */           boolean z2 = this.f14516d;
/* 311 */           RectF rectF = this.f14528j;
/* 313 */           if (z2) {
/* 319 */               if (f2 < this.f14520f) {
/* 321 */                   rect = rect2;
                        }
/* 322 */               rectF.set(rect);
                    } else {
/* 338 */               rectF.left = m7046g(rect2.left, rect.left, f2, this.f14505V);
/* 350 */               rectF.top = m7046g(this.f14544r, this.f14545s, f2, this.f14505V);
/* 364 */               rectF.right = m7046g(rect2.right, rect.right, f2, this.f14505V);
/* 378 */               rectF.bottom = m7046g(rect2.bottom, rect.bottom, f2, this.f14505V);
                    }
/* 382 */           if (!this.f14516d) {
/* 434 */               this.f14548v = m7046g(this.f14546t, this.f14547u, f2, this.f14505V);
/* 446 */               this.f14549w = m7046g(this.f14544r, this.f14545s, f2, this.f14505V);
/* 448 */               m7062r(f2);
/* 451 */               f = f2;
                    } else if (f2 < this.f14520f) {
/* 392 */               this.f14548v = this.f14546t;
/* 396 */               this.f14549w = this.f14544r;
/* 398 */               m7062r(0.0f);
/* 401 */               f = 0.0f;
                    } else {
/* 405 */               this.f14548v = this.f14547u;
/* 417 */               this.f14549w = this.f14545s - Math.max(0, this.f14522g);
/* 419 */               m7062r(1.0f);
/* 422 */               f = 1.0f;
                    }
/* 454 */           xg0 xg0Var = AbstractC2246u8.f17411b;
/* 462 */           this.f14531k0 = 1.0f - m7046g(0.0f, 1.0f, 1.0f - f2, xg0Var);
/* 464 */           WeakHashMap weakHashMap = e33.f7494a;
/* 466 */           viewGroup.postInvalidateOnAnimation();
/* 473 */           this.f14533l0 = m7046g(1.0f, 0.0f, f2, xg0Var);
/* 475 */           viewGroup.postInvalidateOnAnimation();
/* 478 */           ColorStateList colorStateList = this.f14540p;
/* 480 */           ColorStateList colorStateList2 = this.f14538o;
/* 482 */           if (colorStateList != colorStateList2) {
/* 498 */               textPaint.setColor(m7045a(m7051f(colorStateList2), f, m7051f(this.f14540p)));
                    } else {
/* 506 */               textPaint.setColor(m7051f(colorStateList));
                    }
/* 509 */           float f3 = this.f14521f0;
/* 511 */           float f4 = this.f14523g0;
/* 515 */           if (f3 != f4) {
/* 521 */               textPaint.setLetterSpacing(m7046g(f4, f3, f2, xg0Var));
                    } else {
/* 525 */               textPaint.setLetterSpacing(f3);
                    }
/* 536 */           this.f14497N = AbstractC2246u8.m8970a(this.f14513b0, this.f14507X, f2);
/* 546 */           this.f14498O = AbstractC2246u8.m8970a(this.f14515c0, this.f14508Y, f2);
/* 556 */           this.f14499P = AbstractC2246u8.m8970a(this.f14517d0, this.f14509Z, f2);
/* 570 */           int iM7045a = m7045a(m7051f(this.f14519e0), f2, m7051f(this.f14511a0));
/* 574 */           this.f14500Q = iM7045a;
/* 582 */           textPaint.setShadowLayer(this.f14497N, this.f14498O, this.f14499P, iM7045a);
/* 587 */           if (this.f14516d) {
/* 589 */               int alpha = textPaint.getAlpha();
/* 593 */               float f5 = this.f14520f;
/* 613 */               textPaint.setAlpha((int) ((f2 <= f5 ? AbstractC2246u8.m8971b(1.0f, 0.0f, this.f14518e, f5, f2) : AbstractC2246u8.m8971b(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
                    }
/* 616 */           viewGroup.postInvalidateOnAnimation();
                }

                /* JADX INFO: renamed from: k */
                public final void m7055k(int i) {
/* 3 */             ViewGroup viewGroup = this.f14510a;
/* 9 */             dn2 dn2Var = new dn2(viewGroup.getContext(), i);
/* 12 */            ColorStateList colorStateList = dn2Var.f7346j;
/* 14 */            if (colorStateList != null) {
/* 16 */                this.f14540p = colorStateList;
                    }
/* 18 */            float f = dn2Var.f7347k;
/* 23 */            if (f != 0.0f) {
/* 25 */                this.f14536n = f;
                    }
/* 27 */            ColorStateList colorStateList2 = dn2Var.f7337a;
/* 29 */            if (colorStateList2 != null) {
/* 31 */                this.f14511a0 = colorStateList2;
                    }
/* 35 */            this.f14508Y = dn2Var.f7341e;
/* 39 */            this.f14509Z = dn2Var.f7342f;
/* 43 */            this.f14507X = dn2Var.f7343g;
/* 47 */            this.f14521f0 = dn2Var.f7345i;
/* 49 */            C0190br c0190br = this.f14489F;
/* 51 */            if (c0190br != null) {
/* 54 */                c0190br.f2577i = true;
                    }
/* 62 */            qc3 qc3Var = new qc3(this, 17);
/* 65 */            dn2Var.m3158a();
/* 73 */            this.f14489F = new C0190br(qc3Var, dn2Var.f7350n);
/* 81 */            dn2Var.m3160c(viewGroup.getContext(), this.f14489F);
/* 85 */            m7054j(false);
                }

                /* JADX INFO: renamed from: l */
                public final void m7056l(ColorStateList colorStateList) {
/* 3 */             if (this.f14540p != colorStateList) {
/* 5 */                 this.f14540p = colorStateList;
/* 8 */                 m7054j(false);
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m7057m(int i) {
/* 3 */             if (this.f14532l != i) {
/* 5 */                 this.f14532l = i;
/* 8 */                 m7054j(false);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final boolean m7058n(Typeface typeface) {
/* 1 */             C0190br c0190br = this.f14489F;
/* 4 */             if (c0190br != null) {
/* 6 */                 c0190br.f2577i = true;
                    }
/* 10 */            if (this.f14552z == typeface) {
/* 41 */                return false;
                    }
/* 12 */            this.f14552z = typeface;
/* 28 */            Typeface typefaceM5759s = jb1.m5759s(this.f14510a.getContext().getResources().getConfiguration(), typeface);
/* 32 */            this.f14551y = typefaceM5759s;
/* 34 */            if (typefaceM5759s == null) {
/* 36 */                typefaceM5759s = this.f14552z;
                    }
/* 38 */            this.f14550x = typefaceM5759s;
/* 3 */             return true;
                }

                /* JADX INFO: renamed from: o */
                public final void m7059o(int i) {
/* 3 */             ViewGroup viewGroup = this.f14510a;
/* 9 */             dn2 dn2Var = new dn2(viewGroup.getContext(), i);
/* 12 */            ColorStateList colorStateList = dn2Var.f7346j;
/* 14 */            if (colorStateList != null) {
/* 16 */                this.f14538o = colorStateList;
                    }
/* 18 */            float f = dn2Var.f7347k;
/* 23 */            if (f != 0.0f) {
/* 25 */                this.f14534m = f;
                    }
/* 27 */            ColorStateList colorStateList2 = dn2Var.f7337a;
/* 29 */            if (colorStateList2 != null) {
/* 31 */                this.f14519e0 = colorStateList2;
                    }
/* 35 */            this.f14515c0 = dn2Var.f7341e;
/* 39 */            this.f14517d0 = dn2Var.f7342f;
/* 43 */            this.f14513b0 = dn2Var.f7343g;
/* 47 */            this.f14523g0 = dn2Var.f7345i;
/* 49 */            C0190br c0190br = this.f14488E;
/* 51 */            if (c0190br != null) {
/* 54 */                c0190br.f2577i = true;
                    }
/* 60 */            d52 d52Var = new d52(this);
/* 63 */            dn2Var.m3158a();
/* 71 */            this.f14488E = new C0190br(d52Var, dn2Var.f7350n);
/* 79 */            dn2Var.m3160c(viewGroup.getContext(), this.f14488E);
/* 83 */            m7054j(false);
                }

                /* JADX INFO: renamed from: p */
                public final boolean m7060p(Typeface typeface) {
/* 1 */             C0190br c0190br = this.f14488E;
/* 4 */             if (c0190br != null) {
/* 6 */                 c0190br.f2577i = true;
                    }
/* 10 */            if (this.f14486C == typeface) {
/* 41 */                return false;
                    }
/* 12 */            this.f14486C = typeface;
/* 28 */            Typeface typefaceM5759s = jb1.m5759s(this.f14510a.getContext().getResources().getConfiguration(), typeface);
/* 32 */            this.f14485B = typefaceM5759s;
/* 34 */            if (typefaceM5759s == null) {
/* 36 */                typefaceM5759s = this.f14486C;
                    }
/* 38 */            this.f14484A = typefaceM5759s;
/* 3 */             return true;
                }

                /* JADX INFO: renamed from: q */
                public final void m7061q(float f) {
                    float f2;
/* 6 */             if (f < 0.0f) {
/* 8 */                 f = 0.0f;
                    } else if (f > 1.0f) {
/* 14 */                f = 1.0f;
                    }
/* 19 */            if (f != this.f14514c) {
/* 21 */                this.f14514c = f;
/* 23 */                boolean z = this.f14516d;
/* 25 */                Rect rect = this.f14526i;
/* 27 */                Rect rect2 = this.f14524h;
/* 29 */                RectF rectF = this.f14528j;
/* 31 */                if (z) {
/* 37 */                    if (f < this.f14520f) {
/* 39 */                        rect = rect2;
                            }
/* 40 */                    rectF.set(rect);
                        } else {
/* 56 */                    rectF.left = m7046g(rect2.left, rect.left, f, this.f14505V);
/* 68 */                    rectF.top = m7046g(this.f14544r, this.f14545s, f, this.f14505V);
/* 82 */                    rectF.right = m7046g(rect2.right, rect.right, f, this.f14505V);
/* 96 */                    rectF.bottom = m7046g(rect2.bottom, rect.bottom, f, this.f14505V);
                        }
/* 100 */               if (!this.f14516d) {
/* 153 */                   this.f14548v = m7046g(this.f14546t, this.f14547u, f, this.f14505V);
/* 165 */                   this.f14549w = m7046g(this.f14544r, this.f14545s, f, this.f14505V);
/* 167 */                   m7062r(f);
/* 170 */                   f2 = f;
                        } else if (f < this.f14520f) {
/* 110 */                   this.f14548v = this.f14546t;
/* 114 */                   this.f14549w = this.f14544r;
/* 116 */                   m7062r(0.0f);
/* 119 */                   f2 = 0.0f;
                        } else {
/* 123 */                   this.f14548v = this.f14547u;
/* 136 */                   this.f14549w = this.f14545s - Math.max(0, this.f14522g);
/* 138 */                   m7062r(1.0f);
/* 141 */                   f2 = 1.0f;
                        }
/* 173 */               xg0 xg0Var = AbstractC2246u8.f17411b;
/* 181 */               this.f14531k0 = 1.0f - m7046g(0.0f, 1.0f, 1.0f - f, xg0Var);
/* 183 */               WeakHashMap weakHashMap = e33.f7494a;
/* 185 */               ViewGroup viewGroup = this.f14510a;
/* 187 */               viewGroup.postInvalidateOnAnimation();
/* 194 */               this.f14533l0 = m7046g(1.0f, 0.0f, f, xg0Var);
/* 196 */               viewGroup.postInvalidateOnAnimation();
/* 199 */               ColorStateList colorStateList = this.f14540p;
/* 201 */               ColorStateList colorStateList2 = this.f14538o;
/* 203 */               TextPaint textPaint = this.f14503T;
/* 205 */               if (colorStateList != colorStateList2) {
/* 221 */                   textPaint.setColor(m7045a(m7051f(colorStateList2), f2, m7051f(this.f14540p)));
                        } else {
/* 229 */                   textPaint.setColor(m7051f(colorStateList));
                        }
/* 232 */               float f3 = this.f14521f0;
/* 234 */               float f4 = this.f14523g0;
/* 238 */               if (f3 != f4) {
/* 244 */                   textPaint.setLetterSpacing(m7046g(f4, f3, f, xg0Var));
                        } else {
/* 248 */                   textPaint.setLetterSpacing(f3);
                        }
/* 259 */               this.f14497N = AbstractC2246u8.m8970a(this.f14513b0, this.f14507X, f);
/* 269 */               this.f14498O = AbstractC2246u8.m8970a(this.f14515c0, this.f14508Y, f);
/* 279 */               this.f14499P = AbstractC2246u8.m8970a(this.f14517d0, this.f14509Z, f);
/* 293 */               int iM7045a = m7045a(m7051f(this.f14519e0), f, m7051f(this.f14511a0));
/* 297 */               this.f14500Q = iM7045a;
/* 305 */               textPaint.setShadowLayer(this.f14497N, this.f14498O, this.f14499P, iM7045a);
/* 310 */               if (this.f14516d) {
/* 312 */                   int alpha = textPaint.getAlpha();
/* 316 */                   float f5 = this.f14520f;
/* 336 */                   textPaint.setAlpha((int) ((f <= f5 ? AbstractC2246u8.m8971b(1.0f, 0.0f, this.f14518e, f5, f) : AbstractC2246u8.m8971b(0.0f, 1.0f, f5, 1.0f, f)) * alpha));
                        }
/* 339 */               viewGroup.postInvalidateOnAnimation();
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m7062r(float f) {
/* 2 */             m7048c(f, false);
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 9 */             this.f14510a.postInvalidateOnAnimation();
                }
            }
