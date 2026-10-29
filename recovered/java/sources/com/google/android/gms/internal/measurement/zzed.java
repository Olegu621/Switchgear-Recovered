            package com.google.android.gms.internal.measurement;

            import java.util.Objects;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzed implements ThreadFactory {
                private final ThreadFactory zza;

                public zzed(zzfb zzfbVar) {
/* 1 */             Objects.requireNonNull(zzfbVar);
/* 11 */            this.zza = Executors.defaultThreadFactory();
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 3 */             Thread threadNewThread = this.zza.newThread(runnable);
/* 9 */             threadNewThread.setName("ScionFrontendApi");
/* 12 */            return threadNewThread;
                }
            }
