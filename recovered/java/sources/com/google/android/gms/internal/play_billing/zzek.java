            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzek implements Runnable {
                final Future zza;
                final zzej zzb;

                public zzek(Future future, zzej zzejVar) {
/* 4 */             this.zza = future;
/* 6 */             this.zzb = zzejVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    Throwable thZza;
/* 1 */             Object obj2 = this.zza;
/* 5 */             if ((obj2 instanceof zzfi) && (thZza = zzfj.zza((zzfi) obj2)) != null) {
/* 18 */                this.zzb.zza(thZza);
/* 21 */                return;
                    }
                    try {
/* 22 */                Future future = this.zza;
/* 30 */                if (!future.isDone()) {
/* 84 */                    throw new IllegalStateException(zzbf.zza("Future was expected to be done: %s", future));
                        }
/* 32 */                boolean z = false;
                        while (true) {
                            try {
/* 33 */                        obj = future.get();
                                break;
                            } catch (InterruptedException unused) {
/* 69 */                        z = true;
                            } catch (Throwable th) {
/* 58 */                        if (z) {
/* 65 */                            Thread.currentThread().interrupt();
                                }
/* 68 */                        throw th;
                            }
                        }
/* 37 */                if (z) {
/* 43 */                    Thread.currentThread().interrupt();
                        }
/* 53 */                this.zzb.zzb(obj);
                    } catch (ExecutionException e) {
/* 97 */                this.zzb.zza(e.getCause());
                    } catch (Throwable th2) {
/* 87 */                this.zzb.zza(th2);
                    }
                }

                public final String toString() {
/* 1 */             zzba zzbaVarZza = zzbc.zza(this);
/* 7 */             zzbaVarZza.zza(this.zzb);
/* 10 */            return zzbaVarZza.toString();
                }
            }
