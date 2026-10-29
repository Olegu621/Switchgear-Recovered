            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzee extends zzeq {
                final /* synthetic */ Bundle zza;
                final /* synthetic */ zzco zzb;
                final /* synthetic */ zzfb zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzee(zzfb zzfbVar, Bundle bundle, zzco zzcoVar) {
/* 11 */            super(zzfbVar, true);
/* 1 */             this.zza = bundle;
/* 3 */             this.zzb = zzcoVar;
/* 5 */             Objects.requireNonNull(zzfbVar);
/* 8 */             this.zzc = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zzc.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 16 */            zzcrVarZzQ.performAction(this.zza, this.zzb, this.zzh);
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zzb() {
/* 4 */             this.zzb.zzb(null);
                }
            }
