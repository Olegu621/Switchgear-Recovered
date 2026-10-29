            package p000;

            import android.text.StaticLayout;
            import android.widget.TextView;
            
            /* JADX INFO: renamed from: zb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2545zb extends C2492yb {
                @Override // p000.C2492yb, p000.AbstractC0014ac
                /* JADX INFO: renamed from: a */
                public void mo150a(StaticLayout.Builder builder, TextView textView) {
/* 5 */             builder.setTextDirection(textView.getTextDirectionHeuristic());
                }

                @Override // p000.AbstractC0014ac
                /* JADX INFO: renamed from: b */
                public boolean mo151b(TextView textView) {
/* 1 */             return textView.isHorizontallyScrollable();
                }
            }
