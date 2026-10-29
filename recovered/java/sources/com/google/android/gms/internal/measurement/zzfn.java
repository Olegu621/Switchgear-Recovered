            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfn extends zzme implements zznm {
                private static final zzfn zzj;
                private int zzb;
                private int zzd;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzfh zzf;
                private boolean zzg;
                private boolean zzh;
                private boolean zzi;

                static {
/* 3 */             zzfn zzfnVar = new zzfn();
/* 6 */             zzj = zzfnVar;
/* 10 */            zzme.zzcp(zzfn.class, zzfnVar);
                }

                private zzfn() {
                }

                public static zzfm zzi() {
/* 7 */             return (zzfm) zzj.zzck();
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }

                public final String zzc() {
/* 1 */             return this.zze;
                }

                public final zzfh zzd() {
/* 1 */             zzfh zzfhVar = this.zzf;
                    return zzfhVar == null ? zzfh.zzi() : zzfhVar;
                }

                public final boolean zze() {
/* 1 */             return this.zzg;
                }

                public final boolean zzf() {
/* 1 */             return this.zzh;
                }

                public final boolean zzg() {
                    return (this.zzb & 32) != 0;
                }

                public final boolean zzh() {
/* 1 */             return this.zzi;
                }

                public final /* synthetic */ void zzj(String str) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfn();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfm(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzj;
                    }
/* 21 */            throw null;
                }
            }
