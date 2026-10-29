            package p000;

            import android.view.View;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p43 {

                /* JADX INFO: renamed from: a */
                public final WeakReference f14964a;

                public p43(View view) {
/* 9 */             this.f14964a = new WeakReference(view);
                }

                /* JADX INFO: renamed from: a */
                public final void m7335a(float f) {
/* 7 */             View view = (View) this.f14964a.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().alpha(f);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7336b() {
/* 7 */             View view = (View) this.f14964a.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().cancel();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m7337c(long j) {
/* 7 */             View view = (View) this.f14964a.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().setDuration(j);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m7338d(r43 r43Var) {
/* 7 */             View view = (View) this.f14964a.get();
/* 9 */             if (view != null) {
/* 11 */                if (r43Var != null) {
/* 22 */                    view.animate().setListener(new C2315w1(r43Var, view));
                        } else {
/* 31 */                    view.animate().setListener(null);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m7339e(float f) {
/* 7 */             View view = (View) this.f14964a.get();
/* 9 */             if (view != null) {
/* 15 */                view.animate().translationY(f);
                    }
                }
            }
