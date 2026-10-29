            package com.google.android.gms.internal.drive;

            import p000.AbstractC0208c9;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjq extends zzjo {
                private final byte[] buffer;
                private int limit;
                private int pos;
                private final boolean zzoc;
                private int zzod;
                private int zzoe;
                private int zzof;

                private zzjq(byte[] bArr, int i, int i2, boolean z) {
/* 2 */             super();
/* 8 */             this.zzof = AbstractC0208c9.API_PRIORITY_OTHER;
/* 10 */            this.buffer = bArr;
/* 13 */            this.limit = i2 + i;
/* 15 */            this.pos = i;
/* 17 */            this.zzoe = i;
/* 19 */            this.zzoc = z;
                }

                @Override // com.google.android.gms.internal.drive.zzjo
                public final int zzbz() {
/* 5 */             return this.pos - this.zzoe;
                }

                @Override // com.google.android.gms.internal.drive.zzjo
                public final int zzv(int i) throws zzkq {
/* 1 */             if (i < 0) {
/* 47 */                throw zzkq.zzdj();
                    }
/* 7 */             int iZzbz = i + zzbz();
/* 8 */             int i2 = this.zzof;
/* 10 */            if (iZzbz > i2) {
/* 42 */                throw zzkq.zzdi();
                    }
/* 12 */            this.zzof = iZzbz;
/* 18 */            int i3 = this.limit + this.zzod;
/* 19 */            this.limit = i3;
/* 23 */            int i4 = i3 - this.zzoe;
/* 25 */            if (i4 <= iZzbz) {
/* 35 */                this.zzod = 0;
/* 37 */                return i2;
                    }
/* 27 */            int i5 = i4 - iZzbz;
/* 28 */            this.zzod = i5;
/* 31 */            this.limit = i3 - i5;
/* 33 */            return i2;
                }
            }
