            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s31 extends a31 {

                /* JADX INFO: renamed from: e */
                public int f16397e = -1;

                /* JADX INFO: renamed from: f */
                public String f16398f = null;

                /* JADX INFO: renamed from: g */
                public int f16399g = -1;

                /* JADX INFO: renamed from: h */
                public int f16400h = 0;

                /* JADX INFO: renamed from: i */
                public float f16401i = Float.NaN;

                /* JADX INFO: renamed from: j */
                public float f16402j = Float.NaN;

                /* JADX INFO: renamed from: k */
                public float f16403k = Float.NaN;

                /* JADX INFO: renamed from: l */
                public float f16404l = Float.NaN;

                /* JADX INFO: renamed from: m */
                public int f16405m = 0;

                @Override // p000.a31
                /* JADX INFO: renamed from: a */
                public final a31 clone() {
/* 3 */             s31 s31Var = new s31();
/* 8 */             s31Var.f72a = this.f72a;
/* 12 */            s31Var.f73b = this.f73b;
/* 16 */            s31Var.f74c = this.f74c;
/* 20 */            s31Var.f75d = this.f75d;
/* 24 */            s31Var.f16398f = this.f16398f;
/* 28 */            s31Var.f16399g = this.f16399g;
/* 32 */            s31Var.f16400h = this.f16400h;
/* 36 */            s31Var.f16401i = this.f16401i;
/* 40 */            s31Var.f16402j = Float.NaN;
/* 44 */            s31Var.f16403k = this.f16403k;
/* 48 */            s31Var.f16404l = this.f16404l;
/* 50 */            return s31Var;
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: b */
                public final void mo44b(HashSet hashSet) {
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: c */
                public final void mo45c(Context context, AttributeSet attributeSet) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyPosition);
/* 7 */             SparseIntArray sparseIntArray = r31.f15842a;
/* 9 */             int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 18 */            for (int i = 0; i < indexCount; i++) {
/* 20 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 24 */                SparseIntArray sparseIntArray2 = r31.f15842a;
                        switch (sparseIntArray2.get(index)) {
                            case 1:
/* 195 */                       if (MotionLayout.f875s1) {
/* 199 */                           int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f73b);
/* 203 */                           this.f73b = resourceId;
/* 205 */                           if (resourceId == -1) {
/* 211 */                               this.f74c = typedArrayObtainStyledAttributes.getString(index);
                                    }
                                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
/* 226 */                           this.f74c = typedArrayObtainStyledAttributes.getString(index);
                                } else {
/* 235 */                           this.f73b = typedArrayObtainStyledAttributes.getResourceId(index, this.f73b);
                                }
                                break;
                            case 2:
/* 190 */                       this.f72a = typedArrayObtainStyledAttributes.getInt(index, this.f72a);
                                break;
                            case 3:
/* 164 */                       if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
/* 170 */                           this.f16398f = typedArrayObtainStyledAttributes.getString(index);
                                } else {
/* 181 */                           this.f16398f = C2131r4.f15856k[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                }
                                break;
                            case 4:
/* 155 */                       this.f16397e = typedArrayObtainStyledAttributes.getInteger(index, this.f16397e);
                                break;
                            case 5:
/* 146 */                       this.f16400h = typedArrayObtainStyledAttributes.getInt(index, this.f16400h);
                                break;
                            case 6:
/* 137 */                       this.f16403k = typedArrayObtainStyledAttributes.getFloat(index, this.f16403k);
                                break;
                            case 7:
/* 127 */                       this.f16404l = typedArrayObtainStyledAttributes.getFloat(index, this.f16404l);
                                break;
                            case 8:
/* 111 */                       float f = typedArrayObtainStyledAttributes.getFloat(index, this.f16402j);
/* 115 */                       this.f16401i = f;
/* 117 */                       this.f16402j = f;
                                break;
                            case 9:
/* 105 */                       this.f16405m = typedArrayObtainStyledAttributes.getInt(index, this.f16405m);
                                break;
                            case 10:
/* 95 */                        this.f16399g = typedArrayObtainStyledAttributes.getInt(index, this.f16399g);
                                break;
                            case 11:
/* 85 */                        this.f16401i = typedArrayObtainStyledAttributes.getFloat(index, this.f16401i);
                                break;
                            case 12:
/* 75 */                        this.f16402j = typedArrayObtainStyledAttributes.getFloat(index, this.f16402j);
                                break;
                            default:
/* 64 */                        AbstractC1245n0.m4876d("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                                break;
                        }
                    }
/* 243 */           if (this.f72a == -1) {
/* 247 */               AbstractC1245n0.m4876d("KeyPosition", "no frame position");
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m8390f(Object obj, String str) {
                    switch (str) {
                        case "transitionEasing":
/* 165 */                   this.f16398f = obj.toString();
                            break;
                        case "percentWidth":
/* 158 */                   this.f16401i = a31.m42e((Number) obj);
                            break;
                        case "percentHeight":
/* 149 */                   this.f16402j = a31.m42e((Number) obj);
                            break;
                        case "drawPath":
/* 119 */                   Number number = (Number) obj;
/* 140 */                   this.f16400h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                            break;
                        case "sizePercent":
/* 110 */                   float fM42e = a31.m42e((Number) obj);
/* 114 */                   this.f16401i = fM42e;
/* 116 */                   this.f16402j = fM42e;
                            break;
                        case "percentX":
/* 105 */                   this.f16403k = a31.m42e((Number) obj);
                            break;
                        case "percentY":
/* 96 */                    this.f16404l = a31.m42e((Number) obj);
                            break;
                    }
                }
            }
