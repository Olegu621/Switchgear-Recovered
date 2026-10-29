            package io.sentry.exception;

            import io.sentry.protocol.C1615o;
            import io.sentry.util.AbstractC1704c;
            
            /* JADX INFO: renamed from: io.sentry.exception.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1440a extends RuntimeException {

                /* JADX INFO: renamed from: a */
                public final C1615o f10920a;

                /* JADX INFO: renamed from: b */
                public final Throwable f10921b;

                /* JADX INFO: renamed from: c */
                public final Thread f10922c;

                /* JADX INFO: renamed from: d */
                public final boolean f10923d;

                public C1440a(C1615o c1615o, Throwable th, Thread thread, boolean z) {
/* 4 */             this.f10920a = c1615o;
/* 8 */             AbstractC1704c.m5462q(th, "Throwable is required.");
/* 11 */            this.f10921b = th;
/* 13 */            this.f10922c = thread;
/* 15 */            this.f10923d = z;
                }
            }
