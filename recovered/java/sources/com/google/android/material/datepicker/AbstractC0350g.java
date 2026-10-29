            package com.google.android.material.datepicker;

            import android.text.TextUtils;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import p000.dp0;
            import p000.e50;
            import p000.qn2;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0350g extends qn2 {

                /* JADX INFO: renamed from: a */
                public final TextInputLayout f4641a;

                /* JADX INFO: renamed from: b */
                public final SimpleDateFormat f4642b;

                /* JADX INFO: renamed from: c */
                public final CalendarConstraints f4643c;

                /* JADX INFO: renamed from: d */
                public final String f4644d;

                /* JADX INFO: renamed from: e */
                public final dp0 f4645e;

                /* JADX INFO: renamed from: f */
                public e50 f4646f;

                public AbstractC0350g(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
/* 4 */             this.f4642b = simpleDateFormat;
/* 6 */             this.f4641a = textInputLayout;
/* 8 */             this.f4643c = calendarConstraints;
/* 20 */            this.f4644d = textInputLayout.getContext().getString(R$string.mtrl_picker_out_of_range);
/* 29 */            this.f4645e = new dp0(this, str, 5, false);
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo2307a();

                /* JADX INFO: renamed from: b */
                public abstract void mo2308b(Long l);

                @Override // p000.qn2, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             CalendarConstraints calendarConstraints = this.f4643c;
/* 3 */             TextInputLayout textInputLayout = this.f4641a;
/* 5 */             dp0 dp0Var = this.f4645e;
/* 7 */             textInputLayout.removeCallbacks(dp0Var);
/* 12 */            textInputLayout.removeCallbacks(this.f4646f);
/* 16 */            textInputLayout.setError(null);
/* 19 */            mo2308b(null);
/* 26 */            if (TextUtils.isEmpty(charSequence)) {
/* 28 */                return;
                    }
                    try {
/* 37 */                Date date = this.f4642b.parse(charSequence.toString());
/* 41 */                textInputLayout.setError(null);
/* 44 */                long time = date.getTime();
/* 54 */                if (calendarConstraints.f4614c.mo2287E0(time) && calendarConstraints.f4612a.m2302j(1) <= time) {
/* 67 */                    Month month = calendarConstraints.f4613b;
/* 77 */                    if (time <= month.m2302j(month.f4630e)) {
/* 87 */                        mo2308b(Long.valueOf(date.getTime()));
/* 90 */                        return;
                            }
                        }
/* 93 */                e50 e50Var = new e50(this, time);
/* 96 */                this.f4646f = e50Var;
/* 98 */                textInputLayout.postDelayed(e50Var, 1000L);
                    } catch (ParseException unused) {
/* 102 */               textInputLayout.postDelayed(dp0Var, 1000L);
                    }
                }
            }
