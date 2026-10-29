            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class tz0 extends j01 {

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f17318w = AtomicIntegerFieldUpdater.newUpdater(tz0.class, "_invoked$volatile");
                private volatile /* synthetic */ int _invoked$volatile;

                /* JADX INFO: renamed from: v */
                public final hz0 f17319v;

                public tz0(hz0 hz0Var) {
/* 4 */             this.f17319v = hz0Var;
                }

                @Override // p000.hz0
                /* JADX INFO: renamed from: a */
                public final void mo277a(Throwable th) {
/* 9 */             if (f17318w.compareAndSet(this, 0, 1)) {
/* 13 */                this.f17319v.mo277a(th);
                    }
                }
            }
