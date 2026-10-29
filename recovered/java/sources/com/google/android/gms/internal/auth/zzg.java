            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.os.Bundle;
            import com.google.android.gms.auth.AccountChangeEventsRequest;
            import com.google.android.gms.tasks.Task;
            import p000.C2323w9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zzg {
                /* synthetic */ C2323w9 getApiKey();

                Task zza(zzbw zzbwVar);

                Task zzb(AccountChangeEventsRequest accountChangeEventsRequest);

                Task zzc(Account account, String str, Bundle bundle);

                Task zzd(Account account);

                Task zze(String str);
            }
