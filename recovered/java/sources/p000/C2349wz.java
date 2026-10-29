            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: renamed from: wz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2349wz {

                /* JADX INFO: renamed from: a */
                public boolean f18870a;

                /* JADX INFO: renamed from: b */
                public int f18871b;

                /* JADX INFO: renamed from: c */
                public int f18872c;

                /* JADX INFO: renamed from: d */
                public float f18873d;

                /* JADX INFO: renamed from: e */
                public float f18874e;

                /* JADX INFO: renamed from: a */
                public final void m9668a(Context context, AttributeSet attributeSet) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PropertySet);
/* 8 */             this.f18870a = true;
/* 10 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 15 */            for (int i = 0; i < indexCount; i++) {
/* 17 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 23 */                if (index == R$styleable.PropertySet_android_alpha) {
/* 31 */                    this.f18873d = typedArrayObtainStyledAttributes.getFloat(index, this.f18873d);
                        } else if (index == R$styleable.PropertySet_android_visibility) {
/* 40 */                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f18871b);
/* 44 */                    this.f18871b = i2;
/* 50 */                    this.f18871b = C0077d.f1184g[i2];
                        } else if (index == R$styleable.PropertySet_visibilityMode) {
/* 63 */                    this.f18872c = typedArrayObtainStyledAttributes.getInt(index, this.f18872c);
                        } else if (index == R$styleable.PropertySet_motionProgress) {
/* 76 */                    this.f18874e = typedArrayObtainStyledAttributes.getFloat(index, this.f18874e);
                        }
                    }
/* 81 */            typedArrayObtainStyledAttributes.recycle();
                }
            }
