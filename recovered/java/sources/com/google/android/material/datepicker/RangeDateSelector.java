            package com.google.android.material.datepicker;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.DisplayMetrics;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.EditText;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Calendar;
            import java.util.Locale;
            import p000.RunnableC2495ye;
            import p000.dd1;
            import p000.h13;
            import p000.hr1;
            import p000.jb1;
            import p000.p02;
            import p000.qd3;
            import p000.xe2;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class RangeDateSelector implements DateSelector<hr1> {
                public static final Parcelable.Creator<RangeDateSelector> CREATOR = new qd3(10);

                /* JADX INFO: renamed from: a */
                public String f4633a;

                /* JADX INFO: renamed from: b */
                public Long f4634b;

                /* JADX INFO: renamed from: c */
                public Long f4635c;

                /* JADX INFO: renamed from: d */
                public Long f4636d;

                /* JADX INFO: renamed from: e */
                public Long f4637e;

                /* JADX INFO: renamed from: a */
                public static void m2305a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, dd1 dd1Var) {
/* 1 */             Long l = rangeDateSelector.f4636d;
/* 5 */             if (l == null || rangeDateSelector.f4637e == null) {
/* 60 */                if (textInputLayout.getError() != null && rangeDateSelector.f4633a.contentEquals(textInputLayout.getError())) {
/* 74 */                    textInputLayout.setError(null);
                        }
/* 81 */                if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
/* 93 */                    textInputLayout2.setError(null);
                        }
/* 96 */                dd1Var.m3003a();
/* 99 */                return;
                    }
/* 24 */            if (l.longValue() > rangeDateSelector.f4637e.longValue()) {
/* 45 */                textInputLayout.setError(rangeDateSelector.f4633a);
/* 48 */                textInputLayout2.setError(" ");
/* 51 */                dd1Var.m3003a();
                    } else {
/* 26 */                Long l2 = rangeDateSelector.f4636d;
/* 28 */                rangeDateSelector.f4634b = l2;
/* 30 */                Long l3 = rangeDateSelector.f4637e;
/* 32 */                rangeDateSelector.f4635c = l3;
/* 39 */                dd1Var.m3004b(new hr1(l2, l3));
                    }
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: B0 */
                public final int mo2288B0(Context context) {
/* 1 */             Resources resources = context.getResources();
/* 5 */             DisplayMetrics displayMetrics = resources.getDisplayMetrics();
/* 36 */            return yy1.m10198D(context, C0356m.class.getCanonicalName(), Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R$dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R$attr.materialCalendarTheme : R$attr.materialCalendarFullscreenTheme);
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: B1 */
                public final View mo2289B1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, dd1 dd1Var) {
/* 4 */             View viewInflate = layoutInflater.inflate(R$layout.mtrl_picker_text_input_date_range, viewGroup, false);
/* 15 */            TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R$id.mtrl_picker_text_input_range_start);
/* 24 */            TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R$id.mtrl_picker_text_input_range_end);
/* 26 */            EditText editText = textInputLayout.getEditText();
/* 30 */            EditText editText2 = textInputLayout2.getEditText();
/* 38 */            if (jb1.m5758r()) {
/* 42 */                editText.setInputType(17);
/* 45 */                editText2.setInputType(17);
                    }
/* 58 */            this.f4633a = viewInflate.getResources().getString(R$string.mtrl_picker_invalid_range);
/* 60 */            SimpleDateFormat simpleDateFormatM4083c = h13.m4083c();
/* 64 */            Long l = this.f4634b;
/* 66 */            if (l != null) {
/* 72 */                editText.setText(simpleDateFormatM4083c.format(l));
/* 77 */                this.f4636d = this.f4634b;
                    }
/* 79 */            Long l2 = this.f4635c;
/* 81 */            if (l2 != null) {
/* 87 */                editText2.setText(simpleDateFormatM4083c.format(l2));
/* 92 */                this.f4637e = this.f4635c;
                    }
