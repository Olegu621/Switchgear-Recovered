            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.text.InputFilter;
            import android.text.TextDirectionHeuristic;
            import android.text.TextDirectionHeuristics;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import android.view.textclassifier.TextClassifier;
            import android.widget.TextView;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            import p000.AbstractC1958nb;
            import p000.C0013ab;
            import p000.C0173ba;
            import p000.C0175bc;
            import p000.C0210cb;
            import p000.C1951n4;
            import p000.C2212tb;
            import p000.C2287vb;
            import p000.C2325wb;
            import p000.InterfaceC2249ub;
            import p000.gr0;
            import p000.he3;
            import p000.hu0;
            import p000.j13;
            import p000.kn2;
            import p000.ks2;
            import p000.m53;
            import p000.mn0;
            import p000.nn2;
            import p000.sn2;
            import p000.st1;
            import p000.tt1;
            import p000.uo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public class AppCompatTextView extends TextView {

                /* JADX INFO: renamed from: a */
                public final C0173ba f531a;

                /* JADX INFO: renamed from: b */
                public final C2212tb f532b;

                /* JADX INFO: renamed from: c */
                public final C0210cb f533c;

                /* JADX INFO: renamed from: d */
                public C0013ab f534d;

                /* JADX INFO: renamed from: e */
                public boolean f535e;

                /* JADX INFO: renamed from: f */
                public gr0 f536f;

                /* JADX INFO: renamed from: i */
                public Future f537i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 8 */             this.f535e = false;
/* 11 */            this.f536f = null;
/* 17 */            sn2.m8583a(this, getContext());
/* 22 */            C0173ba c0173ba = new C0173ba(this);
/* 25 */            this.f531a = c0173ba;
/* 27 */            c0173ba.m1304d(attributeSet, i);
/* 32 */            C2212tb c2212tb = new C2212tb(this);
/* 35 */            this.f532b = c2212tb;
/* 37 */            c2212tb.m8764f(attributeSet, i);
/* 40 */            c2212tb.m8761b();
/* 46 */            C0210cb c0210cb = new C0210cb(7, false);
/* 49 */            c0210cb.f2804b = this;
/* 51 */            this.f533c = c0210cb;
/* 57 */            getEmojiTextViewHelper().m140b(attributeSet, i);
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f534d == null) {
/* 10 */                this.f534d = new C0013ab(this);
                    }
/* 12 */            return this.f534d;
                }

                @Override // android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f531a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f532b;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public int getAutoSizeMaxTextSize() {
/* 3 */             if (m53.f13570c) {
/* 15 */                return super.getAutoSizeMaxTextSize();
                    }
/* 20 */            C2212tb c2212tb = this.f532b;
/* 22 */            if (c2212tb != null) {
/* 28 */                return Math.round(c2212tb.f17021i.f2357e);
                    }
