            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import p000.AbstractC0955gi;
            import p000.C0983h9;
            import p000.InterfaceC2359x8;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzag extends AbstractC0955gi {
                final /* synthetic */ Account zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzag(zzal zzalVar, C0983h9 c0983h9, tr0 tr0Var, Account account) {
/* 3 */             super(c0983h9, tr0Var);
/* 1 */             this.zza = account;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final p42 createFailedResult(Status status) {
/* 3 */             return new zzak(status);
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 16 */            ((com.google.android.gms.auth.account.zze) ((zzam) interfaceC2359x8).getService()).mo1991h0(new zzaf(this), this.zza);
                }

                @Override // p000.AbstractC0955gi, p000.InterfaceC0992hi
                public final /* bridge */ /* synthetic */ void setResult(Object obj) {
/* 3 */             setResult((p42) obj);
                }
            }
