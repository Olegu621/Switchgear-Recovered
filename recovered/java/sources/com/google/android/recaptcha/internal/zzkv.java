            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.List;
            import java.util.concurrent.TimeUnit;
            import kotlin.collections.CollectionsKt;
            import p000.lw2;
            import p000.mw2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkv implements zzkt {
                private final zzku zza;

                public zzkv(zzku zzkuVar, zzks zzksVar) {
/* 4 */             this.zza = zzkuVar;
                }

                private final zzzo zzb(String str, List list) throws zzdm {
/* 7 */             if (str.length() == 0) {
/* 93 */                C1697u2.m5433i(3, 17, null);
/* 5 */                 return null;
                    }
                    try {
/* 27 */                zzkr zzkrVar = new zzkr(this.zza.zza(CollectionsKt.m6193L(list)), 255L, zzkr.zza);
/* 36 */                StringBuilder sb = new StringBuilder(str.length());
/* 44 */                for (int i = 0; i < str.length(); i++) {
/* 46 */                    char cCharAt = str.charAt(i);
/* 50 */                    lw2 lw2Var = mw2.f14054b;
/* 59 */                    sb.append((char) (cCharAt ^ ((int) zzkrVar.zza())));
                        }
/* 80 */                return zzzo.zzg(zzpp.zzh().zzj(sb.toString()));
                    } catch (Exception e) {
/* 87 */                C1697u2.m5433i(3, 18, e);
/* 5 */                 return null;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzkt
                public final zzzo zza(zzzq zzzqVar) throws zzdm {
/* 1 */             zzmf zzmfVarZzb = zzmf.zzb();
/* 13 */            zzzo zzzoVarZzb = zzb(zzzqVar.zzj(), zzzqVar.zzk());
/* 17 */            zzmfVarZzb.zzf();
/* 22 */            long jZza = zzmfVarZzb.zza(TimeUnit.MICROSECONDS);
/* 26 */            int i = zzco.zza;
/* 34 */            zzco.zza(zzcp.zza.zza(), jZza);
/* 37 */            return zzzoVarZzb;
                }
            }
