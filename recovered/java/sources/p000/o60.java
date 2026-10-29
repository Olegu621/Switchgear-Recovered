            package p000;

            import androidx.fragment.app.C0091c0;
            import androidx.fragment.app.C0096h;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class o60 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14640a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0096h f14641b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0091c0 f14642c;

                public /* synthetic */ o60(C0096h c0096h, C0091c0 c0091c0, int i) {
/* 1 */             this.f14640a = i;
/* 3 */             this.f14641b = c0096h;
/* 5 */             this.f14642c = c0091c0;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f14640a;
/* 3 */             C0091c0 c0091c0 = this.f14642c;
/* 5 */             C0096h c0096h = this.f14641b;
                    switch (i) {
                        case 0:
/* 21 */                    c0096h.m655a(c0091c0);
                            break;
                        default:
/* 12 */                    c0096h.f1441b.remove(c0091c0);
/* 17 */                    c0096h.f1442c.remove(c0091c0);
                            break;
                    }
                }
            }
