            package io.sentry.android.replay;

            import io.sentry.android.core.C1185e0;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1346u implements Closeable {

                /* JADX INFO: renamed from: a */
                public final AtomicBoolean f10640a = new AtomicBoolean(false);

                /* JADX INFO: renamed from: b */
                public final C1702a f10641b = new C1702a();

                /* JADX INFO: renamed from: c */
                public final C1185e0 f10642c = new C1185e0(this, 1);

                /* JADX INFO: renamed from: d */
                public final C1345t f10643d = new C1345t(this);

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 4 */             this.f10640a.set(true);
/* 9 */             this.f10642c.clear();
                }
            }
