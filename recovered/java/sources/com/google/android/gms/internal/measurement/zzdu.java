            package com.google.android.gms.internal.measurement;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdu extends zzcw {
                final /* synthetic */ Runnable zza;

                public zzdu(zzdv zzdvVar, Runnable runnable) {
/* 1 */             this.zza = runnable;
/* 3 */             Objects.requireNonNull(zzdvVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzcx
                public final void zze() {
/* 3 */             this.zza.run();
                }
            }
