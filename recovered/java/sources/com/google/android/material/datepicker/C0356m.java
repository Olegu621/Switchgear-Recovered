            package com.google.android.material.datepicker;

            import android.R;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.StateListDrawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0086a;
            import androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import com.google.android.material.R$style;
            import com.google.android.material.internal.CheckableImageButton;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.WeakHashMap;
            import p000.AbstractC0196bx;
            import p000.C1951n4;
            import p000.bd1;
            import p000.cd1;
            import p000.dd1;
            import p000.e33;
            import p000.f42;
            import p000.fd1;
            import p000.gd1;
            import p000.h13;
            import p000.jy0;
            import p000.mn0;
            import p000.n83;
            import p000.o83;
            import p000.p83;
            import p000.pg3;
            import p000.q73;
            import p000.s23;
            import p000.s80;
            import p000.xe2;
            import p000.yy1;
            import p000.zr1;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0356m<S> extends DialogInterfaceOnCancelListenerC0097i {

                /* JADX INFO: renamed from: b0 */
                public final LinkedHashSet f4667b0 = new LinkedHashSet();

                /* JADX INFO: renamed from: c0 */
                public final LinkedHashSet f4668c0 = new LinkedHashSet();

                /* JADX INFO: renamed from: d0 */
                public final LinkedHashSet f4669d0 = new LinkedHashSet();

                /* JADX INFO: renamed from: e0 */
                public final LinkedHashSet f4670e0 = new LinkedHashSet();

                /* JADX INFO: renamed from: f0 */
                public int f4671f0;

                /* JADX INFO: renamed from: g0 */
                public DateSelector f4672g0;

                /* JADX INFO: renamed from: h0 */
                public zr1 f4673h0;

                /* JADX INFO: renamed from: i0 */
                public CalendarConstraints f4674i0;

                /* JADX INFO: renamed from: j0 */
                public C0355l f4675j0;

                /* JADX INFO: renamed from: k0 */
                public int f4676k0;

                /* JADX INFO: renamed from: l0 */
                public CharSequence f4677l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f4678m0;

                /* JADX INFO: renamed from: n0 */
                public int f4679n0;

                /* JADX INFO: renamed from: o0 */
                public int f4680o0;

                /* JADX INFO: renamed from: p0 */
                public CharSequence f4681p0;

                /* JADX INFO: renamed from: q0 */
                public int f4682q0;

                /* JADX INFO: renamed from: r0 */
                public CharSequence f4683r0;

                /* JADX INFO: renamed from: s0 */
                public TextView f4684s0;

                /* JADX INFO: renamed from: t0 */
                public CheckableImageButton f4685t0;

                /* JADX INFO: renamed from: u0 */
                public fd1 f4686u0;

                /* JADX INFO: renamed from: v0 */
                public Button f4687v0;

                /* JADX INFO: renamed from: w0 */
                public boolean f4688w0;

                /* JADX INFO: renamed from: j */
                public static int m2314j(Context context) {
/* 1 */             Resources resources = context.getResources();
/* 7 */             int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
/* 17 */            Month month = new Month(h13.m4085e());
/* 22 */            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width);
/* 28 */            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding);
/* 34 */            int i = month.f4629d;
/* 41 */            return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
                }

                /* JADX INFO: renamed from: k */
                public static boolean m2315k(Context context, int i) {
/* 17 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(yy1.m10198D(context, C0355l.class.getCanonicalName(), R$attr.materialCalendarStyle), new int[]{i});
/* 22 */            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
/* 26 */            typedArrayObtainStyledAttributes.recycle();
/* 29 */            return z;
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i
                /* JADX INFO: renamed from: h */
                public final Dialog mo667h() {
/* 3 */             Context contextRequireContext = requireContext();
/* 7 */             Context contextRequireContext2 = requireContext();
/* 11 */            int iMo2288B0 = this.f4671f0;
/* 13 */            if (iMo2288B0 == 0) {
/* 20 */                iMo2288B0 = m2316i().mo2288B0(contextRequireContext2);
                    }
/* 24 */            Dialog dialog = new Dialog(contextRequireContext, iMo2288B0);
/* 27 */            Context context = dialog.getContext();
/* 38 */            this.f4678m0 = m2315k(context, R.attr.windowFullscreen);
/* 48 */            int iM10198D = yy1.m10198D(context, C0356m.class.getCanonicalName(), R$attr.colorSurface);
/* 59 */            fd1 fd1Var = new fd1(context, null, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
/* 62 */            this.f4686u0 = fd1Var;
/* 64 */            fd1Var.m3739k(context);
/* 73 */            this.f4686u0.m3742n(ColorStateList.valueOf(iM10198D));
/* 76 */            fd1 fd1Var2 = this.f4686u0;
/* 82 */            View decorView = dialog.getWindow().getDecorView();
/* 86 */            WeakHashMap weakHashMap = e33.f7494a;
/* 92 */            fd1Var2.m3741m(s23.m8371i(decorView));
/* 95 */            return dialog;
                }

                /* JADX INFO: renamed from: i */
                public final DateSelector m2316i() {
/* 3 */             if (this.f4672g0 == null) {
/* 17 */                this.f4672g0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
                    }
/* 19 */            return this.f4672g0;
                }

                /* JADX INFO: renamed from: l */
                public final void m2317l() {
/* 1 */             Context contextRequireContext = requireContext();
/* 5 */             int iMo2288B0 = this.f4671f0;
/* 7 */             if (iMo2288B0 == 0) {
/* 14 */                iMo2288B0 = m2316i().mo2288B0(contextRequireContext);
                    }
/* 18 */            DateSelector dateSelectorM2316i = m2316i();
/* 22 */            CalendarConstraints calendarConstraints = this.f4674i0;
/* 26 */            C0355l c0355l = new C0355l();
/* 31 */            Bundle bundle = new Bundle();
/* 36 */            bundle.putInt("THEME_RES_ID_KEY", iMo2288B0);
/* 41 */            bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorM2316i);
/* 46 */            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
/* 53 */            bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f4615d);
/* 56 */            c0355l.setArguments(bundle);
/* 59 */            this.f4675j0 = c0355l;
                    zr1 zr1Var = c0355l;
/* 65 */            if (this.f4685t0.f4781d) {
/* 67 */                DateSelector dateSelectorM2316i2 = m2316i();
/* 71 */                CalendarConstraints calendarConstraints2 = this.f4674i0;
/* 75 */                gd1 gd1Var = new gd1();
/* 80 */                Bundle bundle2 = new Bundle();
/* 83 */                bundle2.putInt("THEME_RES_ID_KEY", iMo2288B0);
/* 88 */                bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorM2316i2);
/* 91 */                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
/* 94 */                gd1Var.setArguments(bundle2);
/* 97 */                zr1Var = gd1Var;
                    }
