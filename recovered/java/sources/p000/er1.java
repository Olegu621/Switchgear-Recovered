            package p000;

            import android.text.method.SingleLineTransformationMethod;
            import android.view.View;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class er1 extends SingleLineTransformationMethod {

                /* JADX INFO: renamed from: a */
                public Locale f7854a;

                @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
                public final CharSequence getTransformation(CharSequence charSequence, View view) {
/* 1 */             CharSequence transformation = super.getTransformation(charSequence, view);
/* 5 */             if (transformation != null) {
/* 13 */                return transformation.toString().toUpperCase(this.f7854a);
                    }
/* 18 */            return null;
                }
            }
