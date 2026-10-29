            package com.google.firebase.installations;

            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class AwaitListener implements OnCompleteListener<Void> {
                private final CountDownLatch latch = new CountDownLatch(1);

                public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
/* 3 */             return this.latch.await(j, timeUnit);
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
/* 3 */             this.latch.countDown();
                }

                public void onSuccess() {
/* 3 */             this.latch.countDown();
                }
            }
