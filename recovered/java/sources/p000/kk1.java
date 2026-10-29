            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.SparseArray;
            import android.util.Xml;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 393 */   public final class kk1 {

                /* JADX INFO: renamed from: a */
                public final int f12839a;

                /* JADX INFO: renamed from: b */
                public final boolean f12840b;

                /* JADX INFO: renamed from: c */
                public int f12841c;

                /* JADX INFO: renamed from: d */
                public int f12842d;

                /* JADX INFO: renamed from: e */
                public int f12843e;

                /* JADX INFO: renamed from: f */
                public String f12844f;

                /* JADX INFO: renamed from: g */
                public int f12845g;

                /* JADX INFO: renamed from: h */
                public int f12846h;

                /* JADX INFO: renamed from: i */
                public final float f12847i;

                /* JADX INFO: renamed from: j */
                public final lk1 f12848j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f12849k;

                /* JADX INFO: renamed from: l */
                public mq2 f12850l;

                /* JADX INFO: renamed from: m */
                public final ArrayList f12851m;

                /* JADX INFO: renamed from: n */
                public final int f12852n;

                /* JADX INFO: renamed from: o */
                public final boolean f12853o;

                /* JADX INFO: renamed from: p */
                public int f12854p;

                /* JADX INFO: renamed from: q */
                public final int f12855q;

                /* JADX INFO: renamed from: r */
                public final int f12856r;

                public kk1(lk1 lk1Var, Context context, XmlResourceParser xmlResourceParser) {
/* 5 */             this.f12839a = -1;
/* 8 */             this.f12840b = false;
/* 10 */            this.f12841c = -1;
/* 12 */            this.f12842d = -1;
/* 14 */            this.f12843e = 0;
/* 17 */            this.f12844f = null;
/* 19 */            this.f12845g = -1;
/* 23 */            this.f12846h = 400;
/* 26 */            this.f12847i = 0.0f;
/* 33 */            this.f12849k = new ArrayList();
/* 35 */            this.f12850l = null;
/* 42 */            this.f12851m = new ArrayList();
/* 44 */            this.f12852n = 0;
/* 46 */            this.f12853o = false;
/* 48 */            this.f12854p = -1;
/* 50 */            this.f12856r = 0;
/* 52 */            int i = lk1Var.f13350j;
/* 54 */            SparseArray sparseArray = lk1Var.f13347g;
/* 56 */            this.f12846h = i;
/* 60 */            this.f12855q = lk1Var.f13351k;
/* 62 */            this.f12848j = lk1Var;
/* 70 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Transition);
/* 74 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 80 */            for (int i2 = 0; i2 < indexCount; i2++) {
/* 82 */                int index = typedArrayObtainStyledAttributes.getIndex(i2);
/* 92 */                if (index == R$styleable.Transition_constraintSetEnd) {
/* 98 */                    this.f12841c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 106 */                   String resourceTypeName = context.getResources().getResourceTypeName(this.f12841c);
/* 114 */                   if ("layout".equals(resourceTypeName)) {
/* 118 */                       C0077d c0077d = new C0077d();
/* 123 */                       c0077d.m542j(context, this.f12841c);
/* 128 */                       sparseArray.append(this.f12841c, c0077d);
                            } else if ("xml".equals(resourceTypeName)) {
/* 145 */                       this.f12841c = lk1Var.m6475j(context, this.f12841c);
                            }
                        } else if (index == R$styleable.Transition_constraintSetStart) {
/* 159 */                   this.f12842d = typedArrayObtainStyledAttributes.getResourceId(index, this.f12842d);
/* 167 */                   String resourceTypeName2 = context.getResources().getResourceTypeName(this.f12842d);
/* 175 */                   if ("layout".equals(resourceTypeName2)) {
/* 179 */                       C0077d c0077d2 = new C0077d();
/* 184 */                       c0077d2.m542j(context, this.f12842d);
/* 189 */                       sparseArray.append(this.f12842d, c0077d2);
                            } else if ("xml".equals(resourceTypeName2)) {
/* 206 */                       this.f12842d = lk1Var.m6475j(context, this.f12842d);
                            }
                        } else if (index == R$styleable.Transition_motionInterpolator) {
/* 218 */                   int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
/* 221 */                   if (i3 == 1) {
/* 223 */                       int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 227 */                       this.f12845g = resourceId;
/* 229 */                       if (resourceId != -1) {
/* 231 */                           this.f12843e = -2;
                                }
                            } else if (i3 == 3) {
/* 238 */                       String string = typedArrayObtainStyledAttributes.getString(index);
/* 242 */                       this.f12844f = string;
/* 244 */                       if (string != null) {
/* 252 */                           if (string.indexOf("/") > 0) {
/* 258 */                               this.f12845g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 260 */                               this.f12843e = -2;
                                    } else {
/* 264 */                               this.f12843e = -1;
                                    }
                                }
                            } else {
/* 274 */                       this.f12843e = typedArrayObtainStyledAttributes.getInteger(index, this.f12843e);
                            }
                        } else if (index == R$styleable.Transition_duration) {
/* 284 */                   int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f12846h);
/* 288 */                   this.f12846h = i4;
/* 292 */                   if (i4 < 8) {
/* 294 */                       this.f12846h = 8;
                            }
                        } else if (index == R$styleable.Transition_staggered) {
/* 307 */                   this.f12847i = typedArrayObtainStyledAttributes.getFloat(index, this.f12847i);
                        } else if (index == R$styleable.Transition_autoTransition) {
/* 320 */                   this.f12852n = typedArrayObtainStyledAttributes.getInteger(index, this.f12852n);
                        } else if (index == R$styleable.Transition_android_id) {
/* 333 */                   this.f12839a = typedArrayObtainStyledAttributes.getResourceId(index, this.f12839a);
                        } else if (index == R$styleable.Transition_transitionDisable) {
/* 346 */                   this.f12853o = typedArrayObtainStyledAttributes.getBoolean(index, this.f12853o);
                        } else if (index == R$styleable.Transition_pathMotionArc) {
/* 357 */                   this.f12854p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        } else if (index == R$styleable.Transition_layoutDuringTransition) {
/* 368 */                   this.f12855q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                        } else if (index == R$styleable.Transition_transitionFlags) {
/* 379 */                   this.f12856r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                        }
                    }
/* 387 */           if (this.f12842d == -1) {
/* 389 */               this.f12840b = true;
                    }
/* 391 */           typedArrayObtainStyledAttributes.recycle();
                }

