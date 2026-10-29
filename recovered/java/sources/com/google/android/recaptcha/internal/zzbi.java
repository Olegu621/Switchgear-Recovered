            package com.google.android.recaptcha.internal;

            import java.util.TimerTask;
            import p000.i13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbi extends TimerTask {
                final /* synthetic */ zzbo zza;
                final /* synthetic */ zzhk zzb;

                public zzbi(zzbo zzboVar, zzhk zzhkVar) {
/* 1 */             this.zza = zzboVar;
/* 3 */             this.zzb = zzhkVar;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
/* 1 */             zzbo zzboVar = this.zza;
/* 20 */            i13.m4443w(zzbo.zzb(zzboVar).zzc(), null, new zzbh(zzboVar, this.zzb, null), 3);
                }
            }
