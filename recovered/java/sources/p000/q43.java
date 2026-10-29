            package p000;

            import android.view.View;
            import android.view.animation.Interpolator;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q43 {

                /* JADX INFO: renamed from: c */
                public Interpolator f15395c;

                /* JADX INFO: renamed from: d */
                public r43 f15396d;

                /* JADX INFO: renamed from: e */
                public boolean f15397e;

                /* JADX INFO: renamed from: b */
                public long f15394b = -1;

                /* JADX INFO: renamed from: f */
                public final zp2 f15398f = new zp2(this);

                /* JADX INFO: renamed from: a */
                public final ArrayList f15393a = new ArrayList();

                /* JADX INFO: renamed from: a */
                public final void m7705a() {
/* 3 */             if (this.f15397e) {
/* 8 */                 Iterator it = this.f15393a.iterator();
/* 16 */                while (it.hasNext()) {
/* 24 */                    ((p43) it.next()).m7336b();
                        }
/* 29 */                this.f15397e = false;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7706b() {
                    View view;
/* 3 */             if (this.f15397e) {
/* 5 */                 return;
                    }
/* 16 */            for (p43 p43Var : this.f15393a) {
/* 24 */                long j = this.f15394b;
/* 30 */                if (j >= 0) {
/* 32 */                    p43Var.m7337c(j);
                        }
/* 35 */                Interpolator interpolator = this.f15395c;
/* 37 */                if (interpolator != null && (view = (View) p43Var.f14964a.get()) != null) {
/* 53 */                    view.animate().setInterpolator(interpolator);
                        }
/* 58 */                if (this.f15396d != null) {
/* 62 */                    p43Var.m7338d(this.f15398f);
                        }
/* 71 */                View view2 = (View) p43Var.f14964a.get();
/* 73 */                if (view2 != null) {
/* 79 */                    view2.animate().start();
                        }
                    }
/* 84 */            this.f15397e = true;
                }
            }
