            package com.google.android.gms.internal.play_billing;

            import okhttp3.internal.http2.Settings;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgv {
                private final Object zza;
                private final int zzb;

                public zzgv(Object obj, int i) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzgv)) {
/* 3 */                 return false;
                    }
/* 7 */             zzgv zzgvVar = (zzgv) obj;
                    return this.zza == zzgvVar.zza && this.zzb == zzgvVar.zzb;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
                }
            }
