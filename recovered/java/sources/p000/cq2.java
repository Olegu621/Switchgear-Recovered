            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.Resources;
            import android.graphics.Rect;
            import android.os.Build;
            import android.util.DisplayMetrics;
            import android.view.LayoutInflater;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            import android.view.accessibility.AccessibilityManager;
            import android.widget.TextView;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$style;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cq2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: V */
                public static cq2 f6875V;

                /* JADX INFO: renamed from: W */
                public static cq2 f6876W;

                /* JADX INFO: renamed from: U */
                public boolean f6877U;

                /* JADX INFO: renamed from: a */
                public final View f6878a;

                /* JADX INFO: renamed from: b */
                public final CharSequence f6879b;

                /* JADX INFO: renamed from: c */
                public final int f6880c;

                /* JADX INFO: renamed from: d */
                public final bq2 f6881d;

                /* JADX INFO: renamed from: e */
                public final bq2 f6882e;

                /* JADX INFO: renamed from: f */
                public int f6883f;

                /* JADX INFO: renamed from: i */
                public int f6884i;

                /* JADX INFO: renamed from: v */
                public eq2 f6885v;

                /* JADX INFO: renamed from: w */
                public boolean f6886w;

                /* JADX WARN: Type inference failed for: r0v0, types: [bq2] */
                /* JADX WARN: Type inference failed for: r0v1, types: [bq2] */
                public cq2(View view, CharSequence charSequence) {
/* 6 */             final int i = 0;
/* 10 */            this.f6881d = new Runnable(this) { // from class: bq2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ cq2 f2574b;

                        {
/* 3 */                     this.f2574b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     int i2 = i;
/* 3 */                     cq2 cq2Var = this.f2574b;
                            switch (i2) {
                                case 0:
/* 13 */                            cq2Var.m2834c(false);
                                    break;
                                default:
/* 8 */                             cq2Var.m2833a();
                                    break;
                            }
                        }
                    };
/* 14 */            final int i2 = 1;
/* 18 */            this.f6882e = new Runnable(this) { // from class: bq2

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ cq2 f2574b;

                        {
/* 3 */                     this.f2574b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     int i3 = i2;
/* 3 */                     cq2 cq2Var = this.f2574b;
                            switch (i3) {
                                case 0:
/* 13 */                            cq2Var.m2834c(false);
                                    break;
                                default:
/* 8 */                             cq2Var.m2833a();
                                    break;
                            }
                        }
                    };
/* 20 */            this.f6878a = view;
/* 22 */            this.f6879b = charSequence;
/* 28 */            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
/* 32 */            Method method = i33.f9439a;
/* 51 */            this.f6880c = Build.VERSION.SDK_INT >= 28 ? g33.m3869a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
/* 53 */            this.f6877U = true;
/* 55 */            view.setOnLongClickListener(this);
/* 58 */            view.setOnHoverListener(this);
                }

                /* JADX INFO: renamed from: b */
                public static void m2832b(cq2 cq2Var) {
/* 1 */             cq2 cq2Var2 = f6875V;
/* 3 */             if (cq2Var2 != null) {
/* 9 */                 cq2Var2.f6878a.removeCallbacks(cq2Var2.f6881d);
                    }
/* 12 */            f6875V = cq2Var;
/* 14 */            if (cq2Var != null) {
/* 25 */                cq2Var.f6878a.postDelayed(cq2Var.f6881d, ViewConfiguration.getLongPressTimeout());
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m2833a() {
/* 1 */             cq2 cq2Var = f6876W;
/* 3 */             View view = this.f6878a;
/* 6 */             if (cq2Var == this) {
/* 8 */                 f6876W = null;
/* 10 */                eq2 eq2Var = this.f6885v;
/* 12 */                if (eq2Var != null) {
/* 16 */                    View view2 = (View) eq2Var.f7833b;
/* 22 */                    if (view2.getParent() != null) {
/* 36 */                        ((WindowManager) ((Context) eq2Var.f7832a).getSystemService("window")).removeView(view2);
                            }
/* 39 */                    this.f6885v = null;
/* 42 */                    this.f6877U = true;
/* 44 */                    view.removeOnAttachStateChangeListener(this);
                        } else {
/* 52 */                    AbstractC1245n0.m4876d("TooltipCompatHandler", "sActiveHandler.mPopup == null");
                        }
                    }
/* 57 */            if (f6875V == this) {
/* 59 */                m2832b(null);
                    }
/* 64 */            view.removeCallbacks(this.f6882e);
                }

                /* JADX INFO: renamed from: c */
                public final void m2834c(boolean z) {
                    int height;
                    int i;
                    int i2;
                    int i3;
                    long longPressTimeout;
                    long j;
                    long j2;
/* 3 */             View view = this.f6878a;
/* 9 */             if (view.isAttachedToWindow()) {
/* 13 */                m2832b(null);
/* 16 */                cq2 cq2Var = f6876W;
/* 18 */                if (cq2Var != null) {
/* 20 */                    cq2Var.m2833a();
                        }
/* 23 */                f6876W = this;
/* 27 */                this.f6886w = z;
/* 31 */                Context context = view.getContext();
/* 35 */                eq2 eq2Var = new eq2();
/* 40 */                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
/* 43 */                eq2Var.f7835d = layoutParams;
/* 50 */                eq2Var.f7836e = new Rect();
/* 55 */                eq2Var.f7837f = new int[2];
/* 59 */                eq2Var.f7838i = new int[2];
/* 61 */                eq2Var.f7832a = context;
/* 69 */                View viewInflate = LayoutInflater.from(context).inflate(R$layout.abc_tooltip, (ViewGroup) null);
/* 73 */                eq2Var.f7833b = viewInflate;
/* 83 */                eq2Var.f7834c = (TextView) viewInflate.findViewById(R$id.message);
/* 91 */                layoutParams.setTitle(eq2.class.getSimpleName());
/* 98 */                layoutParams.packageName = context.getPackageName();
/* 102 */               layoutParams.type = 1002;
/* 105 */               layoutParams.width = -2;
/* 107 */               layoutParams.height = -2;
/* 110 */               layoutParams.format = -3;
/* 114 */               layoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
/* 118 */               layoutParams.flags = 24;
/* 122 */               View view2 = (View) eq2Var.f7833b;
/* 126 */               Context context2 = (Context) eq2Var.f7832a;
/* 128 */               this.f6885v = eq2Var;
/* 130 */               int width = this.f6883f;
/* 132 */               int i4 = this.f6884i;
/* 134 */               boolean z2 = this.f6886w;
/* 138 */               WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) eq2Var.f7835d;
/* 146 */               if (view2.getParent() != null && view2.getParent() != null) {
/* 160 */                   ((WindowManager) context2.getSystemService("window")).removeView(view2);
                        }
/* 169 */               ((TextView) eq2Var.f7834c).setText(this.f6879b);
/* 174 */               int[] iArr = (int[]) eq2Var.f7838i;
/* 178 */               int[] iArr2 = (int[]) eq2Var.f7837f;
/* 182 */               Rect rect = (Rect) eq2Var.f7836e;
/* 188 */               layoutParams2.token = view.getApplicationWindowToken();
/* 196 */               int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
/* 204 */               if (view.getWidth() < dimensionPixelOffset) {
/* 211 */                   width = view.getWidth() / 2;
                        }
/* 216 */               if (view.getHeight() >= dimensionPixelOffset) {
/* 224 */                   int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
/* 228 */                   height = i4 + dimensionPixelOffset2;
/* 230 */                   i = i4 - dimensionPixelOffset2;
                        } else {
/* 232 */                   height = view.getHeight();
/* 236 */                   i = 0;
                        }
/* 239 */               layoutParams2.gravity = 49;
/* 255 */               int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R$dimen.tooltip_y_offset_touch : R$dimen.tooltip_y_offset_non_touch);
/* 259 */               View rootView = view.getRootView();
/* 263 */               ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
/* 267 */               int i5 = width;
/* 271 */               if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
/* 287 */                   for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
/* 291 */                       if (context3 instanceof Activity) {
/* 299 */                           rootView = ((Activity) context3).getWindow().getDecorView();
                                    break;
                                }
                            }
                        }
