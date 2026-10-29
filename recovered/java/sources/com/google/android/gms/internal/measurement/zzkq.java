            package com.google.android.gms.internal.measurement;

            import com.google.android.gms.internal.measurement.zzkq;
            import com.google.android.gms.internal.measurement.zzkr;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzkq<MessageType extends zzkr<MessageType, BuilderType>, BuilderType extends zzkq<MessageType, BuilderType>> implements zznk {
                private static void zza(List list, int i) {
/* 5 */             int size = list.size() - i;
/* 18 */            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
/* 23 */            sb.append("Element at index ");
/* 26 */            sb.append(size);
/* 31 */            sb.append(" is null.");
/* 34 */            String string = sb.toString();
/* 38 */            int size2 = list.size();
                    while (true) {
/* 42 */                size2--;
/* 44 */                if (size2 < i) {
/* 55 */                    throw new NullPointerException(string);
                        }
/* 46 */                list.remove(size2);
                    }
                }

                public static void zzaU(Iterable iterable, List list) {
/* 1 */             byte[] bArr = zzmo.zzb;
/* 3 */             iterable.getClass();
/* 9 */             if (iterable instanceof zzmw) {
/* 13 */                List listZza = ((zzmw) iterable).zza();
/* 18 */                zzmw zzmwVar = (zzmw) list;
/* 20 */                int size = list.size();
/* 32 */                for (Object obj : listZza) {
/* 38 */                    if (obj == null) {
/* 44 */                        int size2 = zzmwVar.size() - size;
/* 57 */                        StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
/* 62 */                        sb.append("Element at index ");
/* 65 */                        sb.append(size2);
/* 70 */                        sb.append(" is null.");
/* 73 */                        String string = sb.toString();
/* 77 */                        int size3 = zzmwVar.size();
                                while (true) {
/* 81 */                            size3--;
/* 83 */                            if (size3 < size) {
/* 89 */                                C1951n4.m6868s(string);
/* 92 */                                return;
                                    }
/* 85 */                            zzmwVar.remove(size3);
                                }
                            } else if (obj instanceof zzlg) {
/* 99 */                        zzmwVar.zzb();
                            } else if (obj instanceof byte[]) {
/* 107 */                       byte[] bArr2 = (byte[]) obj;
/* 110 */                       zzlg.zzh(bArr2, 0, bArr2.length);
/* 113 */                       zzmwVar.zzb();
                            } else {
/* 119 */                       zzmwVar.add((String) obj);
                            }
                        }
/* 227 */               return;
                    }
/* 125 */           if (iterable instanceof zzns) {
/* 230 */               list.addAll((Collection) iterable);
/* 233 */               return;
                    }
/* 129 */           if (iterable instanceof Collection) {
/* 134 */               int size4 = ((Collection) iterable).size();
/* 140 */               if (list instanceof ArrayList) {
/* 150 */                   ((ArrayList) list).ensureCapacity(list.size() + size4);
                        } else if (list instanceof zznu) {
/* 166 */                   ((zznu) list).zze(list.size() + size4);
                        }
                    }
/* 169 */           int size5 = list.size();
/* 175 */           if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
/* 212 */               for (Object obj2 : iterable) {
/* 218 */                   if (obj2 == null) {
/* 220 */                       zza(list, size5);
                            }
/* 223 */                   list.add(obj2);
                        }
/* 227 */               return;
                    }
/* 181 */           List list2 = (List) iterable;
/* 183 */           int size6 = list2.size();
/* 187 */           for (int i = 0; i < size6; i++) {
/* 189 */               Object obj3 = list2.get(i);
/* 193 */               if (obj3 == null) {
/* 195 */                   zza(list, size5);
                        }
/* 198 */               list.add(obj3);
                    }
                }

                @Override // 
                public abstract zzkq zzaR();

                public zzkq zzaS(byte[] bArr, int i, int i2) throws zzmq {
/* 2 */             throw null;
                }

                public zzkq zzaT(byte[] bArr, int i, int i2, zzlq zzlqVar) throws zzmq {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zznk
                public final /* synthetic */ zznk zzaV(byte[] bArr, zzlq zzlqVar) throws zzmq {
/* 3 */             return zzaT(bArr, 0, bArr.length, zzlqVar);
                }

                @Override // com.google.android.gms.internal.measurement.zznk
                public final /* synthetic */ zznk zzaW(byte[] bArr) throws zzmq {
/* 3 */             return zzaS(bArr, 0, bArr.length);
                }
            }
