            package p000;

            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xk3 implements Closeable {

                /* JADX INFO: renamed from: b */
                public static final C0942g5 f19242b = new C0942g5(11);

                /* JADX INFO: renamed from: a */
                public int f19243a;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             int i = this.f19243a;
/* 3 */             if (i > 0) {
/* 7 */                 this.f19243a = i - 1;
                    } else {
/* 12 */                C1951n4.m6856g("Mismatched calls to RecursionDepth (possible error in core library)");
                    }
                }
            }
