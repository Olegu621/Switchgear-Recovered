            package com.google.android.gms.internal.p014authapi;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.common.api.Status;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbi extends zbm {
                final /* synthetic */ Credential zba;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zbi(zbl zblVar, tr0 tr0Var, Credential credential) {
/* 3 */             super(tr0Var);
/* 1 */             this.zba = credential;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final /* bridge */ /* synthetic */ p42 createFailedResult(Status status) {
/* 1 */             return status;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbm
                public final void zba(Context context, zbt zbtVar) throws RemoteException {
/* 13 */            zbtVar.zbc(new zbk(this), new zbp(this.zba));
                }
            }
