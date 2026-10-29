            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbt extends zzbz {
                private String zza;
                private byte zzb;
                private int zzc;
                private int zzd;

                public final zzbz zza(String str) {
/* 3 */             this.zza = HttpUrl.FRAGMENT_ENCODE_SET;
/* 5 */             return this;
                }

                @Override // com.google.android.gms.internal.measurement.zzbz
                public final zzbz zzb(boolean z) {
/* 2 */             this.zzb = (byte) 1;
/* 4 */             return this;
                }

                @Override // com.google.android.gms.internal.measurement.zzbz
                public final zzca zzc() {
/* 4 */             if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
/* 31 */                return new zzbu(this.zza, false, this.zzc, null, null, this.zzd, null);
                    }
/* 37 */            StringBuilder sb = new StringBuilder();
/* 42 */            if (this.zza == null) {
/* 46 */                sb.append(" fileOwner");
                    }
/* 51 */            if (this.zzb == 0) {
/* 55 */                sb.append(" hasDifferentDmaOwner");
                    }
/* 60 */            if (this.zzc == 0) {
/* 64 */                sb.append(" fileChecks");
                    }
/* 69 */            if (this.zzd == 0) {
/* 73 */                sb.append(" filePurpose");
                    }
/* 86 */            f42.m3656l("Missing required properties:".concat(sb.toString()));
/* 89 */            return null;
                }

                @Override // com.google.android.gms.internal.measurement.zzbz
                public final zzbz zzd(int i) {
/* 1 */             this.zzc = i;
/* 3 */             return this;
                }

                @Override // com.google.android.gms.internal.measurement.zzbz
                public final zzbz zze(int i) {
/* 2 */             this.zzd = 1;
/* 4 */             return this;
                }
            }
