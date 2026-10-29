            package com.google.android.gms.internal.play_billing;

            import com.google.android.gms.internal.play_billing.zzfu;
            import com.google.android.gms.internal.play_billing.zzfv;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzfu<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzil {
                private static void zza(List list, int i) {
/* 10 */            String strM3505i = AbstractC0886en.m3505i(list.size() - i, "Element at index ", " is null.");
/* 14 */            int size = list.size();
                    while (true) {
/* 18 */                size--;
/* 20 */                if (size < i) {
/* 31 */                    throw new NullPointerException(strM3505i);
                        }
/* 22 */                list.remove(size);
                    }
                }

                public static void zzc(Iterable iterable, List list) {
/* 1 */             byte[] bArr = zzhp.zzb;
/* 3 */             iterable.getClass();
/* 9 */             if (iterable instanceof zzhy) {
/* 13 */                List listZza = ((zzhy) iterable).zza();
/* 18 */                zzhy zzhyVar = (zzhy) list;
/* 20 */                int size = list.size();
/* 32 */                for (Object obj : listZza) {
/* 38 */                    if (obj == null) {
/* 49 */                        String strM3505i = AbstractC0886en.m3505i(zzhyVar.size() - size, "Element at index ", " is null.");
/* 53 */                        int size2 = zzhyVar.size();
                                while (true) {
/* 57 */                            size2--;
/* 59 */                            if (size2 < size) {
/* 65 */                                C1951n4.m6868s(strM3505i);
/* 68 */                                return;
                                    }
/* 61 */                            zzhyVar.remove(size2);
                                }
                            } else if (obj instanceof zzgk) {
/* 75 */                        zzhyVar.zzb();
                            } else if (obj instanceof byte[]) {
/* 83 */                        byte[] bArr2 = (byte[]) obj;
/* 86 */                        zzgk.zzj(bArr2, 0, bArr2.length);
/* 89 */                        zzhyVar.zzb();
                            } else {
/* 95 */                        zzhyVar.add((String) obj);
                            }
                        }
/* 202 */               return;
                    }
/* 101 */           if (iterable instanceof zzit) {
/* 205 */               list.addAll((Collection) iterable);
/* 208 */               return;
                    }
/* 105 */           if (iterable instanceof Collection) {
/* 110 */               int size3 = ((Collection) iterable).size();
/* 116 */               if (list instanceof ArrayList) {
/* 126 */                   ((ArrayList) list).ensureCapacity(list.size() + size3);
                        }
/* 131 */               if (list instanceof zziv) {
/* 141 */                   ((zziv) list).zzf(list.size() + size3);
                        }
                    }
/* 144 */           int size4 = list.size();
/* 150 */           if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
/* 187 */               for (Object obj2 : iterable) {
/* 193 */                   if (obj2 == null) {
/* 195 */                       zza(list, size4);
                            }
/* 198 */                   list.add(obj2);
                        }
/* 202 */               return;
                    }
/* 156 */           List list2 = (List) iterable;
/* 158 */           int size5 = list2.size();
/* 162 */           for (int i = 0; i < size5; i++) {
/* 164 */               Object obj3 = list2.get(i);
/* 168 */               if (obj3 == null) {
/* 170 */                   zza(list, size4);
                        }
/* 173 */               list.add(obj3);
                    }
                }

                @Override // 
                public abstract zzfu zzb();
            }
