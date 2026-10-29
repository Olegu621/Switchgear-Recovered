            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import android.widget.Spinner;
            import com.google.android.material.textfield.TextInputLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xa0 extends in2 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ za0 f19007e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public xa0(za0 za0Var, TextInputLayout textInputLayout) {
/* 3 */             super(textInputLayout);
/* 1 */             this.f19007e = za0Var;
                }

                @Override // p000.in2, p000.C2201t0
                /* JADX INFO: renamed from: d */
                public final void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             super.mo128d(view, c0901f1);
/* 16 */            if (!za0.m10294h(this.f19007e.f7137a.getEditText())) {
/* 24 */                c0901f1.m3628i(Spinner.class.getName());
                    }
/* 45 */            if (Build.VERSION.SDK_INT >= 26 ? c0901f1.f7961a.isShowingHintText() : c0901f1.m3624e(4)) {
/* 48 */                c0901f1.m3630k(null);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: e */
                public final void mo1206e(View view, AccessibilityEvent accessibilityEvent) {
/* 1 */             super.mo1206e(view, accessibilityEvent);
/* 4 */             za0 za0Var = this.f19007e;
/* 6 */             TextInputLayout textInputLayout = za0Var.f7137a;
/* 8 */             EditText editText = textInputLayout.getEditText();
/* 14 */            if (!(editText instanceof AutoCompleteTextView)) {
/* 57 */                f42.m3663s("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
/* 60 */                return;
                    }
/* 16 */            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
/* 23 */            if (accessibilityEvent.getEventType() == 1 && za0Var.f20031q.isEnabled() && !za0.m10294h(textInputLayout.getEditText())) {
/* 43 */                za0.m10293d(za0Var, autoCompleteTextView);
/* 46 */                za0Var.f20026l = true;
/* 52 */                za0Var.f20028n = System.currentTimeMillis();
                    }
                }
            }
