            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.ContextThemeWrapper;
            import android.view.Gravity;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.TextView;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.app.ActionBar$LayoutParams;
            import androidx.customview.view.AbsSavedState;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.RunnableC2495ye;
            import p000.ViewOnClickListenerC2239u1;
            import p000.ac1;
            import p000.e33;
            import p000.er0;
            import p000.fh1;
            import p000.i13;
            import p000.i52;
            import p000.jg1;
            import p000.lg1;
            import p000.m53;
            import p000.mn0;
            import p000.n50;
            import p000.pg1;
            import p000.qm0;
            import p000.sg1;
            import p000.ts0;
            import p000.up2;
            import p000.vp2;
            import p000.wp2;
            import p000.yi2;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class Toolbar extends ViewGroup implements lg1 {

                /* JADX INFO: renamed from: A0 */
                public C0071k f685A0;

                /* JADX INFO: renamed from: B0 */
                public zr3 f686B0;

                /* JADX INFO: renamed from: C0 */
                public ts0 f687C0;

                /* JADX INFO: renamed from: D0 */
                public boolean f688D0;

                /* JADX INFO: renamed from: E0 */
                public OnBackInvokedCallback f689E0;

                /* JADX INFO: renamed from: F0 */
                public OnBackInvokedDispatcher f690F0;

                /* JADX INFO: renamed from: G0 */
                public boolean f691G0;

                /* JADX INFO: renamed from: H0 */
                public final RunnableC2495ye f692H0;

                /* JADX INFO: renamed from: U */
                public Context f693U;

                /* JADX INFO: renamed from: V */
                public int f694V;

                /* JADX INFO: renamed from: W */
                public int f695W;

                /* JADX INFO: renamed from: a */
                public ActionMenuView f696a;

                /* JADX INFO: renamed from: a0 */
                public int f697a0;

                /* JADX INFO: renamed from: b */
                public AppCompatTextView f698b;

                /* JADX INFO: renamed from: b0 */
                public final int f699b0;

                /* JADX INFO: renamed from: c */
                public AppCompatTextView f700c;

                /* JADX INFO: renamed from: c0 */
                public final int f701c0;

                /* JADX INFO: renamed from: d */
                public AppCompatImageButton f702d;

                /* JADX INFO: renamed from: d0 */
                public int f703d0;

                /* JADX INFO: renamed from: e */
                public AppCompatImageView f704e;

                /* JADX INFO: renamed from: e0 */
                public int f705e0;

                /* JADX INFO: renamed from: f */
                public final Drawable f706f;

                /* JADX INFO: renamed from: f0 */
                public int f707f0;

                /* JADX INFO: renamed from: g0 */
                public int f708g0;

                /* JADX INFO: renamed from: h0 */
                public i52 f709h0;

                /* JADX INFO: renamed from: i */
                public final CharSequence f710i;

                /* JADX INFO: renamed from: i0 */
                public int f711i0;

                /* JADX INFO: renamed from: j0 */
                public int f712j0;

                /* JADX INFO: renamed from: k0 */
                public final int f713k0;

                /* JADX INFO: renamed from: l0 */
                public CharSequence f714l0;

                /* JADX INFO: renamed from: m0 */
                public CharSequence f715m0;

                /* JADX INFO: renamed from: n0 */
                public ColorStateList f716n0;

                /* JADX INFO: renamed from: o0 */
                public ColorStateList f717o0;

                /* JADX INFO: renamed from: p0 */
                public boolean f718p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f719q0;

                /* JADX INFO: renamed from: r0 */
                public final ArrayList f720r0;

                /* JADX INFO: renamed from: s0 */
                public final ArrayList f721s0;

                /* JADX INFO: renamed from: t0 */
                public final int[] f722t0;

                /* JADX INFO: renamed from: u0 */
                public final pg1 f723u0;

                /* JADX INFO: renamed from: v */
                public AppCompatImageButton f724v;

                /* JADX INFO: renamed from: v0 */
                public ArrayList f725v0;

                /* JADX INFO: renamed from: w */
                public View f726w;

                /* JADX INFO: renamed from: w0 */
                public wp2 f727w0;

                /* JADX INFO: renamed from: x0 */
                public final ts0 f728x0;

                /* JADX INFO: renamed from: y0 */
                public C0073m f729y0;

                /* JADX INFO: renamed from: z0 */
                public C0062b f730z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ActionBar$LayoutParams {

                    /* JADX INFO: renamed from: b */
                    public int f731b;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f731b = 0;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0072l();

                    /* JADX INFO: renamed from: c */
                    public int f732c;

                    /* JADX INFO: renamed from: d */
                    public boolean f733d;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 8 */                 this.f732c = parcel.readInt();
/* 19 */                this.f733d = parcel.readInt() != 0;
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f732c);
/* 11 */                parcel.writeInt(this.f733d ? 1 : 0);
                    }
                }

                public Toolbar(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 7 */             this.f713k0 = 8388627;
/* 14 */            this.f720r0 = new ArrayList();
/* 21 */            this.f721s0 = new ArrayList();
/* 26 */            this.f722t0 = new int[2];
/* 39 */            this.f723u0 = new pg1(new up2(this, 1));
/* 46 */            this.f725v0 = new ArrayList();
/* 53 */            this.f728x0 = new ts0(this);
/* 62 */            this.f692H0 = new RunnableC2495ye(this, 24);
/* 70 */            ac1 ac1VarM156H = ac1.m156H(getContext(), attributeSet, R$styleable.Toolbar, i);
/* 85 */            e33.m3317m(this, context, R$styleable.Toolbar, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
/* 88 */            int i2 = R$styleable.Toolbar_titleTextAppearance;
/* 92 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 99 */            this.f695W = typedArray.getResourceId(i2, 0);
/* 107 */           this.f697a0 = typedArray.getResourceId(R$styleable.Toolbar_subtitleTextAppearance, 0);
/* 115 */           this.f713k0 = typedArray.getInteger(R$styleable.Toolbar_android_gravity, 8388627);
/* 125 */           this.f699b0 = typedArray.getInteger(R$styleable.Toolbar_buttonGravity, 48);
/* 129 */           int dimensionPixelOffset = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMargin, 0);
/* 143 */           dimensionPixelOffset = typedArray.hasValue(R$styleable.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
/* 147 */           this.f708g0 = dimensionPixelOffset;
/* 149 */           this.f707f0 = dimensionPixelOffset;
/* 151 */           this.f705e0 = dimensionPixelOffset;
/* 153 */           this.f703d0 = dimensionPixelOffset;
/* 158 */           int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginStart, -1);
/* 162 */           if (dimensionPixelOffset2 >= 0) {
/* 164 */               this.f703d0 = dimensionPixelOffset2;
                    }
/* 168 */           int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginEnd, -1);
/* 172 */           if (dimensionPixelOffset3 >= 0) {
/* 174 */               this.f705e0 = dimensionPixelOffset3;
                    }
/* 178 */           int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginTop, -1);
/* 182 */           if (dimensionPixelOffset4 >= 0) {
/* 184 */               this.f707f0 = dimensionPixelOffset4;
                    }
/* 188 */           int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_titleMarginBottom, -1);
/* 192 */           if (dimensionPixelOffset5 >= 0) {
/* 194 */               this.f708g0 = dimensionPixelOffset5;
                    }
/* 202 */           this.f701c0 = typedArray.getDimensionPixelSize(R$styleable.Toolbar_maxButtonHeight, -1);
/* 208 */           int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
/* 214 */           int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
/* 220 */           int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.Toolbar_contentInsetLeft, 0);
/* 226 */           int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.Toolbar_contentInsetRight, 0);
/* 230 */           m402d();
/* 233 */           i52 i52Var = this.f709h0;
/* 235 */           i52Var.f9459h = false;
/* 237 */           if (dimensionPixelSize != Integer.MIN_VALUE) {
/* 239 */               i52Var.f9456e = dimensionPixelSize;
/* 241 */               i52Var.f9452a = dimensionPixelSize;
                    }
/* 243 */           if (dimensionPixelSize2 != Integer.MIN_VALUE) {
/* 245 */               i52Var.f9457f = dimensionPixelSize2;
/* 247 */               i52Var.f9453b = dimensionPixelSize2;
                    }
/* 249 */           if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
/* 253 */               i52Var.m4474a(dimensionPixelOffset6, dimensionPixelOffset7);
                    }
