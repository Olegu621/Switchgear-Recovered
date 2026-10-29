            package p000;

            import java.util.concurrent.ThreadPoolExecutor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uc0 extends k50 {

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ k50 f17447n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ ThreadPoolExecutor f17448o;

                public uc0(k50 k50Var, ThreadPoolExecutor threadPoolExecutor) {
/* 4 */             this.f17447n = k50Var;
/* 6 */             this.f17448o = threadPoolExecutor;
                }

                @Override // p000.k50
                /* JADX INFO: renamed from: C */
                public final void mo5990C(Throwable th) {
/* 1 */             ThreadPoolExecutor threadPoolExecutor = this.f17448o;
                    try {
/* 5 */                 this.f17447n.mo5990C(th);
                    } finally {
/* 13 */                threadPoolExecutor.shutdown();
                    }
                }

                @Override // p000.k50
                /* JADX INFO: renamed from: D */
                public final void mo5991D(ra2 ra2Var) {
/* 1 */             ThreadPoolExecutor threadPoolExecutor = this.f17448o;
                    try {
/* 5 */                 this.f17447n.mo5991D(ra2Var);
                    } finally {
/* 13 */                threadPoolExecutor.shutdown();
                    }
                }
            }
