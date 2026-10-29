            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.f42;
            import p000.la0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcr extends um2 {
                private final /* synthetic */ la0 zzfq;

                public zzcr(zzch zzchVar, la0 la0Var) {
/* 1 */             this.zzfq = la0Var;
                }

                @Override // p000.um2
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 5 */             if (zzawVar.zzec) {
/* 31 */                ((zzeo) zzawVar.getService()).zza(new zzj(1, this.zzfq.getDriveId()), (zzes) null, (String) null, new zzhr(taskCompletionSource));
                    } else {
/* 37 */                f42.m3656l("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
                    }
                }
            }
