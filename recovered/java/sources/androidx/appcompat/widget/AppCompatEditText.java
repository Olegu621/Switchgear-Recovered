            package androidx.appcompat.widget;

            import android.app.Activity;
            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.Editable;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.DragEvent;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import android.view.textclassifier.TextClassifier;
            import android.widget.EditText;
            import android.widget.TextView;
            import androidx.appcompat.R$attr;
            import p000.AbstractC0838db;
            import p000.AbstractC1958nb;
            import p000.C0173ba;
            import p000.C0210cb;
            import p000.C2212tb;
            import p000.C2357x6;
            import p000.C2528za;
            import p000.cy0;
            import p000.de3;
            import p000.dq1;
            import p000.dy0;
            import p000.e33;
            import p000.gr0;
            import p000.he3;
            import p000.i00;
            import p000.j00;
            import p000.j13;
            import p000.l00;
            import p000.pn2;
            import p000.sn2;
            import p000.uo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 110 */   public class AppCompatEditText extends EditText implements dq1 {

                /* JADX INFO: renamed from: a */
                public final C0173ba f502a;

                /* JADX INFO: renamed from: b */
                public final C2212tb f503b;

                /* JADX INFO: renamed from: c */
                public final C0210cb f504c;

                /* JADX INFO: renamed from: d */
                public final pn2 f505d;

                /* JADX INFO: renamed from: e */
                public final C0210cb f506e;

                /* JADX INFO: renamed from: f */
                public C2528za f507f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 11 */            sn2.m8583a(this, getContext());
/* 16 */            C0173ba c0173ba = new C0173ba(this);
/* 19 */            this.f502a = c0173ba;
/* 21 */            c0173ba.m1304d(attributeSet, i);
/* 26 */            C2212tb c2212tb = new C2212tb(this);
/* 29 */            this.f503b = c2212tb;
/* 31 */            c2212tb.m8764f(attributeSet, i);
/* 34 */            c2212tb.m8761b();
/* 41 */            C0210cb c0210cb = new C0210cb(7, false);
/* 44 */            c0210cb.f2804b = this;
/* 46 */            this.f504c = c0210cb;
/* 53 */            this.f505d = new pn2();
/* 57 */            C0210cb c0210cb2 = new C0210cb(this);
/* 60 */            this.f506e = c0210cb2;
/* 62 */            c0210cb2.mo1568B(attributeSet, i);
/* 65 */            KeyListener keyListener = getKeyListener();
/* 71 */            if (keyListener instanceof NumberKeyListener) {
/* 111 */               return;
                    }
/* 73 */            boolean zIsFocusable = super.isFocusable();
/* 77 */            boolean zIsClickable = super.isClickable();
/* 81 */            boolean zIsLongClickable = super.isLongClickable();
/* 85 */            int inputType = super.getInputType();
/* 89 */            KeyListener keyListenerM1600x = c0210cb2.m1600x(keyListener);
/* 93 */            if (keyListenerM1600x == keyListener) {
/* 111 */               return;
                    }
/* 96 */            super.setKeyListener(keyListenerM1600x);
/* 99 */            super.setRawInputType(inputType);
/* 102 */           super.setFocusable(zIsFocusable);
/* 105 */           super.setClickable(zIsClickable);
/* 108 */           super.setLongClickable(zIsLongClickable);
                }

                private C2528za getSuperCaller() {
/* 3 */             if (this.f507f == null) {
/* 10 */                this.f507f = new C2528za(this);
                    }
/* 12 */            return this.f507f;
                }

                @Override // p000.dq1
                /* JADX INFO: renamed from: a */
                public final l00 mo356a(l00 l00Var) {
/* 3 */             return this.f505d.m7507a(this, l00Var);
                }

                @Override // android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f502a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f503b;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 5 */             return he3.m4200w(super.getCustomSelectionActionModeCallback());
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f502a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f502a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f503b.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f503b.m8763e();
                }

                @Override // android.widget.EditText, android.widget.TextView
                public Editable getText() {
                    return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
                }

                @Override // android.widget.TextView
                public TextClassifier getTextClassifier() {
                    C0210cb c0210cb;
/* 5 */             if (Build.VERSION.SDK_INT >= 28 || (c0210cb = this.f504c) == null) {
/* 33 */                return super.getTextClassifier();
                    }
/* 14 */            TextClassifier textClassifier = (TextClassifier) c0210cb.f2805c;
                    return textClassifier == null ? AbstractC1958nb.m6957a((TextView) c0210cb.f2804b) : textClassifier;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x003b A[PHI: r1
  0x003b: PHI (r1v9 java.lang.String[]) = (r1v4 java.lang.String[]), (r1v10 java.lang.String[]) binds: [B:23:0x0052, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // android.widget.TextView, android.view.View
                public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                    int i;
                    String[] strArrM3310f;
                    String[] stringArray;
                    InputConnection dy0Var;
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */             this.f503b.getClass();
/* 10 */            C2212tb.m8759h(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 13 */            j13.m5654p(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 16 */            if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrM3310f = e33.m3310f(this)) != null) {
/* 30 */                de3.m3017E(editorInfo, strArrM3310f);
/* 36 */                C2357x6 c2357x6 = new C2357x6(this, 5);
/* 41 */                if (i >= 25) {
/* 45 */                    dy0Var = new cy0(inputConnectionOnCreateInputConnection, c2357x6);
                        } else {
/* 50 */                    String[] strArr = de3.f7143c;
/* 52 */                    if (i >= 25) {
/* 1 */                         stringArray = editorInfo.contentMimeTypes;
/* 58 */                        if (stringArray != null) {
/* 60 */                            strArr = stringArray;
                                }
                            } else {
/* 62 */                        Bundle bundle = editorInfo.extras;
/* 64 */                        if (bundle != null) {
/* 69 */                            stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
/* 73 */                            if (stringArray == null) {
/* 79 */                                stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                                    }
/* 83 */                            if (stringArray != null) {
/* 60 */                                strArr = stringArray;
                                    }
                                }
                            }
/* 87 */                    if (strArr.length != 0) {
/* 92 */                        dy0Var = new dy0(inputConnectionOnCreateInputConnection, c2357x6);
                            }
                        }
/* 48 */                inputConnectionOnCreateInputConnection = dy0Var;
                    }
/* 98 */            return this.f506e.m1569C(inputConnectionOnCreateInputConnection, editorInfo);
                }

                @Override // android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i < 30 || i >= 33) {
/* 29 */                return;
                    }
/* 26 */            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
                }

                @Override // android.widget.TextView, android.view.View
                public final boolean onDragEvent(DragEvent dragEvent) {
                    Activity activity;
/* 6 */             boolean zM2982a = false;
/* 7 */             if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && e33.m3310f(this) != null) {
/* 22 */                Context context = getContext();
                        while (true) {
/* 28 */                    if (!(context instanceof ContextWrapper)) {
/* 44 */                        activity = null;
                                break;
                            }
/* 32 */                    if (context instanceof Activity) {
/* 34 */                        activity = (Activity) context;
                                break;
                            }
/* 39 */                    context = ((ContextWrapper) context).getBaseContext();
                        }
/* 45 */                if (activity == null) {
/* 47 */                    toString();
                        } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
/* 65 */                    zM2982a = AbstractC0838db.m2982a(dragEvent, this, activity);
                        }
                    }
