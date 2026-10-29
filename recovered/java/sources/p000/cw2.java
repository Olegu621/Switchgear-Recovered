            package p000;

            import android.text.TextPaint;
            import android.text.style.ClickableSpan;
            import android.view.View;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cw2 extends ClickableSpan {

                /* JADX INFO: renamed from: a */
                public final yu1 f6926a;

                /* JADX INFO: renamed from: b */
                public final Function1 f6927b;

                /* JADX INFO: renamed from: c */
                public final boolean f6928c;

                public cw2(yu1 yu1Var, Function1 function1, boolean z) {
/* 4 */             this.f6926a = yu1Var;
/* 6 */             this.f6927b = function1;
/* 8 */             this.f6928c = z;
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
/* 1 */             view.getClass();
/* 8 */             this.f6927b.invoke(this.f6926a);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
/* 1 */             textPaint.getClass();
/* 4 */             super.updateDrawState(textPaint);
/* 9 */             textPaint.setUnderlineText(this.f6928c);
                }
            }
