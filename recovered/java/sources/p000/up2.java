            package p000;

            import androidx.appcompat.widget.C0071k;
            import androidx.appcompat.widget.Toolbar;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class up2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17621a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Toolbar f17622b;

                public /* synthetic */ up2(Toolbar toolbar, int i) {
/* 1 */             this.f17621a = i;
/* 3 */             this.f17622b = toolbar;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17621a;
/* 3 */             Toolbar toolbar = this.f17622b;
                    switch (i) {
                        case 0:
/* 12 */                    C0071k c0071k = toolbar.f685A0;
/* 18 */                    sg1 sg1Var = c0071k == null ? null : c0071k.f760b;
/* 20 */                    if (sg1Var != null) {
/* 22 */                        sg1Var.collapseActionView();
                            }
                            break;
                        default:
/* 8 */                     toolbar.m407m();
                            break;
                    }
                }
            }
