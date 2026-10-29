            package com.google.android.recaptcha.internal;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzq extends zzsn implements zztt {
                private static final zzzq zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzss zzg = zzsn.zzy();
                private zzst zzh = zzsn.zzA();
                private zzza zzi;

                static {
/* 3 */             zzzq zzzqVar = new zzzq();
/* 6 */             zzb = zzzqVar;
/* 10 */            zzsn.zzI(zzzq.class, zzzqVar);
                }

                private zzzq() {
                }

                public static zzzq zzi(byte[] bArr) throws zzsx {
/* 7 */             return (zzzq) zzsn.zzx(zzb, bArr);
                }

                public final zzza zzf() {
/* 1 */             zzza zzzaVar = this.zzi;
                    return zzzaVar == null ? zzza.zzg() : zzzaVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzzq();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzzp(zzzvVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 48 */                return zzuaVar;
                    }
                    synchronized (zzzq.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzsiVar;
                }

                public final String zzj() {
/* 1 */             return this.zzf;
                }

                public final List zzk() {
/* 1 */             return this.zzh;
                }
            }
