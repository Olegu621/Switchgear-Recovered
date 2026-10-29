            package androidx.transition;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Path;
            import android.util.AttributeSet;
            import org.xmlpull.v1.XmlPullParser;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ArcMotion extends PathMotion {

                /* JADX INFO: renamed from: d */
                public static final float f1845d = (float) Math.tan(Math.toRadians(35.0d));

                /* JADX INFO: renamed from: a */
                public final float f1846a;

                /* JADX INFO: renamed from: b */
                public final float f1847b;

                /* JADX INFO: renamed from: c */
                public final float f1848c;

                public ArcMotion(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1846a = 0.0f;
/* 7 */             this.f1847b = 0.0f;
/* 11 */            this.f1848c = f1845d;
/* 15 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12595j);
/* 19 */            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
/* 40 */            this.f1847b = m1061b(!k50.m5988y(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
/* 61 */            this.f1846a = m1061b(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
/* 82 */            this.f1848c = m1061b(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
/* 84 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: b */
                public static float m1061b(float f) {
/* 4 */             if (f >= 0.0f && f <= 90.0f) {
/* 24 */                return (float) Math.tan(Math.toRadians(f / 2.0f));
                    }
/* 28 */            C1951n4.m6859j("Arc must be between 0 and 90 degrees");
/* 31 */            return 0.0f;
                }

                @Override // androidx.transition.PathMotion
                /* JADX INFO: renamed from: a */
                public final Path mo1062a(float f, float f2, float f3, float f4) {
                    float fM3503g;
                    float fM3503g2;
                    float f5;
/* 3 */             Path path = new Path();
/* 6 */             path.moveTo(f, f2);
/* 9 */             float f6 = f3 - f;
/* 11 */            float f7 = f4 - f2;
/* 17 */            float f8 = (f7 * f7) + (f6 * f6);
/* 22 */            float f9 = (f + f3) / 2.0f;
/* 25 */            float f10 = (f2 + f4) / 2.0f;
/* 28 */            float f11 = 0.25f * f8;
/* 35 */            boolean z = f2 > f4;
/* 46 */            if (Math.abs(f6) < Math.abs(f7)) {
/* 50 */                float fAbs = Math.abs(f8 / (f7 * 2.0f));
/* 54 */                if (z) {
/* 56 */                    fM3503g2 = fAbs + f4;
/* 57 */                    fM3503g = f3;
                        } else {
/* 59 */                    fM3503g2 = fAbs + f2;
/* 60 */                    fM3503g = f;
                        }
/* 61 */                f5 = this.f1847b;
                    } else {
/* 68 */                float f12 = f8 / (f6 * 2.0f);
/* 69 */                if (z) {
/* 72 */                    fM3503g2 = f2;
/* 71 */                    fM3503g = f12 + f;
                        } else {
/* 75 */                    fM3503g = f3 - f12;
/* 78 */                    fM3503g2 = f4;
                        }
/* 79 */                f5 = this.f1846a;
                    }
/* 65 */            float f13 = f11 * f5 * f5;
/* 82 */            float f14 = f9 - fM3503g;
/* 84 */            float f15 = f10 - fM3503g2;
/* 88 */            float f16 = (f15 * f15) + (f14 * f14);
/* 89 */            float f17 = this.f1848c;
/* 92 */            float f18 = f11 * f17 * f17;
/* 96 */            if (f16 >= f13) {
/* 105 */               f13 = f16 > f18 ? f18 : 0.0f;
                    }
/* 108 */           if (f13 != 0.0f) {
/* 116 */               float fSqrt = (float) Math.sqrt(f13 / f16);
/* 117 */               fM3503g = AbstractC0886en.m3503g(fM3503g, f9, fSqrt, f9);
/* 121 */               fM3503g2 = AbstractC0886en.m3503g(fM3503g2, f10, fSqrt, f10);
                    }
/* 139 */           path.cubicTo((f + fM3503g) / 2.0f, (f2 + fM3503g2) / 2.0f, (fM3503g + f3) / 2.0f, (fM3503g2 + f4) / 2.0f, f3, f4);
/* 142 */           return path;
                }
            }
