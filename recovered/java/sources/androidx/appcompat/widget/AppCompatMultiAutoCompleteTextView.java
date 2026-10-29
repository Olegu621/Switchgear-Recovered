            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.MultiAutoCompleteTextView;
            import androidx.appcompat.R$attr;
            import p000.C0173ba;
            import p000.C0210cb;
            import p000.C2212tb;
            import p000.ac1;
            import p000.j13;
            import p000.mn0;
            import p000.sn2;
            import p000.uo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 123 */   public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

                /* JADX INFO: renamed from: d */
                public static final int[] f511d = {R.attr.popupBackground};

                /* JADX INFO: renamed from: a */
                public final C0173ba f512a;

                /* JADX INFO: renamed from: b */
                public final C2212tb f513b;

                /* JADX INFO: renamed from: c */
                public final C0210cb f514c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 11 */            sn2.m8583a(this, getContext());
/* 20 */            ac1 ac1VarM156H = ac1.m156H(getContext(), attributeSet, f511d, i);
/* 33 */            if (((TypedArray) ac1VarM156H.f178c).hasValue(0)) {
/* 39 */                setDropDownBackgroundDrawable(ac1VarM156H.m184n(0));
                    }
/* 42 */            ac1VarM156H.m168J();
/* 47 */            C0173ba c0173ba = new C0173ba(this);
/* 50 */            this.f512a = c0173ba;
/* 52 */            c0173ba.m1304d(attributeSet, i);
/* 57 */            C2212tb c2212tb = new C2212tb(this);
/* 60 */            this.f513b = c2212tb;
/* 62 */            c2212tb.m8764f(attributeSet, i);
/* 65 */            c2212tb.m8761b();
/* 70 */            C0210cb c0210cb = new C0210cb(this);
/* 73 */            this.f514c = c0210cb;
/* 75 */            c0210cb.mo1568B(attributeSet, i);
/* 78 */            KeyListener keyListener = getKeyListener();
/* 84 */            if (keyListener instanceof NumberKeyListener) {
/* 124 */               return;
                    }
/* 86 */            boolean zIsFocusable = super.isFocusable();
/* 90 */            boolean zIsClickable = super.isClickable();
/* 94 */            boolean zIsLongClickable = super.isLongClickable();
/* 98 */            int inputType = super.getInputType();
/* 102 */           KeyListener keyListenerM1600x = c0210cb.m1600x(keyListener);
/* 106 */           if (keyListenerM1600x == keyListener) {
/* 124 */               return;
                    }
/* 109 */           super.setKeyListener(keyListenerM1600x);
/* 112 */           super.setRawInputType(inputType);
/* 115 */           super.setFocusable(zIsFocusable);
/* 118 */           super.setClickable(zIsClickable);
/* 121 */           super.setLongClickable(zIsLongClickable);
                }

                @Override // android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f512a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f513b;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f512a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f512a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f513b.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f513b.m8763e();
                }

                @Override // android.widget.TextView, android.view.View
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             j13.m5654p(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 10 */            return this.f514c.m1569C(inputConnectionOnCreateInputConnection, editorInfo);
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f512a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f512a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f513b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f513b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.AutoCompleteTextView
                public void setDropDownBackgroundResource(int i) {
/* 9 */             setDropDownBackgroundDrawable(mn0.m6700p(getContext(), i));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 3 */             this.f514c.m1574H(z);
                }

                @Override // android.widget.TextView
                public void setKeyListener(KeyListener keyListener) {
/* 7 */             super.setKeyListener(this.f514c.m1600x(keyListener));
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f512a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f512a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f513b;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f513b;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C2212tb c2212tb = this.f513b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8765g(context, i);
                    }
                }

/* 124 */       public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
/* 125 */           this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
                }
            }