/* 262 */           this.f711i0 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
/* 270 */           this.f712j0 = typedArray.getDimensionPixelOffset(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
/* 278 */           this.f706f = ac1VarM156H.m184n(R$styleable.Toolbar_collapseIcon);
/* 286 */           this.f710i = typedArray.getText(R$styleable.Toolbar_collapseContentDescription);
/* 290 */           CharSequence text = typedArray.getText(R$styleable.Toolbar_title);
/* 298 */           if (!TextUtils.isEmpty(text)) {
/* 300 */               setTitle(text);
                    }
/* 305 */           CharSequence text2 = typedArray.getText(R$styleable.Toolbar_subtitle);
/* 313 */           if (!TextUtils.isEmpty(text2)) {
/* 315 */               setSubtitle(text2);
                    }
/* 322 */           this.f693U = getContext();
/* 330 */           setPopupTheme(typedArray.getResourceId(R$styleable.Toolbar_popupTheme, 0));
/* 335 */           Drawable drawableM184n = ac1VarM156H.m184n(R$styleable.Toolbar_navigationIcon);
/* 339 */           if (drawableM184n != null) {
/* 341 */               setNavigationIcon(drawableM184n);
                    }
/* 346 */           CharSequence text3 = typedArray.getText(R$styleable.Toolbar_navigationContentDescription);
/* 354 */           if (!TextUtils.isEmpty(text3)) {
/* 356 */               setNavigationContentDescription(text3);
                    }
/* 361 */           Drawable drawableM184n2 = ac1VarM156H.m184n(R$styleable.Toolbar_logo);
/* 365 */           if (drawableM184n2 != null) {
/* 367 */               setLogo(drawableM184n2);
                    }
/* 372 */           CharSequence text4 = typedArray.getText(R$styleable.Toolbar_logoDescription);
/* 380 */           if (!TextUtils.isEmpty(text4)) {
/* 382 */               setLogoDescription(text4);
                    }
/* 391 */           if (typedArray.hasValue(R$styleable.Toolbar_titleTextColor)) {
/* 399 */               setTitleTextColor(ac1VarM156H.m183m(R$styleable.Toolbar_titleTextColor));
                    }
/* 408 */           if (typedArray.hasValue(R$styleable.Toolbar_subtitleTextColor)) {
/* 416 */               setSubtitleTextColor(ac1VarM156H.m183m(R$styleable.Toolbar_subtitleTextColor));
                    }
/* 425 */           if (typedArray.hasValue(R$styleable.Toolbar_menu)) {
/* 441 */               getMenuInflater().inflate(typedArray.getResourceId(R$styleable.Toolbar_menu, 0), getMenu());
                    }
/* 444 */           ac1VarM156H.m168J();
                }

                private ArrayList<MenuItem> getCurrentMenuItems() {
/* 3 */             ArrayList<MenuItem> arrayList = new ArrayList<>();
/* 6 */             Menu menu = getMenu();
/* 15 */            for (int i = 0; i < menu.size(); i++) {
/* 21 */                arrayList.add(menu.getItem(i));
                    }
/* 27 */            return arrayList;
                }

                private MenuInflater getMenuInflater() {
/* 7 */             return new yi2(getContext());
                }

                /* JADX INFO: renamed from: h */
                public static LayoutParams m395h() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-2, -2);
/* 8 */             layoutParams.f731b = 0;
/* 13 */            layoutParams.f359a = 8388627;
/* 15 */            return layoutParams;
                }

                /* JADX INFO: renamed from: i */
                public static LayoutParams m396i(ViewGroup.LayoutParams layoutParams) {
/* 4 */             if (layoutParams instanceof LayoutParams) {
/* 8 */                 LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 10 */                LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
/* 13 */                layoutParams3.f731b = 0;
/* 17 */                layoutParams3.f731b = layoutParams2.f731b;
/* 19 */                return layoutParams3;
                    }
/* 22 */            if (layoutParams instanceof ActionBar$LayoutParams) {
/* 28 */                LayoutParams layoutParams4 = new LayoutParams((ActionBar$LayoutParams) layoutParams);
/* 31 */                layoutParams4.f731b = 0;
/* 33 */                return layoutParams4;
                    }
/* 36 */            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
/* 66 */                LayoutParams layoutParams5 = new LayoutParams(layoutParams);
/* 69 */                layoutParams5.f731b = 0;
/* 71 */                return layoutParams5;
                    }
/* 40 */            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 42 */            LayoutParams layoutParams6 = new LayoutParams(marginLayoutParams);
/* 45 */            layoutParams6.f731b = 0;
/* 49 */            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = marginLayoutParams.leftMargin;
/* 53 */            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = marginLayoutParams.topMargin;
/* 57 */            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = marginLayoutParams.rightMargin;
/* 61 */            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = marginLayoutParams.bottomMargin;
/* 63 */            return layoutParams6;
                }

                /* JADX INFO: renamed from: k */
                public static int m397k(View view) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 15 */            return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
                }

                /* JADX INFO: renamed from: l */
                public static int m398l(View view) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 11 */            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }

                /* JADX INFO: renamed from: a */
                public final void m399a(int i, ArrayList arrayList) {
/* 11 */            boolean z = getLayoutDirection() == 1;
/* 12 */            int childCount = getChildCount();
/* 20 */            int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
/* 24 */            arrayList.clear();
/* 29 */            if (!z) {
/* 85 */                for (int i2 = 0; i2 < childCount; i2++) {
/* 87 */                    View childAt = getChildAt(i2);
/* 95 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 99 */                    if (layoutParams.f731b == 0 && m414t(childAt)) {
/* 107 */                       int i3 = layoutParams.f359a;
/* 109 */                       int layoutDirection = getLayoutDirection();
/* 117 */                       int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
/* 119 */                       if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
/* 129 */                           absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                                }
/* 130 */                       if (absoluteGravity2 == absoluteGravity) {
/* 132 */                           arrayList.add(childAt);
                                }
                            }
                        }
/* 138 */               return;
                    }
