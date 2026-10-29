            package com.google.android.gms.internal.auth;

            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeg extends zzei {
                private final byte[] zzb;
                private int zzc;
                private int zzd;
                private int zze;

                public /* synthetic */ zzeg(byte[] bArr, int i, int i2, boolean z, zzef zzefVar) {
/* 2 */             super(null);
/* 8 */             this.zze = AbstractC0208c9.API_PRIORITY_OTHER;
/* 10 */            this.zzb = bArr;
/* 13 */            this.zzc = 0;
                }

                public final int zza(int i) throws zzfa {
/* 1 */             int i2 = this.zze;
/* 4 */             this.zze = 0;
/* 10 */            int i3 = this.zzc + this.zzd;
/* 11 */            this.zzc = i3;
/* 13 */            if (i3 <= 0) {
/* 20 */                this.zzd = 0;
/* 22 */                return i2;
                    }
/* 15 */            this.zzd = i3;
/* 17 */            this.zzc = 0;
/* 19 */            return i2;
                }
            }