/* 33 */            return -1;
                }

                @Override // android.widget.TextView
                public int getAutoSizeMinTextSize() {
/* 3 */             if (m53.f13570c) {
/* 15 */                return super.getAutoSizeMinTextSize();
                    }
/* 20 */            C2212tb c2212tb = this.f532b;
/* 22 */            if (c2212tb != null) {
/* 28 */                return Math.round(c2212tb.f17021i.f2356d);
                    }
/* 33 */            return -1;
                }

                @Override // android.widget.TextView
                public int getAutoSizeStepGranularity() {
/* 3 */             if (m53.f13570c) {
/* 15 */                return super.getAutoSizeStepGranularity();
                    }
/* 20 */            C2212tb c2212tb = this.f532b;
/* 22 */            if (c2212tb != null) {
/* 28 */                return Math.round(c2212tb.f17021i.f2355c);
                    }
/* 33 */            return -1;
                }

                @Override // android.widget.TextView
                public int[] getAutoSizeTextAvailableSizes() {
/* 3 */             if (m53.f13570c) {
/* 15 */                return super.getAutoSizeTextAvailableSizes();
                    }
/* 20 */            C2212tb c2212tb = this.f532b;
                    return c2212tb != null ? c2212tb.f17021i.f2358f : new int[0];
                }

                @Override // android.widget.TextView
                public int getAutoSizeTextType() {
/* 3 */             if (m53.f13570c) {
                        return super.getAutoSizeTextType() == 1 ? 1 : 0;
                    }
/* 23 */            C2212tb c2212tb = this.f532b;
/* 25 */            if (c2212tb != null) {
/* 29 */                return c2212tb.f17021i.f2353a;
                    }
/* 32 */            return 0;
                }

                @Override // android.widget.TextView
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 5 */             return he3.m4200w(super.getCustomSelectionActionModeCallback());
                }

                @Override // android.widget.TextView
                public int getFirstBaselineToTopHeight() {
/* 15 */            return getPaddingTop() - getPaint().getFontMetricsInt().top;
                }

                @Override // android.widget.TextView
                public int getLastBaselineToBottomHeight() {
/* 15 */            return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
                }

                public InterfaceC2249ub getSuperCaller() {
/* 3 */             if (this.f536f == null) {
/* 5 */                 int i = Build.VERSION.SDK_INT;
/* 9 */                 if (i >= 34) {
/* 16 */                    this.f536f = new C2325wb(this);
                        } else if (i >= 28) {
/* 28 */                    this.f536f = new C2287vb(this);
                        } else if (i >= 26) {
/* 40 */                    this.f536f = new gr0(this);
                        }
                    }
/* 42 */            return this.f536f;
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f531a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f531a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f532b.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f532b.m8763e();
                }

                @Override // android.widget.TextView
                public CharSequence getText() {
/* 1 */             Future future = this.f537i;
/* 3 */             if (future != null) {
                        try {
/* 7 */                     this.f537i = null;
/* 13 */                    if (future.get() != null) {
/* 31 */                        throw new ClassCastException();
                            }
/* 19 */                    if (Build.VERSION.SDK_INT >= 29) {
/* 21 */                        throw null;
                            }
/* 22 */                    he3.m4187h(this);
/* 25 */                    throw null;
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
/* 32 */            return super.getText();
                }

                @Override // android.widget.TextView
                public TextClassifier getTextClassifier() {
                    C0210cb c0210cb;
/* 5 */             if (Build.VERSION.SDK_INT >= 28 || (c0210cb = this.f533c) == null) {
/* 37 */                return super.getTextClassifier();
                    }
/* 14 */            TextClassifier textClassifier = (TextClassifier) c0210cb.f2805c;
                    return textClassifier == null ? AbstractC1958nb.m6957a((TextView) c0210cb.f2804b) : textClassifier;
                }

                public st1 getTextMetricsParamsCompat() {
/* 1 */             return he3.m4187h(this);
                }

                @Override // android.widget.TextView, android.view.View
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */             this.f532b.getClass();
/* 10 */            C2212tb.m8759h(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 13 */            j13.m5654p(editorInfo, inputConnectionOnCreateInputConnection, this);
/* 16 */            return inputConnectionOnCreateInputConnection;
                }

                @Override // android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
/* 35 */                return;
                    }
/* 32 */            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
                }

                @Override // android.widget.TextView, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             C2212tb c2212tb = this.f532b;
/* 6 */             if (c2212tb == null || m53.f13570c) {
/* 17 */                return;
                    }
/* 14 */            c2212tb.f17021i.m1322a();
                }

                @Override // android.widget.TextView, android.view.View
                public void onMeasure(int i, int i2) {
/* 1 */             Future future = this.f537i;
/* 3 */             if (future != null) {
                        try {
/* 7 */                     this.f537i = null;
/* 13 */                    if (future.get() != null) {
/* 31 */                        throw new ClassCastException();
                            }
/* 19 */                    if (Build.VERSION.SDK_INT >= 29) {
/* 21 */                        throw null;
                            }
/* 22 */                    he3.m4187h(this);
/* 25 */                    throw null;
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
/* 32 */            super.onMeasure(i, i2);
                }

                @Override // android.widget.TextView
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
/* 4 */             C2212tb c2212tb = this.f532b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 C0175bc c0175bc = c2212tb.f17021i;
/* 12 */                if (m53.f13570c || !c0175bc.m1324f()) {
/* 23 */                    return;
                        }
/* 20 */                c0175bc.m1322a();
                    }
                }

                @Override // android.widget.TextView
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().m141c(z);
                }

                @Override // android.widget.TextView
                public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
