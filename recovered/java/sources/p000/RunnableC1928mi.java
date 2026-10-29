            package p000;

            import android.os.SystemClock;
            import com.google.android.material.progressindicator.AbstractC0370a;
            
            /* JADX INFO: renamed from: mi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1928mi implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13788a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AbstractC0370a f13789b;

                public /* synthetic */ RunnableC1928mi(AbstractC0370a abstractC0370a, int i) {
/* 1 */             this.f13788a = i;
/* 3 */             this.f13789b = abstractC0370a;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f13788a;
/* 4 */             AbstractC0370a abstractC0370a = this.f13789b;
                    switch (i) {
                        case 0:
/* 58 */                    if (abstractC0370a.f4857d > 0) {
/* 60 */                        SystemClock.uptimeMillis();
                            }
/* 63 */                    abstractC0370a.setVisibility(0);
                            break;
                        default:
/* 16 */                    ((y90) abstractC0370a.getCurrentDrawable()).m10130e(false, false, true);
/* 23 */                    if (abstractC0370a.getProgressDrawable() == null || !abstractC0370a.getProgressDrawable().isVisible()) {
/* 39 */                        if (abstractC0370a.getIndeterminateDrawable() == null || !abstractC0370a.getIndeterminateDrawable().isVisible()) {
/* 52 */                            abstractC0370a.setVisibility(4);
                                }
                            }
                            break;
                    }
                }
            }
