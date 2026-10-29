            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Button;
            import androidx.appcompat.R$attr;
            import p000.C0013ab;
            import p000.C0173ba;
            import p000.C0175bc;
            import p000.C2212tb;
            import p000.he3;
            import p000.m53;
            import p000.sn2;
            import p000.uo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public class AppCompatButton extends Button {

                /* JADX INFO: renamed from: a */
                public final C0173ba f491a;

                /* JADX INFO: renamed from: b */
                public final C2212tb f492b;

                /* JADX INFO: renamed from: c */
                public C0013ab f493c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             uo2.m9055a(context);
/* 11 */            sn2.m8583a(this, getContext());
/* 16 */            C0173ba c0173ba = new C0173ba(this);
/* 19 */            this.f491a = c0173ba;
/* 21 */            c0173ba.m1304d(attributeSet, i);
/* 26 */            C2212tb c2212tb = new C2212tb(this);
/* 29 */            this.f492b = c2212tb;
/* 31 */            c2212tb.m8764f(attributeSet, i);
/* 34 */            c2212tb.m8761b();
/* 41 */            getEmojiTextViewHelper().m140b(attributeSet, i);
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f493c == null) {
/* 10 */                this.f493c = new C0013ab(this);
                    }
/* 12 */            return this.f493c;
                }

                @Override // android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             C0173ba c0173ba = this.f491a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1301a();
                    }
/* 11 */            C2212tb c2212tb = this.f492b;
/* 13 */            if (c2212tb != null) {
/* 15 */                c2212tb.m8761b();
                    }
                }

                @Override // android.widget.TextView
                public int getAutoSizeMaxTextSize() {
/* 3 */             if (m53.f13570c) {
/* 5 */                 return super.getAutoSizeMaxTextSize();
                    }
/* 10 */            C2212tb c2212tb = this.f492b;
/* 12 */            if (c2212tb != null) {
/* 18 */                return Math.round(c2212tb.f17021i.f2357e);
                    }
/* 23 */            return -1;
                }

                @Override // android.widget.TextView
                public int getAutoSizeMinTextSize() {
/* 3 */             if (m53.f13570c) {
/* 5 */                 return super.getAutoSizeMinTextSize();
                    }
/* 10 */            C2212tb c2212tb = this.f492b;
/* 12 */            if (c2212tb != null) {
/* 18 */                return Math.round(c2212tb.f17021i.f2356d);
                    }
/* 23 */            return -1;
                }

                @Override // android.widget.TextView
                public int getAutoSizeStepGranularity() {
/* 3 */             if (m53.f13570c) {
/* 5 */                 return super.getAutoSizeStepGranularity();
                    }
/* 10 */            C2212tb c2212tb = this.f492b;
/* 12 */            if (c2212tb != null) {
/* 18 */                return Math.round(c2212tb.f17021i.f2355c);
                    }
/* 23 */            return -1;
                }

                @Override // android.widget.TextView
                public int[] getAutoSizeTextAvailableSizes() {
/* 3 */             if (m53.f13570c) {
/* 5 */                 return super.getAutoSizeTextAvailableSizes();
                    }
/* 10 */            C2212tb c2212tb = this.f492b;
                    return c2212tb != null ? c2212tb.f17021i.f2358f : new int[0];
                }

                @Override // android.widget.TextView
                public int getAutoSizeTextType() {
/* 4 */             if (m53.f13570c) {
                        return super.getAutoSizeTextType() == 1 ? 1 : 0;
                    }
/* 15 */            C2212tb c2212tb = this.f492b;
/* 17 */            if (c2212tb != null) {
/* 21 */                return c2212tb.f17021i.f2353a;
                    }
/* 3 */             return 0;
                }

                @Override // android.widget.TextView
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 5 */             return he3.m4200w(super.getCustomSelectionActionModeCallback());
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             C0173ba c0173ba = this.f491a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1302b();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             C0173ba c0173ba = this.f491a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 return c0173ba.m1303c();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.f492b.m8762d();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.f492b.m8763e();
                }

                @Override // android.view.View
                public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 10 */            accessibilityEvent.setClassName(Button.class.getName());
                }

                @Override // android.view.View
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 10 */            accessibilityNodeInfo.setClassName(Button.class.getName());
                }

                @Override // android.widget.TextView, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             C2212tb c2212tb = this.f492b;
/* 6 */             if (c2212tb == null || m53.f13570c) {
/* 17 */                return;
                    }
/* 14 */            c2212tb.f17021i.m1322a();
                }

                @Override // android.widget.TextView
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
/* 4 */             C2212tb c2212tb = this.f492b;
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
/* 5 */                 super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
/* 8 */                 return;
                    }
/* 9 */             C2212tb c2212tb = this.f492b;
/* 11 */            if (c2212tb != null) {
/* 13 */                c2212tb.m8766i(i, i2, i3, i4);
                    }
                }

                @Override // android.widget.TextView
                public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
/* 3 */             if (m53.f13570c) {
/* 5 */                 super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
/* 8 */                 return;
                    }
/* 9 */             C2212tb c2212tb = this.f492b;
/* 11 */            if (c2212tb != null) {
/* 13 */                c2212tb.m8767j(iArr, i);
                    }
                }

                @Override // android.widget.TextView
                public void setAutoSizeTextTypeWithDefaults(int i) {
/* 3 */             if (m53.f13570c) {
/* 5 */                 super.setAutoSizeTextTypeWithDefaults(i);
/* 8 */                 return;
                    }
/* 9 */             C2212tb c2212tb = this.f492b;
/* 11 */            if (c2212tb != null) {
/* 13 */                c2212tb.m8768k(i);
                    }
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             C0173ba c0173ba = this.f491a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1305e();
                    }
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             C0173ba c0173ba = this.f491a;
/* 6 */             if (c0173ba != null) {
/* 8 */                 c0173ba.m1306f(i);
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

                public void setSupportAllCaps(boolean z) {
/* 1 */             C2212tb c2212tb = this.f492b;
/* 3 */             if (c2212tb != null) {
/* 7 */                 c2212tb.f17013a.setAllCaps(z);
                    }
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             C0173ba c0173ba = this.f491a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1308h(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             C0173ba c0173ba = this.f491a;
/* 3 */             if (c0173ba != null) {
/* 5 */                 c0173ba.m1309i(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             C2212tb c2212tb = this.f492b;
/* 3 */             c2212tb.m8769l(colorStateList);
/* 6 */             c2212tb.m8761b();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             C2212tb c2212tb = this.f492b;
/* 3 */             c2212tb.m8770m(mode);
/* 6 */             c2212tb.m8761b();
                }

                @Override // android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C2212tb c2212tb = this.f492b;
/* 6 */             if (c2212tb != null) {
/* 8 */                 c2212tb.m8765g(context, i);
                    }
                }

                @Override // android.widget.TextView
                public final void setTextSize(int i, float f) {
/* 1 */             boolean z = m53.f13570c;
/* 3 */             if (z) {
/* 5 */                 super.setTextSize(i, f);
/* 8 */                 return;
                    }
/* 9 */             C2212tb c2212tb = this.f492b;
/* 11 */            if (c2212tb != null) {
/* 13 */                C0175bc c0175bc = c2212tb.f17021i;
/* 15 */                if (z || c0175bc.m1324f()) {
/* 26 */                    return;
                        }
/* 23 */                c0175bc.m1325g(f, i);
                    }
                }

/* 44 */        public AppCompatButton(Context context, AttributeSet attributeSet) {
/* 45 */            this(context, attributeSet, R$attr.buttonStyle);
                }
            }
