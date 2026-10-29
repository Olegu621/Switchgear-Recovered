            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdo extends zzeq {
                final /* synthetic */ Bundle zza;
                final /* synthetic */ zzfb zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzdo(zzfb zzfbVar, Bundle bundle) {
/* 9 */             super(zzfbVar, true);
/* 1 */             this.zza = bundle;
/* 3 */             Objects.requireNonNull(zzfbVar);
/* 6 */             this.zzb = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zzb.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 14 */            zzcrVarZzQ.setConsentThirdParty(this.zza, this.zzh);
                }
            }
