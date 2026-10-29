            package io.sentry.android.core;

            import io.sentry.util.AbstractC1704c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    final class ApplicationNotResponding extends RuntimeException {

                /* JADX INFO: renamed from: a */
                public final Thread f9855a;

                public ApplicationNotResponding(String str, Thread thread) {
/* 1 */             super(str);
/* 6 */             AbstractC1704c.m5462q(thread, "Thread must be provided.");
/* 9 */             this.f9855a = thread;
/* 15 */            setStackTrace(thread.getStackTrace());
                }

/* 18 */        public ApplicationNotResponding(String str) {
/* 19 */            super(str);
/* 20 */            this.f9855a = null;
                }
            }
