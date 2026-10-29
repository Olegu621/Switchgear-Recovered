            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.AbstractExecutorService;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Future;
            import java.util.concurrent.RunnableFuture;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public abstract class zzec extends AbstractExecutorService implements zzev {
                @Override // java.util.concurrent.AbstractExecutorService
                public final RunnableFuture newTaskFor(Callable callable) {
/* 3 */             return new zzfh(callable);
                }

                @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
                public final /* synthetic */ Future submit(Runnable runnable) {
/* 5 */             return (zzeu) super.submit(runnable);
                }

                @Override // java.util.concurrent.AbstractExecutorService
/* 6 */         public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
/* 7 */             return zzfh.zzr(runnable, obj);
                }

                @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
/* 7 */         public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
/* 8 */             return (zzeu) super.submit(runnable, obj);
                }

                @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
/* 8 */         public final /* synthetic */ Future submit(Callable callable) {
/* 9 */             return (zzeu) super.submit(callable);
                }
            }
