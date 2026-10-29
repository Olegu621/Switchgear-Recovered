            package p000;

            import androidx.fragment.app.Fragment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hm0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9140a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Fragment f9141b;

                public /* synthetic */ hm0(Fragment fragment, int i) {
/* 1 */             this.f9140a = i;
/* 3 */             this.f9141b = fragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9140a;
/* 3 */             Fragment fragment = this.f9141b;
                    switch (i) {
                        case 0:
/* 13 */                    fragment.startPostponedEnterTransition();
                            break;
                        default:
/* 9 */                     fragment.callStartTransitionListener(false);
                            break;
                    }
                }
            }
