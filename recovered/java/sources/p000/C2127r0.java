            package p000;

            import android.os.Bundle;
            import android.text.style.ClickableSpan;
            import android.view.View;
            
            /* JADX INFO: renamed from: r0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2127r0 extends ClickableSpan {

                /* JADX INFO: renamed from: a */
                public final int f15815a;

                /* JADX INFO: renamed from: b */
                public final C0901f1 f15816b;

                /* JADX INFO: renamed from: c */
                public final int f15817c;

                public C2127r0(int i, C0901f1 c0901f1, int i2) {
/* 4 */             this.f15815a = i;
/* 6 */             this.f15816b = c0901f1;
/* 8 */             this.f15817c = i2;
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f15815a);
/* 19 */            this.f15816b.f7961a.performAction(this.f15817c, bundle);
                }
            }
