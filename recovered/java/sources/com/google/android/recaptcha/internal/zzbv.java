            package com.google.android.recaptcha.internal;

            import com.google.android.gms.tasks.CancellationTokenSource;
            import com.google.android.gms.tasks.RuntimeExecutionException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.concurrent.CancellationException;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.e70;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbv {
                public static final Task zza(final e70 e70Var) {
/* 12 */            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
/* 20 */            e70Var.invokeOnCompletion(new Function1() { // from class: com.google.android.recaptcha.internal.zzbu
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     Throwable th = (Throwable) obj;
/* 3 */                     boolean z = th instanceof CancellationException;
/* 5 */                     TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
/* 7 */                     if (z) {
/* 11 */                        taskCompletionSource2.setException((Exception) th);
                            } else {
/* 15 */                        e70 e70Var2 = e70Var;
/* 17 */                        Throwable completionExceptionOrNull = e70Var2.getCompletionExceptionOrNull();
/* 21 */                        if (completionExceptionOrNull == null) {
/* 27 */                            taskCompletionSource2.setResult(e70Var2.getCompleted());
                                } else {
/* 39 */                            Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
/* 40 */                            if (runtimeExecutionException == null) {
/* 44 */                                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                                    }
/* 47 */                            taskCompletionSource2.setException(runtimeExecutionException);
                                }
                            }
/* 50 */                    return Unit.f12910a;
                        }
                    });
/* 23 */            return taskCompletionSource.getTask();
                }
            }
