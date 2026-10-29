            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbi extends zzav {
                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 2 */             if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
/* 49 */                C1951n4.m6859j(AbstractC0886en.m3507k("Command not found: ", str));
/* 1 */                 return null;
                    }
/* 16 */            zzao zzaoVarZzh = zzgVar.zzh(str);
/* 22 */            if (zzaoVarZzh instanceof zzai) {
/* 26 */                return ((zzai) zzaoVarZzh).zza(zzgVar, list);
                    }
/* 39 */            C1951n4.m6859j(fm0.m3784j("Function ", str, " is not defined"));
/* 1 */             return null;
                }
            }
