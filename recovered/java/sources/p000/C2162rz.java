            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import android.view.LayoutInflater;
            import android.view.ViewGroup;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: renamed from: rz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2162rz {

                /* JADX INFO: renamed from: a */
                public final float f16351a;

                /* JADX INFO: renamed from: b */
                public final float f16352b;

                /* JADX INFO: renamed from: c */
                public final float f16353c;

                /* JADX INFO: renamed from: d */
                public final float f16354d;

                /* JADX INFO: renamed from: e */
                public final int f16355e;

                /* JADX INFO: renamed from: f */
                public final C0077d f16356f;

                public C2162rz(Context context, XmlResourceParser xmlResourceParser) {
/* 6 */             this.f16351a = Float.NaN;
/* 8 */             this.f16352b = Float.NaN;
/* 10 */            this.f16353c = Float.NaN;
/* 12 */            this.f16354d = Float.NaN;
/* 15 */            this.f16355e = -1;
/* 23 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
/* 27 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 32 */            for (int i = 0; i < indexCount; i++) {
/* 34 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 40 */                if (index == R$styleable.Variant_constraints) {
/* 44 */                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f16355e);
/* 48 */                    this.f16355e = resourceId;
/* 54 */                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
/* 62 */                    context.getResources().getResourceName(resourceId);
/* 71 */                    if ("layout".equals(resourceTypeName)) {
/* 75 */                        C0077d c0077d = new C0077d();
/* 78 */                        this.f16356f = c0077d;
/* 91 */                        c0077d.m539e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                            }
                        } else if (index == R$styleable.Variant_region_heightLessThan) {
/* 105 */                   this.f16354d = typedArrayObtainStyledAttributes.getDimension(index, this.f16354d);
                        } else if (index == R$styleable.Variant_region_heightMoreThan) {
/* 118 */                   this.f16352b = typedArrayObtainStyledAttributes.getDimension(index, this.f16352b);
                        } else if (index == R$styleable.Variant_region_widthLessThan) {
/* 131 */                   this.f16353c = typedArrayObtainStyledAttributes.getDimension(index, this.f16353c);
                        } else if (index == R$styleable.Variant_region_widthMoreThan) {
/* 144 */                   this.f16351a = typedArrayObtainStyledAttributes.getDimension(index, this.f16351a);
                        }
                    }
/* 149 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final boolean m8336a(float f, float f2) {
/* 1 */             float f3 = this.f16351a;
/* 8 */             if (!Float.isNaN(f3) && f < f3) {
/* 7 */                 return false;
                    }
/* 15 */            float f4 = this.f16352b;
/* 21 */            if (!Float.isNaN(f4) && f2 < f4) {
/* 7 */                 return false;
                    }
/* 28 */            float f5 = this.f16353c;
/* 34 */            if (!Float.isNaN(f5) && f > f5) {
/* 7 */                 return false;
                    }
/* 41 */            float f6 = this.f16354d;
                    return Float.isNaN(f6) || f2 <= f6;
                }
            }
