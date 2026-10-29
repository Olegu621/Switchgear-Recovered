            package p000;

            import com.google.android.material.datepicker.AbstractC0350g;
            import com.google.android.material.datepicker.CalendarConstraints;
            import com.google.android.material.datepicker.RangeDateSelector;
            import com.google.android.material.textfield.TextInputLayout;
            import java.text.SimpleDateFormat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p02 extends AbstractC0350g {

                /* JADX INFO: renamed from: U */
                public final /* synthetic */ dd1 f14938U;

                /* JADX INFO: renamed from: V */
                public final /* synthetic */ RangeDateSelector f14939V;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f14940i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ TextInputLayout f14941v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ TextInputLayout f14942w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ p02(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, dd1 dd1Var, int i) {
/* 11 */            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
/* 1 */             this.f14940i = i;
/* 3 */             this.f14939V = rangeDateSelector;
/* 5 */             this.f14941v = textInputLayout2;
/* 7 */             this.f14942w = textInputLayout3;
/* 9 */             this.f14938U = dd1Var;
                }

                @Override // com.google.android.material.datepicker.AbstractC0350g
                /* JADX INFO: renamed from: a */
                public final void mo2307a() {
/* 1 */             int i = this.f14940i;
/* 3 */             dd1 dd1Var = this.f14938U;
/* 5 */             TextInputLayout textInputLayout = this.f14942w;
/* 7 */             TextInputLayout textInputLayout2 = this.f14941v;
/* 10 */            RangeDateSelector rangeDateSelector = this.f14939V;
                    switch (i) {
                        case 0:
/* 21 */                    rangeDateSelector.f4636d = null;
/* 23 */                    RangeDateSelector.m2305a(rangeDateSelector, textInputLayout2, textInputLayout, dd1Var);
                            break;
                        default:
/* 15 */                    rangeDateSelector.f4637e = null;
/* 17 */                    RangeDateSelector.m2305a(rangeDateSelector, textInputLayout2, textInputLayout, dd1Var);
                            break;
                    }
                }

                @Override // com.google.android.material.datepicker.AbstractC0350g
                /* JADX INFO: renamed from: b */
                public final void mo2308b(Long l) {
/* 1 */             int i = this.f14940i;
/* 3 */             dd1 dd1Var = this.f14938U;
/* 5 */             TextInputLayout textInputLayout = this.f14942w;
/* 7 */             TextInputLayout textInputLayout2 = this.f14941v;
/* 9 */             RangeDateSelector rangeDateSelector = this.f14939V;
                    switch (i) {
                        case 0:
/* 20 */                    rangeDateSelector.f4636d = l;
/* 22 */                    RangeDateSelector.m2305a(rangeDateSelector, textInputLayout2, textInputLayout, dd1Var);
                            break;
                        default:
/* 14 */                    rangeDateSelector.f4637e = l;
/* 16 */                    RangeDateSelector.m2305a(rangeDateSelector, textInputLayout2, textInputLayout, dd1Var);
                            break;
                    }
                }
            }
