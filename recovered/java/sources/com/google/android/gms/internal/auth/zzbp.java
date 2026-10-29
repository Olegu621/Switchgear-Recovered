            package com.google.android.gms.internal.auth;

            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbp extends zzbd {
                final /* synthetic */ zzbq zza;

                public zzbp(zzbq zzbqVar) {
/* 1 */             this.zza = zzbqVar;
                }

                @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
                public final void zzb(ProxyResponse proxyResponse) {
/* 8 */             this.zza.setResult(new zzbu(proxyResponse));
                }
            }
