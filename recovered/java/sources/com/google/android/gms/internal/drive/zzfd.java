            package com.google.android.gms.internal.drive;

            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class zzfd extends zzkk<zzfd, zza> implements zzls {
                private static volatile zzmb<zzfd> zzhk;
                private static final zzfd zzhq;
                private int zzhd;
                private byte zzhi = 2;
                private long zzhn = -1;
                private long zzhg = -1;

                static {
/* 3 */             zzfd zzfdVar = new zzfd();
/* 6 */             zzhq = zzfdVar;
/* 10 */            zzkk.zza((Class<zzfd>) zzfd.class, zzfdVar);
                }

                private zzfd() {
                }

                public static zza zzap() {
/* 3 */             return zzhq.zzcw();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzf(long j) {
/* 5 */             this.zzhd |= 1;
/* 7 */             this.zzhn = j;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd>] */
                @Override // com.google.android.gms.internal.drive.zzkk
                public final Object zza(int i, Object obj, Object obj2) {
                    Object obj3;
/* 7 */             zzfe zzfeVar = null;
                    switch (zzfe.zzhl[i - 1]) {
                        case 1:
/* 87 */                    return new zzfd();
                        case 2:
/* 81 */                    return new zza(zzfeVar);
                        case 3:
/* 74 */                    return zzkk.zza(zzhq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԑ\u0000\u0002Ԑ\u0001", new Object[]{"zzhd", "zzhn", "zzhg"});
                        case 4:
/* 57 */                    return zzhq;
                        case 5:
/* 29 */                    zzmb<zzfd> zzmbVar = zzhk;
/* 31 */                    if (zzmbVar != null) {
/* 56 */                        return zzmbVar;
                            }
                            synchronized (zzfd.class) {
                                try {
/* 36 */                            zzmb<zzfd> zzmbVar2 = zzhk;
                                    obj3 = zzmbVar2;
/* 38 */                            if (zzmbVar2 == null) {
/* 44 */                                ?? zzbVar = new zzkk.zzb(zzhq);
/* 47 */                                zzhk = zzbVar;
                                        obj3 = zzbVar;
                                    }
                                } catch (Throwable th) {
/* 55 */                            throw th;
                                }
                                break;
                            }
/* 53 */                    return obj3;
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

/* 7 */         public static final class zza extends zzkk.zza<zzfd, zza> implements zzls {
                    private zza() {
/* 5 */                 super(zzfd.zzhq);
                    }

                    public final zza zzi(long j) {
/* 1 */                 zzdb();
/* 93 */                ((zzfd) this.zzru).zzf(j);
/* 11 */                return this;
                    }

                    public final zza zzj(long j) {
/* 1 */                 zzdb();
/* 1 */                 ((zzfd) this.zzru).zza(j);
/* 11 */                return this;
                    }

/* 8 */             public /* synthetic */ zza(zzfe zzfeVar) {
/* 9 */                 this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 90 */        public final void zza(long j) {
/* 91 */            this.zzhd |= 2;
/* 92 */            this.zzhg = j;
                }
            }
