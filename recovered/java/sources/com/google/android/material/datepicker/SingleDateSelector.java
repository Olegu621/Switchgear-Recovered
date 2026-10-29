            package com.google.android.material.datepicker;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.EditText;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Locale;
            import p000.RunnableC2495ye;
            import p000.dd1;
            import p000.h13;
            import p000.jb1;
            import p000.me2;
            import p000.qd3;
            import p000.xe2;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SingleDateSelector implements DateSelector<Long> {
                public static final Parcelable.Creator<SingleDateSelector> CREATOR = new qd3(12);

                /* JADX INFO: renamed from: a */
                public Long f4638a;

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: B0 */
                public final int mo2288B0(Context context) {
/* 9 */             return yy1.m10198D(context, C0356m.class.getCanonicalName(), R$attr.materialCalendarTheme);
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: B1 */
                public final View mo2289B1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, dd1 dd1Var) {
/* 4 */             View viewInflate = layoutInflater.inflate(R$layout.mtrl_picker_text_input_date, viewGroup, false);
/* 15 */            TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R$id.mtrl_picker_text_input_date);
/* 17 */            EditText editText = textInputLayout.getEditText();
/* 25 */            if (jb1.m5758r()) {
/* 29 */                editText.setInputType(17);
                    }
/* 32 */            SimpleDateFormat simpleDateFormatM4083c = h13.m4083c();
/* 40 */            String strM4084d = h13.m4084d(viewInflate.getResources(), simpleDateFormatM4083c);
/* 44 */            textInputLayout.setPlaceholderText(strM4084d);
/* 47 */            Long l = this.f4638a;
/* 49 */            if (l != null) {
/* 55 */                editText.setText(simpleDateFormatM4083c.format(l));
                    }
/* 66 */            editText.addTextChangedListener(new me2(this, strM4084d, simpleDateFormatM4083c, textInputLayout, calendarConstraints, dd1Var));
/* 69 */            editText.requestFocus();
/* 79 */            editText.post(new RunnableC2495ye(editText, 29));
/* 82 */            return viewInflate;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: J0 */
                public final boolean mo2290J0() {
                    return this.f4638a != null;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: Q0 */
                public final ArrayList mo2291Q0() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Long l = this.f4638a;
/* 8 */             if (l != null) {
/* 10 */                arrayList.add(l);
                    }
/* 13 */            return arrayList;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: a1 */
                public final Object mo2292a1() {
/* 1 */             return this.f4638a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: n1 */
                public final void mo2293n1(long j) {
/* 5 */             this.f4638a = Long.valueOf(j);
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: o */
                public final String mo2294o(Context context) {
/* 1 */             Resources resources = context.getResources();
/* 5 */             Long l = this.f4638a;
/* 7 */             if (l == null) {
/* 11 */                return resources.getString(R$string.mtrl_picker_date_header_unselected);
                    }
/* 34 */            return resources.getString(R$string.mtrl_picker_date_header_selected, xe2.m9785w(l.longValue(), Locale.getDefault()));
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: s */
                public final ArrayList mo2295s() {
/* 3 */             return new ArrayList();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeValue(this.f4638a);
                }
            }
