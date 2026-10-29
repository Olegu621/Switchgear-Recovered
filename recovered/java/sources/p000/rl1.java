            package p000;

            import android.R;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.TypedValue;
            import android.view.LayoutInflater;
            import android.view.PointerIcon;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.TextView;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$id;
            import com.google.android.material.R$integer;
            import com.google.android.material.R$string;
            import com.google.android.material.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public abstract class rl1 extends FrameLayout implements gh1 {

                /* JADX INFO: renamed from: q0 */
                public static final int[] f16144q0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: r0 */
                public static final zb0 f16145r0 = new zb0(21);

                /* JADX INFO: renamed from: s0 */
                public static final ql1 f16146s0 = new ql1(21);

                /* JADX INFO: renamed from: U */
                public final View f16147U;

                /* JADX INFO: renamed from: V */
                public final ImageView f16148V;

                /* JADX INFO: renamed from: W */
                public final ViewGroup f16149W;

                /* JADX INFO: renamed from: a */
                public boolean f16150a;

                /* JADX INFO: renamed from: a0 */
                public final TextView f16151a0;

                /* JADX INFO: renamed from: b */
                public int f16152b;

                /* JADX INFO: renamed from: b0 */
                public final TextView f16153b0;

                /* JADX INFO: renamed from: c */
                public int f16154c;

                /* JADX INFO: renamed from: c0 */
                public int f16155c0;

                /* JADX INFO: renamed from: d */
                public float f16156d;

                /* JADX INFO: renamed from: d0 */
                public sg1 f16157d0;

                /* JADX INFO: renamed from: e */
                public float f16158e;

                /* JADX INFO: renamed from: e0 */
                public ColorStateList f16159e0;

                /* JADX INFO: renamed from: f */
                public float f16160f;

                /* JADX INFO: renamed from: f0 */
                public Drawable f16161f0;

                /* JADX INFO: renamed from: g0 */
                public Drawable f16162g0;

                /* JADX INFO: renamed from: h0 */
                public ValueAnimator f16163h0;

                /* JADX INFO: renamed from: i */
                public int f16164i;

                /* JADX INFO: renamed from: i0 */
                public zb0 f16165i0;

                /* JADX INFO: renamed from: j0 */
                public float f16166j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f16167k0;

                /* JADX INFO: renamed from: l0 */
                public int f16168l0;

                /* JADX INFO: renamed from: m0 */
                public int f16169m0;

                /* JADX INFO: renamed from: n0 */
                public boolean f16170n0;

                /* JADX INFO: renamed from: o0 */
                public int f16171o0;

                /* JADX INFO: renamed from: p0 */
                public C1927mh f16172p0;

                /* JADX INFO: renamed from: v */
                public boolean f16173v;

                /* JADX INFO: renamed from: w */
                public final FrameLayout f16174w;

                public rl1(Context context) {
/* 1 */             super(context);
/* 5 */             this.f16150a = false;
/* 8 */             this.f16155c0 = -1;
/* 12 */            this.f16165i0 = f16145r0;
/* 15 */            this.f16166j0 = 0.0f;
/* 17 */            this.f16167k0 = false;
/* 19 */            this.f16168l0 = 0;
/* 21 */            this.f16169m0 = 0;
/* 23 */            this.f16170n0 = false;
/* 25 */            this.f16171o0 = 0;
/* 35 */            int i = 1;
/* 36 */            LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
/* 47 */            this.f16174w = (FrameLayout) findViewById(R$id.navigation_bar_item_icon_container);
/* 55 */            this.f16147U = findViewById(R$id.navigation_bar_item_active_indicator_view);
/* 63 */            ImageView imageView = (ImageView) findViewById(R$id.navigation_bar_item_icon_view);
/* 65 */            this.f16148V = imageView;
/* 73 */            ViewGroup viewGroup = (ViewGroup) findViewById(R$id.navigation_bar_item_labels_group);
/* 75 */            this.f16149W = viewGroup;
/* 83 */            TextView textView = (TextView) findViewById(R$id.navigation_bar_item_small_label_view);
/* 85 */            this.f16151a0 = textView;
/* 93 */            TextView textView2 = (TextView) findViewById(R$id.navigation_bar_item_large_label_view);
/* 95 */            this.f16153b0 = textView2;
/* 101 */           setBackgroundResource(getItemBackgroundResId());
/* 116 */           this.f16152b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
/* 122 */           this.f16154c = viewGroup.getPaddingBottom();
/* 124 */           WeakHashMap weakHashMap = e33.f7494a;
/* 127 */           textView.setImportantForAccessibility(2);
/* 130 */           textView2.setImportantForAccessibility(2);
/* 133 */           setFocusable(true);
/* 144 */           m8202a(textView.getTextSize(), textView2.getTextSize());
/* 147 */           if (imageView != null) {
/* 154 */               imageView.addOnLayoutChangeListener(new mp0(this, i));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0021  */
                /* JADX INFO: renamed from: d */
                public static void m8198d(TextView textView, int i) {
                    int iRound;
/* 1 */             textView.setTextAppearance(i);
/* 4 */             Context context = textView.getContext();
/* 9 */             if (i == 0) {
/* 34 */                iRound = 0;
                    } else {
/* 14 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
/* 20 */                TypedValue typedValue = new TypedValue();
/* 25 */                boolean value = typedArrayObtainStyledAttributes.getValue(R$styleable.TextAppearance_android_textSize, typedValue);
/* 29 */                typedArrayObtainStyledAttributes.recycle();
/* 32 */                if (value) {
/* 36 */                    int complexUnit = typedValue.getComplexUnit();
/* 40 */                    int i2 = typedValue.data;
/* 73 */                    iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
                        } else {
/* 34 */                    iRound = 0;
                        }
                    }
/* 77 */            if (iRound != 0) {
/* 80 */                textView.setTextSize(0, iRound);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static void m8199e(View view, float f, float f2, int i) {
/* 1 */             view.setScaleX(f);
/* 4 */             view.setScaleY(f2);
/* 7 */             view.setVisibility(i);
                }

                /* JADX INFO: renamed from: f */
                public static void m8200f(View view, int i, int i2) {
/* 5 */             FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
/* 7 */             layoutParams.topMargin = i;
/* 9 */             layoutParams.bottomMargin = i;
/* 11 */            layoutParams.gravity = i2;
/* 13 */            view.setLayoutParams(layoutParams);
                }

                private View getIconOrContainer() {
/* 1 */             FrameLayout frameLayout = this.f16174w;
                    return frameLayout != null ? frameLayout : this.f16148V;
                }

                private int getItemVisiblePosition() {
/* 5 */             ViewGroup viewGroup = (ViewGroup) getParent();
/* 7 */             int iIndexOfChild = viewGroup.indexOfChild(this);
/* 12 */            int i = 0;
/* 13 */            for (int i2 = 0; i2 < iIndexOfChild; i2++) {
/* 15 */                View childAt = viewGroup.getChildAt(i2);
/* 21 */                if ((childAt instanceof rl1) && childAt.getVisibility() == 0) {
/* 29 */                    i++;
                        }
                    }
/* 34 */            return i;
                }

                private int getSuggestedIconHeight() {
/* 1 */             C1927mh c1927mh = this.f16172p0;
/* 12 */            int minimumHeight = c1927mh != null ? c1927mh.getMinimumHeight() / 2 : 0;
/* 36 */            return this.f16148V.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
                }

                private int getSuggestedIconWidth() {
/* 1 */             C1927mh c1927mh = this.f16172p0;
/* 23 */            int minimumWidth = c1927mh == null ? 0 : c1927mh.getMinimumWidth() - this.f16172p0.f13777e.f14263b.f4422X.intValue();
/* 32 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
/* 53 */            return Math.max(minimumWidth, layoutParams.rightMargin) + this.f16148V.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
                }

                /* JADX INFO: renamed from: h */
                public static void m8201h(int i, View view) {
/* 13 */            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                }

                /* JADX INFO: renamed from: a */
                public final void m8202a(float f, float f2) {
/* 3 */             this.f16156d = f - f2;
/* 10 */            this.f16158e = (f2 * 1.0f) / f;
/* 14 */            this.f16160f = (f * 1.0f) / f2;
                }

                /* JADX INFO: renamed from: b */
                public final void m8203b(float f, float f2) {
/* 1 */             View view = this.f16147U;
/* 3 */             if (view != null) {
/* 5 */                 zb0 zb0Var = this.f16165i0;
/* 7 */                 zb0Var.getClass();
/* 19 */                view.setScaleX(AbstractC2246u8.m8970a(0.4f, 1.0f, f));
/* 26 */                view.setScaleY(zb0Var.mo7942b(f, f2));
/* 50 */                view.setAlpha(AbstractC2246u8.m8971b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
                    }
/* 53 */            this.f16166j0 = f;
                }

                @Override // p000.gh1
                /* JADX INFO: renamed from: c */
                public final void mo327c(sg1 sg1Var) {
/* 1 */             this.f16157d0 = sg1Var;
/* 7 */             setCheckable(sg1Var.isCheckable());
/* 14 */            setChecked(sg1Var.isChecked());
/* 21 */            setEnabled(sg1Var.isEnabled());
/* 28 */            setIcon(sg1Var.getIcon());
/* 33 */            setTitle(sg1Var.f16587e);
/* 38 */            setId(sg1Var.f16583a);
/* 47 */            if (!TextUtils.isEmpty(sg1Var.f16599q)) {
/* 51 */                setContentDescription(sg1Var.f16599q);
                    }
/* 67 */            i13.m4420B(this, !TextUtils.isEmpty(sg1Var.f16600r) ? sg1Var.f16600r : sg1Var.f16587e);
/* 80 */            setVisibility(sg1Var.isVisible() ? 0 : 8);
/* 84 */            this.f16150a = true;
                }

                /* JADX INFO: renamed from: g */
                public final void m8204g(int i) {
/* 1 */             View view = this.f16147U;
/* 3 */             if (view == null) {
/* 5 */                 return;
                    }
/* 13 */            int iMin = Math.min(this.f16168l0, i - (this.f16171o0 * 2));
/* 21 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
/* 35 */            layoutParams.height = (this.f16170n0 && this.f16164i == 2) ? iMin : this.f16169m0;
/* 37 */            layoutParams.width = iMin;
/* 39 */            view.setLayoutParams(layoutParams);
                }

                public Drawable getActiveIndicatorDrawable() {
/* 1 */             View view = this.f16147U;
/* 3 */             if (view == null) {
/* 5 */                 return null;
                    }
/* 7 */             return view.getBackground();
                }

                public C1927mh getBadge() {
/* 1 */             return this.f16172p0;
                }

                public int getItemBackgroundResId() {
/* 1 */             return R$drawable.mtrl_navigation_bar_item_background;
                }

                @Override // p000.gh1
                public sg1 getItemData() {
/* 1 */             return this.f16157d0;
                }

                public int getItemDefaultMarginResId() {
/* 1 */             return R$dimen.mtrl_navigation_bar_item_default_margin;
                }

                public abstract int getItemLayoutResId();

                public int getItemPosition() {
/* 1 */             return this.f16155c0;
                }

                @Override // android.view.View
                public int getSuggestedMinimumHeight() {
/* 1 */             ViewGroup viewGroup = this.f16149W;
/* 7 */             FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
/* 23 */            return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                }

                @Override // android.view.View
                public int getSuggestedMinimumWidth() {
/* 1 */             ViewGroup viewGroup = this.f16149W;
/* 7 */             FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
/* 23 */            return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
/* 7 */             sg1 sg1Var = this.f16157d0;
/* 9 */             if (sg1Var != null && sg1Var.isCheckable() && this.f16157d0.isChecked()) {
/* 27 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f16144q0);
                    }
/* 30 */            return iArrOnCreateDrawableState;
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 4 */             C1927mh c1927mh = this.f16172p0;
/* 6 */             if (c1927mh != null && c1927mh.isVisible()) {
/* 14 */                sg1 sg1Var = this.f16157d0;
/* 16 */                CharSequence charSequence = sg1Var.f16587e;
/* 24 */                if (!TextUtils.isEmpty(sg1Var.f16599q)) {
/* 28 */                    charSequence = this.f16157d0.f16599q;
                        }
/* 56 */                accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f16172p0.m6650c()));
                    }
/* 77 */            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0864e1.m3291a(0, 1, getItemVisiblePosition(), 1, isSelected()).f7471a);
/* 84 */            if (isSelected()) {
/* 86 */                accessibilityNodeInfo.setClickable(false);
/* 95 */                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2518z0.f19874g.f19883a);
                    }
/* 114 */           accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 10 */            post(new RunnableC2503ym(this, i, 3));
                }

                public void setActiveIndicatorDrawable(Drawable drawable) {
/* 1 */             View view = this.f16147U;
/* 3 */             if (view == null) {
/* 5 */                 return;
                    }
/* 6 */             view.setBackgroundDrawable(drawable);
                }

                public void setActiveIndicatorEnabled(boolean z) {
/* 1 */             this.f16167k0 = z;
/* 3 */             View view = this.f16147U;
/* 5 */             if (view != null) {
/* 13 */                view.setVisibility(z ? 0 : 8);
/* 16 */                requestLayout();
                    }
                }

                public void setActiveIndicatorHeight(int i) {
/* 1 */             this.f16169m0 = i;
/* 7 */             m8204g(getWidth());
                }

                public void setActiveIndicatorMarginHorizontal(int i) {
/* 1 */             this.f16171o0 = i;
/* 7 */             m8204g(getWidth());
                }

                public void setActiveIndicatorResizeable(boolean z) {
/* 1 */             this.f16170n0 = z;
                }

                public void setActiveIndicatorWidth(int i) {
/* 1 */             this.f16168l0 = i;
/* 7 */             m8204g(getWidth());
                }

                public void setBadge(C1927mh c1927mh) {
/* 1 */             C1927mh c1927mh2 = this.f16172p0;
/* 3 */             if (c1927mh2 == c1927mh) {
/* 141 */               return;
                    }
/* 8 */             ImageView imageView = this.f16148V;
/* 10 */            if (c1927mh2 != null && imageView != null) {
/* 18 */                AbstractC1245n0.m4889q("NavigationBar", "Multiple badges shouldn't be attached to one item.");
/* 23 */                if (this.f16172p0 != null) {
/* 26 */                    setClipChildren(true);
/* 29 */                    setClipToPadding(true);
/* 32 */                    C1927mh c1927mh3 = this.f16172p0;
/* 34 */                    if (c1927mh3 != null) {
/* 37 */                        WeakReference weakReference = c1927mh3.f13772X;
/* 49 */                        if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
/* 51 */                            WeakReference weakReference2 = c1927mh3.f13772X;
/* 63 */                            (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                                } else {
/* 71 */                            imageView.getOverlay().remove(c1927mh3);
                                }
                            }
/* 74 */                    this.f16172p0 = null;
                        }
                    }
/* 76 */            this.f16172p0 = c1927mh;
/* 78 */            if (imageView == null || c1927mh == null) {
/* 141 */               return;
                    }
/* 83 */            setClipChildren(false);
/* 86 */            setClipToPadding(false);
/* 89 */            C1927mh c1927mh4 = this.f16172p0;
/* 93 */            Rect rect = new Rect();
/* 96 */            imageView.getDrawingRect(rect);
/* 99 */            c1927mh4.setBounds(rect);
/* 102 */           c1927mh4.m6653f(imageView, null);
/* 105 */           WeakReference weakReference3 = c1927mh4.f13772X;
/* 117 */           if ((weakReference3 != null ? (FrameLayout) weakReference3.get() : null) == null) {
/* 138 */               imageView.getOverlay().add(c1927mh4);
                    } else {
/* 119 */               WeakReference weakReference4 = c1927mh4.f13772X;
/* 130 */               (weakReference4 != null ? (FrameLayout) weakReference4.get() : null).setForeground(c1927mh4);
                    }
                }

                public void setCheckable(boolean z) {
/* 1 */             refreshDrawableState();
                }

                /* JADX WARN: Code duplicated, block: B:22:0x009c  */
                public void setChecked(boolean z) {
/* 1 */             TextView textView = this.f16153b0;
/* 10 */            textView.setPivotX(textView.getWidth() / 2);
/* 18 */            textView.setPivotY(textView.getBaseline());
/* 21 */            TextView textView2 = this.f16151a0;
/* 29 */            textView2.setPivotX(textView2.getWidth() / 2);
/* 37 */            textView2.setPivotY(textView2.getBaseline());
/* 46 */            float f = z ? 1.0f : 0.0f;
/* 51 */            if (this.f16167k0 && this.f16150a) {
/* 57 */                WeakHashMap weakHashMap = e33.f7494a;
/* 63 */                if (isAttachedToWindow()) {
/* 66 */                    ValueAnimator valueAnimator = this.f16163h0;
/* 68 */                    if (valueAnimator != null) {
/* 70 */                        valueAnimator.cancel();
/* 74 */                        this.f16163h0 = null;
                            }
/* 84 */                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16166j0, f);
/* 88 */                    this.f16163h0 = valueAnimatorOfFloat;
/* 95 */                    valueAnimatorOfFloat.addUpdateListener(new pl1(this, f));
/* 112 */                   this.f16163h0.setInterpolator(hu0.m4348y0(getContext(), R$attr.motionEasingStandard, AbstractC2246u8.f17411b));
/* 115 */                   ValueAnimator valueAnimator2 = this.f16163h0;
/* 117 */                   Context context = getContext();
/* 121 */                   int i = R$attr.motionDurationLong1;
/* 129 */                   int integer = getResources().getInteger(R$integer.material_motion_duration_long_1);
/* 133 */                   TypedValue typedValueM10197C = yy1.m10197C(context, i);
/* 137 */                   if (typedValueM10197C != null && typedValueM10197C.type == 16) {
/* 145 */                       integer = typedValueM10197C.data;
                            }
/* 148 */                   valueAnimator2.setDuration(integer);
/* 153 */                   this.f16163h0.start();
                        } else {
/* 157 */                   m8203b(f, f);
                        }
                    } else {
/* 157 */               m8203b(f, f);
                    }
/* 160 */           int i2 = this.f16164i;
/* 167 */           ViewGroup viewGroup = this.f16149W;
/* 170 */           if (i2 != -1) {
/* 172 */               if (i2 == 0) {
/* 249 */                   if (z) {
/* 257 */                       m8200f(getIconOrContainer(), this.f16152b, 49);
/* 262 */                       m8201h(this.f16154c, viewGroup);
/* 265 */                       textView.setVisibility(0);
                            } else {
/* 275 */                       m8200f(getIconOrContainer(), this.f16152b, 17);
/* 278 */                       m8201h(0, viewGroup);
/* 281 */                       textView.setVisibility(4);
                            }
/* 284 */                   textView2.setVisibility(4);
                        } else if (i2 == 1) {
/* 201 */                   m8201h(this.f16154c, viewGroup);
/* 204 */                   if (z) {
/* 217 */                       m8200f(getIconOrContainer(), (int) (this.f16152b + this.f16156d), 49);
/* 220 */                       m8199e(textView, 1.0f, 1.0f, 0);
/* 223 */                       float f2 = this.f16158e;
/* 225 */                       m8199e(textView2, f2, f2, 4);
                            } else {
/* 236 */                       m8200f(getIconOrContainer(), this.f16152b, 49);
/* 239 */                       float f3 = this.f16160f;
/* 241 */                       m8199e(textView, f3, f3, 4);
/* 244 */                       m8199e(textView2, 1.0f, 1.0f, 0);
                            }
                        } else if (i2 == 2) {
/* 186 */                   m8200f(getIconOrContainer(), this.f16152b, 17);
/* 191 */                   textView.setVisibility(8);
/* 194 */                   textView2.setVisibility(8);
                        }
                    } else if (this.f16173v) {
/* 292 */               if (z) {
/* 300 */                   m8200f(getIconOrContainer(), this.f16152b, 49);
/* 305 */                   m8201h(this.f16154c, viewGroup);
/* 308 */                   textView.setVisibility(0);
                        } else {
/* 318 */                   m8200f(getIconOrContainer(), this.f16152b, 17);
/* 321 */                   m8201h(0, viewGroup);
/* 324 */                   textView.setVisibility(4);
                        }
/* 327 */               textView2.setVisibility(4);
                    } else {
/* 333 */               m8201h(this.f16154c, viewGroup);
/* 336 */               if (z) {
/* 349 */                   m8200f(getIconOrContainer(), (int) (this.f16152b + this.f16156d), 49);
/* 352 */                   m8199e(textView, 1.0f, 1.0f, 0);
/* 355 */                   float f4 = this.f16158e;
/* 357 */                   m8199e(textView2, f4, f4, 4);
                        } else {
/* 367 */                   m8200f(getIconOrContainer(), this.f16152b, 49);
/* 370 */                   float f5 = this.f16160f;
/* 372 */                   m8199e(textView, f5, f5, 4);
/* 375 */                   m8199e(textView2, 1.0f, 1.0f, 0);
                        }
                    }
/* 378 */           refreshDrawableState();
/* 381 */           setSelected(z);
                }

                @Override // android.view.View
                public void setEnabled(boolean z) {
/* 1 */             super.setEnabled(z);
/* 6 */             this.f16151a0.setEnabled(z);
/* 11 */            this.f16153b0.setEnabled(z);
/* 16 */            this.f16148V.setEnabled(z);
/* 19 */            if (!z) {
/* 37 */                WeakHashMap weakHashMap = e33.f7494a;
/* 40 */                u23.m8945d(this, null);
                    } else {
/* 27 */                PointerIcon pointerIconM5552b = it1.m5552b(getContext(), 1002);
/* 31 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 33 */                u23.m8945d(this, pointerIconM5552b);
                    }
                }

                public void setIcon(Drawable drawable) {
/* 3 */             if (drawable == this.f16161f0) {
/* 5 */                 return;
                    }
/* 6 */             this.f16161f0 = drawable;
/* 8 */             if (drawable != null) {
/* 10 */                Drawable.ConstantState constantState = drawable.getConstantState();
/* 14 */                if (constantState != null) {
/* 17 */                    drawable = constantState.newDrawable();
                        }
/* 21 */                drawable = drawable.mutate();
/* 25 */                this.f16162g0 = drawable;
/* 27 */                ColorStateList colorStateList = this.f16159e0;
/* 29 */                if (colorStateList != null) {
/* 31 */                    s90.m8448h(drawable, colorStateList);
                        }
                    }
/* 36 */            this.f16148V.setImageDrawable(drawable);
                }

                public void setIconSize(int i) {
/* 1 */             ImageView imageView = this.f16148V;
/* 7 */             FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
/* 9 */             layoutParams.width = i;
/* 11 */            layoutParams.height = i;
/* 13 */            imageView.setLayoutParams(layoutParams);
                }

                public void setIconTintList(ColorStateList colorStateList) {
                    Drawable drawable;
/* 1 */             this.f16159e0 = colorStateList;
/* 5 */             if (this.f16157d0 == null || (drawable = this.f16162g0) == null) {
/* 19 */                return;
                    }
/* 11 */            s90.m8448h(drawable, colorStateList);
/* 16 */            this.f16162g0.invalidateSelf();
                }

                public void setItemBackground(Drawable drawable) {
/* 1 */             if (drawable != null && drawable.getConstantState() != null) {
/* 17 */                drawable = drawable.getConstantState().newDrawable().mutate();
                    }
/* 21 */            WeakHashMap weakHashMap = e33.f7494a;
/* 23 */            setBackground(drawable);
                }

                public void setItemPaddingBottom(int i) {
/* 3 */             if (this.f16154c != i) {
/* 5 */                 this.f16154c = i;
/* 7 */                 sg1 sg1Var = this.f16157d0;
/* 9 */                 if (sg1Var != null) {
/* 15 */                    setChecked(sg1Var.isChecked());
                        }
                    }
                }

                public void setItemPaddingTop(int i) {
/* 3 */             if (this.f16152b != i) {
/* 5 */                 this.f16152b = i;
/* 7 */                 sg1 sg1Var = this.f16157d0;
/* 9 */                 if (sg1Var != null) {
/* 15 */                    setChecked(sg1Var.isChecked());
                        }
                    }
                }

                public void setItemPosition(int i) {
/* 1 */             this.f16155c0 = i;
                }

                public void setLabelVisibilityMode(int i) {
/* 3 */             if (this.f16164i != i) {
/* 5 */                 this.f16164i = i;
/* 9 */                 if (this.f16170n0 && i == 2) {
/* 16 */                    this.f16165i0 = f16146s0;
                        } else {
/* 21 */                    this.f16165i0 = f16145r0;
                        }
/* 27 */                m8204g(getWidth());
/* 30 */                sg1 sg1Var = this.f16157d0;
/* 32 */                if (sg1Var != null) {
/* 38 */                    setChecked(sg1Var.isChecked());
                        }
                    }
                }

                public void setShifting(boolean z) {
/* 3 */             if (this.f16173v != z) {
/* 5 */                 this.f16173v = z;
/* 7 */                 sg1 sg1Var = this.f16157d0;
/* 9 */                 if (sg1Var != null) {
/* 15 */                    setChecked(sg1Var.isChecked());
                        }
                    }
                }

                public void setTextAppearanceActive(int i) {
/* 1 */             TextView textView = this.f16153b0;
/* 3 */             m8198d(textView, i);
/* 16 */            m8202a(this.f16151a0.getTextSize(), textView.getTextSize());
                }

                public void setTextAppearanceInactive(int i) {
/* 1 */             TextView textView = this.f16151a0;
/* 3 */             m8198d(textView, i);
/* 16 */            m8202a(textView.getTextSize(), this.f16153b0.getTextSize());
                }

                public void setTextColor(ColorStateList colorStateList) {
/* 1 */             if (colorStateList != null) {
/* 5 */                 this.f16151a0.setTextColor(colorStateList);
/* 10 */                this.f16153b0.setTextColor(colorStateList);
                    }
                }

                public void setTitle(CharSequence charSequence) {
/* 3 */             this.f16151a0.setText(charSequence);
/* 8 */             this.f16153b0.setText(charSequence);
/* 11 */            sg1 sg1Var = this.f16157d0;
/* 13 */            if (sg1Var == null || TextUtils.isEmpty(sg1Var.f16599q)) {
/* 23 */                setContentDescription(charSequence);
                    }
/* 26 */            sg1 sg1Var2 = this.f16157d0;
/* 28 */            if (sg1Var2 != null && !TextUtils.isEmpty(sg1Var2.f16600r)) {
/* 41 */                charSequence = this.f16157d0.f16600r;
                    }
/* 43 */            i13.m4420B(this, charSequence);
                }

/* 26 */        public void setItemBackground(int i) {
/* 28 */            setItemBackground(i == 0 ? null : v00.getDrawable(getContext(), i));
                }
            }
