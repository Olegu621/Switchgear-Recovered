            package com.google.android.gms.internal.measurement;

            import android.os.RemoteException;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzec extends zzeq {
                final /* synthetic */ String zza;
                final /* synthetic */ Object zzb;
                final /* synthetic */ zzfb zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzec(zzfb zzfbVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
/* 11 */            super(zzfbVar, false);
/* 1 */             this.zza = str;
/* 3 */             this.zzb = obj;
/* 5 */             Objects.requireNonNull(zzfbVar);
/* 8 */             this.zzc = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
/* 3 */             zzcr zzcrVarZzQ = this.zzc.zzQ();
/* 7 */             kb1.m6061n(zzcrVarZzQ);
/* 31 */            zzcrVarZzQ.logHealthData(5, this.zza, new ObjectWrapper(this.zzb), new ObjectWrapper(null), new ObjectWrapper(null));
                }
            }
