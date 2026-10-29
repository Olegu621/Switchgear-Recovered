            package p000;

            import android.os.Build;
            import android.text.PrecomputedText;
            import android.text.TextDirectionHeuristic;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public final class st1 {

                /* JADX INFO: renamed from: a */
                public final TextPaint f16770a;

                /* JADX INFO: renamed from: b */
                public final TextDirectionHeuristic f16771b;

                /* JADX INFO: renamed from: c */
                public final int f16772c;

                /* JADX INFO: renamed from: d */
                public final int f16773d;

                public st1(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
/* 8 */             if (Build.VERSION.SDK_INT >= 29) {
/* 1 */                 rt1.m8245e(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
                    }
/* 29 */            this.f16770a = textPaint;
/* 31 */            this.f16771b = textDirectionHeuristic;
/* 33 */            this.f16772c = i;
/* 35 */            this.f16773d = i2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 162 */               return true;
                    }
/* 7 */             if (!(obj instanceof st1)) {
/* 164 */               return false;
                    }
/* 11 */            st1 st1Var = (st1) obj;
/* 13 */            int i = st1Var.f16772c;
/* 15 */            TextPaint textPaint = st1Var.f16770a;
/* 19 */            if (this.f16772c != i || this.f16773d != st1Var.f16773d) {
/* 164 */               return false;
                    }
/* 31 */            TextPaint textPaint2 = this.f16770a;
/* 43 */            if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
/* 164 */               return false;
                    }
/* 132 */           if (textPaint2.getTypeface() == null) {
/* 138 */               if (textPaint.getTypeface() != null) {
/* 164 */                   return false;
                        }
                    } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
/* 164 */               return false;
                    }
                    return this.f16771b == st1Var.f16771b;
                }

                public final int hashCode() {
/* 1 */             TextPaint textPaint = this.f16770a;
/* 77 */            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f16771b, Integer.valueOf(this.f16772c), Integer.valueOf(this.f16773d));
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("{");
/* 12 */            StringBuilder sb2 = new StringBuilder("textSize=");
/* 15 */            TextPaint textPaint = this.f16770a;
/* 21 */            sb2.append(textPaint.getTextSize());
/* 28 */            sb.append(sb2.toString());
/* 49 */            sb.append(", textScaleX=" + textPaint.getTextScaleX());
/* 70 */            sb.append(", textSkewX=" + textPaint.getTextSkewX());
/* 91 */            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
/* 112 */           sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
/* 133 */           sb.append(", textLocale=" + textPaint.getTextLocales());
/* 154 */           sb.append(", typeface=" + textPaint.getTypeface());
/* 161 */           if (Build.VERSION.SDK_INT >= 26) {
/* 181 */               sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
                    }
/* 200 */           sb.append(", textDir=" + this.f16771b);
/* 219 */           sb.append(", breakStrategy=" + this.f16772c);
/* 238 */           sb.append(", hyphenationFrequency=" + this.f16773d);
/* 243 */           sb.append("}");
/* 246 */           return sb.toString();
                }

/* 37 */        public st1(PrecomputedText.Params params) {
/* 1 */             this.f16770a = params.getTextPaint();
/* 1 */             this.f16771b = params.getTextDirection();
/* 1 */             this.f16772c = params.getBreakStrategy();
/* 1 */             this.f16773d = params.getHyphenationFrequency();
                }
            }
