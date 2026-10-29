            package com.google.android.gms.internal.measurement;

            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzef extends zzeq {
                final /* synthetic */ String zza;
                final /* synthetic */ zzco zzb;
                final /* synthetic */ zzfb zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzef(zzfb zzfbVar, String str, zzco zzcoVar) {
/* 11 */            super(zzfbVar, true);
/* 1 */             this.zza = str;
/* 3 */             this.zzb = zzcoVar;
/* 5 */             Objects.requireNonNull(zzfbVar);
/* 8 */             this.zzc = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zzc.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 14 */            zzcrVarZzQ.getMaxUserProperties(this.zza, this.zzb);
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zzb() {
/* 4 */             this.zzb.zzb(null);
                }
            }
