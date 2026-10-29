            package androidx.coordinatorlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.R$styleable;
            import java.lang.reflect.Constructor;
            import java.util.HashMap;
            import java.util.Map;
            import p000.ds0;
            
            /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 254 */   public final class C0080c extends ViewGroup.MarginLayoutParams {

                /* JADX INFO: renamed from: a */
                public CoordinatorLayout.Behavior f1218a;

                /* JADX INFO: renamed from: b */
                public boolean f1219b;

                /* JADX INFO: renamed from: c */
                public int f1220c;

                /* JADX INFO: renamed from: d */
                public int f1221d;

                /* JADX INFO: renamed from: e */
                public final int f1222e;

                /* JADX INFO: renamed from: f */
                public final int f1223f;

                /* JADX INFO: renamed from: g */
                public final int f1224g;

                /* JADX INFO: renamed from: h */
                public int f1225h;

                /* JADX INFO: renamed from: i */
                public int f1226i;

                /* JADX INFO: renamed from: j */
                public int f1227j;

                /* JADX INFO: renamed from: k */
                public View f1228k;

                /* JADX INFO: renamed from: l */
                public View f1229l;

                /* JADX INFO: renamed from: m */
                public boolean f1230m;

                /* JADX INFO: renamed from: n */
                public boolean f1231n;

                /* JADX INFO: renamed from: o */
                public boolean f1232o;

                /* JADX INFO: renamed from: p */
                public final Rect f1233p;

                public C0080c(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1219b = false;
/* 7 */             this.f1220c = 0;
/* 9 */             this.f1221d = 0;
/* 12 */            this.f1222e = -1;
/* 14 */            this.f1223f = -1;
/* 16 */            this.f1224g = 0;
/* 18 */            this.f1225h = 0;
/* 25 */            this.f1233p = new Rect();
/* 29 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
/* 39 */            this.f1220c = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
/* 47 */            this.f1223f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
/* 55 */            this.f1221d = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
/* 63 */            this.f1222e = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
/* 71 */            this.f1224g = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
/* 79 */            this.f1225h = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
/* 83 */            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.CoordinatorLayout_Layout_layout_behavior);
/* 87 */            this.f1219b = zHasValue;
/* 89 */            if (zHasValue) {
/* 93 */                String string = typedArrayObtainStyledAttributes.getString(R$styleable.CoordinatorLayout_Layout_layout_behavior);
/* 97 */                String str = CoordinatorLayout.f1193h0;
/* 103 */               CoordinatorLayout.Behavior behavior = null;
/* 104 */               if (!TextUtils.isEmpty(string)) {
/* 114 */                   if (string.startsWith(".")) {
/* 131 */                       string = context.getPackageName() + string;
                            } else if (string.indexOf(46) < 0) {
/* 145 */                       String str2 = CoordinatorLayout.f1193h0;
/* 151 */                       if (!TextUtils.isEmpty(str2)) {
/* 167 */                           string = str2 + '.' + string;
                                }
                            }
                            try {
/* 171 */                       ThreadLocal threadLocal = CoordinatorLayout.f1195j0;
/* 177 */                       Map map = (Map) threadLocal.get();
/* 179 */                       if (map == null) {
/* 183 */                           map = new HashMap();
/* 186 */                           threadLocal.set(map);
                                }
/* 196 */                       Constructor<?> constructor = (Constructor) map.get(string);
/* 198 */                       if (constructor == null) {
/* 210 */                           constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1194i0);
/* 215 */                           constructor.setAccessible(true);
/* 218 */                           map.put(string, constructor);
                                }
/* 229 */                       behavior = (CoordinatorLayout.Behavior) constructor.newInstance(context, attributeSet);
                            } catch (Exception e) {
/* 241 */                       ds0.m3198o("Could not inflate Behavior subclass ".concat(string), e);
/* 244 */                       throw null;
                            }
                        }
/* 232 */               this.f1218a = behavior;
                    }
/* 245 */           typedArrayObtainStyledAttributes.recycle();
/* 248 */           CoordinatorLayout.Behavior behavior2 = this.f1218a;
/* 250 */           if (behavior2 != null) {
/* 252 */               behavior2.mo565c(this);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final boolean m581a(int i) {
/* 1 */             if (i == 0) {
/* 11 */                return this.f1230m;
                    }
/* 4 */             if (i != 1) {
/* 6 */                 return false;
                    }
/* 8 */             return this.f1231n;
                }

                /* JADX INFO: renamed from: b */
                public final void m582b(CoordinatorLayout.Behavior behavior) {
/* 1 */             CoordinatorLayout.Behavior behavior2 = this.f1218a;
/* 3 */             if (behavior2 != behavior) {
/* 5 */                 if (behavior2 != null) {
/* 7 */                     behavior2.mo568f();
                        }
/* 10 */                this.f1218a = behavior;
/* 13 */                this.f1219b = true;
/* 15 */                if (behavior != null) {
/* 17 */                    behavior.mo565c(this);
                        }
                    }
                }

/* 255 */       public C0080c(int i, int i2) {
/* 256 */           super(i, i2);
/* 257 */           this.f1219b = false;
/* 258 */           this.f1220c = 0;
/* 259 */           this.f1221d = 0;
/* 260 */           this.f1222e = -1;
/* 261 */           this.f1223f = -1;
/* 262 */           this.f1224g = 0;
/* 263 */           this.f1225h = 0;
/* 264 */           this.f1233p = new Rect();
                }

/* 264 */       public C0080c(C0080c c0080c) {
/* 265 */           super((ViewGroup.MarginLayoutParams) c0080c);
/* 266 */           this.f1219b = false;
/* 267 */           this.f1220c = 0;
/* 268 */           this.f1221d = 0;
/* 269 */           this.f1222e = -1;
/* 270 */           this.f1223f = -1;
/* 271 */           this.f1224g = 0;
/* 272 */           this.f1225h = 0;
/* 273 */           this.f1233p = new Rect();
                }

/* 273 */       public C0080c(ViewGroup.MarginLayoutParams marginLayoutParams) {
/* 274 */           super(marginLayoutParams);
/* 275 */           this.f1219b = false;
/* 276 */           this.f1220c = 0;
/* 277 */           this.f1221d = 0;
/* 278 */           this.f1222e = -1;
/* 279 */           this.f1223f = -1;
/* 280 */           this.f1224g = 0;
/* 281 */           this.f1225h = 0;
/* 282 */           this.f1233p = new Rect();
                }

/* 282 */       public C0080c(ViewGroup.LayoutParams layoutParams) {
/* 283 */           super(layoutParams);
/* 284 */           this.f1219b = false;
/* 285 */           this.f1220c = 0;
/* 286 */           this.f1221d = 0;
/* 287 */           this.f1222e = -1;
/* 288 */           this.f1223f = -1;
/* 289 */           this.f1224g = 0;
/* 290 */           this.f1225h = 0;
/* 291 */           this.f1233p = new Rect();
                }
            }