/* 98 */            String strM4084d = h13.m4084d(viewInflate.getResources(), simpleDateFormatM4083c);
/* 102 */           textInputLayout.setPlaceholderText(strM4084d);
/* 105 */           textInputLayout2.setPlaceholderText(strM4084d);
/* 118 */           editText.addTextChangedListener(new p02(this, strM4084d, simpleDateFormatM4083c, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, dd1Var, 0));
/* 128 */           editText2.addTextChangedListener(new p02(this, strM4084d, simpleDateFormatM4083c, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, dd1Var, 1));
/* 131 */           editText.requestFocus();
/* 141 */           editText.post(new RunnableC2495ye(editText, 29));
/* 144 */           return viewInflate;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: J0 */
                public final boolean mo2290J0() {
/* 1 */             Long l = this.f4634b;
                    return (l == null || this.f4635c == null || l.longValue() > this.f4635c.longValue()) ? false : true;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: Q0 */
                public final ArrayList mo2291Q0() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Long l = this.f4634b;
/* 8 */             if (l != null) {
/* 10 */                arrayList.add(l);
                    }
/* 13 */            Long l2 = this.f4635c;
/* 15 */            if (l2 != null) {
/* 17 */                arrayList.add(l2);
                    }
/* 20 */            return arrayList;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: a1 */
                public final Object mo2292a1() {
/* 7 */             return new hr1(this.f4634b, this.f4635c);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: n1 */
                public final void mo2293n1(long j) {
/* 1 */             Long l = this.f4634b;
/* 3 */             if (l == null) {
/* 9 */                 this.f4634b = Long.valueOf(j);
                    } else if (this.f4635c == null && l.longValue() <= j) {
/* 28 */                this.f4635c = Long.valueOf(j);
                    } else {
/* 32 */                this.f4635c = null;
/* 38 */                this.f4634b = Long.valueOf(j);
                    }
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: o */
                public final String mo2294o(Context context) {
                    hr1 hr1Var;
/* 1 */             Resources resources = context.getResources();
/* 5 */             Long l = this.f4634b;
/* 7 */             if (l == null && this.f4635c == null) {
/* 15 */                return resources.getString(R$string.mtrl_picker_range_header_unselected);
                    }
/* 20 */            Long l2 = this.f4635c;
/* 22 */            if (l2 == null) {
/* 38 */                return resources.getString(R$string.mtrl_picker_range_header_only_start_selected, xe2.m9781s(l.longValue()));
                    }
/* 43 */            if (l == null) {
/* 59 */                return resources.getString(R$string.mtrl_picker_range_header_only_end_selected, xe2.m9781s(l2.longValue()));
                    }
/* 64 */            Calendar calendarM4085e = h13.m4085e();
/* 69 */            Calendar calendarM4086f = h13.m4086f(null);
/* 77 */            calendarM4086f.setTimeInMillis(l.longValue());
/* 80 */            Calendar calendarM4086f2 = h13.m4086f(null);
/* 88 */            calendarM4086f2.setTimeInMillis(l2.longValue());
/* 100 */           if (calendarM4086f.get(1) == calendarM4086f2.get(1)) {
/* 168 */               hr1Var = calendarM4086f.get(1) == calendarM4085e.get(1) ? new hr1(xe2.m9782t(l.longValue(), Locale.getDefault()), xe2.m9782t(l2.longValue(), Locale.getDefault())) : new hr1(xe2.m9782t(l.longValue(), Locale.getDefault()), xe2.m9785w(l2.longValue(), Locale.getDefault()));
                    } else {
/* 198 */               hr1Var = new hr1(xe2.m9785w(l.longValue(), Locale.getDefault()), xe2.m9785w(l2.longValue(), Locale.getDefault()));
                    }
/* 211 */           return resources.getString(R$string.mtrl_picker_range_header_selected, hr1Var.f9210a, hr1Var.f9211b);
                }

                @Override // com.google.android.material.datepicker.DateSelector
                /* JADX INFO: renamed from: s */
                public final ArrayList mo2295s() {
/* 3 */             if (this.f4634b == null || this.f4635c == null) {
/* 30 */                return new ArrayList();
                    }
/* 12 */            ArrayList arrayList = new ArrayList();
/* 24 */            arrayList.add(new hr1(this.f4634b, this.f4635c));
/* 27 */            return arrayList;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeValue(this.f4634b);
/* 8 */             parcel.writeValue(this.f4635c);
                }
            }
