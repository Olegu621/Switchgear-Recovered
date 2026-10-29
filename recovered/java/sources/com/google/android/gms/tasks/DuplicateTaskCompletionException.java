            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DuplicateTaskCompletionException extends IllegalStateException {
                private DuplicateTaskCompletionException(String str, Throwable th) {
/* 1 */             super(str, th);
                }

                /* JADX INFO: renamed from: of */
                public static IllegalStateException m2198of(Task<?> task) {
                    String strConcat;
/* 5 */             if (!task.isComplete()) {
/* 11 */                return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
                    }
/* 15 */            Exception exception = task.getException();
/* 19 */            if (exception != null) {
/* 21 */                strConcat = "failure";
                    } else if (task.isSuccessful()) {
/* 40 */                strConcat = "result ".concat(String.valueOf(task.getResult()));
                    } else {
/* 54 */                strConcat = task.isCanceled() ? "cancellation" : "unknown issue";
                    }
/* 64 */            return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
                }
            }
