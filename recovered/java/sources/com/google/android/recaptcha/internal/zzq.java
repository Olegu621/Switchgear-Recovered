            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.List;
            import p000.c10;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzq {
                private final p51 zza;

                public zzq() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzp.zza);
                }

                private final zzi zzf() {
/* 7 */             return (zzi) this.zza.getValue();
                }

                public final zzzd zza() {
/* 1 */             zzzc zzzcVarZzf = zzzd.zzf();
/* 21 */            for (zzg zzgVar : zzf().zza()) {
/* 33 */                zzzcVarZzf.zzh(zzzd.zzi());
                    }
/* 41 */            return (zzzd) zzzcVarZzf.zzk();
                }

                public final Object zzb(String str, long j, c10 c10Var) {
/* 15 */            return new zzhf(31, new zzl(this, str, j, null), null);
                }

                public final Object zzc(long j, zzxn zzxnVar, c10 c10Var) {
/* 15 */            return new zzhf(30, new zzo(this, j, zzxnVar, null), null);
                }

                public final List zzd() {
/* 5 */             return zzf().zza();
                }

                public final void zze(zzyg zzygVar) {
/* 9 */             Iterator it = zzf().zza().iterator();
/* 17 */            while (it.hasNext()) {
/* 25 */                ((zzg) it.next()).zzh(zzygVar);
                    }
                }
            }
