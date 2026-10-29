            package com.google.android.gms.internal.p014authapi;

            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbf extends zbd {
                final /* synthetic */ zbg zba;

                public zbf(zbg zbgVar) {
/* 1 */             this.zba = zbgVar;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbd, com.google.android.gms.internal.p014authapi.zbs
                public final void zbb(Status status, Credential credential) {
/* 8 */             this.zba.setResult(new zbe(status, credential));
                }

                @Override // com.google.android.gms.internal.p014authapi.zbd, com.google.android.gms.internal.p014authapi.zbs
                public final void zbc(Status status) {
/* 9 */             this.zba.setResult(new zbe(status, null));
                }
            }