/* 32 */            for (int i4 = childCount - 1; i4 >= 0; i4--) {
/* 34 */                View childAt2 = getChildAt(i4);
/* 42 */                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
/* 46 */                if (layoutParams2.f731b == 0 && m414t(childAt2)) {
/* 54 */                    int i5 = layoutParams2.f359a;
/* 56 */                    int layoutDirection2 = getLayoutDirection();
/* 64 */                    int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
/* 66 */                    if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
/* 76 */                        absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                            }
/* 77 */                    if (absoluteGravity3 == absoluteGravity) {
/* 79 */                        arrayList.add(childAt2);
                            }
                        }
                    }
                }

                @Override // p000.lg1
                public final void addMenuProvider(fh1 fh1Var) {
/* 1 */             pg1 pg1Var = this.f723u0;
/* 5 */             pg1Var.f15112b.add(fh1Var);
/* 10 */            pg1Var.f15111a.run();
                }

                /* JADX INFO: renamed from: b */
                public final void m400b(View view, boolean z) {
                    LayoutParams layoutParamsM396i;
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 5 */             if (layoutParams == null) {
/* 7 */                 layoutParamsM396i = m395h();
                    } else {
/* 23 */                layoutParamsM396i = !checkLayoutParams(layoutParams) ? m396i(layoutParams) : (LayoutParams) layoutParams;
                    }
/* 26 */            layoutParamsM396i.f731b = 1;
/* 28 */            if (!z || this.f726w == null) {
/* 43 */                addView(view, layoutParamsM396i);
                    } else {
/* 34 */                view.setLayoutParams(layoutParamsM396i);
/* 39 */                this.f721s0.add(view);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m401c() {
/* 3 */             if (this.f724v == null) {
/* 14 */                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R$attr.toolbarNavigationButtonStyle);
/* 17 */                this.f724v = appCompatImageButton;
/* 21 */                appCompatImageButton.setImageDrawable(this.f706f);
/* 28 */                this.f724v.setContentDescription(this.f710i);
/* 31 */                LayoutParams layoutParamsM395h = m395h();
/* 43 */                layoutParamsM395h.f359a = (this.f699b0 & 112) | 8388611;
/* 46 */                layoutParamsM395h.f731b = 2;
/* 50 */                this.f724v.setLayoutParams(layoutParamsM395h);
/* 62 */                this.f724v.setOnClickListener(new ViewOnClickListenerC2239u1(this, 10));
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
                }

                /* JADX INFO: renamed from: d */
                public final void m402d() {
/* 3 */             if (this.f709h0 == null) {
/* 7 */                 i52 i52Var = new i52();
/* 11 */                i52Var.f9452a = 0;
/* 13 */                i52Var.f9453b = 0;
/* 17 */                i52Var.f9454c = Integer.MIN_VALUE;
/* 19 */                i52Var.f9455d = Integer.MIN_VALUE;
/* 21 */                i52Var.f9456e = 0;
/* 23 */                i52Var.f9457f = 0;
/* 25 */                i52Var.f9458g = false;
/* 27 */                i52Var.f9459h = false;
/* 29 */                this.f709h0 = i52Var;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m403e() {
/* 1 */             m404f();
/* 4 */             ActionMenuView actionMenuView = this.f696a;
/* 8 */             if (actionMenuView.f457d0 == null) {
/* 14 */                jg1 jg1Var = (jg1) actionMenuView.getMenu();
/* 18 */                if (this.f685A0 == null) {
/* 25 */                    this.f685A0 = new C0071k(this);
                        }
/* 30 */                this.f696a.setExpandedActionViewsExclusive(true);
/* 37 */                jg1Var.m5802b(this.f685A0, this.f693U);
/* 40 */                m416v();
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m404f() {
/* 3 */             if (this.f696a == null) {
/* 12 */                ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
/* 15 */                this.f696a = actionMenuView;
/* 19 */                actionMenuView.setPopupTheme(this.f694V);
/* 26 */                this.f696a.setOnMenuItemClickListener(this.f728x0);
/* 29 */                ActionMenuView actionMenuView2 = this.f696a;
/* 31 */                zr3 zr3Var = this.f686B0;
/* 37 */                er0 er0Var = new er0(this, 19);
/* 40 */                actionMenuView2.f462i0 = zr3Var;
/* 42 */                actionMenuView2.f463j0 = er0Var;
/* 44 */                LayoutParams layoutParamsM395h = m395h();
/* 56 */                layoutParamsM395h.f359a = (this.f699b0 & 112) | 8388613;
/* 60 */                this.f696a.setLayoutParams(layoutParamsM395h);
/* 66 */                m400b(this.f696a, false);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m405g() {
/* 3 */             if (this.f702d == null) {
/* 17 */                this.f702d = new AppCompatImageButton(getContext(), null, R$attr.toolbarNavigationButtonStyle);
/* 19 */                LayoutParams layoutParamsM395h = m395h();
/* 31 */                layoutParamsM395h.f359a = (this.f699b0 & 112) | 8388611;
/* 35 */                this.f702d.setLayoutParams(layoutParamsM395h);
                    }
                }

                @Override // android.view.ViewGroup
                public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 1 */             return m395h();
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public CharSequence getCollapseContentDescription() {
/* 1 */             AppCompatImageButton appCompatImageButton = this.f724v;
/* 3 */             if (appCompatImageButton != null) {
/* 5 */                 return appCompatImageButton.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Drawable getCollapseIcon() {
/* 1 */             AppCompatImageButton appCompatImageButton = this.f724v;
/* 3 */             if (appCompatImageButton != null) {
/* 5 */                 return appCompatImageButton.getDrawable();
                    }
/* 10 */            return null;
                }

                public int getContentInsetEnd() {
/* 1 */             i52 i52Var = this.f709h0;
/* 3 */             if (i52Var != null) {
                        return i52Var.f9458g ? i52Var.f9452a : i52Var.f9453b;
                    }
/* 15 */            return 0;
                }

                public int getContentInsetEndWithActions() {
/* 1 */             int i = this.f712j0;
                    return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
                }

                public int getContentInsetLeft() {
/* 1 */             i52 i52Var = this.f709h0;
/* 3 */             if (i52Var != null) {
/* 5 */                 return i52Var.f9452a;
                    }
/* 8 */             return 0;
                }

                public int getContentInsetRight() {
/* 1 */             i52 i52Var = this.f709h0;
/* 3 */             if (i52Var != null) {
/* 5 */                 return i52Var.f9453b;
                    }
/* 8 */             return 0;
                }

                public int getContentInsetStart() {
/* 1 */             i52 i52Var = this.f709h0;
/* 3 */             if (i52Var != null) {
                        return i52Var.f9458g ? i52Var.f9453b : i52Var.f9452a;
                    }
/* 15 */            return 0;
                }

                public int getContentInsetStartWithNavigation() {
/* 1 */             int i = this.f711i0;
                    return i != Integer.MIN_VALUE ? i : getContentInsetStart();
                }

                public int getCurrentContentInsetEnd() {
                    jg1 jg1Var;
/* 1 */             ActionMenuView actionMenuView = this.f696a;
                    return (actionMenuView == null || (jg1Var = actionMenuView.f457d0) == null || !jg1Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f712j0, 0));
                }

                public int getCurrentContentInsetLeft() {
                    return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
                }

                public int getCurrentContentInsetRight() {
                    return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
                }

                public int getCurrentContentInsetStart() {
                    return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f711i0, 0)) : getContentInsetStart();
                }

                public Drawable getLogo() {
/* 1 */             AppCompatImageView appCompatImageView = this.f704e;
/* 3 */             if (appCompatImageView != null) {
/* 5 */                 return appCompatImageView.getDrawable();
                    }
/* 10 */            return null;
                }

                public CharSequence getLogoDescription() {
/* 1 */             AppCompatImageView appCompatImageView = this.f704e;
/* 3 */             if (appCompatImageView != null) {
/* 5 */                 return appCompatImageView.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Menu getMenu() {
/* 1 */             m403e();
/* 6 */             return this.f696a.getMenu();
                }

                public View getNavButtonView() {
/* 1 */             return this.f702d;
                }

                public CharSequence getNavigationContentDescription() {
/* 1 */             AppCompatImageButton appCompatImageButton = this.f702d;
/* 3 */             if (appCompatImageButton != null) {
/* 5 */                 return appCompatImageButton.getContentDescription();
                    }
/* 10 */            return null;
                }

                public Drawable getNavigationIcon() {
/* 1 */             AppCompatImageButton appCompatImageButton = this.f702d;
/* 3 */             if (appCompatImageButton != null) {
/* 5 */                 return appCompatImageButton.getDrawable();
                    }
/* 10 */            return null;
                }

                public C0062b getOuterActionMenuPresenter() {
/* 1 */             return this.f730z0;
                }

                public Drawable getOverflowIcon() {
/* 1 */             m403e();
/* 6 */             return this.f696a.getOverflowIcon();
                }

                public Context getPopupContext() {
/* 1 */             return this.f693U;
                }

                public int getPopupTheme() {
/* 1 */             return this.f694V;
                }

                public CharSequence getSubtitle() {
/* 1 */             return this.f715m0;
                }

                public final TextView getSubtitleTextView() {
/* 1 */             return this.f700c;
                }

                public CharSequence getTitle() {
/* 1 */             return this.f714l0;
                }

                public int getTitleMarginBottom() {
/* 1 */             return this.f708g0;
                }

                public int getTitleMarginEnd() {
/* 1 */             return this.f705e0;
                }

                public int getTitleMarginStart() {
/* 1 */             return this.f703d0;
                }

                public int getTitleMarginTop() {
/* 1 */             return this.f707f0;
                }

                public final TextView getTitleTextView() {
/* 1 */             return this.f698b;
                }

                public n50 getWrapper() {
/* 3 */             if (this.f729y0 == null) {
/* 11 */                this.f729y0 = new C0073m(this, true);
                    }
/* 13 */            return this.f729y0;
                }

                /* JADX INFO: renamed from: j */
                public final int m406j(int i, View view) {
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 7 */             int measuredHeight = view.getMeasuredHeight();
/* 19 */            int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
/* 22 */            int i3 = layoutParams.f359a & 112;
/* 30 */            if (i3 != 16 && i3 != 48 && i3 != 80) {
/* 38 */                i3 = this.f713k0 & 112;
                    }
/* 40 */            if (i3 == 48) {
/* 103 */               return getPaddingTop() - i2;
                    }
/* 42 */            if (i3 == 80) {
/* 97 */                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
                    }
/* 44 */            int paddingTop = getPaddingTop();
/* 48 */            int paddingBottom = getPaddingBottom();
/* 52 */            int height = getHeight();
/* 60 */            int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
/* 62 */            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
/* 64 */            if (iMax < i4) {
/* 66 */                iMax = i4;
                    } else {
/* 71 */                int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
/* 72 */                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 74 */                if (i5 < i6) {
/* 78 */                    iMax = Math.max(0, iMax - (i6 - i5));
                        }
                    }
/* 82 */            return paddingTop + iMax;
                }

                /* JADX INFO: renamed from: m */
                public final void m407m() {
/* 3 */             Iterator it = this.f725v0.iterator();
/* 11 */            while (it.hasNext()) {
/* 27 */                getMenu().removeItem(((MenuItem) it.next()).getItemId());
                    }
/* 31 */            Menu menu = getMenu();
/* 35 */            ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
/* 39 */            MenuInflater menuInflater = getMenuInflater();
/* 47 */            Iterator it2 = this.f723u0.f15112b.iterator();
/* 55 */            while (it2.hasNext()) {
/* 67 */                ((qm0) ((fh1) it2.next())).f15653a.m713k(menu, menuInflater);
                    }
/* 71 */            ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
/* 75 */            currentMenuItems2.removeAll(currentMenuItems);
/* 78 */            this.f725v0 = currentMenuItems2;
                }

                /* JADX INFO: renamed from: n */
                public final boolean m408n(View view) {
                    return view.getParent() == this || this.f721s0.contains(view);
                }

                /* JADX INFO: renamed from: o */
                public final boolean m409o() {
                    C0062b c0062b;
/* 1 */             ActionMenuView actionMenuView = this.f696a;
                    return (actionMenuView == null || (c0062b = actionMenuView.f461h0) == null || !c0062b.m427m()) ? false : true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             m416v();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             removeCallbacks(this.f692H0);
/* 9 */             m416v();
                }

                @Override // android.view.View
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (actionMasked == 9) {
/* 10 */                this.f719q0 = false;
                    }
/* 15 */            if (!this.f719q0) {
/* 17 */                boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 21 */                if (actionMasked == 9 && !zOnHoverEvent) {
/* 25 */                    this.f719q0 = true;
                        }
                    }
/* 29 */            if (actionMasked != 10 && actionMasked != 3) {
/* 14 */                return true;
                    }
/* 36 */            this.f719q0 = false;
/* 14 */            return true;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x024b  */
                /* JADX WARN: Code duplicated, block: B:102:0x024e  */
                /* JADX WARN: Code duplicated, block: B:103:0x0270  */
                /* JADX WARN: Code duplicated, block: B:105:0x0273  */
                /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:119:0x0305  */
                /* JADX WARN: Code duplicated, block: B:120:0x0309  */
                /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:20:0x0060  */
                /* JADX WARN: Code duplicated, block: B:22:0x0064  */
                /* JADX WARN: Code duplicated, block: B:23:0x0069  */
                /* JADX WARN: Code duplicated, block: B:26:0x0075  */
                /* JADX WARN: Code duplicated, block: B:28:0x0079  */
                /* JADX WARN: Code duplicated, block: B:29:0x007e  */
                /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
                /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:48:0x0115  */
                /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:52:0x011d  */
                /* JADX WARN: Code duplicated, block: B:53:0x0120  */
                /* JADX WARN: Code duplicated, block: B:55:0x0124  */
                /* JADX WARN: Code duplicated, block: B:56:0x0127  */
                /* JADX WARN: Code duplicated, block: B:59:0x0139  */
                /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:68:0x015a  */
                /* JADX WARN: Code duplicated, block: B:70:0x015e  */
                /* JADX WARN: Code duplicated, block: B:72:0x016f  */
                /* JADX WARN: Code duplicated, block: B:73:0x0171  */
                /* JADX WARN: Code duplicated, block: B:75:0x017d  */
                /* JADX WARN: Code duplicated, block: B:77:0x0189  */
                /* JADX WARN: Code duplicated, block: B:78:0x0193  */
                /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
                /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
                /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
                /* JADX WARN: Code duplicated, block: B:88:0x01df  */
                /* JADX WARN: Code duplicated, block: B:89:0x0203  */
                /* JADX WARN: Code duplicated, block: B:91:0x0206  */
                /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:94:0x0210  */
                /* JADX WARN: Code duplicated, block: B:96:0x0214  */
                /* JADX WARN: Code duplicated, block: B:99:0x0228  */
                @Override // android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int iM410p;
                    int iM411q;
                    int iMax;
                    int iMin;
                    boolean zM414t;
                    boolean zM414t2;
                    int measuredHeight;
                    AppCompatTextView appCompatTextView;
                    AppCompatTextView appCompatTextView2;
                    LayoutParams layoutParams;
                    LayoutParams layoutParams2;
                    int i5;
                    boolean z2;
                    int i6;
                    int i7;
                    int paddingTop;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int iMax2;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    ArrayList arrayList;
                    int size;
                    int iM410p2;
                    int i18;
                    int size2;
                    int i19;
                    int i20;
                    int size3;
                    int i21;
                    int i22;
                    int measuredWidth;
                    int i23;
                    int i24;
                    int i25;
                    int size4;
                    AppCompatImageView appCompatImageView;
                    View view;
                    ActionMenuView actionMenuView;
                    AppCompatImageButton appCompatImageButton;
/* 13 */            boolean z3 = getLayoutDirection() == 1;
/* 14 */            int width = getWidth();
/* 18 */            int height = getHeight();
/* 22 */            int paddingLeft = getPaddingLeft();
/* 26 */            int paddingRight = getPaddingRight();
/* 30 */            int paddingTop2 = getPaddingTop();
/* 34 */            int paddingBottom = getPaddingBottom();
/* 38 */            int i26 = width - paddingRight;
/* 40 */            int[] iArr = this.f722t0;
/* 42 */            iArr[1] = 0;
/* 44 */            iArr[0] = 0;
/* 46 */            WeakHashMap weakHashMap = e33.f7494a;
/* 48 */            int minimumHeight = getMinimumHeight();
/* 61 */            int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
/* 68 */            if (m414t(this.f702d)) {
/* 70 */                AppCompatImageButton appCompatImageButton2 = this.f702d;
/* 72 */                if (z3) {
/* 74 */                    iM411q = m411q(appCompatImageButton2, i26, iMin2, iArr);
/* 79 */                    iM410p = paddingLeft;
                        } else {
/* 81 */                    iM410p = m410p(appCompatImageButton2, paddingLeft, iMin2, iArr);
                        }
/* 95 */                if (m414t(this.f724v)) {
/* 97 */                    appCompatImageButton = this.f724v;
/* 99 */                    if (z3) {
/* 101 */                       iM411q = m411q(appCompatImageButton, iM411q, iMin2, iArr);
                            } else {
/* 106 */                       iM410p = m410p(appCompatImageButton, iM410p, iMin2, iArr);
                            }
                        }
/* 116 */               if (m414t(this.f696a)) {
/* 118 */                   actionMenuView = this.f696a;
/* 120 */                   if (z3) {
/* 122 */                       iM410p = m410p(actionMenuView, iM410p, iMin2, iArr);
                            } else {
/* 127 */                       iM411q = m411q(actionMenuView, iM411q, iMin2, iArr);
                            }
                        }
/* 131 */               int currentContentInsetLeft = getCurrentContentInsetLeft();
/* 135 */               int currentContentInsetRight = getCurrentContentInsetRight();
/* 147 */               iArr[0] = Math.max(0, currentContentInsetLeft - iM410p);
/* 157 */               iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM411q));
/* 159 */               iMax = Math.max(iM410p, currentContentInsetLeft);
/* 165 */               iMin = Math.min(iM411q, i26 - currentContentInsetRight);
/* 175 */               if (m414t(this.f726w)) {
/* 177 */                   view = this.f726w;
/* 179 */                   if (z3) {
/* 181 */                       iMin = m411q(view, iMin, iMin2, iArr);
                            } else {
/* 186 */                       iMax = m410p(view, iMax, iMin2, iArr);
                            }
                        }
/* 196 */               if (m414t(this.f704e)) {
/* 198 */                   appCompatImageView = this.f704e;
/* 200 */                   if (z3) {
/* 202 */                       iMin = m411q(appCompatImageView, iMin, iMin2, iArr);
                            } else {
/* 207 */                       iMax = m410p(appCompatImageView, iMax, iMin2, iArr);
                            }
                        }
/* 213 */               zM414t = m414t(this.f698b);
/* 219 */               zM414t2 = m414t(this.f700c);
/* 223 */               if (zM414t) {
/* 231 */                   LayoutParams layoutParams3 = (LayoutParams) this.f698b.getLayoutParams();
/* 246 */                   measuredHeight = this.f698b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                        } else {
/* 250 */                   measuredHeight = 0;
                        }
/* 251 */               if (zM414t2) {
/* 259 */                   LayoutParams layoutParams4 = (LayoutParams) this.f700c.getLayoutParams();
/* 275 */                   measuredHeight = this.f700c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + measuredHeight;
                        }
/* 280 */               if (zM414t || zM414t2) {
/* 284 */                   if (zM414t) {
/* 286 */                       appCompatTextView = this.f698b;
                            } else {
/* 289 */                       appCompatTextView = this.f700c;
                            }
/* 291 */                   if (zM414t2) {
/* 293 */                       appCompatTextView2 = this.f700c;
                            } else {
/* 296 */                       appCompatTextView2 = this.f698b;
                            }
/* 302 */                   layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
/* 308 */                   layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
/* 310 */                   i5 = measuredHeight;
/* 335 */                   z2 = (!zM414t && this.f698b.getMeasuredWidth() > 0) || (zM414t2 && this.f700c.getMeasuredWidth() > 0);
/* 339 */                   i6 = this.f713k0 & 112;
/* 341 */                   i7 = iMax;
/* 345 */                   if (i6 == 48) {
/* 413 */                       paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
                            } else if (i6 != 80) {
/* 356 */                       iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
/* 364 */                       i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
/* 366 */                       if (iMax2 < i14) {
/* 368 */                           iMax2 = i14;
                                } else {
/* 374 */                           i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
/* 375 */                           i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 377 */                           i17 = this.f708g0;
/* 380 */                           if (i15 < i16 + i17) {
/* 388 */                               iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                                    }
                                }
/* 392 */                       paddingTop = paddingTop2 + iMax2;
                            } else {
/* 401 */                       paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f708g0) - i5;
                            }
/* 415 */                   if (z3) {
/* 417 */                       if (z2) {
/* 419 */                           i11 = this.f703d0;
                                } else {
/* 422 */                           i11 = 0;
                                }
/* 425 */                       int i27 = i11 - iArr[1];
/* 431 */                       iMin -= Math.max(0, i27);
/* 437 */                       iArr[1] = Math.max(0, -i27);
/* 439 */                       if (zM414t) {
/* 447 */                           LayoutParams layoutParams5 = (LayoutParams) this.f698b.getLayoutParams();
/* 455 */                           int measuredWidth2 = iMin - this.f698b.getMeasuredWidth();
/* 463 */                           int measuredHeight2 = this.f698b.getMeasuredHeight() + paddingTop;
/* 466 */                           this.f698b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
/* 471 */                           i12 = measuredWidth2 - this.f705e0;
/* 474 */                           paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                                } else {
/* 477 */                           i12 = iMin;
                                }
/* 478 */                       if (zM414t2) {
/* 490 */                           int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 508 */                           this.f700c.layout(iMin - this.f700c.getMeasuredWidth(), i28, iMin, this.f700c.getMeasuredHeight() + i28);
/* 513 */                           i13 = iMin - this.f705e0;
                                } else {
/* 516 */                           i13 = iMin;
                                }
/* 517 */                       if (z2) {
/* 519 */                           iMin = Math.min(i12, i13);
                                }
/* 524 */                       iMax = i7;
                            } else {
/* 527 */                       if (z2) {
/* 529 */                           i8 = this.f703d0;
                                } else {
/* 533 */                           i8 = 0;
                                }
/* 537 */                       int i29 = i8 - iArr[0];
/* 542 */                       iMax = Math.max(0, i29) + i7;
/* 549 */                       iArr[0] = Math.max(0, -i29);
/* 551 */                       if (zM414t) {
/* 559 */                           LayoutParams layoutParams6 = (LayoutParams) this.f698b.getLayoutParams();
/* 567 */                           int measuredWidth3 = this.f698b.getMeasuredWidth() + iMax;
/* 574 */                           int measuredHeight3 = this.f698b.getMeasuredHeight() + paddingTop;
/* 577 */                           this.f698b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
/* 582 */                           i9 = measuredWidth3 + this.f705e0;
/* 585 */                           paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                                } else {
/* 588 */                           i9 = iMax;
                                }
/* 589 */                       if (zM414t2) {
/* 601 */                           int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 608 */                           int measuredWidth4 = this.f700c.getMeasuredWidth() + iMax;
/* 618 */                           this.f700c.layout(iMax, i30, measuredWidth4, this.f700c.getMeasuredHeight() + i30);
/* 623 */                           i10 = measuredWidth4 + this.f705e0;
                                } else {
/* 625 */                           i10 = iMax;
                                }
/* 626 */                       if (z2) {
/* 628 */                           iMax = Math.max(i9, i10);
                                }
                            }
                        }
/* 633 */               arrayList = this.f720r0;
/* 635 */               m399a(3, arrayList);
/* 638 */               size = arrayList.size();
/* 642 */               iM410p2 = iMax;
/* 644 */               for (i18 = 0; i18 < size; i18++) {
/* 652 */                   iM410p2 = m410p((View) arrayList.get(i18), iM410p2, iMin2, iArr);
                        }
/* 660 */               m399a(5, arrayList);
/* 663 */               size2 = arrayList.size();
/* 668 */               for (i19 = 0; i19 < size2; i19++) {
/* 676 */                   iMin = m411q((View) arrayList.get(i19), iMin, iMin2, iArr);
                        }
/* 685 */               m399a(1, arrayList);
/* 689 */               int i31 = iArr[0];
/* 691 */               i20 = iArr[1];
/* 693 */               size3 = arrayList.size();
/* 697 */               i21 = i31;
/* 698 */               i22 = 0;
/* 699 */               measuredWidth = 0;
/* 700 */               while (i22 < size3) {
/* 706 */                   View view2 = (View) arrayList.get(i22);
/* 712 */                   LayoutParams layoutParams7 = (LayoutParams) view2.getLayoutParams();
/* 714 */                   int i32 = i20;
/* 718 */                   int i33 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i21;
/* 721 */                   int i34 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i32;
/* 724 */                   int iMax3 = Math.max(0, i33);
/* 728 */                   int iMax4 = Math.max(0, i34);
/* 733 */                   int iMax5 = Math.max(0, -i33);
/* 738 */                   int iMax6 = Math.max(0, -i34);
/* 750 */                   measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
/* 751 */                   i22++;
/* 755 */                   i21 = iMax5;
/* 756 */                   i20 = iMax6;
                        }
/* 767 */               i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
/* 768 */               i25 = measuredWidth + i24;
/* 769 */               if (i24 >= iM410p2) {
/* 772 */                   if (i25 > iMin) {
/* 775 */                       iM410p2 = i24 - (i25 - iMin);
                            } else {
/* 778 */                       iM410p2 = i24;
                            }
                        }
/* 779 */               size4 = arrayList.size();
/* 783 */               for (i23 = 0; i23 < size4; i23++) {
/* 791 */                   iM410p2 = m410p((View) arrayList.get(i23), iM410p2, iMin2, iArr);
                        }
/* 798 */               arrayList.clear();
                    }
/* 87 */            iM410p = paddingLeft;
/* 85 */            iM411q = i26;
/* 95 */            if (m414t(this.f724v)) {
/* 97 */                appCompatImageButton = this.f724v;
/* 99 */                if (z3) {
/* 101 */                   iM411q = m411q(appCompatImageButton, iM411q, iMin2, iArr);
                        } else {
/* 106 */                   iM410p = m410p(appCompatImageButton, iM410p, iMin2, iArr);
                        }
                    }
/* 116 */           if (m414t(this.f696a)) {
/* 118 */               actionMenuView = this.f696a;
/* 120 */               if (z3) {
/* 122 */                   iM410p = m410p(actionMenuView, iM410p, iMin2, iArr);
                        } else {
/* 127 */                   iM411q = m411q(actionMenuView, iM411q, iMin2, iArr);
                        }
                    }
/* 131 */           int currentContentInsetLeft2 = getCurrentContentInsetLeft();
/* 135 */           int currentContentInsetRight2 = getCurrentContentInsetRight();
/* 147 */           iArr[0] = Math.max(0, currentContentInsetLeft2 - iM410p);
/* 157 */           iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM411q));
/* 159 */           iMax = Math.max(iM410p, currentContentInsetLeft2);
/* 165 */           iMin = Math.min(iM411q, i26 - currentContentInsetRight2);
/* 175 */           if (m414t(this.f726w)) {
/* 177 */               view = this.f726w;
/* 179 */               if (z3) {
/* 181 */                   iMin = m411q(view, iMin, iMin2, iArr);
                        } else {
/* 186 */                   iMax = m410p(view, iMax, iMin2, iArr);
                        }
                    }
/* 196 */           if (m414t(this.f704e)) {
/* 198 */               appCompatImageView = this.f704e;
/* 200 */               if (z3) {
/* 202 */                   iMin = m411q(appCompatImageView, iMin, iMin2, iArr);
                        } else {
/* 207 */                   iMax = m410p(appCompatImageView, iMax, iMin2, iArr);
                        }
                    }
/* 213 */           zM414t = m414t(this.f698b);
/* 219 */           zM414t2 = m414t(this.f700c);
/* 223 */           if (zM414t) {
/* 231 */               LayoutParams layoutParams8 = (LayoutParams) this.f698b.getLayoutParams();
/* 246 */               measuredHeight = this.f698b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
                    } else {
/* 250 */               measuredHeight = 0;
                    }
/* 251 */           if (zM414t2) {
/* 259 */               LayoutParams layoutParams9 = (LayoutParams) this.f700c.getLayoutParams();
/* 275 */               measuredHeight = this.f700c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin + measuredHeight;
                    }
/* 280 */           if (zM414t) {
/* 284 */               if (zM414t) {
/* 286 */                   appCompatTextView = this.f698b;
                        } else {
/* 289 */                   appCompatTextView = this.f700c;
                        }
/* 291 */               if (zM414t2) {
/* 293 */                   appCompatTextView2 = this.f700c;
                        } else {
/* 296 */                   appCompatTextView2 = this.f698b;
                        }
/* 302 */               layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
/* 308 */               layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
/* 310 */               i5 = measuredHeight;
/* 335 */               if (zM414t) {
                        }
/* 339 */               i6 = this.f713k0 & 112;
/* 341 */               i7 = iMax;
/* 345 */               if (i6 == 48) {
/* 413 */                   paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
                        } else if (i6 != 80) {
/* 356 */                   iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
/* 364 */                   i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
/* 366 */                   if (iMax2 < i14) {
/* 368 */                       iMax2 = i14;
                            } else {
/* 374 */                       i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
/* 375 */                       i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 377 */                       i17 = this.f708g0;
/* 380 */                       if (i15 < i16 + i17) {
/* 388 */                           iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                                }
                            }
/* 392 */                   paddingTop = paddingTop2 + iMax2;
                        } else {
/* 401 */                   paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f708g0) - i5;
                        }
/* 415 */               if (z3) {
/* 417 */                   if (z2) {
/* 419 */                       i11 = this.f703d0;
                            } else {
/* 422 */                       i11 = 0;
                            }
/* 425 */                   int i210 = i11 - iArr[1];
/* 431 */                   iMin -= Math.max(0, i210);
/* 437 */                   iArr[1] = Math.max(0, -i210);
/* 439 */                   if (zM414t) {
/* 447 */                       LayoutParams layoutParams10 = (LayoutParams) this.f698b.getLayoutParams();
/* 455 */                       int measuredWidth5 = iMin - this.f698b.getMeasuredWidth();
/* 463 */                       int measuredHeight4 = this.f698b.getMeasuredHeight() + paddingTop;
/* 466 */                       this.f698b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
/* 471 */                       i12 = measuredWidth5 - this.f705e0;
/* 474 */                       paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                            } else {
/* 477 */                       i12 = iMin;
                            }
/* 478 */                   if (zM414t2) {
/* 490 */                       int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 508 */                       this.f700c.layout(iMin - this.f700c.getMeasuredWidth(), i211, iMin, this.f700c.getMeasuredHeight() + i211);
/* 513 */                       i13 = iMin - this.f705e0;
                            } else {
/* 516 */                       i13 = iMin;
                            }
/* 517 */                   if (z2) {
/* 519 */                       iMin = Math.min(i12, i13);
                            }
/* 524 */                   iMax = i7;
                        } else {
/* 527 */                   if (z2) {
/* 529 */                       i8 = this.f703d0;
                            } else {
/* 533 */                       i8 = 0;
                            }
/* 537 */                   int i212 = i8 - iArr[0];
/* 542 */                   iMax = Math.max(0, i212) + i7;
/* 549 */                   iArr[0] = Math.max(0, -i212);
/* 551 */                   if (zM414t) {
/* 559 */                       LayoutParams layoutParams11 = (LayoutParams) this.f698b.getLayoutParams();
/* 567 */                       int measuredWidth6 = this.f698b.getMeasuredWidth() + iMax;
/* 574 */                       int measuredHeight5 = this.f698b.getMeasuredHeight() + paddingTop;
/* 577 */                       this.f698b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
/* 582 */                       i9 = measuredWidth6 + this.f705e0;
/* 585 */                       paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                            } else {
/* 588 */                       i9 = iMax;
                            }
/* 589 */                   if (zM414t2) {
/* 601 */                       int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 608 */                       int measuredWidth7 = this.f700c.getMeasuredWidth() + iMax;
/* 618 */                       this.f700c.layout(iMax, i35, measuredWidth7, this.f700c.getMeasuredHeight() + i35);
/* 623 */                       i10 = measuredWidth7 + this.f705e0;
                            } else {
/* 625 */                       i10 = iMax;
                            }
/* 626 */                   if (z2) {
/* 628 */                       iMax = Math.max(i9, i10);
                            }
                        }
                    } else {
/* 284 */               if (zM414t) {
/* 286 */                   appCompatTextView = this.f698b;
                        } else {
/* 289 */                   appCompatTextView = this.f700c;
                        }
/* 291 */               if (zM414t2) {
/* 293 */                   appCompatTextView2 = this.f700c;
                        } else {
/* 296 */                   appCompatTextView2 = this.f698b;
                        }
/* 302 */               layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
/* 308 */               layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
/* 310 */               i5 = measuredHeight;
/* 335 */               if (zM414t) {
                        }
/* 339 */               i6 = this.f713k0 & 112;
/* 341 */               i7 = iMax;
/* 345 */               if (i6 == 48) {
/* 413 */                   paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
                        } else if (i6 != 80) {
/* 356 */                   iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
/* 364 */                   i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f707f0;
/* 366 */                   if (iMax2 < i14) {
/* 368 */                       iMax2 = i14;
                            } else {
/* 374 */                       i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
/* 375 */                       i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 377 */                       i17 = this.f708g0;
/* 380 */                       if (i15 < i16 + i17) {
/* 388 */                           iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                                }
                            }
/* 392 */                   paddingTop = paddingTop2 + iMax2;
                        } else {
/* 401 */                   paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f708g0) - i5;
                        }
/* 415 */               if (z3) {
/* 417 */                   if (z2) {
/* 419 */                       i11 = this.f703d0;
                            } else {
/* 422 */                       i11 = 0;
                            }
/* 425 */                   int i213 = i11 - iArr[1];
/* 431 */                   iMin -= Math.max(0, i213);
/* 437 */                   iArr[1] = Math.max(0, -i213);
/* 439 */                   if (zM414t) {
/* 447 */                       LayoutParams layoutParams12 = (LayoutParams) this.f698b.getLayoutParams();
/* 455 */                       int measuredWidth8 = iMin - this.f698b.getMeasuredWidth();
/* 463 */                       int measuredHeight6 = this.f698b.getMeasuredHeight() + paddingTop;
/* 466 */                       this.f698b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
/* 471 */                       i12 = measuredWidth8 - this.f705e0;
/* 474 */                       paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                            } else {
/* 477 */                       i12 = iMin;
                            }
/* 478 */                   if (zM414t2) {
/* 490 */                       int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 508 */                       this.f700c.layout(iMin - this.f700c.getMeasuredWidth(), i214, iMin, this.f700c.getMeasuredHeight() + i214);
/* 513 */                       i13 = iMin - this.f705e0;
                            } else {
/* 516 */                       i13 = iMin;
                            }
/* 517 */                   if (z2) {
/* 519 */                       iMin = Math.min(i12, i13);
                            }
/* 524 */                   iMax = i7;
                        } else {
/* 527 */                   if (z2) {
/* 529 */                       i8 = this.f703d0;
                            } else {
/* 533 */                       i8 = 0;
                            }
/* 537 */                   int i215 = i8 - iArr[0];
/* 542 */                   iMax = Math.max(0, i215) + i7;
/* 549 */                   iArr[0] = Math.max(0, -i215);
/* 551 */                   if (zM414t) {
/* 559 */                       LayoutParams layoutParams13 = (LayoutParams) this.f698b.getLayoutParams();
/* 567 */                       int measuredWidth9 = this.f698b.getMeasuredWidth() + iMax;
/* 574 */                       int measuredHeight7 = this.f698b.getMeasuredHeight() + paddingTop;
/* 577 */                       this.f698b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
/* 582 */                       i9 = measuredWidth9 + this.f705e0;
/* 585 */                       paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                            } else {
/* 588 */                       i9 = iMax;
                            }
/* 589 */                   if (zM414t2) {
/* 601 */                       int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f700c.getLayoutParams())).topMargin;
/* 608 */                       int measuredWidth10 = this.f700c.getMeasuredWidth() + iMax;
/* 618 */                       this.f700c.layout(iMax, i36, measuredWidth10, this.f700c.getMeasuredHeight() + i36);
/* 623 */                       i10 = measuredWidth10 + this.f705e0;
                            } else {
/* 625 */                       i10 = iMax;
                            }
/* 626 */                   if (z2) {
/* 628 */                       iMax = Math.max(i9, i10);
                            }
                        }
                    }
