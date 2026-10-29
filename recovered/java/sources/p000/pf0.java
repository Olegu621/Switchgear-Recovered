            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import com.google.android.material.transformation.ExpandableBehavior;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pf0 implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f15094a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f15095b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ qf0 f15096c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ExpandableBehavior f15097d;

                public pf0(ExpandableBehavior expandableBehavior, View view, int i, qf0 qf0Var) {
/* 4 */             this.f15097d = expandableBehavior;
/* 6 */             this.f15094a = view;
/* 8 */             this.f15095b = i;
/* 10 */            this.f15096c = qf0Var;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
/* 1 */             View view = this.f15094a;
/* 7 */             view.getViewTreeObserver().removeOnPreDrawListener(this);
/* 10 */            ExpandableBehavior expandableBehavior = this.f15097d;
/* 17 */            if (expandableBehavior.f5130a == this.f15095b) {
/* 19 */                Object obj = this.f15096c;
/* 30 */                expandableBehavior.mo2431s((View) obj, view, ((FloatingActionButton) obj).f4750c0.f2148a, false);
                    }
/* 16 */            return false;
                }
            }