/* 98 */            this.f4673h0 = zr1Var;
/* 100 */           m2318m();
/* 103 */           AbstractC0111w childFragmentManager = getChildFragmentManager();
/* 107 */           childFragmentManager.getClass();
/* 112 */           C0086a c0086a = new C0086a(childFragmentManager);
/* 115 */           int i = R$id.mtrl_calendar_frame;
/* 117 */           zr1 zr1Var2 = this.f4673h0;
/* 119 */           if (i == 0) {
/* 157 */               C1951n4.m6859j("Must use non-zero containerViewId");
/* 160 */               return;
                    }
/* 123 */           c0086a.m639e(i, zr1Var2, null, 2);
/* 128 */           if (c0086a.f1391g) {
/* 151 */               f42.m3656l("This transaction is already being added to the back stack");
/* 154 */               return;
                    }
/* 131 */           c0086a.f1392h = false;
/* 135 */           c0086a.f1401q.m677A(c0086a, false);
/* 145 */           this.f4673h0.mo2311g(new dd1(this, 0));
                }

                /* JADX INFO: renamed from: m */
                public final void m2318m() {
/* 9 */             String strMo2294o = m2316i().mo2294o(getContext());
/* 29 */            this.f4684s0.setContentDescription(String.format(getString(R$string.mtrl_picker_announce_current_selection), strMo2294o));
/* 34 */            this.f4684s0.setText(strMo2294o);
                }

                /* JADX INFO: renamed from: n */
                public final void m2319n(CheckableImageButton checkableImageButton) {
/* 30 */            this.f4685t0.setContentDescription(this.f4685t0.f4781d ? checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode));
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 3 */             Iterator it = this.f4669d0.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
                    }
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, androidx.fragment.app.Fragment
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle == null) {
/* 6 */                 bundle = getArguments();
                    }
/* 16 */            this.f4671f0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
/* 26 */            this.f4672g0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
/* 36 */            this.f4674i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
/* 44 */            this.f4676k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
/* 52 */            this.f4677l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
/* 60 */            this.f4679n0 = bundle.getInt("INPUT_MODE_KEY");
/* 68 */            this.f4680o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
/* 76 */            this.f4681p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
/* 84 */            this.f4682q0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
/* 92 */            this.f4683r0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                }

                @Override // androidx.fragment.app.Fragment
                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 10 */            View viewInflate = layoutInflater.inflate(this.f4678m0 ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog, viewGroup);
