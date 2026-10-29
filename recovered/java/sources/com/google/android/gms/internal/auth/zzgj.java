            package com.google.android.gms.internal.auth;

            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgj {
                private static final Class zza;
                private static final zzgy zzb;
                private static final zzgy zzc;
                private static final zzgy zzd;

                static {
                    Class<?> cls;
                    try {
/* 3 */                 cls = Class.forName("com.google.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 8 */                 cls = null;
                    }
/* 9 */             zza = cls;
/* 16 */            zzb = zzj(false);
/* 23 */            zzc = zzj(true);
/* 30 */            zzd = new zzha();
                }

                public static zzgy zza() {
/* 1 */             return zzb;
                }

                public static zzgy zzb() {
/* 1 */             return zzc;
                }

                public static zzgy zzc() {
/* 1 */             return zzd;
                }

                public static Object zzd(int i, List list, zzex zzexVar, Object obj, zzgy zzgyVar) {
/* 1 */             if (zzexVar == null) {
/* 3 */                 return obj;
                    }
/* 6 */             if (!(list instanceof RandomAccess)) {
/* 58 */                Iterator it = list.iterator();
/* 66 */                while (it.hasNext()) {
/* 74 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 82 */                    if (!zzexVar.zza()) {
/* 84 */                        obj = zze(i, iIntValue, obj, zzgyVar);
/* 88 */                        it.remove();
                            }
                        }
/* 92 */                return obj;
                    }
/* 8 */             int size = list.size();
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < size; i3++) {
/* 20 */                Integer num = (Integer) list.get(i3);
/* 22 */                int iIntValue2 = num.intValue();
/* 30 */                if (zzexVar.zza()) {
/* 32 */                    if (i3 != i2) {
/* 34 */                        list.set(i2, num);
                            }
/* 37 */                    i2++;
                        } else {
/* 40 */                    obj = zze(i, iIntValue2, obj, zzgyVar);
                        }
                    }
/* 47 */            if (i2 == size) {
/* 49 */                return obj;
                    }
/* 54 */            list.subList(i2, size).clear();
/* 57 */            return obj;
                }

                public static Object zze(int i, int i2, Object obj, zzgy zzgyVar) {
/* 1 */             if (obj == null) {
/* 3 */                 obj = zzgyVar.zzc();
                    }
/* 8 */             zzgyVar.zzd(obj, i, i2);
/* 11 */            return obj;
                }

                public static void zzf(zzgy zzgyVar, Object obj, Object obj2) {
/* 13 */            zzgyVar.zzf(obj, zzgyVar.zzb(zzgyVar.zza(obj), zzgyVar.zza(obj2)));
                }

                public static void zzg(Class cls) {
                    Class cls2;
/* 7 */             if (zzeu.class.isAssignableFrom(cls) || (cls2 = zza) == null || cls2.isAssignableFrom(cls)) {
/* 25 */                return;
                    }
/* 22 */            C1951n4.m6859j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }

                public static boolean zzh(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static void zzi(zzfr zzfrVar, Object obj, Object obj2, long j) {
/* 13 */            zzhi.zzp(obj, j, zzfr.zza(zzhi.zzf(obj, j), zzhi.zzf(obj2, j)));
                }

                private static zzgy zzj(boolean z) {
                    Class<?> cls;
                    try {
/* 4 */                 cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            if (cls == null) {
/* 1 */                 return null;
                    }
                    try {
/* 35 */                return (zzgy) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                    } catch (Throwable unused2) {
/* 1 */                 return null;
                    }
                }
            }
