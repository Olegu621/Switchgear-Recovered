            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.Callable;
            import java.util.concurrent.Executors;
            import java.util.concurrent.RunnableFuture;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfh extends zzee implements RunnableFuture {
                private volatile zzes zzc;

                public zzfh(Callable callable) {
/* 9 */             this.zzc = new zzfg(this, callable);
                }

                public static zzfh zzr(Runnable runnable, Object obj) {
/* 7 */             return new zzfh(Executors.callable(runnable, obj));
                }

                @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
                public final void run() {
/* 1 */             zzes zzesVar = this.zzc;
/* 3 */             if (zzesVar != null) {
/* 5 */                 zzesVar.run();
                    }
/* 9 */             this.zzc = null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzdy
                public final String zzg() {
/* 1 */             zzes zzesVar = this.zzc;
                    return zzesVar != null ? fm0.m3784j("task=[", zzesVar.toString(), "]") : super.zzg();
                }

                @Override // com.google.android.gms.internal.play_billing.zzdy
                public final void zzm() {
                    zzes zzesVar;
/* 5 */             if (zzq() && (zzesVar = this.zzc) != null) {
/* 11 */                zzesVar.zze();
                    }
/* 15 */            this.zzc = null;
                }
            }
