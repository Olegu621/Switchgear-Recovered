            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjg implements zzjt {
                public static final zzjg zza = new zzjg();

                private zzjg() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 4 */             if (zzztVarArr.length == 0) {
/* 221 */               C1697u2.m5433i(4, 3, null);
/* 224 */               return;
                    }
/* 6 */             zzyu zzyuVarZzf = zzyx.zzf();
/* 12 */            for (zzzt zzztVar : zzztVarArr) {
/* 20 */                Object objZza = zzizVar.zzc().zza(zzztVar);
/* 24 */                if (objZza == null) {
/* 192 */                   throw new zzdm(4, 4, null);
                        }
/* 26 */                zzyv zzyvVarZzf = zzyw.zzf();
/* 32 */                if (objZza instanceof Integer) {
/* 40 */                    zzyvVarZzf.zzu(((Number) objZza).intValue());
                        } else if (objZza instanceof Short) {
/* 55 */                    zzyvVarZzf.zzt(((Number) objZza).shortValue());
                        } else if (objZza instanceof Byte) {
/* 79 */                    zzyvVarZzf.zzf(zzqm.zzl(new byte[]{((Number) objZza).byteValue()}, 0, 1));
                        } else if (objZza instanceof Long) {
/* 93 */                    zzyvVarZzf.zzv(((Number) objZza).longValue());
                        } else if (objZza instanceof Double) {
/* 107 */                   zzyvVarZzf.zzr(((Number) objZza).doubleValue());
                        } else if (objZza instanceof Float) {
/* 121 */                   zzyvVarZzf.zzs(((Number) objZza).floatValue());
                        } else if (objZza instanceof Boolean) {
/* 135 */                   zzyvVarZzf.zze(((Boolean) objZza).booleanValue());
                        } else if (objZza instanceof Character) {
/* 153 */                   zzyvVarZzf.zzq(String.valueOf(((Character) objZza).charValue()));
                        } else if (objZza instanceof String) {
/* 163 */                   zzyvVarZzf.zzw((String) objZza);
                        } else {
/* 171 */                   zzyvVarZzf.zzw(objZza.toString());
                        }
/* 180 */               zzyuVarZzf.zzf((zzyw) zzyvVarZzf.zzk());
                    }
/* 193 */           zzja zzjaVarZzc = zzizVar.zzc();
/* 203 */           byte[] bArrZzd = ((zzyx) zzyuVarZzf.zzk()).zzd();
/* 216 */           zzjaVarZzc.zze(i, zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length));
                }
            }
