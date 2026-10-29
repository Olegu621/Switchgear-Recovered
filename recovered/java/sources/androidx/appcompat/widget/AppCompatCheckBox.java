            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.widget.CheckBox;
            import androidx.appcompat.R$attr;
            import p000.C0013ab;
            import p000.C0173ba;
            import p000.C0837da;
            import p000.C2212tb;
            import p000.mn0;
            import p000.sn2;
            import p000.uo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public class AppCompatCheckBox extends CheckBox {

                /* JADX INFO: renamed from: a */
                public final C0837da f494a;

                /* JADX INFO: renamed from: b */
                public final C0173ba f495b;

                /* JADX INFO: renamed from: c */
                public final C2212tb f496c;

                /* JADX INFO: renamed from: d */
                public C0013ab f497d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 11 */            sn2.m8583a(this, getContext());
/* 16 */            C0837da c0837da = new C0837da(this);
/* 19 */            this.f494a = c0837da;
/* 21 */            c0837da.m2980c(attributeSet, i);
/* 26 */            C0173ba c0173ba = new C0173ba(this);
/* 29 */            this.f495b = c0173ba;
/* 31 */            c0173ba.m1304d(attributeSet, i);
/* 36 */            C2212tb c2212tb = new C2212tb(this);
/* 39 */            this.f496c = c2212tb;
/* 41 */            c2212tb.m8764f(attributeSet, i);
/* 48 */            getEmojiTextViewHelper().m140b(attributeSet, i);
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f497d == null) {
/* 10 */                this.f497d = new C0013ab(this);
                    }
/* 12 */            return this.f497d;
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f495b;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f496c;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f495b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f495b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportButtonTintList() {
/* 1 */             C0837da c0837da = this.f494a;
/* 3 */             if (c0837da != null) {
/* 5 */                 return c0837da.f7070a;
                    }
/* 8 */             return null;
                }

                public PorterDuff.Mode getSupportButtonTintMode() {
/* 1 */             C0837da c0837da = this.f494a;
/* 3 */             if (c0837da != null) {
/* 5 */                 return c0837da.f7071b;
                    }
/* 8 */             return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f496c.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f496c.m8763e();
                }

                @Override // android.widget.TextView
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().m141c(z);
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f495b;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f495b;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.CompoundButton
                public void setButtonDrawable(Drawable drawable) {
/* 1 */             super.setButtonDrawable(drawable);
/* 4 */             C0837da c0837da = this.f494a;
/* 6 */             if (c0837da != null) {
/* 10 */                if (c0837da.f7074e) {
/* 13 */                    c0837da.f7074e = false;
                        } else {
/* 17 */                    c0837da.f7074e = true;
/* 19 */                    c0837da.m2978a();
                        }
                    }
                }

                @Override // android.widget.TextView
                public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f496c;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f496c;
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
/* 1 */             C0173ba c0173ba = this.f495b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f495b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportButtonTintList(ColorStateList colorStateList) {
/* 1 */             C0837da c0837da = this.f494a;
/* 3 */             if (c0837da != null) {
/* 5 */                 c0837da.f7070a = colorStateList;
/* 8 */                 c0837da.f7072c = true;
/* 10 */                c0837da.m2978a();
                    }
                }

                public void setSupportButtonTintMode(PorterDuff.Mode mode) {
/* 1 */             C0837da c0837da = this.f494a;
/* 3 */             if (c0837da != null) {
/* 5 */                 c0837da.f7071b = mode;
/* 8 */                 c0837da.f7073d = true;
/* 10 */                c0837da.m2978a();
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f496c;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f496c;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.CompoundButton
/* 22 */        public void setButtonDrawable(int i) {
/* 23 */            setButtonDrawable(mn0.m6700p(getContext(), i));
                }

/* 51 */        public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
/* 52 */            this(context, attributeSet, R$attr.checkboxStyle);
                }
            }
