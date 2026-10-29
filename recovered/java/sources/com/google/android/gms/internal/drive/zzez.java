            package com.google.android.gms.internal.drive;

            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class zzez extends zzkk<zzez, zza> implements zzls {
                private static final zzez zzhj;
                private static volatile zzmb<zzez> zzhk;
                private int zzhd;
                private byte zzhi = 2;
                private int zzhe = 1;
                private long zzhf = -1;
                private long zzhg = -1;
                private long zzhh = -1;

                static {
/* 3 */             zzez zzezVar = new zzez();
/* 6 */             zzhj = zzezVar;
/* 10 */            zzkk.zza((Class<zzez>) zzez.class, zzezVar);
                }

                private zzez() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void setSequenceNumber(long j) {
/* 5 */             this.zzhd |= 2;
/* 7 */             this.zzhf = j;
                }

                public static zza zzaj() {
/* 3 */             return zzhj.zzcw();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzb(long j) {
/* 5 */             this.zzhd |= 8;
/* 7 */             this.zzhh = j;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzj(int i) {
/* 5 */             this.zzhd |= 1;
/* 7 */             this.zzhe = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzez>] */
                @Override // com.google.android.gms.internal.drive.zzkk
                public final Object zza(int i, Object obj, Object obj2) {
                    Object obj3;
/* 7 */             zzfa zzfaVar = null;
                    switch (zzfa.zzhl[i - 1]) {
                        case 1:
/* 91 */                    return new zzez();
                        case 2:
/* 85 */                    return new zza(zzfaVar);
                        case 3:
/* 78 */                    return zzkk.zza(zzhj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԑ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003", new Object[]{"zzhd", "zzhe", "zzhf", "zzhg", "zzhh"});
                        case 4:
/* 57 */                    return zzhj;
                        case 5:
/* 29 */                    zzmb<zzez> zzmbVar = zzhk;
/* 31 */                    if (zzmbVar != null) {
/* 56 */                        return zzmbVar;
                            }
                            synchronized (zzez.class) {
                                try {
/* 36 */                            zzmb<zzez> zzmbVar2 = zzhk;
                                    obj3 = zzmbVar2;
/* 38 */                            if (zzmbVar2 == null) {
/* 44 */                                ?? zzbVar = new zzkk.zzb(zzhj);
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

/* 7 */         public static final class zza extends zzkk.zza<zzez, zza> implements zzls {
                    private zza() {
/* 5 */                 super(zzez.zzhj);
                    }

                    public final zza zzc(long j) {
/* 1 */                 zzdb();
/* 98 */                ((zzez) this.zzru).setSequenceNumber(j);
/* 11 */                return this;
                    }

                    public final zza zzd(long j) {
/* 1 */                 zzdb();
/* 10 */                ((zzez) this.zzru).zza(j);
/* 11 */                return this;
                    }

                    public final zza zze(long j) {
/* 1 */                 zzdb();
/* 1 */                 ((zzez) this.zzru).zzb(j);
/* 11 */                return this;
                    }

                    public final zza zzk(int i) {
/* 1 */                 zzdb();
/* 97 */                ((zzez) this.zzru).zzj(1);
/* 12 */                return this;
                    }

/* 8 */             public /* synthetic */ zza(zzfa zzfaVar) {
/* 9 */                 this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 94 */        public final void zza(long j) {
/* 95 */            this.zzhd |= 4;
/* 96 */            this.zzhg = j;
                }
            }
