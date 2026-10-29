            package com.google.android.gms.internal.auth;

            import android.util.Base64;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhv implements zzht {
                public static final zzdc zza;
                public static final zzdc zzb;
                public static final zzdc zzc;
                public static final zzdc zzd;
                public static final zzdc zze;
                public static final zzdc zzf;
                public static final zzdc zzg;
                public static final zzdc zzh;
                public static final zzdc zzi;
                public static final zzdc zzj;
                public static final zzdc zzk;
                public static final zzdc zzl;
                public static final zzdc zzm;
                public static final zzdc zzn;

                static {
/* 16 */            zzcz zzczVarZza = new zzcz(zzcr.zza("com.google.android.gms.auth_account")).zzb().zza();
/* 28 */            zza = zzczVarZza.zzc("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
/* 37 */            zzb = zzczVarZza.zze("getTokenRefactor__account_data_service_tokenAPI_usable", true);
/* 47 */            zzc = zzczVarZza.zzd("getTokenRefactor__account_manager_timeout_seconds", 20L);
/* 57 */            zzd = zzczVarZza.zzd("getTokenRefactor__android_id_shift", 0L);
/* 66 */            zze = zzczVarZza.zze("getTokenRefactor__authenticator_logic_improved", false);
                    try {
/* 87 */                zzf = zzczVarZza.zzf("getTokenRefactor__blocked_packages", zzhr.zzk(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), zzhu.zza);
/* 95 */                zzg = zzczVarZza.zze("getTokenRefactor__chimera_get_token_evolved", true);
/* 103 */               zzh = zzczVarZza.zzd("getTokenRefactor__clear_token_timeout_seconds", 20L);
/* 111 */               zzi = zzczVarZza.zzd("getTokenRefactor__default_task_timeout_seconds", 20L);
/* 119 */               zzj = zzczVarZza.zze("getTokenRefactor__gaul_accounts_api_evolved", false);
/* 127 */               zzk = zzczVarZza.zze("getTokenRefactor__gaul_token_api_evolved", false);
/* 137 */               zzl = zzczVarZza.zzd("getTokenRefactor__get_token_timeout_seconds", 120L);
/* 145 */               zzm = zzczVarZza.zze("getTokenRefactor__gms_account_authenticator_evolved", true);
/* 153 */               zzn = zzczVarZza.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
                    } catch (Exception e) {
/* 157 */               C1951n4.m6856g(e);
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzht
                public final zzhr zza() {
/* 7 */             return (zzhr) zzf.zzb();
                }

                @Override // com.google.android.gms.internal.auth.zzht
                public final boolean zzb() {
/* 9 */             return ((Boolean) zzj.zzb()).booleanValue();
                }

                @Override // com.google.android.gms.internal.auth.zzht
                public final boolean zzc() {
/* 9 */             return ((Boolean) zzk.zzb()).booleanValue();
                }
            }
