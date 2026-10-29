            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.WindowInsets;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r23 implements View.OnApplyWindowInsetsListener {

                /* JADX INFO: renamed from: a */
                public m83 f15837a = null;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f15838b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ jp1 f15839c;

                public r23(View view, jp1 jp1Var) {
/* 1 */             this.f15838b = view;
/* 3 */             this.f15839c = jp1Var;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
/* 1 */             m83 m83VarM6620h = m83.m6620h(windowInsets, view);
/* 5 */             int i = Build.VERSION.SDK_INT;
/* 7 */             jp1 jp1Var = this.f15839c;
/* 11 */            if (i < 30) {
/* 15 */                s23.m8363a(windowInsets, this.f15838b);
/* 24 */                if (m83VarM6620h.equals(this.f15837a)) {
/* 30 */                    return jp1Var.mo1634k(view, m83VarM6620h).m6626g();
                        }
                    }
/* 35 */            this.f15837a = m83VarM6620h;
/* 37 */            m83 m83VarMo1634k = jp1Var.mo1634k(view, m83VarM6620h);
/* 41 */            if (i >= 30) {
/* 43 */                return m83VarMo1634k.m6626g();
                    }
/* 48 */            WeakHashMap weakHashMap = e33.f7494a;
/* 50 */            q23.m7679c(view);
/* 53 */            return m83VarMo1634k.m6626g();
                }
            }
