            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: renamed from: xz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2479xz {

                /* JADX INFO: renamed from: o */
                public static final SparseIntArray f19405o;

                /* JADX INFO: renamed from: a */
                public boolean f19406a;

                /* JADX INFO: renamed from: b */
                public float f19407b;

                /* JADX INFO: renamed from: c */
                public float f19408c;

                /* JADX INFO: renamed from: d */
                public float f19409d;

                /* JADX INFO: renamed from: e */
                public float f19410e;

                /* JADX INFO: renamed from: f */
                public float f19411f;

                /* JADX INFO: renamed from: g */
                public float f19412g;

                /* JADX INFO: renamed from: h */
                public float f19413h;

                /* JADX INFO: renamed from: i */
                public int f19414i;

                /* JADX INFO: renamed from: j */
                public float f19415j;

                /* JADX INFO: renamed from: k */
                public float f19416k;

                /* JADX INFO: renamed from: l */
                public float f19417l;

                /* JADX INFO: renamed from: m */
                public boolean f19418m;

                /* JADX INFO: renamed from: n */
                public float f19419n;

                static {
/* 3 */             SparseIntArray sparseIntArray = new SparseIntArray();
/* 6 */             f19405o = sparseIntArray;
/* 11 */            sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
/* 17 */            sparseIntArray.append(R$styleable.Transform_android_rotationX, 2);
/* 23 */            sparseIntArray.append(R$styleable.Transform_android_rotationY, 3);
/* 29 */            sparseIntArray.append(R$styleable.Transform_android_scaleX, 4);
/* 35 */            sparseIntArray.append(R$styleable.Transform_android_scaleY, 5);
/* 41 */            sparseIntArray.append(R$styleable.Transform_android_transformPivotX, 6);
/* 47 */            sparseIntArray.append(R$styleable.Transform_android_transformPivotY, 7);
/* 54 */            sparseIntArray.append(R$styleable.Transform_android_translationX, 8);
/* 61 */            sparseIntArray.append(R$styleable.Transform_android_translationY, 9);
/* 68 */            sparseIntArray.append(R$styleable.Transform_android_translationZ, 10);
/* 75 */            sparseIntArray.append(R$styleable.Transform_android_elevation, 11);
/* 82 */            sparseIntArray.append(R$styleable.Transform_transformPivotTarget, 12);
                }

                /* JADX INFO: renamed from: a */
                public final void m10047a(C2479xz c2479xz) {
/* 3 */             this.f19406a = c2479xz.f19406a;
/* 7 */             this.f19407b = c2479xz.f19407b;
/* 11 */            this.f19408c = c2479xz.f19408c;
/* 15 */            this.f19409d = c2479xz.f19409d;
/* 19 */            this.f19410e = c2479xz.f19410e;
/* 23 */            this.f19411f = c2479xz.f19411f;
/* 27 */            this.f19412g = c2479xz.f19412g;
/* 31 */            this.f19413h = c2479xz.f19413h;
/* 35 */            this.f19414i = c2479xz.f19414i;
/* 39 */            this.f19415j = c2479xz.f19415j;
/* 43 */            this.f19416k = c2479xz.f19416k;
/* 47 */            this.f19417l = c2479xz.f19417l;
/* 51 */            this.f19418m = c2479xz.f19418m;
/* 55 */            this.f19419n = c2479xz.f19419n;
                }

                /* JADX INFO: renamed from: b */
                public final void m10048b(Context context, AttributeSet attributeSet) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transform);
/* 8 */             this.f19406a = true;
/* 10 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 15 */            for (int i = 0; i < indexCount; i++) {
/* 17 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
                        switch (f19405o.get(index)) {
                            case 1:
/* 139 */                       this.f19407b = typedArrayObtainStyledAttributes.getFloat(index, this.f19407b);
                                break;
                            case 2:
/* 130 */                       this.f19408c = typedArrayObtainStyledAttributes.getFloat(index, this.f19408c);
                                break;
                            case 3:
/* 121 */                       this.f19409d = typedArrayObtainStyledAttributes.getFloat(index, this.f19409d);
                                break;
                            case 4:
/* 112 */                       this.f19410e = typedArrayObtainStyledAttributes.getFloat(index, this.f19410e);
                                break;
                            case 5:
/* 103 */                       this.f19411f = typedArrayObtainStyledAttributes.getFloat(index, this.f19411f);
                                break;
                            case 6:
/* 94 */                        this.f19412g = typedArrayObtainStyledAttributes.getDimension(index, this.f19412g);
                                break;
                            case 7:
/* 85 */                        this.f19413h = typedArrayObtainStyledAttributes.getDimension(index, this.f19413h);
                                break;
                            case 8:
/* 76 */                        this.f19415j = typedArrayObtainStyledAttributes.getDimension(index, this.f19415j);
                                break;
                            case 9:
/* 67 */                        this.f19416k = typedArrayObtainStyledAttributes.getDimension(index, this.f19416k);
                                break;
                            case 10:
/* 58 */                        this.f19417l = typedArrayObtainStyledAttributes.getDimension(index, this.f19417l);
                                break;
                            case 11:
/* 41 */                        this.f19418m = true;
/* 49 */                        this.f19419n = typedArrayObtainStyledAttributes.getDimension(index, this.f19419n);
                                break;
                            case 12:
/* 38 */                        this.f19414i = C0077d.m532l(typedArrayObtainStyledAttributes, index, this.f19414i);
                                break;
                        }
                    }
/* 145 */           typedArrayObtainStyledAttributes.recycle();
                }
            }