/* 633 */           arrayList = this.f720r0;
/* 635 */           m399a(3, arrayList);
/* 638 */           size = arrayList.size();
/* 642 */           iM410p2 = iMax;
/* 644 */           while (i18 < size) {
/* 652 */               iM410p2 = m410p((View) arrayList.get(i18), iM410p2, iMin2, iArr);
                    }
/* 660 */           m399a(5, arrayList);
/* 663 */           size2 = arrayList.size();
/* 668 */           while (i19 < size2) {
/* 676 */               iMin = m411q((View) arrayList.get(i19), iMin, iMin2, iArr);
                    }
/* 685 */           m399a(1, arrayList);
/* 689 */           int i37 = iArr[0];
/* 691 */           i20 = iArr[1];
/* 693 */           size3 = arrayList.size();
/* 697 */           i21 = i37;
/* 698 */           i22 = 0;
/* 699 */           measuredWidth = 0;
/* 700 */           while (i22 < size3) {
/* 706 */               View view3 = (View) arrayList.get(i22);
/* 712 */               LayoutParams layoutParams14 = (LayoutParams) view3.getLayoutParams();
/* 714 */               int i38 = i20;
/* 718 */               int i39 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i21;
/* 721 */               int i310 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i38;
/* 724 */               int iMax7 = Math.max(0, i39);
/* 728 */               int iMax8 = Math.max(0, i310);
/* 733 */               int iMax9 = Math.max(0, -i39);
/* 738 */               int iMax10 = Math.max(0, -i310);
/* 750 */               measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
/* 751 */               i22++;
/* 755 */               i21 = iMax9;
/* 756 */               i20 = iMax10;
                    }
