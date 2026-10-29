            package p000;

            import android.graphics.Rect;
            import android.text.method.TransformationMethod;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jd0 implements TransformationMethod {

                /* JADX INFO: renamed from: a */
                public final TransformationMethod f12227a;

                public jd0(TransformationMethod transformationMethod) {
/* 4 */             this.f12227a = transformationMethod;
                }

                @Override // android.text.method.TransformationMethod
                public final CharSequence getTransformation(CharSequence charSequence, View view) {
/* 5 */             if (view.isInEditMode()) {
/* 7 */                 return charSequence;
                    }
/* 8 */             TransformationMethod transformationMethod = this.f12227a;
/* 10 */            if (transformationMethod != null) {
/* 12 */                charSequence = transformationMethod.getTransformation(charSequence, view);
                    }
/* 16 */            if (charSequence == null || sc0.m8471a().m8472b() != 1) {
/* 47 */                return charSequence;
                    }
/* 30 */            sc0 sc0VarM8471a = sc0.m8471a();
/* 34 */            sc0VarM8471a.getClass();
/* 42 */            return sc0VarM8471a.m8475e(charSequence, 0, charSequence.length());
                }

                @Override // android.text.method.TransformationMethod
                public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
/* 1 */             TransformationMethod transformationMethod = this.f12227a;
/* 3 */             if (transformationMethod != null) {
/* 5 */                 transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
                    }
                }
            }
