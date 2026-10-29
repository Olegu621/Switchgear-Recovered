            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Handler;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import p000.AbstractC0208c9;
            import p000.l81;
            import p000.m81;
            import p000.n81;
            import p000.o81;
            import p000.p81;
            import p000.q81;
            import p000.qt1;
            import p000.r20;
            import p000.ra0;
            import p000.vd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 111 */   public class ListPopupWindow implements vd2 {

                /* JADX INFO: renamed from: k0 */
                public static final Method f567k0;

                /* JADX INFO: renamed from: l0 */
                public static final Method f568l0;

                /* JADX INFO: renamed from: U */
                public boolean f569U;

                /* JADX INFO: renamed from: V */
                public boolean f570V;

                /* JADX INFO: renamed from: W */
                public int f571W;

                /* JADX INFO: renamed from: X */
                public final int f572X;

                /* JADX INFO: renamed from: Y */
                public r20 f573Y;

                /* JADX INFO: renamed from: Z */
                public View f574Z;

                /* JADX INFO: renamed from: a */
                public final Context f575a;

                /* JADX INFO: renamed from: a0 */
                public AdapterView.OnItemClickListener f576a0;

                /* JADX INFO: renamed from: b */
                public ListAdapter f577b;

                /* JADX INFO: renamed from: b0 */
                public final o81 f578b0;

                /* JADX INFO: renamed from: c */
                public ra0 f579c;

                /* JADX INFO: renamed from: c0 */
                public final q81 f580c0;

                /* JADX INFO: renamed from: d */
                public final int f581d;

                /* JADX INFO: renamed from: d0 */
                public final p81 f582d0;

                /* JADX INFO: renamed from: e */
                public int f583e;

                /* JADX INFO: renamed from: e0 */
                public final o81 f584e0;

                /* JADX INFO: renamed from: f */
                public int f585f;

                /* JADX INFO: renamed from: f0 */
                public final Handler f586f0;

                /* JADX INFO: renamed from: g0 */
                public final Rect f587g0;

                /* JADX INFO: renamed from: h0 */
                public Rect f588h0;

                /* JADX INFO: renamed from: i */
                public int f589i;

                /* JADX INFO: renamed from: i0 */
                public boolean f590i0;

                /* JADX INFO: renamed from: j0 */
                public final PopupWindow f591j0;

                /* JADX INFO: renamed from: v */
                public final int f592v;

                /* JADX INFO: renamed from: w */
                public boolean f593w;

                static {
/* 7 */             if (Build.VERSION.SDK_INT <= 28) {
                        try {
/* 23 */                    f567k0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
                        } catch (NoSuchMethodException unused) {
                        }
                        try {
/* 37 */                    f568l0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                }

                public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             this.f581d = -2;
/* 7 */             this.f583e = -2;
/* 11 */            this.f592v = 1002;
/* 14 */            this.f571W = 0;
/* 19 */            this.f572X = AbstractC0208c9.API_PRIORITY_OTHER;
/* 27 */            this.f578b0 = new o81(this, 1);
/* 34 */            this.f580c0 = new q81(this, 0);
/* 41 */            this.f582d0 = new p81(this);
/* 48 */            this.f584e0 = new o81(this, 0);
/* 55 */            this.f587g0 = new Rect();
/* 57 */            this.f575a = context;
/* 68 */            this.f586f0 = new Handler(context.getMainLooper());
/* 72 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, 0);
/* 82 */            this.f585f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
/* 86 */            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
/* 90 */            this.f589i = dimensionPixelOffset;
/* 92 */            if (dimensionPixelOffset != 0) {
/* 94 */                this.f593w = true;
                    }
/* 96 */            typedArrayObtainStyledAttributes.recycle();
/* 101 */           AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, 0);
/* 104 */           appCompatPopupWindow.m357a(context, attributeSet, i);
/* 107 */           this.f591j0 = appCompatPopupWindow;
/* 109 */           appCompatPopupWindow.setInputMethodMode(1);
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: a */
                public final boolean mo365a() {
/* 3 */             return this.f591j0.isShowing();
                }

                /* JADX INFO: renamed from: b */
                public final int m366b() {
/* 1 */             return this.f585f;
                }

                /* JADX INFO: renamed from: d */
                public final void m367d(int i) {
/* 1 */             this.f585f = i;
                }

                @Override // p000.vd2
                public final void dismiss() {
/* 1 */             PopupWindow popupWindow = this.f591j0;
/* 3 */             popupWindow.dismiss();
/* 7 */             popupWindow.setContentView(null);
/* 10 */            this.f579c = null;
/* 16 */            this.f586f0.removeCallbacks(this.f578b0);
                }

                /* JADX INFO: renamed from: f */
                public final Drawable m368f() {
/* 3 */             return this.f591j0.getBackground();
                }

                /* JADX INFO: renamed from: h */
                public final void m369h(Drawable drawable) {
/* 3 */             this.f591j0.setBackgroundDrawable(drawable);
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: j */
                public final ra0 mo370j() {
/* 1 */             return this.f579c;
                }

                /* JADX INFO: renamed from: k */
                public final void m371k(int i) {
/* 1 */             this.f589i = i;
/* 4 */             this.f593w = true;
                }

                /* JADX INFO: renamed from: n */
                public final int m372n() {
/* 3 */             if (this.f593w) {
/* 7 */                 return this.f589i;
                    }
/* 5 */             return 0;
                }

                /* JADX INFO: renamed from: o */
                public void mo373o(ListAdapter listAdapter) {
/* 1 */             r20 r20Var = this.f573Y;
/* 3 */             if (r20Var == null) {
/* 11 */                this.f573Y = new r20(this, 1);
                    } else {
/* 14 */                ListAdapter listAdapter2 = this.f577b;
/* 16 */                if (listAdapter2 != null) {
/* 18 */                    listAdapter2.unregisterDataSetObserver(r20Var);
                        }
                    }
/* 21 */            this.f577b = listAdapter;
/* 23 */            if (listAdapter != null) {
/* 27 */                listAdapter.registerDataSetObserver(this.f573Y);
                    }
/* 30 */            ra0 ra0Var = this.f579c;
/* 32 */            if (ra0Var != null) {
/* 36 */                ra0Var.setAdapter(this.f577b);
                    }
                }

                /* JADX INFO: renamed from: p */
                public ra0 mo374p(Context context, boolean z) {
/* 3 */             return new ra0(context, z);
                }

                /* JADX INFO: renamed from: q */
                public final void m375q(int i) {
/* 3 */             Drawable background = this.f591j0.getBackground();
/* 7 */             if (background == null) {
/* 23 */                this.f583e = i;
/* 25 */                return;
                    }
/* 9 */             Rect rect = this.f587g0;
/* 11 */            background.getPadding(rect);
/* 20 */            this.f583e = rect.left + rect.right + i;
                }

                @Override // p000.vd2
                public final void show() {
                    int i;
                    int iMakeMeasureSpec;
                    int paddingBottom;
                    ra0 ra0Var;
/* 1 */             ra0 ra0Var2 = this.f579c;
/* 3 */             Context context = this.f575a;
/* 6 */             PopupWindow popupWindow = this.f591j0;
/* 9 */             if (ra0Var2 == null) {
/* 14 */                ra0 ra0VarMo374p = mo374p(context, !this.f590i0);
/* 18 */                this.f579c = ra0VarMo374p;
/* 22 */                ra0VarMo374p.setAdapter(this.f577b);
/* 29 */                this.f579c.setOnItemClickListener(this.f576a0);
/* 34 */                this.f579c.setFocusable(true);
/* 39 */                this.f579c.setFocusableInTouchMode(true);
/* 49 */                this.f579c.setOnItemSelectedListener(new l81(this, 0));
/* 56 */                this.f579c.setOnScrollListener(this.f582d0);
/* 61 */                popupWindow.setContentView(this.f579c);
                    }
/* 71 */            Drawable background = popupWindow.getBackground();
/* 75 */            Rect rect = this.f587g0;
/* 77 */            if (background != null) {
/* 79 */                background.getPadding(rect);
/* 82 */                int i2 = rect.top;
/* 86 */                i = rect.bottom + i2;
/* 89 */                if (!this.f593w) {
/* 92 */                    this.f589i = -i2;
                        }
                    } else {
/* 95 */                rect.setEmpty();
/* 98 */                i = 0;
                    }
/* 113 */           int iM6618a = m81.m6618a(popupWindow, this.f574Z, this.f589i, popupWindow.getInputMethodMode() == 2);
/* 117 */           int i3 = this.f581d;
/* 121 */           if (i3 == -1) {
/* 123 */               paddingBottom = iM6618a + i;
                    } else {
/* 125 */               int i4 = this.f583e;
/* 127 */               if (i4 != -2) {
/* 154 */                   iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                        } else {
/* 177 */                   iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
                        }
/* 183 */               int iM8098a = this.f579c.m8098a(iMakeMeasureSpec, iM6618a);
/* 205 */               paddingBottom = iM8098a + (iM8098a > 0 ? this.f579c.getPaddingBottom() + this.f579c.getPaddingTop() + i : 0);
                    }
/* 214 */           boolean z = popupWindow.getInputMethodMode() == 2;
/* 217 */           qt1.m8014d(popupWindow, this.f592v);
/* 224 */           if (popupWindow.isShowing()) {
/* 232 */               if (this.f574Z.isAttachedToWindow()) {
/* 236 */                   int width = this.f583e;
/* 238 */                   if (width == -1) {
/* 240 */                       width = -1;
                            } else if (width == -2) {
/* 246 */                       width = this.f574Z.getWidth();
                            }
/* 250 */                   if (i3 == -1) {
/* 256 */                       i3 = z ? paddingBottom : -1;
/* 257 */                       int i5 = this.f583e;
/* 259 */                       if (z) {
/* 266 */                           popupWindow.setWidth(i5 == -1 ? -1 : 0);
/* 269 */                           popupWindow.setHeight(0);
                                } else {
/* 276 */                           popupWindow.setWidth(i5 == -1 ? -1 : 0);
/* 279 */                           popupWindow.setHeight(-1);
                                }
                            } else if (i3 == -2) {
/* 285 */                       i3 = paddingBottom;
                            }
/* 286 */                   popupWindow.setOutsideTouchable(true);
/* 289 */                   View view = this.f574Z;
/* 291 */                   int i6 = width;
/* 292 */                   int i7 = this.f585f;
/* 294 */                   int i8 = this.f589i;
/* 300 */                   int i9 = i6 < 0 ? -1 : i6;
/* 301 */                   if (i3 < 0) {
/* 303 */                       i3 = -1;
                            }
/* 304 */                   popupWindow.update(view, i7, i8, i9, i3);
/* 307 */                   return;
                        }
/* 456 */               return;
                    }
/* 308 */           int width2 = this.f583e;
/* 310 */           if (width2 == -1) {
/* 312 */               width2 = -1;
                    } else if (width2 == -2) {
/* 318 */               width2 = this.f574Z.getWidth();
                    }
/* 322 */           if (i3 == -1) {
/* 324 */               i3 = -1;
                    } else if (i3 == -2) {
/* 328 */               i3 = paddingBottom;
                    }
/* 329 */           popupWindow.setWidth(width2);
/* 332 */           popupWindow.setHeight(i3);
/* 339 */           if (Build.VERSION.SDK_INT <= 28) {
/* 341 */               Method method = f567k0;
/* 343 */               if (method != null) {
                            try {
/* 351 */                       method.invoke(popupWindow, Boolean.TRUE);
                            } catch (Exception unused) {
                            }
                        }
                    } else {
/* 355 */               n81.m6947b(popupWindow, true);
                    }
/* 358 */           popupWindow.setOutsideTouchable(true);
/* 363 */           popupWindow.setTouchInterceptor(this.f580c0);
/* 368 */           if (this.f570V) {
/* 372 */               qt1.m8013c(popupWindow, this.f569U);
                    }
/* 377 */           if (Build.VERSION.SDK_INT <= 28) {
/* 379 */               Method method2 = f568l0;
/* 381 */               if (method2 != null) {
                            try {
/* 389 */                       method2.invoke(popupWindow, this.f588h0);
                            } catch (Exception e) {
/* 398 */                       AbstractC1245n0.m4877e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                            }
                        }
                    } else {
/* 404 */               n81.m6946a(popupWindow, this.f588h0);
                    }
/* 415 */           popupWindow.showAsDropDown(this.f574Z, this.f585f, this.f589i, this.f571W);
/* 420 */           this.f579c.setSelection(-1);
/* 425 */           if ((!this.f590i0 || this.f579c.isInTouchMode()) && (ra0Var = this.f579c) != null) {
/* 439 */               ra0Var.setListSelectionHidden(true);
/* 442 */               ra0Var.requestLayout();
                    }
/* 447 */           if (this.f590i0) {
/* 456 */               return;
                    }
/* 453 */           this.f586f0.post(this.f584e0);
                }

/* 112 */       public ListPopupWindow(Context context, AttributeSet attributeSet) {
/* 113 */           this(context, attributeSet, R$attr.listPopupWindowStyle);
                }

/* 113 */       public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
/* 114 */           this(context, attributeSet, i, 0);
                }

/* 114 */       public ListPopupWindow(Context context) {
/* 115 */           this(context, null, R$attr.listPopupWindowStyle);
                }
            }
