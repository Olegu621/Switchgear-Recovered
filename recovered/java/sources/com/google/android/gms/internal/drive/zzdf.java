            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.List;
            import p000.InterfaceC2359x8;
            import p000.la0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdf extends um2 {
                private final /* synthetic */ la0 zzfq;
                private final /* synthetic */ List zzgb;

                public zzdf(zzch zzchVar, la0 la0Var, List list) {
/* 1 */             this.zzfq = la0Var;
/* 3 */             this.zzgb = list;
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 27 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzgw(this.zzfq.getDriveId(), this.zzgb), new zzhr(taskCompletionSource));
                }
            }
