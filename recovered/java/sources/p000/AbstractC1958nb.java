            package p000;

            import android.view.textclassifier.TextClassificationManager;
            import android.view.textclassifier.TextClassifier;
            import android.widget.TextView;
            
            /* JADX INFO: renamed from: nb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1958nb {
                /* JADX INFO: renamed from: a */
                public static TextClassifier m6957a(TextView textView) {
/* 11 */            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
                    return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
                }
            }
