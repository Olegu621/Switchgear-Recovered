            package com.google.android.gms.tasks;

            import android.app.Activity;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    final class zzw<TResult> extends Task<TResult> {
                private final Object zza = new Object();
                private final zzr zzb = new zzr();
                private boolean zzc;
                private volatile boolean zzd;
                private Object zze;
                private Exception zzf;

                private final void zzf() {
/* 5 */             kb1.m6063p("Task is not yet complete", this.zzc);
                }

                private final void zzg() {
/* 3 */             if (this.zzd) {
/* 13 */                throw new CancellationException("Task is already canceled.");
                    }
                }

                private final void zzh() {
/* 3 */             if (this.zzc) {
/* 10 */                throw DuplicateTaskCompletionException.m2198of(this);
                    }
                }

                private final void zzi() {
                    synchronized (this.zza) {
                        try {
/* 6 */                     if (this.zzc) {
/* 15 */                        this.zzb.zzb(this);
                            }
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.tasks.Task
                public final Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
/* 5 */             zzh zzhVar = new zzh(TaskExecutors.MAIN_THREAD, onCanceledListener);
/* 10 */            this.zzb.zza(zzhVar);
/* 17 */            zzv.zza(activity).zzb(zzhVar);
/* 20 */            zzi();
/* 23 */            return this;
                }

                @Override // com.google.android.gms.tasks.Task
                public final Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
/* 5 */             zzj zzjVar = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener);
/* 10 */            this.zzb.zza(zzjVar);
/* 17 */            zzv.zza(activity).zzb(zzjVar);
/* 20 */            zzi();
/* 23 */            return this;
                }

                @Override // com.google.android.gms.tasks.Task
                public final Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
/* 5 */             zzl zzlVar = new zzl(TaskExecutors.MAIN_THREAD, onFailureListener);
/* 10 */            this.zzb.zza(zzlVar);
/* 17 */            zzv.zza(activity).zzb(zzlVar);
/* 20 */            zzi();
/* 23 */            return this;
                }

                @Override // com.google.android.gms.tasks.Task
                public final Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<? super TResult> onSuccessListener) {
/* 5 */             zzn zznVar = new zzn(TaskExecutors.MAIN_THREAD, onSuccessListener);
/* 10 */            this.zzb.zza(zznVar);
/* 17 */            zzv.zza(activity).zzb(zznVar);
/* 20 */            zzi();
/* 23 */            return this;
                }

                @Override // com.google.android.gms.tasks.Task
                public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
/* 3 */             zzw zzwVar = new zzw();
/* 13 */            this.zzb.zza(new zzd(executor, continuation, zzwVar));
/* 16 */            zzi();
/* 19 */            return zzwVar;
                }

                @Override // com.google.android.gms.tasks.Task
                public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
