            package com.google.android.gms.internal.games_v2;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            enum zzfd implements Executor {
                INSTANCE;

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             runnable.run();
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return "MoreExecutors.directExecutor()";
                }
            }
