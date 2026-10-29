            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import com.google.android.recaptcha.RecaptchaAction;
            import p000.c10;
            import p000.lo2;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfp {
                private final String zza;
                private final p51 zzb;
                private final p51 zzc;
                private final p51 zzd;
                private final p51 zze;
                private final p51 zzf;
                private final p51 zzg;
                private final p51 zzh;
                private final p51 zzi;

                public zzfp(String str) {
/* 4 */             this.zza = str;
/* 6 */             int i = zzby.zza;
/* 14 */            this.zzb = r51.m8065b(zzff.zza);
/* 22 */            this.zzc = r51.m8065b(zzfg.zza);
/* 30 */            this.zzd = r51.m8065b(zzfh.zza);
/* 38 */            this.zze = r51.m8065b(zzfi.zza);
/* 46 */            this.zzf = r51.m8065b(zzfj.zza);
/* 54 */            this.zzg = r51.m8065b(zzfk.zza);
/* 62 */            this.zzh = r51.m8065b(zzfl.zza);
/* 70 */            this.zzi = r51.m8065b(zzfm.zza);
                }

                public static final /* synthetic */ zzq zzb(zzfp zzfpVar) {
/* 7 */             return (zzq) zzfpVar.zzi.getValue();
                }

                public static final /* synthetic */ zzcg zzd(zzfp zzfpVar, Exception exc) {
/* 3 */             if (exc instanceof lo2) {
/* 22 */                return zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzb, exc.getMessage(), null, 8, null));
                    }
                    return exc instanceof zzcg ? zzfpVar.zzt(exc, (zzcg) exc) : zzfpVar.zzt(exc, new zzcg(zzce.zzc, zzcd.zzZ, exc.getMessage(), null, 8, null));
                }

                public static final /* synthetic */ zzci zze(zzfp zzfpVar) {
/* 7 */             return (zzci) zzfpVar.zzd.getValue();
                }

                public static final /* synthetic */ zzcr zzf(zzfp zzfpVar) {
/* 7 */             return (zzcr) zzfpVar.zzh.getValue();
                }

                public static final /* synthetic */ zzcy zzg(zzfp zzfpVar) {
/* 7 */             return (zzcy) zzfpVar.zzc.getValue();
                }

                public static final /* synthetic */ zzda zzh(zzfp zzfpVar) {
/* 7 */             return (zzda) zzfpVar.zzg.getValue();
                }

                public static final /* synthetic */ zzht zzi(zzfp zzfpVar) {
/* 7 */             return (zzht) zzfpVar.zzb.getValue();
                }

                public static final /* synthetic */ zzif zzj(zzfp zzfpVar) {
/* 7 */             return (zzif) zzfpVar.zze.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Application zzs() {
/* 7 */             return (Application) this.zzf.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final zzcg zzt(Exception exc, zzcg zzcgVar) {
                    return !zzu() ? new zzcg(zzce.zzc, zzcd.zzao, exc.getMessage(), null, 8, null) : zzcgVar;
                }

                private final boolean zzu() {
                    NetworkCapabilities networkCapabilities;
/* 1 */             int i = zzby.zza;
                    try {
/* 21 */                Object systemService = zzs().getSystemService("connectivity");
/* 25 */                systemService.getClass();
/* 28 */                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
/* 30 */                Network activeNetwork = connectivityManager.getActiveNetwork();
                        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
                    } catch (Exception unused) {
/* 55 */                return false;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void zzv(String str) throws zzcg {
                    try {
/* 5 */                 zzxg zzxgVarZzj = zzxg.zzj(zzdb.zza(str));
/* 9 */                 int i = zzby.zza;
/* 23 */                ((zziq) r51.m8065b(zzeu.zza).getValue()).zza(zzxgVarZzj);
                    } catch (Exception e) {
/* 46 */                throw new zzcg(zzce.zzl, zzcd.zzan, e.getMessage(), null, 8, null);
                    }
                }

                public final zzye zzk(RecaptchaAction recaptchaAction, zzxx zzxxVar, zzxn zzxnVar) {
/* 1 */             zzyd zzydVarZzf = zzye.zzf();
/* 7 */             zzydVarZzf.zzs(this.zza);
/* 14 */            zzydVarZzf.zze(recaptchaAction.getAction());
/* 21 */            zzydVarZzf.zzf(zzxnVar.zzO());
/* 28 */            zzydVarZzf.zzq(zzxnVar.zzN());
/* 31 */            zzydVarZzf.zzr(zzxxVar);
/* 38 */            return (zzye) zzydVarZzf.zzk();
                }

                public final Object zzl(String str, long j, c10 c10Var) {
/* 15 */            return new zzhf(27, new zzet(this, str, j, null), null);
                }

                public final Object zzm(zzye zzyeVar, long j, c10 c10Var) {
/* 15 */            return new zzhf(28, new zzex(this, j, zzyeVar, null), null);
                }

                public final Object zzn(zzxn zzxnVar, long j, c10 c10Var) {
/* 12 */            return new zzhg(new zzfd(j, this, zzxnVar, null));
                }

                public final Object zzo(zzyg zzygVar, c10 c10Var) {
/* 11 */            return new zzhf(29, new zzfe(zzygVar, this, null), null);
                }

                public final Object zzp(long j, c10 c10Var) {
/* 11 */            return new zzhf(22, new zzfo(j, this, null), null);
                }
            }
