            package com.google.android.material.theme;

            import android.content.Context;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
            import androidx.appcompat.widget.AppCompatButton;
            import androidx.appcompat.widget.AppCompatCheckBox;
            import androidx.appcompat.widget.AppCompatRadioButton;
            import androidx.appcompat.widget.AppCompatTextView;
            import com.google.android.material.button.MaterialButton;
            import com.google.android.material.checkbox.MaterialCheckBox;
            import com.google.android.material.radiobutton.MaterialRadioButton;
            import com.google.android.material.textfield.MaterialAutoCompleteTextView;
            import com.google.android.material.textview.MaterialTextView;
            import p000.C0839dc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MaterialComponentsViewInflater extends C0839dc {
                @Override // p000.C0839dc
                /* JADX INFO: renamed from: a */
                public final AppCompatAutoCompleteTextView mo2421a(Context context, AttributeSet attributeSet) {
/* 3 */             return new MaterialAutoCompleteTextView(context, attributeSet);
                }

                @Override // p000.C0839dc
                /* JADX INFO: renamed from: b */
                public final AppCompatButton mo2422b(Context context, AttributeSet attributeSet) {
/* 3 */             return new MaterialButton(context, attributeSet);
                }

                @Override // p000.C0839dc
                /* JADX INFO: renamed from: c */
                public final AppCompatCheckBox mo2423c(Context context, AttributeSet attributeSet) {
/* 3 */             return new MaterialCheckBox(context, attributeSet);
                }

                @Override // p000.C0839dc
                /* JADX INFO: renamed from: d */
                public final AppCompatRadioButton mo2424d(Context context, AttributeSet attributeSet) {
/* 3 */             return new MaterialRadioButton(context, attributeSet);
                }

                @Override // p000.C0839dc
                /* JADX INFO: renamed from: e */
                public final AppCompatTextView mo2425e(Context context, AttributeSet attributeSet) {
/* 3 */             return new MaterialTextView(context, attributeSet);
                }
            }
