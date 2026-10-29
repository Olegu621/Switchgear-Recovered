            package p000;

            import android.text.method.PasswordTransformationMethod;
            import android.widget.EditText;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class or1 extends de0 {

                /* JADX INFO: renamed from: e */
                public final wa0 f14869e;

                /* JADX INFO: renamed from: f */
                public final C1941mv f14870f;

                /* JADX INFO: renamed from: g */
                public final C1978nv f14871g;

                public or1(TextInputLayout textInputLayout, int i) {
/* 1 */             super(textInputLayout, i);
/* 10 */            this.f14869e = new wa0(this, 1);
/* 18 */            this.f14870f = new C1941mv(this, 2);
/* 25 */            this.f14871g = new C1978nv(this, 2);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m7238d(or1 or1Var) {
/* 3 */             EditText editText = or1Var.f7137a.getEditText();
                    return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: a */
                public final void mo3010a() {
/* 1 */             int i = this.f7140d;
/* 3 */             if (i == 0) {
/* 5 */                 i = R$drawable.design_password_eye;
                    }
/* 7 */             TextInputLayout textInputLayout = this.f7137a;
/* 9 */             textInputLayout.setEndIconDrawable(i);
/* 22 */            textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.password_toggle_content_description));
/* 26 */            textInputLayout.setEndIconVisible(true);
/* 29 */            textInputLayout.setEndIconCheckable(true);
/* 39 */            textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC2239u1(this, 8));
/* 42 */            LinkedHashSet linkedHashSet = textInputLayout.f5015M0;
/* 44 */            C1941mv c1941mv = this.f14870f;
/* 46 */            linkedHashSet.add(c1941mv);
/* 51 */            if (textInputLayout.f5044e != null) {
/* 53 */                c1941mv.m6810a(textInputLayout);
                    }
/* 60 */            textInputLayout.f5019Q0.add(this.f14871g);
/* 63 */            EditText editText = textInputLayout.getEditText();
/* 67 */            if (editText != null) {
/* 75 */                if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
/* 105 */                   editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        }
                    }
                }
            }
