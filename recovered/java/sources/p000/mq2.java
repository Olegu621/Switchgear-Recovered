            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.RectF;
            import android.util.Xml;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mq2 {

                /* JADX INFO: renamed from: E */
                public static final float[][] f13945E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

                /* JADX INFO: renamed from: F */
                public static final float[][] f13946F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

                /* JADX INFO: renamed from: A */
                public final float f13947A;

                /* JADX INFO: renamed from: B */
                public final float f13948B;

                /* JADX INFO: renamed from: C */
                public final int f13949C;

                /* JADX INFO: renamed from: D */
                public final int f13950D;

                /* JADX INFO: renamed from: a */
                public final int f13951a;

                /* JADX INFO: renamed from: b */
                public final int f13952b;

                /* JADX INFO: renamed from: c */
                public int f13953c;

                /* JADX INFO: renamed from: d */
                public final int f13954d;

                /* JADX INFO: renamed from: e */
                public final int f13955e;

                /* JADX INFO: renamed from: f */
                public final int f13956f;

                /* JADX INFO: renamed from: g */
                public float f13957g;

                /* JADX INFO: renamed from: h */
                public float f13958h;

                /* JADX INFO: renamed from: i */
                public final int f13959i;

                /* JADX INFO: renamed from: j */
                public final boolean f13960j;

                /* JADX INFO: renamed from: k */
                public float f13961k;

                /* JADX INFO: renamed from: l */
                public float f13962l;

                /* JADX INFO: renamed from: m */
                public boolean f13963m = false;

                /* JADX INFO: renamed from: n */
                public final float[] f13964n = new float[2];

                /* JADX INFO: renamed from: o */
                public final int[] f13965o = new int[2];

                /* JADX INFO: renamed from: p */
                public float f13966p;

                /* JADX INFO: renamed from: q */
                public float f13967q;

                /* JADX INFO: renamed from: r */
                public final MotionLayout f13968r;

                /* JADX INFO: renamed from: s */
                public final float f13969s;

                /* JADX INFO: renamed from: t */
                public final float f13970t;

                /* JADX INFO: renamed from: u */
                public final boolean f13971u;

                /* JADX INFO: renamed from: v */
                public final float f13972v;

                /* JADX INFO: renamed from: w */
                public final int f13973w;

                /* JADX INFO: renamed from: x */
                public final float f13974x;

                /* JADX INFO: renamed from: y */
                public final float f13975y;

                /* JADX INFO: renamed from: z */
                public final float f13976z;

                public mq2(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
/* 5 */             this.f13951a = 0;
/* 7 */             this.f13952b = 0;
/* 9 */             this.f13953c = 0;
/* 12 */            this.f13954d = -1;
/* 14 */            this.f13955e = -1;
/* 16 */            this.f13956f = -1;
/* 20 */            this.f13957g = 0.5f;
/* 22 */            this.f13958h = 0.5f;
/* 24 */            this.f13959i = -1;
/* 26 */            this.f13960j = false;
/* 29 */            this.f13961k = 0.0f;
/* 33 */            this.f13962l = 1.0f;
/* 48 */            this.f13969s = 4.0f;
/* 53 */            this.f13970t = 1.2f;
/* 56 */            this.f13971u = true;
/* 58 */            this.f13972v = 1.0f;
/* 60 */            this.f13973w = 0;
/* 64 */            this.f13974x = 10.0f;
/* 66 */            this.f13975y = 10.0f;
/* 68 */            this.f13976z = 1.0f;
/* 72 */            this.f13947A = Float.NaN;
/* 74 */            this.f13948B = Float.NaN;
/* 76 */            this.f13949C = 0;
/* 78 */            this.f13950D = 0;
/* 80 */            this.f13968r = motionLayout;
/* 88 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnSwipe);
/* 92 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 97 */            for (int i = 0; i < indexCount; i++) {
/* 99 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 105 */               if (index == R$styleable.OnSwipe_touchAnchorId) {
/* 113 */                   this.f13954d = typedArrayObtainStyledAttributes.getResourceId(index, this.f13954d);
                        } else if (index == R$styleable.OnSwipe_touchAnchorSide) {
/* 123 */                   int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f13951a);
/* 127 */                   this.f13951a = i2;
/* 131 */                   float[] fArr = f13945E[i2];
/* 135 */                   this.f13958h = fArr[0];
/* 139 */                   this.f13957g = fArr[1];
                        } else if (index == R$styleable.OnSwipe_dragDirection) {
/* 149 */                   int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f13952b);
/* 153 */                   this.f13952b = i3;
/* 156 */                   if (i3 < 6) {
/* 160 */                       float[] fArr2 = f13946F[i3];
/* 164 */                       this.f13961k = fArr2[0];
/* 168 */                       this.f13962l = fArr2[1];
                            } else {
/* 172 */                       this.f13962l = Float.NaN;
/* 174 */                       this.f13961k = Float.NaN;
/* 176 */                       this.f13960j = true;
                            }
                        } else if (index == R$styleable.OnSwipe_maxVelocity) {
/* 190 */                   this.f13969s = typedArrayObtainStyledAttributes.getFloat(index, this.f13969s);
                        } else if (index == R$styleable.OnSwipe_maxAcceleration) {
/* 204 */                   this.f13970t = typedArrayObtainStyledAttributes.getFloat(index, this.f13970t);
                        } else if (index == R$styleable.OnSwipe_moveWhenScrollAtTop) {
/* 218 */                   this.f13971u = typedArrayObtainStyledAttributes.getBoolean(index, this.f13971u);
                        } else if (index == R$styleable.OnSwipe_dragScale) {
/* 232 */                   this.f13972v = typedArrayObtainStyledAttributes.getFloat(index, this.f13972v);
                        } else if (index == R$styleable.OnSwipe_dragThreshold) {
/* 246 */                   this.f13974x = typedArrayObtainStyledAttributes.getFloat(index, this.f13974x);
                        } else if (index == R$styleable.OnSwipe_touchRegionId) {
/* 260 */                   this.f13955e = typedArrayObtainStyledAttributes.getResourceId(index, this.f13955e);
                        } else if (index == R$styleable.OnSwipe_onTouchUp) {
/* 274 */                   this.f13953c = typedArrayObtainStyledAttributes.getInt(index, this.f13953c);
                        } else if (index == R$styleable.OnSwipe_nestedScrollFlags) {
/* 286 */                   this.f13973w = typedArrayObtainStyledAttributes.getInteger(index, 0);
                        } else if (index == R$styleable.OnSwipe_limitBoundsTo) {
/* 297 */                   this.f13956f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                        } else if (index == R$styleable.OnSwipe_rotationCenterId) {
/* 310 */                   this.f13959i = typedArrayObtainStyledAttributes.getResourceId(index, this.f13959i);
                        } else if (index == R$styleable.OnSwipe_springDamping) {
/* 323 */                   this.f13975y = typedArrayObtainStyledAttributes.getFloat(index, this.f13975y);
                        } else if (index == R$styleable.OnSwipe_springMass) {
/* 336 */                   this.f13976z = typedArrayObtainStyledAttributes.getFloat(index, this.f13976z);
                        } else if (index == R$styleable.OnSwipe_springStiffness) {
/* 349 */                   this.f13947A = typedArrayObtainStyledAttributes.getFloat(index, this.f13947A);
                        } else if (index == R$styleable.OnSwipe_springStopThreshold) {
/* 362 */                   this.f13948B = typedArrayObtainStyledAttributes.getFloat(index, this.f13948B);
                        } else if (index == R$styleable.OnSwipe_springBoundary) {
/* 375 */                   this.f13949C = typedArrayObtainStyledAttributes.getInt(index, this.f13949C);
                        } else if (index == R$styleable.OnSwipe_autoCompleteMode) {
/* 388 */                   this.f13950D = typedArrayObtainStyledAttributes.getInt(index, this.f13950D);
                        }
                    }
