            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.LockSupport;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzes extends AtomicReference implements Runnable {
                private static final Runnable zza = new zzeq(null);
                private static final Runnable zzb = new zzeq(null);

                private final void zzg(Thread thread) {
/* 5 */             Runnable runnable = (Runnable) get();
/* 7 */             zzep zzepVar = null;
/* 9 */             boolean z = false;
/* 10 */            int i = 0;
                    while (true) {
/* 13 */                if (!(runnable instanceof zzep)) {
/* 17 */                    if (runnable != zzb) {
                                break;
                            }
                        } else {
/* 27 */                    zzepVar = (zzep) runnable;
                        }
/* 30 */                i++;
/* 33 */                if (i > 1000) {
/* 35 */                    Runnable runnable2 = zzb;
/* 37 */                    if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
/* 55 */                        z = Thread.interrupted() || z;
/* 56 */                        LockSupport.park(zzepVar);
                            }
                        } else {
/* 60 */                    Thread.yield();
                        }
/* 67 */                runnable = (Runnable) get();
                    }
/* 20 */            if (z) {
/* 22 */                thread.interrupt();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 5 */             Object objZza = null;
/* 10 */            if (compareAndSet(null, threadCurrentThread)) {
/* 13 */                boolean zZzf = zzf();
/* 17 */                if (!zZzf) {
                            try {
/* 19 */                        objZza = zza();
                            } catch (Throwable th) {
                                try {
/* 27 */                            if (th instanceof InterruptedException) {
/* 33 */                                Thread.currentThread().interrupt();
                                    }
/* 45 */                            if (!compareAndSet(threadCurrentThread, zza)) {
/* 47 */                                zzg(threadCurrentThread);
                                    }
/* 50 */                            zzc(th);
/* 53 */                            return;
                                } catch (Throwable th2) {
/* 60 */                            if (!compareAndSet(threadCurrentThread, zza)) {
/* 63 */                                zzg(threadCurrentThread);
                                    }
/* 66 */                            zzd(null);
/* 69 */                            throw th2;
                                }
                            }
                        }
/* 76 */                if (!compareAndSet(threadCurrentThread, zza)) {
/* 78 */                    zzg(threadCurrentThread);
                        }
/* 81 */                if (zZzf) {
/* 86 */                    return;
                        }
/* 83 */                zzd(objZza);
                    }
                }

                @Override // java.util.concurrent.atomic.AtomicReference
                public final String toString() {
                    String strM3784j;
/* 5 */             Runnable runnable = (Runnable) get();
/* 9 */             if (runnable == zza) {
/* 11 */                strM3784j = "running=[DONE]";
                    } else if (runnable instanceof zzep) {
/* 18 */                strM3784j = "running=[INTERRUPTED]";
                    } else {
/* 40 */                strM3784j = runnable instanceof Thread ? fm0.m3784j("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
                    }
/* 48 */            return AbstractC0886en.m3508l(strM3784j, ", ", zzb());
                }

                public abstract Object zza() throws Exception;

                public abstract String zzb();

                public abstract void zzc(Throwable th);

                public abstract void zzd(Object obj);

                public final void zze() {
/* 5 */             Runnable runnable = (Runnable) get();
/* 9 */             if (runnable instanceof Thread) {
/* 14 */                zzep zzepVar = new zzep(this, null);
/* 1 */                 zzepVar.setExclusiveOwnerThread(Thread.currentThread());
/* 28 */                if (compareAndSet(runnable, zzepVar)) {
                            try {
/* 33 */                        ((Thread) runnable).interrupt();
/* 46 */                        if (((Runnable) getAndSet(zza)) == zzb) {
                                }
                            } finally {
/* 63 */                        if (((Runnable) getAndSet(zza)) == zzb) {
/* 68 */                            LockSupport.unpark((Thread) runnable);
                                }
                            }
                        }
                    }
                }

                public abstract boolean zzf();
            }
