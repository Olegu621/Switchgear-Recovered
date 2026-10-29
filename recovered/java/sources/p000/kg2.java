            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.EditText;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import androidx.appcompat.widget.AppCompatTextView;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$styleable;
            import com.google.android.material.internal.CheckableImageButton;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kg2 extends LinearLayout {

                /* JADX INFO: renamed from: a */
                public final TextInputLayout f12747a;

                /* JADX INFO: renamed from: b */
                public final AppCompatTextView f12748b;

                /* JADX INFO: renamed from: c */
                public CharSequence f12749c;

                /* JADX INFO: renamed from: d */
                public final CheckableImageButton f12750d;

                /* JADX INFO: renamed from: e */
                public ColorStateList f12751e;

                /* JADX INFO: renamed from: f */
                public PorterDuff.Mode f12752f;

                /* JADX INFO: renamed from: i */
                public View.OnLongClickListener f12753i;

                /* JADX INFO: renamed from: v */
                public boolean f12754v;

                public kg2(TextInputLayout textInputLayout, ac1 ac1Var) {
                    CharSequence text;
/* 5 */             super(textInputLayout.getContext());
/* 8 */             this.f12747a = textInputLayout;
/* 12 */            setVisibility(8);
/* 16 */            setOrientation(0);
/* 29 */            setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
/* 46 */            CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_start_icon, (ViewGroup) this, false);
/* 48 */            this.f12750d = checkableImageButton;
/* 57 */            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
/* 60 */            this.f12748b = appCompatTextView;
/* 70 */            if (de3.m3042x(getContext())) {
/* 78 */                ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
                    }
/* 81 */            View.OnLongClickListener onLongClickListener = this.f12753i;
/* 83 */            checkableImageButton.setOnClickListener(null);
/* 86 */            w11.m9395E(checkableImageButton, onLongClickListener);
/* 89 */            this.f12753i = null;
/* 91 */            checkableImageButton.setOnLongClickListener(null);
/* 94 */            w11.m9395E(checkableImageButton, null);
/* 97 */            int i = R$styleable.TextInputLayout_startIconTint;
/* 101 */           TypedArray typedArray = (TypedArray) ac1Var.f178c;
/* 107 */           if (typedArray.hasValue(i)) {
/* 119 */               this.f12751e = de3.m3032n(getContext(), ac1Var, R$styleable.TextInputLayout_startIconTint);
                    }
/* 127 */           if (typedArray.hasValue(R$styleable.TextInputLayout_startIconTintMode)) {
/* 139 */               this.f12752f = kb1.m6039O(typedArray.getInt(R$styleable.TextInputLayout_startIconTintMode, -1), null);
                    }
/* 148 */           if (typedArray.hasValue(R$styleable.TextInputLayout_startIconDrawable)) {
/* 156 */               m6098a(ac1Var.m184n(R$styleable.TextInputLayout_startIconDrawable));
/* 165 */               if (typedArray.hasValue(R$styleable.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(R$styleable.TextInputLayout_startIconContentDescription))) {
/* 179 */                   checkableImageButton.setContentDescription(text);
                        }
/* 188 */               checkableImageButton.setCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_startIconCheckable, true));
                    }
/* 191 */           appCompatTextView.setVisibility(8);
/* 196 */           appCompatTextView.setId(R$id.textinput_prefix_text);
/* 204 */           appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
/* 207 */           WeakHashMap weakHashMap = e33.f7494a;
/* 209 */           appCompatTextView.setAccessibilityLiveRegion(1);
/* 218 */           appCompatTextView.setTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_prefixTextAppearance, 0));
/* 227 */           if (typedArray.hasValue(R$styleable.TextInputLayout_prefixTextColor)) {
/* 235 */               appCompatTextView.setTextColor(ac1Var.m183m(R$styleable.TextInputLayout_prefixTextColor));
                    }
/* 240 */           CharSequence text2 = typedArray.getText(R$styleable.TextInputLayout_prefixText);
/* 252 */           this.f12749c = TextUtils.isEmpty(text2) ? null : text2;
/* 254 */           appCompatTextView.setText(text2);
/* 257 */           m6101d();
/* 260 */           addView(checkableImageButton);
/* 263 */           addView(appCompatTextView);
                }

                /* JADX INFO: renamed from: a */
                public final void m6098a(Drawable drawable) {
/* 1 */             CheckableImageButton checkableImageButton = this.f12750d;
/* 3 */             checkableImageButton.setImageDrawable(drawable);
/* 6 */             if (drawable != null) {
/* 8 */                 ColorStateList colorStateList = this.f12751e;
/* 10 */                PorterDuff.Mode mode = this.f12752f;
/* 12 */                TextInputLayout textInputLayout = this.f12747a;
/* 14 */                w11.m9419b(textInputLayout, checkableImageButton, colorStateList, mode);
/* 18 */                m6099b(true);
/* 23 */                w11.m9394D(textInputLayout, checkableImageButton, this.f12751e);
/* 26 */                return;
                    }
/* 28 */            m6099b(false);
/* 31 */            View.OnLongClickListener onLongClickListener = this.f12753i;
/* 34 */            checkableImageButton.setOnClickListener(null);
/* 37 */            w11.m9395E(checkableImageButton, onLongClickListener);
/* 40 */            this.f12753i = null;
/* 42 */            checkableImageButton.setOnLongClickListener(null);
/* 45 */            w11.m9395E(checkableImageButton, null);
/* 52 */            if (checkableImageButton.getContentDescription() != null) {
/* 54 */                checkableImageButton.setContentDescription(null);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6099b(boolean z) {
/* 1 */             CheckableImageButton checkableImageButton = this.f12750d;
/* 13 */            if ((checkableImageButton.getVisibility() == 0) != z) {
/* 20 */                checkableImageButton.setVisibility(z ? 0 : 8);
/* 23 */                m6100c();
/* 26 */                m6101d();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m6100c() {
                    int paddingStart;
/* 3 */             EditText editText = this.f12747a.f5044e;
/* 5 */             if (editText == null) {
/* 7 */                 return;
                    }
/* 14 */            if (this.f12750d.getVisibility() == 0) {
/* 16 */                paddingStart = 0;
                    } else {
/* 18 */                WeakHashMap weakHashMap = e33.f7494a;
/* 20 */                paddingStart = editText.getPaddingStart();
                    }
/* 24 */            int compoundPaddingTop = editText.getCompoundPaddingTop();
/* 38 */            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
/* 42 */            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
/* 46 */            WeakHashMap weakHashMap2 = e33.f7494a;
/* 50 */            this.f12748b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
                }

                /* JADX INFO: renamed from: d */
                public final void m6101d() {
/* 14 */            int i = (this.f12749c == null || this.f12754v) ? 8 : 0;
/* 26 */            setVisibility((this.f12750d.getVisibility() == 0 || i == 0) ? 0 : 8);
/* 31 */            this.f12748b.setVisibility(i);
/* 36 */            this.f12747a.m2410o();
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 4 */             m6100c();
                }
            }
