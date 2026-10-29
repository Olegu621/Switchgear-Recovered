            package com.google.android.gms.tasks;

            import android.os.Looper;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.C1951n4;
            import p000.f42;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class Tasks {
                private Tasks() {
                }

                public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 3 */             kb1.m6060m("Must not be called on the main application thread");
/* 6 */             Looper looperMyLooper = Looper.myLooper();
/* 11 */            if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
/* 32 */                f42.m3656l("Must not be called on GoogleApiHandler thread.");
/* 10 */                return null;
                    }
/* 38 */            kb1.m6062o(task, "Task must not be null");
/* 43 */            kb1.m6062o(timeUnit, "TimeUnit must not be null");
/* 50 */            if (task.isComplete()) {
/* 52 */                return (TResult) zza(task);
                    }
/* 59 */            zzad zzadVar = new zzad(null);
/* 62 */            zzb(task, zzadVar);
/* 69 */            if (zzadVar.zzb(j, timeUnit)) {
/* 71 */                return (TResult) zza(task);
                    }
/* 83 */            throw new TimeoutException("Timed out waiting for Task");
                }

                @Deprecated
                public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
/* 3 */             kb1.m6062o(executor, "Executor must not be null");
/* 8 */             kb1.m6062o(callable, "Callback must not be null");
/* 13 */            zzw zzwVar = new zzw();
/* 21 */            executor.execute(new zzz(zzwVar, callable));
/* 24 */            return zzwVar;
                }

                public static <TResult> Task<TResult> forCanceled() {
/* 3 */             zzw zzwVar = new zzw();
/* 6 */             zzwVar.zzc();
/* 9 */             return zzwVar;
                }

                public static <TResult> Task<TResult> forException(Exception exc) {
/* 3 */             zzw zzwVar = new zzw();
/* 6 */             zzwVar.zza(exc);
/* 9 */             return zzwVar;
                }

                public static <TResult> Task<TResult> forResult(TResult tresult) {
/* 3 */             zzw zzwVar = new zzw();
/* 6 */             zzwVar.zzb(tresult);
/* 9 */             return zzwVar;
                }

                public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
/* 2 */             if (collection == null || collection.isEmpty()) {
/* 71 */                return forResult(null);
                    }
/* 11 */            Iterator<? extends Task<?>> it = collection.iterator();
/* 19 */            while (it.hasNext()) {
/* 27 */                if (it.next() == null) {
/* 32 */                    C1951n4.m6868s("null tasks are not accepted");
/* 1 */                     return null;
                        }
                    }
/* 38 */            zzw zzwVar = new zzw();
/* 47 */            zzaf zzafVar = new zzaf(collection.size(), zzwVar);
/* 50 */            Iterator<? extends Task<?>> it2 = collection.iterator();
/* 58 */            while (it2.hasNext()) {
/* 66 */                zzb(it2.next(), zzafVar);
                    }
/* 70 */            return zzwVar;
                }

                public static Task<List<Task<?>>> whenAllComplete(Executor executor, Collection<? extends Task<?>> collection) {
                    return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : whenAll(collection).continueWithTask(executor, new zzab(collection));
                }

                public static <TResult> Task<List<TResult>> whenAllSuccess(Executor executor, Collection<? extends Task> collection) {
                    return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(executor, new zzaa(collection));
                }

                public static <T> Task<T> withTimeout(Task<T> task, long j, TimeUnit timeUnit) {
/* 3 */             kb1.m6062o(task, "Task must not be null");
/* 17 */            kb1.m6053f("Timeout must be positive", j > 0);
/* 22 */            kb1.m6062o(timeUnit, "TimeUnit must not be null");
/* 27 */            final zzb zzbVar = new zzb();
/* 32 */            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
/* 41 */            final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
/* 53 */            zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
                        @Override // java.lang.Runnable
                        public final void run() {
/* 8 */                     taskCompletionSource.trySetException(new TimeoutException());
                        }
                    }, timeUnit.toMillis(j));