/* 394 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final RectF m6786a(ViewGroup viewGroup, RectF rectF) {
                    View viewFindViewById;
/* 2 */             int i = this.f13956f;
/* 4 */             if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
/* 13 */                return null;
                    }
/* 35 */            rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
/* 38 */            return rectF;
                }

                /* JADX INFO: renamed from: b */
                public final RectF m6787b(ViewGroup viewGroup, RectF rectF) {
                    View viewFindViewById;
/* 2 */             int i = this.f13955e;
/* 4 */             if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
/* 13 */                return null;
                    }
/* 35 */            rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
/* 38 */            return rectF;
                }

                /* JADX INFO: renamed from: c */
                public final void m6788c(boolean z) {
/* 4 */             float[][] fArr = f13945E;
/* 6 */             float[][] fArr2 = f13946F;
/* 11 */            if (z) {
/* 15 */                fArr2[4] = fArr2[3];
/* 19 */                fArr2[5] = fArr2[2];
/* 23 */                fArr[5] = fArr[2];
/* 27 */                fArr[6] = fArr[1];
                    } else {
/* 32 */                fArr2[4] = fArr2[2];
/* 36 */                fArr2[5] = fArr2[3];
/* 40 */                fArr[5] = fArr[1];
/* 44 */                fArr[6] = fArr[2];
                    }
/* 48 */            float[] fArr3 = fArr[this.f13951a];
/* 53 */            this.f13958h = fArr3[0];
/* 57 */            this.f13957g = fArr3[1];
/* 59 */            int i = this.f13952b;
/* 61 */            if (i >= 6) {
/* 63 */                return;
                    }
/* 64 */            float[] fArr4 = fArr2[i];
/* 68 */            this.f13961k = fArr4[0];
/* 72 */            this.f13962l = fArr4[1];
                }

                public final String toString() {
/* 7 */             if (Float.isNaN(this.f13961k)) {
/* 9 */                 return "rotation";
                    }
/* 32 */            return this.f13961k + " , " + this.f13962l;
                }
            }
