            package com.google.android.gms.internal.play_billing;

            import java.lang.ref.WeakReference;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     final class zzu implements zzeu {
                final WeakReference zza;
                private final zzq zzb = new zzt(this);

                public zzu(zzr zzrVar) {
/* 16 */            this.zza = new WeakReference(zzrVar);
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 7 */             zzr zzrVar = (zzr) this.zza.get();
/* 11 */            boolean zCancel = this.zzb.cancel(z);
/* 15 */            if (!zCancel || zzrVar == null) {
/* 23 */                return zCancel;
                    }
/* 19 */            zzrVar.zza();
/* 22 */            return true;
                }

                @Override // java.util.concurrent.Future
                public final Object get() throws ExecutionException, InterruptedException {
/* 3 */             return this.zzb.get();
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 5 */             return this.zzb.zzc instanceof zzg;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 3 */             return this.zzb.isDone();
                }

                public final String toString() {
/* 3 */             return this.zzb.toString();
                }

                public final boolean zza(Object obj) {
/* 3 */             return this.zzb.zzd(obj);
                }

                @Override // com.google.android.gms.internal.play_billing.zzeu
                public final void zzb(Runnable runnable, Executor executor) {
/* 3 */             this.zzb.zzb(runnable, executor);
                }

                public final boolean zzc(Throwable th) {
/* 3 */             zzi zziVar = new zzi(th);
/* 6 */             zzf zzfVar = zzq.zzb;
/* 8 */             zzq zzqVar = this.zzb;
/* 15 */            if (!zzfVar.zzd(zzqVar, null, zziVar)) {
/* 22 */                return false;
                    }
/* 17 */            zzq.zzc(zzqVar);
/* 20 */            return true;
                }

                @Override // java.util.concurrent.Future
/* 7 */         public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 8 */             return this.zzb.get(j, timeUnit);
                }
            }
