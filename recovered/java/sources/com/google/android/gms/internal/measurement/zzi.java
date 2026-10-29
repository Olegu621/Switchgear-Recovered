            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzi {
                public static zzao zza(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return zzao.zzg;
                    }
/* 8 */             if (obj instanceof String) {
/* 14 */                return new zzas((String) obj);
                    }
/* 20 */            if (obj instanceof Double) {
/* 26 */                return new zzah((Double) obj);
                    }
/* 32 */            if (obj instanceof Long) {
/* 46 */                return new zzah(Double.valueOf(((Long) obj).doubleValue()));
                    }
/* 52 */            if (obj instanceof Integer) {
/* 66 */                return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
                    }
/* 72 */            if (obj instanceof Boolean) {
/* 78 */                return new zzaf((Boolean) obj);
                    }
/* 84 */            if (!(obj instanceof Map)) {
/* 138 */               if (!(obj instanceof List)) {
/* 176 */                   C1951n4.m6859j("Invalid value type");
/* 179 */                   return null;
                        }
/* 142 */               zzae zzaeVar = new zzae();
/* 147 */               Iterator it = ((List) obj).iterator();
/* 155 */               while (it.hasNext()) {
/* 169 */                   zzaeVar.zzn(zzaeVar.zzh(), zza(it.next()));
                        }
/* 173 */               return zzaeVar;
                    }
/* 88 */            zzal zzalVar = new zzal();
/* 91 */            Map map = (Map) obj;
/* 105 */           for (Object string : map.keySet()) {
/* 115 */               zzao zzaoVarZza = zza(map.get(string));
/* 119 */               if (string != null) {
/* 123 */                   if (!(string instanceof String)) {
/* 125 */                       string = string.toString();
                            }
/* 131 */                   zzalVar.zzm((String) string, zzaoVarZza);
                        }
                    }
/* 135 */           return zzalVar;
                }

                public static zzao zzb(zzje zzjeVar) {
/* 1 */             if (zzjeVar == null) {
/* 3 */                 return zzao.zzf;
                    }
/* 10 */            int iZzj = zzjeVar.zzj() - 1;
/* 13 */            if (iZzj == 1) {
                        return zzjeVar.zzc() ? new zzas(zzjeVar.zzd()) : zzao.zzm;
                    }
/* 17 */            if (iZzj == 2) {
                        return zzjeVar.zzg() ? new zzah(Double.valueOf(zzjeVar.zzh())) : new zzah(null);
                    }
/* 20 */            if (iZzj == 3) {
                        return zzjeVar.zze() ? new zzaf(Boolean.valueOf(zzjeVar.zzf())) : new zzaf(null);
                    }
/* 23 */            if (iZzj != 4) {
/* 70 */                C1951n4.m6859j("Unknown type found. Cannot convert entity");
/* 16 */                return null;
                    }
/* 25 */            List listZza = zzjeVar.zza();
/* 31 */            ArrayList arrayList = new ArrayList();
/* 34 */            Iterator it = listZza.iterator();
/* 42 */            while (it.hasNext()) {
/* 54 */                arrayList.add(zzb((zzje) it.next()));
                    }
/* 64 */            return new zzap(zzjeVar.zzb(), arrayList);
                }
            }
