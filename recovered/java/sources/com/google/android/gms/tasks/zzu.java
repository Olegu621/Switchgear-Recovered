            package com.google.android.gms.tasks;

            import android.os.Handler;
            import android.os.Looper;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            final class zzu implements Executor {
                private final Handler zza = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             this.zza.post(runnable);
                }
            }