/* 14 */            Context context = viewInflate.getContext();
/* 20 */            if (this.f4678m0) {
/* 38 */                viewInflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2314j(context), -2));
                    } else {
/* 58 */                viewInflate.findViewById(R$id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m2314j(context), -1));
                    }
/* 67 */            TextView textView = (TextView) viewInflate.findViewById(R$id.mtrl_picker_header_selection_text);
/* 69 */            this.f4684s0 = textView;
/* 71 */            WeakHashMap weakHashMap = e33.f7494a;
/* 73 */            int i = 1;
/* 74 */            textView.setAccessibilityLiveRegion(1);
/* 85 */            this.f4685t0 = (CheckableImageButton) viewInflate.findViewById(R$id.mtrl_picker_header_toggle);
/* 93 */            TextView textView2 = (TextView) viewInflate.findViewById(R$id.mtrl_picker_title_text);
/* 95 */            CharSequence charSequence = this.f4677l0;
/* 97 */            if (charSequence != null) {
/* 99 */                textView2.setText(charSequence);
                    } else {
/* 105 */               textView2.setText(this.f4676k0);
                    }
/* 112 */           this.f4685t0.setTag("TOGGLE_BUTTON_TAG");
/* 115 */           CheckableImageButton checkableImageButton = this.f4685t0;
/* 119 */           StateListDrawable stateListDrawable = new StateListDrawable();
/* 135 */           stateListDrawable.addState(new int[]{R.attr.state_checked}, mn0.m6700p(context, R$drawable.material_ic_calendar_black_24dp));
/* 138 */           int i2 = 0;
/* 147 */           stateListDrawable.addState(new int[0], mn0.m6700p(context, R$drawable.material_ic_edit_black_24dp));
/* 150 */           checkableImageButton.setImageDrawable(stateListDrawable);
/* 162 */           this.f4685t0.setChecked(this.f4679n0 != 0);
/* 168 */           e33.m3318n(this.f4685t0, null);
/* 173 */           m2319n(this.f4685t0);
/* 184 */           this.f4685t0.setOnClickListener(new bd1(this, 2));
/* 195 */           this.f4687v0 = (Button) viewInflate.findViewById(R$id.confirm_button);
/* 201 */           boolean zMo2290J0 = m2316i().mo2290J0();
/* 205 */           Button button = this.f4687v0;
/* 207 */           if (zMo2290J0) {
/* 209 */               button.setEnabled(true);
                    } else {
/* 213 */               button.setEnabled(false);
                    }
/* 220 */           this.f4687v0.setTag("CONFIRM_BUTTON_TAG");
/* 223 */           CharSequence charSequence2 = this.f4681p0;
/* 225 */           if (charSequence2 != null) {
/* 229 */               this.f4687v0.setText(charSequence2);
                    } else {
/* 233 */               int i3 = this.f4680o0;
/* 235 */               if (i3 != 0) {
/* 239 */                   this.f4687v0.setText(i3);
                        }
                    }
/* 249 */           this.f4687v0.setOnClickListener(new bd1(this, i2));
/* 258 */           Button button2 = (Button) viewInflate.findViewById(R$id.cancel_button);
/* 262 */           button2.setTag("CANCEL_BUTTON_TAG");
/* 265 */           CharSequence charSequence3 = this.f4683r0;
/* 267 */           if (charSequence3 != null) {
/* 269 */               button2.setText(charSequence3);
                    } else {
/* 273 */               int i4 = this.f4682q0;
/* 275 */               if (i4 != 0) {
/* 277 */                   button2.setText(i4);
                        }
                    }
/* 285 */           button2.setOnClickListener(new bd1(this, i));
/* 288 */           return viewInflate;
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
/* 3 */             Iterator it = this.f4670e0.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
                    }
/* 27 */            ViewGroup viewGroup = (ViewGroup) getView();
/* 29 */            if (viewGroup != null) {
/* 31 */                viewGroup.removeAllViews();
                    }
/* 34 */            super.onDismiss(dialogInterface);
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, androidx.fragment.app.Fragment
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putInt("OVERRIDE_THEME_RES_ID", this.f4671f0);
/* 15 */            bundle.putParcelable("DATE_SELECTOR_KEY", this.f4672g0);
/* 20 */            CalendarConstraints calendarConstraints = this.f4674i0;
/* 22 */            C0345b c0345b = new C0345b();
/* 32 */            c0345b.f4640b = new DateValidatorPointForward(Long.MIN_VALUE);
/* 36 */            long j = calendarConstraints.f4612a.f4631f;
/* 40 */            long j2 = calendarConstraints.f4613b.f4631f;
/* 50 */            c0345b.f4639a = Long.valueOf(calendarConstraints.f4615d.f4631f);
/* 52 */            CalendarConstraints.DateValidator dateValidator = calendarConstraints.f4614c;
/* 54 */            c0345b.f4640b = dateValidator;
/* 58 */            Month month = this.f4675j0.f4662e;
/* 60 */            if (month != null) {
/* 68 */                c0345b.f4639a = Long.valueOf(month.f4631f);
                    }
