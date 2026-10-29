            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.play.core.integrity.StandardIntegrityException;
            import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
            import java.nio.charset.StandardCharsets;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.c10;
            import p000.p51;
            import p000.qr0;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class zzba implements zzar {
                private final zzbo zza;
                private final zzda zzb;
                private boolean zzc;
                private String zzd;
                private final p51 zze;

                public zzba(zzbo zzboVar, zzda zzdaVar) {
/* 4 */             this.zza = zzboVar;
/* 6 */             this.zzb = zzdaVar;
/* 9 */             this.zzc = true;
/* 13 */            this.zzd = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */            int i = zzby.zza;
/* 23 */            this.zze = r51.m8065b(zzaz.zza);
                }

                public static final /* synthetic */ Application zzb(zzba zzbaVar) {
/* 7 */             return (Application) zzbaVar.zze.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String zzp(zzqm zzqmVar) {
/* 1 */             zzpp zzppVarZzg = zzpp.zzg();
/* 5 */             byte[] bArrZzo = zzqmVar.zzo();
/* 25 */            byte[] bArrZzd = zzpg.zza().zza(zzppVarZzg.zzi(bArrZzo, 0, bArrZzo.length), StandardCharsets.UTF_8).zzd();
/* 30 */            zzqm zzqmVarZzl = zzqm.zzl(bArrZzd, 0, bArrZzd.length);
/* 34 */            zzpp zzppVarZzh = zzpp.zzh();
/* 38 */            byte[] bArrZzo2 = zzqmVarZzl.zzo();
/* 43 */            return zzppVarZzh.zzi(bArrZzo2, 0, bArrZzo2.length);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final int zza() {
/* 1 */             return 2;
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ Object zzc(String str, c10 c10Var) {
/* 1 */             return zzam.zza(this, str, c10Var);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ Object zzd(zzxp zzxpVar, c10 c10Var) {
/* 13 */            return zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), c10Var);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final Object zze(String str, c10 c10Var) {
/* 9 */             return new zzhg(new zzax(this, null));
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final Object zzf(zzxp zzxpVar, c10 c10Var) {
/* 9 */             return new zzhg(new zzay(this, zzxpVar, null));
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final Object zzg(Exception exc, c10 c10Var) {
                    int i;
/* 1 */             Throwable cause = exc.getCause();
/* 5 */             if (cause != null) {
/* 8 */                 exc = cause;
                    }
/* 12 */            if (exc instanceof StandardIntegrityException) {
/* 16 */                int errorCode = ((StandardIntegrityException) exc).getErrorCode();
/* 22 */                if (errorCode == -100) {
/* 90 */                    i = 44;
                        } else if (errorCode == -12) {
/* 87 */                    i = 39;
                        } else if (errorCode == -3) {
/* 84 */                    i = 30;
                        } else if (errorCode == -2) {
/* 81 */                    i = 29;
                        } else if (errorCode != -1) {
                            switch (errorCode) {
                                case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
/* 75 */                            i = 54;
                                    break;
                                case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
/* 72 */                            i = 53;
                                    break;
                                case -17:
/* 69 */                            i = 52;
                                    break;
                                case -16:
/* 66 */                            i = 43;
                                    break;
                                case -15:
/* 63 */                            i = 42;
                                    break;
                                case -14:
/* 60 */                            i = 41;
                                    break;
                                default:
                                    switch (errorCode) {
                                        case -9:
/* 57 */                                    i = 36;
                                            break;
                                        case -8:
/* 54 */                                    i = 35;
                                            break;
                                        case -7:
/* 51 */                                    i = 34;
                                            break;
                                        case -6:
/* 48 */                                    i = 33;
                                            break;
                                        case -5:
/* 45 */                                    i = 32;
                                            break;
                                        default:
/* 43 */                                    i = 2;
                                            break;
                                    }
                                    break;
                            }
                        } else {
/* 78 */                    i = 28;
                        }
                    } else {
/* 93 */                i = 45;
                    }
/* 95 */            zzys zzysVarZzf = zzyt.zzf();
/* 99 */            zzysVarZzf.zzq(i);
/* 104 */           zzysVarZzf.zzr(15);
/* 113 */           return zzas.zza(this, (zzyt) zzysVarZzf.zzk());
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final void zzh(zzyg zzygVar) {
/* 9 */             this.zzd = zzp(zzygVar.zzf());
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final boolean zzi() {
/* 1 */             return this.zzc;
                }

                public final void zzo(boolean z) {
/* 2 */             this.zzc = false;
                }

/* 25 */        public zzba() {
/* 26 */            this(null, null, 3, null);
                }

/* 26 */        public zzba(zzbo zzboVar, zzda zzdaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 30 */            this(new zzbo(28800000L), new zzcz(qr0.f15712b));
                }
            }
