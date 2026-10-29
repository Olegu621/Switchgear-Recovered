            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            import p000.InterfaceC2359x8;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzck extends um2 {
                public zzck(zzch zzchVar) {
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 7 */             if (zzawVar.zzae() == null) {
/* 24 */                taskCompletionSource.setException(new C1020i9(new Status(10, "Drive#SCOPE_FILE must be requested", null, null)));
                    } else {
/* 37 */                taskCompletionSource.setResult(new zzbs(zzawVar.zzae()));
                    }
                }
            }
