            package com.google.android.gms.internal.games_v2;

            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.fm0;
            import p000.mr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzez {
                private static final mr0 zza = new mr0("Games", null);

                public static void zza(String str, String str2) {
/* 1 */             mr0 mr0Var = zza;
/* 3 */             zzi(str);
/* 13 */            if (Log.isLoggable(mr0Var.f13983a, 3)) {
/* 15 */                mr0Var.m6796c(str2);
                    }
                }

                public static void zzb(String str, String str2, Throwable th) {
/* 1 */             mr0 mr0Var = zza;
/* 5 */             zzi("GamesApiManager");
/* 15 */            if (Log.isLoggable(mr0Var.f13983a, 3)) {
/* 19 */                mr0Var.m6796c("Authentication task failed");
                    }
                }

                public static void zzc(String str, String str2) {
/* 7 */             zza.m6794a(zzi(str), str2);
                }

                public static void zzd(String str, String str2, Throwable th) {
/* 1 */             mr0 mr0Var = zza;
/* 3 */             String strZzi = zzi(str);
/* 14 */            if (Log.isLoggable(mr0Var.f13983a, 6)) {
/* 20 */                AbstractC1245n0.m4877e(strZzi, mr0Var.m6796c(str2), th);
                    }
                }

                public static void zze(String str, String str2, Throwable th) {
/* 1 */             mr0 mr0Var = zza;
/* 5 */             zzi("SnapshotContentsEntity");
/* 15 */            if (Log.isLoggable(mr0Var.f13983a, 4)) {
/* 19 */                mr0Var.m6796c("Failed to write snapshot data");
                    }
                }

                public static void zzf(String str, String str2) {
/* 1 */             mr0 mr0Var = zza;
/* 3 */             zzi(str);
/* 13 */            if (Log.isLoggable(mr0Var.f13983a, 2)) {
/* 15 */                mr0Var.m6796c(str2);
                    }
                }

                public static void zzg(String str, String str2) {
/* 1 */             mr0 mr0Var = zza;
/* 3 */             String strZzi = zzi(str);
/* 14 */            if (Log.isLoggable(mr0Var.f13983a, 5)) {
/* 20 */                AbstractC1245n0.m4889q(strZzi, mr0Var.m6796c(str2));
                    }
                }

                public static void zzh(String str, String str2, Throwable th) {
/* 1 */             mr0 mr0Var = zza;
/* 3 */             String strZzi = zzi(str);
/* 14 */            if (Log.isLoggable(mr0Var.f13983a, 5)) {
/* 20 */                AbstractC1245n0.m4891s(strZzi, mr0Var.m6796c(str2), th);
                    }
                }

                private static String zzi(String str) {
/* 5 */             return fm0.m3784j("PlayGamesServices[", str, "]");
                }
            }
