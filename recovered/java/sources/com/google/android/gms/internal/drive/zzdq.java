            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdq extends zzea {
                private final /* synthetic */ boolean zzga = false;
                private final /* synthetic */ zzdp zzgq;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzdq(zzdp zzdpVar, tr0 tr0Var, boolean z) {
/* 7 */             super(zzdpVar, tr0Var, null);
/* 1 */             this.zzgq = zzdpVar;
                }

                @Override // p000.AbstractC0955gi
                public final /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 25 */            ((zzeo) ((zzaw) interfaceC2359x8).getService()).zza(new zzek(this.zzgq.zzk, this.zzga), new zzdy(this));
                }
            }
