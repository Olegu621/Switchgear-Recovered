            package com.google.android.gms.internal.measurement;

            import android.app.Activity;
            import android.os.Bundle;
            import android.os.RemoteException;
            import java.util.Objects;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzet extends zzeq {
                final /* synthetic */ Bundle zza;
                final /* synthetic */ Activity zzb;
                final /* synthetic */ zzfa zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzet(zzfa zzfaVar, Bundle bundle, Activity activity) {
/* 13 */            super(zzfaVar.zza, true);
/* 1 */             this.zza = bundle;
/* 3 */             this.zzb = activity;
/* 5 */             Objects.requireNonNull(zzfaVar);
/* 8 */             this.zzc = zzfaVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() throws RemoteException {
                    Bundle bundle;
/* 1 */             Bundle bundle2 = this.zza;
/* 3 */             if (bundle2 != null) {
/* 7 */                 bundle = new Bundle();
/* 16 */                if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
/* 18 */                    Object obj = bundle2.get("com.google.app_measurement.screen_service");
/* 24 */                    if (obj instanceof Bundle) {
/* 28 */                        bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                            }
                        }
                    } else {
/* 32 */                bundle = null;
                    }
/* 37 */            zzcr zzcrVarZzQ = this.zzc.zza.zzQ();
/* 41 */            kb1.m6061n(zzcrVarZzQ);
/* 44 */            Activity activity = this.zzb;
/* 52 */            zzcrVarZzQ.onActivityCreatedByScionActivityInfo(zzdf.zza(activity), bundle, this.zzi);
                }
            }
