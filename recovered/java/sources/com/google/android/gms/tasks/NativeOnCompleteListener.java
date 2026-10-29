            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NativeOnCompleteListener implements OnCompleteListener<Object> {
                private final long zza;

                public NativeOnCompleteListener(long j) {
/* 4 */             this.zza = j;
                }

                public static void createAndAddCallback(Task<Object> task, long j) {
/* 6 */             task.addOnCompleteListener(new NativeOnCompleteListener(j));
                }

                public native void nativeOnComplete(long j, Object obj, boolean z, boolean z2, String str);

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Object> task) {
                    Object result;
                    String message;
                    Exception exception;
/* 6 */             if (task.isSuccessful()) {
/* 8 */                 result = task.getResult();
/* 13 */                message = null;
                    } else if (task.isCanceled() || (exception = task.getException()) == null) {
/* 34 */                result = null;
/* 35 */                message = null;
                    } else {
/* 27 */                message = exception.getMessage();
/* 32 */                result = null;
                    }
/* 47 */            nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
                }
            }
