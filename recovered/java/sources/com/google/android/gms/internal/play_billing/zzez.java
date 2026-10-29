            package com.google.android.gms.internal.play_billing;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzez extends zzdy.zzi implements Runnable {
                private final Runnable zzc;

                public zzez(Runnable runnable) {
/* 4 */             runnable.getClass();
/* 7 */             this.zzc = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 3 */                 this.zzc.run();
                    } catch (Throwable th) {
/* 8 */                 zzo(th);
/* 11 */                throw th;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzdy
                public final String zzg() {
/* 11 */            return fm0.m3784j("task=[", this.zzc.toString(), "]");
                }
            }
