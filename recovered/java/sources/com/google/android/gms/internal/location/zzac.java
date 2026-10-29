            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.os.RemoteException;
            import com.google.android.gms.location.GeofencingRequest;
            import p000.InterfaceC2359x8;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzac extends zzae {
                final /* synthetic */ GeofencingRequest zza;
                final /* synthetic */ PendingIntent zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzac(zzaf zzafVar, tr0 tr0Var, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
/* 5 */             super(tr0Var);
/* 1 */             this.zza = geofencingRequest;
/* 3 */             this.zzb = pendingIntent;
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 7 */             ((zzaz) interfaceC2359x8).zzv(this.zza, this.zzb, this);
                }
            }
