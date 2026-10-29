            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$styleable;
            import p000.AbstractC1778j2;
            import p000.C0162b;
            import p000.C0829d2;
            import p000.ViewOnClickListenerC2239u1;
            import p000.e33;
            import p000.f42;
            import p000.hh1;
            import p000.jg1;
            import p000.m53;
            import p000.mn0;
            import p000.p43;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 114 */   public class ActionBarContextView extends ViewGroup {

                /* JADX INFO: renamed from: U */
                public CharSequence f405U;

                /* JADX INFO: renamed from: V */
                public View f406V;

                /* JADX INFO: renamed from: W */
                public View f407W;

                /* JADX INFO: renamed from: a */
                public final C0162b f408a;

                /* JADX INFO: renamed from: a0 */
                public View f409a0;

                /* JADX INFO: renamed from: b */
                public final Context f410b;

                /* JADX INFO: renamed from: b0 */
                public LinearLayout f411b0;

                /* JADX INFO: renamed from: c */
                public ActionMenuView f412c;

                /* JADX INFO: renamed from: c0 */
                public TextView f413c0;

                /* JADX INFO: renamed from: d */
                public C0062b f414d;

                /* JADX INFO: renamed from: d0 */
                public TextView f415d0;

                /* JADX INFO: renamed from: e */
                public int f416e;

                /* JADX INFO: renamed from: e0 */
                public final int f417e0;

                /* JADX INFO: renamed from: f */
                public p43 f418f;

                /* JADX INFO: renamed from: f0 */
                public final int f419f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f420g0;

                /* JADX INFO: renamed from: h0 */
                public final int f421h0;

                /* JADX INFO: renamed from: i */
                public boolean f422i;

                /* JADX INFO: renamed from: v */
                public boolean f423v;

                /* JADX INFO: renamed from: w */
                public CharSequence f424w;

                public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
                    int resourceId;
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f408a = new C0162b(this);
/* 13 */            TypedValue typedValue = new TypedValue();
/* 27 */            if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
/* 43 */                this.f410b = context;
                    } else {
/* 40 */                this.f410b = new ContextThemeWrapper(context, typedValue.resourceId);
                    }
