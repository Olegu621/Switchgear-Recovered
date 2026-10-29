            package com.google.android.gms.internal.measurement;

            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlh extends zzli {
                private int zzb;
                private int zzc;
                private int zzd;

                public /* synthetic */ zzlh(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
/* 2 */             super(null);
/* 8 */             this.zzd = AbstractC0208c9.API_PRIORITY_OTHER;
/* 11 */            this.zzb = 0;
                }

                public final int zza(int i) throws zzmq {
/* 1 */             int i2 = this.zzd;
/* 4 */             this.zzd = 0;
/* 10 */            int i3 = this.zzb + this.zzc;
/* 11 */            this.zzb = i3;
/* 13 */            if (i3 <= 0) {
/* 20 */                this.zzc = 0;
/* 22 */                return i2;
                    }
/* 15 */            this.zzc = i3;
/* 17 */            this.zzb = 0;
/* 19 */            return i2;
                }
            }
