            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzff extends zzme implements zznm {
                private static final zzff zzl;
                private int zzb;
                private int zzd;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzf = zzme.zzcv();
                private boolean zzg;
                private zzfl zzh;
                private boolean zzi;
                private boolean zzj;
                private boolean zzk;

                static {
/* 3 */             zzff zzffVar = new zzff();
/* 6 */             zzl = zzffVar;
/* 10 */            zzme.zzcp(zzff.class, zzffVar);
                }

                private zzff() {
                }

                public static zzfe zzn() {
/* 7 */             return (zzfe) zzl.zzck();
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

                public final List zzd() {
/* 1 */             return this.zzf;
                }

                public final int zze() {
/* 3 */             return this.zzf.size();
                }

                public final zzfh zzf(int i) {
/* 7 */             return (zzfh) this.zzf.get(i);
                }

                public final boolean zzg() {
                    return (this.zzb & 8) != 0;
                }

                public final zzfl zzh() {
/* 1 */             zzfl zzflVar = this.zzh;
                    return zzflVar == null ? zzfl.zzj() : zzflVar;
                }

                public final boolean zzi() {
/* 1 */             return this.zzi;
                }

                public final boolean zzj() {
/* 1 */             return this.zzj;
                }

                public final boolean zzk() {
                    return (this.zzb & 64) != 0;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 68 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 62 */                return zzme.zzcq(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", zzfh.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzff();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfe(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzl;
                    }
/* 21 */            throw null;
                }

                public final boolean zzm() {
/* 1 */             return this.zzk;
                }

                public final /* synthetic */ void zzo(String str) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = str;
                }

                public final /* synthetic */ void zzp(int i, zzfh zzfhVar) {
/* 1 */             zzfhVar.getClass();
/* 4 */             zzmn zzmnVar = this.zzf;
/* 10 */            if (!zzmnVar.zza()) {
/* 16 */                this.zzf = zzme.zzcw(zzmnVar);
                    }
/* 20 */            this.zzf.set(i, zzfhVar);
                }
            }
