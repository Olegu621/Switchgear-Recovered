            package p000;

            import android.text.StaticLayout;
            import android.text.TextDirectionHeuristic;
            import android.text.TextDirectionHeuristics;
            import android.widget.TextView;
            
            /* JADX INFO: renamed from: yb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C2492yb extends AbstractC0014ac {
                @Override // p000.AbstractC0014ac
                /* JADX INFO: renamed from: a */
                public void mo150a(StaticLayout.Builder builder, TextView textView) {
/* 11 */            builder.setTextDirection((TextDirectionHeuristic) C0175bc.m1321e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
                }
            }
