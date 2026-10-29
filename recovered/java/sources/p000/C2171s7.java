            package p000;

            import android.graphics.Rect;
            import android.text.method.TransformationMethod;
            import android.view.View;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: s7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2171s7 implements TransformationMethod {

                /* JADX INFO: renamed from: a */
                public Locale f16457a;

                @Override // android.text.method.TransformationMethod
                public final CharSequence getTransformation(CharSequence charSequence, View view) {
/* 1 */             if (charSequence != null) {
/* 9 */                 return charSequence.toString().toUpperCase(this.f16457a);
                    }
/* 14 */            return null;
                }

                @Override // android.text.method.TransformationMethod
                public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
                }
            }
