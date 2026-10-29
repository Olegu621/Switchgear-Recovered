            package io.sentry.android.replay.util;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1354h implements Runnable {

                /* JADX INFO: renamed from: a */
                public final String f10663a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Runnable f10664b;

                public RunnableC1354h(Runnable runnable, String str) {
/* 1 */             runnable.getClass();
/* 7 */             this.f10663a = str;
/* 9 */             this.f10664b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             this.f10664b.run();
                }
            }
