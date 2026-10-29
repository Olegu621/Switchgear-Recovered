            package com.google.android.recaptcha.internal;

            import java.util.TimerTask;
            import p000.i13;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgu extends TimerTask {
                final /* synthetic */ zzgz zza;

                public zzgu(zzgz zzgzVar) {
/* 1 */             this.zza = zzgzVar;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
/* 1 */                 int i = zzby.zza;
/* 28 */                i13.m4443w(((zzcr) r51.m8065b(zzgw.zza).getValue()).zza(), null, new zzgv(this.zza, null), 3);
                    } catch (Exception unused) {
                    }
                }
            }
