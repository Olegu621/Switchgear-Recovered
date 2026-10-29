            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.reflect.Field;
            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import java.security.PrivilegedExceptionAction;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.AbstractC0886en;
            import p000.ds0;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class zzdy<V> extends zzfi implements zzeu<V> {
                static final boolean zza;
                static final zzet zzb;
                private static final zza zzc;
                private static final Object zzd;
                private volatile zzd listeners;
                private volatile Object value;
                private volatile zzk waiters;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                abstract class zza {
                    public /* synthetic */ zza(zzeb zzebVar) {
                    }

                    public abstract zzd zza(zzdy zzdyVar, zzd zzdVar);

                    public abstract zzk zzb(zzdy zzdyVar, zzk zzkVar);

                    public abstract void zzc(zzk zzkVar, zzk zzkVar2);

                    public abstract void zzd(zzk zzkVar, Thread thread);

                    public abstract boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2);

                    public abstract boolean zzf(zzdy zzdyVar, Object obj, Object obj2);

                    public abstract boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                final class zzb {
                    static final zzb zza;
                    static final zzb zzb;
                    final boolean zzc;
                    final Throwable zzd;

                    static {
/* 4 */                 if (zzdy.zza) {
/* 6 */                     zzb = null;
/* 8 */                     zza = null;
                        } else {
/* 17 */                    zzb = new zzb(false, null);
/* 25 */                    zza = new zzb(true, null);
                        }
                    }

                    public zzb(boolean z, Throwable th) {
/* 4 */                 this.zzc = z;
/* 6 */                 this.zzd = th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                final class zzc {
                    static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzdy.zzc.1
                        {
/* 3 */                     super("Failure occurred while trying to finish a future.");
                        }

                        @Override // java.lang.Throwable
                        public final synchronized Throwable fillInStackTrace() {
/* 3 */                     return this;
                        }
                    });
                    final Throwable zzb;

                    public zzc(Throwable th) {
/* 4 */                 th.getClass();
/* 7 */                 this.zzb = th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                final class zze extends zza {
                    final AtomicReferenceFieldUpdater<zzk, Thread> zza;
                    final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
                    final AtomicReferenceFieldUpdater<? super zzdy<?>, zzk> zzc;
                    final AtomicReferenceFieldUpdater<? super zzdy<?>, zzd> zzd;
                    final AtomicReferenceFieldUpdater<? super zzdy<?>, Object> zze;

                    public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
/* 2 */                 super(null);
/* 5 */                 this.zza = atomicReferenceFieldUpdater;
/* 7 */                 this.zzb = atomicReferenceFieldUpdater2;
/* 9 */                 this.zzc = atomicReferenceFieldUpdater3;
/* 11 */                this.zzd = atomicReferenceFieldUpdater4;
/* 13 */                this.zze = atomicReferenceFieldUpdater5;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
/* 3 */                 return this.zzd.getAndSet(zzdyVar, zzdVar);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
/* 3 */                 return this.zzc.getAndSet(zzdyVar, zzkVar);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzc(zzk zzkVar, zzk zzkVar2) {
/* 3 */                 this.zzb.lazySet(zzkVar, zzkVar2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzd(zzk zzkVar, Thread thread) {
/* 3 */                 this.zza.lazySet(zzkVar, thread);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
/* 3 */                 return zzdz.zza(this.zzd, zzdyVar, zzdVar, zzdVar2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
/* 3 */                 return zzdz.zza(this.zze, zzdyVar, obj, obj2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
/* 3 */                 return zzdz.zza(this.zzc, zzdyVar, zzkVar, zzkVar2);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                final class zzf<V> implements Runnable {
                    final zzdy<V> zza;
                    final zzeu<? extends V> zzb;

                    public zzf(zzdy zzdyVar, zzeu zzeuVar) {
/* 4 */                 this.zza = zzdyVar;
/* 6 */                 this.zzb = zzeuVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
/* 7 */                 if (((zzdy) this.zza).value != this) {
/* 34 */                    return;
                        }
/* 10 */                zzeu<? extends V> zzeuVar = this.zzb;
/* 26 */                if (zzdy.zzc.zzf(this.zza, this, zzdy.zzr(zzeuVar))) {
/* 2 */                     zzdy.zzw(this.zza, false);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                interface zzh<V> extends zzeu<V> {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                abstract class zzi<V> extends zzdy<V> implements zzh<V> {
                }

                static {
                    boolean z;
                    Throwable th;
                    zza zzgVar;
                    Throwable th2;
                    try {
/* 11 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 16 */                z = false;
                    }
/* 17 */            zza = z;
/* 26 */            zzb = new zzet(zzdy.class);
/* 28 */            zzeb zzebVar = null;
                    try {
/* 31 */                zzgVar = new zzj(zzebVar);
/* 34 */                th = null;
/* 35 */                th2 = null;
                    } catch (Error | Exception e) {
                        try {
/* 83 */                    th = null;
/* 84 */                    th2 = e;
/* 80 */                    zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, Object.class, FirebaseAnalytics.Param.VALUE));
                        } catch (Error | Exception e2) {
/* 95 */                    th = e2;
/* 92 */                    zzgVar = new zzg(zzebVar);
/* 97 */                    th2 = e;
                        }
                    }
/* 98 */            zzc = zzgVar;
/* 100 */           if (th != null) {
/* 102 */               zzet zzetVar = zzb;
/* 104 */               Logger loggerZza = zzetVar.zza();
/* 108 */               Level level = Level.SEVERE;
/* 117 */               loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 130 */               zzetVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
                    }
/* 138 */           zzd = new Object();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Multi-variable type inference failed */
                public static Object zzr(zzeu zzeuVar) {
                    Throwable thZzh;
/* 6 */             if (zzeuVar instanceof zzh) {
/* 10 */                Object zzbVar = ((zzdy) zzeuVar).value;
/* 14 */                if (zzbVar instanceof zzb) {
/* 17 */                    zzb zzbVar2 = (zzb) zzbVar;
/* 21 */                    if (zzbVar2.zzc) {
/* 23 */                        Throwable th = zzbVar2.zzd;
/* 34 */                        zzbVar = th != null ? new zzb(false, th) : zzb.zzb;
                            }
                        }
/* 36 */                Objects.requireNonNull(zzbVar);
/* 39 */                return zzbVar;
                    }
/* 42 */            if ((zzeuVar instanceof zzfi) && (thZzh = ((zzfi) zzeuVar).zzh()) != null) {
/* 56 */                return new zzc(thZzh);
                    }
/* 60 */            boolean zIsCancelled = zzeuVar.isCancelled();
/* 69 */            if ((!zza) && zIsCancelled) {
/* 71 */                zzb zzbVar3 = zzb.zzb;
/* 73 */                Objects.requireNonNull(zzbVar3);
/* 76 */                return zzbVar3;
                    }
                    try {
/* 77 */                Object objZzs = zzs(zzeuVar);
/* 81 */                if (zIsCancelled) {
/* 98 */                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeuVar))));
                        }
                        return objZzs == null ? zzd : objZzs;
                    } catch (Error | Exception e) {
/* 115 */               return new zzc(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzeuVar)), e2)) : new zzb(false, e2);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeuVar)), e3)) : new zzc(e3.getCause());
                    }
                }

                private static Object zzs(Future future) throws ExecutionException {
                    Object obj;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 28 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 24 */                        Thread.currentThread().interrupt();
                            }
/* 27 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return obj;
                }

                private final void zzt(StringBuilder sb) {
                    try {
/* 3 */                 Object objZzs = zzs(this);
/* 9 */                 sb.append("SUCCESS, result=[");
/* 12 */                if (objZzs == null) {
/* 16 */                    sb.append("null");
                        } else if (objZzs == this) {
/* 28 */                    sb.append("this future");
                        } else {
/* 40 */                    sb.append(objZzs.getClass().getName());
/* 45 */                    sb.append("@");
/* 56 */                    sb.append(Integer.toHexString(System.identityHashCode(objZzs)));
                        }
/* 59 */                sb.append("]");
                    } catch (CancellationException unused) {
/* 83 */                sb.append("CANCELLED");
                    } catch (ExecutionException e) {
/* 89 */                sb.append("FAILURE, cause=[");
/* 96 */                sb.append(e.getCause());
/* 99 */                sb.append("]");
                    } catch (Exception e2) {
/* 65 */                sb.append("UNKNOWN, cause=[");
/* 72 */                sb.append(e2.getClass());
/* 77 */                sb.append(" thrown from get()]");
                    }
                }

                private final void zzu(StringBuilder sb) {
                    String strConcat;
/* 1 */             int length = sb.length();
/* 7 */             sb.append("PENDING");
/* 10 */            Object obj = this.value;
/* 16 */            if (obj instanceof zzf) {
/* 20 */                sb.append(", setFuture=[");
/* 27 */                zzv(sb, ((zzf) obj).zzb);
/* 30 */                sb.append("]");
                    } else {
                        try {
/* 34 */                    strConcat = zzg();
/* 39 */                    if (strConcat == null || strConcat.isEmpty()) {
/* 47 */                        strConcat = null;
                            }
                        } catch (Exception | StackOverflowError e) {
/* 62 */                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
                        }
/* 66 */                if (strConcat != null) {
/* 70 */                    sb.append(", info=[");
/* 73 */                    sb.append(strConcat);
/* 76 */                    sb.append("]");
                        }
                    }
/* 83 */            if (isDone()) {
/* 89 */                sb.delete(length, sb.length());
/* 92 */                zzt(sb);
                    }
                }

                private final void zzv(StringBuilder sb, Object obj) {
                    try {
/* 1 */                 if (obj == this) {
/* 5 */                     sb.append("this future");
                        } else {
/* 13 */                    sb.append(obj);
                        }
                    } catch (Exception e) {
/* 11 */                e = e;
/* 19 */                sb.append("Exception thrown from implementation: ");
/* 26 */                sb.append(e.getClass());
                    } catch (StackOverflowError e2) {
/* 9 */                 e = e2;
/* 19 */                sb.append("Exception thrown from implementation: ");
/* 26 */                sb.append(e.getClass());
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzw(zzdy zzdyVar, boolean z) {
/* 2 */             zzd zzdVar = null;
                    while (true) {
/* 11 */                for (zzk zzkVarZzb = zzc.zzb(zzdyVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
/* 13 */                    Thread thread = zzkVarZzb.thread;
/* 15 */                    if (thread != null) {
/* 17 */                        zzkVarZzb.thread = null;
/* 19 */                        LockSupport.unpark(thread);
                            }
                        }
/* 25 */                zzdyVar.zzm();
/* 36 */                zzd zzdVar2 = zzdVar;
/* 32 */                zzd zzdVarZza = zzc.zza(zzdyVar, zzd.zza);
/* 38 */                zzd zzdVar3 = zzdVar2;
/* 39 */                while (zzdVarZza != null) {
/* 41 */                    zzd zzdVar4 = zzdVarZza.next;
/* 43 */                    zzdVarZza.next = zzdVar3;
/* 45 */                    zzdVar3 = zzdVarZza;
/* 46 */                    zzdVarZza = zzdVar4;
                        }
/* 48 */                while (zzdVar3 != null) {
/* 50 */                    Runnable runnable = zzdVar3.zzb;
/* 52 */                    zzd zzdVar5 = zzdVar3.next;
/* 54 */                    Objects.requireNonNull(runnable);
/* 57 */                    Runnable runnable2 = runnable;
/* 61 */                    if (runnable2 instanceof zzf) {
/* 63 */                        zzf zzfVar = (zzf) runnable2;
/* 65 */                        zzdyVar = zzfVar.zza;
/* 69 */                        if (zzdyVar.value == zzfVar) {
/* 83 */                            if (zzc.zzf(zzdyVar, zzfVar, zzr(zzfVar.zzb))) {
/* 85 */                                zzdVar = zzdVar5;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
/* 87 */                        Executor executor = zzdVar3.zzc;
/* 89 */                        Objects.requireNonNull(executor);
/* 94 */                        zzx(runnable2, executor);
                            }
/* 97 */                    zzdVar3 = zzdVar5;
                        }
/* 99 */                return;
                    }
                }

                private static void zzx(Runnable runnable, Executor executor) {
                    try {
/* 1 */                 executor.execute(runnable);
                    } catch (Exception e) {
/* 35 */                zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC0886en.m3509m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
                    }
                }

                private final void zzy(zzk zzkVar) {
/* 2 */             zzkVar.thread = null;
                    while (true) {
/* 4 */                 zzk zzkVar2 = this.waiters;
/* 8 */                 if (zzkVar2 != zzk.zza) {
/* 10 */                    zzk zzkVar3 = null;
/* 11 */                    while (zzkVar2 != null) {
/* 13 */                        zzk zzkVar4 = zzkVar2.next;
/* 17 */                        if (zzkVar2.thread != null) {
/* 19 */                            zzkVar3 = zzkVar2;
                                } else if (zzkVar3 != null) {
/* 23 */                            zzkVar3.next = zzkVar4;
/* 27 */                            if (zzkVar3.thread == null) {
                                    }
                                } else if (!zzc.zzg(this, zzkVar2, zzkVar4)) {
                                }
/* 39 */                        zzkVar2 = zzkVar4;
                            }
/* 41 */                    return;
                        }
/* 41 */                return;
                    }
                }

                private static final Object zzz(Object obj) throws ExecutionException {
/* 3 */             if (obj instanceof zzb) {
/* 27 */                Throwable th = ((zzb) obj).zzd;
/* 33 */                CancellationException cancellationException = new CancellationException("Task was cancelled.");
/* 36 */                cancellationException.initCause(th);
/* 39 */                throw cancellationException;
                    }
/* 7 */             if (obj instanceof zzc) {
/* 24 */                throw new ExecutionException(((zzc) obj).zzb);
                    }
/* 11 */            if (obj == zzd) {
/* 13 */                return null;
                    }
/* 14 */            return obj;
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
                    zzb zzbVar;
/* 1 */             Object obj = this.value;
/* 13 */            if (!(obj instanceof zzf) && !(obj == null)) {
/* 5 */                 return false;
                    }
/* 17 */            if (zza) {
/* 28 */                zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
                    } else {
/* 37 */                zzbVar = z ? zzb.zza : zzb.zzb;
/* 39 */                Objects.requireNonNull(zzbVar);
                    }
/* 42 */            boolean z2 = false;
                    while (true) {
/* 49 */                if (zzc.zzf(this, obj, zzbVar)) {
/* 51 */                    zzw(this, z);
/* 56 */                    if (obj instanceof zzf) {
/* 60 */                        zzeu<? extends V> zzeuVar = ((zzf) obj).zzb;
/* 64 */                        if (zzeuVar instanceof zzh) {
/* 66 */                            this = (zzdy) zzeuVar;
/* 68 */                            obj = this.value;
/* 78 */                            if (!(obj == null) && !(obj instanceof zzf)) {
/* 6 */                                 return true;
                                    }
/* 80 */                            z2 = true;
                                } else {
/* 83 */                            zzeuVar.cancel(z);
                                }
                            }
/* 6 */                     return true;
                        }
/* 87 */                obj = this.value;
/* 91 */                if (!(obj instanceof zzf)) {
/* 93 */                    return z2;
                        }
                    }
                }

                @Override // java.util.concurrent.Future
                public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 7 */             long nanos = timeUnit.toNanos(j);
/* 15 */            if (Thread.interrupted()) {
/* 370 */               throw new InterruptedException();
                    }
/* 17 */            Object obj = this.value;
/* 19 */            boolean z = true;
/* 29 */            if ((obj != null) && (!(obj instanceof zzf))) {
/* 31 */                return zzz(obj);
                    }
/* 48 */            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
/* 53 */            if (nanos >= 1000) {
/* 55 */                zzk zzkVar = this.waiters;
/* 59 */                if (zzkVar != zzk.zza) {
/* 63 */                    zzk zzkVar2 = new zzk();
                            while (true) {
/* 66 */                        zza zzaVar = zzc;
/* 68 */                        zzaVar.zzc(zzkVar2, zzkVar);
/* 75 */                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
/* 121 */                           do {
/* 86 */                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
/* 93 */                                if (Thread.interrupted()) {
/* 127 */                                   zzy(zzkVar2);
/* 135 */                                   throw new InterruptedException();
                                        }
/* 95 */                                Object obj2 = this.value;
/* 106 */                               if ((obj2 != null) && (!(obj2 instanceof zzf))) {
/* 108 */                                   return zzz(obj2);
                                        }
/* 117 */                               nanos = jNanoTime - System.nanoTime();
/* 121 */                           } while (nanos >= 1000);
/* 123 */                           zzy(zzkVar2);
                                    break;
                                }
/* 136 */                       zzkVar = this.waiters;
/* 140 */                       if (zzkVar == zzk.zza) {
                                }
                            }
                        }
/* 142 */               Object obj3 = this.value;
/* 144 */               Objects.requireNonNull(obj3);
/* 147 */               return zzz(obj3);
                    }
/* 154 */           while (nanos > 0) {
/* 156 */               Object obj4 = this.value;
/* 167 */               if ((obj4 != null) && (!(obj4 instanceof zzf))) {
/* 169 */                   return zzz(obj4);
                        }
/* 178 */               if (Thread.interrupted()) {
/* 192 */                   throw new InterruptedException();
                        }
/* 184 */               nanos = jNanoTime - System.nanoTime();
                    }
/* 193 */           String string = toString();
/* 197 */           String string2 = timeUnit.toString();
/* 201 */           Locale locale = Locale.ROOT;
/* 203 */           String lowerCase = string2.toLowerCase(locale);
/* 233 */           String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
/* 241 */           if (nanos + 1000 < 0) {
/* 245 */               String strConcat2 = strConcat.concat(" (plus ");
/* 249 */               long j2 = -nanos;
/* 252 */               long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
/* 260 */               long nanos2 = j2 - timeUnit.toNanos(jConvert);
/* 264 */               if (jConvert != 0 && nanos2 <= 1000) {
/* 271 */                   z = false;
                        }
/* 272 */               if (jConvert > 0) {
/* 291 */                   String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
/* 295 */                   if (z) {
/* 299 */                       strConcat3 = strConcat3.concat(",");
                            }
/* 303 */                   strConcat2 = strConcat3.concat(" ");
                        }
/* 307 */               if (z) {
/* 325 */                   strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                        }
/* 331 */               strConcat = strConcat2.concat("delay)");
                    }
/* 339 */           if (isDone()) {
/* 352 */               throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
                    }
/* 364 */           throw new TimeoutException(AbstractC0886en.m3508l(strConcat, " for ", string));
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.value instanceof zzb;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 1 */             Object obj = this.value;
/* 12 */            return (obj != null) & (!(obj instanceof zzf));
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 20 */            if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
/* 30 */                sb.append(getClass().getSimpleName());
                    } else {
/* 42 */                sb.append(getClass().getName());
                    }
/* 47 */            sb.append('@');
/* 58 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 63 */            sb.append("[status=");
/* 70 */            if (this.value instanceof zzb) {
/* 74 */                sb.append("CANCELLED");
                    } else if (isDone()) {
/* 84 */                zzt(sb);
                    } else {
/* 88 */                zzu(sb);
                    }
/* 93 */            sb.append("]");
/* 96 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.play_billing.zzeu
                public final void zzb(Runnable runnable, Executor executor) {
                    zzd zzdVar;
/* 3 */             zzbe.zzc(executor, "Executor was null.");
/* 10 */            if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
/* 20 */                zzd zzdVar2 = new zzd(runnable, executor);
/* 38 */                do {
/* 23 */                    zzdVar2.next = zzdVar;
/* 31 */                    if (zzc.zze(this, zzdVar, zzdVar2)) {
/* 33 */                        return;
                            } else {
/* 34 */                        zzdVar = this.listeners;
                            }
/* 38 */                } while (zzdVar != zzd.zza);
                    }
/* 40 */            zzx(runnable, executor);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public String zzg() {
/* 3 */             if (!(this instanceof ScheduledFuture)) {
/* 33 */                return null;
                    }
/* 28 */            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                }

                @Override // com.google.android.gms.internal.play_billing.zzfi
                public final Throwable zzh() {
/* 3 */             if (!(this instanceof zzh)) {
/* 16 */                return null;
                    }
/* 5 */             Object obj = this.value;
/* 9 */             if (obj instanceof zzc) {
/* 13 */                return ((zzc) obj).zzb;
                    }
/* 16 */            return null;
                }

                public void zzm() {
                }

                public final boolean zzn(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = zzd;
                    }
/* 13 */            if (!zzc.zzf(this, null, obj)) {
/* 12 */                return false;
                    }
/* 15 */            zzw(this, false);
/* 18 */            return true;
                }

                public final boolean zzo(Throwable th) {
/* 14 */            if (!zzc.zzf(this, null, new zzc(th))) {
/* 13 */                return false;
                    }
/* 16 */            zzw(this, false);
/* 19 */            return true;
                }

                public final boolean zzp(zzeu zzeuVar) {
                    zzc zzcVar;
/* 1 */             Object obj = this.value;
/* 4 */             if (obj == null) {
/* 12 */                if (zzeuVar.isDone()) {
/* 24 */                    if (!zzc.zzf(this, null, zzr(zzeuVar))) {
/* 3 */                         return false;
                            }
/* 26 */                    zzw(this, false);
/* 10 */                    return true;
                        }
/* 33 */                zzf zzfVar = new zzf(this, zzeuVar);
/* 42 */                if (zzc.zzf(this, null, zzfVar)) {
                            try {
/* 46 */                        zzeuVar.zzb(zzfVar, zzed.INSTANCE);
                            } catch (Throwable th) {
                                try {
/* 53 */                            zzcVar = new zzc(th);
                                } catch (Error | Exception unused) {
/* 57 */                            zzcVar = zzc.zza;
                                }
/* 61 */                        zzc.zzf(this, zzfVar, zzcVar);
                            }
/* 10 */                    return true;
                        }
/* 65 */                obj = this.value;
                    }
/* 69 */            if (obj instanceof zzb) {
/* 75 */                zzeuVar.cancel(((zzb) obj).zzc);
                    }
/* 3 */             return false;
                }

                public final boolean zzq() {
/* 1 */             Object obj = this.value;
                    return (obj instanceof zzb) && ((zzb) obj).zzc;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 4 */         final class zzg extends zza {
                    public /* synthetic */ zzg(zzeb zzebVar) {
/* 2 */                 super(null);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
                        zzd zzdVar2;
                        synchronized (zzdyVar) {
                            try {
/* 1 */                         zzdVar2 = zzdyVar.listeners;
/* 6 */                         if (zzdVar2 != zzdVar) {
/* 1 */                             zzdyVar.listeners = zzdVar;
                                }
                            } catch (Throwable th) {
/* 17 */                        throw th;
                            }
                        }
/* 15 */                return zzdVar2;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
                        zzk zzkVar2;
                        synchronized (zzdyVar) {
                            try {
/* 1 */                         zzkVar2 = zzdyVar.waiters;
/* 6 */                         if (zzkVar2 != zzkVar) {
/* 1 */                             zzdyVar.waiters = zzkVar;
                                }
                            } catch (Throwable th) {
/* 17 */                        throw th;
                            }
                        }
/* 15 */                return zzkVar2;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzc(zzk zzkVar, zzk zzkVar2) {
/* 1 */                 zzkVar.next = zzkVar2;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzd(zzk zzkVar, Thread thread) {
/* 1 */                 zzkVar.thread = thread;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
                        synchronized (zzdyVar) {
                            try {
/* 6 */                         if (zzdyVar.listeners != zzdVar) {
/* 17 */                            return false;
                                }
/* 1 */                         zzdyVar.listeners = zzdVar2;
/* 12 */                        return true;
                            } catch (Throwable th) {
/* 20 */                        throw th;
                            }
                        }
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
                        synchronized (zzdyVar) {
                            try {
/* 6 */                         if (zzdyVar.value != obj) {
/* 17 */                            return false;
                                }
/* 1 */                         zzdyVar.value = obj2;
/* 12 */                        return true;
                            } catch (Throwable th) {
/* 20 */                        throw th;
                            }
                        }
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
                        synchronized (zzdyVar) {
                            try {
/* 6 */                         if (zzdyVar.waiters != zzkVar) {
/* 17 */                            return false;
                                }
/* 1 */                         zzdyVar.waiters = zzkVar2;
/* 12 */                        return true;
                            } catch (Throwable th) {
/* 20 */                        throw th;
                            }
                        }
                    }

/* 5 */             private zzg() {
/* 6 */                 throw null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 4 */         final class zzj extends zza {
                    static final Unsafe zza;
                    static final long zzb;
                    static final long zzc;
                    static final long zzd;
                    static final long zze;
                    static final long zzf;

                    static {
                        Unsafe unsafe;
                        try {
                            try {
/* 3 */                         unsafe = Unsafe.getUnsafe();
                            } catch (SecurityException unused) {
/* 17 */                        unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.play_billing.zzdy.zzj.1
                                    @Override // java.security.PrivilegedExceptionAction
                                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
/* 9 */                                 for (Field field : Unsafe.class.getDeclaredFields()) {
/* 14 */                                    field.setAccessible(true);
/* 18 */                                    Object obj = field.get(null);
/* 26 */                                    if (Unsafe.class.isInstance(obj)) {
/* 32 */                                        return (Unsafe) Unsafe.class.cast(obj);
                                            }
                                        }
/* 45 */                                throw new NoSuchFieldError("the Unsafe");
                                    }
                                });
                            }
                            try {
/* 31 */                        zzc = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("waiters"));
/* 43 */                        zzb = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("listeners"));
/* 55 */                        zzd = unsafe.objectFieldOffset(zzdy.class.getDeclaredField(FirebaseAnalytics.Param.VALUE));
/* 67 */                        zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
/* 79 */                        zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
/* 81 */                        zza = unsafe;
                            } catch (NoSuchFieldException e) {
/* 85 */                        ds0.m3199p(e);
                            }
                        } catch (PrivilegedActionException e2) {
/* 96 */                    ds0.m3198o("Could not initialize intrinsics", e2.getCause());
                        }
                    }

                    public /* synthetic */ zzj(zzeb zzebVar) {
/* 2 */                 super(null);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
                        zzd zzdVar2;
/* 12 */                do {
/* 1 */                     zzdVar2 = zzdyVar.listeners;
/* 5 */                     if (zzdVar == zzdVar2) {
                                break;
                            }
/* 12 */                } while (!zze(zzdyVar, zzdVar2, zzdVar));
/* 14 */                return zzdVar2;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
                        zzk zzkVar2;
/* 12 */                do {
/* 1 */                     zzkVar2 = zzdyVar.waiters;
/* 5 */                     if (zzkVar == zzkVar2) {
                                break;
                            }
/* 12 */                } while (!zzg(zzdyVar, zzkVar2, zzkVar));
/* 14 */                return zzkVar2;
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzc(zzk zzkVar, zzk zzkVar2) {
/* 5 */                 zza.putObject(zzkVar, zzf, zzkVar2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final void zzd(zzk zzkVar, Thread thread) {
/* 5 */                 zza.putObject(zzkVar, zze, thread);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
/* 8 */                 return zzea.zza(zza, zzdyVar, zzb, zzdVar, zzdVar2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
/* 8 */                 return zzea.zza(zza, zzdyVar, zzd, obj, obj2);
                    }

                    @Override // com.google.android.gms.internal.play_billing.zzdy.zza
                    public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
/* 8 */                 return zzea.zza(zza, zzdyVar, zzc, zzkVar, zzkVar2);
                    }

/* 5 */             private zzj() {
/* 6 */                 throw null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 8 */         final class zzd {
                    static final zzd zza = new zzd();
                    zzd next;
                    final Runnable zzb;
                    final Executor zzc;

                    public zzd() {
/* 5 */                 this.zzb = null;
/* 7 */                 this.zzc = null;
                    }

/* 9 */             public zzd(Runnable runnable, Executor executor) {
                        this.zzb = runnable;
                        this.zzc = executor;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 14 */        final class zzk {
                    static final zzk zza = new zzk(false);
                    volatile zzk next;
                    volatile Thread thread;

                    public zzk() {
/* 12 */                zzdy.zzc.zzd(this, Thread.currentThread());
                    }

/* 15 */            public zzk(boolean z) {
                    }
                }

                @Override // java.util.concurrent.Future
/* 370 */       public final Object get() throws ExecutionException, InterruptedException {
                    Object obj;
/* 371 */           if (!Thread.interrupted()) {
/* 372 */               Object obj2 = this.value;
                        if ((obj2 != null) & (!(obj2 instanceof zzf))) {
/* 373 */                   return zzz(obj2);
                        }
                        zzk zzkVar = this.waiters;
                        if (zzkVar != zzk.zza) {
/* 374 */                   zzk zzkVar2 = new zzk();
                            do {
                                zza zzaVar = zzc;
/* 375 */                       zzaVar.zzc(zzkVar2, zzkVar);
/* 376 */                       if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                                    do {
/* 377 */                               LockSupport.park(this);
/* 378 */                               if (!Thread.interrupted()) {
/* 379 */                                   obj = this.value;
                                        } else {
/* 381 */                                   zzy(zzkVar2);
/* 382 */                                   throw new InterruptedException();
                                        }
                                    } while (!((obj != null) & (!(obj instanceof zzf))));
/* 380 */                           return zzz(obj);
                                }
/* 383 */                       zzkVar = this.waiters;
                            } while (zzkVar != zzk.zza);
                        }
                        Object obj3 = this.value;
/* 384 */               Objects.requireNonNull(obj3);
                        return zzz(obj3);
                    }
/* 386 */           throw new InterruptedException();
                }
            }
