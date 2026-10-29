            package com.google.android.gms.internal.measurement;

            import android.app.Activity;
            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzey extends zzeq {
                final /* synthetic */ Activity zza;
                final /* synthetic */ zzco zzb;
                final /* synthetic */ zzfa zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzey(zzfa zzfaVar, Activity activity, zzco zzcoVar) {
/* 13 */            super(zzfaVar.zza, true);
/* 1 */             this.zza = activity;
/* 3 */             this.zzb = zzcoVar;
/* 5 */             Objects.requireNonNull(zzfaVar);
/* 8 */             this.zzc = zzfaVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 5 */             zzcr zzcrVarZzQ = this.zzc.zza.zzQ();
/* 9 */             kb1.m6061n(zzcrVarZzQ);
/* 22 */            zzcrVarZzQ.onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(this.zza), this.zzb, this.zzi);
                }
            }
