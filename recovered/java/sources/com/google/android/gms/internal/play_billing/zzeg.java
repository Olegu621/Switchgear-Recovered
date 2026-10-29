            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public abstract class zzeg extends zzcf implements Future {
                @Override // java.util.concurrent.Future
                public boolean cancel(boolean z) {
/* 5 */             return zzc().cancel(z);
                }

                @Override // java.util.concurrent.Future
                public final Object get() throws ExecutionException, InterruptedException {
/* 5 */             return zzc().get();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 5 */             return zzc().isCancelled();
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 5 */             return zzc().isDone();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcf
                public /* bridge */ /* synthetic */ Object zza() {
/* 2 */             throw null;
                }

                public abstract Future zzc();

                @Override // java.util.concurrent.Future
/* 9 */         public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 10 */            return zzc().get(j, timeUnit);
                }
            }
