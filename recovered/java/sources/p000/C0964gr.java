            package p000;

            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: renamed from: gr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0964gr extends C1980nx {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f8785c = AtomicIntegerFieldUpdater.newUpdater(C0964gr.class, "_resumed$volatile");
                private volatile /* synthetic */ int _resumed$volatile;

                public C0964gr(C0890er c0890er, Throwable th, boolean z) {
/* 1 */             if (th == null) {
/* 24 */                th = new CancellationException("Continuation " + c0890er + " was cancelled normally");
                    }
/* 27 */            super(z, th);
/* 31 */            this._resumed$volatile = 0;
                }
            }