/* 767 */           i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
/* 768 */           i25 = measuredWidth + i24;
/* 769 */           if (i24 >= iM410p2) {
/* 772 */               if (i25 > iMin) {
/* 775 */                   iM410p2 = i24 - (i25 - iMin);
                        } else {
/* 778 */                   iM410p2 = i24;
                        }
                    }
/* 779 */           size4 = arrayList.size();
/* 783 */           while (i23 < size4) {
/* 791 */               iM410p2 = m410p((View) arrayList.get(i23), iM410p2, iMin2, iArr);
                    }
/* 798 */           arrayList.clear();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    char c;
                    Object[] objArr;
                    int iM397k;
                    int iMax;
                    int iCombineMeasuredStates;
                    int iM397k2;
                    int iM398l;
                    int iCombineMeasuredStates2;
                    int iMax2;
/* 1 */             boolean z = m53.f13568a;
/* 7 */             int i3 = 0;
/* 9 */             if (getLayoutDirection() == 1) {
/* 11 */                objArr = true;
/* 12 */                c = 0;
                    } else {
/* 14 */                c = 1;
/* 15 */                objArr = false;
                    }
/* 23 */            if (m414t(this.f702d)) {
/* 33 */                m413s(this.f702d, i, 0, i2, this.f701c0);
/* 48 */                iM397k = m397k(this.f702d) + this.f702d.getMeasuredWidth();
/* 62 */                iMax = Math.max(0, m398l(this.f702d) + this.f702d.getMeasuredHeight());
/* 72 */                iCombineMeasuredStates = View.combineMeasuredStates(0, this.f702d.getMeasuredState());
                    } else {
/* 79 */                iM397k = 0;
/* 80 */                iMax = 0;
/* 81 */                iCombineMeasuredStates = 0;
                    }
