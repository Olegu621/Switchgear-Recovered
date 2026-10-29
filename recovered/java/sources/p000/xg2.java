            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xg2 {

                /* JADX INFO: renamed from: a */
                public final float f19083a;

                /* JADX INFO: renamed from: b */
                public final float f19084b;

                /* JADX INFO: renamed from: c */
                public final float f19085c;

                /* JADX INFO: renamed from: d */
                public final float f19086d;

                /* JADX INFO: renamed from: e */
                public final int f19087e;

                public xg2(Context context, XmlResourceParser xmlResourceParser) {
/* 6 */             this.f19083a = Float.NaN;
/* 8 */             this.f19084b = Float.NaN;
/* 10 */            this.f19085c = Float.NaN;
/* 12 */            this.f19086d = Float.NaN;
/* 15 */            this.f19087e = -1;
/* 23 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
/* 27 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 32 */            for (int i = 0; i < indexCount; i++) {
/* 34 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 40 */                if (index == R$styleable.Variant_constraints) {
/* 44 */                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19087e);
/* 48 */                    this.f19087e = resourceId;
/* 54 */                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
/* 62 */                    context.getResources().getResourceName(resourceId);
/* 67 */                    "layout".equals(resourceTypeName);
                        } else if (index == R$styleable.Variant_region_heightLessThan) {
/* 81 */                    this.f19086d = typedArrayObtainStyledAttributes.getDimension(index, this.f19086d);
                        } else if (index == R$styleable.Variant_region_heightMoreThan) {
/* 94 */                    this.f19084b = typedArrayObtainStyledAttributes.getDimension(index, this.f19084b);
                        } else if (index == R$styleable.Variant_region_widthLessThan) {
/* 107 */                   this.f19085c = typedArrayObtainStyledAttributes.getDimension(index, this.f19085c);
                        } else if (index == R$styleable.Variant_region_widthMoreThan) {
/* 120 */                   this.f19083a = typedArrayObtainStyledAttributes.getDimension(index, this.f19083a);
                        }
                    }
/* 125 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final boolean m9792a(float f, float f2) {
/* 1 */             float f3 = this.f19083a;
/* 8 */             if (!Float.isNaN(f3) && f < f3) {
/* 7 */                 return false;
                    }
/* 15 */            float f4 = this.f19084b;
/* 21 */            if (!Float.isNaN(f4) && f2 < f4) {
/* 7 */                 return false;
                    }
/* 28 */            float f5 = this.f19085c;
/* 34 */            if (!Float.isNaN(f5) && f > f5) {
/* 7 */                 return false;
                    }
/* 41 */            float f6 = this.f19086d;
                    return Float.isNaN(f6) || f2 <= f6;
                }
            }
