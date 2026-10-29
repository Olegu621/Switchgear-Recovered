            package p000;

            import android.graphics.RectF;
            import android.util.Rational;
            import java.util.Comparator;
            
            /* JADX INFO: renamed from: rd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2140rd implements Comparator {

                /* JADX INFO: renamed from: a */
                public final RectF f15984a;

                /* JADX INFO: renamed from: b */
                public final Rational f15985b;

                public C2140rd(Rational rational, Rational rational2) {
/* 14 */            this.f15985b = rational2 == null ? new Rational(4, 3) : rational2;
/* 20 */            this.f15984a = m8133b(rational);
                }

                /* JADX INFO: renamed from: a */
                public static float m8132a(RectF rectF, RectF rectF2) {
/* 43 */            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
                }

                /* JADX INFO: renamed from: b */
                public final RectF m8133b(Rational rational) {
/* 1 */             float fFloatValue = rational.floatValue();
/* 5 */             Rational rational2 = this.f15985b;
/* 14 */            if (fFloatValue == rational2.floatValue()) {
/* 28 */                return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
                    }
                    return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
/* 1 */             Rational rational = (Rational) obj;
/* 3 */             Rational rational2 = (Rational) obj2;
/* 9 */             boolean z = false;
/* 10 */            if (rational.equals(rational2)) {
/* 9 */                 return 0;
                    }
/* 13 */            RectF rectFM8133b = m8133b(rational);
/* 17 */            RectF rectFM8133b2 = m8133b(rational2);
/* 21 */            float fWidth = rectFM8133b.width();
/* 25 */            RectF rectF = this.f15984a;
/* 50 */            boolean z2 = fWidth >= rectF.width() && rectFM8133b.height() >= rectF.height();
/* 61 */            if (rectFM8133b2.width() >= rectF.width() && rectFM8133b2.height() >= rectF.height()) {
/* 75 */                z = true;
                    }
/* 76 */            if (z2 && z) {
/* 103 */               return (int) Math.signum((rectFM8133b.height() * rectFM8133b.width()) - (rectFM8133b2.height() * rectFM8133b2.width()));
                    }
/* 105 */           if (z2) {
/* 107 */               return -1;
                    }
/* 109 */           if (z) {
/* 33 */                return 1;
                    }
/* 126 */           return -((int) Math.signum(m8132a(rectFM8133b, rectF) - m8132a(rectFM8133b2, rectF)));
                }
            }
