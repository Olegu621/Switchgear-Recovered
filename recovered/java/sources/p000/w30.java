            package p000;

            import java.io.Closeable;
            import javax.inject.Provider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w30 implements Closeable {

                /* JADX INFO: renamed from: a */
                public Provider f18423a;

                /* JADX INFO: renamed from: b */
                public C0828d1 f18424b;

                /* JADX INFO: renamed from: c */
                public Provider f18425c;

                /* JADX INFO: renamed from: d */
                public ts0 f18426d;

                /* JADX INFO: renamed from: e */
                public Provider f18427e;

                /* JADX INFO: renamed from: f */
                public Provider f18428f;

                /* JADX INFO: renamed from: i */
                public Provider f18429i;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 9 */             ((s52) this.f18428f.get()).close();
                }
            }