/* 61 */            task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task2) {
/* 4 */                     zzaVar.removeCallbacksAndMessages(null);
/* 7 */                     TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
/* 13 */                    if (task2.isSuccessful()) {
/* 19 */                        taskCompletionSource2.trySetResult(task2.getResult());
                            } else {
/* 27 */                        if (task2.isCanceled()) {
/* 31 */                            zzbVar.zza();
/* 34 */                            return;
                                }
/* 35 */                        Exception exception = task2.getException();
/* 39 */                        exception.getClass();
/* 42 */                        taskCompletionSource2.trySetException(exception);
                            }
                        }
                    });
/* 64 */            return taskCompletionSource.getTask();
                }

                private static Object zza(Task task) throws ExecutionException {
/* 5 */             if (task.isSuccessful()) {
/* 7 */                 return task.getResult();
                    }
/* 16 */            if (task.isCanceled()) {
/* 25 */                throw new CancellationException("Task is already canceled");
                    }
/* 35 */            throw new ExecutionException(task.getException());
                }

                private static void zzb(Task task, zzae zzaeVar) {
/* 1 */             Executor executor = TaskExecutors.zza;
/* 3 */             task.addOnSuccessListener(executor, zzaeVar);
/* 6 */             task.addOnFailureListener(executor, zzaeVar);
/* 9 */             task.addOnCanceledListener(executor, zzaeVar);
                }

                @Deprecated
/* 24 */        public static <TResult> Task<TResult> call(Callable<TResult> callable) {
/* 25 */            return call(TaskExecutors.MAIN_THREAD, callable);
                }

/* 30 */        public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
/* 31 */            return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
                }

/* 30 */        public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
/* 31 */            return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
                }

/* 31 */        public static Task<List<Task<?>>> whenAllComplete(Executor executor, Task<?>... taskArr) {
                    if (taskArr != null && taskArr.length != 0) {
/* 32 */                return whenAllComplete(executor, Arrays.asList(taskArr));
                    }
/* 33 */            return forResult(Collections.EMPTY_LIST);
                }

/* 31 */        public static <TResult> Task<List<TResult>> whenAllSuccess(Executor executor, Task... taskArr) {
                    if (taskArr != null && taskArr.length != 0) {
/* 32 */                return whenAllSuccess(executor, Arrays.asList(taskArr));
                    }
/* 33 */            return forResult(Collections.EMPTY_LIST);
                }

/* 33 */        public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
                    if (taskArr != null && taskArr.length != 0) {
/* 34 */                return whenAllComplete(Arrays.asList(taskArr));
                    }
/* 35 */            return forResult(Collections.EMPTY_LIST);
                }

/* 33 */        public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
                    if (taskArr != null && taskArr.length != 0) {
/* 34 */                return whenAllSuccess(Arrays.asList(taskArr));
                    }
/* 35 */            return forResult(Collections.EMPTY_LIST);
                }

/* 75 */        public static Task<Void> whenAll(Task<?>... taskArr) {
                    if (taskArr != null && taskArr.length != 0) {
/* 76 */                return whenAll(Arrays.asList(taskArr));
                    }
/* 77 */            return forResult(null);
                }

/* 83 */        public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
/* 84 */            kb1.m6060m("Must not be called on the main application thread");
/* 85 */            Looper looperMyLooper = Looper.myLooper();
/* 86 */            if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
/* 87 */                f42.m3656l("Must not be called on GoogleApiHandler thread.");
                        return null;
                    }
/* 89 */            kb1.m6062o(task, "Task must not be null");
/* 90 */            if (task.isComplete()) {
/* 91 */                return (TResult) zza(task);
                    }
/* 92 */            zzad zzadVar = new zzad(null);
/* 93 */            zzb(task, zzadVar);
/* 94 */            zzadVar.zza();
/* 95 */            return (TResult) zza(task);
                }
            }
