            package com.google.android.gms.internal.measurement;

            import io.flutter.embedding.android.KeyboardMap;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzh {
                public static void zza(String str, int i, List list) {
/* 5 */             if (list.size() == i) {
/* 7 */                 return;
                    }
/* 16 */            f42.m3653i(str, " operation requires ", i, " parameters found ", list.size());
                }

                public static void zzb(String str, int i, List list) {
/* 5 */             if (list.size() >= i) {
/* 7 */                 return;
                    }
/* 16 */            f42.m3653i(str, " operation requires at least ", i, " parameters found ", list.size());
                }

                public static void zzc(String str, int i, List list) {
/* 5 */             if (list.size() <= i) {
/* 7 */                 return;
                    }
/* 16 */            f42.m3653i(str, " operation requires at most ", i, " parameters found ", list.size());
                }

                public static boolean zzd(zzao zzaoVar) {
/* 2 */             if (zzaoVar == null) {
/* 1 */                 return false;
                    }
/* 5 */             Double dZzd = zzaoVar.zzd();
                    return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
                }

                public static zzbk zze(String str) {
/* 19 */            zzbk zzbkVarZza = (str == null || str.isEmpty()) ? null : zzbk.zza(Integer.parseInt(str));
/* 20 */            if (zzbkVarZza != null) {
/* 22 */                return zzbkVarZza;
                    }
/* 29 */            C1951n4.m6859j(AbstractC0886en.m3507k("Unsupported commandId ", str));
/* 1 */             return null;
                }

                public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
/* 14 */            if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
/* 13 */                return false;
                    }
/* 20 */            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
/* 19 */                return true;
                    }
/* 29 */            if (zzaoVar instanceof zzah) {
/* 43 */                if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
/* 13 */                    return false;
                        }
/* 68 */                return zzaoVar.zzd().equals(zzaoVar2.zzd());
                    }
/* 76 */            if (zzaoVar instanceof zzas) {
/* 86 */                return zzaoVar.zzc().equals(zzaoVar2.zzc());
                    }
/* 93 */            if (zzaoVar instanceof zzaf) {
/* 103 */               return zzaoVar.zze().equals(zzaoVar2.zze());
                    }
                    return zzaoVar == zzaoVar2;
                }

                public static int zzg(double d) {
/* 5 */             if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
/* 41 */                return 0;
                    }
/* 39 */            return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
                }

                public static long zzh(double d) {
/* 11 */            return ((long) zzg(d)) & KeyboardMap.kValueMask;
                }

                public static double zzi(double d) {
/* 7 */             if (Double.isNaN(d)) {
/* 5 */                 return 0.0d;
                    }
/* 14 */            if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
/* 39 */                return d;
                    }
/* 37 */            return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
                }

                public static Object zzj(zzao zzaoVar) {
/* 7 */             if (zzao.zzg.equals(zzaoVar)) {
/* 9 */                 return null;
                    }
/* 17 */            if (zzao.zzf.equals(zzaoVar)) {
/* 19 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 24 */            if (zzaoVar instanceof zzal) {
/* 28 */                return zzk((zzal) zzaoVar);
                    }
/* 35 */            if (!(zzaoVar instanceof zzae)) {
                        return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
                    }
/* 39 */            ArrayList arrayList = new ArrayList();
/* 44 */            Iterator it = ((zzae) zzaoVar).iterator();
/* 52 */            while (it.hasNext()) {
/* 60 */                Object objZzj = zzj((zzao) it.next());
/* 64 */                if (objZzj != null) {
/* 66 */                    arrayList.add(objZzj);
                        }
                    }
/* 70 */            return arrayList;
                }

                public static Map zzk(zzal zzalVar) {
/* 3 */             HashMap map = new HashMap();
/* 18 */            for (String str : zzalVar.zzb()) {
/* 30 */                Object objZzj = zzj(zzalVar.zzk(str));
/* 34 */                if (objZzj != null) {
/* 36 */                    map.put(str, objZzj);
                        }
                    }
/* 40 */            return map;
                }

                public static int zzl(zzg zzgVar) {
/* 18 */            int iZzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
/* 25 */            if (iZzg <= 1000000) {
/* 37 */                zzgVar.zze("runtime.counter", new zzah(Double.valueOf(iZzg)));
/* 40 */                return iZzg;
                    }
/* 43 */            f42.m3656l("Instructions allowed exceeded");
/* 46 */            return 0;
                }
            }
