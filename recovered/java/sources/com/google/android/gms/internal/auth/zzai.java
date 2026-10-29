            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import com.google.android.gms.common.api.Status;
            import p000.p42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzai implements p42 {
                private static final Account zza = new Account("DUMMY_NAME", "com.google");
                private final Status zzb;
                private final Account zzc;

                public zzai(Status status, Account account) {
/* 4 */             this.zzb = status;
/* 10 */            this.zzc = account == null ? zza : account;
                }

                public final Account getAccount() {
/* 1 */             return this.zzc;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzb;
                }
            }
