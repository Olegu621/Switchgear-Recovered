            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            /* JADX INFO: renamed from: nx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1980nx {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f14554b = AtomicIntegerFieldUpdater.newUpdater(C1980nx.class, "_handled$volatile");
                private volatile /* synthetic */ int _handled$volatile;

                /* JADX INFO: renamed from: a */
                public final Throwable f14555a;

                public C1980nx(boolean z, Throwable th) {
/* 4 */             this.f14555a = th;
/* 6 */             this._handled$volatile = z ? 1 : 0;
                }

                public final String toString() {
/* 32 */            return getClass().getSimpleName() + '[' + this.f14555a + ']';
                }
            }
