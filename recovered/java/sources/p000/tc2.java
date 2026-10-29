            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import com.google.android.material.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tc2 {

                /* JADX INFO: renamed from: m */
                public static final a32 f17031m = new a32(0.5f);

                /* JADX INFO: renamed from: a */
                public w11 f17032a = new g52();

                /* JADX INFO: renamed from: b */
                public w11 f17033b = new g52();

                /* JADX INFO: renamed from: c */
                public w11 f17034c = new g52();

                /* JADX INFO: renamed from: d */
                public w11 f17035d = new g52();

                /* JADX INFO: renamed from: e */
                public m10 f17036e = new C0862e(0.0f);

                /* JADX INFO: renamed from: f */
                public m10 f17037f = new C0862e(0.0f);

                /* JADX INFO: renamed from: g */
                public m10 f17038g = new C0862e(0.0f);

                /* JADX INFO: renamed from: h */
                public m10 f17039h = new C0862e(0.0f);

                /* JADX INFO: renamed from: i */
                public dc0 f17040i;

                /* JADX INFO: renamed from: j */
                public dc0 f17041j;

                /* JADX INFO: renamed from: k */
                public dc0 f17042k;

                /* JADX INFO: renamed from: l */
                public dc0 f17043l;

                public tc2() {
/* 63 */            int i = 0;
/* 67 */            this.f17040i = new dc0(i);
/* 74 */            this.f17041j = new dc0(i);
/* 81 */            this.f17042k = new dc0(i);
/* 88 */            this.f17043l = new dc0(i);
                }

                /* JADX INFO: renamed from: a */
                public static sc2 m8774a(Context context, int i, int i2, m10 m10Var) {
/* 1 */             if (i2 != 0) {
/* 5 */                 ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
/* 8 */                 i = i2;
/* 9 */                 context = contextThemeWrapper;
                    }
/* 12 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.ShapeAppearance);
                    try {
/* 19 */                int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
/* 25 */                int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
/* 31 */                int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i3);
/* 37 */                int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
/* 43 */                int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
/* 49 */                m10 m10VarM8777d = m8777d(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, m10Var);
/* 55 */                m10 m10VarM8777d2 = m8777d(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, m10VarM8777d);
/* 61 */                m10 m10VarM8777d3 = m8777d(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, m10VarM8777d);
/* 67 */                m10 m10VarM8777d4 = m8777d(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, m10VarM8777d);
/* 73 */                m10 m10VarM8777d5 = m8777d(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, m10VarM8777d);
/* 79 */                sc2 sc2Var = new sc2();
/* 86 */                sc2Var.f16523a = he3.m4182c(i4);
/* 88 */                sc2Var.f16527e = m10VarM8777d2;
/* 94 */                sc2Var.f16524b = he3.m4182c(i5);
/* 96 */                sc2Var.f16528f = m10VarM8777d3;
/* 102 */               sc2Var.f16525c = he3.m4182c(i6);
/* 104 */               sc2Var.f16529g = m10VarM8777d4;
/* 110 */               sc2Var.f16526d = he3.m4182c(i7);
/* 112 */               sc2Var.f16530h = m10VarM8777d5;
/* 117 */               return sc2Var;
                    } finally {
/* 119 */               typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static sc2 m8775b(Context context, AttributeSet attributeSet, int i, int i2) {
/* 7 */             return m8776c(context, attributeSet, i, i2, new C0862e(0.0f));
                }

                /* JADX INFO: renamed from: c */
                public static sc2 m8776c(Context context, AttributeSet attributeSet, int i, int i2, m10 m10Var) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
/* 10 */            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
/* 16 */            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
/* 20 */            typedArrayObtainStyledAttributes.recycle();
/* 23 */            return m8774a(context, resourceId, resourceId2, m10Var);
                }

                /* JADX INFO: renamed from: d */
                public static m10 m8777d(TypedArray typedArray, int i, m10 m10Var) {
/* 1 */             TypedValue typedValuePeekValue = typedArray.peekValue(i);
/* 5 */             if (typedValuePeekValue != null) {
/* 8 */                 int i2 = typedValuePeekValue.type;
/* 11 */                if (i2 == 5) {
/* 30 */                    return new C0862e(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
                        }
/* 35 */                if (i2 == 6) {
/* 45 */                    return new a32(typedValuePeekValue.getFraction(1.0f, 1.0f));
                        }
                    }
/* 49 */            return m10Var;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8778e(RectF rectF) {
/* 55 */            boolean z = this.f17043l.getClass().equals(dc0.class) && this.f17041j.getClass().equals(dc0.class) && this.f17040i.getClass().equals(dc0.class) && this.f17042k.getClass().equals(dc0.class);
/* 58 */            float fMo47a = this.f17036e.mo47a(rectF);
                    return z && ((this.f17037f.mo47a(rectF) > fMo47a ? 1 : (this.f17037f.mo47a(rectF) == fMo47a ? 0 : -1)) == 0 && (this.f17039h.mo47a(rectF) > fMo47a ? 1 : (this.f17039h.mo47a(rectF) == fMo47a ? 0 : -1)) == 0 && (this.f17038g.mo47a(rectF) > fMo47a ? 1 : (this.f17038g.mo47a(rectF) == fMo47a ? 0 : -1)) == 0) && ((this.f17033b instanceof g52) && (this.f17032a instanceof g52) && (this.f17034c instanceof g52) && (this.f17035d instanceof g52));
                }

                /* JADX INFO: renamed from: f */
                public final sc2 m8779f() {
/* 3 */             sc2 sc2Var = new sc2();
/* 8 */             sc2Var.f16523a = this.f17032a;
/* 12 */            sc2Var.f16524b = this.f17033b;
/* 16 */            sc2Var.f16525c = this.f17034c;
/* 20 */            sc2Var.f16526d = this.f17035d;
/* 24 */            sc2Var.f16527e = this.f17036e;
/* 28 */            sc2Var.f16528f = this.f17037f;
/* 32 */            sc2Var.f16529g = this.f17038g;
/* 36 */            sc2Var.f16530h = this.f17039h;
/* 40 */            sc2Var.f16531i = this.f17040i;
/* 44 */            sc2Var.f16532j = this.f17041j;
/* 48 */            sc2Var.f16533k = this.f17042k;
/* 52 */            sc2Var.f16534l = this.f17043l;
/* 54 */            return sc2Var;
                }
            }
