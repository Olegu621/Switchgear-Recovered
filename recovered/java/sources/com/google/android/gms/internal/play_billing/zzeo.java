            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import p000.AbstractC0886en;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     final class zzeo implements zzeu {
                private static final zzet zza = new zzet(zzeo.class);
                private final Object zzb;

                public zzeo(Object obj) {
/* 4 */             this.zzb = obj;
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
/* 1 */             timeUnit.getClass();
/* 4 */             return this.zzb;
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 1 */             return true;
                }

                public final String toString() {
/* 15 */            return pm2.m7489l(super.toString(), "[status=SUCCESS, result=[", this.zzb.toString(), "]]");
                }

                @Override // com.google.android.gms.internal.play_billing.zzeu
                public final void zzb(Runnable runnable, Executor executor) {
/* 3 */             zzbe.zzc(executor, "Executor was null.");
                    try {
/* 6 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 40 */                zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC0886en.m3509m("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                @Override // java.util.concurrent.Future
/* 6 */         public final Object get() {
/* 7 */             return this.zzb;
                }
            }
