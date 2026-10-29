            package p000;

            import android.animation.LayoutTransition;
            import android.content.Context;
            import android.widget.FrameLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ys2 extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public final ew2 f19807a;

                /* JADX INFO: renamed from: b */
                public final z00 f19808b;

                /* JADX INFO: renamed from: c */
                public final boolean f19809c;

                /* JADX INFO: renamed from: d */
                public final FrameLayout f19810d;

                public ys2(Context context, ew2 ew2Var, z00 z00Var, boolean z) {
/* 1 */             super(z00Var);
/* 4 */             this.f19807a = ew2Var;
/* 6 */             this.f19808b = z00Var;
/* 8 */             this.f19809c = z;
/* 12 */            FrameLayout frameLayout = new FrameLayout(z00Var);
/* 17 */            LayoutTransition layoutTransition = new LayoutTransition();
/* 21 */            layoutTransition.enableTransitionType(7);
/* 24 */            frameLayout.setLayoutTransition(layoutTransition);
/* 27 */            addView(frameLayout);
/* 30 */            this.f19810d = frameLayout;
                }

                /* JADX INFO: renamed from: a */
                public final void m10181a(Integer num) {
/* 1 */             FrameLayout frameLayout = this.f19810d;
/* 3 */             if (num != null) {
/* 9 */                 frameLayout.setBackgroundColor(num.intValue());
                    }
/* 15 */            if (this.f19809c) {
/* 22 */                setTag(0);
/* 30 */                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 0));
                    } else {
/* 38 */                setTag(-1);
/* 46 */                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    }
                }
            }
