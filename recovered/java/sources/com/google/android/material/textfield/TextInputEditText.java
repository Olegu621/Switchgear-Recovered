            package com.google.android.material.textfield;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import androidx.appcompat.widget.AppCompatEditText;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.hd1;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 46 */    public class TextInputEditText extends AppCompatEditText {

                /* JADX INFO: renamed from: i */
                public final Rect f5000i;

                /* JADX INFO: renamed from: v */
                public boolean f5001v;

                public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
/* 6 */             super(hd1.m4176a(context, attributeSet, i, 0), attributeSet, i);
/* 14 */            this.f5000i = new Rect();
/* 16 */            int[] iArr = R$styleable.TextInputEditText;
/* 18 */            int i2 = R$style.Widget_Design_TextInputEditText;
/* 22 */            rn2.m8210a(context, attributeSet, i, i2);
/* 28 */            rn2.m8211b(context, attributeSet, iArr, i, i2, new int[0]);
/* 31 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 41 */            setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
/* 44 */            typedArrayObtainStyledAttributes.recycle();
                }

                private CharSequence getHintFromLayout() {
/* 1 */             TextInputLayout textInputLayout = getTextInputLayout();
/* 5 */             if (textInputLayout != null) {
/* 7 */                 return textInputLayout.getHint();
                    }
/* 12 */            return null;
                }

                private TextInputLayout getTextInputLayout() {
/* 7 */             for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
/* 11 */                if (parent instanceof TextInputLayout) {
/* 13 */                    return (TextInputLayout) parent;
                        }
                    }
/* 21 */            return null;
                }

                @Override // android.widget.TextView, android.view.View
                public final void getFocusedRect(Rect rect) {
/* 1 */             super.getFocusedRect(rect);
/* 4 */             TextInputLayout textInputLayout = getTextInputLayout();
/* 8 */             if (textInputLayout == null || !this.f5001v || rect == null) {
/* 25 */                return;
                    }
/* 16 */            Rect rect2 = this.f5000i;
/* 18 */            textInputLayout.getFocusedRect(rect2);
/* 23 */            rect.bottom = rect2.bottom;
                }

                @Override // android.view.View
                public final boolean getGlobalVisibleRect(Rect rect, Point point) {
/* 1 */             TextInputLayout textInputLayout = getTextInputLayout();
                    return (textInputLayout == null || !this.f5001v) ? super.getGlobalVisibleRect(rect, point) : textInputLayout.getGlobalVisibleRect(rect, point);
                }

                @Override // android.widget.TextView
                public CharSequence getHint() {
/* 1 */             TextInputLayout textInputLayout = getTextInputLayout();
                    return (textInputLayout == null || !textInputLayout.f5075s0) ? super.getHint() : textInputLayout.getHint();
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             TextInputLayout textInputLayout = getTextInputLayout();
/* 8 */             if (textInputLayout != null && textInputLayout.f5075s0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
/* 38 */                setHint(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
/* 15 */                editorInfo.hintText = getHintFromLayout();
                    }
/* 17 */            return inputConnectionOnCreateInputConnection;
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 4 */             getTextInputLayout();
                }

                @Override // android.view.View
                public final boolean requestRectangleOnScreen(Rect rect) {
/* 1 */             TextInputLayout textInputLayout = getTextInputLayout();
/* 5 */             if (textInputLayout == null || !this.f5001v || rect == null) {
/* 41 */                return super.requestRectangleOnScreen(rect);
                    }
/* 21 */            int height = textInputLayout.getHeight() - getHeight();
/* 22 */            int i = rect.left;
/* 24 */            int i2 = rect.top;
/* 26 */            int i3 = rect.right;
/* 30 */            int i4 = rect.bottom + height;
/* 31 */            Rect rect2 = this.f5000i;
/* 33 */            rect2.set(i, i2, i3, i4);
/* 36 */            return super.requestRectangleOnScreen(rect2);
                }

                public void setTextInputLayoutFocusedRectEnabled(boolean z) {
/* 1 */             this.f5001v = z;
                }

/* 47 */        public TextInputEditText(Context context, AttributeSet attributeSet) {
/* 48 */            this(context, attributeSet, R$attr.editTextStyle);
                }
            }
