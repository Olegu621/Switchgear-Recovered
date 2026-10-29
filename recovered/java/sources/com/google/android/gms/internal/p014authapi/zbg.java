            package com.google.android.gms.internal.p014authapi;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.credentials.CredentialRequest;
            import com.google.android.gms.common.api.Status;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbg extends zbm {
                final /* synthetic */ CredentialRequest zba;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zbg(zbl zblVar, tr0 tr0Var, CredentialRequest credentialRequest) {
/* 3 */             super(tr0Var);
/* 1 */             this.zba = credentialRequest;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final /* synthetic */ p42 createFailedResult(Status status) {
/* 4 */             return new zbe(status, null);
                }

                @Override // com.google.android.gms.internal.p014authapi.zbm
                public final void zba(Context context, zbt zbtVar) throws RemoteException {
/* 8 */             zbtVar.zbd(new zbf(this), this.zba);
                }
            }
