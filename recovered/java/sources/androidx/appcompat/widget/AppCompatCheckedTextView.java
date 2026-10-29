            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.CheckedTextView;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$styleable;
            import p000.C0013ab;
            import p000.C0173ba;
            import p000.C0837da;
            import p000.C2212tb;
            import p000.ac1;
            import p000.e33;
            import p000.he3;
            import p000.j13;
            import p000.mn0;
            import p000.sn2;
            import p000.uo2;
            import p000.w90;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public class AppCompatCheckedTextView extends CheckedTextView {

                /* JADX INFO: renamed from: a */
                public final C0837da f498a;

                /* JADX INFO: renamed from: b */
                public final C0173ba f499b;

                /* JADX INFO: renamed from: c */
                public final C2212tb f500c;

                /* JADX INFO: renamed from: d */
                public C0013ab f501d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
                    int resourceId;
                    int resourceId2;
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 11 */            sn2.m8583a(this, getContext());
/* 16 */            C2212tb c2212tb = new C2212tb(this);
/* 19 */            this.f500c = c2212tb;
/* 21 */            c2212tb.m8764f(attributeSet, i);
/* 24 */            c2212tb.m8761b();
/* 29 */            C0173ba c0173ba = new C0173ba(this);
/* 32 */            this.f499b = c0173ba;
/* 34 */            c0173ba.m1304d(attributeSet, i);
/* 42 */            this.f498a = new C0837da(this);
/* 50 */            ac1 ac1VarM156H = ac1.m156H(getContext(), attributeSet, R$styleable.CheckedTextView, i);
/* 56 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 72 */            e33.m3317m(this, getContext(), R$styleable.CheckedTextView, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
                    try {
/* 82 */                if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(R$styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                            try {
/* 100 */                       setCheckMarkDrawable(mn0.m6700p(getContext(), resourceId2));
                            } catch (Resources.NotFoundException unused) {
/* 113 */                       if (typedArray.hasValue(R$styleable.CheckedTextView_android_checkMark)) {
/* 131 */                           setCheckMarkDrawable(mn0.m6700p(getContext(), resourceId));
                                }
                            }
                        } else if (typedArray.hasValue(R$styleable.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(R$styleable.CheckedTextView_android_checkMark, 0)) != 0) {
/* 131 */                   setCheckMarkDrawable(mn0.m6700p(getContext(), resourceId));
                        }
/* 140 */               if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkTint)) {
/* 148 */                   setCheckMarkTintList(ac1VarM156H.m183m(R$styleable.CheckedTextView_checkMarkTint));
                        }
/* 157 */               if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkTintMode)) {
/* 171 */                   setCheckMarkTintMode(w90.m9485c(typedArray.getInt(R$styleable.CheckedTextView_checkMarkTintMode, -1), null));
                        }
/* 174 */               ac1VarM156H.m168J();
/* 181 */               getEmojiTextViewHelper().m140b(attributeSet, i);
                    } catch (Throwable th) {
/* 185 */               ac1VarM156H.m168J();
/* 188 */               throw th;
                    }
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f501d == null) {
/* 10 */                this.f501d = new C0013ab(this);
                    }
/* 12 */            return this.f501d;
                }

                @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C2212tb c2212tb = this.f500c;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
/* 11 */            C0173ba c0173ba = this.f499b;
/* 13 */            if (c0173ba != null) {
/* 15 */                c0173ba.m1301a();
                    }
/* 18 */            C0837da c0837da = this.f498a;
/* 20 */            if (c0837da != null) {
/* 22 */                c0837da.m2979b();
                    }
                }

                @Override // android.widget.TextView
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 5 */             return he3.m4200w(super.getCustomSelectionActionModeCallback());
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f499b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f499b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCheckMarkTintList() {
/* 1 */             C0837da c0837da = this.f498a;
/* 3 */             if (c0837da != null) {
/* 5 */                 return c0837da.f7070a;
                    }
/* 8 */             return null;
                }

                public PorterDuff.Mode getSupportCheckMarkTintMode() {
/* 1 */             C0837da c0837da = this.f498a;
/* 3 */             if (c0837da != null) {
/* 5 */                 return c0837da.f7071b;
                    }
/* 8 */             return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f500c.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f500c.m8763e();
                }

                @Override // android.widget.TextView, android.view.View
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             j13.m5654p(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 8 */             return inputConnectionOnCreateInputConnection;
                }

                @Override // android.widget.TextView
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().m141c(z);
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f499b;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f499b;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.CheckedTextView
                public void setCheckMarkDrawable(Drawable drawable) {
/* 1 */             super.setCheckMarkDrawable(drawable);
/* 4 */             C0837da c0837da = this.f498a;
/* 6 */             if (c0837da != null) {
/* 10 */                if (c0837da.f7074e) {
/* 13 */                    c0837da.f7074e = false;
                        } else {
/* 17 */                    c0837da.f7074e = true;
/* 19 */                    c0837da.m2979b();
                        }
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f500c;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f500c;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 5 */             super.setCustomSelectionActionModeCallback(he3.m4201x(callback, this));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().m142d(z);
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f499b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f499b;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
/* 1 */             C0837da c0837da = this.f498a;
/* 3 */             if (c0837da != null) {
/* 5 */                 c0837da.f7070a = colorStateList;
/* 8 */                 c0837da.f7072c = true;
/* 10 */                c0837da.m2979b();
                    }
                }

                public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
/* 1 */             C0837da c0837da = this.f498a;
/* 3 */             if (c0837da != null) {
/* 5 */                 c0837da.f7071b = mode;
/* 8 */                 c0837da.f7073d = true;
/* 10 */                c0837da.m2979b();
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f500c;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f500c;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C2212tb c2212tb = this.f500c;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8765g(context, i);
                    }
                }

                @Override // android.widget.CheckedTextView
/* 22 */        public void setCheckMarkDrawable(int i) {
/* 23 */            setCheckMarkDrawable(mn0.m6700p(getContext(), i));
                }

/* 188 */       public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
/* 189 */           this(context, attributeSet, R$attr.checkedTextViewStyle);
                }
            }
