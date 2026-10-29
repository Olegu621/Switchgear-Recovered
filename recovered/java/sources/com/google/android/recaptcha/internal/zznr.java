            package com.google.android.recaptcha.internal;

            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zznr {
                private static String zza = "com.google.android.recaptcha.internal.zznv";
                private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
                private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
                private static final String[] zzd = {"com.google.android.recaptcha.internal.zznv", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

                public static int zza() {
/* 1 */             return zzov.zza();
                }

                public static long zzb() {
/* 5 */             return zznp.zza.zzc();
                }

                public static zznb zzd(String str) {
/* 5 */             return zznp.zza.zze(str);
                }

                public static zznd zzf() {
/* 5 */             return zzi().zza();
                }

                public static zznq zzg() {
/* 5 */             return zznp.zza.zzh();
                }

                public static zzof zzi() {
/* 5 */             return zznp.zza.zzj();
                }

                public static zzor zzk() {
/* 5 */             return zzi().zzc();
                }

                public static String zzl() {
/* 5 */             return zznp.zza.zzm();
                }

                public static boolean zzn(String str, Level level, boolean z) {
/* 5 */             zzi().zzd(str, level, z);
/* 8 */             return false;
                }

                public long zzc() {
/* 7 */             return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                }

                public abstract zznb zze(String str);

                public abstract zznq zzh();

                public zzof zzj() {
/* 1 */             return zzof.zze();
                }

                public abstract String zzm();
            }