/* 69 */            if (zM2982a) {
/* 5 */                 return true;
                    }
/* 72 */            return super.onDragEvent(dragEvent);
                }

                @Override // android.widget.EditText, android.widget.TextView
                public final boolean onTextContextMenuItem(int i) {
                    j00 j00Var;
                    i00 i00Var;
                    int i2;
                    gr0 gr0Var;
/* 1 */             int i3 = Build.VERSION.SDK_INT;
/* 5 */             if (i3 >= 31 || e33.m3310f(this) == null || !(i == 16908322 || i == 16908337)) {
/* 86 */                return super.onTextContextMenuItem(i);
                    }
/* 34 */            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
/* 40 */            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
/* 45 */            if (primaryClip != null && primaryClip.getItemCount() > 0) {
/* 53 */                if (i3 >= 31) {
/* 57 */                    gr0Var = new gr0(primaryClip, 1);
                        } else {
/* 63 */                    j00Var = new j00();
/* 66 */                    j00Var.f11980b = primaryClip;
/* 68 */                    j00Var.f11981c = 1;
                        }
/* 70 */                if (i == 16908322) {
                            i00Var = j00Var;
                            i00Var = gr0Var;
/* 72 */                    i2 = 0;
                        } else {
                            i00Var = j00Var;
                            i00Var = gr0Var;
/* 74 */                    i2 = 1;
                        }
/* 75 */                i00Var.setFlags(i2);
/* 82 */                e33.m3313i(this, i00Var.build());
                    }
/* 44 */            return true;
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f502a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f502a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f503b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f503b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 5 */             super.setCustomSelectionActionModeCallback(he3.m4201x(callback, this));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 3 */             this.f506e.m1574H(z);
                }

                @Override // android.widget.TextView
                public void setKeyListener(KeyListener keyListener) {
/* 7 */             super.setKeyListener(this.f506e.m1600x(keyListener));
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f502a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f502a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f503b;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f503b;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C2212tb c2212tb = this.f503b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8765g(context, i);
                    }
                }

                @Override // android.widget.TextView
                public void setTextClassifier(TextClassifier textClassifier) {
                    C0210cb c0210cb;
/* 5 */             if (Build.VERSION.SDK_INT >= 28 || (c0210cb = this.f504c) == null) {
/* 21 */                super.setTextClassifier(textClassifier);
                    } else {
/* 12 */                c0210cb.f2805c = textClassifier;
                    }
                }

/* 111 */       public AppCompatEditText(Context context, AttributeSet attributeSet) {
/* 112 */           this(context, attributeSet, R$attr.editTextStyle);
                }
            }
