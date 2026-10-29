            package com.google.android.gms.internal.drive;

            import p000.AbstractC0208c9;
            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzjo {
                private int zznz;
                private int zzoa;
                private boolean zzob;

                private zzjo() {
/* 6 */             this.zznz = 100;
/* 11 */            this.zzoa = AbstractC0208c9.API_PRIORITY_OTHER;
/* 14 */            this.zzob = false;
                }

                public static zzjo zza(byte[] bArr, int i, int i2, boolean z) {
/* 8 */             zzjq zzjqVar = new zzjq(bArr, 0, i2, false);
                    try {
/* 11 */                zzjqVar.zzv(i2);
/* 14 */                return zzjqVar;
                    } catch (zzkq e) {
/* 17 */                C1951n4.m6863n(e);
/* 20 */                return null;
                    }
                }

                public static long zzk(long j) {
/* 8 */             return (-(j & 1)) ^ (j >>> 1);
                }

                public static int zzw(int i) {
/* 6 */             return (-(i & 1)) ^ (i >>> 1);
                }

                public abstract int zzbz();

                public abstract int zzv(int i) throws zzkq;
            }
