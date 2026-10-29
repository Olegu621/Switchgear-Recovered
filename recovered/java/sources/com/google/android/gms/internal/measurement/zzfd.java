            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfd extends zzme implements zznm {
                private static final zzfd zzi;
                private int zzb;
                private int zzd;
                private zzmn zze = zzme.zzcv();
                private zzmn zzf = zzme.zzcv();
                private boolean zzg;
                private boolean zzh;

                static {
/* 3 */             zzfd zzfdVar = new zzfd();
/* 6 */             zzi = zzfdVar;
/* 10 */            zzme.zzcp(zzfd.class, zzfdVar);
                }

                private zzfd() {
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }

                public final List zzc() {
/* 1 */             return this.zze;
                }

                public final int zzd() {
/* 3 */             return this.zze.size();
                }

                public final zzfn zze(int i) {
/* 7 */             return (zzfn) this.zze.get(i);
                }

                public final List zzf() {
/* 1 */             return this.zzf;
                }

                public final int zzg() {
/* 3 */             return this.zzf.size();
                }

                public final zzff zzh(int i) {
/* 7 */             return (zzff) this.zzf.get(i);
                }

                public final /* synthetic */ void zzi(int i, zzfn zzfnVar) {
/* 1 */             zzfnVar.getClass();
/* 4 */             zzmn zzmnVar = this.zze;
/* 10 */            if (!zzmnVar.zza()) {
/* 16 */                this.zze = zzme.zzcw(zzmnVar);
                    }
/* 20 */            this.zze.set(i, zzfnVar);
                }

                public final /* synthetic */ void zzj(int i, zzff zzffVar) {
/* 1 */             zzffVar.getClass();
/* 4 */             zzmn zzmnVar = this.zzf;
/* 10 */            if (!zzmnVar.zza()) {
/* 16 */                this.zzf = zzme.zzcw(zzmnVar);
                    }
/* 20 */            this.zzf.set(i, zzffVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", zzfn.class, "zzf", zzff.class, "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfd();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfc(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzi;
                    }
/* 21 */            throw null;
                }
            }
