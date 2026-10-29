            package com.google.android.gms.internal.measurement;

            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeo extends zzeq {
                final /* synthetic */ zzes zza;
                final /* synthetic */ zzfb zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzeo(zzfb zzfbVar, zzes zzesVar) {
/* 9 */             super(zzfbVar, true);
/* 1 */             this.zza = zzesVar;
/* 3 */             Objects.requireNonNull(zzfbVar);
/* 6 */             this.zzb = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zzb.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 12 */            zzcrVarZzQ.unregisterOnMeasurementEventListener(this.zza);
                }
            }