/* 394 */       public kk1(lk1 lk1Var, int i, int i2) {
/* 396 */           this.f12839a = -1;
/* 397 */           this.f12840b = false;
/* 398 */           this.f12841c = -1;
/* 399 */           this.f12842d = -1;
/* 400 */           this.f12843e = 0;
/* 401 */           this.f12844f = null;
/* 402 */           this.f12845g = -1;
/* 403 */           this.f12846h = 400;
/* 404 */           this.f12847i = 0.0f;
/* 405 */           this.f12849k = new ArrayList();
/* 406 */           this.f12850l = null;
/* 407 */           this.f12851m = new ArrayList();
/* 408 */           this.f12852n = 0;
/* 409 */           this.f12853o = false;
/* 410 */           this.f12854p = -1;
/* 411 */           this.f12855q = 0;
/* 412 */           this.f12856r = 0;
/* 413 */           this.f12839a = -1;
/* 414 */           this.f12848j = lk1Var;
/* 415 */           this.f12842d = i;
/* 416 */           this.f12841c = i2;
/* 418 */           this.f12846h = lk1Var.f13350j;
/* 420 */           this.f12855q = lk1Var.f13351k;
                }

/* 420 */       public kk1(lk1 lk1Var, kk1 kk1Var) {
/* 422 */           this.f12839a = -1;
/* 423 */           this.f12840b = false;
/* 424 */           this.f12841c = -1;
/* 425 */           this.f12842d = -1;
/* 426 */           this.f12843e = 0;
/* 427 */           this.f12844f = null;
/* 428 */           this.f12845g = -1;
/* 429 */           this.f12846h = 400;
/* 430 */           this.f12847i = 0.0f;
/* 431 */           this.f12849k = new ArrayList();
/* 432 */           this.f12850l = null;
/* 433 */           this.f12851m = new ArrayList();
/* 434 */           this.f12852n = 0;
/* 435 */           this.f12853o = false;
/* 436 */           this.f12854p = -1;
/* 437 */           this.f12855q = 0;
/* 438 */           this.f12856r = 0;
/* 439 */           this.f12848j = lk1Var;
/* 441 */           this.f12846h = lk1Var.f13350j;
                    if (kk1Var != null) {
/* 442 */               this.f12854p = kk1Var.f12854p;
/* 443 */               this.f12843e = kk1Var.f12843e;
/* 444 */               this.f12844f = kk1Var.f12844f;
/* 445 */               this.f12845g = kk1Var.f12845g;
/* 446 */               this.f12846h = kk1Var.f12846h;
/* 447 */               this.f12849k = kk1Var.f12849k;
/* 448 */               this.f12847i = kk1Var.f12847i;
/* 449 */               this.f12855q = kk1Var.f12855q;
                    }
                }
            }
