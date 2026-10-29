            package com.google.android.gms.internal.p014authapi;

            import android.os.RemoteException;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.i13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbam extends zbae {
                final /* synthetic */ TaskCompletionSource zba;

                public zbam(zbao zbaoVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zba = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbaf
                public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
/* 1 */             boolean zM2006D1 = status.m2006D1();
/* 5 */             TaskCompletionSource taskCompletionSource = this.zba;
/* 7 */             if (zM2006D1) {
/* 9 */                 taskCompletionSource.setResult(saveAccountLinkingTokenResult);
                    } else {
/* 17 */                taskCompletionSource.setException(i13.m4438q(status));
                    }
                }
            }
