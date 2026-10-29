            package com.google.android.gms.internal.drive;

            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class zzfb extends zzkk<zzfb, zza> implements zzls {
                private static volatile zzmb<zzfb> zzhk;
                private static final zzfb zzhp;
                private int zzhd;
                private byte zzhi = 2;
                private int zzhe = 1;
                private String zzhm = HttpUrl.FRAGMENT_ENCODE_SET;
                private long zzhn = -1;
                private long zzhg = -1;
                private int zzho = -1;

                static {
/* 3 */             zzfb zzfbVar = new zzfb();
/* 6 */             zzhp = zzfbVar;
/* 10 */            zzkk.zza((Class<zzfb>) zzfb.class, zzfbVar);
                }

                private zzfb() {
                }

                public static zza zzan() {
/* 3 */             return zzhp.zzcw();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzd(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzhd |= 2;
/* 10 */            this.zzhm = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzf(long j) {
/* 5 */             this.zzhd |= 4;
/* 7 */             this.zzhn = j;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzj(int i) {
/* 5 */             this.zzhd |= 1;
/* 7 */             this.zzhe = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzl(int i) {
/* 5 */             this.zzhd |= 16;
/* 7 */             this.zzho = i;
                }

                public final String getResourceId() {
/* 1 */             return this.zzhm;
                }

                public final int getResourceType() {
/* 1 */             return this.zzho;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v10, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfb>] */
                @Override // com.google.android.gms.internal.drive.zzkk
                public final Object zza(int i, Object obj, Object obj2) {
                    Object obj3;
/* 7 */             zzfc zzfcVar = null;
                    switch (zzfc.zzhl[i - 1]) {
                        case 1:
/* 94 */                    return new zzfb();
                        case 2:
/* 88 */                    return new zza(zzfcVar);
                        case 3:
/* 81 */                    return zzkk.zza(zzhp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԉ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003\u0005\u0004\u0004", new Object[]{"zzhd", "zzhe", "zzhm", "zzhn", "zzhg", "zzho"});
                        case 4:
/* 58 */                    return zzhp;
                        case 5:
/* 29 */                    zzmb<zzfb> zzmbVar = zzhk;
/* 31 */                    if (zzmbVar != null) {
/* 57 */                        return zzmbVar;
                            }
                            synchronized (zzfb.class) {
                                try {
/* 36 */                            zzmb<zzfb> zzmbVar2 = zzhk;
                                    obj3 = zzmbVar2;
/* 38 */                            if (zzmbVar2 == null) {
/* 44 */                                ?? zzbVar = new zzkk.zzb(zzhp);
/* 47 */                                zzhk = zzbVar;
                                        obj3 = zzbVar;
                                    }
                                } catch (Throwable th) {
/* 56 */                            throw th;
                                }
                                break;
                            }
/* 54 */                    return obj3;
                        case 6:
/* 24 */                    return Byte.valueOf(this.zzhi);
                        case 7:
/* 19 */                    this.zzhi = (byte) (obj == null ? 0 : 1);
/* 7 */                     return null;
                        default:
/* 11 */                    f42.m3660p();
/* 7 */                     return null;
                    }
                }

                public final long zzal() {
/* 1 */             return this.zzhn;
                }

                public final long zzam() {
/* 1 */             return this.zzhg;
                }

/* 7 */         public static final class zza extends zzkk.zza<zzfb, zza> implements zzls {
                    private zza() {
/* 5 */                 super(zzfb.zzhp);
                    }

                    public final zza zze(String str) {
/* 1 */                 zzdb();
/* 103 */               ((zzfb) this.zzru).zzd(str);
/* 11 */                return this;
                    }

                    public final zza zzg(long j) {
/* 1 */                 zzdb();
/* 104 */               ((zzfb) this.zzru).zzf(j);
/* 11 */                return this;
                    }

                    public final zza zzh(long j) {
/* 1 */                 zzdb();
/* 1 */                 ((zzfb) this.zzru).zza(j);
/* 11 */                return this;
                    }

                    public final zza zzm(int i) {
/* 1 */                 zzdb();
/* 102 */               ((zzfb) this.zzru).zzj(1);
/* 12 */                return this;
                    }

                    public final zza zzn(int i) {
/* 1 */                 zzdb();
/* 5 */                 ((zzfb) this.zzru).zzl(i);
/* 11 */                return this;
                    }

/* 8 */             public /* synthetic */ zza(zzfc zzfcVar) {
/* 9 */                 this();
                    }
                }

/* 98 */        public static zzfb zza(byte[] bArr, zzjx zzjxVar) throws zzkq {
/* 99 */            return (zzfb) zzkk.zza(zzhp, bArr, zzjxVar);
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 99 */        public final void zza(long j) {
/* 100 */           this.zzhd |= 8;
/* 101 */           this.zzhg = j;
                }
            }
