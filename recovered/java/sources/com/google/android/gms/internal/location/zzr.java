            package com.google.android.gms.internal.location;

            import android.os.RemoteException;
            import com.google.android.gms.location.LocationRequest;
            import p000.InterfaceC2359x8;
            import p000.k50;
            import p000.n91;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzr extends zzx {
                final /* synthetic */ LocationRequest zza;
                final /* synthetic */ n91 zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzr(zzz zzzVar, tr0 tr0Var, LocationRequest locationRequest, n91 n91Var) {
/* 3 */             super(tr0Var);
/* 1 */             this.zza = locationRequest;
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 25 */            ((zzaz) interfaceC2359x8).zzC(this.zza, k50.m5967d(zzbj.zzb(), null, n91.class.getSimpleName()), new zzy(this));
                }
            }
