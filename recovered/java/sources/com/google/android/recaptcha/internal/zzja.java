            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.C2122qw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzja {
                private final Map zza = new LinkedHashMap();
                private final Set zzb = new LinkedHashSet();

                private final List zzh(List list) {
/* 9 */             ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 12 */            Iterator it = list.iterator();
/* 20 */            while (it.hasNext()) {
/* 32 */                arrayList.add(zza((zzzt) it.next()));
                    }
/* 36 */            return arrayList;
                }

                public final Object zza(zzzt zzztVar) throws zzdm {
/* 1 */             int iZzS = zzztVar.zzS();
/* 5 */             int i = iZzS - 1;
/* 8 */             if (iZzS == 0) {
/* 158 */               throw null;
                    }
                    switch (i) {
                        case 0:
/* 153 */                   return this.zza.get(Integer.valueOf(zzztVar.zzi()));
                        case 1:
/* 138 */                   return Boolean.valueOf(zzztVar.zzQ());
                        case 2:
/* 116 */                   byte[] bArrZzo = zzztVar.zzM().zzo();
/* 121 */                   if (bArrZzo.length == 1) {
/* 125 */                       return Byte.valueOf(bArrZzo[0]);
                            }
/* 130 */                   C1697u2.m5433i(4, 6, null);
/* 7 */                     return null;
                        case 3:
/* 89 */                    String strZzO = zzztVar.zzO();
/* 97 */                    if (strZzO.length() == 1) {
/* 103 */                       return Character.valueOf(strZzO.charAt(0));
                            }
/* 108 */                   C1697u2.m5433i(4, 6, null);
/* 7 */                     return null;
                        case 4:
/* 67 */                    int iZzj = zzztVar.zzj();
/* 73 */                    if (iZzj >= -32768 && iZzj <= 32767) {
/* 80 */                        return Short.valueOf((short) iZzj);
                            }
/* 85 */                    C1697u2.m5433i(4, 6, null);
/* 7 */                     return null;
                        case 5:
/* 62 */                    return Integer.valueOf(zzztVar.zzk());
                        case 6:
                        case 8:
/* 54 */                    C1697u2.m5433i(4, 6, null);
/* 7 */                     return null;
                        case 7:
/* 49 */                    return Long.valueOf(zzztVar.zzl());
                        case 9:
/* 40 */                    return Float.valueOf(zzztVar.zzg());
                        case 10:
/* 31 */                    return Double.valueOf(zzztVar.zzf());
                        case 11:
/* 22 */                    return zzztVar.zzP();
                        default:
/* 18 */                    C1697u2.m5433i(4, 5, null);
                        case 12:
/* 7 */                     return null;
                    }
                }

                public final Object zzb(int i) {
/* 7 */             return this.zza.remove(Integer.valueOf(i));
                }

                public final void zzc() {
/* 3 */             this.zza.clear();
                }

                public final void zzd(int i, Object obj) {
/* 3 */             zze(173, obj);
/* 12 */            this.zzb.add(173);
                }

                public final void zze(int i, Object obj) {
/* 7 */             this.zza.put(Integer.valueOf(i), obj);
                }

                public final Class[] zzf(List list) {
/* 1 */             List listZzh = zzh(list);
/* 13 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(listZzh, 10));
/* 16 */            Iterator it = listZzh.iterator();
/* 24 */            while (it.hasNext()) {
/* 34 */                arrayList.add(zziy.zza(it.next()));
                    }
/* 45 */            return (Class[]) arrayList.toArray(new Class[0]);
                }

                public final Object[] zzg(List list) {
/* 8 */             return zzh(list).toArray(new Object[0]);
                }
            }
