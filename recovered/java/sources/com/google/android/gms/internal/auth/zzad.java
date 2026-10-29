            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzad extends zzah {
                final /* synthetic */ zzae zza;

                public zzad(zzae zzaeVar) {
/* 1 */             this.zza = zzaeVar;
                }

                @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
                public final void zzb(Account account) {
/* 17 */            this.zza.setResult(new zzai(account != null ? Status.f3440e : zzal.zza, account));
                }
            }