/* 88 */            if (m414t(this.f724v)) {
/* 98 */                m413s(this.f724v, i, 0, i2, this.f701c0);
/* 113 */               iM397k = m397k(this.f724v) + this.f724v.getMeasuredWidth();
/* 127 */               iMax = Math.max(iMax, m398l(this.f724v) + this.f724v.getMeasuredHeight());
/* 137 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f724v.getMeasuredState());
                    }
/* 141 */           int currentContentInsetStart = getCurrentContentInsetStart();
/* 145 */           int iMax3 = Math.max(currentContentInsetStart, iM397k);
/* 150 */           int iMax4 = Math.max(0, currentContentInsetStart - iM397k);
/* 154 */           Object[] objArr2 = objArr;
/* 155 */           int[] iArr = this.f722t0;
/* 157 */           iArr[objArr2 == true ? 1 : 0] = iMax4;
/* 165 */           if (m414t(this.f696a)) {
/* 175 */               m413s(this.f696a, i, iMax3, i2, this.f701c0);
/* 190 */               iM397k2 = m397k(this.f696a) + this.f696a.getMeasuredWidth();
/* 204 */               iMax = Math.max(iMax, m398l(this.f696a) + this.f696a.getMeasuredHeight());
/* 214 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f696a.getMeasuredState());
                    } else {
/* 219 */               iM397k2 = 0;
                    }
/* 220 */           int currentContentInsetEnd = getCurrentContentInsetEnd();
/* 228 */           int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM397k2);
/* 234 */           iArr[c] = Math.max(0, currentContentInsetEnd - iM397k2);
/* 242 */           if (m414t(this.f726w)) {
/* 255 */               iMax5 += m412r(this.f726w, i, iMax5, i2, 0, iArr);
/* 269 */               iMax = Math.max(iMax, m398l(this.f726w) + this.f726w.getMeasuredHeight());
/* 279 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f726w.getMeasuredState());
                    }
/* 289 */           if (m414t(this.f704e)) {
/* 302 */               iMax5 += m412r(this.f704e, i, iMax5, i2, 0, iArr);
/* 316 */               iMax = Math.max(iMax, m398l(this.f704e) + this.f704e.getMeasuredHeight());
/* 326 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f704e.getMeasuredState());
                    }
/* 330 */           int childCount = getChildCount();
/* 335 */           for (int i4 = 0; i4 < childCount; i4++) {
/* 337 */               View childAt = getChildAt(i4);
/* 349 */               if (((LayoutParams) childAt.getLayoutParams()).f731b == 0 && m414t(childAt)) {
/* 369 */                   iMax5 += m412r(childAt, i, iMax5, i2, 0, iArr);
/* 380 */                   int iMax6 = Math.max(iMax, m398l(childAt) + childAt.getMeasuredHeight());
/* 388 */                   iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
/* 393 */                   iMax = iMax6;
                        } else {
/* 395 */                   iMax5 = iMax5;
                        }
                    }
/* 399 */           int i5 = iMax5;
/* 404 */           int i6 = this.f707f0 + this.f708g0;
/* 410 */           int i7 = this.f703d0 + this.f705e0;
/* 418 */           if (m414t(this.f698b)) {
/* 428 */               m412r(this.f698b, i, i5 + i7, i2, i6, iArr);
/* 443 */               int iM397k3 = m397k(this.f698b) + this.f698b.getMeasuredWidth();
/* 456 */               iM398l = m398l(this.f698b) + this.f698b.getMeasuredHeight();
/* 463 */               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f698b.getMeasuredState());
/* 469 */               iMax2 = iM397k3;
                    } else {
/* 471 */               iM398l = 0;
/* 472 */               iCombineMeasuredStates2 = iCombineMeasuredStates;
/* 473 */               iMax2 = 0;
                    }
/* 480 */           if (m414t(this.f700c)) {
/* 495 */               iMax2 = Math.max(iMax2, m412r(this.f700c, i, i5 + i7, i2, i6 + iM398l, iArr));
/* 512 */               iM398l += m398l(this.f700c) + this.f700c.getMeasuredHeight();
/* 519 */               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f700c.getMeasuredState());
                    }
