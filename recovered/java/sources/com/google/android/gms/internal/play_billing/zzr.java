            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr {
                Object zza;
                zzu zzb;
                private zzw zzc = zzw.zze();
                private boolean zzd;

                public final void finalize() {
                    zzw zzwVar;
/* 1 */             zzu zzuVar = this.zzb;
/* 3 */             if (zzuVar != null && !zzuVar.isDone()) {
/* 28 */                zzuVar.zzc(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
                    }
/* 33 */            if (this.zzd || (zzwVar = this.zzc) == null) {
/* 43 */                return;
                    }
/* 40 */            zzwVar.zzd(null);
                }

                public final void zza() {
/* 2 */             this.zza = null;
/* 4 */             this.zzb = null;
/* 8 */             this.zzc.zzd(null);
                }

                public final boolean zzb(Object obj) {
/* 2 */             this.zzd = true;
/* 4 */             zzu zzuVar = this.zzb;
/* 7 */             boolean z = zzuVar != null && zzuVar.zza(obj);
/* 17 */            if (z) {
/* 20 */                this.zza = null;
/* 22 */                this.zzb = null;
/* 24 */                this.zzc = null;
                    }
/* 26 */            return z;
                }
            }
