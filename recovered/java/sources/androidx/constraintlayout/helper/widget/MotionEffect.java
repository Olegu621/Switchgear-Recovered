            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionHelper;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import p000.c31;
            import p000.de3;
            import p000.e53;
            import p000.ik1;
            import p000.lk1;
            import p000.s31;
            import p000.zj1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public class MotionEffect extends MotionHelper {

                /* JADX INFO: renamed from: a0 */
                public float f863a0;

                /* JADX INFO: renamed from: b0 */
                public int f864b0;

                /* JADX INFO: renamed from: c0 */
                public int f865c0;

                /* JADX INFO: renamed from: d0 */
                public int f866d0;

                /* JADX INFO: renamed from: e0 */
                public int f867e0;

                /* JADX INFO: renamed from: f0 */
                public boolean f868f0;

                /* JADX INFO: renamed from: g0 */
                public int f869g0;

                /* JADX INFO: renamed from: h0 */
                public int f870h0;

                public MotionEffect(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 7 */             this.f863a0 = 0.1f;
/* 11 */            this.f864b0 = 49;
/* 15 */            this.f865c0 = 50;
/* 18 */            this.f866d0 = 0;
/* 20 */            this.f867e0 = 0;
/* 23 */            this.f868f0 = true;
/* 26 */            this.f869g0 = -1;
/* 28 */            this.f870h0 = -1;
/* 30 */            m467s(context, attributeSet);
                }

                /* JADX WARN: Code duplicated, block: B:102:0x01ef  */
                /* JADX WARN: Code duplicated, block: B:106:0x020d  */
                /* JADX WARN: Code duplicated, block: B:107:0x0213 A[LOOP:3: B:100:0x01e9->B:107:0x0213, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:119:0x0219 A[EDGE_INSN: B:119:0x0219->B:108:0x0219 BREAK  A[LOOP:3: B:100:0x01e9->B:107:0x0213], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:121:0x014b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:122:0x01fb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:58:0x016e  */
                /* JADX WARN: Code duplicated, block: B:59:0x0173  */
                /* JADX WARN: Code duplicated, block: B:91:0x01b8  */
                /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
                /* JADX WARN: Code duplicated, block: B:96:0x01d2  */
                /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:99:0x01df  */
                @Override // androidx.constraintlayout.motion.widget.MotionHelper
                /* JADX INFO: renamed from: r */
                public final void mo466r(MotionLayout motionLayout, HashMap map) {
                    c31 c31Var;
                    c31 c31Var2;
                    c31 c31Var3;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    lk1 lk1Var;
                    Iterator it;
                    e53 e53Var;
                    ArrayList arrayList;
                    int i6;
                    int[] iArr;
/* 1 */             MotionEffect motionEffect = this;
/* 3 */             HashMap map2 = map;
/* 10 */            int i7 = 1;
/* 21 */            View[] viewArrM510j = motionEffect.m510j((ConstraintLayout) motionEffect.getParent());
/* 25 */            if (viewArrM510j == null) {
/* 27 */                de3.m3037s();
/* 30 */                return;
                    }
/* 33 */            c31 c31Var4 = new c31();
/* 38 */            c31 c31Var5 = new c31();
/* 49 */            c31Var4.m1523f(Float.valueOf(motionEffect.f863a0), "alpha");
/* 58 */            c31Var5.m1523f(Float.valueOf(motionEffect.f863a0), "alpha");
/* 61 */            int i8 = motionEffect.f864b0;
/* 63 */            c31Var4.f72a = i8;
/* 67 */            c31Var5.f72a = motionEffect.f865c0;
/* 71 */            s31 s31Var = new s31();
/* 74 */            s31Var.f72a = i8;
/* 76 */            s31Var.f16405m = 0;
/* 80 */            s31Var.m8390f(0, "percentX");
/* 85 */            s31Var.m8390f(0, "percentY");
/* 90 */            s31 s31Var2 = new s31();
/* 95 */            s31Var2.f72a = motionEffect.f865c0;
/* 97 */            s31Var2.f16405m = 0;
/* 99 */            s31Var2.m8390f(1, "percentX");
/* 102 */           s31Var2.m8390f(1, "percentY");
/* 107 */           c31 c31Var6 = null;
/* 108 */           if (motionEffect.f866d0 > 0) {
/* 112 */               c31Var = new c31();
/* 117 */               c31Var2 = new c31();
/* 128 */               c31Var.m1523f(Integer.valueOf(motionEffect.f866d0), "translationX");
/* 133 */               c31Var.f72a = motionEffect.f865c0;
/* 135 */               c31Var2.m1523f(0, "translationX");
/* 141 */               c31Var2.f72a = motionEffect.f865c0 - 1;
                    } else {
/* 144 */               c31Var = null;
/* 145 */               c31Var2 = null;
                    }
/* 148 */           if (motionEffect.f867e0 > 0) {
/* 152 */               c31Var6 = new c31();
/* 157 */               c31Var3 = new c31();
/* 168 */               c31Var6.m1523f(Integer.valueOf(motionEffect.f867e0), "translationY");
/* 173 */               c31Var6.f72a = motionEffect.f865c0;
/* 175 */               c31Var3.m1523f(0, "translationY");
/* 181 */               c31Var3.f72a = motionEffect.f865c0 - 1;
                    } else {
/* 184 */               c31Var3 = null;
                    }
/* 185 */           int i9 = motionEffect.f870h0;
/* 192 */           if (i9 == -1) {
/* 195 */               int[] iArr2 = new int[4];
/* 197 */               int i10 = 0;
/* 199 */               i2 = 3;
/* 201 */               i3 = 2;
/* 204 */               while (i10 < viewArrM510j.length) {
/* 212 */                   zj1 zj1Var = (zj1) map2.get(viewArrM510j[i10]);
/* 214 */                   if (zj1Var == null) {
/* 216 */                       iArr = iArr2;
/* 218 */                       i6 = i7;
                            } else {
/* 221 */                       i6 = i7;
/* 223 */                       ik1 ik1Var = zj1Var.f20182g;
/* 225 */                       float f = ik1Var.f9690e;
/* 227 */                       ik1 ik1Var2 = zj1Var.f20181f;
/* 229 */                       iArr = iArr2;
/* 233 */                       float f2 = f - ik1Var2.f9690e;
/* 238 */                       float f3 = ik1Var.f9691f - ik1Var2.f9691f;
/* 241 */                       if (f3 < 0.0f) {
/* 247 */                           iArr[i6] = iArr[i6] + 1;
                                }
/* 251 */                       if (f3 > 0.0f) {
/* 257 */                           iArr[0] = iArr[0] + 1;
                                }
/* 261 */                       if (f2 > 0.0f) {
/* 267 */                           iArr[3] = iArr[3] + 1;
                                }
/* 271 */                       if (f2 < 0.0f) {
/* 277 */                           iArr[2] = iArr[2] + 1;
                                }
                            }
/* 279 */                   i10++;
/* 281 */                   i7 = i6;
/* 283 */                   iArr2 = iArr;
                        }
/* 287 */               int[] iArr3 = iArr2;
/* 289 */               i = i7;
/* 291 */               int i11 = iArr3[0];
/* 293 */               i9 = 0;
/* 296 */               while (i7 < 4) {
/* 298 */                   int i12 = iArr3[i7];
/* 300 */                   if (i11 < i12) {
/* 302 */                       i9 = i7;
/* 303 */                       i11 = i12;
                            }
/* 304 */                   i7++;
                        }
                    } else {
/* 307 */               i = 1;
/* 309 */               i2 = 3;
/* 311 */               i3 = 2;
                    }
/* 313 */           int i13 = 0;
/* 316 */           while (i13 < viewArrM510j.length) {
/* 324 */               zj1 zj1Var2 = (zj1) map2.get(viewArrM510j[i13]);
/* 326 */               if (zj1Var2 == null) {
/* 330 */                   i4 = i13;
                        } else {
/* 336 */                   ik1 ik1Var3 = zj1Var2.f20182g;
/* 338 */                   float f4 = ik1Var3.f9690e;
/* 340 */                   ik1 ik1Var4 = zj1Var2.f20181f;
/* 342 */                   i4 = i13;
/* 346 */                   float f5 = f4 - ik1Var4.f9690e;
/* 351 */                   float f6 = ik1Var3.f9691f - ik1Var4.f9691f;
/* 352 */                   if (i9 == 0) {
/* 356 */                       if (f6 <= 0.0f || (motionEffect.f868f0 && f5 != 0.0f)) {
/* 436 */                           i5 = motionEffect.f869g0;
/* 439 */                           if (i5 == -1) {
/* 441 */                               zj1Var2.m10358a(c31Var4);
/* 444 */                               zj1Var2.m10358a(c31Var5);
/* 447 */                               zj1Var2.m10358a(s31Var);
/* 450 */                               zj1Var2.m10358a(s31Var2);
/* 455 */                               if (motionEffect.f866d0 > 0) {
/* 457 */                                   zj1Var2.m10358a(c31Var);
/* 460 */                                   zj1Var2.m10358a(c31Var2);
                                        }
/* 465 */                               if (motionEffect.f867e0 > 0) {
/* 467 */                                   zj1Var2.m10358a(c31Var6);
/* 470 */                                   zj1Var2.m10358a(c31Var3);
                                        }
                                    } else {
/* 476 */                               lk1Var = motionLayout.f908g0;
/* 478 */                               if (lk1Var != null) {
/* 486 */                                   it = ((ArrayList) lk1Var.f13357q.f2212c).iterator();
                                            while (true) {
/* 494 */                                       if (it.hasNext()) {
/* 502 */                                           e53Var = (e53) it.next();
/* 506 */                                           if (e53Var.f7526a == i5) {
/* 522 */                                               arrayList = (ArrayList) e53Var.f7531f.f13555a.get(-1);
/* 524 */                                               if (arrayList != null) {
                                                            break;
                                                        }
/* 528 */                                               zj1Var2.f20198w.addAll(arrayList);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 538 */                           i13 = i4 + 1;
/* 540 */                           map2 = map;
/* 542 */                           i2 = 3;
/* 544 */                           i3 = 2;
/* 546 */                           i = 1;
/* 548 */                           motionEffect = this;
                                }
                            } else if (i9 == i) {
/* 383 */                       if (f6 >= 0.0f || (motionEffect.f868f0 && f5 != 0.0f)) {
/* 436 */                           i5 = motionEffect.f869g0;
/* 439 */                           if (i5 == -1) {
/* 441 */                               zj1Var2.m10358a(c31Var4);
/* 444 */                               zj1Var2.m10358a(c31Var5);
/* 447 */                               zj1Var2.m10358a(s31Var);
/* 450 */                               zj1Var2.m10358a(s31Var2);
/* 455 */                               if (motionEffect.f866d0 > 0) {
/* 457 */                                   zj1Var2.m10358a(c31Var);
/* 460 */                                   zj1Var2.m10358a(c31Var2);
                                        }
/* 465 */                               if (motionEffect.f867e0 > 0) {
/* 467 */                                   zj1Var2.m10358a(c31Var6);
/* 470 */                                   zj1Var2.m10358a(c31Var3);
                                        }
                                    } else {
/* 476 */                               lk1Var = motionLayout.f908g0;
/* 478 */                               if (lk1Var != null) {
/* 486 */                                   it = ((ArrayList) lk1Var.f13357q.f2212c).iterator();
                                            while (true) {
/* 494 */                                       if (it.hasNext()) {
/* 502 */                                           e53Var = (e53) it.next();
/* 506 */                                           if (e53Var.f7526a == i5) {
/* 522 */                                               arrayList = (ArrayList) e53Var.f7531f.f13555a.get(-1);
/* 524 */                                               if (arrayList != null) {
                                                            break;
                                                            break;
                                                        } else {
/* 528 */                                                   zj1Var2.f20198w.addAll(arrayList);
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 538 */                           i13 = i4 + 1;
/* 540 */                           map2 = map;
/* 542 */                           i2 = 3;
/* 544 */                           i3 = 2;
/* 546 */                           i = 1;
/* 548 */                           motionEffect = this;
                                }
                            } else if (i9 != i3) {
/* 419 */                       if (i9 != i2 || f5 <= 0.0f || (motionEffect.f868f0 && f6 != 0.0f)) {
/* 436 */                           i5 = motionEffect.f869g0;
/* 439 */                           if (i5 == -1) {
/* 441 */                               zj1Var2.m10358a(c31Var4);
/* 444 */                               zj1Var2.m10358a(c31Var5);
/* 447 */                               zj1Var2.m10358a(s31Var);
/* 450 */                               zj1Var2.m10358a(s31Var2);
/* 455 */                               if (motionEffect.f866d0 > 0) {
/* 457 */                                   zj1Var2.m10358a(c31Var);
/* 460 */                                   zj1Var2.m10358a(c31Var2);
                                        }
/* 465 */                               if (motionEffect.f867e0 > 0) {
/* 467 */                                   zj1Var2.m10358a(c31Var6);
/* 470 */                                   zj1Var2.m10358a(c31Var3);
                                        }
                                    } else {
/* 476 */                               lk1Var = motionLayout.f908g0;
/* 478 */                               if (lk1Var != null) {
/* 486 */                                   it = ((ArrayList) lk1Var.f13357q.f2212c).iterator();
                                            while (true) {
/* 494 */                                       if (it.hasNext()) {
/* 502 */                                           e53Var = (e53) it.next();
/* 506 */                                           if (e53Var.f7526a == i5) {
/* 522 */                                               arrayList = (ArrayList) e53Var.f7531f.f13555a.get(-1);
/* 524 */                                               if (arrayList != null) {
                                                            break;
                                                            break;
                                                        } else {
/* 528 */                                                   zj1Var2.f20198w.addAll(arrayList);
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 538 */                       i13 = i4 + 1;
/* 540 */                       map2 = map;
/* 542 */                       i2 = 3;
/* 544 */                       i3 = 2;
/* 546 */                       i = 1;
/* 548 */                       motionEffect = this;
                            } else if (f5 >= 0.0f || (motionEffect.f868f0 && f6 != 0.0f)) {
/* 436 */                       i5 = motionEffect.f869g0;
/* 439 */                       if (i5 == -1) {
/* 441 */                           zj1Var2.m10358a(c31Var4);
/* 444 */                           zj1Var2.m10358a(c31Var5);
/* 447 */                           zj1Var2.m10358a(s31Var);
/* 450 */                           zj1Var2.m10358a(s31Var2);
/* 455 */                           if (motionEffect.f866d0 > 0) {
/* 457 */                               zj1Var2.m10358a(c31Var);
/* 460 */                               zj1Var2.m10358a(c31Var2);
                                    }
/* 465 */                           if (motionEffect.f867e0 > 0) {
/* 467 */                               zj1Var2.m10358a(c31Var6);
/* 470 */                               zj1Var2.m10358a(c31Var3);
                                    }
                                } else {
/* 476 */                           lk1Var = motionLayout.f908g0;
/* 478 */                           if (lk1Var != null) {
/* 486 */                               it = ((ArrayList) lk1Var.f13357q.f2212c).iterator();
                                        while (true) {
/* 494 */                                   if (it.hasNext()) {
/* 502 */                                       e53Var = (e53) it.next();
/* 506 */                                       if (e53Var.f7526a == i5) {
/* 522 */                                           arrayList = (ArrayList) e53Var.f7531f.f13555a.get(-1);
/* 524 */                                           if (arrayList != null) {
                                                        break;
                                                        break;
                                                    } else {
/* 528 */                                               zj1Var2.f20198w.addAll(arrayList);
                                                        break;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 538 */                       i13 = i4 + 1;
/* 540 */                       map2 = map;
/* 542 */                       i2 = 3;
/* 544 */                       i3 = 2;
/* 546 */                       i = 1;
/* 548 */                       motionEffect = this;
                            }
                        }
/* 538 */               i13 = i4 + 1;
/* 540 */               map2 = map;
/* 542 */               i2 = 3;
/* 544 */               i3 = 2;
/* 546 */               i = 1;
/* 548 */               motionEffect = this;
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m467s(Context context, AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 5 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MotionEffect);
/* 9 */                 int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 15 */                for (int i = 0; i < indexCount; i++) {
/* 17 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 25 */                    if (index == R$styleable.MotionEffect_motionEffect_start) {
/* 29 */                        int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f864b0);
/* 33 */                        this.f864b0 = i2;
/* 43 */                        this.f864b0 = Math.max(Math.min(i2, 99), 0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_end) {
/* 52 */                        int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f865c0);
/* 56 */                        this.f865c0 = i3;
/* 66 */                        this.f865c0 = Math.max(Math.min(i3, 99), 0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_translationX) {
/* 79 */                        this.f866d0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f866d0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_translationY) {
/* 92 */                        this.f867e0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f867e0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_alpha) {
/* 105 */                       this.f863a0 = typedArrayObtainStyledAttributes.getFloat(index, this.f863a0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_move) {
/* 118 */                       this.f870h0 = typedArrayObtainStyledAttributes.getInt(index, this.f870h0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_strict) {
/* 131 */                       this.f868f0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f868f0);
                            } else if (index == R$styleable.MotionEffect_motionEffect_viewTransition) {
/* 144 */                       this.f869g0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f869g0);
                            }
                        }
/* 150 */               int i4 = this.f864b0;
/* 152 */               int i5 = this.f865c0;
/* 154 */               if (i4 == i5) {
/* 156 */                   if (i4 > 0) {
/* 160 */                       this.f864b0 = i4 - 1;
                            } else {
/* 165 */                       this.f865c0 = i5 + 1;
                            }
                        }
/* 167 */               typedArrayObtainStyledAttributes.recycle();
                    }
                }

/* 33 */        public MotionEffect(Context context, AttributeSet attributeSet, int i) {
/* 34 */            super(context, attributeSet, i);
/* 35 */            this.f863a0 = 0.1f;
/* 36 */            this.f864b0 = 49;
/* 37 */            this.f865c0 = 50;
/* 38 */            this.f866d0 = 0;
/* 39 */            this.f867e0 = 0;
/* 40 */            this.f868f0 = true;
/* 41 */            this.f869g0 = -1;
/* 42 */            this.f870h0 = -1;
/* 43 */            m467s(context, attributeSet);
                }
            }
