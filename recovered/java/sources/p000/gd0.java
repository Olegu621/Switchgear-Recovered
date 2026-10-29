            package p000;

            import android.text.InputFilter;
            import android.text.method.TransformationMethod;
            import android.widget.TextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gd0 extends py0 {

                /* JADX INFO: renamed from: k */
                public final fd0 f8548k;

                public gd0(TextView textView) {
/* 3 */             super(9);
/* 11 */            this.f8548k = new fd0(textView);
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: X */
                public final InputFilter[] mo3724X(InputFilter[] inputFilterArr) {
                    return !(sc0.f16512k != null) ? inputFilterArr : this.f8548k.mo3724X(inputFilterArr);
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: o0 */
                public final boolean mo3725o0() {
/* 3 */             return this.f8548k.f8143m;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: s0 */
                public final void mo3726s0(boolean z) {
/* 8 */             if (sc0.f16512k != null) {
/* 13 */                this.f8548k.mo3726s0(z);
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: t0 */
                public final void mo3727t0(boolean z) {
/* 7 */             boolean z2 = sc0.f16512k != null;
/* 8 */             fd0 fd0Var = this.f8548k;
/* 10 */            if (z2) {
/* 15 */                fd0Var.mo3727t0(z);
                    } else {
/* 12 */                fd0Var.f8143m = z;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: v0 */
                public final TransformationMethod mo3728v0(TransformationMethod transformationMethod) {
                    return !(sc0.f16512k != null) ? transformationMethod : this.f8548k.mo3728v0(transformationMethod);
                }
            }
