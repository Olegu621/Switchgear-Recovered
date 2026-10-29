            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import java.util.HashMap;
            import p000.C2274uz;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class Constraints extends ViewGroup {

                /* JADX INFO: renamed from: a */
                public C0077d f1139a;

                public Constraints(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             super.setVisibility(8);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 3 */             return new LayoutParams();
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public C0077d getConstraintSet() {
/* 3 */             if (this.f1139a == null) {
/* 10 */                this.f1139a = new C0077d();
                    }
/* 12 */            C0077d c0077d = this.f1139a;
/* 14 */            c0077d.getClass();
/* 17 */            int childCount = getChildCount();
/* 21 */            HashMap map = c0077d.f1192f;
/* 23 */            map.clear();
/* 27 */            for (int i = 0; i < childCount; i++) {
/* 29 */                View childAt = getChildAt(i);
/* 37 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 39 */                int id = childAt.getId();
/* 45 */                if (c0077d.f1191e && id == -1) {
/* 53 */                    f42.m3663s("All children of ConstraintLayout must have ids to use ConstraintSet");
/* 56 */                    return null;
                        }
/* 66 */                if (!map.containsKey(Integer.valueOf(id))) {
/* 77 */                    map.put(Integer.valueOf(id), new C0076c());
                        }
/* 88 */                C0076c c0076c = (C0076c) map.get(Integer.valueOf(id));
/* 90 */                if (c0076c != null) {
/* 95 */                    if (childAt instanceof ConstraintHelper) {
/* 97 */                        ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
/* 99 */                        C2274uz c2274uz = c0076c.f1180e;
/* 101 */                       c0076c.m528d(id, layoutParams);
/* 106 */                       if (constraintHelper instanceof Barrier) {
/* 109 */                           c2274uz.f17788i0 = 1;
/* 111 */                           Barrier barrier = (Barrier) constraintHelper;
/* 117 */                           c2274uz.f17784g0 = barrier.getType();
/* 123 */                           c2274uz.f17790j0 = barrier.getReferencedIds();
/* 129 */                           c2274uz.f17786h0 = barrier.getMargin();
                                }
                            }
/* 131 */                   c0076c.m528d(id, layoutParams);
                        }
                    }
/* 137 */           return this.f1139a;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

/* 9 */         public Constraints(Context context, AttributeSet attributeSet, int i) {
/* 10 */            super(context, attributeSet, i);
/* 11 */            super.setVisibility(8);
                }

                @Override // android.view.ViewGroup
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return new ConstraintLayout.LayoutParams(layoutParams);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 218 */       public static class LayoutParams extends ConstraintLayout.LayoutParams {

                    /* JADX INFO: renamed from: A0 */
                    public final float f1140A0;

                    /* JADX INFO: renamed from: B0 */
                    public final float f1141B0;

                    /* JADX INFO: renamed from: C0 */
                    public final float f1142C0;

                    /* JADX INFO: renamed from: D0 */
                    public final float f1143D0;

                    /* JADX INFO: renamed from: r0 */
                    public final float f1144r0;

                    /* JADX INFO: renamed from: s0 */
                    public final boolean f1145s0;

                    /* JADX INFO: renamed from: t0 */
                    public final float f1146t0;

                    /* JADX INFO: renamed from: u0 */
                    public final float f1147u0;

                    /* JADX INFO: renamed from: v0 */
                    public final float f1148v0;

                    /* JADX INFO: renamed from: w0 */
                    public final float f1149w0;

                    /* JADX INFO: renamed from: x0 */
                    public final float f1150x0;

                    /* JADX INFO: renamed from: y0 */
                    public final float f1151y0;

                    /* JADX INFO: renamed from: z0 */
                    public final float f1152z0;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 6 */                 this.f1144r0 = 1.0f;
/* 9 */                 this.f1145s0 = false;
/* 12 */                this.f1146t0 = 0.0f;
/* 14 */                this.f1147u0 = 0.0f;
/* 16 */                this.f1148v0 = 0.0f;
/* 18 */                this.f1149w0 = 0.0f;
/* 20 */                this.f1150x0 = 1.0f;
/* 22 */                this.f1151y0 = 1.0f;
/* 24 */                this.f1152z0 = 0.0f;
/* 26 */                this.f1140A0 = 0.0f;
/* 28 */                this.f1141B0 = 0.0f;
/* 30 */                this.f1142C0 = 0.0f;
/* 32 */                this.f1143D0 = 0.0f;
/* 36 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
/* 40 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 44 */                for (int i = 0; i < indexCount; i++) {
/* 46 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 52 */                    if (index == R$styleable.ConstraintSet_android_alpha) {
/* 60 */                        this.f1144r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1144r0);
                            } else if (index == R$styleable.ConstraintSet_android_elevation) {
/* 74 */                        this.f1146t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1146t0);
/* 77 */                        this.f1145s0 = true;
                            } else if (index == R$styleable.ConstraintSet_android_rotationX) {
/* 91 */                        this.f1148v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1148v0);
                            } else if (index == R$styleable.ConstraintSet_android_rotationY) {
/* 105 */                       this.f1149w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1149w0);
                            } else if (index == R$styleable.ConstraintSet_android_rotation) {
/* 119 */                       this.f1147u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1147u0);
                            } else if (index == R$styleable.ConstraintSet_android_scaleX) {
/* 132 */                       this.f1150x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1150x0);
                            } else if (index == R$styleable.ConstraintSet_android_scaleY) {
/* 145 */                       this.f1151y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1151y0);
                            } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
/* 158 */                       this.f1152z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1152z0);
                            } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
/* 171 */                       this.f1140A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1140A0);
                            } else if (index == R$styleable.ConstraintSet_android_translationX) {
/* 184 */                       this.f1141B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1141B0);
                            } else if (index == R$styleable.ConstraintSet_android_translationY) {
/* 197 */                       this.f1142C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1142C0);
                            } else if (index == R$styleable.ConstraintSet_android_translationZ) {
/* 210 */                       this.f1143D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1143D0);
                            }
                        }
/* 216 */               typedArrayObtainStyledAttributes.recycle();
                    }

/* 219 */           public LayoutParams() {
/* 221 */               this.f1144r0 = 1.0f;
/* 222 */               this.f1145s0 = false;
/* 223 */               this.f1146t0 = 0.0f;
/* 224 */               this.f1147u0 = 0.0f;
/* 225 */               this.f1148v0 = 0.0f;
/* 226 */               this.f1149w0 = 0.0f;
/* 227 */               this.f1150x0 = 1.0f;
/* 228 */               this.f1151y0 = 1.0f;
/* 229 */               this.f1152z0 = 0.0f;
/* 230 */               this.f1140A0 = 0.0f;
/* 231 */               this.f1141B0 = 0.0f;
/* 232 */               this.f1142C0 = 0.0f;
/* 233 */               this.f1143D0 = 0.0f;
                    }
                }
            }
