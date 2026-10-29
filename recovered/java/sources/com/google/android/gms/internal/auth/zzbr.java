            package com.google.android.gms.internal.auth;

            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbr extends zzbd {
                final /* synthetic */ zzbs zza;

                public zzbr(zzbs zzbsVar) {
/* 1 */             this.zza = zzbsVar;
                }

                @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
                public final void zzc(String str) {
/* 1 */             zzbs zzbsVar = this.zza;
/* 3 */             if (str != null) {
/* 10 */                zzbsVar.setResult(new zzbv(str));
                    } else {
/* 27 */                zzbsVar.setResult(new zzbv(new Status(3006, null, null, null)));
                    }
                }
            }