/* 72 */            Bundle bundle2 = new Bundle();
/* 77 */            bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
/* 82 */            Month monthM2299d = Month.m2299d(j);
/* 86 */            Month monthM2299d2 = Month.m2299d(j2);
/* 94 */            CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
/* 96 */            Long l = c0345b.f4639a;
/* 115 */           bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM2299d, monthM2299d2, dateValidator2, l == null ? null : Month.m2299d(l.longValue())));
/* 122 */           bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f4676k0);
/* 129 */           bundle.putCharSequence("TITLE_TEXT_KEY", this.f4677l0);
/* 136 */           bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f4680o0);
/* 143 */           bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f4681p0);
/* 150 */           bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f4682q0);
/* 157 */           bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f4683r0);
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, androidx.fragment.app.Fragment
                public final void onStart() {
                    pg3 o83Var;
/* 1 */             super.onStart();
/* 4 */             Dialog dialog = this.f1447W;
/* 10 */            if (dialog == null) {
/* 318 */               s80.m8424e(this, "DialogFragment ", " does not have a Dialog.");
/* 321 */               return;
                    }
/* 12 */            Window window = dialog.getWindow();
/* 18 */            if (this.f4678m0) {
/* 21 */                window.setLayout(-1, -1);
/* 26 */                window.setBackgroundDrawable(this.f4686u0);
/* 31 */                if (!this.f4688w0) {
/* 41 */                    View viewFindViewById = requireView().findViewById(R$id.fullscreen_header);
/* 68 */                    Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
/* 69 */                    boolean z = false;
/* 82 */                    boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
/* 92 */                    int iM9780r = xe2.m9780r(window.getContext(), R.attr.colorBackground, -16777216);
/* 96 */                    if (z2) {
/* 98 */                        numValueOf = Integer.valueOf(iM9780r);
                            }
/* 102 */                   int i = Build.VERSION.SDK_INT;
/* 106 */                   if (i >= 30) {
/* 108 */                       q73.m7735a(window, false);
                            } else {
/* 112 */                       View decorView = window.getDecorView();
/* 122 */                       decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                            }
/* 125 */                   window.getContext();
/* 150 */                   int iM1454f = i < 27 ? AbstractC0196bx.m1454f(xe2.m9780r(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
/* 151 */                   window.setStatusBarColor(0);
/* 154 */                   window.setNavigationBarColor(iM1454f);
/* 157 */                   int iIntValue = numValueOf.intValue();
/* 175 */                   boolean z3 = iIntValue != 0 && AbstractC0196bx.m1451c(iIntValue) > 0.5d;
/* 188 */                   boolean z4 = iM9780r != 0 && AbstractC0196bx.m1451c(iM9780r) > 0.5d;
/* 189 */                   if ((iM1454f != 0 && AbstractC0196bx.m1451c(iM1454f) > 0.5d) || (iM1454f == 0 && z4)) {
/* 204 */                       z = true;
                            }
/* 205 */                   window.getDecorView();
/* 208 */                   int i2 = Build.VERSION.SDK_INT;
/* 210 */                   if (i2 >= 30) {
/* 214 */                       o83Var = new p83(window);
                            } else {
/* 230 */                       o83Var = i2 >= 26 ? new o83(window) : new n83(window);
                            }
/* 233 */                   o83Var.mo6948y(z3);
/* 236 */                   o83Var.mo7113x(z);
/* 251 */                   cd1 cd1Var = new cd1(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
/* 254 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 256 */                   s23.m8383u(viewFindViewById, cd1Var);
/* 259 */                   this.f4688w0 = true;
                        }
                    } else {
/* 263 */               window.setLayout(-2, -2);
/* 272 */               int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
/* 278 */               Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
/* 291 */               window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f4686u0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
/* 294 */               View decorView2 = window.getDecorView();
/* 300 */               Dialog dialog2 = this.f1447W;
/* 302 */               if (dialog2 == null) {
/* 314 */                   s80.m8424e(this, "DialogFragment ", " does not have a Dialog.");
/* 317 */                   return;
                        }
/* 307 */               decorView2.setOnTouchListener(new jy0(dialog2, rect));
                    }
/* 310 */           m2317l();
                }

                @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0097i, androidx.fragment.app.Fragment
                public final void onStop() {
/* 5 */             this.f4673h0.f20305a.clear();
/* 8 */             super.onStop();
                }
            }
