            package com.google.android.recaptcha.internal;

            import okhttp3.internal.http2.Settings;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzrx {
                private final Object zza;
                private final int zzb;

                public zzrx(Object obj, int i) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzrx)) {
/* 3 */                 return false;
                    }
/* 7 */             zzrx zzrxVar = (zzrx) obj;
                    return this.zza == zzrxVar.zza && this.zzb == zzrxVar.zzb;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
                }
            }
