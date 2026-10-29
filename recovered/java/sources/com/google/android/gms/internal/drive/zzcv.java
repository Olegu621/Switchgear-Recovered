            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.cy2;
            import p000.t81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcv extends cy2 {
                private final /* synthetic */ zzg zzfu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcv(zzch zzchVar, t81 t81Var, zzg zzgVar) {
/* 3 */             super(t81Var);
/* 1 */             this.zzfu = zzgVar;
                }

                @Override // p000.cy2
                public final /* synthetic */ void unregisterListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 11 */            taskCompletionSource.setResult(Boolean.valueOf(this.zzfu.cancel()));
                }
            }
