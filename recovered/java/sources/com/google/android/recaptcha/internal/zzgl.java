            package com.google.android.recaptcha.internal;

            import java.util.UUID;
            import p000.hk2;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgl {
                public static final /* synthetic */ int zza = 0;
                private static final String zzb = UUID.randomUUID().toString();

                public static final String zza() {
/* 1 */             return zzb;
                }

                public static final void zzb(zzwk zzwkVar, String str, zzwa zzwaVar) {
/* 1 */             int i = zzby.zza;
/* 5 */             hk2 hk2VarM8065b = r51.m8065b(zzgi.zza);
/* 11 */            hk2 hk2VarM8065b2 = r51.m8065b(zzgj.zza);
/* 15 */            if (zzwaVar != null) {
/* 17 */                zzwkVar.zzt(zzwaVar);
                    }
/* 44 */            for (zzca zzcaVar : ((zzcc) r51.m8065b(zzgk.zza).getValue()).zza()) {
/* 53 */                zzwkVar.zzq(0);
                    }
/* 63 */            if (zzwkVar.zzz()) {
/* 65 */                int i2 = zzco.zza;
/* 78 */                zzco.zza(zzwkVar.zze() + 20000, zzwkVar.zzf() * 1000);
                    } else {
/* 82 */                int i3 = zzco.zza;
/* 84 */                int iZzD = zzwkVar.zzD();
/* 99 */                zzco.zza(zzwl.zza(iZzD) + 10000, zzwkVar.zzf() * 1000);
                    }
/* 112 */           zzwkVar.zzv(((zzgh) hk2VarM8065b.getValue()).zza(str));
/* 115 */           zzzl zzzlVarZzi = zzzm.zzi();
/* 119 */           zzzlVarZzi.zze(zzwkVar);
/* 134 */           ((zzgs) hk2VarM8065b2.getValue()).zza((zzzm) zzzlVarZzi.zzk());
                }
            }
