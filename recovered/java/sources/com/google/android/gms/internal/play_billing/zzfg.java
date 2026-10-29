            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfg extends zzes {
                final /* synthetic */ zzfh zza;
                private final Callable zzb;

                public zzfg(zzfh zzfhVar, Callable callable) {
/* 1 */             this.zza = zzfhVar;
/* 6 */             callable.getClass();
/* 9 */             this.zzb = callable;
                }

                @Override // com.google.android.gms.internal.play_billing.zzes
                public final Object zza() throws Exception {
/* 3 */             return this.zzb.call();
                }

                @Override // com.google.android.gms.internal.play_billing.zzes
                public final String zzb() {
/* 3 */             return this.zzb.toString();
                }

                @Override // com.google.android.gms.internal.play_billing.zzes
                public final void zzc(Throwable th) {
/* 3 */             this.zza.zzo(th);
                }

                @Override // com.google.android.gms.internal.play_billing.zzes
                public final void zzd(Object obj) {
/* 3 */             this.zza.zzn(obj);
                }

                @Override // com.google.android.gms.internal.play_billing.zzes
                public final boolean zzf() {
/* 3 */             return this.zza.isDone();
                }
            }