/* 525 */           int iMax7 = Math.max(iMax, iM398l);
/* 538 */           int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
/* 548 */           int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
/* 560 */           int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
/* 576 */           int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
/* 582 */           if (!this.f688D0) {
/* 614 */               i3 = iResolveSizeAndState2;
                        break;
                    }
/* 585 */           int childCount2 = getChildCount();
/* 590 */           for (int i8 = 0; i8 < childCount2; i8++) {
/* 592 */               View childAt2 = getChildAt(i8);
/* 600 */               if (m414t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
/* 614 */                   i3 = iResolveSizeAndState2;
                            break;
                        }
                    }
/* 619 */           setMeasuredDimension(iResolveSizeAndState, i3);
                }

                @Override // android.view.View
                public void onRestoreInstanceState(Parcelable parcelable) {
                    MenuItem menuItemFindItem;
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 16 */            ActionMenuView actionMenuView = this.f696a;
/* 23 */            jg1 jg1Var = actionMenuView != null ? actionMenuView.f457d0 : null;
/* 24 */            int i = savedState.f732c;
/* 26 */            if (i != 0 && this.f685A0 != null && jg1Var != null && (menuItemFindItem = jg1Var.findItem(i)) != null) {
/* 40 */                menuItemFindItem.expandActionView();
                    }
/* 45 */            if (savedState.f733d) {
/* 47 */                RunnableC2495ye runnableC2495ye = this.f692H0;
/* 49 */                removeCallbacks(runnableC2495ye);
/* 52 */                post(runnableC2495ye);
                    }
                }

                @Override // android.view.View
                public final void onRtlPropertiesChanged(int i) {
/* 1 */             super.onRtlPropertiesChanged(i);
/* 4 */             m402d();
/* 7 */             i52 i52Var = this.f709h0;
/* 10 */            boolean z = i == 1;
/* 16 */            if (z == i52Var.f9458g) {
/* 18 */                return;
                    }
/* 19 */            i52Var.f9458g = z;
/* 23 */            if (!i52Var.f9459h) {
/* 69 */                i52Var.f9452a = i52Var.f9456e;
/* 73 */                i52Var.f9453b = i52Var.f9457f;
/* 75 */                return;
                    }
/* 27 */            if (z) {
/* 29 */                int i2 = i52Var.f9455d;
/* 31 */                if (i2 == Integer.MIN_VALUE) {
/* 34 */                    i2 = i52Var.f9456e;
                        }
/* 36 */                i52Var.f9452a = i2;
/* 38 */                int i3 = i52Var.f9454c;
/* 40 */                if (i3 == Integer.MIN_VALUE) {
/* 43 */                    i3 = i52Var.f9457f;
                        }
/* 45 */                i52Var.f9453b = i3;
/* 47 */                return;
                    }
/* 48 */            int i4 = i52Var.f9454c;
/* 50 */            if (i4 == Integer.MIN_VALUE) {
/* 53 */                i4 = i52Var.f9456e;
                    }
/* 55 */            i52Var.f9452a = i4;
/* 57 */            int i5 = i52Var.f9455d;
/* 59 */            if (i5 == Integer.MIN_VALUE) {
/* 62 */                i5 = i52Var.f9457f;
                    }
/* 64 */            i52Var.f9453b = i5;
                }

                @Override // android.view.View
                public Parcelable onSaveInstanceState() {
                    sg1 sg1Var;
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 10 */            C0071k c0071k = this.f685A0;
/* 12 */            if (c0071k != null && (sg1Var = c0071k.f760b) != null) {
/* 20 */                savedState.f732c = sg1Var.f16583a;
                    }
/* 26 */            savedState.f733d = m409o();
/* 28 */            return savedState;
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 0) {
/* 8 */                 this.f718p0 = false;
                    }
/* 13 */            if (!this.f718p0) {
/* 15 */                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 19 */                if (actionMasked == 0 && !zOnTouchEvent) {
/* 23 */                    this.f718p0 = true;
                        }
                    }
/* 25 */            if (actionMasked != 1 && actionMasked != 3) {
/* 12 */                return true;
                    }
/* 32 */            this.f718p0 = false;
/* 12 */            return true;
                }

                /* JADX INFO: renamed from: p */
                public final int m410p(View view, int i, int i2, int[] iArr) {
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 12 */            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
/* 17 */            int iMax = Math.max(0, i3) + i;
/* 23 */            iArr[0] = Math.max(0, -i3);
/* 25 */            int iM406j = m406j(i2, view);
/* 29 */            int measuredWidth = view.getMeasuredWidth();
/* 40 */            view.layout(iMax, iM406j, iMax + measuredWidth, view.getMeasuredHeight() + iM406j);
/* 46 */            return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
                }

                /* JADX INFO: renamed from: q */
                public final int m411q(View view, int i, int i2, int[] iArr) {
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 12 */            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
/* 18 */            int iMax = i - Math.max(0, i3);
/* 24 */            iArr[1] = Math.max(0, -i3);
/* 26 */            int iM406j = m406j(i2, view);
/* 30 */            int measuredWidth = view.getMeasuredWidth();
/* 41 */            view.layout(iMax - measuredWidth, iM406j, iMax, view.getMeasuredHeight() + iM406j);
/* 47 */            return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                }

                /* JADX INFO: renamed from: r */
                public final int m412r(View view, int i, int i2, int i3, int i4, int[] iArr) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 12 */            int i5 = marginLayoutParams.leftMargin - iArr[0];
/* 18 */            int i6 = marginLayoutParams.rightMargin - iArr[1];
/* 27 */            int iMax = Math.max(0, i6) + Math.max(0, i5);
/* 33 */            iArr[0] = Math.max(0, -i5);
/* 40 */            iArr[1] = Math.max(0, -i6);
/* 81 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
/* 88 */            return view.getMeasuredWidth() + iMax;
                }

                @Override // p000.lg1
                public final void removeMenuProvider(fh1 fh1Var) {
/* 3 */             this.f723u0.m7416b(fh1Var);
                }

                /* JADX INFO: renamed from: s */
                public final void m413s(View view, int i, int i2, int i3, int i4) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 25 */            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
/* 46 */            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
/* 50 */            int mode = View.MeasureSpec.getMode(childMeasureSpec2);
/* 56 */            if (mode != 1073741824 && i4 >= 0) {
/* 60 */                if (mode != 0) {
/* 66 */                    i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
                        }
/* 70 */                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
/* 74 */            view.measure(childMeasureSpec, childMeasureSpec2);
                }

                public void setBackInvokedCallbackEnabled(boolean z) {
/* 3 */             if (this.f691G0 != z) {
/* 5 */                 this.f691G0 = z;
/* 7 */                 m416v();
                    }
                }

                public void setCollapseContentDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence)) {
/* 7 */                 m401c();
                    }
/* 10 */            AppCompatImageButton appCompatImageButton = this.f724v;
/* 12 */            if (appCompatImageButton != null) {
/* 14 */                appCompatImageButton.setContentDescription(charSequence);
                    }
                }

                public void setCollapseIcon(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 3 */                 m401c();
/* 8 */                 this.f724v.setImageDrawable(drawable);
                    } else {
/* 12 */                AppCompatImageButton appCompatImageButton = this.f724v;
/* 14 */                if (appCompatImageButton != null) {
/* 18 */                    appCompatImageButton.setImageDrawable(this.f706f);
                        }
                    }
                }

                public void setCollapsible(boolean z) {
/* 1 */             this.f688D0 = z;
/* 3 */             requestLayout();
                }

                public void setContentInsetEndWithActions(int i) {
/* 1 */             if (i < 0) {
/* 3 */                 i = Integer.MIN_VALUE;
                    }
/* 7 */             if (i != this.f712j0) {
/* 9 */                 this.f712j0 = i;
/* 15 */                if (getNavigationIcon() != null) {
/* 17 */                    requestLayout();
                        }
                    }
                }

                public void setContentInsetStartWithNavigation(int i) {
/* 1 */             if (i < 0) {
/* 3 */                 i = Integer.MIN_VALUE;
                    }
/* 7 */             if (i != this.f711i0) {
/* 9 */                 this.f711i0 = i;
/* 15 */                if (getNavigationIcon() != null) {
/* 17 */                    requestLayout();
                        }
                    }
                }

                public void setLogo(Drawable drawable) {
/* 1 */             AppCompatImageView appCompatImageView = this.f704e;
/* 3 */             if (drawable != null) {
/* 5 */                 if (appCompatImageView == null) {
/* 16 */                    this.f704e = new AppCompatImageView(getContext());
                        }
/* 24 */                if (!m408n(this.f704e)) {
/* 29 */                    m400b(this.f704e, true);
                        }
                    } else if (appCompatImageView != null && m408n(appCompatImageView)) {
/* 43 */                removeView(this.f704e);
/* 50 */                this.f721s0.remove(this.f704e);
                    }
/* 53 */            AppCompatImageView appCompatImageView2 = this.f704e;
/* 55 */            if (appCompatImageView2 != null) {
/* 57 */                appCompatImageView2.setImageDrawable(drawable);
                    }
                }

                public void setLogoDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence) && this.f704e == null) {
/* 20 */                this.f704e = new AppCompatImageView(getContext());
                    }