/* 311 */               if (rootView == null) {
/* 317 */                   AbstractC1245n0.m4876d("TooltipPopup", "Cannot find app view");
/* 320 */                   i3 = 1;
                        } else {
/* 324 */                   rootView.getWindowVisibleDisplayFrame(rect);
/* 329 */                   if (rect.left >= 0 || rect.top >= 0) {
/* 380 */                       i2 = 0;
/* 381 */                       i3 = 1;
                            } else {
/* 335 */                       Resources resources = context2.getResources();
/* 339 */                       i3 = 1;
/* 351 */                       int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
/* 362 */                       int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
/* 363 */                       DisplayMetrics displayMetrics = resources.getDisplayMetrics();
/* 371 */                       i2 = 0;
/* 372 */                       rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                            }
/* 383 */                   rootView.getLocationOnScreen(iArr);
/* 386 */                   view.getLocationOnScreen(iArr2);
/* 393 */                   int i6 = iArr2[i2] - iArr[i2];
/* 394 */                   iArr2[i2] = i6;
/* 401 */                   iArr2[i3] = iArr2[i3] - iArr[i3];
/* 414 */                   layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
/* 416 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
/* 420 */                   view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
/* 423 */                   int measuredHeight = view2.getMeasuredHeight();
/* 427 */                   int i7 = iArr2[i3];
/* 432 */                   int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
/* 434 */                   int i9 = i7 + height + dimensionPixelOffset3;
/* 435 */                   if (z2) {
/* 437 */                       if (i8 >= 0) {
/* 439 */                           layoutParams2.y = i8;
                                } else {
/* 442 */                           layoutParams2.y = i9;
                                }
                            } else if (measuredHeight + i9 <= rect.height()) {
/* 452 */                       layoutParams2.y = i9;
                            } else {
/* 455 */                       layoutParams2.y = i8;
                            }
                        }
