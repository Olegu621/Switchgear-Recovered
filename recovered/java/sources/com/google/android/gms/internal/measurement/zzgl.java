            package com.google.android.gms.internal.measurement;

            import androidx.core.app.NotificationCompat;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgl extends zzme implements zznm {
                private static final zzgl zzu;
                private int zzb;
                private long zzd;
                private int zzf;
                private boolean zzk;
                private zzgf zzp;
                private zzgp zzq;
                private zzgv zzr;
                private zzgr zzs;
                private zzgn zzt;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzg = zzme.zzcv();
                private zzmn zzh = zzme.zzcv();
                private zzmn zzi = zzme.zzcv();
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzl = zzme.zzcv();
                private zzmn zzm = zzme.zzcv();
                private String zzn = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzo = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzgl zzglVar = new zzgl();
/* 6 */             zzu = zzglVar;
/* 10 */            zzme.zzcp(zzgl.class, zzglVar);
                }

                private zzgl() {
                }

                public static zzgk zzr() {
/* 7 */             return (zzgk) zzu.zzck();
                }

                public static zzgl zzs() {
/* 1 */             return zzu;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final long zzb() {
/* 1 */             return this.zzd;
                }

                public final boolean zzc() {
                    return (this.zzb & 2) != 0;
                }

                public final String zzd() {
/* 1 */             return this.zze;
                }

                public final List zze() {
/* 1 */             return this.zzg;
                }

                public final int zzf() {
/* 3 */             return this.zzh.size();
                }

                public final zzgj zzg(int i) {
/* 7 */             return (zzgj) this.zzh.get(i);
                }

                public final List zzh() {
/* 1 */             return this.zzi;
                }

                public final List zzi() {
/* 1 */             return this.zzl;
                }

                public final int zzj() {
/* 3 */             return this.zzl.size();
                }

                public final List zzk() {
/* 1 */             return this.zzm;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzme.zzcq(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", zzgt.class, "zzh", zzgj.class, "zzi", zzfd.class, "zzj", "zzk", "zzl", zzja.class, "zzm", zzgh.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgl();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgk(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzu;
                    }
/* 21 */            throw null;
                }

                public final String zzm() {
/* 1 */             return this.zzn;
                }

                public final boolean zzn() {
                    return (this.zzb & 128) != 0;
                }

                public final zzgf zzo() {
/* 1 */             zzgf zzgfVar = this.zzp;
                    return zzgfVar == null ? zzgf.zzg() : zzgfVar;
                }

                public final boolean zzp() {
                    return (this.zzb & NotificationCompat.FLAG_GROUP_SUMMARY) != 0;
                }

                public final zzgv zzq() {
/* 1 */             zzgv zzgvVar = this.zzr;
                    return zzgvVar == null ? zzgv.zze() : zzgvVar;
                }

                public final /* synthetic */ void zzt(int i, zzgj zzgjVar) {
/* 1 */             zzgjVar.getClass();
/* 4 */             zzmn zzmnVar = this.zzh;
/* 10 */            if (!zzmnVar.zza()) {
/* 16 */                this.zzh = zzme.zzcw(zzmnVar);
                    }
/* 20 */            this.zzh.set(i, zzgjVar);
                }

                public final /* synthetic */ void zzu() {
/* 5 */             this.zzi = zzme.zzcv();
                }

                public final /* synthetic */ void zzv() {
/* 5 */             this.zzl = zzme.zzcv();
                }
            }
