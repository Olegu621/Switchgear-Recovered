            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zzak {
                static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
/* 10 */            if (zzakVar.zzj(zzaoVar.zzc())) {
/* 16 */                zzao zzaoVarZzk = zzakVar.zzk(zzaoVar.zzc());
/* 22 */                if (zzaoVarZzk instanceof zzai) {
/* 26 */                    return ((zzai) zzaoVarZzk).zza(zzgVar, list);
                        }
/* 41 */                C1951n4.m6859j(fm0.m3783i(zzaoVar.zzc(), " is not a function"));
/* 9 */                 return null;
                    }
/* 55 */            if ("hasOwnProperty".equals(zzaoVar.zzc())) {
/* 58 */                zzh.zza("hasOwnProperty", 1, list);
                        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
                    }
/* 98 */            C1951n4.m6859j(AbstractC0886en.m3507k("Object has no function ", zzaoVar.zzc()));
/* 9 */             return null;
                }

                static Iterator zzv(Map map) {
/* 11 */            return new zzaj(map.keySet().iterator());
                }

                boolean zzj(String str);

                zzao zzk(String str);

                void zzm(String str, zzao zzaoVar);
            }
