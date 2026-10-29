            package com.google.firebase.analytics;

            import java.util.Objects;
            import java.util.concurrent.BlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zza extends ThreadPoolExecutor {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zza(FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
/* 10 */            super(0, 1, 30L, timeUnit, blockingQueue);
/* 1 */             Objects.requireNonNull(firebaseAnalytics);
                }
            }
