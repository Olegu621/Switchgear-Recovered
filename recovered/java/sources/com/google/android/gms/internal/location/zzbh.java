            package com.google.android.gms.internal.location;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.location.LocationSettingsRequest;
            import com.google.android.gms.location.LocationSettingsResult;
            import p000.InterfaceC2359x8;
            import p000.p42;
            import p000.se3;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbh extends se3 {
                final /* synthetic */ LocationSettingsRequest zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbh(zzbi zzbiVar, tr0 tr0Var, LocationSettingsRequest locationSettingsRequest, String str) {
/* 3 */             super(tr0Var);
/* 1 */             this.zza = locationSettingsRequest;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final /* bridge */ /* synthetic */ p42 createFailedResult(Status status) {
/* 4 */             return new LocationSettingsResult(status, null);
                }

                @Override // p000.AbstractC0955gi
                public final /* bridge */ /* synthetic */ void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
/* 6 */             ((zzaz) interfaceC2359x8).zzL(this.zza, this, null);
                }
            }