/* 48 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMode, i, 0);
/* 52 */            int i2 = R$styleable.ActionMode_background;
/* 75 */            setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : mn0.m6700p(context, resourceId));
/* 84 */            this.f417e0 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_titleTextStyle, 0);
/* 92 */            this.f419f0 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_subtitleTextStyle, 0);
/* 100 */           this.f416e = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionMode_height, 0);
/* 110 */           this.f421h0 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
/* 112 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: f */
                public static int m334f(View view, int i, int i2) {
/* 7 */             view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
/* 16 */            return Math.max(0, i - view.getMeasuredWidth());
                }

                /* JADX INFO: renamed from: g */
                public static int m335g(int i, int i2, int i3, View view, boolean z) {
/* 1 */             int measuredWidth = view.getMeasuredWidth();
/* 5 */             int measuredHeight = view.getMeasuredHeight();
/* 12 */            int i4 = ((i3 - measuredHeight) / 2) + i2;
/* 13 */            if (z) {
/* 18 */                view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
                    } else {
/* 25 */                view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
                    }
                    return z ? -measuredWidth : measuredWidth;
                }

                /* JADX INFO: renamed from: c */
                public final void m336c(AbstractC1778j2 abstractC1778j2) {
/* 1 */             View view = this.f406V;
/* 3 */             int i = 0;
/* 4 */             if (view == null) {
/* 16 */                View viewInflate = LayoutInflater.from(getContext()).inflate(this.f421h0, (ViewGroup) this, false);
/* 20 */                this.f406V = viewInflate;
/* 22 */                addView(viewInflate);
                    } else if (view.getParent() == null) {
/* 34 */                addView(this.f406V);
                    }
/* 41 */            View viewFindViewById = this.f406V.findViewById(R$id.action_mode_close_button);
/* 45 */            this.f407W = viewFindViewById;
/* 52 */            viewFindViewById.setOnClickListener(new ViewOnClickListenerC2239u1(abstractC1778j2, i));
/* 55 */            jg1 jg1VarMo4212d = abstractC1778j2.mo4212d();
/* 59 */            C0062b c0062b = this.f414d;
/* 61 */            if (c0062b != null) {
/* 63 */                c0062b.m424j();
/* 66 */                C0829d2 c0829d2 = c0062b.f749f0;
/* 68 */                if (c0829d2 != null && c0829d2.m10351b()) {
/* 78 */                    c0829d2.f20144i.dismiss();
                        }
                    }
/* 87 */            C0062b c0062b2 = new C0062b(getContext());
/* 90 */            this.f414d = c0062b2;
/* 93 */            c0062b2.f741X = true;
/* 95 */            c0062b2.f742Y = true;
/* 101 */           ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
/* 108 */           jg1VarMo4212d.m5802b(this.f414d, this.f410b);
/* 111 */           C0062b c0062b3 = this.f414d;
/* 113 */           hh1 hh1Var = c0062b3.f9611v;
/* 115 */           if (hh1Var == null) {
/* 125 */               hh1 hh1Var2 = (hh1) c0062b3.f9607d.inflate(c0062b3.f9609f, (ViewGroup) this, false);
/* 127 */               c0062b3.f9611v = hh1Var2;
/* 131 */               hh1Var2.mo331b(c0062b3.f9606c);
/* 134 */               c0062b3.mo419b(true);
                    }
/* 137 */           hh1 hh1Var3 = c0062b3.f9611v;
/* 139 */           if (hh1Var != hh1Var3) {
/* 144 */               ((ActionMenuView) hh1Var3).setPresenter(c0062b3);
                    }
/* 147 */           ActionMenuView actionMenuView = (ActionMenuView) hh1Var3;
/* 149 */           this.f412c = actionMenuView;
/* 152 */           actionMenuView.setBackground(null);
/* 157 */           addView(this.f412c, layoutParams);
                }

                /* JADX INFO: renamed from: d */
                public final void m337d() {
/* 3 */             if (this.f411b0 == null) {
/* 15 */                LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
/* 28 */                LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
/* 30 */                this.f411b0 = linearLayout;
/* 40 */                this.f413c0 = (TextView) linearLayout.findViewById(R$id.action_bar_title);
/* 52 */                this.f415d0 = (TextView) this.f411b0.findViewById(R$id.action_bar_subtitle);
/* 54 */                int i = this.f417e0;
/* 56 */                if (i != 0) {
/* 64 */                    this.f413c0.setTextAppearance(getContext(), i);
                        }
/* 67 */                int i2 = this.f419f0;
/* 69 */                if (i2 != 0) {
/* 77 */                    this.f415d0.setTextAppearance(getContext(), i2);
                        }
                    }
/* 84 */            this.f413c0.setText(this.f424w);
/* 91 */            this.f415d0.setText(this.f405U);
/* 96 */            boolean zIsEmpty = TextUtils.isEmpty(this.f424w);
/* 102 */           boolean zIsEmpty2 = TextUtils.isEmpty(this.f405U);
/* 116 */           this.f415d0.setVisibility(!zIsEmpty2 ? 0 : 8);
/* 126 */           this.f411b0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
/* 135 */           if (this.f411b0.getParent() == null) {
/* 139 */               addView(this.f411b0);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m338e() {
/* 1 */             removeAllViews();
/* 5 */             this.f409a0 = null;
/* 7 */             this.f412c = null;
/* 9 */             this.f414d = null;
/* 11 */            View view = this.f407W;
/* 13 */            if (view != null) {
/* 15 */                view.setOnClickListener(null);
                    }
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 5 */             return new ViewGroup.MarginLayoutParams(-1, -2);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
                }

                public int getAnimatedVisibility() {
                    return this.f418f != null ? this.f408a.f2149b : getVisibility();
                }

                public int getContentHeight() {
/* 1 */             return this.f416e;
                }

                public CharSequence getSubtitle() {
/* 1 */             return this.f405U;
                }

                public CharSequence getTitle() {
/* 1 */             return this.f424w;
                }

                @Override // android.view.View
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public final void setVisibility(int i) {
/* 5 */             if (i != getVisibility()) {
/* 7 */                 p43 p43Var = this.f418f;
/* 9 */                 if (p43Var != null) {
/* 11 */                    p43Var.m7336b();
                        }
/* 14 */                super.setVisibility(i);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final p43 m340i(int i, long j) {
/* 1 */             p43 p43Var = this.f418f;
/* 3 */             if (p43Var != null) {
/* 5 */                 p43Var.m7336b();
                    }
/* 8 */             C0162b c0162b = this.f408a;
/* 11 */            if (i != 0) {
/* 46 */                p43 p43VarM3305a = e33.m3305a(this);
/* 50 */                p43VarM3305a.m7335a(0.0f);
/* 53 */                p43VarM3305a.m7337c(j);
/* 60 */                ((ActionBarContextView) c0162b.f2150c).f418f = p43VarM3305a;
/* 62 */                c0162b.f2149b = i;
/* 64 */                p43VarM3305a.m7338d(c0162b);
/* 67 */                return p43VarM3305a;
                    }
/* 17 */            if (getVisibility() != 0) {
/* 19 */                setAlpha(0.0f);
                    }
/* 22 */            p43 p43VarM3305a2 = e33.m3305a(this);
/* 28 */            p43VarM3305a2.m7335a(1.0f);
/* 31 */            p43VarM3305a2.m7337c(j);
/* 38 */            ((ActionBarContextView) c0162b.f2150c).f418f = p43VarM3305a2;
/* 40 */            c0162b.f2149b = i;
/* 42 */            p43VarM3305a2.m7338d(c0162b);
/* 45 */            return p43VarM3305a2;
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
                    int i;
/* 1 */             super.onConfigurationChanged(configuration);
/* 14 */            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
/* 24 */            setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
/* 27 */            typedArrayObtainStyledAttributes.recycle();
/* 30 */            C0062b c0062b = this.f414d;
/* 32 */            if (c0062b != null) {
/* 40 */                Configuration configuration2 = c0062b.f9605b.getResources().getConfiguration();
/* 44 */                int i2 = configuration2.screenWidthDp;
/* 46 */                int i3 = configuration2.screenHeightDp;
/* 52 */                if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
/* 96 */                    i = 5;
                        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
/* 94 */                    i = 4;
                        } else {
/* 92 */                    i = i2 >= 360 ? 3 : 2;
                        }
/* 97 */                c0062b.f745b0 = i;
/* 99 */                jg1 jg1Var = c0062b.f9606c;
/* 101 */               if (jg1Var != null) {
/* 104 */                   jg1Var.mo5808p(true);
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             C0062b c0062b = this.f414d;
/* 6 */             if (c0062b != null) {
/* 8 */                 c0062b.m424j();
/* 13 */                C0829d2 c0829d2 = this.f414d.f749f0;
/* 15 */                if (c0829d2 == null || !c0829d2.m10351b()) {
/* 28 */                    return;
                        }
/* 25 */                c0829d2.f20144i.dismiss();
                    }
                }

                @Override // android.view.View
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (actionMasked == 9) {
/* 10 */                this.f423v = false;
                    }
/* 15 */            if (!this.f423v) {
/* 17 */                boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 21 */                if (actionMasked == 9 && !zOnHoverEvent) {
/* 25 */                    this.f423v = true;
                        }
                    }
/* 29 */            if (actionMasked != 10 && actionMasked != 3) {
/* 14 */                return true;
                    }
/* 36 */            this.f423v = false;
/* 14 */            return true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             boolean z2 = m53.f13568a;
/* 12 */            boolean z3 = getLayoutDirection() == 1;
/* 23 */            int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
/* 27 */            int paddingTop = getPaddingTop();
/* 41 */            int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
/* 42 */            View view = this.f406V;
/* 46 */            if (view != null && view.getVisibility() != 8) {
/* 60 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f406V.getLayoutParams();
/* 67 */                int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
/* 74 */                int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
/* 80 */                int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
/* 87 */                int iM335g = m335g(i7, paddingTop, paddingTop2, this.f406V, z3) + i7;
/* 93 */                paddingRight = z3 ? iM335g - i6 : iM335g + i6;
                    }
/* 95 */            LinearLayout linearLayout = this.f411b0;
/* 97 */            if (linearLayout != null && this.f409a0 == null && linearLayout.getVisibility() != 8) {
/* 115 */               paddingRight += m335g(paddingRight, paddingTop, paddingTop2, this.f411b0, z3);
                    }
/* 116 */           View view2 = this.f409a0;
/* 118 */           if (view2 != null) {
/* 120 */               m335g(paddingRight, paddingTop, paddingTop2, view2, z3);
                    }
/* 135 */           int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
/* 137 */           ActionMenuView actionMenuView = this.f412c;
/* 139 */           if (actionMenuView != null) {
/* 142 */               m335g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 7 */             if (View.MeasureSpec.getMode(i) != 1073741824) {
/* 259 */               f42.m3656l(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
/* 262 */               return;
                    }
/* 13 */            if (View.MeasureSpec.getMode(i2) == 0) {
/* 241 */               f42.m3656l(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
/* 244 */               return;
                    }
/* 15 */            int size = View.MeasureSpec.getSize(i);
/* 19 */            int size2 = this.f416e;
/* 21 */            if (size2 <= 0) {
/* 24 */                size2 = View.MeasureSpec.getSize(i2);
                    }
/* 36 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 47 */            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
/* 48 */            int iMin = size2 - paddingBottom;
/* 52 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
/* 56 */            View view = this.f406V;
/* 58 */            if (view != null) {
/* 60 */                int iM334f = m334f(view, paddingLeft, iMakeMeasureSpec);
/* 70 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f406V.getLayoutParams();
/* 77 */                paddingLeft = iM334f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                    }
/* 78 */            ActionMenuView actionMenuView = this.f412c;
/* 80 */            if (actionMenuView != null && actionMenuView.getParent() == this) {
/* 90 */                paddingLeft = m334f(this.f412c, paddingLeft, iMakeMeasureSpec);
                    }
/* 94 */            LinearLayout linearLayout = this.f411b0;
/* 97 */            if (linearLayout != null && this.f409a0 == null) {
/* 105 */               if (this.f420g0) {
/* 113 */                   this.f411b0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
/* 118 */                   int measuredWidth = this.f411b0.getMeasuredWidth();
/* 126 */                   boolean z = measuredWidth <= paddingLeft;
/* 127 */                   if (z) {
/* 129 */                       paddingLeft -= measuredWidth;
                            }
/* 138 */                   this.f411b0.setVisibility(z ? 0 : 8);
                        } else {
/* 142 */                   paddingLeft = m334f(linearLayout, paddingLeft, iMakeMeasureSpec);
                        }
                    }
/* 146 */           View view2 = this.f409a0;
/* 148 */           if (view2 != null) {
/* 150 */               ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 154 */               int i3 = layoutParams.width;
/* 161 */               int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
/* 162 */               if (i3 >= 0) {
/* 164 */                   paddingLeft = Math.min(i3, paddingLeft);
                        }
/* 168 */               int i5 = layoutParams.height;
/* 170 */               int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
/* 174 */               if (i5 >= 0) {
/* 176 */                   iMin = Math.min(i5, iMin);
                        }
/* 190 */               this.f409a0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
                    }
/* 195 */           if (this.f416e > 0) {
/* 223 */               setMeasuredDimension(size, size2);
/* 226 */               return;
                    }
/* 197 */           int childCount = getChildCount();
/* 201 */           int i7 = 0;
/* 202 */           for (int i8 = 0; i8 < childCount; i8++) {
/* 212 */               int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
/* 213 */               if (measuredHeight > i7) {
/* 215 */                   i7 = measuredHeight;
                        }
                    }
/* 219 */           setMeasuredDimension(size, i7);
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 0) {
/* 8 */                 this.f422i = false;
                    }
/* 13 */            if (!this.f422i) {
/* 15 */                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 19 */                if (actionMasked == 0 && !zOnTouchEvent) {
/* 23 */                    this.f422i = true;
                        }
                    }
/* 25 */            if (actionMasked != 1 && actionMasked != 3) {
/* 12 */                return true;
                    }
/* 32 */            this.f422i = false;
/* 12 */            return true;
                }

                public void setContentHeight(int i) {
/* 1 */             this.f416e = i;
                }

                public void setCustomView(View view) {
                    LinearLayout linearLayout;
/* 1 */             View view2 = this.f409a0;
/* 3 */             if (view2 != null) {
/* 5 */                 removeView(view2);
                    }
/* 8 */             this.f409a0 = view;
/* 10 */            if (view != null && (linearLayout = this.f411b0) != null) {
/* 16 */                removeView(linearLayout);
/* 20 */                this.f411b0 = null;
                    }
/* 22 */            if (view != null) {
/* 24 */                addView(view);
                    }
/* 27 */            requestLayout();
                }

                public void setSubtitle(CharSequence charSequence) {
/* 1 */             this.f405U = charSequence;
/* 3 */             m337d();
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             this.f424w = charSequence;
/* 3 */             m337d();
/* 6 */             e33.m3319o(this, charSequence);
                }

                public void setTitleOptional(boolean z) {
/* 3 */             if (z != this.f420g0) {
/* 5 */                 requestLayout();
                    }
/* 8 */             this.f420g0 = z;
                }

                @Override // android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

/* 115 */       public ActionBarContextView(Context context, AttributeSet attributeSet) {
/* 116 */           this(context, attributeSet, R$attr.actionModeStyle);
                }
            }
