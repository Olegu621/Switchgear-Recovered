            package com.google.android.gms.internal.measurement;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzg {
                public final zzg zza;
                final zzaw zzb;
                final Map zzc = new HashMap();
                final Map zzd = new HashMap();

                public zzg(zzg zzgVar, zzaw zzawVar) {
/* 18 */            this.zza = zzgVar;
/* 20 */            this.zzb = zzawVar;
                }

                public final zzao zza(zzao zzaoVar) {
/* 3 */             return this.zzb.zzb(this, zzaoVar);
                }

                public final zzao zzb(zzae zzaeVar) {
/* 1 */             zzao zzaoVarZzb = zzao.zzf;
/* 3 */             Iterator itZzg = zzaeVar.zzg();
/* 11 */            while (itZzg.hasNext()) {
/* 29 */                zzaoVarZzb = this.zzb.zzb(this, zzaeVar.zzl(((Integer) itZzg.next()).intValue()));
/* 35 */                if (zzaoVarZzb instanceof zzag) {
                            break;
                        }
                    }
/* 37 */            return zzaoVarZzb;
                }

                public final zzg zzc() {
/* 5 */             return new zzg(this, this.zzb);
                }

                public final boolean zzd(String str) {
/* 7 */             if (this.zzc.containsKey(str)) {
/* 9 */                 return true;
                    }
/* 11 */            zzg zzgVar = this.zza;
/* 13 */            if (zzgVar != null) {
/* 15 */                return zzgVar.zzd(str);
                    }
/* 20 */            return false;
                }

                public final void zze(String str, zzao zzaoVar) {
                    zzg zzgVar;
/* 1 */             Map map = this.zzc;
/* 7 */             if (!map.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzd(str)) {
/* 20 */                zzgVar.zze(str, zzaoVar);
                    } else {
/* 30 */                if (this.zzd.containsKey(str)) {
/* 32 */                    return;
                        }
/* 33 */                if (zzaoVar == null) {
/* 35 */                    map.remove(str);
                        } else {
/* 39 */                    map.put(str, zzaoVar);
                        }
                    }
                }

                public final void zzf(String str, zzao zzaoVar) {
/* 7 */             if (this.zzd.containsKey(str)) {
/* 9 */                 return;
                    }
/* 10 */            Map map = this.zzc;
/* 12 */            if (zzaoVar == null) {
/* 14 */                map.remove(str);
                    } else {
/* 18 */                map.put(str, zzaoVar);
                    }
                }

                public final void zzg(String str, zzao zzaoVar) {
/* 1 */             zzf(str, zzaoVar);
/* 8 */             this.zzd.put(str, Boolean.TRUE);
                }

                public final zzao zzh(String str) {
/* 1 */             Map map = this.zzc;
/* 7 */             if (map.containsKey(str)) {
/* 13 */                return (zzao) map.get(str);
                    }
/* 16 */            zzg zzgVar = this.zza;
/* 18 */            if (zzgVar != null) {
/* 20 */                return zzgVar.zzh(str);
                    }
/* 31 */            C1951n4.m6859j(fm0.m3783i(str, " is not defined"));
/* 34 */            return null;
                }
            }
