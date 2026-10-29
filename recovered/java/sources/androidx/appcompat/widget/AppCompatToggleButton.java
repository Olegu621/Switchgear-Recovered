            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.widget.ToggleButton;
            import p000.C0013ab;
            import p000.C0173ba;
            import p000.C2212tb;
            import p000.sn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 37 */    public class AppCompatToggleButton extends ToggleButton {

                /* JADX INFO: renamed from: a */
                public final C0173ba f538a;

                /* JADX INFO: renamed from: b */
                public final C2212tb f539b;

                /* JADX INFO: renamed from: c */
                public C0013ab f540c;

                public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 8 */             sn2.m8583a(this, getContext());
/* 13 */            C0173ba c0173ba = new C0173ba(this);
/* 16 */            this.f538a = c0173ba;
/* 18 */            c0173ba.m1304d(attributeSet, i);
/* 23 */            C2212tb c2212tb = new C2212tb(this);
/* 26 */            this.f539b = c2212tb;
/* 28 */            c2212tb.m8764f(attributeSet, i);
/* 35 */            getEmojiTextViewHelper().m140b(attributeSet, i);
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f540c == null) {
/* 10 */                this.f540c = new C0013ab(this);
                    }
/* 12 */            return this.f540c;
                }

                @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f538a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f539b;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f538a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f538a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f539b.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f539b.m8763e();
                }

                @Override // android.widget.TextView
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().m141c(z);
                }

                @Override // android.widget.ToggleButton, android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f538a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f538a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f539b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f539b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().m142d(z);
                }

                @Override // android.widget.TextView
                public void setFilters(InputFilter[] inputFilterArr) {
/* 9 */             super.setFilters(getEmojiTextViewHelper().m139a(inputFilterArr));
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f538a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f538a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f539b;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f539b;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

/* 38 */        public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
/* 39 */            this(context, attributeSet, R.attr.buttonStyleToggle);
                }
            }
