            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: renamed from: vz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2312vz {

                /* JADX INFO: renamed from: n */
                public static final SparseIntArray f18388n;

                /* JADX INFO: renamed from: a */
                public boolean f18389a;

                /* JADX INFO: renamed from: b */
                public int f18390b;

                /* JADX INFO: renamed from: c */
                public int f18391c;

                /* JADX INFO: renamed from: d */
                public String f18392d;

                /* JADX INFO: renamed from: e */
                public int f18393e;

                /* JADX INFO: renamed from: f */
                public int f18394f;

                /* JADX INFO: renamed from: g */
                public float f18395g;

                /* JADX INFO: renamed from: h */
                public float f18396h;

                /* JADX INFO: renamed from: i */
                public float f18397i;

                /* JADX INFO: renamed from: j */
                public int f18398j;

                /* JADX INFO: renamed from: k */
                public String f18399k;

                /* JADX INFO: renamed from: l */
                public int f18400l;

                /* JADX INFO: renamed from: m */
                public int f18401m;

                static {
/* 3 */             SparseIntArray sparseIntArray = new SparseIntArray();
/* 6 */             f18388n = sparseIntArray;
/* 11 */            sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
/* 17 */            sparseIntArray.append(R$styleable.Motion_pathMotionArc, 2);
/* 23 */            sparseIntArray.append(R$styleable.Motion_transitionEasing, 3);
/* 29 */            sparseIntArray.append(R$styleable.Motion_drawPath, 4);
/* 35 */            sparseIntArray.append(R$styleable.Motion_animateRelativeTo, 5);
/* 41 */            sparseIntArray.append(R$styleable.Motion_animateCircleAngleTo, 6);
/* 47 */            sparseIntArray.append(R$styleable.Motion_motionStagger, 7);
/* 54 */            sparseIntArray.append(R$styleable.Motion_quantizeMotionSteps, 8);
/* 61 */            sparseIntArray.append(R$styleable.Motion_quantizeMotionPhase, 9);
/* 68 */            sparseIntArray.append(R$styleable.Motion_quantizeMotionInterpolator, 10);
                }

                /* JADX INFO: renamed from: a */
                public final void m9355a(C2312vz c2312vz) {
/* 3 */             this.f18389a = c2312vz.f18389a;
/* 7 */             this.f18390b = c2312vz.f18390b;
/* 11 */            this.f18392d = c2312vz.f18392d;
/* 15 */            this.f18393e = c2312vz.f18393e;
/* 19 */            this.f18394f = c2312vz.f18394f;
/* 23 */            this.f18396h = c2312vz.f18396h;
/* 27 */            this.f18395g = c2312vz.f18395g;
                }

                /* JADX INFO: renamed from: b */
                public final void m9356b(Context context, AttributeSet attributeSet) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Motion);
/* 8 */             this.f18389a = true;
/* 10 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 16 */            for (int i = 0; i < indexCount; i++) {
/* 18 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
                        switch (f18388n.get(index)) {
                            case 1:
/* 188 */                       this.f18396h = typedArrayObtainStyledAttributes.getFloat(index, this.f18396h);
                                break;
                            case 2:
/* 179 */                       this.f18393e = typedArrayObtainStyledAttributes.getInt(index, this.f18393e);
                                break;
                            case 3:
/* 153 */                       if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
/* 159 */                           this.f18392d = typedArrayObtainStyledAttributes.getString(index);
                                } else {
/* 170 */                           this.f18392d = C2131r4.f15856k[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                }
                                break;
                            case 4:
/* 144 */                       this.f18394f = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 5:
/* 137 */                       this.f18390b = C0077d.m532l(typedArrayObtainStyledAttributes, index, this.f18390b);
                                break;
                            case 6:
/* 128 */                       this.f18391c = typedArrayObtainStyledAttributes.getInteger(index, this.f18391c);
                                break;
                            case 7:
/* 119 */                       this.f18395g = typedArrayObtainStyledAttributes.getFloat(index, this.f18395g);
                                break;
                            case 8:
/* 110 */                       this.f18398j = typedArrayObtainStyledAttributes.getInteger(index, this.f18398j);
                                break;
                            case 9:
/* 101 */                       this.f18397i = typedArrayObtainStyledAttributes.getFloat(index, this.f18397i);
                                break;
                            case 10:
/* 38 */                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
/* 42 */                        if (i2 == 1) {
/* 44 */                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 48 */                            this.f18401m = resourceId;
/* 50 */                            if (resourceId != -1) {
/* 52 */                                this.f18400l = -2;
                                    }
                                } else if (i2 == 3) {
/* 58 */                            String string = typedArrayObtainStyledAttributes.getString(index);
/* 62 */                            this.f18399k = string;
/* 70 */                            if (string.indexOf("/") > 0) {
/* 76 */                                this.f18401m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 78 */                                this.f18400l = -2;
                                    } else {
/* 82 */                                this.f18400l = -1;
                                    }
                                } else {
/* 92 */                            this.f18400l = typedArrayObtainStyledAttributes.getInteger(index, this.f18401m);
                                }
                                break;
                        }
                    }
/* 194 */           typedArrayObtainStyledAttributes.recycle();
                }
            }
