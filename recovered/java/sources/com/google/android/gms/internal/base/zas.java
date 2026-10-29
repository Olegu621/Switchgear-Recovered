            package com.google.android.gms.internal.base;

            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     final class zas implements zaq {
                public /* synthetic */ zas(zar zarVar) {
                }

                @Override // com.google.android.gms.internal.base.zaq
                public final ExecutorService zaa(ThreadFactory threadFactory, int i) {
/* 2 */             return zac(1, threadFactory, 1);
                }

                @Override // com.google.android.gms.internal.base.zaq
                public final ExecutorService zab(int i, int i2) {
/* 7 */             return zac(4, Executors.defaultThreadFactory(), 2);
                }

                @Override // com.google.android.gms.internal.base.zaq
                public final ExecutorService zac(int i, ThreadFactory threadFactory, int i2) {
/* 15 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
/* 19 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 22 */            return Executors.unconfigurableExecutorService(threadPoolExecutor);
                }

/* 4 */         private zas() {
                }
            }