/* 22 */            AppCompatImageView appCompatImageView = this.f704e;
/* 24 */            if (appCompatImageView != null) {
/* 26 */                appCompatImageView.setContentDescription(charSequence);
                    }
                }

                public void setNavigationContentDescription(CharSequence charSequence) {
/* 5 */             if (!TextUtils.isEmpty(charSequence)) {
/* 7 */                 m405g();
                    }
/* 10 */            AppCompatImageButton appCompatImageButton = this.f702d;
/* 12 */            if (appCompatImageButton != null) {
/* 14 */                appCompatImageButton.setContentDescription(charSequence);
/* 19 */                i13.m4420B(this.f702d, charSequence);
                    }
                }

                public void setNavigationIcon(Drawable drawable) {
/* 1 */             if (drawable != null) {
/* 3 */                 m405g();
/* 12 */                if (!m408n(this.f702d)) {
/* 17 */                    m400b(this.f702d, true);
                        }
                    } else {
/* 21 */                AppCompatImageButton appCompatImageButton = this.f702d;
/* 23 */                if (appCompatImageButton != null && m408n(appCompatImageButton)) {
/* 33 */                    removeView(this.f702d);
/* 40 */                    this.f721s0.remove(this.f702d);
                        }
                    }
/* 43 */            AppCompatImageButton appCompatImageButton2 = this.f702d;
/* 45 */            if (appCompatImageButton2 != null) {
/* 47 */                appCompatImageButton2.setImageDrawable(drawable);
                    }
                }

                public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             m405g();
/* 6 */             this.f702d.setOnClickListener(onClickListener);
                }

                public void setOnMenuItemClickListener(wp2 wp2Var) {
/* 1 */             this.f727w0 = wp2Var;
                }

                public void setOverflowIcon(Drawable drawable) {
/* 1 */             m403e();
/* 6 */             this.f696a.setOverflowIcon(drawable);
                }

                public void setPopupTheme(int i) {
/* 3 */             if (this.f694V != i) {
/* 5 */                 this.f694V = i;
/* 7 */                 if (i == 0) {
/* 13 */                    this.f693U = getContext();
                        } else {
/* 25 */                    this.f693U = new ContextThemeWrapper(getContext(), i);
                        }
                    }
                }

                public void setSubtitle(CharSequence charSequence) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 5 */             AppCompatTextView appCompatTextView = this.f700c;
/* 7 */             if (!zIsEmpty) {
/* 9 */                 if (appCompatTextView == null) {
/* 11 */                    Context context = getContext();
/* 18 */                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
/* 21 */                    this.f700c = appCompatTextView2;
/* 23 */                    appCompatTextView2.setSingleLine();
/* 30 */                    this.f700c.setEllipsize(TextUtils.TruncateAt.END);
/* 33 */                    int i = this.f697a0;
/* 35 */                    if (i != 0) {
/* 39 */                        this.f700c.setTextAppearance(context, i);
                            }
/* 42 */                    ColorStateList colorStateList = this.f717o0;
/* 44 */                    if (colorStateList != null) {
/* 48 */                        this.f700c.setTextColor(colorStateList);
                            }
                        }
/* 57 */                if (!m408n(this.f700c)) {
/* 62 */                    m400b(this.f700c, true);
                        }
                    } else if (appCompatTextView != null && m408n(appCompatTextView)) {
/* 76 */                removeView(this.f700c);
/* 83 */                this.f721s0.remove(this.f700c);
                    }
/* 86 */            AppCompatTextView appCompatTextView3 = this.f700c;
/* 88 */            if (appCompatTextView3 != null) {
/* 90 */                appCompatTextView3.setText(charSequence);
                    }
/* 93 */            this.f715m0 = charSequence;
                }

                public void setSubtitleTextColor(ColorStateList colorStateList) {
/* 1 */             this.f717o0 = colorStateList;
/* 3 */             AppCompatTextView appCompatTextView = this.f700c;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 appCompatTextView.setTextColor(colorStateList);
                    }
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 5 */             AppCompatTextView appCompatTextView = this.f698b;
/* 7 */             if (!zIsEmpty) {
/* 9 */                 if (appCompatTextView == null) {
/* 11 */                    Context context = getContext();
/* 18 */                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
/* 21 */                    this.f698b = appCompatTextView2;
/* 23 */                    appCompatTextView2.setSingleLine();
/* 30 */                    this.f698b.setEllipsize(TextUtils.TruncateAt.END);
/* 33 */                    int i = this.f695W;
/* 35 */                    if (i != 0) {
/* 39 */                        this.f698b.setTextAppearance(context, i);
                            }
/* 42 */                    ColorStateList colorStateList = this.f716n0;
/* 44 */                    if (colorStateList != null) {
/* 48 */                        this.f698b.setTextColor(colorStateList);
                            }
                        }
/* 57 */                if (!m408n(this.f698b)) {
/* 62 */                    m400b(this.f698b, true);
                        }
                    } else if (appCompatTextView != null && m408n(appCompatTextView)) {
/* 76 */                removeView(this.f698b);
/* 83 */                this.f721s0.remove(this.f698b);
                    }
/* 86 */            AppCompatTextView appCompatTextView3 = this.f698b;
/* 88 */            if (appCompatTextView3 != null) {
/* 90 */                appCompatTextView3.setText(charSequence);
                    }
/* 93 */            this.f714l0 = charSequence;
                }

                public void setTitleMarginBottom(int i) {
/* 1 */             this.f708g0 = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginEnd(int i) {
/* 1 */             this.f705e0 = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginStart(int i) {
/* 1 */             this.f703d0 = i;
/* 3 */             requestLayout();
                }

                public void setTitleMarginTop(int i) {
/* 1 */             this.f707f0 = i;
/* 3 */             requestLayout();
                }

                public void setTitleTextColor(ColorStateList colorStateList) {
/* 1 */             this.f716n0 = colorStateList;
/* 3 */             AppCompatTextView appCompatTextView = this.f698b;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 appCompatTextView.setTextColor(colorStateList);
                    }
                }

                /* JADX INFO: renamed from: t */
                public final boolean m414t(View view) {
                    return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
                }

                /* JADX INFO: renamed from: u */
                public final boolean m415u() {
                    C0062b c0062b;
/* 1 */             ActionMenuView actionMenuView = this.f696a;
                    return (actionMenuView == null || (c0062b = actionMenuView.f461h0) == null || !c0062b.m428n()) ? false : true;
                }

                /* JADX INFO: renamed from: v */
                public final void m416v() {
                    OnBackInvokedDispatcher onBackInvokedDispatcher;
/* 5 */             if (Build.VERSION.SDK_INT >= 33) {
/* 7 */                 OnBackInvokedDispatcher onBackInvokedDispatcherM9308a = vp2.m9308a(this);
/* 11 */                C0071k c0071k = this.f685A0;
/* 13 */                int i = 0;
/* 34 */                boolean z = (c0071k == null || c0071k.f760b == null || onBackInvokedDispatcherM9308a == null || !isAttachedToWindow() || !this.f691G0) ? false : true;
/* 35 */                if (z && this.f690F0 == null) {
/* 43 */                    if (this.f689E0 == null) {
/* 54 */                        this.f689E0 = vp2.m9309b(new up2(this, i));
                            }
/* 58 */                    vp2.m9310c(onBackInvokedDispatcherM9308a, this.f689E0);
/* 61 */                    this.f690F0 = onBackInvokedDispatcherM9308a;
/* 63 */                    return;
                        }
/* 64 */                if (z || (onBackInvokedDispatcher = this.f690F0) == null) {
/* 78 */                    return;
                        }
/* 72 */                vp2.m9311d(onBackInvokedDispatcher, this.f689E0);
/* 76 */                this.f690F0 = null;
                    }
                }

                @Override // android.view.ViewGroup
/* 10 */        public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return m396i(layoutParams);
                }

/* 10 */        public void setSubtitleTextColor(int i) {
/* 11 */            setSubtitleTextColor(ColorStateList.valueOf(i));
                }

/* 10 */        public void setTitleTextColor(int i) {
/* 11 */            setTitleTextColor(ColorStateList.valueOf(i));
                }

/* 17 */        public void setCollapseContentDescription(int i) {
/* 18 */            setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
                }

/* 21 */        public void setCollapseIcon(int i) {
/* 22 */            setCollapseIcon(mn0.m6700p(getContext(), i));
                }

/* 22 */        public void setNavigationContentDescription(int i) {
/* 23 */            setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
                }

/* 29 */        public void setLogoDescription(int i) {
/* 30 */            setLogoDescription(getContext().getText(i));
                }

/* 50 */        public void setNavigationIcon(int i) {
/* 51 */            setNavigationIcon(mn0.m6700p(getContext(), i));
                }

/* 60 */        public void setLogo(int i) {
/* 61 */            setLogo(mn0.m6700p(getContext(), i));
                }

/* 95 */        public void setSubtitle(int i) {
/* 96 */            setSubtitle(getContext().getText(i));
                }

/* 95 */        public void setTitle(int i) {
/* 96 */            setTitle(getContext().getText(i));
                }

/* 447 */       public Toolbar(Context context, AttributeSet attributeSet) {
/* 448 */           this(context, attributeSet, R$attr.toolbarStyle);
                }
            }