/* 3 */             zzw zzwVar = new zzw();
/* 13 */            this.zzb.zza(new zzf(executor, continuation, zzwVar));
/* 16 */            zzi();
/* 19 */            return zzwVar;
                }

                @Override // com.google.android.gms.tasks.Task
                public final Exception getException() {
                    Exception exc;
                    synchronized (this.zza) {
/* 4 */                 exc = this.zzf;
                    }
/* 7 */             return exc;
                }

                @Override // com.google.android.gms.tasks.Task
                public final <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable {
                    TResult tresult;
                    synchronized (this.zza) {
                        try {
/* 4 */                     zzf();
/* 7 */                     zzg();
/* 12 */                    boolean zIsInstance = cls.isInstance(this.zzf);
/* 16 */                    Exception exc = this.zzf;
/* 18 */                    if (zIsInstance) {
/* 40 */                        throw cls.cast(exc);
                            }
/* 20 */                    if (exc != null) {
/* 33 */                        throw new RuntimeExecutionException(exc);
                            }
/* 22 */                    tresult = (TResult) this.zze;
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
/* 25 */            return tresult;
                }

                @Override // com.google.android.gms.tasks.Task
                public final boolean isCanceled() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.tasks.Task
                public final boolean isComplete() {
                    boolean z;
                    synchronized (this.zza) {
/* 4 */                 z = this.zzc;
                    }
/* 7 */             return z;
                }

                @Override // com.google.android.gms.tasks.Task
                public final boolean isSuccessful() {
                    boolean z;
                    synchronized (this.zza) {
                        try {
/* 6 */                     z = false;
/* 7 */                     if (this.zzc && !this.zzd && this.zzf == null) {
/* 17 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 24 */                    throw th;
                        }
                    }
/* 22 */            return z;
                }

                @Override // com.google.android.gms.tasks.Task
                public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
/* 1 */             Executor executor = TaskExecutors.MAIN_THREAD;
/* 5 */             zzw zzwVar = new zzw();
/* 15 */            this.zzb.zza(new zzp(executor, successContinuation, zzwVar));
/* 18 */            zzi();
/* 21 */            return zzwVar;
                }

                public final void zza(Exception exc) {
/* 3 */             kb1.m6062o(exc, "Exception must not be null");
                    synchronized (this.zza) {
/* 9 */                 zzh();
/* 13 */                this.zzc = true;
/* 15 */                this.zzf = exc;
                    }
/* 20 */            this.zzb.zzb(this);
                }

                public final void zzb(Object obj) {
                    synchronized (this.zza) {
/* 4 */                 zzh();
/* 8 */                 this.zzc = true;
/* 10 */                this.zze = obj;
                    }
/* 15 */            this.zzb.zzb(this);
                }

                public final boolean zzc() {
                    synchronized (this.zza) {
                        try {
/* 6 */                     if (this.zzc) {
/* 9 */                         return false;
                            }
/* 14 */                    this.zzc = true;
/* 16 */                    this.zzd = true;
/* 21 */                    this.zzb.zzb(this);
/* 13 */                    return true;
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                public final boolean zzd(Exception exc) {
/* 3 */             kb1.m6062o(exc, "Exception must not be null");
                    synchronized (this.zza) {
                        try {
/* 11 */                    if (this.zzc) {
/* 14 */                        return false;
                            }
/* 19 */                    this.zzc = true;
/* 21 */                    this.zzf = exc;
/* 26 */                    this.zzb.zzb(this);
/* 18 */                    return true;
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
                }

                public final boolean zze(Object obj) {
                    synchronized (this.zza) {
                        try {
/* 6 */                     if (this.zzc) {
/* 9 */                         return false;
                            }
/* 14 */                    this.zzc = true;
/* 16 */                    this.zze = obj;
/* 21 */                    this.zzb.zzb(this);
/* 13 */                    return true;
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.tasks.Task
/* 19 */        public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
/* 20 */            return continueWith(TaskExecutors.MAIN_THREAD, continuation);
                }

                @Override // com.google.android.gms.tasks.Task
/* 19 */        public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
/* 20 */            return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
                }

                @Override // com.google.android.gms.tasks.Task
/* 21 */        public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
/* 22 */            zzw zzwVar = new zzw();
/* 23 */            this.zzb.zza(new zzp(executor, successContinuation, zzwVar));
/* 24 */            zzi();
                    return zzwVar;
                }

                @Override // com.google.android.gms.tasks.Task
/* 23 */        public final Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
/* 24 */            addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 23 */        public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
/* 25 */            this.zzb.zza(new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener));
/* 26 */            zzi();
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 23 */        public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
/* 24 */            addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 23 */        public final Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
/* 24 */            addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 24 */        public final Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
/* 25 */            this.zzb.zza(new zzh(executor, onCanceledListener));
/* 26 */            zzi();
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 24 */        public final Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
/* 25 */            this.zzb.zza(new zzl(executor, onFailureListener));
/* 26 */            zzi();
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 24 */        public final Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
/* 25 */            this.zzb.zza(new zzn(executor, onSuccessListener));
/* 26 */            zzi();
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 26 */        public final Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
/* 27 */            this.zzb.zza(new zzj(executor, onCompleteListener));
/* 28 */            zzi();
                    return this;
                }

                @Override // com.google.android.gms.tasks.Task
/* 42 */        public final TResult getResult() {
                    TResult tresult;
                    synchronized (this.zza) {
                        try {
                            zzf();
/* 44 */                    zzg();
                            Exception exc = this.zzf;
                            if (exc == null) {
/* 45 */                        tresult = (TResult) this.zze;
                            } else {
/* 48 */                        throw new RuntimeExecutionException(exc);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return tresult;
                }
            }
