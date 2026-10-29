            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$styleable;
            
            /* JADX INFO: renamed from: oi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2002oi {

                /* JADX INFO: renamed from: a */
                public int f14762a;

                /* JADX INFO: renamed from: b */
                public int f14763b;

                /* JADX INFO: renamed from: c */
                public int[] f14764c;

                /* JADX INFO: renamed from: d */
                public int f14765d;

                /* JADX INFO: renamed from: e */
                public int f14766e;

                /* JADX INFO: renamed from: f */
                public int f14767f;

                public AbstractC2002oi(Context context, AttributeSet attributeSet, int i, int i2) {
/* 7 */             this.f14764c = new int[0];
/* 15 */            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_track_thickness);
/* 19 */            int[] iArr = R$styleable.BaseProgressIndicator;
/* 23 */            rn2.m8210a(context, attributeSet, i, i2);
/* 30 */            rn2.m8211b(context, attributeSet, iArr, i, i2, new int[0]);
/* 33 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 43 */            this.f14762a = de3.m3034p(context, typedArrayObtainStyledAttributes, R$styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
/* 59 */            this.f14763b = Math.min(de3.m3034p(context, typedArrayObtainStyledAttributes, R$styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f14762a / 2);
/* 67 */            this.f14766e = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_showAnimationBehavior, 0);
/* 75 */            this.f14767f = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
/* 84 */            if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_indicatorColor)) {
/* 96 */                this.f14764c = new int[]{xe2.m9780r(context, R$attr.colorPrimary, -1)};
                    } else if (typedArrayObtainStyledAttributes.peekValue(R$styleable.BaseProgressIndicator_indicatorColor).type != 1) {
/* 120 */               this.f14764c = new int[]{typedArrayObtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_indicatorColor, -1)};
                    } else {
/* 133 */               int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseProgressIndicator_indicatorColor, -1));
/* 137 */               this.f14764c = intArray;
/* 140 */               if (intArray.length == 0) {
/* 208 */                   C1951n4.m6859j("indicatorColors cannot be empty when indicatorColor is not used.");
/* 212 */                   throw null;
                        }
                    }
/* 148 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_trackColor)) {
/* 156 */               this.f14765d = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_trackColor, -1);
                    } else {
/* 163 */               this.f14765d = this.f14764c[0];
/* 176 */               TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
/* 183 */               float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
/* 187 */               typedArrayObtainStyledAttributes2.recycle();
/* 200 */               this.f14765d = xe2.m9772j(this.f14765d, (int) (f * 255.0f));
                    }
/* 202 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo2348a();
            }