/* 3 */             if (m53.f13570c) {
/* 15 */                super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
/* 18 */                return;
                    }
/* 19 */            C2212tb c2212tb = this.f532b;
/* 21 */            if (c2212tb != null) {
/* 23 */                c2212tb.m8766i(i, i2, i3, i4);
                    }
                }

                @Override // android.widget.TextView
                public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
/* 3 */             if (m53.f13570c) {
/* 15 */                super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
/* 18 */                return;
                    }
/* 19 */            C2212tb c2212tb = this.f532b;
/* 21 */            if (c2212tb != null) {
/* 23 */                c2212tb.m8767j(iArr, i);
                    }
                }

                @Override // android.widget.TextView
                public void setAutoSizeTextTypeWithDefaults(int i) {
/* 3 */             if (m53.f13570c) {
/* 15 */                super.setAutoSizeTextTypeWithDefaults(i);
/* 18 */                return;
                    }
/* 19 */            C2212tb c2212tb = this.f532b;
/* 21 */            if (c2212tb != null) {
/* 23 */                c2212tb.m8768k(i);
                    }
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f531a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f531a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f532b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             C2212tb c2212tb = this.f532b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             Context context = getContext();
/* 36 */            setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? mn0.m6700p(context, i) : null, i2 != 0 ? mn0.m6700p(context, i2) : null, i3 != 0 ? mn0.m6700p(context, i3) : null, i4 != 0 ? mn0.m6700p(context, i4) : null);
/* 39 */            C2212tb c2212tb = this.f532b;
/* 41 */            if (c2212tb != null) {
/* 43 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             Context context = getContext();
/* 36 */            setCompoundDrawablesWithIntrinsicBounds(i != 0 ? mn0.m6700p(context, i) : null, i2 != 0 ? mn0.m6700p(context, i2) : null, i3 != 0 ? mn0.m6700p(context, i3) : null, i4 != 0 ? mn0.m6700p(context, i4) : null);
/* 39 */            C2212tb c2212tb = this.f532b;
/* 41 */            if (c2212tb != null) {
/* 43 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 5 */             super.setCustomSelectionActionModeCallback(he3.m4201x(callback, this));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().m142d(z);
                }

                @Override // android.widget.TextView
                public void setFilters(InputFilter[] inputFilterArr) {
/* 9 */             super.setFilters(getEmojiTextViewHelper().m139a(inputFilterArr));
                }

                @Override // android.widget.TextView
                public void setFirstBaselineToTopHeight(int i) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                getSuperCaller().mo3998m(i);
                    } else {
/* 15 */                he3.m4191n(this, i);
                    }
                }

                @Override // android.widget.TextView
                public void setLastBaselineToBottomHeight(int i) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 11 */                getSuperCaller().mo3996i(i);
                    } else {
/* 15 */                he3.m4192o(this, i);
                    }
                }

                @Override // android.widget.TextView
                public final void setLineHeight(int i, float f) {
/* 1 */             int i2 = Build.VERSION.SDK_INT;
/* 5 */             if (i2 >= 34) {
/* 11 */                getSuperCaller().mo3999n(i, f);
                    } else if (i2 >= 34) {
/* 17 */                nn2.m7015a(this, i, f);
                    } else {
/* 37 */                he3.m4194q(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
                    }
                }

                public void setPrecomputedText(tt1 tt1Var) {
/* 6 */             if (Build.VERSION.SDK_INT >= 29) {
/* 8 */                 throw null;
                    }
/* 9 */             he3.m4187h(this);
/* 12 */            throw null;
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f531a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f531a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f532b;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f532b;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.TextView
                public void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C2212tb c2212tb = this.f532b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8765g(context, i);
                    }
                }

                @Override // android.widget.TextView
                public void setTextClassifier(TextClassifier textClassifier) {
                    C0210cb c0210cb;
/* 5 */             if (Build.VERSION.SDK_INT >= 28 || (c0210cb = this.f533c) == null) {
/* 25 */                super.setTextClassifier(textClassifier);
                    } else {
/* 12 */                c0210cb.f2805c = textClassifier;
                    }
                }

                public void setTextFuture(Future<tt1> future) {
/* 1 */             this.f537i = future;
/* 3 */             if (future != null) {
/* 5 */                 requestLayout();
                    }
                }

                public void setTextMetricsParamsCompat(st1 st1Var) {
                    TextDirectionHeuristic textDirectionHeuristic;
/* 1 */             TextDirectionHeuristic textDirectionHeuristic2 = st1Var.f16771b;
/* 3 */             TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* 5 */             int i = 1;
/* 6 */             if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
/* 16 */                if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
/* 18 */                    i = 2;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
/* 24 */                    i = 3;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
/* 30 */                    i = 4;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
/* 36 */                    i = 5;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
/* 40 */                    i = 6;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
/* 44 */                    i = 7;
                        }
                    }
