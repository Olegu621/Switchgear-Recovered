            package p000;

            import com.google.android.material.datepicker.AbstractC0350g;
            import com.google.android.material.datepicker.CalendarConstraints;
            import com.google.android.material.datepicker.SingleDateSelector;
            import com.google.android.material.textfield.TextInputLayout;
            import java.text.SimpleDateFormat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class me2 extends AbstractC0350g {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ dd1 f13707i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ SingleDateSelector f13708v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public me2(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, dd1 dd1Var) {
/* 5 */             super(str, simpleDateFormat, textInputLayout, calendarConstraints);
/* 1 */             this.f13708v = singleDateSelector;
/* 3 */             this.f13707i = dd1Var;
                }

                @Override // com.google.android.material.datepicker.AbstractC0350g
                /* JADX INFO: renamed from: a */
                public final void mo2307a() {
/* 3 */             this.f13707i.m3003a();
                }

                @Override // com.google.android.material.datepicker.AbstractC0350g
                /* JADX INFO: renamed from: b */
                public final void mo2308b(Long l) {
/* 1 */             SingleDateSelector singleDateSelector = this.f13708v;
/* 3 */             if (l == null) {
/* 6 */                 singleDateSelector.f4638a = null;
                    } else {
/* 9 */                 singleDateSelector.f4638a = l;
                    }
/* 15 */            this.f13707i.m3004b(singleDateSelector.f4638a);
                }
            }
