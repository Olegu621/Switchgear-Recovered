            package com.google.android.gms.tasks;

            import android.app.Activity;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public abstract class Task<TResult> {
                public Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
/* 8 */             throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
                }

                public Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
/* 8 */             throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
                }

                public abstract Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener);

                public abstract Task<TResult> addOnFailureListener(OnFailureListener onFailureListener);

                public abstract Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

                public abstract Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<? super TResult> onSuccessListener);

                public abstract Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener);

                public abstract Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener);

                public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
/* 8 */             throw new UnsupportedOperationException("continueWith is not implemented");
                }

                public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
/* 8 */             throw new UnsupportedOperationException("continueWithTask is not implemented");
                }

                public abstract Exception getException();

                public abstract TResult getResult();

                public abstract <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable;

                public abstract boolean isCanceled();

                public abstract boolean isComplete();

                public abstract boolean isSuccessful();

                public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
/* 8 */             throw new UnsupportedOperationException("onSuccessTask is not implemented");
                }

/* 8 */         public Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
/* 9 */             throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
                }

/* 8 */         public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
/* 9 */             throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
                }

/* 8 */         public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
/* 9 */             throw new UnsupportedOperationException("continueWith is not implemented");
                }

/* 8 */         public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
/* 9 */             throw new UnsupportedOperationException("continueWithTask is not implemented");
                }

/* 8 */         public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
/* 9 */             throw new UnsupportedOperationException("onSuccessTask is not implemented");
                }

/* 9 */         public Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
/* 10 */            throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
                }

/* 9 */         public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
/* 10 */            throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
                }
            }
