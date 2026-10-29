            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewPropertyAnimator;
            import android.view.Window;
            import android.view.WindowInsets;
            import android.widget.OverScroller;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.core.app.NotificationCompat;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.C2315w1;
            import p000.C2519z1;
            import p000.InterfaceC2482y1;
            import p000.RunnableC2352x1;
            import p000.a83;
            import p000.b83;
            import p000.c83;
            import p000.dh1;
            import p000.e33;
            import p000.f42;
            import p000.j83;
            import p000.jg1;
            import p000.ly0;
            import p000.m50;
            import p000.m83;
            import p000.mn0;
            import p000.n50;
            import p000.pm1;
            import p000.q23;
            import p000.q43;
            import p000.qm1;
            import p000.rm1;
            import p000.s23;
            import p000.t73;
            import p000.z73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActionBarOverlayLayout extends ViewGroup implements m50, pm1, qm1 {

                /* JADX INFO: renamed from: q0 */
                public static final int[] f425q0 = {R$attr.actionBarSize, R.attr.windowContentOverlay};

                /* JADX INFO: renamed from: r0 */
                public static final m83 f426r0;

                /* JADX INFO: renamed from: s0 */
                public static final Rect f427s0;

                /* JADX INFO: renamed from: U */
                public boolean f428U;

                /* JADX INFO: renamed from: V */
                public int f429V;

                /* JADX INFO: renamed from: W */
                public int f430W;

                /* JADX INFO: renamed from: a */
                public int f431a;

                /* JADX INFO: renamed from: a0 */
                public final Rect f432a0;

                /* JADX INFO: renamed from: b */
                public int f433b;

                /* JADX INFO: renamed from: b0 */
                public final Rect f434b0;

                /* JADX INFO: renamed from: c */
                public ContentFrameLayout f435c;

                /* JADX INFO: renamed from: c0 */
                public final Rect f436c0;

                /* JADX INFO: renamed from: d */
                public ActionBarContainer f437d;

                /* JADX INFO: renamed from: d0 */
                public final Rect f438d0;

                /* JADX INFO: renamed from: e */
                public n50 f439e;

                /* JADX INFO: renamed from: e0 */
                public m83 f440e0;

                /* JADX INFO: renamed from: f */
                public Drawable f441f;

                /* JADX INFO: renamed from: f0 */
                public m83 f442f0;

                /* JADX INFO: renamed from: g0 */
                public m83 f443g0;

                /* JADX INFO: renamed from: h0 */
                public m83 f444h0;

                /* JADX INFO: renamed from: i */
                public boolean f445i;

                /* JADX INFO: renamed from: i0 */
                public InterfaceC2482y1 f446i0;

                /* JADX INFO: renamed from: j0 */
                public OverScroller f447j0;

                /* JADX INFO: renamed from: k0 */
                public ViewPropertyAnimator f448k0;

                /* JADX INFO: renamed from: l0 */
                public final C2315w1 f449l0;

                /* JADX INFO: renamed from: m0 */
                public final RunnableC2352x1 f450m0;

                /* JADX INFO: renamed from: n0 */
                public final RunnableC2352x1 f451n0;

                /* JADX INFO: renamed from: o0 */
                public final rm1 f452o0;

                /* JADX INFO: renamed from: p0 */
                public final C2519z1 f453p0;

                /* JADX INFO: renamed from: v */
                public boolean f454v;

                /* JADX INFO: renamed from: w */
                public boolean f455w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.MarginLayoutParams {
                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
                    }
                }

                static {
                    c83 a83Var;
/* 12 */            int i = Build.VERSION.SDK_INT;
/* 16 */            if (i >= 30) {
/* 20 */                a83Var = new b83();
                    } else {
/* 36 */                a83Var = i >= 29 ? new a83() : new z73();
                    }
/* 45 */            a83Var.mo108d(ly0.m6573a(0, 1, 0, 1));
/* 52 */            f426r0 = a83Var.mo106b();
/* 59 */            f427s0 = new Rect();
                }

                public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f433b = 0;
