            package com.google.android.gms.internal.location;

            import android.os.Looper;
            import android.os.RemoteException;
            import com.google.android.gms.location.LocationRequest;
            import p000.InterfaceC2359x8;
            import p000.k50;
            import p000.m91;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzt extends zzx {
                final /* synthetic */ LocationRequest zza;
                final /* synthetic */ m91 zzb;
                final /* synthetic */ Looper zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzt(zzz zzzVar, tr0 tr0Var, LocationRequest locationRequest, m91 m91Var, Looper looper) {
/* 5 */             super(tr0Var);
/* 1 */             this.zza = locationRequest;
/* 3 */             this.zzc = looper;
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 31 */            ((zzaz) interfaceC2359x8).zzB(zzba.zza(null, this.zza), k50.m5967d(zzbj.zza(this.zzc), null, m91.class.getSimpleName()), new zzy(this));
                }
            }
