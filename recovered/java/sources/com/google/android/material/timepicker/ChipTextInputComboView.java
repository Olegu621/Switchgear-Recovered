            package com.google.android.material.timepicker;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.Checkable;
            import android.widget.EditText;
            import android.widget.FrameLayout;
            import com.google.android.material.R$layout;
            import com.google.android.material.chip.Chip;
            import com.google.android.material.textfield.TextInputLayout;
            import p000.RunnableC2495ye;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 88 */    class ChipTextInputComboView extends FrameLayout implements Checkable {

                /* JADX INFO: renamed from: a */
                public final Chip f5091a;

                /* JADX INFO: renamed from: b */
                public final EditText f5092b;

                public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 4 */             LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
/* 15 */            Chip chip = (Chip) layoutInflaterFrom.inflate(R$layout.material_time_chip, (ViewGroup) this, false);
/* 17 */            this.f5091a = chip;
/* 21 */            chip.setAccessibilityClassName("android.view.View");
/* 30 */            TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R$layout.material_time_input, (ViewGroup) this, false);
/* 32 */            EditText editText = textInputLayout.getEditText();
/* 36 */            this.f5092b = editText;
/* 39 */            editText.setVisibility(4);
/* 47 */            editText.addTextChangedListener(new C0379a(this));
/* 66 */            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
/* 69 */            addView(chip);
/* 72 */            addView(textInputLayout);
/* 83 */            editText.setSaveEnabled(false);
/* 86 */            editText.setLongClickable(false);
                }

                @Override // android.widget.Checkable
                public final boolean isChecked() {
/* 3 */             return this.f5091a.isChecked();
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 22 */            this.f5092b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
                }

                @Override // android.widget.Checkable
                public final void setChecked(boolean z) {
/* 1 */             Chip chip = this.f5091a;
/* 3 */             chip.setChecked(z);
/* 11 */            int i = z ? 0 : 4;
/* 12 */            EditText editText = this.f5092b;
/* 14 */            editText.setVisibility(i);
/* 21 */            chip.setVisibility(z ? 8 : 0);
/* 28 */            if (chip.isChecked()) {
/* 30 */                editText.requestFocus();
/* 40 */                editText.post(new RunnableC2495ye(editText, 29));
/* 51 */                if (TextUtils.isEmpty(editText.getText())) {
/* 64 */                    return;
                        }
/* 61 */                editText.setSelection(editText.getText().length());
                    }
                }

                @Override // android.view.View
                public final void setOnClickListener(View.OnClickListener onClickListener) {
/* 3 */             this.f5091a.setOnClickListener(onClickListener);
                }

                @Override // android.view.View
                public final void setTag(int i, Object obj) {
/* 3 */             this.f5091a.setTag(i, obj);
                }

                @Override // android.widget.Checkable
                public final void toggle() {
/* 3 */             this.f5091a.toggle();
                }

/* 89 */        public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
/* 90 */            this(context, attributeSet, 0);
                }
            }