/* 12 */            this.f432a0 = new Rect();
/* 19 */            this.f434b0 = new Rect();
/* 26 */            this.f436c0 = new Rect();
/* 33 */            this.f438d0 = new Rect();
/* 37 */            new Rect();
/* 42 */            new Rect();
/* 47 */            new Rect();
/* 52 */            new Rect();
/* 55 */            m83 m83Var = m83.f13659b;
/* 57 */            this.f440e0 = m83Var;
/* 59 */            this.f442f0 = m83Var;
/* 61 */            this.f443g0 = m83Var;
/* 63 */            this.f444h0 = m83Var;
/* 71 */            this.f449l0 = new C2315w1(this, 0);
/* 78 */            this.f450m0 = new RunnableC2352x1(this, 0);
/* 86 */            this.f451n0 = new RunnableC2352x1(this, 1);
/* 88 */            m343c(context);
/* 96 */            this.f452o0 = new rm1();
/* 100 */           C2519z1 c2519z1 = new C2519z1(context);
/* 104 */           c2519z1.setWillNotDraw(true);
/* 107 */           this.f453p0 = c2519z1;
/* 109 */           addView(c2519z1);
                }

                /* JADX INFO: renamed from: a */
                public static boolean m341a(View view, Rect rect, boolean z) {
                    boolean z2;
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 7 */             int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
/* 9 */             int i2 = rect.left;
/* 12 */            if (i != i2) {
/* 14 */                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
/* 16 */                z2 = true;
                    } else {
/* 18 */                z2 = false;
                    }
/* 19 */            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
/* 21 */            int i4 = rect.top;
/* 23 */            if (i3 != i4) {
/* 25 */                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
/* 27 */                z2 = true;
                    }
/* 28 */            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 30 */            int i6 = rect.right;
/* 32 */            if (i5 != i6) {
/* 34 */                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
/* 36 */                z2 = true;
                    }
/* 37 */            if (z) {
/* 39 */                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 41 */                int i8 = rect.bottom;
/* 43 */                if (i7 != i8) {
/* 45 */                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
/* 11 */                    return true;
                        }
                    }
/* 48 */            return z2;
                }

                /* JADX INFO: renamed from: b */
                public final void m342b() {
/* 3 */             removeCallbacks(this.f450m0);
/* 8 */             removeCallbacks(this.f451n0);
/* 11 */            ViewPropertyAnimator viewPropertyAnimator = this.f448k0;
/* 13 */            if (viewPropertyAnimator != null) {
/* 15 */                viewPropertyAnimator.cancel();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m343c(Context context) {
/* 11 */            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f425q0);
/* 20 */            this.f431a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
/* 23 */            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
/* 27 */            this.f441f = drawable;
/* 32 */            setWillNotDraw(drawable == null);
/* 35 */            typedArrayObtainStyledAttributes.recycle();
/* 43 */            this.f447j0 = new OverScroller(context);
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: d */
                public final void m344d(int i) {
/* 1 */             m345e();
/* 5 */             if (i == 2) {
/* 28 */                this.f439e.getClass();
                    } else if (i == 5) {
/* 22 */                this.f439e.getClass();
                    } else {
/* 12 */                if (i != 109) {
/* 14 */                    return;
                        }
/* 16 */                setOverlayMode(true);
                    }
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    int translationY;
/* 1 */             super.draw(canvas);
/* 6 */             if (this.f441f != null) {
/* 15 */                if (this.f437d.getVisibility() == 0) {
/* 34 */                    translationY = (int) (this.f437d.getTranslationY() + this.f437d.getBottom() + 0.5f);
                        } else {
/* 36 */                    translationY = 0;
                        }
/* 50 */                this.f441f.setBounds(0, translationY, getWidth(), this.f441f.getIntrinsicHeight() + translationY);
/* 55 */                this.f441f.draw(canvas);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m345e() {
                    n50 wrapper;
/* 3 */             if (this.f435c == null) {
/* 13 */                this.f435c = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
/* 23 */                this.f437d = (ActionBarContainer) findViewById(R$id.action_bar_container);
/* 27 */                KeyEvent.Callback callbackFindViewById = findViewById(R$id.action_bar);
/* 33 */                if (callbackFindViewById instanceof n50) {
/* 35 */                    wrapper = (n50) callbackFindViewById;
                        } else {
/* 40 */                    if (!(callbackFindViewById instanceof Toolbar)) {
/* 65 */                        f42.m3656l("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
/* 68 */                        return;
                            }
/* 44 */                    wrapper = ((Toolbar) callbackFindViewById).getWrapper();
                        }
/* 48 */                this.f439e = wrapper;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m346f(Menu menu, dh1 dh1Var) {
/* 1 */             m345e();
/* 6 */             C0073m c0073m = (C0073m) this.f439e;
/* 8 */             Toolbar toolbar = c0073m.f762a;
/* 12 */            if (c0073m.f774m == null) {
/* 20 */                C0062b c0062b = new C0062b(toolbar.getContext());
/* 23 */                c0073m.f774m = c0062b;
/* 27 */                c0062b.f9612w = R$id.action_menu_presenter;
                    }
/* 29 */            C0062b c0062b2 = c0073m.f774m;
/* 31 */            c0062b2.f9608e = dh1Var;
/* 33 */            jg1 jg1Var = (jg1) menu;
/* 35 */            if (jg1Var == null && toolbar.f696a == null) {
/* 51 */                return;
                    }
/* 42 */            toolbar.m404f();
/* 47 */            jg1 jg1Var2 = toolbar.f696a.f457d0;
/* 49 */            if (jg1Var2 == jg1Var) {
/* 51 */                return;
                    }
/* 52 */            if (jg1Var2 != null) {
/* 56 */                jg1Var2.m5810r(toolbar.f730z0);
/* 61 */                jg1Var2.m5810r(toolbar.f685A0);
                    }
/* 66 */            if (toolbar.f685A0 == null) {
/* 73 */                toolbar.f685A0 = new C0071k(toolbar);
                    }
/* 76 */            c0062b2.f746c0 = true;
/* 78 */            Context context = toolbar.f693U;
/* 80 */            if (jg1Var != null) {
/* 82 */                jg1Var.m5802b(c0062b2, context);
/* 89 */                jg1Var.m5802b(toolbar.f685A0, toolbar.f693U);
                    } else {
/* 94 */                c0062b2.mo425k(context, null);
/* 101 */               toolbar.f685A0.mo425k(toolbar.f693U, null);
/* 104 */               c0062b2.mo419b(true);
/* 109 */               toolbar.f685A0.mo419b(true);
                    }
/* 116 */           toolbar.f696a.setPopupTheme(toolbar.f694V);
/* 121 */           toolbar.f696a.setPresenter(c0062b2);
/* 124 */           toolbar.f730z0 = c0062b2;
/* 126 */           toolbar.m416v();
                }

                @Override // android.view.View
                public final boolean fitSystemWindows(Rect rect) {
/* 1 */             return super.fitSystemWindows(rect);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             return new LayoutParams(-1, -1);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public int getActionBarHideOffset() {
/* 1 */             ActionBarContainer actionBarContainer = this.f437d;
/* 3 */             if (actionBarContainer != null) {
/* 10 */                return -((int) actionBarContainer.getTranslationY());
                    }
/* 12 */            return 0;
                }

                @Override // android.view.ViewGroup
                public int getNestedScrollAxes() {
/* 1 */             rm1 rm1Var = this.f452o0;
/* 7 */             return rm1Var.f16182b | rm1Var.f16181a;
                }

                public CharSequence getTitle() {
/* 1 */             m345e();
/* 10 */            return ((C0073m) this.f439e).f762a.getTitle();
                }

                @Override // android.view.View
                public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
/* 1 */             m345e();
/* 4 */             m83 m83VarM6620h = m83.m6620h(windowInsets, this);
/* 32 */            boolean zM341a = m341a(this.f437d, new Rect(m83VarM6620h.m6622b(), m83VarM6620h.m6624d(), m83VarM6620h.m6623c(), m83VarM6620h.m6621a()), false);
/* 36 */            WeakHashMap weakHashMap = e33.f7494a;
/* 38 */            Rect rect = this.f432a0;
/* 40 */            s23.m8364b(this, m83VarM6620h, rect);
/* 43 */            int i = rect.left;
/* 45 */            int i2 = rect.top;
/* 47 */            int i3 = rect.right;
/* 49 */            int i4 = rect.bottom;
/* 51 */            j83 j83Var = m83VarM6620h.f13660a;
/* 53 */            m83 m83VarMo2972l = j83Var.mo2972l(i, i2, i3, i4);
/* 57 */            this.f440e0 = m83VarMo2972l;
/* 65 */            boolean z = true;
/* 66 */            if (!this.f442f0.equals(m83VarMo2972l)) {
/* 70 */                this.f442f0 = this.f440e0;
/* 72 */                zM341a = true;
                    }
/* 73 */            Rect rect2 = this.f434b0;
/* 79 */            if (rect2.equals(rect)) {
/* 85 */                z = zM341a;
                    } else {
/* 81 */                rect2.set(rect);
                    }
/* 86 */            if (z) {
/* 88 */                requestLayout();
                    }
/* 107 */           return j83Var.mo3677a().f13660a.mo3340c().f13660a.mo3339b().m6626g();
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             m343c(getContext());
/* 11 */            WeakHashMap weakHashMap = e33.f7494a;
/* 13 */            q23.m7679c(this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             m342b();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int childCount = getChildCount();
/* 5 */             int paddingLeft = getPaddingLeft();
/* 9 */             int paddingTop = getPaddingTop();
/* 14 */            for (int i5 = 0; i5 < childCount; i5++) {
/* 16 */                View childAt = getChildAt(i5);
/* 26 */                if (childAt.getVisibility() != 8) {
/* 32 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 34 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 38 */                    int measuredHeight = childAt.getMeasuredHeight();
/* 44 */                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
/* 47 */                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
/* 50 */                    childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
                /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
                /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:28:0x00df  */
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    int measuredHeight;
                    m83 m83Var;
                    int i3;
                    c83 z73Var;
/* 1 */             m345e();
/* 11 */            measureChildWithMargins(this.f437d, i, 0, i2, 0);
/* 20 */            LayoutParams layoutParams = (LayoutParams) this.f437d.getLayoutParams();
/* 35 */            int iMax = Math.max(0, this.f437d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
/* 51 */            int iMax2 = Math.max(0, this.f437d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
/* 61 */            int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f437d.getMeasuredState());
/* 65 */            WeakHashMap weakHashMap = e33.f7494a;
/* 78 */            boolean z = (getWindowSystemUiVisibility() & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
/* 79 */            if (z) {
/* 81 */                measuredHeight = this.f431a;
/* 85 */                if (this.f454v && this.f437d.getTabContainer() != null) {
/* 97 */                    measuredHeight += this.f431a;
                        }
                    } else {
/* 116 */               measuredHeight = this.f437d.getVisibility() != 8 ? this.f437d.getMeasuredHeight() : 0;
                    }
/* 117 */           Rect rect = this.f432a0;
/* 119 */           Rect rect2 = this.f436c0;
/* 121 */           rect2.set(rect);
/* 126 */           this.f443g0 = this.f440e0;
/* 130 */           if (this.f445i || z) {
/* 196 */               ly0 ly0VarM6573a = ly0.m6573a(this.f443g0.m6622b(), this.f443g0.m6624d() + measuredHeight, this.f443g0.m6623c(), this.f443g0.m6621a());
/* 200 */               m83Var = this.f443g0;
/* 202 */               i3 = Build.VERSION.SDK_INT;
/* 206 */               if (i3 >= 30) {
/* 210 */                   z73Var = new b83(m83Var);
                        } else if (i3 >= 29) {
/* 220 */                   z73Var = new a83(m83Var);
                        } else {
/* 226 */                   z73Var = new z73(m83Var);
                        }
/* 229 */               z73Var.mo108d(ly0VarM6573a);
/* 236 */               this.f443g0 = z73Var.mo106b();
                    } else {
/* 134 */               C2519z1 c2519z1 = this.f453p0;
/* 136 */               m83 m83Var2 = f426r0;
/* 138 */               Rect rect3 = this.f438d0;
/* 140 */               s23.m8364b(c2519z1, m83Var2, rect3);
/* 149 */               if (rect3.equals(f427s0)) {
/* 196 */                   ly0 ly0VarM6573a2 = ly0.m6573a(this.f443g0.m6622b(), this.f443g0.m6624d() + measuredHeight, this.f443g0.m6623c(), this.f443g0.m6621a());
/* 200 */                   m83Var = this.f443g0;
/* 202 */                   i3 = Build.VERSION.SDK_INT;
/* 206 */                   if (i3 >= 30) {
/* 210 */                       z73Var = new b83(m83Var);
                            } else if (i3 >= 29) {
/* 220 */                       z73Var = new a83(m83Var);
                            } else {
/* 226 */                       z73Var = new z73(m83Var);
                            }
/* 229 */                   z73Var.mo108d(ly0VarM6573a2);
/* 236 */                   this.f443g0 = z73Var.mo106b();
                        } else {
/* 154 */                   rect2.top += measuredHeight;
/* 158 */                   rect2.bottom = rect2.bottom;
/* 168 */                   this.f443g0 = this.f443g0.f13660a.mo2972l(0, measuredHeight, 0, 0);
                        }
                    }
/* 240 */           m341a(this.f435c, rect2, true);
/* 251 */           if (!this.f444h0.equals(this.f443g0)) {
/* 253 */               m83 m83Var3 = this.f443g0;
/* 255 */               this.f444h0 = m83Var3;
/* 259 */               e33.m3306b(this.f435c, m83Var3);
                    }
/* 269 */           measureChildWithMargins(this.f435c, i, 0, i2, 0);
/* 278 */           LayoutParams layoutParams2 = (LayoutParams) this.f435c.getLayoutParams();
/* 292 */           int iMax3 = Math.max(iMax, this.f435c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
/* 308 */           int iMax4 = Math.max(iMax2, this.f435c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
/* 318 */           int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f435c.getMeasuredState());
/* 368 */           setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 3 */             if (!this.f455w || !z) {
/* 59 */                return false;
                    }
/* 21 */            this.f447j0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
/* 36 */            if (this.f447j0.getFinalY() > this.f437d.getHeight()) {
/* 38 */                m342b();
/* 43 */                this.f451n0.run();
                    } else {
/* 47 */                m342b();
/* 52 */                this.f450m0.run();
                    }
/* 56 */            this.f428U = true;
/* 55 */            return true;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 1 */             return false;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 3 */             int i5 = this.f429V + i2;
/* 4 */             this.f429V = i5;
/* 6 */             setActionBarHideOffset(i5);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onNestedScrollAccepted(View view, View view2, int i) {
                    t73 t73Var;
                    q43 q43Var;
/* 3 */             this.f452o0.f16181a = i;
/* 9 */             this.f429V = getActionBarHideOffset();
/* 11 */            m342b();
/* 14 */            InterfaceC2482y1 interfaceC2482y1 = this.f446i0;
/* 16 */            if (interfaceC2482y1 == null || (q43Var = (t73Var = (t73) interfaceC2482y1).f16975t) == null) {
/* 30 */                return;
                    }
/* 24 */            q43Var.m7705a();
/* 28 */            t73Var.f16975t = null;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onStartNestedScroll(View view, View view2, int i) {
/* 3 */             if ((i & 2) == 0 || this.f437d.getVisibility() != 0) {
/* 17 */                return false;
                    }
/* 14 */            return this.f455w;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onStopNestedScroll(View view) {
/* 3 */             if (!this.f455w || this.f428U) {
/* 38 */                return;
                    }
/* 19 */            if (this.f429V <= this.f437d.getHeight()) {
/* 21 */                m342b();
/* 26 */                postDelayed(this.f450m0, 600L);
                    } else {
/* 30 */                m342b();
/* 35 */                postDelayed(this.f451n0, 600L);
                    }
                }

                @Override // android.view.View
                public final void onWindowSystemUiVisibilityChanged(int i) {
/* 1 */             super.onWindowSystemUiVisibilityChanged(i);
/* 4 */             m345e();
/* 9 */             int i2 = this.f430W ^ i;
/* 10 */            this.f430W = i;
/* 20 */            boolean z = (i & 4) == 0;
/* 27 */            boolean z2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
/* 28 */            InterfaceC2482y1 interfaceC2482y1 = this.f446i0;
/* 30 */            if (interfaceC2482y1 != null) {
/* 34 */                t73 t73Var = (t73) interfaceC2482y1;
/* 36 */                t73Var.f16970o = !z2;
/* 38 */                if (z || !z2) {
/* 55 */                    if (t73Var.f16972q) {
/* 57 */                        t73Var.f16972q = false;
/* 59 */                        t73Var.m8728y(true);
                            }
                        } else if (!t73Var.f16972q) {
/* 47 */                    t73Var.f16972q = true;
/* 49 */                    t73Var.m8728y(true);
                        }
                    }
/* 64 */            if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.f446i0 == null) {
/* 75 */                return;
                    }
/* 70 */            WeakHashMap weakHashMap = e33.f7494a;
/* 72 */            q23.m7679c(this);
                }

                @Override // android.view.View
                public final void onWindowVisibilityChanged(int i) {
/* 1 */             super.onWindowVisibilityChanged(i);
/* 4 */             this.f433b = i;
/* 6 */             InterfaceC2482y1 interfaceC2482y1 = this.f446i0;
/* 8 */             if (interfaceC2482y1 != null) {
/* 12 */                ((t73) interfaceC2482y1).f16969n = i;
                    }
                }

                public void setActionBarHideOffset(int i) {
/* 1 */             m342b();
/* 23 */            this.f437d.setTranslationY(-Math.max(0, Math.min(i, this.f437d.getHeight())));
                }

                public void setActionBarVisibilityCallback(InterfaceC2482y1 interfaceC2482y1) {
/* 1 */             this.f446i0 = interfaceC2482y1;
/* 7 */             if (getWindowToken() != null) {
/* 15 */                ((t73) this.f446i0).f16969n = this.f433b;
/* 17 */                int i = this.f430W;
/* 19 */                if (i != 0) {
/* 21 */                    onWindowSystemUiVisibilityChanged(i);
/* 24 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 26 */                    q23.m7679c(this);
                        }
                    }
                }

                public void setHasNonEmbeddedTabs(boolean z) {
/* 1 */             this.f454v = z;
                }

                public void setHideOnContentScrollEnabled(boolean z) {
/* 3 */             if (z != this.f455w) {
/* 5 */                 this.f455w = z;
/* 7 */                 if (z) {
/* 16 */                    return;
                        }
/* 9 */                 m342b();
/* 13 */                setActionBarHideOffset(0);
                    }
                }

                public void setIcon(int i) {
/* 1 */             m345e();
/* 6 */             C0073m c0073m = (C0073m) this.f439e;
/* 22 */            c0073m.f765d = i != 0 ? mn0.m6700p(c0073m.f762a.getContext(), i) : null;
/* 24 */            c0073m.m437c();
                }

                public void setLogo(int i) {
/* 1 */             m345e();
/* 6 */             C0073m c0073m = (C0073m) this.f439e;
/* 22 */            c0073m.f766e = i != 0 ? mn0.m6700p(c0073m.f762a.getContext(), i) : null;
/* 24 */            c0073m.m437c();
                }

                public void setOverlayMode(boolean z) {
/* 1 */             this.f445i = z;
                }

                public void setShowingForActionMode(boolean z) {
                }

                public void setUiOptions(int i) {
                }

                @Override // p000.m50
                public void setWindowCallback(Window.Callback callback) {
/* 1 */             m345e();
/* 8 */             ((C0073m) this.f439e).f772k = callback;
                }

                @Override // p000.m50
                public void setWindowTitle(CharSequence charSequence) {
/* 1 */             m345e();
/* 6 */             C0073m c0073m = (C0073m) this.f439e;
/* 10 */            if (c0073m.f768g) {
/* 36 */                return;
                    }
/* 12 */            Toolbar toolbar = c0073m.f762a;
/* 14 */            c0073m.f769h = charSequence;
/* 20 */            if ((c0073m.f763b & 8) != 0) {
/* 22 */                toolbar.setTitle(charSequence);
/* 27 */                if (c0073m.f768g) {
/* 33 */                    e33.m3319o(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

                @Override // p000.pm1
/* 1 */         public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
                }

                @Override // p000.pm1
/* 9 */         public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
                    if (i5 == 0) {
/* 10 */                onNestedScroll(view, i, i2, i3, i4);
                    }
                }

                @Override // android.view.ViewGroup
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 12 */            return new LayoutParams(layoutParams);
                }

                @Override // p000.qm1
/* 10 */        public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 11 */            onNestedScroll(view, i, i2, i3, i4, i5);
                }

                @Override // p000.pm1
/* 18 */        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
                    return i2 == 0 && onStartNestedScroll(view, view2, i);
                }

/* 27 */        public void setIcon(Drawable drawable) {
/* 28 */            m345e();
/* 29 */            C0073m c0073m = (C0073m) this.f439e;
/* 30 */            c0073m.f765d = drawable;
/* 31 */            c0073m.m437c();
                }

                @Override // p000.pm1
/* 30 */        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
                    if (i2 == 0) {
/* 31 */                onNestedScrollAccepted(view, view2, i);
                    }
                }

                @Override // p000.pm1
/* 38 */        public final void onStopNestedScroll(View view, int i) {
                    if (i == 0) {
/* 39 */                onStopNestedScroll(view);
                    }
                }
            }