/* 463 */               ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
/* 466 */               view.addOnAttachStateChangeListener(this);
/* 471 */               if (this.f6886w) {
/* 473 */                   j2 = 2500;
                        } else {
/* 476 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 486 */                   if ((view.getWindowSystemUiVisibility() & 1) == i3) {
/* 488 */                       longPressTimeout = ViewConfiguration.getLongPressTimeout();
/* 493 */                       j = 3000;
                            } else {
/* 498 */                       longPressTimeout = ViewConfiguration.getLongPressTimeout();
/* 503 */                       j = 15000;
                            }
/* 495 */                   j2 = j - longPressTimeout;
                        }
/* 506 */               bq2 bq2Var = this.f6882e;
/* 508 */               view.removeCallbacks(bq2Var);
/* 511 */               view.postDelayed(bq2Var, j2);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0066  */
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
/* 4 */             if (this.f6885v == null || !this.f6886w) {
/* 11 */                View view2 = this.f6878a;
/* 23 */                AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
/* 29 */                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
/* 38 */                    int action = motionEvent.getAction();
/* 43 */                    if (action != 7) {
/* 47 */                        if (action == 10) {
/* 51 */                            this.f6877U = true;
/* 53 */                            m2833a();
/* 3 */                             return false;
                                }
                            } else if (view2.isEnabled() && this.f6885v == null) {
/* 71 */                        int x = (int) motionEvent.getX();
/* 76 */                        int y = (int) motionEvent.getY();
/* 79 */                        if (this.f6877U) {
/* 103 */                           this.f6883f = x;
/* 105 */                           this.f6884i = y;
/* 107 */                           this.f6877U = false;
/* 109 */                           m2832b(this);
                                } else {
/* 85 */                            int iAbs = Math.abs(x - this.f6883f);
/* 89 */                            int i = this.f6880c;
/* 91 */                            if (iAbs > i || Math.abs(y - this.f6884i) > i) {
/* 103 */                               this.f6883f = x;
/* 105 */                               this.f6884i = y;
/* 107 */                               this.f6877U = false;
/* 109 */                               m2832b(this);
                                    }
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
/* 7 */             this.f6883f = view.getWidth() / 2;
/* 15 */            this.f6884i = view.getHeight() / 2;
/* 18 */            m2834c(true);
/* 17 */            return true;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             m2833a();
                }
            }
