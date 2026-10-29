            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzep extends zzeq {
                final /* synthetic */ Long zza;
                final /* synthetic */ String zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ Bundle zzd;
                final /* synthetic */ boolean zze;
                final /* synthetic */ boolean zzf;
                final /* synthetic */ zzfb zzg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzep(zzfb zzfbVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
/* 19 */            super(zzfbVar, true);
/* 1 */             this.zza = l;
/* 3 */             this.zzb = str;
/* 5 */             this.zzc = str2;
/* 7 */             this.zzd = bundle;
/* 9 */             this.zze = z;
/* 11 */            this.zzf = z2;
/* 13 */            Objects.requireNonNull(zzfbVar);
/* 16 */            this.zzg = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 1 */             Long l = this.zza;
/* 9 */             long jLongValue = l == null ? this.zzh : l.longValue();
/* 16 */            zzcr zzcrVarZzQ = this.zzg.zzQ();
/* 20 */            kb1.m6061n(zzcrVarZzQ);
/* 33 */            zzcrVarZzQ.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, jLongValue);
                }
            }
