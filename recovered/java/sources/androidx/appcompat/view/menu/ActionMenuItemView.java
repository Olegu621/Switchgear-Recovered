            package androidx.appcompat.view.menu;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.drawable.Drawable;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.widget.Button;
            import androidx.appcompat.R$styleable;
            import androidx.appcompat.widget.AppCompatTextView;
            import p000.AbstractC0201c2;
            import p000.C0165b2;
            import p000.InterfaceC0939g2;
            import p000.gh1;
            import p000.i13;
            import p000.ig1;
            import p000.jg1;
            import p000.sg1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 55 */    public class ActionMenuItemView extends AppCompatTextView implements gh1, View.OnClickListener, InterfaceC0939g2 {

                /* JADX INFO: renamed from: U */
                public Drawable f366U;

                /* JADX INFO: renamed from: V */
                public ig1 f367V;

                /* JADX INFO: renamed from: W */
                public C0165b2 f368W;

                /* JADX INFO: renamed from: a0 */
                public AbstractC0201c2 f369a0;

                /* JADX INFO: renamed from: b0 */
                public boolean f370b0;

                /* JADX INFO: renamed from: c0 */
                public boolean f371c0;

                /* JADX INFO: renamed from: d0 */
                public final int f372d0;

                /* JADX INFO: renamed from: e0 */
                public int f373e0;

                /* JADX INFO: renamed from: f0 */
                public final int f374f0;

                /* JADX INFO: renamed from: v */
                public sg1 f375v;

                /* JADX INFO: renamed from: w */
                public CharSequence f376w;

                public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 4 */             Resources resources = context.getResources();
/* 12 */            this.f370b0 = m328g();
/* 17 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, i, 0);
/* 27 */            this.f372d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
/* 29 */            typedArrayObtainStyledAttributes.recycle();
/* 45 */            this.f374f0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
/* 47 */            setOnClickListener(this);
/* 51 */            this.f373e0 = -1;
/* 53 */            setSaveEnabled(false);
                }

                @Override // p000.InterfaceC0939g2
                /* JADX INFO: renamed from: a */
                public final boolean mo325a() {
/* 9 */             return !TextUtils.isEmpty(getText());
                }

                @Override // p000.InterfaceC0939g2
                /* JADX INFO: renamed from: b */
                public final boolean mo326b() {
                    return !TextUtils.isEmpty(getText()) && this.f375v.getIcon() == null;
                }

                @Override // p000.gh1
                /* JADX INFO: renamed from: c */
                public final void mo327c(sg1 sg1Var) {
/* 1 */             this.f375v = sg1Var;
/* 7 */             setIcon(sg1Var.getIcon());
/* 14 */            setTitle(sg1Var.getTitleCondensed());
/* 19 */            setId(sg1Var.f16583a);
/* 32 */            setVisibility(sg1Var.isVisible() ? 0 : 8);
/* 39 */            setEnabled(sg1Var.isEnabled());
/* 46 */            if (sg1Var.hasSubMenu() && this.f368W == null) {
/* 57 */                this.f368W = new C0165b2(this);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final boolean m328g() {
/* 9 */             Configuration configuration = getContext().getResources().getConfiguration();
/* 13 */            int i = configuration.screenWidthDp;
/* 15 */            int i2 = configuration.screenHeightDp;
/* 19 */            if (i < 480) {
                        return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
                    }
/* 35 */            return true;
                }

                @Override // android.widget.TextView, android.view.View
                public CharSequence getAccessibilityClassName() {
/* 3 */             return Button.class.getName();
                }

                @Override // p000.gh1
                public sg1 getItemData() {
/* 1 */             return this.f375v;
                }

                /* JADX INFO: renamed from: h */
                public final void m329h() {
/* 7 */             boolean z = true;
/* 8 */             boolean z2 = !TextUtils.isEmpty(this.f376w);
/* 11 */            if (this.f366U != null && ((this.f375v.f16607y & 4) != 4 || (!this.f370b0 && !this.f371c0))) {
/* 30 */                z = false;
                    }
/* 31 */            boolean z3 = z2 & z;
/* 39 */            setText(z3 ? this.f376w : null);
/* 44 */            CharSequence charSequence = this.f375v.f16599q;
/* 50 */            if (TextUtils.isEmpty(charSequence)) {
/* 60 */                setContentDescription(z3 ? null : this.f375v.f16587e);
                    } else {
/* 64 */                setContentDescription(charSequence);
                    }
/* 69 */            CharSequence charSequence2 = this.f375v.f16600r;
/* 75 */            if (TextUtils.isEmpty(charSequence2)) {
/* 84 */                i13.m4420B(this, z3 ? null : this.f375v.f16587e);
                    } else {
/* 88 */                i13.m4420B(this, charSequence2);
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             ig1 ig1Var = this.f367V;
/* 3 */             if (ig1Var != null) {
/* 7 */                 ig1Var.mo330a(this.f375v);
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 8 */             this.f370b0 = m328g();
/* 10 */            m329h();
                }

                @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
                public final void onMeasure(int i, int i2) {
                    int i3;
/* 5 */             boolean zIsEmpty = TextUtils.isEmpty(getText());
/* 9 */             if (!zIsEmpty && (i3 = this.f373e0) >= 0) {
/* 27 */                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                    }
/* 30 */            super.onMeasure(i, i2);
/* 33 */            int mode = View.MeasureSpec.getMode(i);
/* 37 */            int size = View.MeasureSpec.getSize(i);
/* 41 */            int measuredWidth = getMeasuredWidth();
/* 47 */            int i4 = this.f372d0;
/* 56 */            int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
/* 59 */            if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
/* 69 */                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
                    }
/* 72 */            if (!zIsEmpty || this.f366U == null) {
/* 110 */               return;
                    }
/* 107 */           super.setPadding((getMeasuredWidth() - this.f366U.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                }

                @Override // android.widget.TextView, android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 2 */             super.onRestoreInstanceState(null);
                }

                @Override // android.widget.TextView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    C0165b2 c0165b2;
/* 7 */             if (this.f375v.hasSubMenu() && (c0165b2 = this.f368W) != null && c0165b2.onTouch(this, motionEvent)) {
/* 19 */                return true;
                    }
/* 21 */            return super.onTouchEvent(motionEvent);
                }

                public void setCheckable(boolean z) {
                }

                public void setChecked(boolean z) {
                }

                public void setExpandedFormat(boolean z) {
/* 3 */             if (this.f371c0 != z) {
/* 5 */                 this.f371c0 = z;
/* 7 */                 sg1 sg1Var = this.f375v;
/* 9 */                 if (sg1Var != null) {
/* 11 */                    jg1 jg1Var = sg1Var.f16596n;
/* 14 */                    jg1Var.f12266k = true;
/* 16 */                    jg1Var.mo5808p(true);
                        }
                    }
                }

                public void setIcon(Drawable drawable) {
/* 1 */             this.f366U = drawable;
/* 3 */             if (drawable != null) {
/* 5 */                 int intrinsicWidth = drawable.getIntrinsicWidth();
/* 9 */                 int intrinsicHeight = drawable.getIntrinsicHeight();
/* 13 */                int i = this.f374f0;
/* 15 */                if (intrinsicWidth > i) {
/* 22 */                    intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
/* 23 */                    intrinsicWidth = i;
                        }
/* 24 */                if (intrinsicHeight > i) {
/* 31 */                    intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
                        } else {
/* 33 */                    i = intrinsicHeight;
                        }
/* 35 */                drawable.setBounds(0, 0, intrinsicWidth, i);
                    }
/* 39 */            setCompoundDrawables(drawable, null, null, null);
/* 42 */            m329h();
                }

                public void setItemInvoker(ig1 ig1Var) {
/* 1 */             this.f367V = ig1Var;
                }

                @Override // android.widget.TextView, android.view.View
                public final void setPadding(int i, int i2, int i3, int i4) {
/* 1 */             this.f373e0 = i;
/* 3 */             super.setPadding(i, i2, i3, i4);
                }

                public void setPopupCallback(AbstractC0201c2 abstractC0201c2) {
/* 1 */             this.f369a0 = abstractC0201c2;
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             this.f376w = charSequence;
/* 3 */             m329h();
                }

/* 56 */        public ActionMenuItemView(Context context, AttributeSet attributeSet) {
/* 57 */            this(context, attributeSet, 0);
                }
            }
