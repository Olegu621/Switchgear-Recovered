            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.InterfaceC2359x8;
            import p000.kb1;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbc extends um2 {
                private final /* synthetic */ String zzdw;

                public zzbc(zzbb zzbbVar, String str) {
/* 1 */             this.zzdw = str;
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 7 */             zzeo zzeoVar = (zzeo) ((zzaw) interfaceC2359x8).getService();
/* 11 */            String str = this.zzdw;
/* 13 */            kb1.m6061n(str);
/* 35 */            zzeoVar.zza(new zzek(new DriveId(str, -1L, -1L, -1), false), new zzhl(taskCompletionSource));
                }
            }
