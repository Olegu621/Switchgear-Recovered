            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.ar2;
            import p000.br2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class zzhm extends zzhh<ar2> {
                public zzhm(TaskCompletionSource<ar2> taskCompletionSource) {
/* 1 */             super(taskCompletionSource);
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
                public final void zza(zzfj zzfjVar) throws RemoteException {
/* 1 */             TaskCompletionSource<ar2> taskCompletionSourceZzay = zzay();
/* 5 */             zzei zzeiVarZzas = zzfjVar.zzas();
/* 26 */            taskCompletionSourceZzay.setResult(new br2(zzeiVarZzas.getNetworkTypePreference(), zzeiVarZzas.getBatteryUsagePreference(), zzeiVarZzas.isRoamingAllowed()));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 29 */        public final void zza(zzga zzgaVar) throws RemoteException {
/* 30 */            zzay().setResult(zzgaVar.zzax());
                }
            }
