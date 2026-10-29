            package com.google.android.gms.internal.play_billing;

            import java.util.Locale;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 357 */   public class zzq implements zzeu {
                static final zzf zzb;
                public static final /* synthetic */ int zzf = 0;
                private static final Object zzh;
                volatile Object zzc;
                volatile zzj zzd;
                volatile zzo zze;
                static final boolean zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                private static final Logger zzg = Logger.getLogger(zzq.class.getName());

                static {
                    zzf zznVar;
                    try {
/* 65 */                zznVar = new zzl(AtomicReferenceFieldUpdater.newUpdater(zzo.class, Thread.class, "zzb"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzo.class, "zzc"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzo.class, "zze"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzj.class, "zzd"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, Object.class, "zzc"));
/* 68 */                th = null;
                    } catch (Throwable th) {
/* 71 */                th = th;
/* 74 */                zznVar = new zzn();
                    }
/* 69 */            Throwable th2 = th;
/* 78 */            zzb = zznVar;
/* 80 */            if (th2 != null) {
/* 92 */                zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
                    }
/* 100 */           zzh = new Object();
                }

                public static void zzc(zzq zzqVar) {
                    zzo zzoVar;
                    zzj zzjVar;
/* 11 */            do {
/* 1 */                 zzoVar = zzqVar.zze;
/* 11 */            } while (!zzb.zze(zzqVar, zzoVar, zzo.zza));
/* 14 */            while (zzoVar != null) {
/* 57 */                Thread thread = zzoVar.zzb;
/* 59 */                if (thread != null) {
/* 61 */                    zzoVar.zzb = null;
/* 63 */                    LockSupport.unpark(thread);
                        }
/* 66 */                zzoVar = zzoVar.zzc;
                    }
/* 26 */            do {
/* 16 */                zzjVar = zzqVar.zzd;
/* 26 */            } while (!zzb.zzc(zzqVar, zzjVar, zzj.zza));
/* 28 */            zzj zzjVar2 = null;
/* 29 */            while (zzjVar != null) {
/* 31 */                zzj zzjVar3 = zzjVar.zzd;
/* 33 */                zzjVar.zzd = zzjVar2;
/* 35 */                zzjVar2 = zzjVar;
/* 36 */                zzjVar = zzjVar3;
                    }
/* 38 */            while (zzjVar2 != null) {
/* 40 */                Runnable runnable = zzjVar2.zzb;
/* 42 */                zzj zzjVar4 = zzjVar2.zzd;
/* 46 */                if (runnable instanceof zzm) {
/* 55 */                    throw null;
                        }
/* 50 */                zzf(runnable, zzjVar2.zzc);
/* 53 */                zzjVar2 = zzjVar4;
                    }
                }

                private final void zze(StringBuilder sb) {
                    V v;
/* 3 */             boolean z = false;
                    while (true) {
                        try {
                            try {
/* 4 */                         v = get();
                                break;
                            } catch (InterruptedException unused) {
/* 94 */                        z = true;
                            } catch (Throwable th) {
/* 44 */                        if (z) {
/* 50 */                            Thread.currentThread().interrupt();
                                }
/* 53 */                        throw th;
                            }
                        } catch (CancellationException unused2) {
/* 74 */                    sb.append("CANCELLED");
/* 77 */                    return;
                        } catch (RuntimeException e) {
/* 56 */                    sb.append("UNKNOWN, cause=[");
/* 63 */                    sb.append(e.getClass());
/* 68 */                    sb.append(" thrown from get()]");
/* 71 */                    return;
                        } catch (ExecutionException e2) {
/* 80 */                    sb.append("FAILURE, cause=[");
/* 87 */                    sb.append(e2.getCause());
/* 90 */                    sb.append("]");
/* 93 */                    return;
                        }
                    }
/* 8 */             if (z) {
/* 14 */                Thread.currentThread().interrupt();
                    }
/* 24 */            sb.append("SUCCESS, result=[");
/* 36 */            sb.append(v == this ? "this future" : String.valueOf(v));
/* 39 */            sb.append("]");
                }

                private static void zzf(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 31 */                zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", AbstractC0886en.m3509m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                private final void zzg(zzo zzoVar) {
/* 2 */             zzoVar.zzb = null;
                    while (true) {
/* 4 */                 zzo zzoVar2 = this.zze;
/* 8 */                 if (zzoVar2 != zzo.zza) {
/* 10 */                    zzo zzoVar3 = null;
/* 11 */                    while (zzoVar2 != null) {
/* 13 */                        zzo zzoVar4 = zzoVar2.zzc;
/* 17 */                        if (zzoVar2.zzb != null) {
/* 19 */                            zzoVar3 = zzoVar2;
                                } else if (zzoVar3 != null) {
/* 23 */                            zzoVar3.zzc = zzoVar4;
/* 27 */                            if (zzoVar3.zzb == null) {
                                    }
                                } else if (!zzb.zze(this, zzoVar2, zzoVar4)) {
                                }
/* 39 */                        zzoVar2 = zzoVar4;
                            }
/* 41 */                    return;
                        }
/* 41 */                return;
                    }
                }

                private static final Object zzh(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof zzg) {
/* 27 */                Throwable th = ((zzg) obj).zzc;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 39 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof zzi) {
/* 24 */                throw new ExecutionException(((zzi) obj).zza);
                    }
/* 11 */            if (obj == zzh) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
                    zzg zzgVar;
/* 1 */             Object obj = this.zzc;
/* 13 */            if ((obj instanceof zzm) | (obj == null)) {
/* 17 */                if (zza) {
/* 28 */                    zzgVar = new zzg(z, new CancellationException("Future.cancel() was called."));
                        } else {
/* 37 */                    zzgVar = z ? zzg.zza : zzg.zzb;
                        }
/* 45 */                while (!zzb.zzd(this, obj, zzgVar)) {
/* 57 */                    obj = this.zzc;
/* 61 */                    if (!(obj instanceof zzm)) {
                            }
                        }
/* 47 */                zzc(this);
/* 52 */                if (obj instanceof zzm) {
/* 56 */                    throw null;
                        }
/* 5 */                 return true;
                    }
/* 6 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 7 */             long nanos = timeUnit.toNanos(j);
/* 15 */            if (Thread.interrupted()) {
/* 358 */               throw new InterruptedException();
                    }
/* 17 */            Object obj = this.zzc;
/* 19 */            boolean z = true;
/* 29 */            if ((obj != null) && (!(obj instanceof zzm))) {
/* 31 */                return zzh(obj);
                    }
/* 48 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 53 */            if (nanos >= 1000) {
/* 55 */                zzo zzoVar = this.zze;
/* 59 */                if (zzoVar != zzo.zza) {
/* 63 */                    zzo zzoVar2 = new zzo();
                            while (true) {
/* 66 */                        zzf zzfVar = zzb;
/* 68 */                        zzfVar.zza(zzoVar2, zzoVar);
/* 75 */                        if (zzfVar.zze(this, zzoVar, zzoVar2)) {
/* 112 */                           do {
/* 77 */                                LockSupport.parkNanos(this, nanos);
/* 84 */                                if (Thread.interrupted()) {
/* 118 */                                   zzg(zzoVar2);
/* 126 */                                   throw new InterruptedException();
                                        }
/* 86 */                                Object obj2 = this.zzc;
/* 97 */                                if ((obj2 != null) && (!(obj2 instanceof zzm))) {
/* 99 */                                    return zzh(obj2);
                                        }
/* 108 */                               nanos = jNanoTime - System.nanoTime();
/* 112 */                           } while (nanos >= 1000);
/* 114 */                           zzg(zzoVar2);
                                    break;
                                }
/* 127 */                       zzoVar = this.zze;
/* 131 */                       if (zzoVar == zzo.zza) {
                                }
                            }
                        }
/* 135 */               return zzh(this.zzc);
                    }
/* 142 */           while (nanos > 0) {
/* 144 */               Object obj3 = this.zzc;
/* 155 */               if ((obj3 != null) && (!(obj3 instanceof zzm))) {
/* 157 */                   return zzh(obj3);
                        }
/* 166 */               if (Thread.interrupted()) {
/* 180 */                   throw new InterruptedException();
                        }
/* 172 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 181 */           String string = toString();
/* 185 */           String string2 = timeUnit.toString();
/* 189 */           Locale locale = Locale.ROOT;
/* 191 */           String lowerCase = string2.toLowerCase(locale);
/* 221 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 229 */           if (nanos + 1000 < 0) {
/* 233 */               String strConcat2 = strConcat.concat(" (plus ");
/* 237 */               long j2 = -nanos;
/* 240 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 248 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 252 */               if (jConvert != 0 && nanos2 <= 1000) {
/* 259 */                   z = false;
                        }
/* 260 */               if (jConvert > 0) {
/* 279 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 283 */                   if (z) {
/* 287 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 291 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 295 */               if (z) {
/* 313 */                   strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                        }
/* 319 */               strConcat = strConcat2.concat("delay)");
                    }
/* 327 */           if (isDone()) {
/* 340 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 352 */           throw new TimeoutException(AbstractC0886en.m3508l(strConcat, " for ", string));
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.zzc instanceof zzg;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 1 */             Object obj = this.zzc;
/* 12 */            return (obj != null) & (!(obj instanceof zzm));
                }

                public final String toString() {
                    String strConcat;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append("[status=");
/* 24 */            if (this.zzc instanceof zzg) {
/* 28 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 38 */                zze(sb);
                    } else {
                        try {
/* 42 */                    strConcat = zza();
                        } catch (RuntimeException e) {
/* 58 */                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
                        }
/* 62 */                if (strConcat != null && !strConcat.isEmpty()) {
/* 72 */                    sb.append("PENDING, info=[");
/* 75 */                    sb.append(strConcat);
/* 78 */                    sb.append("]");
                        } else if (isDone()) {
/* 88 */                    zze(sb);
                        } else {
/* 94 */                    sb.append("PENDING");
                        }
                    }
/* 97 */            sb.append("]");
/* 100 */           return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String zza() {
/* 5 */             if (this.zzc instanceof zzm) {
/* 7 */                 return "setFuture=[null]";
                    }
/* 12 */            if (!(this instanceof ScheduledFuture)) {
/* 42 */                return null;
                    }
/* 37 */            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                }

                @Override // com.google.android.gms.internal.play_billing.zzeu
                public final void zzb(Runnable runnable, Executor executor) {
/* 1 */             executor.getClass();
/* 4 */             zzj zzjVar = this.zzd;
/* 8 */             if (zzjVar != zzj.zza) {
/* 12 */                zzj zzjVar2 = new zzj(runnable, executor);
/* 30 */                do {
/* 15 */                    zzjVar2.zzd = zzjVar;
/* 23 */                    if (zzb.zzc(this, zzjVar, zzjVar2)) {
/* 25 */                        return;
                            } else {
/* 26 */                        zzjVar = this.zzd;
                            }
/* 30 */                } while (zzjVar != zzj.zza);
                    }
/* 32 */            zzf(runnable, executor);
                }

                public boolean zzd(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = zzh;
                    }
/* 12 */            if (!zzb.zzd(this, null, obj)) {
/* 19 */                return false;
                    }
/* 14 */            zzc(this);
/* 17 */            return true;
                }

                @Override // java.util.concurrent.Future
/* 358 */       public final Object get() throws ExecutionException, InterruptedException {
                    Object obj;
/* 359 */           if (!Thread.interrupted()) {
/* 360 */               Object obj2 = this.zzc;
                        if ((obj2 != null) & (!(obj2 instanceof zzm))) {
/* 361 */                   return zzh(obj2);
                        }
                        zzo zzoVar = this.zze;
                        if (zzoVar != zzo.zza) {
/* 362 */                   zzo zzoVar2 = new zzo();
                            do {
                                zzf zzfVar = zzb;
/* 363 */                       zzfVar.zza(zzoVar2, zzoVar);
/* 364 */                       if (zzfVar.zze(this, zzoVar, zzoVar2)) {
                                    do {
/* 365 */                               LockSupport.park(this);
/* 366 */                               if (!Thread.interrupted()) {
/* 367 */                                   obj = this.zzc;
                                        } else {
/* 369 */                                   zzg(zzoVar2);
/* 370 */                                   throw new InterruptedException();
                                        }
                                    } while (!((obj != null) & (!(obj instanceof zzm))));
/* 368 */                           return zzh(obj);
                                }
/* 371 */                       zzoVar = this.zze;
                            } while (zzoVar != zzo.zza);
                        }
/* 372 */               return zzh(this.zzc);
                    }
/* 374 */           throw new InterruptedException();
                }
            }
