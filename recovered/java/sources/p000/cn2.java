            package p000;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.text.TextPaint;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cn2 extends kb1 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Context f3015e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ TextPaint f3016f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ kb1 f3017i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ dn2 f3018v;

                public cn2(dn2 dn2Var, Context context, TextPaint textPaint, kb1 kb1Var) {
/* 4 */             this.f3018v = dn2Var;
/* 6 */             this.f3015e = context;
/* 8 */             this.f3016f = textPaint;
/* 10 */            this.f3017i = kb1Var;
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: M */
                public final void mo1411M(int i) {
/* 3 */             this.f3017i.mo1411M(i);
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: N */
                public final void mo1412N(Typeface typeface, boolean z) {
/* 7 */             this.f3018v.m3164g(this.f3015e, this.f3016f, typeface);
/* 12 */            this.f3017i.mo1412N(typeface, z);
                }
            }
