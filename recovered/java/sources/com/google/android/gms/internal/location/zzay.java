            package com.google.android.gms.internal.location;

            import android.os.RemoteException;
            import com.google.android.gms.location.LocationSettingsResult;
            import p000.InterfaceC0992hi;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzay extends zzan {
                private InterfaceC0992hi zza;

                public zzay(InterfaceC0992hi interfaceC0992hi) {
/* 11 */            kb1.m6053f("listener can't be null.", interfaceC0992hi != null);
/* 14 */            this.zza = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.location.zzao
                public final void zzb(LocationSettingsResult locationSettingsResult) throws RemoteException {
/* 3 */             this.zza.setResult(locationSettingsResult);
/* 7 */             this.zza = null;
                }
            }
