            package com.google.android.gms.internal.auth;

            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaf extends zzah {
                final /* synthetic */ zzag zza;

                public zzaf(zzag zzagVar) {
/* 1 */             this.zza = zzagVar;
                }

                @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
                public final void zzc(boolean z) {
/* 17 */            this.zza.setResult(new zzak(z ? Status.f3440e : zzal.zza));
                }
            }
