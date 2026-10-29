            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Typeface;
            import android.text.Spanned;
            import android.text.TextPaint;
            import android.text.style.CharacterStyle;
            import android.text.style.ReplacementSpan;
            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rs2 extends ReplacementSpan {

                /* JADX INFO: renamed from: b */
                public final qs2 f16283b;

                /* JADX INFO: renamed from: e */
                public TextPaint f16286e;

                /* JADX INFO: renamed from: a */
                public final Paint.FontMetricsInt f16282a = new Paint.FontMetricsInt();

                /* JADX INFO: renamed from: c */
                public short f16284c = -1;

                /* JADX INFO: renamed from: d */
                public float f16285d = 1.0f;

                public rs2(qs2 qs2Var) {
/* 20 */            de3.m3027i(qs2Var, "rasterizer cannot be null");
/* 23 */            this.f16283b = qs2Var;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0042  */
                /* JADX WARN: Code duplicated, block: B:21:0x0046  */
                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
/* 9 */             TextPaint textPaint = null;
/* 10 */            if (charSequence instanceof Spanned) {
/* 24 */                CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
/* 27 */                if (characterStyleArr.length != 0) {
/* 32 */                    if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
/* 39 */                        TextPaint textPaint2 = this.f16286e;
/* 41 */                        if (textPaint2 == null) {
/* 45 */                            textPaint2 = new TextPaint();
/* 48 */                            this.f16286e = textPaint2;
                                }
/* 50 */                        textPaint = textPaint2;
/* 51 */                        textPaint.set(paint);
/* 55 */                        for (CharacterStyle characterStyle : characterStyleArr) {
/* 59 */                            characterStyle.updateDrawState(textPaint);
                                }
                            } else if (paint instanceof TextPaint) {
/* 72 */                        textPaint = (TextPaint) paint;
                            }
                        } else if (paint instanceof TextPaint) {
/* 72 */                    textPaint = (TextPaint) paint;
                        }
                    } else if (paint instanceof TextPaint) {
/* 80 */                textPaint = (TextPaint) paint;
                    }
/* 65 */            TextPaint textPaint3 = textPaint;
/* 83 */            if (textPaint3 != null && textPaint3.bgColor != 0) {
/* 100 */               int color = textPaint3.getColor();
/* 104 */               Paint.Style style = textPaint3.getStyle();
/* 110 */               textPaint3.setColor(textPaint3.bgColor);
/* 115 */               textPaint3.setStyle(Paint.Style.FILL);
/* 122 */               canvas.drawRect(f, i3, f + this.f16284c, i5, textPaint3);
/* 125 */               textPaint3.setStyle(style);
/* 128 */               textPaint3.setColor(color);
                    }
/* 135 */           sc0.m8471a().getClass();
                    float f2 = i4;
                    Paint paint2 = textPaint3;
/* 141 */           if (textPaint3 == null) {
/* 144 */               paint2 = paint;
                    }
/* 145 */           qs2 qs2Var = this.f16283b;
/* 147 */           ra2 ra2Var = qs2Var.f15733b;
/* 151 */           Typeface typeface = (Typeface) ra2Var.f15958d;
/* 153 */           Typeface typeface2 = paint2.getTypeface();
/* 157 */           paint2.setTypeface(typeface);
/* 178 */           canvas.drawText((char[]) ra2Var.f15956b, qs2Var.f15732a * 2, 2, f, f2, paint2);
/* 181 */           paint2.setTypeface(typeface2);
                }

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
/* 1 */             Paint.FontMetricsInt fontMetricsInt2 = this.f16282a;
/* 3 */             paint.getFontMetricsInt(fontMetricsInt2);
/* 18 */            float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
/* 19 */            qs2 qs2Var = this.f16283b;
/* 21 */            mi1 mi1VarM8010b = qs2Var.m8010b();
/* 27 */            int iM8126a = mi1VarM8010b.m8126a(14);
/* 49 */            this.f16285d = fAbs / (iM8126a != 0 ? ((ByteBuffer) mi1VarM8010b.f15965d).getShort(iM8126a + mi1VarM8010b.f15962a) : (short) 0);
/* 51 */            mi1 mi1VarM8010b2 = qs2Var.m8010b();
/* 55 */            int iM8126a2 = mi1VarM8010b2.m8126a(14);
/* 59 */            if (iM8126a2 != 0) {
/* 68 */                ((ByteBuffer) mi1VarM8010b2.f15965d).getShort(iM8126a2 + mi1VarM8010b2.f15962a);
                    }
/* 71 */            mi1 mi1VarM8010b3 = qs2Var.m8010b();
/* 77 */            int iM8126a3 = mi1VarM8010b3.m8126a(12);
/* 99 */            short s = (short) ((iM8126a3 != 0 ? ((ByteBuffer) mi1VarM8010b3.f15965d).getShort(iM8126a3 + mi1VarM8010b3.f15962a) : (short) 0) * this.f16285d);
/* 100 */           this.f16284c = s;
/* 102 */           if (fontMetricsInt != null) {
/* 106 */               fontMetricsInt.ascent = fontMetricsInt2.ascent;
/* 110 */               fontMetricsInt.descent = fontMetricsInt2.descent;
/* 114 */               fontMetricsInt.top = fontMetricsInt2.top;
/* 118 */               fontMetricsInt.bottom = fontMetricsInt2.bottom;
                    }
/* 120 */           return s;
                }
            }
