            package com.google.android.gms.tasks;

            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    final class zzad<T> implements zzae<T> {
                private final CountDownLatch zza = new CountDownLatch(1);

                private zzad() {
                }

                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
/* 3 */             this.zza.countDown();
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
/* 3 */             this.zza.countDown();
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
/* 3 */             this.zza.countDown();
                }

                public final void zza() throws InterruptedException {
/* 3 */             this.zza.await();
                }

                public final boolean zzb(long j, TimeUnit timeUnit) throws InterruptedException {
/* 3 */             return this.zza.await(j, timeUnit);
                }

/* 12 */        public /* synthetic */ zzad(zzac zzacVar) {
                }
            }