/* 45 */            setTextDirection(i);
/* 54 */            getPaint().set(st1Var.f16770a);
/* 59 */            kn2.m6148e(this, st1Var.f16772c);
/* 64 */            kn2.m6151h(this, st1Var.f16773d);
                }

                @Override // android.widget.TextView
                public final void setTextSize(int i, float f) {
/* 1 */             boolean z = m53.f13570c;
/* 3 */             if (z) {
/* 5 */                 super.setTextSize(i, f);
/* 8 */                 return;
                    }
/* 9 */             C2212tb c2212tb = this.f532b;
/* 11 */            if (c2212tb != null) {
/* 13 */                C0175bc c0175bc = c2212tb.f17021i;
/* 15 */                if (z || c0175bc.m1324f()) {
/* 26 */                    return;
                        }
/* 23 */                c0175bc.m1325g(f, i);
                    }
                }

                @Override // android.widget.TextView
                public final void setTypeface(Typeface typeface, int i) {
                    Typeface typefaceCreate;
/* 3 */             if (this.f535e) {
/* 5 */                 return;
                    }
/* 6 */             if (typeface == null || i <= 0) {
/* 29 */                typefaceCreate = null;
                    } else {
/* 10 */                Context context = getContext();
/* 14 */                hu0 hu0Var = ks2.f12997a;
/* 16 */                if (context == null) {
/* 25 */                    C1951n4.m6859j("Context cannot be null");
/* 28 */                    return;
                        }
/* 18 */                typefaceCreate = Typeface.create(typeface, i);
                    }
/* 31 */            this.f535e = true;
/* 33 */            if (typefaceCreate != null) {
/* 35 */                typeface = typefaceCreate;
                    }
                    try {
/* 37 */                super.setTypeface(typeface, i);
                    } finally {
/* 44 */                this.f535e = false;
                    }
                }

                @Override // android.widget.TextView
/* 40 */        public void setLineHeight(int i) {
/* 41 */            he3.m4194q(this, i);
                }

                @Override // android.widget.TextView
/* 46 */        public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 47 */            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
/* 48 */            C2212tb c2212tb = this.f532b;
                    if (c2212tb != null) {
/* 49 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
/* 46 */        public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 47 */            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
/* 48 */            C2212tb c2212tb = this.f532b;
                    if (c2212tb != null) {
/* 49 */                c2212tb.m8761b();
                    }
                }

/* 60 */        public AppCompatTextView(Context context, AttributeSet attributeSet) {
/* 61 */            this(context, attributeSet, R.attr.textViewStyle);
                }
            }
