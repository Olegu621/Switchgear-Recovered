            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import p000.rk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzes extends zzcz {
                private final rk3 zza;

                public zzes(rk3 rk3Var) {
/* 4 */             this.zza = rk3Var;
                }

                @Override // com.google.android.gms.internal.measurement.zzda
                public final void zze(String str, String str2, Bundle bundle, long j) {
/* 3 */             this.zza.onEvent(str, str2, bundle, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzda
                public final int zzf() {
/* 3 */             return System.identityHashCode(this.zza);
                }
            }
