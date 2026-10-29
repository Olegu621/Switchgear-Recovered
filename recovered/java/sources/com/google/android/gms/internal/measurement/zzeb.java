            package com.google.android.gms.internal.measurement;

            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeb extends zzeq {
                final /* synthetic */ String zza;
                final /* synthetic */ String zzb;
                final /* synthetic */ boolean zzc;
                final /* synthetic */ zzco zzd;
                final /* synthetic */ zzfb zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzeb(zzfb zzfbVar, String str, String str2, boolean z, zzco zzcoVar) {
/* 15 */            super(zzfbVar, true);
/* 1 */             this.zza = str;
/* 3 */             this.zzb = str2;
/* 5 */             this.zzc = z;
/* 7 */             this.zzd = zzcoVar;
/* 9 */             Objects.requireNonNull(zzfbVar);
/* 12 */            this.zze = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zze.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 18 */            zzcrVarZzQ.getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zzb() {
/* 4 */             this.zzd.zzb(null);
                }
            }
