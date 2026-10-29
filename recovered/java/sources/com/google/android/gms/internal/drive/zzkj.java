            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkj implements zzlp {
                private static final zzkj zzrp = new zzkj();

                private zzkj() {
                }

                public static zzkj zzcv() {
/* 1 */             return zzrp;
                }

                @Override // com.google.android.gms.internal.drive.zzlp
                public final boolean zzb(Class<?> cls) {
/* 3 */             return zzkk.class.isAssignableFrom(cls);
                }

                @Override // com.google.android.gms.internal.drive.zzlp
                public final zzlo zzc(Class<?> cls) {
/* 7 */             if (!zzkk.class.isAssignableFrom(cls)) {
/* 11 */                String name = cls.getName();
/* 36 */                throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                    }
                    try {
/* 52 */                return (zzlo) zzkk.zzd(cls.asSubclass(zzkk.class)).zza(zzkk.zze.zzrz, (Object) null, (Object) null);
                    } catch (Exception e) {
/* 58 */                String name2 = cls.getName();
/* 83 */                throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                    }
                }
            }
