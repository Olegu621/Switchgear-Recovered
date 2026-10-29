            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import android.widget.PopupWindow;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.R$styleable;
            import p000.AbstractC1815k2;
            import p000.AbstractC1912m2;
            import p000.C0165b2;
            import p000.C1949n2;
            import p000.C2055p2;
            import p000.C2092q2;
            import p000.ViewOnClickListenerC2129r2;
            import p000.ViewTreeObserverOnGlobalLayoutListenerC1986o2;
            import p000.ac1;
            import p000.e33;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 180 */   public class ActivityChooserView extends ViewGroup {

                /* JADX INFO: renamed from: U */
                public PopupWindow.OnDismissListener f475U;

                /* JADX INFO: renamed from: V */
                public boolean f476V;

                /* JADX INFO: renamed from: a */
                public final C2092q2 f477a;

                /* JADX INFO: renamed from: b */
                public final ViewOnClickListenerC2129r2 f478b;

                /* JADX INFO: renamed from: c */
                public final View f479c;

                /* JADX INFO: renamed from: d */
                public final FrameLayout f480d;

                /* JADX INFO: renamed from: e */
                public final ImageView f481e;

                /* JADX INFO: renamed from: f */
                public final FrameLayout f482f;

                /* JADX INFO: renamed from: i */
                public AbstractC1815k2 f483i;

                /* JADX INFO: renamed from: v */
                public final ViewTreeObserverOnGlobalLayoutListenerC1986o2 f484v;

                /* JADX INFO: renamed from: w */
                public ListPopupWindow f485w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class InnerLayout extends LinearLayout {

                    /* JADX INFO: renamed from: a */
                    public static final int[] f486a = {R.attr.background};

                    public InnerLayout(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 6 */                 ac1 ac1VarM155G = ac1.m155G(context, attributeSet, f486a);
/* 15 */                setBackgroundDrawable(ac1VarM155G.m184n(0));
/* 18 */                ac1VarM155G.m168J();
                    }
                }

                public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 6 */             int i2 = 0;
/* 7 */             new C1949n2(this, i2);
/* 15 */            this.f484v = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, i2);
/* 19 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActivityChooserView, i, 0);
/* 29 */            e33.m3317m(this, context, R$styleable.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i);
/* 35 */            typedArrayObtainStyledAttributes.getInt(R$styleable.ActivityChooserView_initialActivityCount, 4);
/* 40 */            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
/* 44 */            typedArrayObtainStyledAttributes.recycle();
/* 58 */            LayoutInflater.from(getContext()).inflate(R$layout.abc_activity_chooser_view, (ViewGroup) this, true);
/* 63 */            ViewOnClickListenerC2129r2 viewOnClickListenerC2129r2 = new ViewOnClickListenerC2129r2(this);
/* 66 */            this.f478b = viewOnClickListenerC2129r2;
/* 70 */            View viewFindViewById = findViewById(R$id.activity_chooser_view_content);
/* 74 */            this.f479c = viewFindViewById;
/* 76 */            viewFindViewById.getBackground();
/* 85 */            FrameLayout frameLayout = (FrameLayout) findViewById(R$id.default_activity_button);
/* 87 */            this.f482f = frameLayout;
/* 89 */            frameLayout.setOnClickListener(viewOnClickListenerC2129r2);
/* 92 */            frameLayout.setOnLongClickListener(viewOnClickListenerC2129r2);
/* 109 */           FrameLayout frameLayout2 = (FrameLayout) findViewById(R$id.expand_activities_button);
/* 111 */           frameLayout2.setOnClickListener(viewOnClickListenerC2129r2);
/* 119 */           frameLayout2.setAccessibilityDelegate(new C2055p2());
/* 128 */           frameLayout2.setOnTouchListener(new C0165b2(this, frameLayout2, 2));
/* 131 */           this.f480d = frameLayout2;
/* 139 */           ImageView imageView = (ImageView) frameLayout2.findViewById(R$id.image);
/* 141 */           this.f481e = imageView;
/* 143 */           imageView.setImageDrawable(drawable);
/* 148 */           C2092q2 c2092q2 = new C2092q2(this);
/* 151 */           this.f477a = c2092q2;
/* 158 */           c2092q2.registerDataSetObserver(new C1949n2(this, 1));
/* 161 */           Resources resources = context.getResources();
/* 178 */           Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
                }

                /* JADX INFO: renamed from: a */
                public final void m353a() {
/* 5 */             if (m354b()) {
/* 11 */                getListPopupWindow().dismiss();
/* 14 */                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
/* 22 */                if (viewTreeObserver.isAlive()) {
/* 26 */                    viewTreeObserver.removeGlobalOnLayoutListener(this.f484v);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m354b() {
/* 7 */             return getListPopupWindow().f591j0.isShowing();
                }

                public AbstractC1912m2 getDataModel() {
/* 3 */             this.f477a.getClass();
/* 6 */             return null;
                }

                public ListPopupWindow getListPopupWindow() {
/* 3 */             if (this.f485w == null) {
/* 11 */                ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
/* 14 */                this.f485w = listPopupWindow;
/* 18 */                listPopupWindow.mo373o(this.f477a);
/* 21 */                ListPopupWindow listPopupWindow2 = this.f485w;
/* 23 */                listPopupWindow2.f574Z = this;
/* 26 */                listPopupWindow2.f590i0 = true;
/* 30 */                listPopupWindow2.f591j0.setFocusable(true);
/* 33 */                ListPopupWindow listPopupWindow3 = this.f485w;
/* 35 */                ViewOnClickListenerC2129r2 viewOnClickListenerC2129r2 = this.f478b;
/* 37 */                listPopupWindow3.f576a0 = viewOnClickListenerC2129r2;
/* 41 */                listPopupWindow3.f591j0.setOnDismissListener(viewOnClickListenerC2129r2);
                    }
/* 44 */            return this.f485w;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             this.f477a.getClass();
/* 10 */            this.f476V = true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             this.f477a.getClass();
/* 9 */             ViewTreeObserver viewTreeObserver = getViewTreeObserver();
/* 17 */            if (viewTreeObserver.isAlive()) {
/* 21 */                viewTreeObserver.removeGlobalOnLayoutListener(this.f484v);
                    }
/* 28 */            if (m354b()) {
/* 30 */                m353a();
                    }
/* 34 */            this.f476V = false;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 6 */             this.f479c.layout(0, 0, i3 - i, i4 - i2);
/* 13 */            if (m354b()) {
/* 18 */                return;
                    }
/* 15 */            m353a();
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 7 */             if (this.f482f.getVisibility() != 0) {
/* 15 */                i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
                    }
/* 19 */            View view = this.f479c;
/* 21 */            measureChild(view, i, i2);
/* 32 */            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
                }

                public void setActivityChooserModel(AbstractC1912m2 abstractC1912m2) {
/* 1 */             C2092q2 c2092q2 = this.f477a;
/* 7 */             c2092q2.f15367a.f477a.getClass();
/* 10 */            c2092q2.notifyDataSetChanged();
/* 17 */            if (m354b()) {
/* 19 */                m353a();
/* 26 */                if (m354b() || !this.f476V) {
/* 41 */                    return;
                        }
/* 33 */                c2092q2.getClass();
/* 38 */                f42.m3656l("No data model. Did you call #setDataModel?");
                    }
                }

                public void setDefaultActionButtonContentDescription(int i) {
                }

                public void setExpandActivityOverflowButtonContentDescription(int i) {
/* 11 */            this.f481e.setContentDescription(getContext().getString(i));
                }

                public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
/* 3 */             this.f481e.setImageDrawable(drawable);
                }

                public void setInitialActivityCount(int i) {
                }

                public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
/* 1 */             this.f475U = onDismissListener;
                }

                public void setProvider(AbstractC1815k2 abstractC1815k2) {
/* 1 */             this.f483i = abstractC1815k2;
                }

/* 181 */       public ActivityChooserView(Context context, AttributeSet attributeSet) {
/* 182 */           this(context, attributeSet, 0);
                }
            }
