            package com.google.android.gms.tasks;

            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzk implements Runnable {
                final /* synthetic */ Task zza;
                final /* synthetic */ zzl zzb;

                public zzk(zzl zzlVar, Task task) {
/* 1 */             this.zzb = zzlVar;
/* 3 */             this.zza = task;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this.zzb.zzb) {
                        try {
/* 8 */                     zzl zzlVar = this.zzb;
/* 14 */                    if (zzlVar.zzc != null) {
/* 1 */                         OnFailureListener onFailureListener = zzlVar.zzc;
/* 22 */                        Exception exception = this.zza.getException();
/* 26 */                        kb1.m6061n(exception);
/* 29 */                        onFailureListener.onFailure(exception);
                            }
                        } catch (Throwable th) {
/* 38 */                    throw th;
                        }
                    }
                }
            }
