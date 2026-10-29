            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import com.google.android.gms.common.api.Status;
            import p000.d93;
            import p000.eb3;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzal {
                private static final Status zza = new Status(13, null, null, null);

                public final sr1 addWorkAccount(tr0 tr0Var, String str) {
/* 12 */            return ((eb3) tr0Var).f7609b.doWrite(new zzae(this, d93.f7069a, tr0Var, str));
                }

                public final sr1 removeWorkAccount(tr0 tr0Var, Account account) {
/* 12 */            return ((eb3) tr0Var).f7609b.doWrite(new zzag(this, d93.f7069a, tr0Var, account));
                }

                public final void setWorkAuthenticatorEnabled(tr0 tr0Var, boolean z) {
/* 1 */             setWorkAuthenticatorEnabledWithResult(tr0Var, z);
                }

                public final sr1 setWorkAuthenticatorEnabledWithResult(tr0 tr0Var, boolean z) {
/* 12 */            return ((eb3) tr0Var).f7609b.doWrite(new zzac(this, d93.f7069a, tr0Var, z));
                }
            }
