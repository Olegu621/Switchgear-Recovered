            package com.google.android.material.timepicker;

            import android.text.Editable;
            import android.text.TextUtils;
            import com.google.android.material.chip.Chip;
            import p000.qn2;
            
            /* JADX INFO: renamed from: com.google.android.material.timepicker.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0379a extends qn2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ChipTextInputComboView f5126a;

                public C0379a(ChipTextInputComboView chipTextInputComboView) {
/* 4 */             this.f5126a = chipTextInputComboView;
                }

                @Override // p000.qn2, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(editable);
/* 5 */             ChipTextInputComboView chipTextInputComboView = this.f5126a;
/* 7 */             Chip chip = chipTextInputComboView.f5091a;
/* 11 */            if (zIsEmpty) {
/* 41 */                chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
                    } else {
/* 75 */                chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
                    }
                }
            }
