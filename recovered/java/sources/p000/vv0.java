            package p000;

            import java.lang.ref.WeakReference;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class vv0 extends cm0 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f18363d = 1;

                /* JADX INFO: renamed from: e */
                public final Object f18364e;

                public vv0(mw0 mw0Var, wv0 wv0Var) {
/* 4 */             super(mw0Var);
/* 12 */            this.f18364e = new WeakReference(wv0Var);
/* 19 */            m1725c(new uv0(this, 0));
                }

                @Override // p000.cm0, java.lang.AutoCloseable
                public void close() {
                    switch (this.f18363d) {
                        case 1:
/* 19 */                    if (!((AtomicBoolean) this.f18364e).getAndSet(true)) {
/* 21 */                        super.close();
                            }
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }

/* 22 */        public vv0(mw0 mw0Var) {
/* 23 */            super(mw0Var);
/* 24 */            this.f18364e = new AtomicBoolean(false);
                }
            }
