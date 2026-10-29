            package com.google.android.recaptcha.internal;

            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import kotlin.coroutines.CoroutineContext;
            import p000.C1869kx;
            import p000.e70;
            import p000.z01;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdf {
                public static final e70 zza(Task task) {
/* 3 */             final C1869kx c1869kx = new C1869kx();
/* 13 */            task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task2) {
/* 1 */                     CoroutineContext.Element element = c1869kx;
/* 3 */                     Exception exception = task2.getException();
/* 7 */                     if (exception != null) {
/* 34 */                        ((C1869kx) element).m6289U(exception);
                            } else if (task2.isCanceled()) {
/* 18 */                        ((z01) element).cancel(null);
                            } else {
/* 28 */                        ((C1869kx) element).m10238D(task2.getResult());
                            }
                        }
                    });
/* 18 */            return new zzde(c1869kx);
                }
            }
