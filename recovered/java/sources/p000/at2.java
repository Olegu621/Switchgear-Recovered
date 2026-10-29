            package p000;

            import android.widget.FrameLayout;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class at2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2090a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ bt2 f2091b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ at2(bt2 bt2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f2090a = i;
/* 3 */             this.f2091b = bt2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f2090a;
/* 3 */             bt2 bt2Var = this.f2091b;
                    switch (i) {
                        case 0:
/* 17 */                    FrameLayout frameLayout = new FrameLayout(bt2Var.f2597a);
/* 21 */                    frameLayout.setVisibility(4);
/* 30 */                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
/* 35 */                    frameLayout.addView(bt2Var.f2600d);
/* 38 */                    Integer num = bt2Var.f2599c;
/* 40 */                    if (num == null) {
/* 46 */                        num = bt2Var.f2598b.f7907a.f18813i;
                            }
/* 48 */                    if (num != null) {
/* 54 */                        frameLayout.setBackgroundColor(num.intValue());
                            }
/* 57 */                    return frameLayout;
                        default:
/* 8 */                     return bt2Var.m1432a();
                    }
                }
            }
